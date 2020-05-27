package com.example.demo.util;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import static com.google.zxing.client.j2se.MatrixToImageConfig.BLACK;
import static com.google.zxing.client.j2se.MatrixToImageConfig.WHITE;

/**
 * <h1>QRcodeUtil</h1>
 * <p>二维码工具类</h1>
 */
public class QRcodeUtil {
    public static void creatRrCode(String contents, int width, int height, HttpServletResponse response) {
        Hashtable hints = new Hashtable();
        //设置容错级别最高
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
        //设置字符编码为utf-8
        hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
        //二维码空白区域,最小为0也有白边,只是很小,最小是6像素左右
        hints.put(EncodeHintType.MARGIN, 50);
        try {
            // 1、读取文件转换为字节数组
            BitMatrix bitMatrix = new MultiFormatWriter().encode(contents, BarcodeFormat.QR_CODE, width, height, hints);
            //转为图片对象格式
            BufferedImage image = toBufferedImage(bitMatrix);
            //转换成png格式的IO流
            ImageIO.write(image, "png", response.getOutputStream());

        } catch (Exception e) {
            e.getMessage();
        }
    }

    /**
     * @param pressText 文字
     * @param newImg    带文字的图片
     * @param image     需要添加文字的图片
     * @param fontStyle
     * @param color
     * @param fontSize
     * @param width
     * @param height
     * @为图片添加文字
     */
    public static void pressText(String pressText, String newImg, BufferedImage image, int fontStyle, Color color, int fontSize, int width, int height) {

        //计算文字开始的位置
        //x开始的位置：（图片宽度-字体大小*字的个数）/2
        int startX = (width - (fontSize * pressText.length())) - 10;
        //y开始的位置：图片高度-（图片高度-图片宽度）/2
        int startY = height - (height - width) / 2 - 30;

        System.out.println("startX: " + startX);
        System.out.println("startY: " + startY);
        System.out.println("height: " + height);
        System.out.println("width: " + width);
        System.out.println("fontSize: " + fontSize);
        System.out.println("pressText.length(): " + pressText.length());

        try {
//            File file = new File(targetImg);
//            Image src = ImageIO.read(file);
            int imageW = image.getWidth();
            int imageH = image.getHeight();
//            BufferedImage image = new BufferedImage(imageW, imageH, BufferedImage.TYPE_INT_RGB);
            Graphics g = image.createGraphics();
            g.drawImage(image, 0, 0, imageW, imageH, null);
            g.setColor(color);
            g.setFont(new Font("粗体", Font.BOLD, 30));
            g.drawString(pressText, startX, startY);
//            g.drawString("广 告 牌 0 1", startX + 30, startY + 30);
            g.dispose();
            FileOutputStream out = new FileOutputStream(newImg);
            ImageIO.write(image, "JPEG", out);
            JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
            encoder.encode(image);
            out.close();
            System.out.println("image press success");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }




    /**
     * 保存到本地
     * @param contents

     */
    public static BufferedImage creatRrCode2(String contents) {
        Hashtable hints = new Hashtable();
        BufferedImage image = null;

        //设置UTF-8， 防止中文乱码
        hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
        //设置二维码四周白色区域的大小
        hints.put(EncodeHintType.MARGIN, 2);
        //设置二维码的容错性
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);

        try {
            // 1、读取文件转换为字节数组
            BitMatrix bitMatrix = new MultiFormatWriter().encode(contents, BarcodeFormat.QR_CODE, 352, 500, hints);
            //转为图片对象格式
             image = toBufferedImage(bitMatrix);
            //转换成png格式的IO流

//            String storagePath = "D:/CCC";
//            OutputStream os = new FileOutputStream(storagePath + "/" + contents );
//            ImageIO.write(image, "png", new File("D:/"+"aa"+".png"));
//            os.close();

        } catch (Exception e) {
            e.getMessage();
        }
        return image;
    }


    /**
     * image流数据处理
     */
    public static BufferedImage toBufferedImage(BitMatrix matrix) {
        int width = matrix.getWidth();
        int height = matrix.getHeight();
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height-50; y++) {
                image.setRGB(x, y, matrix.get(x, y+50) ? 0xFF000000 : 0xFFFFFFFF);
            }
        }
        return image;
    }

    //二维码表示的内容
    private static String content = "http://www.changxingnanjing.com?qr_code=01900302|773f3c8f872bf34cc3fe97022720330e";

    //存放logo的文件夹
    private static String path = "E:/";

    public static void main(String args[]) {
        try {
            int width = 352;
            int height = 500;
            BufferedImage image = creatRrCode2(content);
            int font = 18; //字体大小
            int fontStyle = 1; //字体风格
            //用来存放带有logo+文字的二维码图片
            String newImageWithText = path + "/imageWithText4.jpg";
            //附加在图片上的文字信息
            String text = "46578956";
            //在二维码下方添加文字（文字居中）
            pressText(text, newImageWithText, image, fontStyle, Color.black, font, width, height);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
