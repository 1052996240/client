package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class UpresourcesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UpresourcesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andS001IsNull() {
            addCriterion("S001 is null");
            return (Criteria) this;
        }

        public Criteria andS001IsNotNull() {
            addCriterion("S001 is not null");
            return (Criteria) this;
        }

        public Criteria andS001EqualTo(String value) {
            addCriterion("S001 =", value, "s001");
            return (Criteria) this;
        }

        public Criteria andS001NotEqualTo(String value) {
            addCriterion("S001 <>", value, "s001");
            return (Criteria) this;
        }

        public Criteria andS001GreaterThan(String value) {
            addCriterion("S001 >", value, "s001");
            return (Criteria) this;
        }

        public Criteria andS001GreaterThanOrEqualTo(String value) {
            addCriterion("S001 >=", value, "s001");
            return (Criteria) this;
        }

        public Criteria andS001LessThan(String value) {
            addCriterion("S001 <", value, "s001");
            return (Criteria) this;
        }

        public Criteria andS001LessThanOrEqualTo(String value) {
            addCriterion("S001 <=", value, "s001");
            return (Criteria) this;
        }

        public Criteria andS001Like(String value) {
            addCriterion("S001 like", value, "s001");
            return (Criteria) this;
        }

        public Criteria andS001NotLike(String value) {
            addCriterion("S001 not like", value, "s001");
            return (Criteria) this;
        }

        public Criteria andS001In(List<String> values) {
            addCriterion("S001 in", values, "s001");
            return (Criteria) this;
        }

        public Criteria andS001NotIn(List<String> values) {
            addCriterion("S001 not in", values, "s001");
            return (Criteria) this;
        }

        public Criteria andS001Between(String value1, String value2) {
            addCriterion("S001 between", value1, value2, "s001");
            return (Criteria) this;
        }

        public Criteria andS001NotBetween(String value1, String value2) {
            addCriterion("S001 not between", value1, value2, "s001");
            return (Criteria) this;
        }

        public Criteria andS002IsNull() {
            addCriterion("S002 is null");
            return (Criteria) this;
        }

        public Criteria andS002IsNotNull() {
            addCriterion("S002 is not null");
            return (Criteria) this;
        }

        public Criteria andS002EqualTo(String value) {
            addCriterion("S002 =", value, "s002");
            return (Criteria) this;
        }

        public Criteria andS002NotEqualTo(String value) {
            addCriterion("S002 <>", value, "s002");
            return (Criteria) this;
        }

        public Criteria andS002GreaterThan(String value) {
            addCriterion("S002 >", value, "s002");
            return (Criteria) this;
        }

        public Criteria andS002GreaterThanOrEqualTo(String value) {
            addCriterion("S002 >=", value, "s002");
            return (Criteria) this;
        }

        public Criteria andS002LessThan(String value) {
            addCriterion("S002 <", value, "s002");
            return (Criteria) this;
        }

        public Criteria andS002LessThanOrEqualTo(String value) {
            addCriterion("S002 <=", value, "s002");
            return (Criteria) this;
        }

        public Criteria andS002Like(String value) {
            addCriterion("S002 like", value, "s002");
            return (Criteria) this;
        }

        public Criteria andS002NotLike(String value) {
            addCriterion("S002 not like", value, "s002");
            return (Criteria) this;
        }

        public Criteria andS002In(List<String> values) {
            addCriterion("S002 in", values, "s002");
            return (Criteria) this;
        }

        public Criteria andS002NotIn(List<String> values) {
            addCriterion("S002 not in", values, "s002");
            return (Criteria) this;
        }

        public Criteria andS002Between(String value1, String value2) {
            addCriterion("S002 between", value1, value2, "s002");
            return (Criteria) this;
        }

        public Criteria andS002NotBetween(String value1, String value2) {
            addCriterion("S002 not between", value1, value2, "s002");
            return (Criteria) this;
        }

        public Criteria andS003IsNull() {
            addCriterion("S003 is null");
            return (Criteria) this;
        }

        public Criteria andS003IsNotNull() {
            addCriterion("S003 is not null");
            return (Criteria) this;
        }

        public Criteria andS003EqualTo(String value) {
            addCriterion("S003 =", value, "s003");
            return (Criteria) this;
        }

        public Criteria andS003NotEqualTo(String value) {
            addCriterion("S003 <>", value, "s003");
            return (Criteria) this;
        }

        public Criteria andS003GreaterThan(String value) {
            addCriterion("S003 >", value, "s003");
            return (Criteria) this;
        }

        public Criteria andS003GreaterThanOrEqualTo(String value) {
            addCriterion("S003 >=", value, "s003");
            return (Criteria) this;
        }

        public Criteria andS003LessThan(String value) {
            addCriterion("S003 <", value, "s003");
            return (Criteria) this;
        }

        public Criteria andS003LessThanOrEqualTo(String value) {
            addCriterion("S003 <=", value, "s003");
            return (Criteria) this;
        }

        public Criteria andS003Like(String value) {
            addCriterion("S003 like", value, "s003");
            return (Criteria) this;
        }

        public Criteria andS003NotLike(String value) {
            addCriterion("S003 not like", value, "s003");
            return (Criteria) this;
        }

        public Criteria andS003In(List<String> values) {
            addCriterion("S003 in", values, "s003");
            return (Criteria) this;
        }

        public Criteria andS003NotIn(List<String> values) {
            addCriterion("S003 not in", values, "s003");
            return (Criteria) this;
        }

        public Criteria andS003Between(String value1, String value2) {
            addCriterion("S003 between", value1, value2, "s003");
            return (Criteria) this;
        }

        public Criteria andS003NotBetween(String value1, String value2) {
            addCriterion("S003 not between", value1, value2, "s003");
            return (Criteria) this;
        }

        public Criteria andS004IsNull() {
            addCriterion("S004 is null");
            return (Criteria) this;
        }

        public Criteria andS004IsNotNull() {
            addCriterion("S004 is not null");
            return (Criteria) this;
        }

        public Criteria andS004EqualTo(String value) {
            addCriterion("S004 =", value, "s004");
            return (Criteria) this;
        }

        public Criteria andS004NotEqualTo(String value) {
            addCriterion("S004 <>", value, "s004");
            return (Criteria) this;
        }

        public Criteria andS004GreaterThan(String value) {
            addCriterion("S004 >", value, "s004");
            return (Criteria) this;
        }

        public Criteria andS004GreaterThanOrEqualTo(String value) {
            addCriterion("S004 >=", value, "s004");
            return (Criteria) this;
        }

        public Criteria andS004LessThan(String value) {
            addCriterion("S004 <", value, "s004");
            return (Criteria) this;
        }

        public Criteria andS004LessThanOrEqualTo(String value) {
            addCriterion("S004 <=", value, "s004");
            return (Criteria) this;
        }

        public Criteria andS004Like(String value) {
            addCriterion("S004 like", value, "s004");
            return (Criteria) this;
        }

        public Criteria andS004NotLike(String value) {
            addCriterion("S004 not like", value, "s004");
            return (Criteria) this;
        }

        public Criteria andS004In(List<String> values) {
            addCriterion("S004 in", values, "s004");
            return (Criteria) this;
        }

        public Criteria andS004NotIn(List<String> values) {
            addCriterion("S004 not in", values, "s004");
            return (Criteria) this;
        }

        public Criteria andS004Between(String value1, String value2) {
            addCriterion("S004 between", value1, value2, "s004");
            return (Criteria) this;
        }

        public Criteria andS004NotBetween(String value1, String value2) {
            addCriterion("S004 not between", value1, value2, "s004");
            return (Criteria) this;
        }

        public Criteria andS005IsNull() {
            addCriterion("S005 is null");
            return (Criteria) this;
        }

        public Criteria andS005IsNotNull() {
            addCriterion("S005 is not null");
            return (Criteria) this;
        }

        public Criteria andS005EqualTo(String value) {
            addCriterion("S005 =", value, "s005");
            return (Criteria) this;
        }

        public Criteria andS005NotEqualTo(String value) {
            addCriterion("S005 <>", value, "s005");
            return (Criteria) this;
        }

        public Criteria andS005GreaterThan(String value) {
            addCriterion("S005 >", value, "s005");
            return (Criteria) this;
        }

        public Criteria andS005GreaterThanOrEqualTo(String value) {
            addCriterion("S005 >=", value, "s005");
            return (Criteria) this;
        }

        public Criteria andS005LessThan(String value) {
            addCriterion("S005 <", value, "s005");
            return (Criteria) this;
        }

        public Criteria andS005LessThanOrEqualTo(String value) {
            addCriterion("S005 <=", value, "s005");
            return (Criteria) this;
        }

        public Criteria andS005Like(String value) {
            addCriterion("S005 like", value, "s005");
            return (Criteria) this;
        }

        public Criteria andS005NotLike(String value) {
            addCriterion("S005 not like", value, "s005");
            return (Criteria) this;
        }

        public Criteria andS005In(List<String> values) {
            addCriterion("S005 in", values, "s005");
            return (Criteria) this;
        }

        public Criteria andS005NotIn(List<String> values) {
            addCriterion("S005 not in", values, "s005");
            return (Criteria) this;
        }

        public Criteria andS005Between(String value1, String value2) {
            addCriterion("S005 between", value1, value2, "s005");
            return (Criteria) this;
        }

        public Criteria andS005NotBetween(String value1, String value2) {
            addCriterion("S005 not between", value1, value2, "s005");
            return (Criteria) this;
        }

        public Criteria andS006IsNull() {
            addCriterion("S006 is null");
            return (Criteria) this;
        }

        public Criteria andS006IsNotNull() {
            addCriterion("S006 is not null");
            return (Criteria) this;
        }

        public Criteria andS006EqualTo(String value) {
            addCriterion("S006 =", value, "s006");
            return (Criteria) this;
        }

        public Criteria andS006NotEqualTo(String value) {
            addCriterion("S006 <>", value, "s006");
            return (Criteria) this;
        }

        public Criteria andS006GreaterThan(String value) {
            addCriterion("S006 >", value, "s006");
            return (Criteria) this;
        }

        public Criteria andS006GreaterThanOrEqualTo(String value) {
            addCriterion("S006 >=", value, "s006");
            return (Criteria) this;
        }

        public Criteria andS006LessThan(String value) {
            addCriterion("S006 <", value, "s006");
            return (Criteria) this;
        }

        public Criteria andS006LessThanOrEqualTo(String value) {
            addCriterion("S006 <=", value, "s006");
            return (Criteria) this;
        }

        public Criteria andS006Like(String value) {
            addCriterion("S006 like", value, "s006");
            return (Criteria) this;
        }

        public Criteria andS006NotLike(String value) {
            addCriterion("S006 not like", value, "s006");
            return (Criteria) this;
        }

        public Criteria andS006In(List<String> values) {
            addCriterion("S006 in", values, "s006");
            return (Criteria) this;
        }

        public Criteria andS006NotIn(List<String> values) {
            addCriterion("S006 not in", values, "s006");
            return (Criteria) this;
        }

        public Criteria andS006Between(String value1, String value2) {
            addCriterion("S006 between", value1, value2, "s006");
            return (Criteria) this;
        }

        public Criteria andS006NotBetween(String value1, String value2) {
            addCriterion("S006 not between", value1, value2, "s006");
            return (Criteria) this;
        }

        public Criteria andS007IsNull() {
            addCriterion("S007 is null");
            return (Criteria) this;
        }

        public Criteria andS007IsNotNull() {
            addCriterion("S007 is not null");
            return (Criteria) this;
        }

        public Criteria andS007EqualTo(String value) {
            addCriterion("S007 =", value, "s007");
            return (Criteria) this;
        }

        public Criteria andS007NotEqualTo(String value) {
            addCriterion("S007 <>", value, "s007");
            return (Criteria) this;
        }

        public Criteria andS007GreaterThan(String value) {
            addCriterion("S007 >", value, "s007");
            return (Criteria) this;
        }

        public Criteria andS007GreaterThanOrEqualTo(String value) {
            addCriterion("S007 >=", value, "s007");
            return (Criteria) this;
        }

        public Criteria andS007LessThan(String value) {
            addCriterion("S007 <", value, "s007");
            return (Criteria) this;
        }

        public Criteria andS007LessThanOrEqualTo(String value) {
            addCriterion("S007 <=", value, "s007");
            return (Criteria) this;
        }

        public Criteria andS007Like(String value) {
            addCriterion("S007 like", value, "s007");
            return (Criteria) this;
        }

        public Criteria andS007NotLike(String value) {
            addCriterion("S007 not like", value, "s007");
            return (Criteria) this;
        }

        public Criteria andS007In(List<String> values) {
            addCriterion("S007 in", values, "s007");
            return (Criteria) this;
        }

        public Criteria andS007NotIn(List<String> values) {
            addCriterion("S007 not in", values, "s007");
            return (Criteria) this;
        }

        public Criteria andS007Between(String value1, String value2) {
            addCriterion("S007 between", value1, value2, "s007");
            return (Criteria) this;
        }

        public Criteria andS007NotBetween(String value1, String value2) {
            addCriterion("S007 not between", value1, value2, "s007");
            return (Criteria) this;
        }

        public Criteria andS008IsNull() {
            addCriterion("S008 is null");
            return (Criteria) this;
        }

        public Criteria andS008IsNotNull() {
            addCriterion("S008 is not null");
            return (Criteria) this;
        }

        public Criteria andS008EqualTo(String value) {
            addCriterion("S008 =", value, "s008");
            return (Criteria) this;
        }

        public Criteria andS008NotEqualTo(String value) {
            addCriterion("S008 <>", value, "s008");
            return (Criteria) this;
        }

        public Criteria andS008GreaterThan(String value) {
            addCriterion("S008 >", value, "s008");
            return (Criteria) this;
        }

        public Criteria andS008GreaterThanOrEqualTo(String value) {
            addCriterion("S008 >=", value, "s008");
            return (Criteria) this;
        }

        public Criteria andS008LessThan(String value) {
            addCriterion("S008 <", value, "s008");
            return (Criteria) this;
        }

        public Criteria andS008LessThanOrEqualTo(String value) {
            addCriterion("S008 <=", value, "s008");
            return (Criteria) this;
        }

        public Criteria andS008Like(String value) {
            addCriterion("S008 like", value, "s008");
            return (Criteria) this;
        }

        public Criteria andS008NotLike(String value) {
            addCriterion("S008 not like", value, "s008");
            return (Criteria) this;
        }

        public Criteria andS008In(List<String> values) {
            addCriterion("S008 in", values, "s008");
            return (Criteria) this;
        }

        public Criteria andS008NotIn(List<String> values) {
            addCriterion("S008 not in", values, "s008");
            return (Criteria) this;
        }

        public Criteria andS008Between(String value1, String value2) {
            addCriterion("S008 between", value1, value2, "s008");
            return (Criteria) this;
        }

        public Criteria andS008NotBetween(String value1, String value2) {
            addCriterion("S008 not between", value1, value2, "s008");
            return (Criteria) this;
        }

        public Criteria andS009IsNull() {
            addCriterion("S009 is null");
            return (Criteria) this;
        }

        public Criteria andS009IsNotNull() {
            addCriterion("S009 is not null");
            return (Criteria) this;
        }

        public Criteria andS009EqualTo(String value) {
            addCriterion("S009 =", value, "s009");
            return (Criteria) this;
        }

        public Criteria andS009NotEqualTo(String value) {
            addCriterion("S009 <>", value, "s009");
            return (Criteria) this;
        }

        public Criteria andS009GreaterThan(String value) {
            addCriterion("S009 >", value, "s009");
            return (Criteria) this;
        }

        public Criteria andS009GreaterThanOrEqualTo(String value) {
            addCriterion("S009 >=", value, "s009");
            return (Criteria) this;
        }

        public Criteria andS009LessThan(String value) {
            addCriterion("S009 <", value, "s009");
            return (Criteria) this;
        }

        public Criteria andS009LessThanOrEqualTo(String value) {
            addCriterion("S009 <=", value, "s009");
            return (Criteria) this;
        }

        public Criteria andS009Like(String value) {
            addCriterion("S009 like", value, "s009");
            return (Criteria) this;
        }

        public Criteria andS009NotLike(String value) {
            addCriterion("S009 not like", value, "s009");
            return (Criteria) this;
        }

        public Criteria andS009In(List<String> values) {
            addCriterion("S009 in", values, "s009");
            return (Criteria) this;
        }

        public Criteria andS009NotIn(List<String> values) {
            addCriterion("S009 not in", values, "s009");
            return (Criteria) this;
        }

        public Criteria andS009Between(String value1, String value2) {
            addCriterion("S009 between", value1, value2, "s009");
            return (Criteria) this;
        }

        public Criteria andS009NotBetween(String value1, String value2) {
            addCriterion("S009 not between", value1, value2, "s009");
            return (Criteria) this;
        }

        public Criteria andS010IsNull() {
            addCriterion("S010 is null");
            return (Criteria) this;
        }

        public Criteria andS010IsNotNull() {
            addCriterion("S010 is not null");
            return (Criteria) this;
        }

        public Criteria andS010EqualTo(String value) {
            addCriterion("S010 =", value, "s010");
            return (Criteria) this;
        }

        public Criteria andS010NotEqualTo(String value) {
            addCriterion("S010 <>", value, "s010");
            return (Criteria) this;
        }

        public Criteria andS010GreaterThan(String value) {
            addCriterion("S010 >", value, "s010");
            return (Criteria) this;
        }

        public Criteria andS010GreaterThanOrEqualTo(String value) {
            addCriterion("S010 >=", value, "s010");
            return (Criteria) this;
        }

        public Criteria andS010LessThan(String value) {
            addCriterion("S010 <", value, "s010");
            return (Criteria) this;
        }

        public Criteria andS010LessThanOrEqualTo(String value) {
            addCriterion("S010 <=", value, "s010");
            return (Criteria) this;
        }

        public Criteria andS010Like(String value) {
            addCriterion("S010 like", value, "s010");
            return (Criteria) this;
        }

        public Criteria andS010NotLike(String value) {
            addCriterion("S010 not like", value, "s010");
            return (Criteria) this;
        }

        public Criteria andS010In(List<String> values) {
            addCriterion("S010 in", values, "s010");
            return (Criteria) this;
        }

        public Criteria andS010NotIn(List<String> values) {
            addCriterion("S010 not in", values, "s010");
            return (Criteria) this;
        }

        public Criteria andS010Between(String value1, String value2) {
            addCriterion("S010 between", value1, value2, "s010");
            return (Criteria) this;
        }

        public Criteria andS010NotBetween(String value1, String value2) {
            addCriterion("S010 not between", value1, value2, "s010");
            return (Criteria) this;
        }

        public Criteria andS011IsNull() {
            addCriterion("S011 is null");
            return (Criteria) this;
        }

        public Criteria andS011IsNotNull() {
            addCriterion("S011 is not null");
            return (Criteria) this;
        }

        public Criteria andS011EqualTo(String value) {
            addCriterion("S011 =", value, "s011");
            return (Criteria) this;
        }

        public Criteria andS011NotEqualTo(String value) {
            addCriterion("S011 <>", value, "s011");
            return (Criteria) this;
        }

        public Criteria andS011GreaterThan(String value) {
            addCriterion("S011 >", value, "s011");
            return (Criteria) this;
        }

        public Criteria andS011GreaterThanOrEqualTo(String value) {
            addCriterion("S011 >=", value, "s011");
            return (Criteria) this;
        }

        public Criteria andS011LessThan(String value) {
            addCriterion("S011 <", value, "s011");
            return (Criteria) this;
        }

        public Criteria andS011LessThanOrEqualTo(String value) {
            addCriterion("S011 <=", value, "s011");
            return (Criteria) this;
        }

        public Criteria andS011Like(String value) {
            addCriterion("S011 like", value, "s011");
            return (Criteria) this;
        }

        public Criteria andS011NotLike(String value) {
            addCriterion("S011 not like", value, "s011");
            return (Criteria) this;
        }

        public Criteria andS011In(List<String> values) {
            addCriterion("S011 in", values, "s011");
            return (Criteria) this;
        }

        public Criteria andS011NotIn(List<String> values) {
            addCriterion("S011 not in", values, "s011");
            return (Criteria) this;
        }

        public Criteria andS011Between(String value1, String value2) {
            addCriterion("S011 between", value1, value2, "s011");
            return (Criteria) this;
        }

        public Criteria andS011NotBetween(String value1, String value2) {
            addCriterion("S011 not between", value1, value2, "s011");
            return (Criteria) this;
        }

        public Criteria andS012IsNull() {
            addCriterion("S012 is null");
            return (Criteria) this;
        }

        public Criteria andS012IsNotNull() {
            addCriterion("S012 is not null");
            return (Criteria) this;
        }

        public Criteria andS012EqualTo(String value) {
            addCriterion("S012 =", value, "s012");
            return (Criteria) this;
        }

        public Criteria andS012NotEqualTo(String value) {
            addCriterion("S012 <>", value, "s012");
            return (Criteria) this;
        }

        public Criteria andS012GreaterThan(String value) {
            addCriterion("S012 >", value, "s012");
            return (Criteria) this;
        }

        public Criteria andS012GreaterThanOrEqualTo(String value) {
            addCriterion("S012 >=", value, "s012");
            return (Criteria) this;
        }

        public Criteria andS012LessThan(String value) {
            addCriterion("S012 <", value, "s012");
            return (Criteria) this;
        }

        public Criteria andS012LessThanOrEqualTo(String value) {
            addCriterion("S012 <=", value, "s012");
            return (Criteria) this;
        }

        public Criteria andS012Like(String value) {
            addCriterion("S012 like", value, "s012");
            return (Criteria) this;
        }

        public Criteria andS012NotLike(String value) {
            addCriterion("S012 not like", value, "s012");
            return (Criteria) this;
        }

        public Criteria andS012In(List<String> values) {
            addCriterion("S012 in", values, "s012");
            return (Criteria) this;
        }

        public Criteria andS012NotIn(List<String> values) {
            addCriterion("S012 not in", values, "s012");
            return (Criteria) this;
        }

        public Criteria andS012Between(String value1, String value2) {
            addCriterion("S012 between", value1, value2, "s012");
            return (Criteria) this;
        }

        public Criteria andS012NotBetween(String value1, String value2) {
            addCriterion("S012 not between", value1, value2, "s012");
            return (Criteria) this;
        }

        public Criteria andS013IsNull() {
            addCriterion("S013 is null");
            return (Criteria) this;
        }

        public Criteria andS013IsNotNull() {
            addCriterion("S013 is not null");
            return (Criteria) this;
        }

        public Criteria andS013EqualTo(String value) {
            addCriterion("S013 =", value, "s013");
            return (Criteria) this;
        }

        public Criteria andS013NotEqualTo(String value) {
            addCriterion("S013 <>", value, "s013");
            return (Criteria) this;
        }

        public Criteria andS013GreaterThan(String value) {
            addCriterion("S013 >", value, "s013");
            return (Criteria) this;
        }

        public Criteria andS013GreaterThanOrEqualTo(String value) {
            addCriterion("S013 >=", value, "s013");
            return (Criteria) this;
        }

        public Criteria andS013LessThan(String value) {
            addCriterion("S013 <", value, "s013");
            return (Criteria) this;
        }

        public Criteria andS013LessThanOrEqualTo(String value) {
            addCriterion("S013 <=", value, "s013");
            return (Criteria) this;
        }

        public Criteria andS013Like(String value) {
            addCriterion("S013 like", value, "s013");
            return (Criteria) this;
        }

        public Criteria andS013NotLike(String value) {
            addCriterion("S013 not like", value, "s013");
            return (Criteria) this;
        }

        public Criteria andS013In(List<String> values) {
            addCriterion("S013 in", values, "s013");
            return (Criteria) this;
        }

        public Criteria andS013NotIn(List<String> values) {
            addCriterion("S013 not in", values, "s013");
            return (Criteria) this;
        }

        public Criteria andS013Between(String value1, String value2) {
            addCriterion("S013 between", value1, value2, "s013");
            return (Criteria) this;
        }

        public Criteria andS013NotBetween(String value1, String value2) {
            addCriterion("S013 not between", value1, value2, "s013");
            return (Criteria) this;
        }

        public Criteria andS014IsNull() {
            addCriterion("S014 is null");
            return (Criteria) this;
        }

        public Criteria andS014IsNotNull() {
            addCriterion("S014 is not null");
            return (Criteria) this;
        }

        public Criteria andS014EqualTo(String value) {
            addCriterion("S014 =", value, "s014");
            return (Criteria) this;
        }

        public Criteria andS014NotEqualTo(String value) {
            addCriterion("S014 <>", value, "s014");
            return (Criteria) this;
        }

        public Criteria andS014GreaterThan(String value) {
            addCriterion("S014 >", value, "s014");
            return (Criteria) this;
        }

        public Criteria andS014GreaterThanOrEqualTo(String value) {
            addCriterion("S014 >=", value, "s014");
            return (Criteria) this;
        }

        public Criteria andS014LessThan(String value) {
            addCriterion("S014 <", value, "s014");
            return (Criteria) this;
        }

        public Criteria andS014LessThanOrEqualTo(String value) {
            addCriterion("S014 <=", value, "s014");
            return (Criteria) this;
        }

        public Criteria andS014Like(String value) {
            addCriterion("S014 like", value, "s014");
            return (Criteria) this;
        }

        public Criteria andS014NotLike(String value) {
            addCriterion("S014 not like", value, "s014");
            return (Criteria) this;
        }

        public Criteria andS014In(List<String> values) {
            addCriterion("S014 in", values, "s014");
            return (Criteria) this;
        }

        public Criteria andS014NotIn(List<String> values) {
            addCriterion("S014 not in", values, "s014");
            return (Criteria) this;
        }

        public Criteria andS014Between(String value1, String value2) {
            addCriterion("S014 between", value1, value2, "s014");
            return (Criteria) this;
        }

        public Criteria andS014NotBetween(String value1, String value2) {
            addCriterion("S014 not between", value1, value2, "s014");
            return (Criteria) this;
        }

        public Criteria andS015IsNull() {
            addCriterion("S015 is null");
            return (Criteria) this;
        }

        public Criteria andS015IsNotNull() {
            addCriterion("S015 is not null");
            return (Criteria) this;
        }

        public Criteria andS015EqualTo(String value) {
            addCriterion("S015 =", value, "s015");
            return (Criteria) this;
        }

        public Criteria andS015NotEqualTo(String value) {
            addCriterion("S015 <>", value, "s015");
            return (Criteria) this;
        }

        public Criteria andS015GreaterThan(String value) {
            addCriterion("S015 >", value, "s015");
            return (Criteria) this;
        }

        public Criteria andS015GreaterThanOrEqualTo(String value) {
            addCriterion("S015 >=", value, "s015");
            return (Criteria) this;
        }

        public Criteria andS015LessThan(String value) {
            addCriterion("S015 <", value, "s015");
            return (Criteria) this;
        }

        public Criteria andS015LessThanOrEqualTo(String value) {
            addCriterion("S015 <=", value, "s015");
            return (Criteria) this;
        }

        public Criteria andS015Like(String value) {
            addCriterion("S015 like", value, "s015");
            return (Criteria) this;
        }

        public Criteria andS015NotLike(String value) {
            addCriterion("S015 not like", value, "s015");
            return (Criteria) this;
        }

        public Criteria andS015In(List<String> values) {
            addCriterion("S015 in", values, "s015");
            return (Criteria) this;
        }

        public Criteria andS015NotIn(List<String> values) {
            addCriterion("S015 not in", values, "s015");
            return (Criteria) this;
        }

        public Criteria andS015Between(String value1, String value2) {
            addCriterion("S015 between", value1, value2, "s015");
            return (Criteria) this;
        }

        public Criteria andS015NotBetween(String value1, String value2) {
            addCriterion("S015 not between", value1, value2, "s015");
            return (Criteria) this;
        }

        public Criteria andS016IsNull() {
            addCriterion("S016 is null");
            return (Criteria) this;
        }

        public Criteria andS016IsNotNull() {
            addCriterion("S016 is not null");
            return (Criteria) this;
        }

        public Criteria andS016EqualTo(String value) {
            addCriterion("S016 =", value, "s016");
            return (Criteria) this;
        }

        public Criteria andS016NotEqualTo(String value) {
            addCriterion("S016 <>", value, "s016");
            return (Criteria) this;
        }

        public Criteria andS016GreaterThan(String value) {
            addCriterion("S016 >", value, "s016");
            return (Criteria) this;
        }

        public Criteria andS016GreaterThanOrEqualTo(String value) {
            addCriterion("S016 >=", value, "s016");
            return (Criteria) this;
        }

        public Criteria andS016LessThan(String value) {
            addCriterion("S016 <", value, "s016");
            return (Criteria) this;
        }

        public Criteria andS016LessThanOrEqualTo(String value) {
            addCriterion("S016 <=", value, "s016");
            return (Criteria) this;
        }

        public Criteria andS016Like(String value) {
            addCriterion("S016 like", value, "s016");
            return (Criteria) this;
        }

        public Criteria andS016NotLike(String value) {
            addCriterion("S016 not like", value, "s016");
            return (Criteria) this;
        }

        public Criteria andS016In(List<String> values) {
            addCriterion("S016 in", values, "s016");
            return (Criteria) this;
        }

        public Criteria andS016NotIn(List<String> values) {
            addCriterion("S016 not in", values, "s016");
            return (Criteria) this;
        }

        public Criteria andS016Between(String value1, String value2) {
            addCriterion("S016 between", value1, value2, "s016");
            return (Criteria) this;
        }

        public Criteria andS016NotBetween(String value1, String value2) {
            addCriterion("S016 not between", value1, value2, "s016");
            return (Criteria) this;
        }

        public Criteria andS017IsNull() {
            addCriterion("S017 is null");
            return (Criteria) this;
        }

        public Criteria andS017IsNotNull() {
            addCriterion("S017 is not null");
            return (Criteria) this;
        }

        public Criteria andS017EqualTo(String value) {
            addCriterion("S017 =", value, "s017");
            return (Criteria) this;
        }

        public Criteria andS017NotEqualTo(String value) {
            addCriterion("S017 <>", value, "s017");
            return (Criteria) this;
        }

        public Criteria andS017GreaterThan(String value) {
            addCriterion("S017 >", value, "s017");
            return (Criteria) this;
        }

        public Criteria andS017GreaterThanOrEqualTo(String value) {
            addCriterion("S017 >=", value, "s017");
            return (Criteria) this;
        }

        public Criteria andS017LessThan(String value) {
            addCriterion("S017 <", value, "s017");
            return (Criteria) this;
        }

        public Criteria andS017LessThanOrEqualTo(String value) {
            addCriterion("S017 <=", value, "s017");
            return (Criteria) this;
        }

        public Criteria andS017Like(String value) {
            addCriterion("S017 like", value, "s017");
            return (Criteria) this;
        }

        public Criteria andS017NotLike(String value) {
            addCriterion("S017 not like", value, "s017");
            return (Criteria) this;
        }

        public Criteria andS017In(List<String> values) {
            addCriterion("S017 in", values, "s017");
            return (Criteria) this;
        }

        public Criteria andS017NotIn(List<String> values) {
            addCriterion("S017 not in", values, "s017");
            return (Criteria) this;
        }

        public Criteria andS017Between(String value1, String value2) {
            addCriterion("S017 between", value1, value2, "s017");
            return (Criteria) this;
        }

        public Criteria andS017NotBetween(String value1, String value2) {
            addCriterion("S017 not between", value1, value2, "s017");
            return (Criteria) this;
        }

        public Criteria andS018IsNull() {
            addCriterion("S018 is null");
            return (Criteria) this;
        }

        public Criteria andS018IsNotNull() {
            addCriterion("S018 is not null");
            return (Criteria) this;
        }

        public Criteria andS018EqualTo(String value) {
            addCriterion("S018 =", value, "s018");
            return (Criteria) this;
        }

        public Criteria andS018NotEqualTo(String value) {
            addCriterion("S018 <>", value, "s018");
            return (Criteria) this;
        }

        public Criteria andS018GreaterThan(String value) {
            addCriterion("S018 >", value, "s018");
            return (Criteria) this;
        }

        public Criteria andS018GreaterThanOrEqualTo(String value) {
            addCriterion("S018 >=", value, "s018");
            return (Criteria) this;
        }

        public Criteria andS018LessThan(String value) {
            addCriterion("S018 <", value, "s018");
            return (Criteria) this;
        }

        public Criteria andS018LessThanOrEqualTo(String value) {
            addCriterion("S018 <=", value, "s018");
            return (Criteria) this;
        }

        public Criteria andS018Like(String value) {
            addCriterion("S018 like", value, "s018");
            return (Criteria) this;
        }

        public Criteria andS018NotLike(String value) {
            addCriterion("S018 not like", value, "s018");
            return (Criteria) this;
        }

        public Criteria andS018In(List<String> values) {
            addCriterion("S018 in", values, "s018");
            return (Criteria) this;
        }

        public Criteria andS018NotIn(List<String> values) {
            addCriterion("S018 not in", values, "s018");
            return (Criteria) this;
        }

        public Criteria andS018Between(String value1, String value2) {
            addCriterion("S018 between", value1, value2, "s018");
            return (Criteria) this;
        }

        public Criteria andS018NotBetween(String value1, String value2) {
            addCriterion("S018 not between", value1, value2, "s018");
            return (Criteria) this;
        }

        public Criteria andS019IsNull() {
            addCriterion("S019 is null");
            return (Criteria) this;
        }

        public Criteria andS019IsNotNull() {
            addCriterion("S019 is not null");
            return (Criteria) this;
        }

        public Criteria andS019EqualTo(String value) {
            addCriterion("S019 =", value, "s019");
            return (Criteria) this;
        }

        public Criteria andS019NotEqualTo(String value) {
            addCriterion("S019 <>", value, "s019");
            return (Criteria) this;
        }

        public Criteria andS019GreaterThan(String value) {
            addCriterion("S019 >", value, "s019");
            return (Criteria) this;
        }

        public Criteria andS019GreaterThanOrEqualTo(String value) {
            addCriterion("S019 >=", value, "s019");
            return (Criteria) this;
        }

        public Criteria andS019LessThan(String value) {
            addCriterion("S019 <", value, "s019");
            return (Criteria) this;
        }

        public Criteria andS019LessThanOrEqualTo(String value) {
            addCriterion("S019 <=", value, "s019");
            return (Criteria) this;
        }

        public Criteria andS019Like(String value) {
            addCriterion("S019 like", value, "s019");
            return (Criteria) this;
        }

        public Criteria andS019NotLike(String value) {
            addCriterion("S019 not like", value, "s019");
            return (Criteria) this;
        }

        public Criteria andS019In(List<String> values) {
            addCriterion("S019 in", values, "s019");
            return (Criteria) this;
        }

        public Criteria andS019NotIn(List<String> values) {
            addCriterion("S019 not in", values, "s019");
            return (Criteria) this;
        }

        public Criteria andS019Between(String value1, String value2) {
            addCriterion("S019 between", value1, value2, "s019");
            return (Criteria) this;
        }

        public Criteria andS019NotBetween(String value1, String value2) {
            addCriterion("S019 not between", value1, value2, "s019");
            return (Criteria) this;
        }

        public Criteria andS020IsNull() {
            addCriterion("S020 is null");
            return (Criteria) this;
        }

        public Criteria andS020IsNotNull() {
            addCriterion("S020 is not null");
            return (Criteria) this;
        }

        public Criteria andS020EqualTo(String value) {
            addCriterion("S020 =", value, "s020");
            return (Criteria) this;
        }

        public Criteria andS020NotEqualTo(String value) {
            addCriterion("S020 <>", value, "s020");
            return (Criteria) this;
        }

        public Criteria andS020GreaterThan(String value) {
            addCriterion("S020 >", value, "s020");
            return (Criteria) this;
        }

        public Criteria andS020GreaterThanOrEqualTo(String value) {
            addCriterion("S020 >=", value, "s020");
            return (Criteria) this;
        }

        public Criteria andS020LessThan(String value) {
            addCriterion("S020 <", value, "s020");
            return (Criteria) this;
        }

        public Criteria andS020LessThanOrEqualTo(String value) {
            addCriterion("S020 <=", value, "s020");
            return (Criteria) this;
        }

        public Criteria andS020Like(String value) {
            addCriterion("S020 like", value, "s020");
            return (Criteria) this;
        }

        public Criteria andS020NotLike(String value) {
            addCriterion("S020 not like", value, "s020");
            return (Criteria) this;
        }

        public Criteria andS020In(List<String> values) {
            addCriterion("S020 in", values, "s020");
            return (Criteria) this;
        }

        public Criteria andS020NotIn(List<String> values) {
            addCriterion("S020 not in", values, "s020");
            return (Criteria) this;
        }

        public Criteria andS020Between(String value1, String value2) {
            addCriterion("S020 between", value1, value2, "s020");
            return (Criteria) this;
        }

        public Criteria andS020NotBetween(String value1, String value2) {
            addCriterion("S020 not between", value1, value2, "s020");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}