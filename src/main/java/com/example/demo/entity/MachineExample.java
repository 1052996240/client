package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class MachineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MachineExample() {
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

        public Criteria andM001IsNull() {
            addCriterion("M001 is null");
            return (Criteria) this;
        }

        public Criteria andM001IsNotNull() {
            addCriterion("M001 is not null");
            return (Criteria) this;
        }

        public Criteria andM001EqualTo(String value) {
            addCriterion("M001 =", value, "m001");
            return (Criteria) this;
        }

        public Criteria andM001NotEqualTo(String value) {
            addCriterion("M001 <>", value, "m001");
            return (Criteria) this;
        }

        public Criteria andM001GreaterThan(String value) {
            addCriterion("M001 >", value, "m001");
            return (Criteria) this;
        }

        public Criteria andM001GreaterThanOrEqualTo(String value) {
            addCriterion("M001 >=", value, "m001");
            return (Criteria) this;
        }

        public Criteria andM001LessThan(String value) {
            addCriterion("M001 <", value, "m001");
            return (Criteria) this;
        }

        public Criteria andM001LessThanOrEqualTo(String value) {
            addCriterion("M001 <=", value, "m001");
            return (Criteria) this;
        }

        public Criteria andM001Like(String value) {
            addCriterion("M001 like", value, "m001");
            return (Criteria) this;
        }

        public Criteria andM001NotLike(String value) {
            addCriterion("M001 not like", value, "m001");
            return (Criteria) this;
        }

        public Criteria andM001In(List<String> values) {
            addCriterion("M001 in", values, "m001");
            return (Criteria) this;
        }

        public Criteria andM001NotIn(List<String> values) {
            addCriterion("M001 not in", values, "m001");
            return (Criteria) this;
        }

        public Criteria andM001Between(String value1, String value2) {
            addCriterion("M001 between", value1, value2, "m001");
            return (Criteria) this;
        }

        public Criteria andM001NotBetween(String value1, String value2) {
            addCriterion("M001 not between", value1, value2, "m001");
            return (Criteria) this;
        }

        public Criteria andM002IsNull() {
            addCriterion("M002 is null");
            return (Criteria) this;
        }

        public Criteria andM002IsNotNull() {
            addCriterion("M002 is not null");
            return (Criteria) this;
        }

        public Criteria andM002EqualTo(String value) {
            addCriterion("M002 =", value, "m002");
            return (Criteria) this;
        }

        public Criteria andM002NotEqualTo(String value) {
            addCriterion("M002 <>", value, "m002");
            return (Criteria) this;
        }

        public Criteria andM002GreaterThan(String value) {
            addCriterion("M002 >", value, "m002");
            return (Criteria) this;
        }

        public Criteria andM002GreaterThanOrEqualTo(String value) {
            addCriterion("M002 >=", value, "m002");
            return (Criteria) this;
        }

        public Criteria andM002LessThan(String value) {
            addCriterion("M002 <", value, "m002");
            return (Criteria) this;
        }

        public Criteria andM002LessThanOrEqualTo(String value) {
            addCriterion("M002 <=", value, "m002");
            return (Criteria) this;
        }

        public Criteria andM002Like(String value) {
            addCriterion("M002 like", value, "m002");
            return (Criteria) this;
        }

        public Criteria andM002NotLike(String value) {
            addCriterion("M002 not like", value, "m002");
            return (Criteria) this;
        }

        public Criteria andM002In(List<String> values) {
            addCriterion("M002 in", values, "m002");
            return (Criteria) this;
        }

        public Criteria andM002NotIn(List<String> values) {
            addCriterion("M002 not in", values, "m002");
            return (Criteria) this;
        }

        public Criteria andM002Between(String value1, String value2) {
            addCriterion("M002 between", value1, value2, "m002");
            return (Criteria) this;
        }

        public Criteria andM002NotBetween(String value1, String value2) {
            addCriterion("M002 not between", value1, value2, "m002");
            return (Criteria) this;
        }

        public Criteria andM003IsNull() {
            addCriterion("M003 is null");
            return (Criteria) this;
        }

        public Criteria andM003IsNotNull() {
            addCriterion("M003 is not null");
            return (Criteria) this;
        }

        public Criteria andM003EqualTo(String value) {
            addCriterion("M003 =", value, "m003");
            return (Criteria) this;
        }

        public Criteria andM003NotEqualTo(String value) {
            addCriterion("M003 <>", value, "m003");
            return (Criteria) this;
        }

        public Criteria andM003GreaterThan(String value) {
            addCriterion("M003 >", value, "m003");
            return (Criteria) this;
        }

        public Criteria andM003GreaterThanOrEqualTo(String value) {
            addCriterion("M003 >=", value, "m003");
            return (Criteria) this;
        }

        public Criteria andM003LessThan(String value) {
            addCriterion("M003 <", value, "m003");
            return (Criteria) this;
        }

        public Criteria andM003LessThanOrEqualTo(String value) {
            addCriterion("M003 <=", value, "m003");
            return (Criteria) this;
        }

        public Criteria andM003Like(String value) {
            addCriterion("M003 like", value, "m003");
            return (Criteria) this;
        }

        public Criteria andM003NotLike(String value) {
            addCriterion("M003 not like", value, "m003");
            return (Criteria) this;
        }

        public Criteria andM003In(List<String> values) {
            addCriterion("M003 in", values, "m003");
            return (Criteria) this;
        }

        public Criteria andM003NotIn(List<String> values) {
            addCriterion("M003 not in", values, "m003");
            return (Criteria) this;
        }

        public Criteria andM003Between(String value1, String value2) {
            addCriterion("M003 between", value1, value2, "m003");
            return (Criteria) this;
        }

        public Criteria andM003NotBetween(String value1, String value2) {
            addCriterion("M003 not between", value1, value2, "m003");
            return (Criteria) this;
        }

        public Criteria andM004IsNull() {
            addCriterion("M004 is null");
            return (Criteria) this;
        }

        public Criteria andM004IsNotNull() {
            addCriterion("M004 is not null");
            return (Criteria) this;
        }

        public Criteria andM004EqualTo(String value) {
            addCriterion("M004 =", value, "m004");
            return (Criteria) this;
        }

        public Criteria andM004NotEqualTo(String value) {
            addCriterion("M004 <>", value, "m004");
            return (Criteria) this;
        }

        public Criteria andM004GreaterThan(String value) {
            addCriterion("M004 >", value, "m004");
            return (Criteria) this;
        }

        public Criteria andM004GreaterThanOrEqualTo(String value) {
            addCriterion("M004 >=", value, "m004");
            return (Criteria) this;
        }

        public Criteria andM004LessThan(String value) {
            addCriterion("M004 <", value, "m004");
            return (Criteria) this;
        }

        public Criteria andM004LessThanOrEqualTo(String value) {
            addCriterion("M004 <=", value, "m004");
            return (Criteria) this;
        }

        public Criteria andM004Like(String value) {
            addCriterion("M004 like", value, "m004");
            return (Criteria) this;
        }

        public Criteria andM004NotLike(String value) {
            addCriterion("M004 not like", value, "m004");
            return (Criteria) this;
        }

        public Criteria andM004In(List<String> values) {
            addCriterion("M004 in", values, "m004");
            return (Criteria) this;
        }

        public Criteria andM004NotIn(List<String> values) {
            addCriterion("M004 not in", values, "m004");
            return (Criteria) this;
        }

        public Criteria andM004Between(String value1, String value2) {
            addCriterion("M004 between", value1, value2, "m004");
            return (Criteria) this;
        }

        public Criteria andM004NotBetween(String value1, String value2) {
            addCriterion("M004 not between", value1, value2, "m004");
            return (Criteria) this;
        }

        public Criteria andM005IsNull() {
            addCriterion("M005 is null");
            return (Criteria) this;
        }

        public Criteria andM005IsNotNull() {
            addCriterion("M005 is not null");
            return (Criteria) this;
        }

        public Criteria andM005EqualTo(String value) {
            addCriterion("M005 =", value, "m005");
            return (Criteria) this;
        }

        public Criteria andM005NotEqualTo(String value) {
            addCriterion("M005 <>", value, "m005");
            return (Criteria) this;
        }

        public Criteria andM005GreaterThan(String value) {
            addCriterion("M005 >", value, "m005");
            return (Criteria) this;
        }

        public Criteria andM005GreaterThanOrEqualTo(String value) {
            addCriterion("M005 >=", value, "m005");
            return (Criteria) this;
        }

        public Criteria andM005LessThan(String value) {
            addCriterion("M005 <", value, "m005");
            return (Criteria) this;
        }

        public Criteria andM005LessThanOrEqualTo(String value) {
            addCriterion("M005 <=", value, "m005");
            return (Criteria) this;
        }

        public Criteria andM005Like(String value) {
            addCriterion("M005 like", value, "m005");
            return (Criteria) this;
        }

        public Criteria andM005NotLike(String value) {
            addCriterion("M005 not like", value, "m005");
            return (Criteria) this;
        }

        public Criteria andM005In(List<String> values) {
            addCriterion("M005 in", values, "m005");
            return (Criteria) this;
        }

        public Criteria andM005NotIn(List<String> values) {
            addCriterion("M005 not in", values, "m005");
            return (Criteria) this;
        }

        public Criteria andM005Between(String value1, String value2) {
            addCriterion("M005 between", value1, value2, "m005");
            return (Criteria) this;
        }

        public Criteria andM005NotBetween(String value1, String value2) {
            addCriterion("M005 not between", value1, value2, "m005");
            return (Criteria) this;
        }

        public Criteria andM006IsNull() {
            addCriterion("M006 is null");
            return (Criteria) this;
        }

        public Criteria andM006IsNotNull() {
            addCriterion("M006 is not null");
            return (Criteria) this;
        }

        public Criteria andM006EqualTo(String value) {
            addCriterion("M006 =", value, "m006");
            return (Criteria) this;
        }

        public Criteria andM006NotEqualTo(String value) {
            addCriterion("M006 <>", value, "m006");
            return (Criteria) this;
        }

        public Criteria andM006GreaterThan(String value) {
            addCriterion("M006 >", value, "m006");
            return (Criteria) this;
        }

        public Criteria andM006GreaterThanOrEqualTo(String value) {
            addCriterion("M006 >=", value, "m006");
            return (Criteria) this;
        }

        public Criteria andM006LessThan(String value) {
            addCriterion("M006 <", value, "m006");
            return (Criteria) this;
        }

        public Criteria andM006LessThanOrEqualTo(String value) {
            addCriterion("M006 <=", value, "m006");
            return (Criteria) this;
        }

        public Criteria andM006Like(String value) {
            addCriterion("M006 like", value, "m006");
            return (Criteria) this;
        }

        public Criteria andM006NotLike(String value) {
            addCriterion("M006 not like", value, "m006");
            return (Criteria) this;
        }

        public Criteria andM006In(List<String> values) {
            addCriterion("M006 in", values, "m006");
            return (Criteria) this;
        }

        public Criteria andM006NotIn(List<String> values) {
            addCriterion("M006 not in", values, "m006");
            return (Criteria) this;
        }

        public Criteria andM006Between(String value1, String value2) {
            addCriterion("M006 between", value1, value2, "m006");
            return (Criteria) this;
        }

        public Criteria andM006NotBetween(String value1, String value2) {
            addCriterion("M006 not between", value1, value2, "m006");
            return (Criteria) this;
        }

        public Criteria andM007IsNull() {
            addCriterion("M007 is null");
            return (Criteria) this;
        }

        public Criteria andM007IsNotNull() {
            addCriterion("M007 is not null");
            return (Criteria) this;
        }

        public Criteria andM007EqualTo(String value) {
            addCriterion("M007 =", value, "m007");
            return (Criteria) this;
        }

        public Criteria andM007NotEqualTo(String value) {
            addCriterion("M007 <>", value, "m007");
            return (Criteria) this;
        }

        public Criteria andM007GreaterThan(String value) {
            addCriterion("M007 >", value, "m007");
            return (Criteria) this;
        }

        public Criteria andM007GreaterThanOrEqualTo(String value) {
            addCriterion("M007 >=", value, "m007");
            return (Criteria) this;
        }

        public Criteria andM007LessThan(String value) {
            addCriterion("M007 <", value, "m007");
            return (Criteria) this;
        }

        public Criteria andM007LessThanOrEqualTo(String value) {
            addCriterion("M007 <=", value, "m007");
            return (Criteria) this;
        }

        public Criteria andM007Like(String value) {
            addCriterion("M007 like", value, "m007");
            return (Criteria) this;
        }

        public Criteria andM007NotLike(String value) {
            addCriterion("M007 not like", value, "m007");
            return (Criteria) this;
        }

        public Criteria andM007In(List<String> values) {
            addCriterion("M007 in", values, "m007");
            return (Criteria) this;
        }

        public Criteria andM007NotIn(List<String> values) {
            addCriterion("M007 not in", values, "m007");
            return (Criteria) this;
        }

        public Criteria andM007Between(String value1, String value2) {
            addCriterion("M007 between", value1, value2, "m007");
            return (Criteria) this;
        }

        public Criteria andM007NotBetween(String value1, String value2) {
            addCriterion("M007 not between", value1, value2, "m007");
            return (Criteria) this;
        }

        public Criteria andM008IsNull() {
            addCriterion("M008 is null");
            return (Criteria) this;
        }

        public Criteria andM008IsNotNull() {
            addCriterion("M008 is not null");
            return (Criteria) this;
        }

        public Criteria andM008EqualTo(String value) {
            addCriterion("M008 =", value, "m008");
            return (Criteria) this;
        }

        public Criteria andM008NotEqualTo(String value) {
            addCriterion("M008 <>", value, "m008");
            return (Criteria) this;
        }

        public Criteria andM008GreaterThan(String value) {
            addCriterion("M008 >", value, "m008");
            return (Criteria) this;
        }

        public Criteria andM008GreaterThanOrEqualTo(String value) {
            addCriterion("M008 >=", value, "m008");
            return (Criteria) this;
        }

        public Criteria andM008LessThan(String value) {
            addCriterion("M008 <", value, "m008");
            return (Criteria) this;
        }

        public Criteria andM008LessThanOrEqualTo(String value) {
            addCriterion("M008 <=", value, "m008");
            return (Criteria) this;
        }

        public Criteria andM008Like(String value) {
            addCriterion("M008 like", value, "m008");
            return (Criteria) this;
        }

        public Criteria andM008NotLike(String value) {
            addCriterion("M008 not like", value, "m008");
            return (Criteria) this;
        }

        public Criteria andM008In(List<String> values) {
            addCriterion("M008 in", values, "m008");
            return (Criteria) this;
        }

        public Criteria andM008NotIn(List<String> values) {
            addCriterion("M008 not in", values, "m008");
            return (Criteria) this;
        }

        public Criteria andM008Between(String value1, String value2) {
            addCriterion("M008 between", value1, value2, "m008");
            return (Criteria) this;
        }

        public Criteria andM008NotBetween(String value1, String value2) {
            addCriterion("M008 not between", value1, value2, "m008");
            return (Criteria) this;
        }

        public Criteria andM009IsNull() {
            addCriterion("M009 is null");
            return (Criteria) this;
        }

        public Criteria andM009IsNotNull() {
            addCriterion("M009 is not null");
            return (Criteria) this;
        }

        public Criteria andM009EqualTo(String value) {
            addCriterion("M009 =", value, "m009");
            return (Criteria) this;
        }

        public Criteria andM009NotEqualTo(String value) {
            addCriterion("M009 <>", value, "m009");
            return (Criteria) this;
        }

        public Criteria andM009GreaterThan(String value) {
            addCriterion("M009 >", value, "m009");
            return (Criteria) this;
        }

        public Criteria andM009GreaterThanOrEqualTo(String value) {
            addCriterion("M009 >=", value, "m009");
            return (Criteria) this;
        }

        public Criteria andM009LessThan(String value) {
            addCriterion("M009 <", value, "m009");
            return (Criteria) this;
        }

        public Criteria andM009LessThanOrEqualTo(String value) {
            addCriterion("M009 <=", value, "m009");
            return (Criteria) this;
        }

        public Criteria andM009Like(String value) {
            addCriterion("M009 like", value, "m009");
            return (Criteria) this;
        }

        public Criteria andM009NotLike(String value) {
            addCriterion("M009 not like", value, "m009");
            return (Criteria) this;
        }

        public Criteria andM009In(List<String> values) {
            addCriterion("M009 in", values, "m009");
            return (Criteria) this;
        }

        public Criteria andM009NotIn(List<String> values) {
            addCriterion("M009 not in", values, "m009");
            return (Criteria) this;
        }

        public Criteria andM009Between(String value1, String value2) {
            addCriterion("M009 between", value1, value2, "m009");
            return (Criteria) this;
        }

        public Criteria andM009NotBetween(String value1, String value2) {
            addCriterion("M009 not between", value1, value2, "m009");
            return (Criteria) this;
        }

        public Criteria andM010IsNull() {
            addCriterion("M010 is null");
            return (Criteria) this;
        }

        public Criteria andM010IsNotNull() {
            addCriterion("M010 is not null");
            return (Criteria) this;
        }

        public Criteria andM010EqualTo(String value) {
            addCriterion("M010 =", value, "m010");
            return (Criteria) this;
        }

        public Criteria andM010NotEqualTo(String value) {
            addCriterion("M010 <>", value, "m010");
            return (Criteria) this;
        }

        public Criteria andM010GreaterThan(String value) {
            addCriterion("M010 >", value, "m010");
            return (Criteria) this;
        }

        public Criteria andM010GreaterThanOrEqualTo(String value) {
            addCriterion("M010 >=", value, "m010");
            return (Criteria) this;
        }

        public Criteria andM010LessThan(String value) {
            addCriterion("M010 <", value, "m010");
            return (Criteria) this;
        }

        public Criteria andM010LessThanOrEqualTo(String value) {
            addCriterion("M010 <=", value, "m010");
            return (Criteria) this;
        }

        public Criteria andM010Like(String value) {
            addCriterion("M010 like", value, "m010");
            return (Criteria) this;
        }

        public Criteria andM010NotLike(String value) {
            addCriterion("M010 not like", value, "m010");
            return (Criteria) this;
        }

        public Criteria andM010In(List<String> values) {
            addCriterion("M010 in", values, "m010");
            return (Criteria) this;
        }

        public Criteria andM010NotIn(List<String> values) {
            addCriterion("M010 not in", values, "m010");
            return (Criteria) this;
        }

        public Criteria andM010Between(String value1, String value2) {
            addCriterion("M010 between", value1, value2, "m010");
            return (Criteria) this;
        }

        public Criteria andM010NotBetween(String value1, String value2) {
            addCriterion("M010 not between", value1, value2, "m010");
            return (Criteria) this;
        }

        public Criteria andM011IsNull() {
            addCriterion("M011 is null");
            return (Criteria) this;
        }

        public Criteria andM011IsNotNull() {
            addCriterion("M011 is not null");
            return (Criteria) this;
        }

        public Criteria andM011EqualTo(String value) {
            addCriterion("M011 =", value, "m011");
            return (Criteria) this;
        }

        public Criteria andM011NotEqualTo(String value) {
            addCriterion("M011 <>", value, "m011");
            return (Criteria) this;
        }

        public Criteria andM011GreaterThan(String value) {
            addCriterion("M011 >", value, "m011");
            return (Criteria) this;
        }

        public Criteria andM011GreaterThanOrEqualTo(String value) {
            addCriterion("M011 >=", value, "m011");
            return (Criteria) this;
        }

        public Criteria andM011LessThan(String value) {
            addCriterion("M011 <", value, "m011");
            return (Criteria) this;
        }

        public Criteria andM011LessThanOrEqualTo(String value) {
            addCriterion("M011 <=", value, "m011");
            return (Criteria) this;
        }

        public Criteria andM011Like(String value) {
            addCriterion("M011 like", value, "m011");
            return (Criteria) this;
        }

        public Criteria andM011NotLike(String value) {
            addCriterion("M011 not like", value, "m011");
            return (Criteria) this;
        }

        public Criteria andM011In(List<String> values) {
            addCriterion("M011 in", values, "m011");
            return (Criteria) this;
        }

        public Criteria andM011NotIn(List<String> values) {
            addCriterion("M011 not in", values, "m011");
            return (Criteria) this;
        }

        public Criteria andM011Between(String value1, String value2) {
            addCriterion("M011 between", value1, value2, "m011");
            return (Criteria) this;
        }

        public Criteria andM011NotBetween(String value1, String value2) {
            addCriterion("M011 not between", value1, value2, "m011");
            return (Criteria) this;
        }

        public Criteria andM012IsNull() {
            addCriterion("M012 is null");
            return (Criteria) this;
        }

        public Criteria andM012IsNotNull() {
            addCriterion("M012 is not null");
            return (Criteria) this;
        }

        public Criteria andM012EqualTo(String value) {
            addCriterion("M012 =", value, "m012");
            return (Criteria) this;
        }

        public Criteria andM012NotEqualTo(String value) {
            addCriterion("M012 <>", value, "m012");
            return (Criteria) this;
        }

        public Criteria andM012GreaterThan(String value) {
            addCriterion("M012 >", value, "m012");
            return (Criteria) this;
        }

        public Criteria andM012GreaterThanOrEqualTo(String value) {
            addCriterion("M012 >=", value, "m012");
            return (Criteria) this;
        }

        public Criteria andM012LessThan(String value) {
            addCriterion("M012 <", value, "m012");
            return (Criteria) this;
        }

        public Criteria andM012LessThanOrEqualTo(String value) {
            addCriterion("M012 <=", value, "m012");
            return (Criteria) this;
        }

        public Criteria andM012Like(String value) {
            addCriterion("M012 like", value, "m012");
            return (Criteria) this;
        }

        public Criteria andM012NotLike(String value) {
            addCriterion("M012 not like", value, "m012");
            return (Criteria) this;
        }

        public Criteria andM012In(List<String> values) {
            addCriterion("M012 in", values, "m012");
            return (Criteria) this;
        }

        public Criteria andM012NotIn(List<String> values) {
            addCriterion("M012 not in", values, "m012");
            return (Criteria) this;
        }

        public Criteria andM012Between(String value1, String value2) {
            addCriterion("M012 between", value1, value2, "m012");
            return (Criteria) this;
        }

        public Criteria andM012NotBetween(String value1, String value2) {
            addCriterion("M012 not between", value1, value2, "m012");
            return (Criteria) this;
        }

        public Criteria andM013IsNull() {
            addCriterion("M013 is null");
            return (Criteria) this;
        }

        public Criteria andM013IsNotNull() {
            addCriterion("M013 is not null");
            return (Criteria) this;
        }

        public Criteria andM013EqualTo(String value) {
            addCriterion("M013 =", value, "m013");
            return (Criteria) this;
        }

        public Criteria andM013NotEqualTo(String value) {
            addCriterion("M013 <>", value, "m013");
            return (Criteria) this;
        }

        public Criteria andM013GreaterThan(String value) {
            addCriterion("M013 >", value, "m013");
            return (Criteria) this;
        }

        public Criteria andM013GreaterThanOrEqualTo(String value) {
            addCriterion("M013 >=", value, "m013");
            return (Criteria) this;
        }

        public Criteria andM013LessThan(String value) {
            addCriterion("M013 <", value, "m013");
            return (Criteria) this;
        }

        public Criteria andM013LessThanOrEqualTo(String value) {
            addCriterion("M013 <=", value, "m013");
            return (Criteria) this;
        }

        public Criteria andM013Like(String value) {
            addCriterion("M013 like", value, "m013");
            return (Criteria) this;
        }

        public Criteria andM013NotLike(String value) {
            addCriterion("M013 not like", value, "m013");
            return (Criteria) this;
        }

        public Criteria andM013In(List<String> values) {
            addCriterion("M013 in", values, "m013");
            return (Criteria) this;
        }

        public Criteria andM013NotIn(List<String> values) {
            addCriterion("M013 not in", values, "m013");
            return (Criteria) this;
        }

        public Criteria andM013Between(String value1, String value2) {
            addCriterion("M013 between", value1, value2, "m013");
            return (Criteria) this;
        }

        public Criteria andM013NotBetween(String value1, String value2) {
            addCriterion("M013 not between", value1, value2, "m013");
            return (Criteria) this;
        }

        public Criteria andM014IsNull() {
            addCriterion("M014 is null");
            return (Criteria) this;
        }

        public Criteria andM014IsNotNull() {
            addCriterion("M014 is not null");
            return (Criteria) this;
        }

        public Criteria andM014EqualTo(String value) {
            addCriterion("M014 =", value, "m014");
            return (Criteria) this;
        }

        public Criteria andM014NotEqualTo(String value) {
            addCriterion("M014 <>", value, "m014");
            return (Criteria) this;
        }

        public Criteria andM014GreaterThan(String value) {
            addCriterion("M014 >", value, "m014");
            return (Criteria) this;
        }

        public Criteria andM014GreaterThanOrEqualTo(String value) {
            addCriterion("M014 >=", value, "m014");
            return (Criteria) this;
        }

        public Criteria andM014LessThan(String value) {
            addCriterion("M014 <", value, "m014");
            return (Criteria) this;
        }

        public Criteria andM014LessThanOrEqualTo(String value) {
            addCriterion("M014 <=", value, "m014");
            return (Criteria) this;
        }

        public Criteria andM014Like(String value) {
            addCriterion("M014 like", value, "m014");
            return (Criteria) this;
        }

        public Criteria andM014NotLike(String value) {
            addCriterion("M014 not like", value, "m014");
            return (Criteria) this;
        }

        public Criteria andM014In(List<String> values) {
            addCriterion("M014 in", values, "m014");
            return (Criteria) this;
        }

        public Criteria andM014NotIn(List<String> values) {
            addCriterion("M014 not in", values, "m014");
            return (Criteria) this;
        }

        public Criteria andM014Between(String value1, String value2) {
            addCriterion("M014 between", value1, value2, "m014");
            return (Criteria) this;
        }

        public Criteria andM014NotBetween(String value1, String value2) {
            addCriterion("M014 not between", value1, value2, "m014");
            return (Criteria) this;
        }

        public Criteria andM015IsNull() {
            addCriterion("M015 is null");
            return (Criteria) this;
        }

        public Criteria andM015IsNotNull() {
            addCriterion("M015 is not null");
            return (Criteria) this;
        }

        public Criteria andM015EqualTo(String value) {
            addCriterion("M015 =", value, "m015");
            return (Criteria) this;
        }

        public Criteria andM015NotEqualTo(String value) {
            addCriterion("M015 <>", value, "m015");
            return (Criteria) this;
        }

        public Criteria andM015GreaterThan(String value) {
            addCriterion("M015 >", value, "m015");
            return (Criteria) this;
        }

        public Criteria andM015GreaterThanOrEqualTo(String value) {
            addCriterion("M015 >=", value, "m015");
            return (Criteria) this;
        }

        public Criteria andM015LessThan(String value) {
            addCriterion("M015 <", value, "m015");
            return (Criteria) this;
        }

        public Criteria andM015LessThanOrEqualTo(String value) {
            addCriterion("M015 <=", value, "m015");
            return (Criteria) this;
        }

        public Criteria andM015Like(String value) {
            addCriterion("M015 like", value, "m015");
            return (Criteria) this;
        }

        public Criteria andM015NotLike(String value) {
            addCriterion("M015 not like", value, "m015");
            return (Criteria) this;
        }

        public Criteria andM015In(List<String> values) {
            addCriterion("M015 in", values, "m015");
            return (Criteria) this;
        }

        public Criteria andM015NotIn(List<String> values) {
            addCriterion("M015 not in", values, "m015");
            return (Criteria) this;
        }

        public Criteria andM015Between(String value1, String value2) {
            addCriterion("M015 between", value1, value2, "m015");
            return (Criteria) this;
        }

        public Criteria andM015NotBetween(String value1, String value2) {
            addCriterion("M015 not between", value1, value2, "m015");
            return (Criteria) this;
        }

        public Criteria andM016IsNull() {
            addCriterion("M016 is null");
            return (Criteria) this;
        }

        public Criteria andM016IsNotNull() {
            addCriterion("M016 is not null");
            return (Criteria) this;
        }

        public Criteria andM016EqualTo(String value) {
            addCriterion("M016 =", value, "m016");
            return (Criteria) this;
        }

        public Criteria andM016NotEqualTo(String value) {
            addCriterion("M016 <>", value, "m016");
            return (Criteria) this;
        }

        public Criteria andM016GreaterThan(String value) {
            addCriterion("M016 >", value, "m016");
            return (Criteria) this;
        }

        public Criteria andM016GreaterThanOrEqualTo(String value) {
            addCriterion("M016 >=", value, "m016");
            return (Criteria) this;
        }

        public Criteria andM016LessThan(String value) {
            addCriterion("M016 <", value, "m016");
            return (Criteria) this;
        }

        public Criteria andM016LessThanOrEqualTo(String value) {
            addCriterion("M016 <=", value, "m016");
            return (Criteria) this;
        }

        public Criteria andM016Like(String value) {
            addCriterion("M016 like", value, "m016");
            return (Criteria) this;
        }

        public Criteria andM016NotLike(String value) {
            addCriterion("M016 not like", value, "m016");
            return (Criteria) this;
        }

        public Criteria andM016In(List<String> values) {
            addCriterion("M016 in", values, "m016");
            return (Criteria) this;
        }

        public Criteria andM016NotIn(List<String> values) {
            addCriterion("M016 not in", values, "m016");
            return (Criteria) this;
        }

        public Criteria andM016Between(String value1, String value2) {
            addCriterion("M016 between", value1, value2, "m016");
            return (Criteria) this;
        }

        public Criteria andM016NotBetween(String value1, String value2) {
            addCriterion("M016 not between", value1, value2, "m016");
            return (Criteria) this;
        }

        public Criteria andM017IsNull() {
            addCriterion("M017 is null");
            return (Criteria) this;
        }

        public Criteria andM017IsNotNull() {
            addCriterion("M017 is not null");
            return (Criteria) this;
        }

        public Criteria andM017EqualTo(String value) {
            addCriterion("M017 =", value, "m017");
            return (Criteria) this;
        }

        public Criteria andM017NotEqualTo(String value) {
            addCriterion("M017 <>", value, "m017");
            return (Criteria) this;
        }

        public Criteria andM017GreaterThan(String value) {
            addCriterion("M017 >", value, "m017");
            return (Criteria) this;
        }

        public Criteria andM017GreaterThanOrEqualTo(String value) {
            addCriterion("M017 >=", value, "m017");
            return (Criteria) this;
        }

        public Criteria andM017LessThan(String value) {
            addCriterion("M017 <", value, "m017");
            return (Criteria) this;
        }

        public Criteria andM017LessThanOrEqualTo(String value) {
            addCriterion("M017 <=", value, "m017");
            return (Criteria) this;
        }

        public Criteria andM017Like(String value) {
            addCriterion("M017 like", value, "m017");
            return (Criteria) this;
        }

        public Criteria andM017NotLike(String value) {
            addCriterion("M017 not like", value, "m017");
            return (Criteria) this;
        }

        public Criteria andM017In(List<String> values) {
            addCriterion("M017 in", values, "m017");
            return (Criteria) this;
        }

        public Criteria andM017NotIn(List<String> values) {
            addCriterion("M017 not in", values, "m017");
            return (Criteria) this;
        }

        public Criteria andM017Between(String value1, String value2) {
            addCriterion("M017 between", value1, value2, "m017");
            return (Criteria) this;
        }

        public Criteria andM017NotBetween(String value1, String value2) {
            addCriterion("M017 not between", value1, value2, "m017");
            return (Criteria) this;
        }

        public Criteria andM018IsNull() {
            addCriterion("M018 is null");
            return (Criteria) this;
        }

        public Criteria andM018IsNotNull() {
            addCriterion("M018 is not null");
            return (Criteria) this;
        }

        public Criteria andM018EqualTo(String value) {
            addCriterion("M018 =", value, "m018");
            return (Criteria) this;
        }

        public Criteria andM018NotEqualTo(String value) {
            addCriterion("M018 <>", value, "m018");
            return (Criteria) this;
        }

        public Criteria andM018GreaterThan(String value) {
            addCriterion("M018 >", value, "m018");
            return (Criteria) this;
        }

        public Criteria andM018GreaterThanOrEqualTo(String value) {
            addCriterion("M018 >=", value, "m018");
            return (Criteria) this;
        }

        public Criteria andM018LessThan(String value) {
            addCriterion("M018 <", value, "m018");
            return (Criteria) this;
        }

        public Criteria andM018LessThanOrEqualTo(String value) {
            addCriterion("M018 <=", value, "m018");
            return (Criteria) this;
        }

        public Criteria andM018Like(String value) {
            addCriterion("M018 like", value, "m018");
            return (Criteria) this;
        }

        public Criteria andM018NotLike(String value) {
            addCriterion("M018 not like", value, "m018");
            return (Criteria) this;
        }

        public Criteria andM018In(List<String> values) {
            addCriterion("M018 in", values, "m018");
            return (Criteria) this;
        }

        public Criteria andM018NotIn(List<String> values) {
            addCriterion("M018 not in", values, "m018");
            return (Criteria) this;
        }

        public Criteria andM018Between(String value1, String value2) {
            addCriterion("M018 between", value1, value2, "m018");
            return (Criteria) this;
        }

        public Criteria andM018NotBetween(String value1, String value2) {
            addCriterion("M018 not between", value1, value2, "m018");
            return (Criteria) this;
        }

        public Criteria andM019IsNull() {
            addCriterion("M019 is null");
            return (Criteria) this;
        }

        public Criteria andM019IsNotNull() {
            addCriterion("M019 is not null");
            return (Criteria) this;
        }

        public Criteria andM019EqualTo(String value) {
            addCriterion("M019 =", value, "m019");
            return (Criteria) this;
        }

        public Criteria andM019NotEqualTo(String value) {
            addCriterion("M019 <>", value, "m019");
            return (Criteria) this;
        }

        public Criteria andM019GreaterThan(String value) {
            addCriterion("M019 >", value, "m019");
            return (Criteria) this;
        }

        public Criteria andM019GreaterThanOrEqualTo(String value) {
            addCriterion("M019 >=", value, "m019");
            return (Criteria) this;
        }

        public Criteria andM019LessThan(String value) {
            addCriterion("M019 <", value, "m019");
            return (Criteria) this;
        }

        public Criteria andM019LessThanOrEqualTo(String value) {
            addCriterion("M019 <=", value, "m019");
            return (Criteria) this;
        }

        public Criteria andM019Like(String value) {
            addCriterion("M019 like", value, "m019");
            return (Criteria) this;
        }

        public Criteria andM019NotLike(String value) {
            addCriterion("M019 not like", value, "m019");
            return (Criteria) this;
        }

        public Criteria andM019In(List<String> values) {
            addCriterion("M019 in", values, "m019");
            return (Criteria) this;
        }

        public Criteria andM019NotIn(List<String> values) {
            addCriterion("M019 not in", values, "m019");
            return (Criteria) this;
        }

        public Criteria andM019Between(String value1, String value2) {
            addCriterion("M019 between", value1, value2, "m019");
            return (Criteria) this;
        }

        public Criteria andM019NotBetween(String value1, String value2) {
            addCriterion("M019 not between", value1, value2, "m019");
            return (Criteria) this;
        }

        public Criteria andM020IsNull() {
            addCriterion("M020 is null");
            return (Criteria) this;
        }

        public Criteria andM020IsNotNull() {
            addCriterion("M020 is not null");
            return (Criteria) this;
        }

        public Criteria andM020EqualTo(String value) {
            addCriterion("M020 =", value, "m020");
            return (Criteria) this;
        }

        public Criteria andM020NotEqualTo(String value) {
            addCriterion("M020 <>", value, "m020");
            return (Criteria) this;
        }

        public Criteria andM020GreaterThan(String value) {
            addCriterion("M020 >", value, "m020");
            return (Criteria) this;
        }

        public Criteria andM020GreaterThanOrEqualTo(String value) {
            addCriterion("M020 >=", value, "m020");
            return (Criteria) this;
        }

        public Criteria andM020LessThan(String value) {
            addCriterion("M020 <", value, "m020");
            return (Criteria) this;
        }

        public Criteria andM020LessThanOrEqualTo(String value) {
            addCriterion("M020 <=", value, "m020");
            return (Criteria) this;
        }

        public Criteria andM020Like(String value) {
            addCriterion("M020 like", value, "m020");
            return (Criteria) this;
        }

        public Criteria andM020NotLike(String value) {
            addCriterion("M020 not like", value, "m020");
            return (Criteria) this;
        }

        public Criteria andM020In(List<String> values) {
            addCriterion("M020 in", values, "m020");
            return (Criteria) this;
        }

        public Criteria andM020NotIn(List<String> values) {
            addCriterion("M020 not in", values, "m020");
            return (Criteria) this;
        }

        public Criteria andM020Between(String value1, String value2) {
            addCriterion("M020 between", value1, value2, "m020");
            return (Criteria) this;
        }

        public Criteria andM020NotBetween(String value1, String value2) {
            addCriterion("M020 not between", value1, value2, "m020");
            return (Criteria) this;
        }

        public Criteria andM021IsNull() {
            addCriterion("M021 is null");
            return (Criteria) this;
        }

        public Criteria andM021IsNotNull() {
            addCriterion("M021 is not null");
            return (Criteria) this;
        }

        public Criteria andM021EqualTo(String value) {
            addCriterion("M021 =", value, "m021");
            return (Criteria) this;
        }

        public Criteria andM021NotEqualTo(String value) {
            addCriterion("M021 <>", value, "m021");
            return (Criteria) this;
        }

        public Criteria andM021GreaterThan(String value) {
            addCriterion("M021 >", value, "m021");
            return (Criteria) this;
        }

        public Criteria andM021GreaterThanOrEqualTo(String value) {
            addCriterion("M021 >=", value, "m021");
            return (Criteria) this;
        }

        public Criteria andM021LessThan(String value) {
            addCriterion("M021 <", value, "m021");
            return (Criteria) this;
        }

        public Criteria andM021LessThanOrEqualTo(String value) {
            addCriterion("M021 <=", value, "m021");
            return (Criteria) this;
        }

        public Criteria andM021Like(String value) {
            addCriterion("M021 like", value, "m021");
            return (Criteria) this;
        }

        public Criteria andM021NotLike(String value) {
            addCriterion("M021 not like", value, "m021");
            return (Criteria) this;
        }

        public Criteria andM021In(List<String> values) {
            addCriterion("M021 in", values, "m021");
            return (Criteria) this;
        }

        public Criteria andM021NotIn(List<String> values) {
            addCriterion("M021 not in", values, "m021");
            return (Criteria) this;
        }

        public Criteria andM021Between(String value1, String value2) {
            addCriterion("M021 between", value1, value2, "m021");
            return (Criteria) this;
        }

        public Criteria andM021NotBetween(String value1, String value2) {
            addCriterion("M021 not between", value1, value2, "m021");
            return (Criteria) this;
        }

        public Criteria andM022IsNull() {
            addCriterion("M022 is null");
            return (Criteria) this;
        }

        public Criteria andM022IsNotNull() {
            addCriterion("M022 is not null");
            return (Criteria) this;
        }

        public Criteria andM022EqualTo(String value) {
            addCriterion("M022 =", value, "m022");
            return (Criteria) this;
        }

        public Criteria andM022NotEqualTo(String value) {
            addCriterion("M022 <>", value, "m022");
            return (Criteria) this;
        }

        public Criteria andM022GreaterThan(String value) {
            addCriterion("M022 >", value, "m022");
            return (Criteria) this;
        }

        public Criteria andM022GreaterThanOrEqualTo(String value) {
            addCriterion("M022 >=", value, "m022");
            return (Criteria) this;
        }

        public Criteria andM022LessThan(String value) {
            addCriterion("M022 <", value, "m022");
            return (Criteria) this;
        }

        public Criteria andM022LessThanOrEqualTo(String value) {
            addCriterion("M022 <=", value, "m022");
            return (Criteria) this;
        }

        public Criteria andM022Like(String value) {
            addCriterion("M022 like", value, "m022");
            return (Criteria) this;
        }

        public Criteria andM022NotLike(String value) {
            addCriterion("M022 not like", value, "m022");
            return (Criteria) this;
        }

        public Criteria andM022In(List<String> values) {
            addCriterion("M022 in", values, "m022");
            return (Criteria) this;
        }

        public Criteria andM022NotIn(List<String> values) {
            addCriterion("M022 not in", values, "m022");
            return (Criteria) this;
        }

        public Criteria andM022Between(String value1, String value2) {
            addCriterion("M022 between", value1, value2, "m022");
            return (Criteria) this;
        }

        public Criteria andM022NotBetween(String value1, String value2) {
            addCriterion("M022 not between", value1, value2, "m022");
            return (Criteria) this;
        }

        public Criteria andM023IsNull() {
            addCriterion("M023 is null");
            return (Criteria) this;
        }

        public Criteria andM023IsNotNull() {
            addCriterion("M023 is not null");
            return (Criteria) this;
        }

        public Criteria andM023EqualTo(String value) {
            addCriterion("M023 =", value, "m023");
            return (Criteria) this;
        }

        public Criteria andM023NotEqualTo(String value) {
            addCriterion("M023 <>", value, "m023");
            return (Criteria) this;
        }

        public Criteria andM023GreaterThan(String value) {
            addCriterion("M023 >", value, "m023");
            return (Criteria) this;
        }

        public Criteria andM023GreaterThanOrEqualTo(String value) {
            addCriterion("M023 >=", value, "m023");
            return (Criteria) this;
        }

        public Criteria andM023LessThan(String value) {
            addCriterion("M023 <", value, "m023");
            return (Criteria) this;
        }

        public Criteria andM023LessThanOrEqualTo(String value) {
            addCriterion("M023 <=", value, "m023");
            return (Criteria) this;
        }

        public Criteria andM023Like(String value) {
            addCriterion("M023 like", value, "m023");
            return (Criteria) this;
        }

        public Criteria andM023NotLike(String value) {
            addCriterion("M023 not like", value, "m023");
            return (Criteria) this;
        }

        public Criteria andM023In(List<String> values) {
            addCriterion("M023 in", values, "m023");
            return (Criteria) this;
        }

        public Criteria andM023NotIn(List<String> values) {
            addCriterion("M023 not in", values, "m023");
            return (Criteria) this;
        }

        public Criteria andM023Between(String value1, String value2) {
            addCriterion("M023 between", value1, value2, "m023");
            return (Criteria) this;
        }

        public Criteria andM023NotBetween(String value1, String value2) {
            addCriterion("M023 not between", value1, value2, "m023");
            return (Criteria) this;
        }

        public Criteria andM024IsNull() {
            addCriterion("M024 is null");
            return (Criteria) this;
        }

        public Criteria andM024IsNotNull() {
            addCriterion("M024 is not null");
            return (Criteria) this;
        }

        public Criteria andM024EqualTo(String value) {
            addCriterion("M024 =", value, "m024");
            return (Criteria) this;
        }

        public Criteria andM024NotEqualTo(String value) {
            addCriterion("M024 <>", value, "m024");
            return (Criteria) this;
        }

        public Criteria andM024GreaterThan(String value) {
            addCriterion("M024 >", value, "m024");
            return (Criteria) this;
        }

        public Criteria andM024GreaterThanOrEqualTo(String value) {
            addCriterion("M024 >=", value, "m024");
            return (Criteria) this;
        }

        public Criteria andM024LessThan(String value) {
            addCriterion("M024 <", value, "m024");
            return (Criteria) this;
        }

        public Criteria andM024LessThanOrEqualTo(String value) {
            addCriterion("M024 <=", value, "m024");
            return (Criteria) this;
        }

        public Criteria andM024Like(String value) {
            addCriterion("M024 like", value, "m024");
            return (Criteria) this;
        }

        public Criteria andM024NotLike(String value) {
            addCriterion("M024 not like", value, "m024");
            return (Criteria) this;
        }

        public Criteria andM024In(List<String> values) {
            addCriterion("M024 in", values, "m024");
            return (Criteria) this;
        }

        public Criteria andM024NotIn(List<String> values) {
            addCriterion("M024 not in", values, "m024");
            return (Criteria) this;
        }

        public Criteria andM024Between(String value1, String value2) {
            addCriterion("M024 between", value1, value2, "m024");
            return (Criteria) this;
        }

        public Criteria andM024NotBetween(String value1, String value2) {
            addCriterion("M024 not between", value1, value2, "m024");
            return (Criteria) this;
        }

        public Criteria andM025IsNull() {
            addCriterion("M025 is null");
            return (Criteria) this;
        }

        public Criteria andM025IsNotNull() {
            addCriterion("M025 is not null");
            return (Criteria) this;
        }

        public Criteria andM025EqualTo(String value) {
            addCriterion("M025 =", value, "m025");
            return (Criteria) this;
        }

        public Criteria andM025NotEqualTo(String value) {
            addCriterion("M025 <>", value, "m025");
            return (Criteria) this;
        }

        public Criteria andM025GreaterThan(String value) {
            addCriterion("M025 >", value, "m025");
            return (Criteria) this;
        }

        public Criteria andM025GreaterThanOrEqualTo(String value) {
            addCriterion("M025 >=", value, "m025");
            return (Criteria) this;
        }

        public Criteria andM025LessThan(String value) {
            addCriterion("M025 <", value, "m025");
            return (Criteria) this;
        }

        public Criteria andM025LessThanOrEqualTo(String value) {
            addCriterion("M025 <=", value, "m025");
            return (Criteria) this;
        }

        public Criteria andM025Like(String value) {
            addCriterion("M025 like", value, "m025");
            return (Criteria) this;
        }

        public Criteria andM025NotLike(String value) {
            addCriterion("M025 not like", value, "m025");
            return (Criteria) this;
        }

        public Criteria andM025In(List<String> values) {
            addCriterion("M025 in", values, "m025");
            return (Criteria) this;
        }

        public Criteria andM025NotIn(List<String> values) {
            addCriterion("M025 not in", values, "m025");
            return (Criteria) this;
        }

        public Criteria andM025Between(String value1, String value2) {
            addCriterion("M025 between", value1, value2, "m025");
            return (Criteria) this;
        }

        public Criteria andM025NotBetween(String value1, String value2) {
            addCriterion("M025 not between", value1, value2, "m025");
            return (Criteria) this;
        }

        public Criteria andM026IsNull() {
            addCriterion("M026 is null");
            return (Criteria) this;
        }

        public Criteria andM026IsNotNull() {
            addCriterion("M026 is not null");
            return (Criteria) this;
        }

        public Criteria andM026EqualTo(String value) {
            addCriterion("M026 =", value, "m026");
            return (Criteria) this;
        }

        public Criteria andM026NotEqualTo(String value) {
            addCriterion("M026 <>", value, "m026");
            return (Criteria) this;
        }

        public Criteria andM026GreaterThan(String value) {
            addCriterion("M026 >", value, "m026");
            return (Criteria) this;
        }

        public Criteria andM026GreaterThanOrEqualTo(String value) {
            addCriterion("M026 >=", value, "m026");
            return (Criteria) this;
        }

        public Criteria andM026LessThan(String value) {
            addCriterion("M026 <", value, "m026");
            return (Criteria) this;
        }

        public Criteria andM026LessThanOrEqualTo(String value) {
            addCriterion("M026 <=", value, "m026");
            return (Criteria) this;
        }

        public Criteria andM026Like(String value) {
            addCriterion("M026 like", value, "m026");
            return (Criteria) this;
        }

        public Criteria andM026NotLike(String value) {
            addCriterion("M026 not like", value, "m026");
            return (Criteria) this;
        }

        public Criteria andM026In(List<String> values) {
            addCriterion("M026 in", values, "m026");
            return (Criteria) this;
        }

        public Criteria andM026NotIn(List<String> values) {
            addCriterion("M026 not in", values, "m026");
            return (Criteria) this;
        }

        public Criteria andM026Between(String value1, String value2) {
            addCriterion("M026 between", value1, value2, "m026");
            return (Criteria) this;
        }

        public Criteria andM026NotBetween(String value1, String value2) {
            addCriterion("M026 not between", value1, value2, "m026");
            return (Criteria) this;
        }

        public Criteria andM027IsNull() {
            addCriterion("M027 is null");
            return (Criteria) this;
        }

        public Criteria andM027IsNotNull() {
            addCriterion("M027 is not null");
            return (Criteria) this;
        }

        public Criteria andM027EqualTo(String value) {
            addCriterion("M027 =", value, "m027");
            return (Criteria) this;
        }

        public Criteria andM027NotEqualTo(String value) {
            addCriterion("M027 <>", value, "m027");
            return (Criteria) this;
        }

        public Criteria andM027GreaterThan(String value) {
            addCriterion("M027 >", value, "m027");
            return (Criteria) this;
        }

        public Criteria andM027GreaterThanOrEqualTo(String value) {
            addCriterion("M027 >=", value, "m027");
            return (Criteria) this;
        }

        public Criteria andM027LessThan(String value) {
            addCriterion("M027 <", value, "m027");
            return (Criteria) this;
        }

        public Criteria andM027LessThanOrEqualTo(String value) {
            addCriterion("M027 <=", value, "m027");
            return (Criteria) this;
        }

        public Criteria andM027Like(String value) {
            addCriterion("M027 like", value, "m027");
            return (Criteria) this;
        }

        public Criteria andM027NotLike(String value) {
            addCriterion("M027 not like", value, "m027");
            return (Criteria) this;
        }

        public Criteria andM027In(List<String> values) {
            addCriterion("M027 in", values, "m027");
            return (Criteria) this;
        }

        public Criteria andM027NotIn(List<String> values) {
            addCriterion("M027 not in", values, "m027");
            return (Criteria) this;
        }

        public Criteria andM027Between(String value1, String value2) {
            addCriterion("M027 between", value1, value2, "m027");
            return (Criteria) this;
        }

        public Criteria andM027NotBetween(String value1, String value2) {
            addCriterion("M027 not between", value1, value2, "m027");
            return (Criteria) this;
        }

        public Criteria andM028IsNull() {
            addCriterion("M028 is null");
            return (Criteria) this;
        }

        public Criteria andM028IsNotNull() {
            addCriterion("M028 is not null");
            return (Criteria) this;
        }

        public Criteria andM028EqualTo(String value) {
            addCriterion("M028 =", value, "m028");
            return (Criteria) this;
        }

        public Criteria andM028NotEqualTo(String value) {
            addCriterion("M028 <>", value, "m028");
            return (Criteria) this;
        }

        public Criteria andM028GreaterThan(String value) {
            addCriterion("M028 >", value, "m028");
            return (Criteria) this;
        }

        public Criteria andM028GreaterThanOrEqualTo(String value) {
            addCriterion("M028 >=", value, "m028");
            return (Criteria) this;
        }

        public Criteria andM028LessThan(String value) {
            addCriterion("M028 <", value, "m028");
            return (Criteria) this;
        }

        public Criteria andM028LessThanOrEqualTo(String value) {
            addCriterion("M028 <=", value, "m028");
            return (Criteria) this;
        }

        public Criteria andM028Like(String value) {
            addCriterion("M028 like", value, "m028");
            return (Criteria) this;
        }

        public Criteria andM028NotLike(String value) {
            addCriterion("M028 not like", value, "m028");
            return (Criteria) this;
        }

        public Criteria andM028In(List<String> values) {
            addCriterion("M028 in", values, "m028");
            return (Criteria) this;
        }

        public Criteria andM028NotIn(List<String> values) {
            addCriterion("M028 not in", values, "m028");
            return (Criteria) this;
        }

        public Criteria andM028Between(String value1, String value2) {
            addCriterion("M028 between", value1, value2, "m028");
            return (Criteria) this;
        }

        public Criteria andM028NotBetween(String value1, String value2) {
            addCriterion("M028 not between", value1, value2, "m028");
            return (Criteria) this;
        }

        public Criteria andM029IsNull() {
            addCriterion("M029 is null");
            return (Criteria) this;
        }

        public Criteria andM029IsNotNull() {
            addCriterion("M029 is not null");
            return (Criteria) this;
        }

        public Criteria andM029EqualTo(String value) {
            addCriterion("M029 =", value, "m029");
            return (Criteria) this;
        }

        public Criteria andM029NotEqualTo(String value) {
            addCriterion("M029 <>", value, "m029");
            return (Criteria) this;
        }

        public Criteria andM029GreaterThan(String value) {
            addCriterion("M029 >", value, "m029");
            return (Criteria) this;
        }

        public Criteria andM029GreaterThanOrEqualTo(String value) {
            addCriterion("M029 >=", value, "m029");
            return (Criteria) this;
        }

        public Criteria andM029LessThan(String value) {
            addCriterion("M029 <", value, "m029");
            return (Criteria) this;
        }

        public Criteria andM029LessThanOrEqualTo(String value) {
            addCriterion("M029 <=", value, "m029");
            return (Criteria) this;
        }

        public Criteria andM029Like(String value) {
            addCriterion("M029 like", value, "m029");
            return (Criteria) this;
        }

        public Criteria andM029NotLike(String value) {
            addCriterion("M029 not like", value, "m029");
            return (Criteria) this;
        }

        public Criteria andM029In(List<String> values) {
            addCriterion("M029 in", values, "m029");
            return (Criteria) this;
        }

        public Criteria andM029NotIn(List<String> values) {
            addCriterion("M029 not in", values, "m029");
            return (Criteria) this;
        }

        public Criteria andM029Between(String value1, String value2) {
            addCriterion("M029 between", value1, value2, "m029");
            return (Criteria) this;
        }

        public Criteria andM029NotBetween(String value1, String value2) {
            addCriterion("M029 not between", value1, value2, "m029");
            return (Criteria) this;
        }

        public Criteria andM030IsNull() {
            addCriterion("M030 is null");
            return (Criteria) this;
        }

        public Criteria andM030IsNotNull() {
            addCriterion("M030 is not null");
            return (Criteria) this;
        }

        public Criteria andM030EqualTo(String value) {
            addCriterion("M030 =", value, "m030");
            return (Criteria) this;
        }

        public Criteria andM030NotEqualTo(String value) {
            addCriterion("M030 <>", value, "m030");
            return (Criteria) this;
        }

        public Criteria andM030GreaterThan(String value) {
            addCriterion("M030 >", value, "m030");
            return (Criteria) this;
        }

        public Criteria andM030GreaterThanOrEqualTo(String value) {
            addCriterion("M030 >=", value, "m030");
            return (Criteria) this;
        }

        public Criteria andM030LessThan(String value) {
            addCriterion("M030 <", value, "m030");
            return (Criteria) this;
        }

        public Criteria andM030LessThanOrEqualTo(String value) {
            addCriterion("M030 <=", value, "m030");
            return (Criteria) this;
        }

        public Criteria andM030Like(String value) {
            addCriterion("M030 like", value, "m030");
            return (Criteria) this;
        }

        public Criteria andM030NotLike(String value) {
            addCriterion("M030 not like", value, "m030");
            return (Criteria) this;
        }

        public Criteria andM030In(List<String> values) {
            addCriterion("M030 in", values, "m030");
            return (Criteria) this;
        }

        public Criteria andM030NotIn(List<String> values) {
            addCriterion("M030 not in", values, "m030");
            return (Criteria) this;
        }

        public Criteria andM030Between(String value1, String value2) {
            addCriterion("M030 between", value1, value2, "m030");
            return (Criteria) this;
        }

        public Criteria andM030NotBetween(String value1, String value2) {
            addCriterion("M030 not between", value1, value2, "m030");
            return (Criteria) this;
        }

        public Criteria andM031IsNull() {
            addCriterion("M031 is null");
            return (Criteria) this;
        }

        public Criteria andM031IsNotNull() {
            addCriterion("M031 is not null");
            return (Criteria) this;
        }

        public Criteria andM031EqualTo(String value) {
            addCriterion("M031 =", value, "m031");
            return (Criteria) this;
        }

        public Criteria andM031NotEqualTo(String value) {
            addCriterion("M031 <>", value, "m031");
            return (Criteria) this;
        }

        public Criteria andM031GreaterThan(String value) {
            addCriterion("M031 >", value, "m031");
            return (Criteria) this;
        }

        public Criteria andM031GreaterThanOrEqualTo(String value) {
            addCriterion("M031 >=", value, "m031");
            return (Criteria) this;
        }

        public Criteria andM031LessThan(String value) {
            addCriterion("M031 <", value, "m031");
            return (Criteria) this;
        }

        public Criteria andM031LessThanOrEqualTo(String value) {
            addCriterion("M031 <=", value, "m031");
            return (Criteria) this;
        }

        public Criteria andM031Like(String value) {
            addCriterion("M031 like", value, "m031");
            return (Criteria) this;
        }

        public Criteria andM031NotLike(String value) {
            addCriterion("M031 not like", value, "m031");
            return (Criteria) this;
        }

        public Criteria andM031In(List<String> values) {
            addCriterion("M031 in", values, "m031");
            return (Criteria) this;
        }

        public Criteria andM031NotIn(List<String> values) {
            addCriterion("M031 not in", values, "m031");
            return (Criteria) this;
        }

        public Criteria andM031Between(String value1, String value2) {
            addCriterion("M031 between", value1, value2, "m031");
            return (Criteria) this;
        }

        public Criteria andM031NotBetween(String value1, String value2) {
            addCriterion("M031 not between", value1, value2, "m031");
            return (Criteria) this;
        }

        public Criteria andM032IsNull() {
            addCriterion("M032 is null");
            return (Criteria) this;
        }

        public Criteria andM032IsNotNull() {
            addCriterion("M032 is not null");
            return (Criteria) this;
        }

        public Criteria andM032EqualTo(String value) {
            addCriterion("M032 =", value, "m032");
            return (Criteria) this;
        }

        public Criteria andM032NotEqualTo(String value) {
            addCriterion("M032 <>", value, "m032");
            return (Criteria) this;
        }

        public Criteria andM032GreaterThan(String value) {
            addCriterion("M032 >", value, "m032");
            return (Criteria) this;
        }

        public Criteria andM032GreaterThanOrEqualTo(String value) {
            addCriterion("M032 >=", value, "m032");
            return (Criteria) this;
        }

        public Criteria andM032LessThan(String value) {
            addCriterion("M032 <", value, "m032");
            return (Criteria) this;
        }

        public Criteria andM032LessThanOrEqualTo(String value) {
            addCriterion("M032 <=", value, "m032");
            return (Criteria) this;
        }

        public Criteria andM032Like(String value) {
            addCriterion("M032 like", value, "m032");
            return (Criteria) this;
        }

        public Criteria andM032NotLike(String value) {
            addCriterion("M032 not like", value, "m032");
            return (Criteria) this;
        }

        public Criteria andM032In(List<String> values) {
            addCriterion("M032 in", values, "m032");
            return (Criteria) this;
        }

        public Criteria andM032NotIn(List<String> values) {
            addCriterion("M032 not in", values, "m032");
            return (Criteria) this;
        }

        public Criteria andM032Between(String value1, String value2) {
            addCriterion("M032 between", value1, value2, "m032");
            return (Criteria) this;
        }

        public Criteria andM032NotBetween(String value1, String value2) {
            addCriterion("M032 not between", value1, value2, "m032");
            return (Criteria) this;
        }

        public Criteria andM033IsNull() {
            addCriterion("M033 is null");
            return (Criteria) this;
        }

        public Criteria andM033IsNotNull() {
            addCriterion("M033 is not null");
            return (Criteria) this;
        }

        public Criteria andM033EqualTo(String value) {
            addCriterion("M033 =", value, "m033");
            return (Criteria) this;
        }

        public Criteria andM033NotEqualTo(String value) {
            addCriterion("M033 <>", value, "m033");
            return (Criteria) this;
        }

        public Criteria andM033GreaterThan(String value) {
            addCriterion("M033 >", value, "m033");
            return (Criteria) this;
        }

        public Criteria andM033GreaterThanOrEqualTo(String value) {
            addCriterion("M033 >=", value, "m033");
            return (Criteria) this;
        }

        public Criteria andM033LessThan(String value) {
            addCriterion("M033 <", value, "m033");
            return (Criteria) this;
        }

        public Criteria andM033LessThanOrEqualTo(String value) {
            addCriterion("M033 <=", value, "m033");
            return (Criteria) this;
        }

        public Criteria andM033Like(String value) {
            addCriterion("M033 like", value, "m033");
            return (Criteria) this;
        }

        public Criteria andM033NotLike(String value) {
            addCriterion("M033 not like", value, "m033");
            return (Criteria) this;
        }

        public Criteria andM033In(List<String> values) {
            addCriterion("M033 in", values, "m033");
            return (Criteria) this;
        }

        public Criteria andM033NotIn(List<String> values) {
            addCriterion("M033 not in", values, "m033");
            return (Criteria) this;
        }

        public Criteria andM033Between(String value1, String value2) {
            addCriterion("M033 between", value1, value2, "m033");
            return (Criteria) this;
        }

        public Criteria andM033NotBetween(String value1, String value2) {
            addCriterion("M033 not between", value1, value2, "m033");
            return (Criteria) this;
        }

        public Criteria andM034IsNull() {
            addCriterion("M034 is null");
            return (Criteria) this;
        }

        public Criteria andM034IsNotNull() {
            addCriterion("M034 is not null");
            return (Criteria) this;
        }

        public Criteria andM034EqualTo(String value) {
            addCriterion("M034 =", value, "m034");
            return (Criteria) this;
        }

        public Criteria andM034NotEqualTo(String value) {
            addCriterion("M034 <>", value, "m034");
            return (Criteria) this;
        }

        public Criteria andM034GreaterThan(String value) {
            addCriterion("M034 >", value, "m034");
            return (Criteria) this;
        }

        public Criteria andM034GreaterThanOrEqualTo(String value) {
            addCriterion("M034 >=", value, "m034");
            return (Criteria) this;
        }

        public Criteria andM034LessThan(String value) {
            addCriterion("M034 <", value, "m034");
            return (Criteria) this;
        }

        public Criteria andM034LessThanOrEqualTo(String value) {
            addCriterion("M034 <=", value, "m034");
            return (Criteria) this;
        }

        public Criteria andM034Like(String value) {
            addCriterion("M034 like", value, "m034");
            return (Criteria) this;
        }

        public Criteria andM034NotLike(String value) {
            addCriterion("M034 not like", value, "m034");
            return (Criteria) this;
        }

        public Criteria andM034In(List<String> values) {
            addCriterion("M034 in", values, "m034");
            return (Criteria) this;
        }

        public Criteria andM034NotIn(List<String> values) {
            addCriterion("M034 not in", values, "m034");
            return (Criteria) this;
        }

        public Criteria andM034Between(String value1, String value2) {
            addCriterion("M034 between", value1, value2, "m034");
            return (Criteria) this;
        }

        public Criteria andM034NotBetween(String value1, String value2) {
            addCriterion("M034 not between", value1, value2, "m034");
            return (Criteria) this;
        }

        public Criteria andM035IsNull() {
            addCriterion("M035 is null");
            return (Criteria) this;
        }

        public Criteria andM035IsNotNull() {
            addCriterion("M035 is not null");
            return (Criteria) this;
        }

        public Criteria andM035EqualTo(String value) {
            addCriterion("M035 =", value, "m035");
            return (Criteria) this;
        }

        public Criteria andM035NotEqualTo(String value) {
            addCriterion("M035 <>", value, "m035");
            return (Criteria) this;
        }

        public Criteria andM035GreaterThan(String value) {
            addCriterion("M035 >", value, "m035");
            return (Criteria) this;
        }

        public Criteria andM035GreaterThanOrEqualTo(String value) {
            addCriterion("M035 >=", value, "m035");
            return (Criteria) this;
        }

        public Criteria andM035LessThan(String value) {
            addCriterion("M035 <", value, "m035");
            return (Criteria) this;
        }

        public Criteria andM035LessThanOrEqualTo(String value) {
            addCriterion("M035 <=", value, "m035");
            return (Criteria) this;
        }

        public Criteria andM035Like(String value) {
            addCriterion("M035 like", value, "m035");
            return (Criteria) this;
        }

        public Criteria andM035NotLike(String value) {
            addCriterion("M035 not like", value, "m035");
            return (Criteria) this;
        }

        public Criteria andM035In(List<String> values) {
            addCriterion("M035 in", values, "m035");
            return (Criteria) this;
        }

        public Criteria andM035NotIn(List<String> values) {
            addCriterion("M035 not in", values, "m035");
            return (Criteria) this;
        }

        public Criteria andM035Between(String value1, String value2) {
            addCriterion("M035 between", value1, value2, "m035");
            return (Criteria) this;
        }

        public Criteria andM035NotBetween(String value1, String value2) {
            addCriterion("M035 not between", value1, value2, "m035");
            return (Criteria) this;
        }

        public Criteria andM036IsNull() {
            addCriterion("M036 is null");
            return (Criteria) this;
        }

        public Criteria andM036IsNotNull() {
            addCriterion("M036 is not null");
            return (Criteria) this;
        }

        public Criteria andM036EqualTo(String value) {
            addCriterion("M036 =", value, "m036");
            return (Criteria) this;
        }

        public Criteria andM036NotEqualTo(String value) {
            addCriterion("M036 <>", value, "m036");
            return (Criteria) this;
        }

        public Criteria andM036GreaterThan(String value) {
            addCriterion("M036 >", value, "m036");
            return (Criteria) this;
        }

        public Criteria andM036GreaterThanOrEqualTo(String value) {
            addCriterion("M036 >=", value, "m036");
            return (Criteria) this;
        }

        public Criteria andM036LessThan(String value) {
            addCriterion("M036 <", value, "m036");
            return (Criteria) this;
        }

        public Criteria andM036LessThanOrEqualTo(String value) {
            addCriterion("M036 <=", value, "m036");
            return (Criteria) this;
        }

        public Criteria andM036Like(String value) {
            addCriterion("M036 like", value, "m036");
            return (Criteria) this;
        }

        public Criteria andM036NotLike(String value) {
            addCriterion("M036 not like", value, "m036");
            return (Criteria) this;
        }

        public Criteria andM036In(List<String> values) {
            addCriterion("M036 in", values, "m036");
            return (Criteria) this;
        }

        public Criteria andM036NotIn(List<String> values) {
            addCriterion("M036 not in", values, "m036");
            return (Criteria) this;
        }

        public Criteria andM036Between(String value1, String value2) {
            addCriterion("M036 between", value1, value2, "m036");
            return (Criteria) this;
        }

        public Criteria andM036NotBetween(String value1, String value2) {
            addCriterion("M036 not between", value1, value2, "m036");
            return (Criteria) this;
        }

        public Criteria andM037IsNull() {
            addCriterion("M037 is null");
            return (Criteria) this;
        }

        public Criteria andM037IsNotNull() {
            addCriterion("M037 is not null");
            return (Criteria) this;
        }

        public Criteria andM037EqualTo(String value) {
            addCriterion("M037 =", value, "m037");
            return (Criteria) this;
        }

        public Criteria andM037NotEqualTo(String value) {
            addCriterion("M037 <>", value, "m037");
            return (Criteria) this;
        }

        public Criteria andM037GreaterThan(String value) {
            addCriterion("M037 >", value, "m037");
            return (Criteria) this;
        }

        public Criteria andM037GreaterThanOrEqualTo(String value) {
            addCriterion("M037 >=", value, "m037");
            return (Criteria) this;
        }

        public Criteria andM037LessThan(String value) {
            addCriterion("M037 <", value, "m037");
            return (Criteria) this;
        }

        public Criteria andM037LessThanOrEqualTo(String value) {
            addCriterion("M037 <=", value, "m037");
            return (Criteria) this;
        }

        public Criteria andM037Like(String value) {
            addCriterion("M037 like", value, "m037");
            return (Criteria) this;
        }

        public Criteria andM037NotLike(String value) {
            addCriterion("M037 not like", value, "m037");
            return (Criteria) this;
        }

        public Criteria andM037In(List<String> values) {
            addCriterion("M037 in", values, "m037");
            return (Criteria) this;
        }

        public Criteria andM037NotIn(List<String> values) {
            addCriterion("M037 not in", values, "m037");
            return (Criteria) this;
        }

        public Criteria andM037Between(String value1, String value2) {
            addCriterion("M037 between", value1, value2, "m037");
            return (Criteria) this;
        }

        public Criteria andM037NotBetween(String value1, String value2) {
            addCriterion("M037 not between", value1, value2, "m037");
            return (Criteria) this;
        }

        public Criteria andM038IsNull() {
            addCriterion("M038 is null");
            return (Criteria) this;
        }

        public Criteria andM038IsNotNull() {
            addCriterion("M038 is not null");
            return (Criteria) this;
        }

        public Criteria andM038EqualTo(String value) {
            addCriterion("M038 =", value, "m038");
            return (Criteria) this;
        }

        public Criteria andM038NotEqualTo(String value) {
            addCriterion("M038 <>", value, "m038");
            return (Criteria) this;
        }

        public Criteria andM038GreaterThan(String value) {
            addCriterion("M038 >", value, "m038");
            return (Criteria) this;
        }

        public Criteria andM038GreaterThanOrEqualTo(String value) {
            addCriterion("M038 >=", value, "m038");
            return (Criteria) this;
        }

        public Criteria andM038LessThan(String value) {
            addCriterion("M038 <", value, "m038");
            return (Criteria) this;
        }

        public Criteria andM038LessThanOrEqualTo(String value) {
            addCriterion("M038 <=", value, "m038");
            return (Criteria) this;
        }

        public Criteria andM038Like(String value) {
            addCriterion("M038 like", value, "m038");
            return (Criteria) this;
        }

        public Criteria andM038NotLike(String value) {
            addCriterion("M038 not like", value, "m038");
            return (Criteria) this;
        }

        public Criteria andM038In(List<String> values) {
            addCriterion("M038 in", values, "m038");
            return (Criteria) this;
        }

        public Criteria andM038NotIn(List<String> values) {
            addCriterion("M038 not in", values, "m038");
            return (Criteria) this;
        }

        public Criteria andM038Between(String value1, String value2) {
            addCriterion("M038 between", value1, value2, "m038");
            return (Criteria) this;
        }

        public Criteria andM038NotBetween(String value1, String value2) {
            addCriterion("M038 not between", value1, value2, "m038");
            return (Criteria) this;
        }

        public Criteria andM039IsNull() {
            addCriterion("M039 is null");
            return (Criteria) this;
        }

        public Criteria andM039IsNotNull() {
            addCriterion("M039 is not null");
            return (Criteria) this;
        }

        public Criteria andM039EqualTo(String value) {
            addCriterion("M039 =", value, "m039");
            return (Criteria) this;
        }

        public Criteria andM039NotEqualTo(String value) {
            addCriterion("M039 <>", value, "m039");
            return (Criteria) this;
        }

        public Criteria andM039GreaterThan(String value) {
            addCriterion("M039 >", value, "m039");
            return (Criteria) this;
        }

        public Criteria andM039GreaterThanOrEqualTo(String value) {
            addCriterion("M039 >=", value, "m039");
            return (Criteria) this;
        }

        public Criteria andM039LessThan(String value) {
            addCriterion("M039 <", value, "m039");
            return (Criteria) this;
        }

        public Criteria andM039LessThanOrEqualTo(String value) {
            addCriterion("M039 <=", value, "m039");
            return (Criteria) this;
        }

        public Criteria andM039Like(String value) {
            addCriterion("M039 like", value, "m039");
            return (Criteria) this;
        }

        public Criteria andM039NotLike(String value) {
            addCriterion("M039 not like", value, "m039");
            return (Criteria) this;
        }

        public Criteria andM039In(List<String> values) {
            addCriterion("M039 in", values, "m039");
            return (Criteria) this;
        }

        public Criteria andM039NotIn(List<String> values) {
            addCriterion("M039 not in", values, "m039");
            return (Criteria) this;
        }

        public Criteria andM039Between(String value1, String value2) {
            addCriterion("M039 between", value1, value2, "m039");
            return (Criteria) this;
        }

        public Criteria andM039NotBetween(String value1, String value2) {
            addCriterion("M039 not between", value1, value2, "m039");
            return (Criteria) this;
        }

        public Criteria andM040IsNull() {
            addCriterion("M040 is null");
            return (Criteria) this;
        }

        public Criteria andM040IsNotNull() {
            addCriterion("M040 is not null");
            return (Criteria) this;
        }

        public Criteria andM040EqualTo(String value) {
            addCriterion("M040 =", value, "m040");
            return (Criteria) this;
        }

        public Criteria andM040NotEqualTo(String value) {
            addCriterion("M040 <>", value, "m040");
            return (Criteria) this;
        }

        public Criteria andM040GreaterThan(String value) {
            addCriterion("M040 >", value, "m040");
            return (Criteria) this;
        }

        public Criteria andM040GreaterThanOrEqualTo(String value) {
            addCriterion("M040 >=", value, "m040");
            return (Criteria) this;
        }

        public Criteria andM040LessThan(String value) {
            addCriterion("M040 <", value, "m040");
            return (Criteria) this;
        }

        public Criteria andM040LessThanOrEqualTo(String value) {
            addCriterion("M040 <=", value, "m040");
            return (Criteria) this;
        }

        public Criteria andM040Like(String value) {
            addCriterion("M040 like", value, "m040");
            return (Criteria) this;
        }

        public Criteria andM040NotLike(String value) {
            addCriterion("M040 not like", value, "m040");
            return (Criteria) this;
        }

        public Criteria andM040In(List<String> values) {
            addCriterion("M040 in", values, "m040");
            return (Criteria) this;
        }

        public Criteria andM040NotIn(List<String> values) {
            addCriterion("M040 not in", values, "m040");
            return (Criteria) this;
        }

        public Criteria andM040Between(String value1, String value2) {
            addCriterion("M040 between", value1, value2, "m040");
            return (Criteria) this;
        }

        public Criteria andM040NotBetween(String value1, String value2) {
            addCriterion("M040 not between", value1, value2, "m040");
            return (Criteria) this;
        }

        public Criteria andM041IsNull() {
            addCriterion("M041 is null");
            return (Criteria) this;
        }

        public Criteria andM041IsNotNull() {
            addCriterion("M041 is not null");
            return (Criteria) this;
        }

        public Criteria andM041EqualTo(String value) {
            addCriterion("M041 =", value, "m041");
            return (Criteria) this;
        }

        public Criteria andM041NotEqualTo(String value) {
            addCriterion("M041 <>", value, "m041");
            return (Criteria) this;
        }

        public Criteria andM041GreaterThan(String value) {
            addCriterion("M041 >", value, "m041");
            return (Criteria) this;
        }

        public Criteria andM041GreaterThanOrEqualTo(String value) {
            addCriterion("M041 >=", value, "m041");
            return (Criteria) this;
        }

        public Criteria andM041LessThan(String value) {
            addCriterion("M041 <", value, "m041");
            return (Criteria) this;
        }

        public Criteria andM041LessThanOrEqualTo(String value) {
            addCriterion("M041 <=", value, "m041");
            return (Criteria) this;
        }

        public Criteria andM041Like(String value) {
            addCriterion("M041 like", value, "m041");
            return (Criteria) this;
        }

        public Criteria andM041NotLike(String value) {
            addCriterion("M041 not like", value, "m041");
            return (Criteria) this;
        }

        public Criteria andM041In(List<String> values) {
            addCriterion("M041 in", values, "m041");
            return (Criteria) this;
        }

        public Criteria andM041NotIn(List<String> values) {
            addCriterion("M041 not in", values, "m041");
            return (Criteria) this;
        }

        public Criteria andM041Between(String value1, String value2) {
            addCriterion("M041 between", value1, value2, "m041");
            return (Criteria) this;
        }

        public Criteria andM041NotBetween(String value1, String value2) {
            addCriterion("M041 not between", value1, value2, "m041");
            return (Criteria) this;
        }

        public Criteria andM042IsNull() {
            addCriterion("M042 is null");
            return (Criteria) this;
        }

        public Criteria andM042IsNotNull() {
            addCriterion("M042 is not null");
            return (Criteria) this;
        }

        public Criteria andM042EqualTo(String value) {
            addCriterion("M042 =", value, "m042");
            return (Criteria) this;
        }

        public Criteria andM042NotEqualTo(String value) {
            addCriterion("M042 <>", value, "m042");
            return (Criteria) this;
        }

        public Criteria andM042GreaterThan(String value) {
            addCriterion("M042 >", value, "m042");
            return (Criteria) this;
        }

        public Criteria andM042GreaterThanOrEqualTo(String value) {
            addCriterion("M042 >=", value, "m042");
            return (Criteria) this;
        }

        public Criteria andM042LessThan(String value) {
            addCriterion("M042 <", value, "m042");
            return (Criteria) this;
        }

        public Criteria andM042LessThanOrEqualTo(String value) {
            addCriterion("M042 <=", value, "m042");
            return (Criteria) this;
        }

        public Criteria andM042Like(String value) {
            addCriterion("M042 like", value, "m042");
            return (Criteria) this;
        }

        public Criteria andM042NotLike(String value) {
            addCriterion("M042 not like", value, "m042");
            return (Criteria) this;
        }

        public Criteria andM042In(List<String> values) {
            addCriterion("M042 in", values, "m042");
            return (Criteria) this;
        }

        public Criteria andM042NotIn(List<String> values) {
            addCriterion("M042 not in", values, "m042");
            return (Criteria) this;
        }

        public Criteria andM042Between(String value1, String value2) {
            addCriterion("M042 between", value1, value2, "m042");
            return (Criteria) this;
        }

        public Criteria andM042NotBetween(String value1, String value2) {
            addCriterion("M042 not between", value1, value2, "m042");
            return (Criteria) this;
        }

        public Criteria andM043IsNull() {
            addCriterion("M043 is null");
            return (Criteria) this;
        }

        public Criteria andM043IsNotNull() {
            addCriterion("M043 is not null");
            return (Criteria) this;
        }

        public Criteria andM043EqualTo(String value) {
            addCriterion("M043 =", value, "m043");
            return (Criteria) this;
        }

        public Criteria andM043NotEqualTo(String value) {
            addCriterion("M043 <>", value, "m043");
            return (Criteria) this;
        }

        public Criteria andM043GreaterThan(String value) {
            addCriterion("M043 >", value, "m043");
            return (Criteria) this;
        }

        public Criteria andM043GreaterThanOrEqualTo(String value) {
            addCriterion("M043 >=", value, "m043");
            return (Criteria) this;
        }

        public Criteria andM043LessThan(String value) {
            addCriterion("M043 <", value, "m043");
            return (Criteria) this;
        }

        public Criteria andM043LessThanOrEqualTo(String value) {
            addCriterion("M043 <=", value, "m043");
            return (Criteria) this;
        }

        public Criteria andM043Like(String value) {
            addCriterion("M043 like", value, "m043");
            return (Criteria) this;
        }

        public Criteria andM043NotLike(String value) {
            addCriterion("M043 not like", value, "m043");
            return (Criteria) this;
        }

        public Criteria andM043In(List<String> values) {
            addCriterion("M043 in", values, "m043");
            return (Criteria) this;
        }

        public Criteria andM043NotIn(List<String> values) {
            addCriterion("M043 not in", values, "m043");
            return (Criteria) this;
        }

        public Criteria andM043Between(String value1, String value2) {
            addCriterion("M043 between", value1, value2, "m043");
            return (Criteria) this;
        }

        public Criteria andM043NotBetween(String value1, String value2) {
            addCriterion("M043 not between", value1, value2, "m043");
            return (Criteria) this;
        }

        public Criteria andM044IsNull() {
            addCriterion("M044 is null");
            return (Criteria) this;
        }

        public Criteria andM044IsNotNull() {
            addCriterion("M044 is not null");
            return (Criteria) this;
        }

        public Criteria andM044EqualTo(String value) {
            addCriterion("M044 =", value, "m044");
            return (Criteria) this;
        }

        public Criteria andM044NotEqualTo(String value) {
            addCriterion("M044 <>", value, "m044");
            return (Criteria) this;
        }

        public Criteria andM044GreaterThan(String value) {
            addCriterion("M044 >", value, "m044");
            return (Criteria) this;
        }

        public Criteria andM044GreaterThanOrEqualTo(String value) {
            addCriterion("M044 >=", value, "m044");
            return (Criteria) this;
        }

        public Criteria andM044LessThan(String value) {
            addCriterion("M044 <", value, "m044");
            return (Criteria) this;
        }

        public Criteria andM044LessThanOrEqualTo(String value) {
            addCriterion("M044 <=", value, "m044");
            return (Criteria) this;
        }

        public Criteria andM044Like(String value) {
            addCriterion("M044 like", value, "m044");
            return (Criteria) this;
        }

        public Criteria andM044NotLike(String value) {
            addCriterion("M044 not like", value, "m044");
            return (Criteria) this;
        }

        public Criteria andM044In(List<String> values) {
            addCriterion("M044 in", values, "m044");
            return (Criteria) this;
        }

        public Criteria andM044NotIn(List<String> values) {
            addCriterion("M044 not in", values, "m044");
            return (Criteria) this;
        }

        public Criteria andM044Between(String value1, String value2) {
            addCriterion("M044 between", value1, value2, "m044");
            return (Criteria) this;
        }

        public Criteria andM044NotBetween(String value1, String value2) {
            addCriterion("M044 not between", value1, value2, "m044");
            return (Criteria) this;
        }

        public Criteria andM045IsNull() {
            addCriterion("M045 is null");
            return (Criteria) this;
        }

        public Criteria andM045IsNotNull() {
            addCriterion("M045 is not null");
            return (Criteria) this;
        }

        public Criteria andM045EqualTo(String value) {
            addCriterion("M045 =", value, "m045");
            return (Criteria) this;
        }

        public Criteria andM045NotEqualTo(String value) {
            addCriterion("M045 <>", value, "m045");
            return (Criteria) this;
        }

        public Criteria andM045GreaterThan(String value) {
            addCriterion("M045 >", value, "m045");
            return (Criteria) this;
        }

        public Criteria andM045GreaterThanOrEqualTo(String value) {
            addCriterion("M045 >=", value, "m045");
            return (Criteria) this;
        }

        public Criteria andM045LessThan(String value) {
            addCriterion("M045 <", value, "m045");
            return (Criteria) this;
        }

        public Criteria andM045LessThanOrEqualTo(String value) {
            addCriterion("M045 <=", value, "m045");
            return (Criteria) this;
        }

        public Criteria andM045Like(String value) {
            addCriterion("M045 like", value, "m045");
            return (Criteria) this;
        }

        public Criteria andM045NotLike(String value) {
            addCriterion("M045 not like", value, "m045");
            return (Criteria) this;
        }

        public Criteria andM045In(List<String> values) {
            addCriterion("M045 in", values, "m045");
            return (Criteria) this;
        }

        public Criteria andM045NotIn(List<String> values) {
            addCriterion("M045 not in", values, "m045");
            return (Criteria) this;
        }

        public Criteria andM045Between(String value1, String value2) {
            addCriterion("M045 between", value1, value2, "m045");
            return (Criteria) this;
        }

        public Criteria andM045NotBetween(String value1, String value2) {
            addCriterion("M045 not between", value1, value2, "m045");
            return (Criteria) this;
        }

        public Criteria andM046IsNull() {
            addCriterion("M046 is null");
            return (Criteria) this;
        }

        public Criteria andM046IsNotNull() {
            addCriterion("M046 is not null");
            return (Criteria) this;
        }

        public Criteria andM046EqualTo(String value) {
            addCriterion("M046 =", value, "m046");
            return (Criteria) this;
        }

        public Criteria andM046NotEqualTo(String value) {
            addCriterion("M046 <>", value, "m046");
            return (Criteria) this;
        }

        public Criteria andM046GreaterThan(String value) {
            addCriterion("M046 >", value, "m046");
            return (Criteria) this;
        }

        public Criteria andM046GreaterThanOrEqualTo(String value) {
            addCriterion("M046 >=", value, "m046");
            return (Criteria) this;
        }

        public Criteria andM046LessThan(String value) {
            addCriterion("M046 <", value, "m046");
            return (Criteria) this;
        }

        public Criteria andM046LessThanOrEqualTo(String value) {
            addCriterion("M046 <=", value, "m046");
            return (Criteria) this;
        }

        public Criteria andM046Like(String value) {
            addCriterion("M046 like", value, "m046");
            return (Criteria) this;
        }

        public Criteria andM046NotLike(String value) {
            addCriterion("M046 not like", value, "m046");
            return (Criteria) this;
        }

        public Criteria andM046In(List<String> values) {
            addCriterion("M046 in", values, "m046");
            return (Criteria) this;
        }

        public Criteria andM046NotIn(List<String> values) {
            addCriterion("M046 not in", values, "m046");
            return (Criteria) this;
        }

        public Criteria andM046Between(String value1, String value2) {
            addCriterion("M046 between", value1, value2, "m046");
            return (Criteria) this;
        }

        public Criteria andM046NotBetween(String value1, String value2) {
            addCriterion("M046 not between", value1, value2, "m046");
            return (Criteria) this;
        }

        public Criteria andM047IsNull() {
            addCriterion("M047 is null");
            return (Criteria) this;
        }

        public Criteria andM047IsNotNull() {
            addCriterion("M047 is not null");
            return (Criteria) this;
        }

        public Criteria andM047EqualTo(String value) {
            addCriterion("M047 =", value, "m047");
            return (Criteria) this;
        }

        public Criteria andM047NotEqualTo(String value) {
            addCriterion("M047 <>", value, "m047");
            return (Criteria) this;
        }

        public Criteria andM047GreaterThan(String value) {
            addCriterion("M047 >", value, "m047");
            return (Criteria) this;
        }

        public Criteria andM047GreaterThanOrEqualTo(String value) {
            addCriterion("M047 >=", value, "m047");
            return (Criteria) this;
        }

        public Criteria andM047LessThan(String value) {
            addCriterion("M047 <", value, "m047");
            return (Criteria) this;
        }

        public Criteria andM047LessThanOrEqualTo(String value) {
            addCriterion("M047 <=", value, "m047");
            return (Criteria) this;
        }

        public Criteria andM047Like(String value) {
            addCriterion("M047 like", value, "m047");
            return (Criteria) this;
        }

        public Criteria andM047NotLike(String value) {
            addCriterion("M047 not like", value, "m047");
            return (Criteria) this;
        }

        public Criteria andM047In(List<String> values) {
            addCriterion("M047 in", values, "m047");
            return (Criteria) this;
        }

        public Criteria andM047NotIn(List<String> values) {
            addCriterion("M047 not in", values, "m047");
            return (Criteria) this;
        }

        public Criteria andM047Between(String value1, String value2) {
            addCriterion("M047 between", value1, value2, "m047");
            return (Criteria) this;
        }

        public Criteria andM047NotBetween(String value1, String value2) {
            addCriterion("M047 not between", value1, value2, "m047");
            return (Criteria) this;
        }

        public Criteria andM048IsNull() {
            addCriterion("M048 is null");
            return (Criteria) this;
        }

        public Criteria andM048IsNotNull() {
            addCriterion("M048 is not null");
            return (Criteria) this;
        }

        public Criteria andM048EqualTo(String value) {
            addCriterion("M048 =", value, "m048");
            return (Criteria) this;
        }

        public Criteria andM048NotEqualTo(String value) {
            addCriterion("M048 <>", value, "m048");
            return (Criteria) this;
        }

        public Criteria andM048GreaterThan(String value) {
            addCriterion("M048 >", value, "m048");
            return (Criteria) this;
        }

        public Criteria andM048GreaterThanOrEqualTo(String value) {
            addCriterion("M048 >=", value, "m048");
            return (Criteria) this;
        }

        public Criteria andM048LessThan(String value) {
            addCriterion("M048 <", value, "m048");
            return (Criteria) this;
        }

        public Criteria andM048LessThanOrEqualTo(String value) {
            addCriterion("M048 <=", value, "m048");
            return (Criteria) this;
        }

        public Criteria andM048Like(String value) {
            addCriterion("M048 like", value, "m048");
            return (Criteria) this;
        }

        public Criteria andM048NotLike(String value) {
            addCriterion("M048 not like", value, "m048");
            return (Criteria) this;
        }

        public Criteria andM048In(List<String> values) {
            addCriterion("M048 in", values, "m048");
            return (Criteria) this;
        }

        public Criteria andM048NotIn(List<String> values) {
            addCriterion("M048 not in", values, "m048");
            return (Criteria) this;
        }

        public Criteria andM048Between(String value1, String value2) {
            addCriterion("M048 between", value1, value2, "m048");
            return (Criteria) this;
        }

        public Criteria andM048NotBetween(String value1, String value2) {
            addCriterion("M048 not between", value1, value2, "m048");
            return (Criteria) this;
        }

        public Criteria andM049IsNull() {
            addCriterion("M049 is null");
            return (Criteria) this;
        }

        public Criteria andM049IsNotNull() {
            addCriterion("M049 is not null");
            return (Criteria) this;
        }

        public Criteria andM049EqualTo(String value) {
            addCriterion("M049 =", value, "m049");
            return (Criteria) this;
        }

        public Criteria andM049NotEqualTo(String value) {
            addCriterion("M049 <>", value, "m049");
            return (Criteria) this;
        }

        public Criteria andM049GreaterThan(String value) {
            addCriterion("M049 >", value, "m049");
            return (Criteria) this;
        }

        public Criteria andM049GreaterThanOrEqualTo(String value) {
            addCriterion("M049 >=", value, "m049");
            return (Criteria) this;
        }

        public Criteria andM049LessThan(String value) {
            addCriterion("M049 <", value, "m049");
            return (Criteria) this;
        }

        public Criteria andM049LessThanOrEqualTo(String value) {
            addCriterion("M049 <=", value, "m049");
            return (Criteria) this;
        }

        public Criteria andM049Like(String value) {
            addCriterion("M049 like", value, "m049");
            return (Criteria) this;
        }

        public Criteria andM049NotLike(String value) {
            addCriterion("M049 not like", value, "m049");
            return (Criteria) this;
        }

        public Criteria andM049In(List<String> values) {
            addCriterion("M049 in", values, "m049");
            return (Criteria) this;
        }

        public Criteria andM049NotIn(List<String> values) {
            addCriterion("M049 not in", values, "m049");
            return (Criteria) this;
        }

        public Criteria andM049Between(String value1, String value2) {
            addCriterion("M049 between", value1, value2, "m049");
            return (Criteria) this;
        }

        public Criteria andM049NotBetween(String value1, String value2) {
            addCriterion("M049 not between", value1, value2, "m049");
            return (Criteria) this;
        }

        public Criteria andM050IsNull() {
            addCriterion("M050 is null");
            return (Criteria) this;
        }

        public Criteria andM050IsNotNull() {
            addCriterion("M050 is not null");
            return (Criteria) this;
        }

        public Criteria andM050EqualTo(String value) {
            addCriterion("M050 =", value, "m050");
            return (Criteria) this;
        }

        public Criteria andM050NotEqualTo(String value) {
            addCriterion("M050 <>", value, "m050");
            return (Criteria) this;
        }

        public Criteria andM050GreaterThan(String value) {
            addCriterion("M050 >", value, "m050");
            return (Criteria) this;
        }

        public Criteria andM050GreaterThanOrEqualTo(String value) {
            addCriterion("M050 >=", value, "m050");
            return (Criteria) this;
        }

        public Criteria andM050LessThan(String value) {
            addCriterion("M050 <", value, "m050");
            return (Criteria) this;
        }

        public Criteria andM050LessThanOrEqualTo(String value) {
            addCriterion("M050 <=", value, "m050");
            return (Criteria) this;
        }

        public Criteria andM050Like(String value) {
            addCriterion("M050 like", value, "m050");
            return (Criteria) this;
        }

        public Criteria andM050NotLike(String value) {
            addCriterion("M050 not like", value, "m050");
            return (Criteria) this;
        }

        public Criteria andM050In(List<String> values) {
            addCriterion("M050 in", values, "m050");
            return (Criteria) this;
        }

        public Criteria andM050NotIn(List<String> values) {
            addCriterion("M050 not in", values, "m050");
            return (Criteria) this;
        }

        public Criteria andM050Between(String value1, String value2) {
            addCriterion("M050 between", value1, value2, "m050");
            return (Criteria) this;
        }

        public Criteria andM050NotBetween(String value1, String value2) {
            addCriterion("M050 not between", value1, value2, "m050");
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