package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class CompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyExample() {
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

        public Criteria andC001IsNull() {
            addCriterion("C001 is null");
            return (Criteria) this;
        }

        public Criteria andC001IsNotNull() {
            addCriterion("C001 is not null");
            return (Criteria) this;
        }

        public Criteria andC001EqualTo(String value) {
            addCriterion("C001 =", value, "c001");
            return (Criteria) this;
        }

        public Criteria andC001NotEqualTo(String value) {
            addCriterion("C001 <>", value, "c001");
            return (Criteria) this;
        }

        public Criteria andC001GreaterThan(String value) {
            addCriterion("C001 >", value, "c001");
            return (Criteria) this;
        }

        public Criteria andC001GreaterThanOrEqualTo(String value) {
            addCriterion("C001 >=", value, "c001");
            return (Criteria) this;
        }

        public Criteria andC001LessThan(String value) {
            addCriterion("C001 <", value, "c001");
            return (Criteria) this;
        }

        public Criteria andC001LessThanOrEqualTo(String value) {
            addCriterion("C001 <=", value, "c001");
            return (Criteria) this;
        }

        public Criteria andC001Like(String value) {
            addCriterion("C001 like", value, "c001");
            return (Criteria) this;
        }

        public Criteria andC001NotLike(String value) {
            addCriterion("C001 not like", value, "c001");
            return (Criteria) this;
        }

        public Criteria andC001In(List<String> values) {
            addCriterion("C001 in", values, "c001");
            return (Criteria) this;
        }

        public Criteria andC001NotIn(List<String> values) {
            addCriterion("C001 not in", values, "c001");
            return (Criteria) this;
        }

        public Criteria andC001Between(String value1, String value2) {
            addCriterion("C001 between", value1, value2, "c001");
            return (Criteria) this;
        }

        public Criteria andC001NotBetween(String value1, String value2) {
            addCriterion("C001 not between", value1, value2, "c001");
            return (Criteria) this;
        }

        public Criteria andC002IsNull() {
            addCriterion("C002 is null");
            return (Criteria) this;
        }

        public Criteria andC002IsNotNull() {
            addCriterion("C002 is not null");
            return (Criteria) this;
        }

        public Criteria andC002EqualTo(String value) {
            addCriterion("C002 =", value, "c002");
            return (Criteria) this;
        }

        public Criteria andC002NotEqualTo(String value) {
            addCriterion("C002 <>", value, "c002");
            return (Criteria) this;
        }

        public Criteria andC002GreaterThan(String value) {
            addCriterion("C002 >", value, "c002");
            return (Criteria) this;
        }

        public Criteria andC002GreaterThanOrEqualTo(String value) {
            addCriterion("C002 >=", value, "c002");
            return (Criteria) this;
        }

        public Criteria andC002LessThan(String value) {
            addCriterion("C002 <", value, "c002");
            return (Criteria) this;
        }

        public Criteria andC002LessThanOrEqualTo(String value) {
            addCriterion("C002 <=", value, "c002");
            return (Criteria) this;
        }

        public Criteria andC002Like(String value) {
            addCriterion("C002 like", value, "c002");
            return (Criteria) this;
        }

        public Criteria andC002NotLike(String value) {
            addCriterion("C002 not like", value, "c002");
            return (Criteria) this;
        }

        public Criteria andC002In(List<String> values) {
            addCriterion("C002 in", values, "c002");
            return (Criteria) this;
        }

        public Criteria andC002NotIn(List<String> values) {
            addCriterion("C002 not in", values, "c002");
            return (Criteria) this;
        }

        public Criteria andC002Between(String value1, String value2) {
            addCriterion("C002 between", value1, value2, "c002");
            return (Criteria) this;
        }

        public Criteria andC002NotBetween(String value1, String value2) {
            addCriterion("C002 not between", value1, value2, "c002");
            return (Criteria) this;
        }

        public Criteria andC003IsNull() {
            addCriterion("C003 is null");
            return (Criteria) this;
        }

        public Criteria andC003IsNotNull() {
            addCriterion("C003 is not null");
            return (Criteria) this;
        }

        public Criteria andC003EqualTo(String value) {
            addCriterion("C003 =", value, "c003");
            return (Criteria) this;
        }

        public Criteria andC003NotEqualTo(String value) {
            addCriterion("C003 <>", value, "c003");
            return (Criteria) this;
        }

        public Criteria andC003GreaterThan(String value) {
            addCriterion("C003 >", value, "c003");
            return (Criteria) this;
        }

        public Criteria andC003GreaterThanOrEqualTo(String value) {
            addCriterion("C003 >=", value, "c003");
            return (Criteria) this;
        }

        public Criteria andC003LessThan(String value) {
            addCriterion("C003 <", value, "c003");
            return (Criteria) this;
        }

        public Criteria andC003LessThanOrEqualTo(String value) {
            addCriterion("C003 <=", value, "c003");
            return (Criteria) this;
        }

        public Criteria andC003Like(String value) {
            addCriterion("C003 like", value, "c003");
            return (Criteria) this;
        }

        public Criteria andC003NotLike(String value) {
            addCriterion("C003 not like", value, "c003");
            return (Criteria) this;
        }

        public Criteria andC003In(List<String> values) {
            addCriterion("C003 in", values, "c003");
            return (Criteria) this;
        }

        public Criteria andC003NotIn(List<String> values) {
            addCriterion("C003 not in", values, "c003");
            return (Criteria) this;
        }

        public Criteria andC003Between(String value1, String value2) {
            addCriterion("C003 between", value1, value2, "c003");
            return (Criteria) this;
        }

        public Criteria andC003NotBetween(String value1, String value2) {
            addCriterion("C003 not between", value1, value2, "c003");
            return (Criteria) this;
        }

        public Criteria andC004IsNull() {
            addCriterion("C004 is null");
            return (Criteria) this;
        }

        public Criteria andC004IsNotNull() {
            addCriterion("C004 is not null");
            return (Criteria) this;
        }

        public Criteria andC004EqualTo(String value) {
            addCriterion("C004 =", value, "c004");
            return (Criteria) this;
        }

        public Criteria andC004NotEqualTo(String value) {
            addCriterion("C004 <>", value, "c004");
            return (Criteria) this;
        }

        public Criteria andC004GreaterThan(String value) {
            addCriterion("C004 >", value, "c004");
            return (Criteria) this;
        }

        public Criteria andC004GreaterThanOrEqualTo(String value) {
            addCriterion("C004 >=", value, "c004");
            return (Criteria) this;
        }

        public Criteria andC004LessThan(String value) {
            addCriterion("C004 <", value, "c004");
            return (Criteria) this;
        }

        public Criteria andC004LessThanOrEqualTo(String value) {
            addCriterion("C004 <=", value, "c004");
            return (Criteria) this;
        }

        public Criteria andC004Like(String value) {
            addCriterion("C004 like", value, "c004");
            return (Criteria) this;
        }

        public Criteria andC004NotLike(String value) {
            addCriterion("C004 not like", value, "c004");
            return (Criteria) this;
        }

        public Criteria andC004In(List<String> values) {
            addCriterion("C004 in", values, "c004");
            return (Criteria) this;
        }

        public Criteria andC004NotIn(List<String> values) {
            addCriterion("C004 not in", values, "c004");
            return (Criteria) this;
        }

        public Criteria andC004Between(String value1, String value2) {
            addCriterion("C004 between", value1, value2, "c004");
            return (Criteria) this;
        }

        public Criteria andC004NotBetween(String value1, String value2) {
            addCriterion("C004 not between", value1, value2, "c004");
            return (Criteria) this;
        }

        public Criteria andC005IsNull() {
            addCriterion("C005 is null");
            return (Criteria) this;
        }

        public Criteria andC005IsNotNull() {
            addCriterion("C005 is not null");
            return (Criteria) this;
        }

        public Criteria andC005EqualTo(String value) {
            addCriterion("C005 =", value, "c005");
            return (Criteria) this;
        }

        public Criteria andC005NotEqualTo(String value) {
            addCriterion("C005 <>", value, "c005");
            return (Criteria) this;
        }

        public Criteria andC005GreaterThan(String value) {
            addCriterion("C005 >", value, "c005");
            return (Criteria) this;
        }

        public Criteria andC005GreaterThanOrEqualTo(String value) {
            addCriterion("C005 >=", value, "c005");
            return (Criteria) this;
        }

        public Criteria andC005LessThan(String value) {
            addCriterion("C005 <", value, "c005");
            return (Criteria) this;
        }

        public Criteria andC005LessThanOrEqualTo(String value) {
            addCriterion("C005 <=", value, "c005");
            return (Criteria) this;
        }

        public Criteria andC005Like(String value) {
            addCriterion("C005 like", value, "c005");
            return (Criteria) this;
        }

        public Criteria andC005NotLike(String value) {
            addCriterion("C005 not like", value, "c005");
            return (Criteria) this;
        }

        public Criteria andC005In(List<String> values) {
            addCriterion("C005 in", values, "c005");
            return (Criteria) this;
        }

        public Criteria andC005NotIn(List<String> values) {
            addCriterion("C005 not in", values, "c005");
            return (Criteria) this;
        }

        public Criteria andC005Between(String value1, String value2) {
            addCriterion("C005 between", value1, value2, "c005");
            return (Criteria) this;
        }

        public Criteria andC005NotBetween(String value1, String value2) {
            addCriterion("C005 not between", value1, value2, "c005");
            return (Criteria) this;
        }

        public Criteria andC006IsNull() {
            addCriterion("C006 is null");
            return (Criteria) this;
        }

        public Criteria andC006IsNotNull() {
            addCriterion("C006 is not null");
            return (Criteria) this;
        }

        public Criteria andC006EqualTo(String value) {
            addCriterion("C006 =", value, "c006");
            return (Criteria) this;
        }

        public Criteria andC006NotEqualTo(String value) {
            addCriterion("C006 <>", value, "c006");
            return (Criteria) this;
        }

        public Criteria andC006GreaterThan(String value) {
            addCriterion("C006 >", value, "c006");
            return (Criteria) this;
        }

        public Criteria andC006GreaterThanOrEqualTo(String value) {
            addCriterion("C006 >=", value, "c006");
            return (Criteria) this;
        }

        public Criteria andC006LessThan(String value) {
            addCriterion("C006 <", value, "c006");
            return (Criteria) this;
        }

        public Criteria andC006LessThanOrEqualTo(String value) {
            addCriterion("C006 <=", value, "c006");
            return (Criteria) this;
        }

        public Criteria andC006Like(String value) {
            addCriterion("C006 like", value, "c006");
            return (Criteria) this;
        }

        public Criteria andC006NotLike(String value) {
            addCriterion("C006 not like", value, "c006");
            return (Criteria) this;
        }

        public Criteria andC006In(List<String> values) {
            addCriterion("C006 in", values, "c006");
            return (Criteria) this;
        }

        public Criteria andC006NotIn(List<String> values) {
            addCriterion("C006 not in", values, "c006");
            return (Criteria) this;
        }

        public Criteria andC006Between(String value1, String value2) {
            addCriterion("C006 between", value1, value2, "c006");
            return (Criteria) this;
        }

        public Criteria andC006NotBetween(String value1, String value2) {
            addCriterion("C006 not between", value1, value2, "c006");
            return (Criteria) this;
        }

        public Criteria andC007IsNull() {
            addCriterion("C007 is null");
            return (Criteria) this;
        }

        public Criteria andC007IsNotNull() {
            addCriterion("C007 is not null");
            return (Criteria) this;
        }

        public Criteria andC007EqualTo(String value) {
            addCriterion("C007 =", value, "c007");
            return (Criteria) this;
        }

        public Criteria andC007NotEqualTo(String value) {
            addCriterion("C007 <>", value, "c007");
            return (Criteria) this;
        }

        public Criteria andC007GreaterThan(String value) {
            addCriterion("C007 >", value, "c007");
            return (Criteria) this;
        }

        public Criteria andC007GreaterThanOrEqualTo(String value) {
            addCriterion("C007 >=", value, "c007");
            return (Criteria) this;
        }

        public Criteria andC007LessThan(String value) {
            addCriterion("C007 <", value, "c007");
            return (Criteria) this;
        }

        public Criteria andC007LessThanOrEqualTo(String value) {
            addCriterion("C007 <=", value, "c007");
            return (Criteria) this;
        }

        public Criteria andC007Like(String value) {
            addCriterion("C007 like", value, "c007");
            return (Criteria) this;
        }

        public Criteria andC007NotLike(String value) {
            addCriterion("C007 not like", value, "c007");
            return (Criteria) this;
        }

        public Criteria andC007In(List<String> values) {
            addCriterion("C007 in", values, "c007");
            return (Criteria) this;
        }

        public Criteria andC007NotIn(List<String> values) {
            addCriterion("C007 not in", values, "c007");
            return (Criteria) this;
        }

        public Criteria andC007Between(String value1, String value2) {
            addCriterion("C007 between", value1, value2, "c007");
            return (Criteria) this;
        }

        public Criteria andC007NotBetween(String value1, String value2) {
            addCriterion("C007 not between", value1, value2, "c007");
            return (Criteria) this;
        }

        public Criteria andC008IsNull() {
            addCriterion("C008 is null");
            return (Criteria) this;
        }

        public Criteria andC008IsNotNull() {
            addCriterion("C008 is not null");
            return (Criteria) this;
        }

        public Criteria andC008EqualTo(String value) {
            addCriterion("C008 =", value, "c008");
            return (Criteria) this;
        }

        public Criteria andC008NotEqualTo(String value) {
            addCriterion("C008 <>", value, "c008");
            return (Criteria) this;
        }

        public Criteria andC008GreaterThan(String value) {
            addCriterion("C008 >", value, "c008");
            return (Criteria) this;
        }

        public Criteria andC008GreaterThanOrEqualTo(String value) {
            addCriterion("C008 >=", value, "c008");
            return (Criteria) this;
        }

        public Criteria andC008LessThan(String value) {
            addCriterion("C008 <", value, "c008");
            return (Criteria) this;
        }

        public Criteria andC008LessThanOrEqualTo(String value) {
            addCriterion("C008 <=", value, "c008");
            return (Criteria) this;
        }

        public Criteria andC008Like(String value) {
            addCriterion("C008 like", value, "c008");
            return (Criteria) this;
        }

        public Criteria andC008NotLike(String value) {
            addCriterion("C008 not like", value, "c008");
            return (Criteria) this;
        }

        public Criteria andC008In(List<String> values) {
            addCriterion("C008 in", values, "c008");
            return (Criteria) this;
        }

        public Criteria andC008NotIn(List<String> values) {
            addCriterion("C008 not in", values, "c008");
            return (Criteria) this;
        }

        public Criteria andC008Between(String value1, String value2) {
            addCriterion("C008 between", value1, value2, "c008");
            return (Criteria) this;
        }

        public Criteria andC008NotBetween(String value1, String value2) {
            addCriterion("C008 not between", value1, value2, "c008");
            return (Criteria) this;
        }

        public Criteria andC009IsNull() {
            addCriterion("C009 is null");
            return (Criteria) this;
        }

        public Criteria andC009IsNotNull() {
            addCriterion("C009 is not null");
            return (Criteria) this;
        }

        public Criteria andC009EqualTo(String value) {
            addCriterion("C009 =", value, "c009");
            return (Criteria) this;
        }

        public Criteria andC009NotEqualTo(String value) {
            addCriterion("C009 <>", value, "c009");
            return (Criteria) this;
        }

        public Criteria andC009GreaterThan(String value) {
            addCriterion("C009 >", value, "c009");
            return (Criteria) this;
        }

        public Criteria andC009GreaterThanOrEqualTo(String value) {
            addCriterion("C009 >=", value, "c009");
            return (Criteria) this;
        }

        public Criteria andC009LessThan(String value) {
            addCriterion("C009 <", value, "c009");
            return (Criteria) this;
        }

        public Criteria andC009LessThanOrEqualTo(String value) {
            addCriterion("C009 <=", value, "c009");
            return (Criteria) this;
        }

        public Criteria andC009Like(String value) {
            addCriterion("C009 like", value, "c009");
            return (Criteria) this;
        }

        public Criteria andC009NotLike(String value) {
            addCriterion("C009 not like", value, "c009");
            return (Criteria) this;
        }

        public Criteria andC009In(List<String> values) {
            addCriterion("C009 in", values, "c009");
            return (Criteria) this;
        }

        public Criteria andC009NotIn(List<String> values) {
            addCriterion("C009 not in", values, "c009");
            return (Criteria) this;
        }

        public Criteria andC009Between(String value1, String value2) {
            addCriterion("C009 between", value1, value2, "c009");
            return (Criteria) this;
        }

        public Criteria andC009NotBetween(String value1, String value2) {
            addCriterion("C009 not between", value1, value2, "c009");
            return (Criteria) this;
        }

        public Criteria andC010IsNull() {
            addCriterion("C010 is null");
            return (Criteria) this;
        }

        public Criteria andC010IsNotNull() {
            addCriterion("C010 is not null");
            return (Criteria) this;
        }

        public Criteria andC010EqualTo(String value) {
            addCriterion("C010 =", value, "c010");
            return (Criteria) this;
        }

        public Criteria andC010NotEqualTo(String value) {
            addCriterion("C010 <>", value, "c010");
            return (Criteria) this;
        }

        public Criteria andC010GreaterThan(String value) {
            addCriterion("C010 >", value, "c010");
            return (Criteria) this;
        }

        public Criteria andC010GreaterThanOrEqualTo(String value) {
            addCriterion("C010 >=", value, "c010");
            return (Criteria) this;
        }

        public Criteria andC010LessThan(String value) {
            addCriterion("C010 <", value, "c010");
            return (Criteria) this;
        }

        public Criteria andC010LessThanOrEqualTo(String value) {
            addCriterion("C010 <=", value, "c010");
            return (Criteria) this;
        }

        public Criteria andC010Like(String value) {
            addCriterion("C010 like", value, "c010");
            return (Criteria) this;
        }

        public Criteria andC010NotLike(String value) {
            addCriterion("C010 not like", value, "c010");
            return (Criteria) this;
        }

        public Criteria andC010In(List<String> values) {
            addCriterion("C010 in", values, "c010");
            return (Criteria) this;
        }

        public Criteria andC010NotIn(List<String> values) {
            addCriterion("C010 not in", values, "c010");
            return (Criteria) this;
        }

        public Criteria andC010Between(String value1, String value2) {
            addCriterion("C010 between", value1, value2, "c010");
            return (Criteria) this;
        }

        public Criteria andC010NotBetween(String value1, String value2) {
            addCriterion("C010 not between", value1, value2, "c010");
            return (Criteria) this;
        }

        public Criteria andC011IsNull() {
            addCriterion("C011 is null");
            return (Criteria) this;
        }

        public Criteria andC011IsNotNull() {
            addCriterion("C011 is not null");
            return (Criteria) this;
        }

        public Criteria andC011EqualTo(String value) {
            addCriterion("C011 =", value, "c011");
            return (Criteria) this;
        }

        public Criteria andC011NotEqualTo(String value) {
            addCriterion("C011 <>", value, "c011");
            return (Criteria) this;
        }

        public Criteria andC011GreaterThan(String value) {
            addCriterion("C011 >", value, "c011");
            return (Criteria) this;
        }

        public Criteria andC011GreaterThanOrEqualTo(String value) {
            addCriterion("C011 >=", value, "c011");
            return (Criteria) this;
        }

        public Criteria andC011LessThan(String value) {
            addCriterion("C011 <", value, "c011");
            return (Criteria) this;
        }

        public Criteria andC011LessThanOrEqualTo(String value) {
            addCriterion("C011 <=", value, "c011");
            return (Criteria) this;
        }

        public Criteria andC011Like(String value) {
            addCriterion("C011 like", value, "c011");
            return (Criteria) this;
        }

        public Criteria andC011NotLike(String value) {
            addCriterion("C011 not like", value, "c011");
            return (Criteria) this;
        }

        public Criteria andC011In(List<String> values) {
            addCriterion("C011 in", values, "c011");
            return (Criteria) this;
        }

        public Criteria andC011NotIn(List<String> values) {
            addCriterion("C011 not in", values, "c011");
            return (Criteria) this;
        }

        public Criteria andC011Between(String value1, String value2) {
            addCriterion("C011 between", value1, value2, "c011");
            return (Criteria) this;
        }

        public Criteria andC011NotBetween(String value1, String value2) {
            addCriterion("C011 not between", value1, value2, "c011");
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