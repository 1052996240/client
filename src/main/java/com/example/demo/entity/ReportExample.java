package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class ReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReportExample() {
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

        public Criteria andR001IsNull() {
            addCriterion("R001 is null");
            return (Criteria) this;
        }

        public Criteria andR001IsNotNull() {
            addCriterion("R001 is not null");
            return (Criteria) this;
        }

        public Criteria andR001EqualTo(String value) {
            addCriterion("R001 =", value, "r001");
            return (Criteria) this;
        }

        public Criteria andR001NotEqualTo(String value) {
            addCriterion("R001 <>", value, "r001");
            return (Criteria) this;
        }

        public Criteria andR001GreaterThan(String value) {
            addCriterion("R001 >", value, "r001");
            return (Criteria) this;
        }

        public Criteria andR001GreaterThanOrEqualTo(String value) {
            addCriterion("R001 >=", value, "r001");
            return (Criteria) this;
        }

        public Criteria andR001LessThan(String value) {
            addCriterion("R001 <", value, "r001");
            return (Criteria) this;
        }

        public Criteria andR001LessThanOrEqualTo(String value) {
            addCriterion("R001 <=", value, "r001");
            return (Criteria) this;
        }

        public Criteria andR001Like(String value) {
            addCriterion("R001 like", value, "r001");
            return (Criteria) this;
        }

        public Criteria andR001NotLike(String value) {
            addCriterion("R001 not like", value, "r001");
            return (Criteria) this;
        }

        public Criteria andR001In(List<String> values) {
            addCriterion("R001 in", values, "r001");
            return (Criteria) this;
        }

        public Criteria andR001NotIn(List<String> values) {
            addCriterion("R001 not in", values, "r001");
            return (Criteria) this;
        }

        public Criteria andR001Between(String value1, String value2) {
            addCriterion("R001 between", value1, value2, "r001");
            return (Criteria) this;
        }

        public Criteria andR001NotBetween(String value1, String value2) {
            addCriterion("R001 not between", value1, value2, "r001");
            return (Criteria) this;
        }

        public Criteria andR002IsNull() {
            addCriterion("R002 is null");
            return (Criteria) this;
        }

        public Criteria andR002IsNotNull() {
            addCriterion("R002 is not null");
            return (Criteria) this;
        }

        public Criteria andR002EqualTo(String value) {
            addCriterion("R002 =", value, "r002");
            return (Criteria) this;
        }

        public Criteria andR002NotEqualTo(String value) {
            addCriterion("R002 <>", value, "r002");
            return (Criteria) this;
        }

        public Criteria andR002GreaterThan(String value) {
            addCriterion("R002 >", value, "r002");
            return (Criteria) this;
        }

        public Criteria andR002GreaterThanOrEqualTo(String value) {
            addCriterion("R002 >=", value, "r002");
            return (Criteria) this;
        }

        public Criteria andR002LessThan(String value) {
            addCriterion("R002 <", value, "r002");
            return (Criteria) this;
        }

        public Criteria andR002LessThanOrEqualTo(String value) {
            addCriterion("R002 <=", value, "r002");
            return (Criteria) this;
        }

        public Criteria andR002Like(String value) {
            addCriterion("R002 like", value, "r002");
            return (Criteria) this;
        }

        public Criteria andR002NotLike(String value) {
            addCriterion("R002 not like", value, "r002");
            return (Criteria) this;
        }

        public Criteria andR002In(List<String> values) {
            addCriterion("R002 in", values, "r002");
            return (Criteria) this;
        }

        public Criteria andR002NotIn(List<String> values) {
            addCriterion("R002 not in", values, "r002");
            return (Criteria) this;
        }

        public Criteria andR002Between(String value1, String value2) {
            addCriterion("R002 between", value1, value2, "r002");
            return (Criteria) this;
        }

        public Criteria andR002NotBetween(String value1, String value2) {
            addCriterion("R002 not between", value1, value2, "r002");
            return (Criteria) this;
        }

        public Criteria andR003IsNull() {
            addCriterion("R003 is null");
            return (Criteria) this;
        }

        public Criteria andR003IsNotNull() {
            addCriterion("R003 is not null");
            return (Criteria) this;
        }

        public Criteria andR003EqualTo(String value) {
            addCriterion("R003 =", value, "r003");
            return (Criteria) this;
        }

        public Criteria andR003NotEqualTo(String value) {
            addCriterion("R003 <>", value, "r003");
            return (Criteria) this;
        }

        public Criteria andR003GreaterThan(String value) {
            addCriterion("R003 >", value, "r003");
            return (Criteria) this;
        }

        public Criteria andR003GreaterThanOrEqualTo(String value) {
            addCriterion("R003 >=", value, "r003");
            return (Criteria) this;
        }

        public Criteria andR003LessThan(String value) {
            addCriterion("R003 <", value, "r003");
            return (Criteria) this;
        }

        public Criteria andR003LessThanOrEqualTo(String value) {
            addCriterion("R003 <=", value, "r003");
            return (Criteria) this;
        }

        public Criteria andR003Like(String value) {
            addCriterion("R003 like", value, "r003");
            return (Criteria) this;
        }

        public Criteria andR003NotLike(String value) {
            addCriterion("R003 not like", value, "r003");
            return (Criteria) this;
        }

        public Criteria andR003In(List<String> values) {
            addCriterion("R003 in", values, "r003");
            return (Criteria) this;
        }

        public Criteria andR003NotIn(List<String> values) {
            addCriterion("R003 not in", values, "r003");
            return (Criteria) this;
        }

        public Criteria andR003Between(String value1, String value2) {
            addCriterion("R003 between", value1, value2, "r003");
            return (Criteria) this;
        }

        public Criteria andR003NotBetween(String value1, String value2) {
            addCriterion("R003 not between", value1, value2, "r003");
            return (Criteria) this;
        }

        public Criteria andR004IsNull() {
            addCriterion("R004 is null");
            return (Criteria) this;
        }

        public Criteria andR004IsNotNull() {
            addCriterion("R004 is not null");
            return (Criteria) this;
        }

        public Criteria andR004EqualTo(String value) {
            addCriterion("R004 =", value, "r004");
            return (Criteria) this;
        }

        public Criteria andR004NotEqualTo(String value) {
            addCriterion("R004 <>", value, "r004");
            return (Criteria) this;
        }

        public Criteria andR004GreaterThan(String value) {
            addCriterion("R004 >", value, "r004");
            return (Criteria) this;
        }

        public Criteria andR004GreaterThanOrEqualTo(String value) {
            addCriterion("R004 >=", value, "r004");
            return (Criteria) this;
        }

        public Criteria andR004LessThan(String value) {
            addCriterion("R004 <", value, "r004");
            return (Criteria) this;
        }

        public Criteria andR004LessThanOrEqualTo(String value) {
            addCriterion("R004 <=", value, "r004");
            return (Criteria) this;
        }

        public Criteria andR004Like(String value) {
            addCriterion("R004 like", value, "r004");
            return (Criteria) this;
        }

        public Criteria andR004NotLike(String value) {
            addCriterion("R004 not like", value, "r004");
            return (Criteria) this;
        }

        public Criteria andR004In(List<String> values) {
            addCriterion("R004 in", values, "r004");
            return (Criteria) this;
        }

        public Criteria andR004NotIn(List<String> values) {
            addCriterion("R004 not in", values, "r004");
            return (Criteria) this;
        }

        public Criteria andR004Between(String value1, String value2) {
            addCriterion("R004 between", value1, value2, "r004");
            return (Criteria) this;
        }

        public Criteria andR004NotBetween(String value1, String value2) {
            addCriterion("R004 not between", value1, value2, "r004");
            return (Criteria) this;
        }

        public Criteria andR005IsNull() {
            addCriterion("R005 is null");
            return (Criteria) this;
        }

        public Criteria andR005IsNotNull() {
            addCriterion("R005 is not null");
            return (Criteria) this;
        }

        public Criteria andR005EqualTo(String value) {
            addCriterion("R005 =", value, "r005");
            return (Criteria) this;
        }

        public Criteria andR005NotEqualTo(String value) {
            addCriterion("R005 <>", value, "r005");
            return (Criteria) this;
        }

        public Criteria andR005GreaterThan(String value) {
            addCriterion("R005 >", value, "r005");
            return (Criteria) this;
        }

        public Criteria andR005GreaterThanOrEqualTo(String value) {
            addCriterion("R005 >=", value, "r005");
            return (Criteria) this;
        }

        public Criteria andR005LessThan(String value) {
            addCriterion("R005 <", value, "r005");
            return (Criteria) this;
        }

        public Criteria andR005LessThanOrEqualTo(String value) {
            addCriterion("R005 <=", value, "r005");
            return (Criteria) this;
        }

        public Criteria andR005Like(String value) {
            addCriterion("R005 like", value, "r005");
            return (Criteria) this;
        }

        public Criteria andR005NotLike(String value) {
            addCriterion("R005 not like", value, "r005");
            return (Criteria) this;
        }

        public Criteria andR005In(List<String> values) {
            addCriterion("R005 in", values, "r005");
            return (Criteria) this;
        }

        public Criteria andR005NotIn(List<String> values) {
            addCriterion("R005 not in", values, "r005");
            return (Criteria) this;
        }

        public Criteria andR005Between(String value1, String value2) {
            addCriterion("R005 between", value1, value2, "r005");
            return (Criteria) this;
        }

        public Criteria andR005NotBetween(String value1, String value2) {
            addCriterion("R005 not between", value1, value2, "r005");
            return (Criteria) this;
        }

        public Criteria andR006IsNull() {
            addCriterion("R006 is null");
            return (Criteria) this;
        }

        public Criteria andR006IsNotNull() {
            addCriterion("R006 is not null");
            return (Criteria) this;
        }

        public Criteria andR006EqualTo(String value) {
            addCriterion("R006 =", value, "r006");
            return (Criteria) this;
        }

        public Criteria andR006NotEqualTo(String value) {
            addCriterion("R006 <>", value, "r006");
            return (Criteria) this;
        }

        public Criteria andR006GreaterThan(String value) {
            addCriterion("R006 >", value, "r006");
            return (Criteria) this;
        }

        public Criteria andR006GreaterThanOrEqualTo(String value) {
            addCriterion("R006 >=", value, "r006");
            return (Criteria) this;
        }

        public Criteria andR006LessThan(String value) {
            addCriterion("R006 <", value, "r006");
            return (Criteria) this;
        }

        public Criteria andR006LessThanOrEqualTo(String value) {
            addCriterion("R006 <=", value, "r006");
            return (Criteria) this;
        }

        public Criteria andR006Like(String value) {
            addCriterion("R006 like", value, "r006");
            return (Criteria) this;
        }

        public Criteria andR006NotLike(String value) {
            addCriterion("R006 not like", value, "r006");
            return (Criteria) this;
        }

        public Criteria andR006In(List<String> values) {
            addCriterion("R006 in", values, "r006");
            return (Criteria) this;
        }

        public Criteria andR006NotIn(List<String> values) {
            addCriterion("R006 not in", values, "r006");
            return (Criteria) this;
        }

        public Criteria andR006Between(String value1, String value2) {
            addCriterion("R006 between", value1, value2, "r006");
            return (Criteria) this;
        }

        public Criteria andR006NotBetween(String value1, String value2) {
            addCriterion("R006 not between", value1, value2, "r006");
            return (Criteria) this;
        }

        public Criteria andR007IsNull() {
            addCriterion("R007 is null");
            return (Criteria) this;
        }

        public Criteria andR007IsNotNull() {
            addCriterion("R007 is not null");
            return (Criteria) this;
        }

        public Criteria andR007EqualTo(String value) {
            addCriterion("R007 =", value, "r007");
            return (Criteria) this;
        }

        public Criteria andR007NotEqualTo(String value) {
            addCriterion("R007 <>", value, "r007");
            return (Criteria) this;
        }

        public Criteria andR007GreaterThan(String value) {
            addCriterion("R007 >", value, "r007");
            return (Criteria) this;
        }

        public Criteria andR007GreaterThanOrEqualTo(String value) {
            addCriterion("R007 >=", value, "r007");
            return (Criteria) this;
        }

        public Criteria andR007LessThan(String value) {
            addCriterion("R007 <", value, "r007");
            return (Criteria) this;
        }

        public Criteria andR007LessThanOrEqualTo(String value) {
            addCriterion("R007 <=", value, "r007");
            return (Criteria) this;
        }

        public Criteria andR007Like(String value) {
            addCriterion("R007 like", value, "r007");
            return (Criteria) this;
        }

        public Criteria andR007NotLike(String value) {
            addCriterion("R007 not like", value, "r007");
            return (Criteria) this;
        }

        public Criteria andR007In(List<String> values) {
            addCriterion("R007 in", values, "r007");
            return (Criteria) this;
        }

        public Criteria andR007NotIn(List<String> values) {
            addCriterion("R007 not in", values, "r007");
            return (Criteria) this;
        }

        public Criteria andR007Between(String value1, String value2) {
            addCriterion("R007 between", value1, value2, "r007");
            return (Criteria) this;
        }

        public Criteria andR007NotBetween(String value1, String value2) {
            addCriterion("R007 not between", value1, value2, "r007");
            return (Criteria) this;
        }

        public Criteria andR008IsNull() {
            addCriterion("R008 is null");
            return (Criteria) this;
        }

        public Criteria andR008IsNotNull() {
            addCriterion("R008 is not null");
            return (Criteria) this;
        }

        public Criteria andR008EqualTo(String value) {
            addCriterion("R008 =", value, "r008");
            return (Criteria) this;
        }

        public Criteria andR008NotEqualTo(String value) {
            addCriterion("R008 <>", value, "r008");
            return (Criteria) this;
        }

        public Criteria andR008GreaterThan(String value) {
            addCriterion("R008 >", value, "r008");
            return (Criteria) this;
        }

        public Criteria andR008GreaterThanOrEqualTo(String value) {
            addCriterion("R008 >=", value, "r008");
            return (Criteria) this;
        }

        public Criteria andR008LessThan(String value) {
            addCriterion("R008 <", value, "r008");
            return (Criteria) this;
        }

        public Criteria andR008LessThanOrEqualTo(String value) {
            addCriterion("R008 <=", value, "r008");
            return (Criteria) this;
        }

        public Criteria andR008Like(String value) {
            addCriterion("R008 like", value, "r008");
            return (Criteria) this;
        }

        public Criteria andR008NotLike(String value) {
            addCriterion("R008 not like", value, "r008");
            return (Criteria) this;
        }

        public Criteria andR008In(List<String> values) {
            addCriterion("R008 in", values, "r008");
            return (Criteria) this;
        }

        public Criteria andR008NotIn(List<String> values) {
            addCriterion("R008 not in", values, "r008");
            return (Criteria) this;
        }

        public Criteria andR008Between(String value1, String value2) {
            addCriterion("R008 between", value1, value2, "r008");
            return (Criteria) this;
        }

        public Criteria andR008NotBetween(String value1, String value2) {
            addCriterion("R008 not between", value1, value2, "r008");
            return (Criteria) this;
        }

        public Criteria andR009IsNull() {
            addCriterion("R009 is null");
            return (Criteria) this;
        }

        public Criteria andR009IsNotNull() {
            addCriterion("R009 is not null");
            return (Criteria) this;
        }

        public Criteria andR009EqualTo(String value) {
            addCriterion("R009 =", value, "r009");
            return (Criteria) this;
        }

        public Criteria andR009NotEqualTo(String value) {
            addCriterion("R009 <>", value, "r009");
            return (Criteria) this;
        }

        public Criteria andR009GreaterThan(String value) {
            addCriterion("R009 >", value, "r009");
            return (Criteria) this;
        }

        public Criteria andR009GreaterThanOrEqualTo(String value) {
            addCriterion("R009 >=", value, "r009");
            return (Criteria) this;
        }

        public Criteria andR009LessThan(String value) {
            addCriterion("R009 <", value, "r009");
            return (Criteria) this;
        }

        public Criteria andR009LessThanOrEqualTo(String value) {
            addCriterion("R009 <=", value, "r009");
            return (Criteria) this;
        }

        public Criteria andR009Like(String value) {
            addCriterion("R009 like", value, "r009");
            return (Criteria) this;
        }

        public Criteria andR009NotLike(String value) {
            addCriterion("R009 not like", value, "r009");
            return (Criteria) this;
        }

        public Criteria andR009In(List<String> values) {
            addCriterion("R009 in", values, "r009");
            return (Criteria) this;
        }

        public Criteria andR009NotIn(List<String> values) {
            addCriterion("R009 not in", values, "r009");
            return (Criteria) this;
        }

        public Criteria andR009Between(String value1, String value2) {
            addCriterion("R009 between", value1, value2, "r009");
            return (Criteria) this;
        }

        public Criteria andR009NotBetween(String value1, String value2) {
            addCriterion("R009 not between", value1, value2, "r009");
            return (Criteria) this;
        }

        public Criteria andR010IsNull() {
            addCriterion("R010 is null");
            return (Criteria) this;
        }

        public Criteria andR010IsNotNull() {
            addCriterion("R010 is not null");
            return (Criteria) this;
        }

        public Criteria andR010EqualTo(String value) {
            addCriterion("R010 =", value, "r010");
            return (Criteria) this;
        }

        public Criteria andR010NotEqualTo(String value) {
            addCriterion("R010 <>", value, "r010");
            return (Criteria) this;
        }

        public Criteria andR010GreaterThan(String value) {
            addCriterion("R010 >", value, "r010");
            return (Criteria) this;
        }

        public Criteria andR010GreaterThanOrEqualTo(String value) {
            addCriterion("R010 >=", value, "r010");
            return (Criteria) this;
        }

        public Criteria andR010LessThan(String value) {
            addCriterion("R010 <", value, "r010");
            return (Criteria) this;
        }

        public Criteria andR010LessThanOrEqualTo(String value) {
            addCriterion("R010 <=", value, "r010");
            return (Criteria) this;
        }

        public Criteria andR010Like(String value) {
            addCriterion("R010 like", value, "r010");
            return (Criteria) this;
        }

        public Criteria andR010NotLike(String value) {
            addCriterion("R010 not like", value, "r010");
            return (Criteria) this;
        }

        public Criteria andR010In(List<String> values) {
            addCriterion("R010 in", values, "r010");
            return (Criteria) this;
        }

        public Criteria andR010NotIn(List<String> values) {
            addCriterion("R010 not in", values, "r010");
            return (Criteria) this;
        }

        public Criteria andR010Between(String value1, String value2) {
            addCriterion("R010 between", value1, value2, "r010");
            return (Criteria) this;
        }

        public Criteria andR010NotBetween(String value1, String value2) {
            addCriterion("R010 not between", value1, value2, "r010");
            return (Criteria) this;
        }

        public Criteria andR011IsNull() {
            addCriterion("R011 is null");
            return (Criteria) this;
        }

        public Criteria andR011IsNotNull() {
            addCriterion("R011 is not null");
            return (Criteria) this;
        }

        public Criteria andR011EqualTo(String value) {
            addCriterion("R011 =", value, "r011");
            return (Criteria) this;
        }

        public Criteria andR011NotEqualTo(String value) {
            addCriterion("R011 <>", value, "r011");
            return (Criteria) this;
        }

        public Criteria andR011GreaterThan(String value) {
            addCriterion("R011 >", value, "r011");
            return (Criteria) this;
        }

        public Criteria andR011GreaterThanOrEqualTo(String value) {
            addCriterion("R011 >=", value, "r011");
            return (Criteria) this;
        }

        public Criteria andR011LessThan(String value) {
            addCriterion("R011 <", value, "r011");
            return (Criteria) this;
        }

        public Criteria andR011LessThanOrEqualTo(String value) {
            addCriterion("R011 <=", value, "r011");
            return (Criteria) this;
        }

        public Criteria andR011Like(String value) {
            addCriterion("R011 like", value, "r011");
            return (Criteria) this;
        }

        public Criteria andR011NotLike(String value) {
            addCriterion("R011 not like", value, "r011");
            return (Criteria) this;
        }

        public Criteria andR011In(List<String> values) {
            addCriterion("R011 in", values, "r011");
            return (Criteria) this;
        }

        public Criteria andR011NotIn(List<String> values) {
            addCriterion("R011 not in", values, "r011");
            return (Criteria) this;
        }

        public Criteria andR011Between(String value1, String value2) {
            addCriterion("R011 between", value1, value2, "r011");
            return (Criteria) this;
        }

        public Criteria andR011NotBetween(String value1, String value2) {
            addCriterion("R011 not between", value1, value2, "r011");
            return (Criteria) this;
        }

        public Criteria andR012IsNull() {
            addCriterion("R012 is null");
            return (Criteria) this;
        }

        public Criteria andR012IsNotNull() {
            addCriterion("R012 is not null");
            return (Criteria) this;
        }

        public Criteria andR012EqualTo(String value) {
            addCriterion("R012 =", value, "r012");
            return (Criteria) this;
        }

        public Criteria andR012NotEqualTo(String value) {
            addCriterion("R012 <>", value, "r012");
            return (Criteria) this;
        }

        public Criteria andR012GreaterThan(String value) {
            addCriterion("R012 >", value, "r012");
            return (Criteria) this;
        }

        public Criteria andR012GreaterThanOrEqualTo(String value) {
            addCriterion("R012 >=", value, "r012");
            return (Criteria) this;
        }

        public Criteria andR012LessThan(String value) {
            addCriterion("R012 <", value, "r012");
            return (Criteria) this;
        }

        public Criteria andR012LessThanOrEqualTo(String value) {
            addCriterion("R012 <=", value, "r012");
            return (Criteria) this;
        }

        public Criteria andR012Like(String value) {
            addCriterion("R012 like", value, "r012");
            return (Criteria) this;
        }

        public Criteria andR012NotLike(String value) {
            addCriterion("R012 not like", value, "r012");
            return (Criteria) this;
        }

        public Criteria andR012In(List<String> values) {
            addCriterion("R012 in", values, "r012");
            return (Criteria) this;
        }

        public Criteria andR012NotIn(List<String> values) {
            addCriterion("R012 not in", values, "r012");
            return (Criteria) this;
        }

        public Criteria andR012Between(String value1, String value2) {
            addCriterion("R012 between", value1, value2, "r012");
            return (Criteria) this;
        }

        public Criteria andR012NotBetween(String value1, String value2) {
            addCriterion("R012 not between", value1, value2, "r012");
            return (Criteria) this;
        }

        public Criteria andR013IsNull() {
            addCriterion("R013 is null");
            return (Criteria) this;
        }

        public Criteria andR013IsNotNull() {
            addCriterion("R013 is not null");
            return (Criteria) this;
        }

        public Criteria andR013EqualTo(String value) {
            addCriterion("R013 =", value, "r013");
            return (Criteria) this;
        }

        public Criteria andR013NotEqualTo(String value) {
            addCriterion("R013 <>", value, "r013");
            return (Criteria) this;
        }

        public Criteria andR013GreaterThan(String value) {
            addCriterion("R013 >", value, "r013");
            return (Criteria) this;
        }

        public Criteria andR013GreaterThanOrEqualTo(String value) {
            addCriterion("R013 >=", value, "r013");
            return (Criteria) this;
        }

        public Criteria andR013LessThan(String value) {
            addCriterion("R013 <", value, "r013");
            return (Criteria) this;
        }

        public Criteria andR013LessThanOrEqualTo(String value) {
            addCriterion("R013 <=", value, "r013");
            return (Criteria) this;
        }

        public Criteria andR013Like(String value) {
            addCriterion("R013 like", value, "r013");
            return (Criteria) this;
        }

        public Criteria andR013NotLike(String value) {
            addCriterion("R013 not like", value, "r013");
            return (Criteria) this;
        }

        public Criteria andR013In(List<String> values) {
            addCriterion("R013 in", values, "r013");
            return (Criteria) this;
        }

        public Criteria andR013NotIn(List<String> values) {
            addCriterion("R013 not in", values, "r013");
            return (Criteria) this;
        }

        public Criteria andR013Between(String value1, String value2) {
            addCriterion("R013 between", value1, value2, "r013");
            return (Criteria) this;
        }

        public Criteria andR013NotBetween(String value1, String value2) {
            addCriterion("R013 not between", value1, value2, "r013");
            return (Criteria) this;
        }

        public Criteria andR014IsNull() {
            addCriterion("R014 is null");
            return (Criteria) this;
        }

        public Criteria andR014IsNotNull() {
            addCriterion("R014 is not null");
            return (Criteria) this;
        }

        public Criteria andR014EqualTo(String value) {
            addCriterion("R014 =", value, "r014");
            return (Criteria) this;
        }

        public Criteria andR014NotEqualTo(String value) {
            addCriterion("R014 <>", value, "r014");
            return (Criteria) this;
        }

        public Criteria andR014GreaterThan(String value) {
            addCriterion("R014 >", value, "r014");
            return (Criteria) this;
        }

        public Criteria andR014GreaterThanOrEqualTo(String value) {
            addCriterion("R014 >=", value, "r014");
            return (Criteria) this;
        }

        public Criteria andR014LessThan(String value) {
            addCriterion("R014 <", value, "r014");
            return (Criteria) this;
        }

        public Criteria andR014LessThanOrEqualTo(String value) {
            addCriterion("R014 <=", value, "r014");
            return (Criteria) this;
        }

        public Criteria andR014Like(String value) {
            addCriterion("R014 like", value, "r014");
            return (Criteria) this;
        }

        public Criteria andR014NotLike(String value) {
            addCriterion("R014 not like", value, "r014");
            return (Criteria) this;
        }

        public Criteria andR014In(List<String> values) {
            addCriterion("R014 in", values, "r014");
            return (Criteria) this;
        }

        public Criteria andR014NotIn(List<String> values) {
            addCriterion("R014 not in", values, "r014");
            return (Criteria) this;
        }

        public Criteria andR014Between(String value1, String value2) {
            addCriterion("R014 between", value1, value2, "r014");
            return (Criteria) this;
        }

        public Criteria andR014NotBetween(String value1, String value2) {
            addCriterion("R014 not between", value1, value2, "r014");
            return (Criteria) this;
        }

        public Criteria andR015IsNull() {
            addCriterion("R015 is null");
            return (Criteria) this;
        }

        public Criteria andR015IsNotNull() {
            addCriterion("R015 is not null");
            return (Criteria) this;
        }

        public Criteria andR015EqualTo(String value) {
            addCriterion("R015 =", value, "r015");
            return (Criteria) this;
        }

        public Criteria andR015NotEqualTo(String value) {
            addCriterion("R015 <>", value, "r015");
            return (Criteria) this;
        }

        public Criteria andR015GreaterThan(String value) {
            addCriterion("R015 >", value, "r015");
            return (Criteria) this;
        }

        public Criteria andR015GreaterThanOrEqualTo(String value) {
            addCriterion("R015 >=", value, "r015");
            return (Criteria) this;
        }

        public Criteria andR015LessThan(String value) {
            addCriterion("R015 <", value, "r015");
            return (Criteria) this;
        }

        public Criteria andR015LessThanOrEqualTo(String value) {
            addCriterion("R015 <=", value, "r015");
            return (Criteria) this;
        }

        public Criteria andR015Like(String value) {
            addCriterion("R015 like", value, "r015");
            return (Criteria) this;
        }

        public Criteria andR015NotLike(String value) {
            addCriterion("R015 not like", value, "r015");
            return (Criteria) this;
        }

        public Criteria andR015In(List<String> values) {
            addCriterion("R015 in", values, "r015");
            return (Criteria) this;
        }

        public Criteria andR015NotIn(List<String> values) {
            addCriterion("R015 not in", values, "r015");
            return (Criteria) this;
        }

        public Criteria andR015Between(String value1, String value2) {
            addCriterion("R015 between", value1, value2, "r015");
            return (Criteria) this;
        }

        public Criteria andR015NotBetween(String value1, String value2) {
            addCriterion("R015 not between", value1, value2, "r015");
            return (Criteria) this;
        }

        public Criteria andR016IsNull() {
            addCriterion("R016 is null");
            return (Criteria) this;
        }

        public Criteria andR016IsNotNull() {
            addCriterion("R016 is not null");
            return (Criteria) this;
        }

        public Criteria andR016EqualTo(String value) {
            addCriterion("R016 =", value, "r016");
            return (Criteria) this;
        }

        public Criteria andR016NotEqualTo(String value) {
            addCriterion("R016 <>", value, "r016");
            return (Criteria) this;
        }

        public Criteria andR016GreaterThan(String value) {
            addCriterion("R016 >", value, "r016");
            return (Criteria) this;
        }

        public Criteria andR016GreaterThanOrEqualTo(String value) {
            addCriterion("R016 >=", value, "r016");
            return (Criteria) this;
        }

        public Criteria andR016LessThan(String value) {
            addCriterion("R016 <", value, "r016");
            return (Criteria) this;
        }

        public Criteria andR016LessThanOrEqualTo(String value) {
            addCriterion("R016 <=", value, "r016");
            return (Criteria) this;
        }

        public Criteria andR016Like(String value) {
            addCriterion("R016 like", value, "r016");
            return (Criteria) this;
        }

        public Criteria andR016NotLike(String value) {
            addCriterion("R016 not like", value, "r016");
            return (Criteria) this;
        }

        public Criteria andR016In(List<String> values) {
            addCriterion("R016 in", values, "r016");
            return (Criteria) this;
        }

        public Criteria andR016NotIn(List<String> values) {
            addCriterion("R016 not in", values, "r016");
            return (Criteria) this;
        }

        public Criteria andR016Between(String value1, String value2) {
            addCriterion("R016 between", value1, value2, "r016");
            return (Criteria) this;
        }

        public Criteria andR016NotBetween(String value1, String value2) {
            addCriterion("R016 not between", value1, value2, "r016");
            return (Criteria) this;
        }

        public Criteria andR017IsNull() {
            addCriterion("R017 is null");
            return (Criteria) this;
        }

        public Criteria andR017IsNotNull() {
            addCriterion("R017 is not null");
            return (Criteria) this;
        }

        public Criteria andR017EqualTo(String value) {
            addCriterion("R017 =", value, "r017");
            return (Criteria) this;
        }

        public Criteria andR017NotEqualTo(String value) {
            addCriterion("R017 <>", value, "r017");
            return (Criteria) this;
        }

        public Criteria andR017GreaterThan(String value) {
            addCriterion("R017 >", value, "r017");
            return (Criteria) this;
        }

        public Criteria andR017GreaterThanOrEqualTo(String value) {
            addCriterion("R017 >=", value, "r017");
            return (Criteria) this;
        }

        public Criteria andR017LessThan(String value) {
            addCriterion("R017 <", value, "r017");
            return (Criteria) this;
        }

        public Criteria andR017LessThanOrEqualTo(String value) {
            addCriterion("R017 <=", value, "r017");
            return (Criteria) this;
        }

        public Criteria andR017Like(String value) {
            addCriterion("R017 like", value, "r017");
            return (Criteria) this;
        }

        public Criteria andR017NotLike(String value) {
            addCriterion("R017 not like", value, "r017");
            return (Criteria) this;
        }

        public Criteria andR017In(List<String> values) {
            addCriterion("R017 in", values, "r017");
            return (Criteria) this;
        }

        public Criteria andR017NotIn(List<String> values) {
            addCriterion("R017 not in", values, "r017");
            return (Criteria) this;
        }

        public Criteria andR017Between(String value1, String value2) {
            addCriterion("R017 between", value1, value2, "r017");
            return (Criteria) this;
        }

        public Criteria andR017NotBetween(String value1, String value2) {
            addCriterion("R017 not between", value1, value2, "r017");
            return (Criteria) this;
        }

        public Criteria andR018IsNull() {
            addCriterion("R018 is null");
            return (Criteria) this;
        }

        public Criteria andR018IsNotNull() {
            addCriterion("R018 is not null");
            return (Criteria) this;
        }

        public Criteria andR018EqualTo(String value) {
            addCriterion("R018 =", value, "r018");
            return (Criteria) this;
        }

        public Criteria andR018NotEqualTo(String value) {
            addCriterion("R018 <>", value, "r018");
            return (Criteria) this;
        }

        public Criteria andR018GreaterThan(String value) {
            addCriterion("R018 >", value, "r018");
            return (Criteria) this;
        }

        public Criteria andR018GreaterThanOrEqualTo(String value) {
            addCriterion("R018 >=", value, "r018");
            return (Criteria) this;
        }

        public Criteria andR018LessThan(String value) {
            addCriterion("R018 <", value, "r018");
            return (Criteria) this;
        }

        public Criteria andR018LessThanOrEqualTo(String value) {
            addCriterion("R018 <=", value, "r018");
            return (Criteria) this;
        }

        public Criteria andR018Like(String value) {
            addCriterion("R018 like", value, "r018");
            return (Criteria) this;
        }

        public Criteria andR018NotLike(String value) {
            addCriterion("R018 not like", value, "r018");
            return (Criteria) this;
        }

        public Criteria andR018In(List<String> values) {
            addCriterion("R018 in", values, "r018");
            return (Criteria) this;
        }

        public Criteria andR018NotIn(List<String> values) {
            addCriterion("R018 not in", values, "r018");
            return (Criteria) this;
        }

        public Criteria andR018Between(String value1, String value2) {
            addCriterion("R018 between", value1, value2, "r018");
            return (Criteria) this;
        }

        public Criteria andR018NotBetween(String value1, String value2) {
            addCriterion("R018 not between", value1, value2, "r018");
            return (Criteria) this;
        }

        public Criteria andR019IsNull() {
            addCriterion("R019 is null");
            return (Criteria) this;
        }

        public Criteria andR019IsNotNull() {
            addCriterion("R019 is not null");
            return (Criteria) this;
        }

        public Criteria andR019EqualTo(String value) {
            addCriterion("R019 =", value, "r019");
            return (Criteria) this;
        }

        public Criteria andR019NotEqualTo(String value) {
            addCriterion("R019 <>", value, "r019");
            return (Criteria) this;
        }

        public Criteria andR019GreaterThan(String value) {
            addCriterion("R019 >", value, "r019");
            return (Criteria) this;
        }

        public Criteria andR019GreaterThanOrEqualTo(String value) {
            addCriterion("R019 >=", value, "r019");
            return (Criteria) this;
        }

        public Criteria andR019LessThan(String value) {
            addCriterion("R019 <", value, "r019");
            return (Criteria) this;
        }

        public Criteria andR019LessThanOrEqualTo(String value) {
            addCriterion("R019 <=", value, "r019");
            return (Criteria) this;
        }

        public Criteria andR019Like(String value) {
            addCriterion("R019 like", value, "r019");
            return (Criteria) this;
        }

        public Criteria andR019NotLike(String value) {
            addCriterion("R019 not like", value, "r019");
            return (Criteria) this;
        }

        public Criteria andR019In(List<String> values) {
            addCriterion("R019 in", values, "r019");
            return (Criteria) this;
        }

        public Criteria andR019NotIn(List<String> values) {
            addCriterion("R019 not in", values, "r019");
            return (Criteria) this;
        }

        public Criteria andR019Between(String value1, String value2) {
            addCriterion("R019 between", value1, value2, "r019");
            return (Criteria) this;
        }

        public Criteria andR019NotBetween(String value1, String value2) {
            addCriterion("R019 not between", value1, value2, "r019");
            return (Criteria) this;
        }

        public Criteria andR020IsNull() {
            addCriterion("R020 is null");
            return (Criteria) this;
        }

        public Criteria andR020IsNotNull() {
            addCriterion("R020 is not null");
            return (Criteria) this;
        }

        public Criteria andR020EqualTo(String value) {
            addCriterion("R020 =", value, "r020");
            return (Criteria) this;
        }

        public Criteria andR020NotEqualTo(String value) {
            addCriterion("R020 <>", value, "r020");
            return (Criteria) this;
        }

        public Criteria andR020GreaterThan(String value) {
            addCriterion("R020 >", value, "r020");
            return (Criteria) this;
        }

        public Criteria andR020GreaterThanOrEqualTo(String value) {
            addCriterion("R020 >=", value, "r020");
            return (Criteria) this;
        }

        public Criteria andR020LessThan(String value) {
            addCriterion("R020 <", value, "r020");
            return (Criteria) this;
        }

        public Criteria andR020LessThanOrEqualTo(String value) {
            addCriterion("R020 <=", value, "r020");
            return (Criteria) this;
        }

        public Criteria andR020Like(String value) {
            addCriterion("R020 like", value, "r020");
            return (Criteria) this;
        }

        public Criteria andR020NotLike(String value) {
            addCriterion("R020 not like", value, "r020");
            return (Criteria) this;
        }

        public Criteria andR020In(List<String> values) {
            addCriterion("R020 in", values, "r020");
            return (Criteria) this;
        }

        public Criteria andR020NotIn(List<String> values) {
            addCriterion("R020 not in", values, "r020");
            return (Criteria) this;
        }

        public Criteria andR020Between(String value1, String value2) {
            addCriterion("R020 between", value1, value2, "r020");
            return (Criteria) this;
        }

        public Criteria andR020NotBetween(String value1, String value2) {
            addCriterion("R020 not between", value1, value2, "r020");
            return (Criteria) this;
        }

        public Criteria andR021IsNull() {
            addCriterion("R021 is null");
            return (Criteria) this;
        }

        public Criteria andR021IsNotNull() {
            addCriterion("R021 is not null");
            return (Criteria) this;
        }

        public Criteria andR021EqualTo(String value) {
            addCriterion("R021 =", value, "r021");
            return (Criteria) this;
        }

        public Criteria andR021NotEqualTo(String value) {
            addCriterion("R021 <>", value, "r021");
            return (Criteria) this;
        }

        public Criteria andR021GreaterThan(String value) {
            addCriterion("R021 >", value, "r021");
            return (Criteria) this;
        }

        public Criteria andR021GreaterThanOrEqualTo(String value) {
            addCriterion("R021 >=", value, "r021");
            return (Criteria) this;
        }

        public Criteria andR021LessThan(String value) {
            addCriterion("R021 <", value, "r021");
            return (Criteria) this;
        }

        public Criteria andR021LessThanOrEqualTo(String value) {
            addCriterion("R021 <=", value, "r021");
            return (Criteria) this;
        }

        public Criteria andR021Like(String value) {
            addCriterion("R021 like", value, "r021");
            return (Criteria) this;
        }

        public Criteria andR021NotLike(String value) {
            addCriterion("R021 not like", value, "r021");
            return (Criteria) this;
        }

        public Criteria andR021In(List<String> values) {
            addCriterion("R021 in", values, "r021");
            return (Criteria) this;
        }

        public Criteria andR021NotIn(List<String> values) {
            addCriterion("R021 not in", values, "r021");
            return (Criteria) this;
        }

        public Criteria andR021Between(String value1, String value2) {
            addCriterion("R021 between", value1, value2, "r021");
            return (Criteria) this;
        }

        public Criteria andR021NotBetween(String value1, String value2) {
            addCriterion("R021 not between", value1, value2, "r021");
            return (Criteria) this;
        }

        public Criteria andR022IsNull() {
            addCriterion("R022 is null");
            return (Criteria) this;
        }

        public Criteria andR022IsNotNull() {
            addCriterion("R022 is not null");
            return (Criteria) this;
        }

        public Criteria andR022EqualTo(String value) {
            addCriterion("R022 =", value, "r022");
            return (Criteria) this;
        }

        public Criteria andR022NotEqualTo(String value) {
            addCriterion("R022 <>", value, "r022");
            return (Criteria) this;
        }

        public Criteria andR022GreaterThan(String value) {
            addCriterion("R022 >", value, "r022");
            return (Criteria) this;
        }

        public Criteria andR022GreaterThanOrEqualTo(String value) {
            addCriterion("R022 >=", value, "r022");
            return (Criteria) this;
        }

        public Criteria andR022LessThan(String value) {
            addCriterion("R022 <", value, "r022");
            return (Criteria) this;
        }

        public Criteria andR022LessThanOrEqualTo(String value) {
            addCriterion("R022 <=", value, "r022");
            return (Criteria) this;
        }

        public Criteria andR022Like(String value) {
            addCriterion("R022 like", value, "r022");
            return (Criteria) this;
        }

        public Criteria andR022NotLike(String value) {
            addCriterion("R022 not like", value, "r022");
            return (Criteria) this;
        }

        public Criteria andR022In(List<String> values) {
            addCriterion("R022 in", values, "r022");
            return (Criteria) this;
        }

        public Criteria andR022NotIn(List<String> values) {
            addCriterion("R022 not in", values, "r022");
            return (Criteria) this;
        }

        public Criteria andR022Between(String value1, String value2) {
            addCriterion("R022 between", value1, value2, "r022");
            return (Criteria) this;
        }

        public Criteria andR022NotBetween(String value1, String value2) {
            addCriterion("R022 not between", value1, value2, "r022");
            return (Criteria) this;
        }

        public Criteria andR023IsNull() {
            addCriterion("R023 is null");
            return (Criteria) this;
        }

        public Criteria andR023IsNotNull() {
            addCriterion("R023 is not null");
            return (Criteria) this;
        }

        public Criteria andR023EqualTo(String value) {
            addCriterion("R023 =", value, "r023");
            return (Criteria) this;
        }

        public Criteria andR023NotEqualTo(String value) {
            addCriterion("R023 <>", value, "r023");
            return (Criteria) this;
        }

        public Criteria andR023GreaterThan(String value) {
            addCriterion("R023 >", value, "r023");
            return (Criteria) this;
        }

        public Criteria andR023GreaterThanOrEqualTo(String value) {
            addCriterion("R023 >=", value, "r023");
            return (Criteria) this;
        }

        public Criteria andR023LessThan(String value) {
            addCriterion("R023 <", value, "r023");
            return (Criteria) this;
        }

        public Criteria andR023LessThanOrEqualTo(String value) {
            addCriterion("R023 <=", value, "r023");
            return (Criteria) this;
        }

        public Criteria andR023Like(String value) {
            addCriterion("R023 like", value, "r023");
            return (Criteria) this;
        }

        public Criteria andR023NotLike(String value) {
            addCriterion("R023 not like", value, "r023");
            return (Criteria) this;
        }

        public Criteria andR023In(List<String> values) {
            addCriterion("R023 in", values, "r023");
            return (Criteria) this;
        }

        public Criteria andR023NotIn(List<String> values) {
            addCriterion("R023 not in", values, "r023");
            return (Criteria) this;
        }

        public Criteria andR023Between(String value1, String value2) {
            addCriterion("R023 between", value1, value2, "r023");
            return (Criteria) this;
        }

        public Criteria andR023NotBetween(String value1, String value2) {
            addCriterion("R023 not between", value1, value2, "r023");
            return (Criteria) this;
        }

        public Criteria andR024IsNull() {
            addCriterion("R024 is null");
            return (Criteria) this;
        }

        public Criteria andR024IsNotNull() {
            addCriterion("R024 is not null");
            return (Criteria) this;
        }

        public Criteria andR024EqualTo(String value) {
            addCriterion("R024 =", value, "r024");
            return (Criteria) this;
        }

        public Criteria andR024NotEqualTo(String value) {
            addCriterion("R024 <>", value, "r024");
            return (Criteria) this;
        }

        public Criteria andR024GreaterThan(String value) {
            addCriterion("R024 >", value, "r024");
            return (Criteria) this;
        }

        public Criteria andR024GreaterThanOrEqualTo(String value) {
            addCriterion("R024 >=", value, "r024");
            return (Criteria) this;
        }

        public Criteria andR024LessThan(String value) {
            addCriterion("R024 <", value, "r024");
            return (Criteria) this;
        }

        public Criteria andR024LessThanOrEqualTo(String value) {
            addCriterion("R024 <=", value, "r024");
            return (Criteria) this;
        }

        public Criteria andR024Like(String value) {
            addCriterion("R024 like", value, "r024");
            return (Criteria) this;
        }

        public Criteria andR024NotLike(String value) {
            addCriterion("R024 not like", value, "r024");
            return (Criteria) this;
        }

        public Criteria andR024In(List<String> values) {
            addCriterion("R024 in", values, "r024");
            return (Criteria) this;
        }

        public Criteria andR024NotIn(List<String> values) {
            addCriterion("R024 not in", values, "r024");
            return (Criteria) this;
        }

        public Criteria andR024Between(String value1, String value2) {
            addCriterion("R024 between", value1, value2, "r024");
            return (Criteria) this;
        }

        public Criteria andR024NotBetween(String value1, String value2) {
            addCriterion("R024 not between", value1, value2, "r024");
            return (Criteria) this;
        }

        public Criteria andR025IsNull() {
            addCriterion("R025 is null");
            return (Criteria) this;
        }

        public Criteria andR025IsNotNull() {
            addCriterion("R025 is not null");
            return (Criteria) this;
        }

        public Criteria andR025EqualTo(String value) {
            addCriterion("R025 =", value, "r025");
            return (Criteria) this;
        }

        public Criteria andR025NotEqualTo(String value) {
            addCriterion("R025 <>", value, "r025");
            return (Criteria) this;
        }

        public Criteria andR025GreaterThan(String value) {
            addCriterion("R025 >", value, "r025");
            return (Criteria) this;
        }

        public Criteria andR025GreaterThanOrEqualTo(String value) {
            addCriterion("R025 >=", value, "r025");
            return (Criteria) this;
        }

        public Criteria andR025LessThan(String value) {
            addCriterion("R025 <", value, "r025");
            return (Criteria) this;
        }

        public Criteria andR025LessThanOrEqualTo(String value) {
            addCriterion("R025 <=", value, "r025");
            return (Criteria) this;
        }

        public Criteria andR025Like(String value) {
            addCriterion("R025 like", value, "r025");
            return (Criteria) this;
        }

        public Criteria andR025NotLike(String value) {
            addCriterion("R025 not like", value, "r025");
            return (Criteria) this;
        }

        public Criteria andR025In(List<String> values) {
            addCriterion("R025 in", values, "r025");
            return (Criteria) this;
        }

        public Criteria andR025NotIn(List<String> values) {
            addCriterion("R025 not in", values, "r025");
            return (Criteria) this;
        }

        public Criteria andR025Between(String value1, String value2) {
            addCriterion("R025 between", value1, value2, "r025");
            return (Criteria) this;
        }

        public Criteria andR025NotBetween(String value1, String value2) {
            addCriterion("R025 not between", value1, value2, "r025");
            return (Criteria) this;
        }

        public Criteria andR026IsNull() {
            addCriterion("R026 is null");
            return (Criteria) this;
        }

        public Criteria andR026IsNotNull() {
            addCriterion("R026 is not null");
            return (Criteria) this;
        }

        public Criteria andR026EqualTo(String value) {
            addCriterion("R026 =", value, "r026");
            return (Criteria) this;
        }

        public Criteria andR026NotEqualTo(String value) {
            addCriterion("R026 <>", value, "r026");
            return (Criteria) this;
        }

        public Criteria andR026GreaterThan(String value) {
            addCriterion("R026 >", value, "r026");
            return (Criteria) this;
        }

        public Criteria andR026GreaterThanOrEqualTo(String value) {
            addCriterion("R026 >=", value, "r026");
            return (Criteria) this;
        }

        public Criteria andR026LessThan(String value) {
            addCriterion("R026 <", value, "r026");
            return (Criteria) this;
        }

        public Criteria andR026LessThanOrEqualTo(String value) {
            addCriterion("R026 <=", value, "r026");
            return (Criteria) this;
        }

        public Criteria andR026Like(String value) {
            addCriterion("R026 like", value, "r026");
            return (Criteria) this;
        }

        public Criteria andR026NotLike(String value) {
            addCriterion("R026 not like", value, "r026");
            return (Criteria) this;
        }

        public Criteria andR026In(List<String> values) {
            addCriterion("R026 in", values, "r026");
            return (Criteria) this;
        }

        public Criteria andR026NotIn(List<String> values) {
            addCriterion("R026 not in", values, "r026");
            return (Criteria) this;
        }

        public Criteria andR026Between(String value1, String value2) {
            addCriterion("R026 between", value1, value2, "r026");
            return (Criteria) this;
        }

        public Criteria andR026NotBetween(String value1, String value2) {
            addCriterion("R026 not between", value1, value2, "r026");
            return (Criteria) this;
        }

        public Criteria andR027IsNull() {
            addCriterion("R027 is null");
            return (Criteria) this;
        }

        public Criteria andR027IsNotNull() {
            addCriterion("R027 is not null");
            return (Criteria) this;
        }

        public Criteria andR027EqualTo(String value) {
            addCriterion("R027 =", value, "r027");
            return (Criteria) this;
        }

        public Criteria andR027NotEqualTo(String value) {
            addCriterion("R027 <>", value, "r027");
            return (Criteria) this;
        }

        public Criteria andR027GreaterThan(String value) {
            addCriterion("R027 >", value, "r027");
            return (Criteria) this;
        }

        public Criteria andR027GreaterThanOrEqualTo(String value) {
            addCriterion("R027 >=", value, "r027");
            return (Criteria) this;
        }

        public Criteria andR027LessThan(String value) {
            addCriterion("R027 <", value, "r027");
            return (Criteria) this;
        }

        public Criteria andR027LessThanOrEqualTo(String value) {
            addCriterion("R027 <=", value, "r027");
            return (Criteria) this;
        }

        public Criteria andR027Like(String value) {
            addCriterion("R027 like", value, "r027");
            return (Criteria) this;
        }

        public Criteria andR027NotLike(String value) {
            addCriterion("R027 not like", value, "r027");
            return (Criteria) this;
        }

        public Criteria andR027In(List<String> values) {
            addCriterion("R027 in", values, "r027");
            return (Criteria) this;
        }

        public Criteria andR027NotIn(List<String> values) {
            addCriterion("R027 not in", values, "r027");
            return (Criteria) this;
        }

        public Criteria andR027Between(String value1, String value2) {
            addCriterion("R027 between", value1, value2, "r027");
            return (Criteria) this;
        }

        public Criteria andR027NotBetween(String value1, String value2) {
            addCriterion("R027 not between", value1, value2, "r027");
            return (Criteria) this;
        }

        public Criteria andR028IsNull() {
            addCriterion("R028 is null");
            return (Criteria) this;
        }

        public Criteria andR028IsNotNull() {
            addCriterion("R028 is not null");
            return (Criteria) this;
        }

        public Criteria andR028EqualTo(String value) {
            addCriterion("R028 =", value, "r028");
            return (Criteria) this;
        }

        public Criteria andR028NotEqualTo(String value) {
            addCriterion("R028 <>", value, "r028");
            return (Criteria) this;
        }

        public Criteria andR028GreaterThan(String value) {
            addCriterion("R028 >", value, "r028");
            return (Criteria) this;
        }

        public Criteria andR028GreaterThanOrEqualTo(String value) {
            addCriterion("R028 >=", value, "r028");
            return (Criteria) this;
        }

        public Criteria andR028LessThan(String value) {
            addCriterion("R028 <", value, "r028");
            return (Criteria) this;
        }

        public Criteria andR028LessThanOrEqualTo(String value) {
            addCriterion("R028 <=", value, "r028");
            return (Criteria) this;
        }

        public Criteria andR028Like(String value) {
            addCriterion("R028 like", value, "r028");
            return (Criteria) this;
        }

        public Criteria andR028NotLike(String value) {
            addCriterion("R028 not like", value, "r028");
            return (Criteria) this;
        }

        public Criteria andR028In(List<String> values) {
            addCriterion("R028 in", values, "r028");
            return (Criteria) this;
        }

        public Criteria andR028NotIn(List<String> values) {
            addCriterion("R028 not in", values, "r028");
            return (Criteria) this;
        }

        public Criteria andR028Between(String value1, String value2) {
            addCriterion("R028 between", value1, value2, "r028");
            return (Criteria) this;
        }

        public Criteria andR028NotBetween(String value1, String value2) {
            addCriterion("R028 not between", value1, value2, "r028");
            return (Criteria) this;
        }

        public Criteria andR029IsNull() {
            addCriterion("R029 is null");
            return (Criteria) this;
        }

        public Criteria andR029IsNotNull() {
            addCriterion("R029 is not null");
            return (Criteria) this;
        }

        public Criteria andR029EqualTo(String value) {
            addCriterion("R029 =", value, "r029");
            return (Criteria) this;
        }

        public Criteria andR029NotEqualTo(String value) {
            addCriterion("R029 <>", value, "r029");
            return (Criteria) this;
        }

        public Criteria andR029GreaterThan(String value) {
            addCriterion("R029 >", value, "r029");
            return (Criteria) this;
        }

        public Criteria andR029GreaterThanOrEqualTo(String value) {
            addCriterion("R029 >=", value, "r029");
            return (Criteria) this;
        }

        public Criteria andR029LessThan(String value) {
            addCriterion("R029 <", value, "r029");
            return (Criteria) this;
        }

        public Criteria andR029LessThanOrEqualTo(String value) {
            addCriterion("R029 <=", value, "r029");
            return (Criteria) this;
        }

        public Criteria andR029Like(String value) {
            addCriterion("R029 like", value, "r029");
            return (Criteria) this;
        }

        public Criteria andR029NotLike(String value) {
            addCriterion("R029 not like", value, "r029");
            return (Criteria) this;
        }

        public Criteria andR029In(List<String> values) {
            addCriterion("R029 in", values, "r029");
            return (Criteria) this;
        }

        public Criteria andR029NotIn(List<String> values) {
            addCriterion("R029 not in", values, "r029");
            return (Criteria) this;
        }

        public Criteria andR029Between(String value1, String value2) {
            addCriterion("R029 between", value1, value2, "r029");
            return (Criteria) this;
        }

        public Criteria andR029NotBetween(String value1, String value2) {
            addCriterion("R029 not between", value1, value2, "r029");
            return (Criteria) this;
        }

        public Criteria andR030IsNull() {
            addCriterion("R030 is null");
            return (Criteria) this;
        }

        public Criteria andR030IsNotNull() {
            addCriterion("R030 is not null");
            return (Criteria) this;
        }

        public Criteria andR030EqualTo(String value) {
            addCriterion("R030 =", value, "r030");
            return (Criteria) this;
        }

        public Criteria andR030NotEqualTo(String value) {
            addCriterion("R030 <>", value, "r030");
            return (Criteria) this;
        }

        public Criteria andR030GreaterThan(String value) {
            addCriterion("R030 >", value, "r030");
            return (Criteria) this;
        }

        public Criteria andR030GreaterThanOrEqualTo(String value) {
            addCriterion("R030 >=", value, "r030");
            return (Criteria) this;
        }

        public Criteria andR030LessThan(String value) {
            addCriterion("R030 <", value, "r030");
            return (Criteria) this;
        }

        public Criteria andR030LessThanOrEqualTo(String value) {
            addCriterion("R030 <=", value, "r030");
            return (Criteria) this;
        }

        public Criteria andR030Like(String value) {
            addCriterion("R030 like", value, "r030");
            return (Criteria) this;
        }

        public Criteria andR030NotLike(String value) {
            addCriterion("R030 not like", value, "r030");
            return (Criteria) this;
        }

        public Criteria andR030In(List<String> values) {
            addCriterion("R030 in", values, "r030");
            return (Criteria) this;
        }

        public Criteria andR030NotIn(List<String> values) {
            addCriterion("R030 not in", values, "r030");
            return (Criteria) this;
        }

        public Criteria andR030Between(String value1, String value2) {
            addCriterion("R030 between", value1, value2, "r030");
            return (Criteria) this;
        }

        public Criteria andR030NotBetween(String value1, String value2) {
            addCriterion("R030 not between", value1, value2, "r030");
            return (Criteria) this;
        }

        public Criteria andR031IsNull() {
            addCriterion("R031 is null");
            return (Criteria) this;
        }

        public Criteria andR031IsNotNull() {
            addCriterion("R031 is not null");
            return (Criteria) this;
        }

        public Criteria andR031EqualTo(String value) {
            addCriterion("R031 =", value, "r031");
            return (Criteria) this;
        }

        public Criteria andR031NotEqualTo(String value) {
            addCriterion("R031 <>", value, "r031");
            return (Criteria) this;
        }

        public Criteria andR031GreaterThan(String value) {
            addCriterion("R031 >", value, "r031");
            return (Criteria) this;
        }

        public Criteria andR031GreaterThanOrEqualTo(String value) {
            addCriterion("R031 >=", value, "r031");
            return (Criteria) this;
        }

        public Criteria andR031LessThan(String value) {
            addCriterion("R031 <", value, "r031");
            return (Criteria) this;
        }

        public Criteria andR031LessThanOrEqualTo(String value) {
            addCriterion("R031 <=", value, "r031");
            return (Criteria) this;
        }

        public Criteria andR031Like(String value) {
            addCriterion("R031 like", value, "r031");
            return (Criteria) this;
        }

        public Criteria andR031NotLike(String value) {
            addCriterion("R031 not like", value, "r031");
            return (Criteria) this;
        }

        public Criteria andR031In(List<String> values) {
            addCriterion("R031 in", values, "r031");
            return (Criteria) this;
        }

        public Criteria andR031NotIn(List<String> values) {
            addCriterion("R031 not in", values, "r031");
            return (Criteria) this;
        }

        public Criteria andR031Between(String value1, String value2) {
            addCriterion("R031 between", value1, value2, "r031");
            return (Criteria) this;
        }

        public Criteria andR031NotBetween(String value1, String value2) {
            addCriterion("R031 not between", value1, value2, "r031");
            return (Criteria) this;
        }

        public Criteria andR032IsNull() {
            addCriterion("R032 is null");
            return (Criteria) this;
        }

        public Criteria andR032IsNotNull() {
            addCriterion("R032 is not null");
            return (Criteria) this;
        }

        public Criteria andR032EqualTo(String value) {
            addCriterion("R032 =", value, "r032");
            return (Criteria) this;
        }

        public Criteria andR032NotEqualTo(String value) {
            addCriterion("R032 <>", value, "r032");
            return (Criteria) this;
        }

        public Criteria andR032GreaterThan(String value) {
            addCriterion("R032 >", value, "r032");
            return (Criteria) this;
        }

        public Criteria andR032GreaterThanOrEqualTo(String value) {
            addCriterion("R032 >=", value, "r032");
            return (Criteria) this;
        }

        public Criteria andR032LessThan(String value) {
            addCriterion("R032 <", value, "r032");
            return (Criteria) this;
        }

        public Criteria andR032LessThanOrEqualTo(String value) {
            addCriterion("R032 <=", value, "r032");
            return (Criteria) this;
        }

        public Criteria andR032Like(String value) {
            addCriterion("R032 like", value, "r032");
            return (Criteria) this;
        }

        public Criteria andR032NotLike(String value) {
            addCriterion("R032 not like", value, "r032");
            return (Criteria) this;
        }

        public Criteria andR032In(List<String> values) {
            addCriterion("R032 in", values, "r032");
            return (Criteria) this;
        }

        public Criteria andR032NotIn(List<String> values) {
            addCriterion("R032 not in", values, "r032");
            return (Criteria) this;
        }

        public Criteria andR032Between(String value1, String value2) {
            addCriterion("R032 between", value1, value2, "r032");
            return (Criteria) this;
        }

        public Criteria andR032NotBetween(String value1, String value2) {
            addCriterion("R032 not between", value1, value2, "r032");
            return (Criteria) this;
        }

        public Criteria andR033IsNull() {
            addCriterion("R033 is null");
            return (Criteria) this;
        }

        public Criteria andR033IsNotNull() {
            addCriterion("R033 is not null");
            return (Criteria) this;
        }

        public Criteria andR033EqualTo(String value) {
            addCriterion("R033 =", value, "r033");
            return (Criteria) this;
        }

        public Criteria andR033NotEqualTo(String value) {
            addCriterion("R033 <>", value, "r033");
            return (Criteria) this;
        }

        public Criteria andR033GreaterThan(String value) {
            addCriterion("R033 >", value, "r033");
            return (Criteria) this;
        }

        public Criteria andR033GreaterThanOrEqualTo(String value) {
            addCriterion("R033 >=", value, "r033");
            return (Criteria) this;
        }

        public Criteria andR033LessThan(String value) {
            addCriterion("R033 <", value, "r033");
            return (Criteria) this;
        }

        public Criteria andR033LessThanOrEqualTo(String value) {
            addCriterion("R033 <=", value, "r033");
            return (Criteria) this;
        }

        public Criteria andR033Like(String value) {
            addCriterion("R033 like", value, "r033");
            return (Criteria) this;
        }

        public Criteria andR033NotLike(String value) {
            addCriterion("R033 not like", value, "r033");
            return (Criteria) this;
        }

        public Criteria andR033In(List<String> values) {
            addCriterion("R033 in", values, "r033");
            return (Criteria) this;
        }

        public Criteria andR033NotIn(List<String> values) {
            addCriterion("R033 not in", values, "r033");
            return (Criteria) this;
        }

        public Criteria andR033Between(String value1, String value2) {
            addCriterion("R033 between", value1, value2, "r033");
            return (Criteria) this;
        }

        public Criteria andR033NotBetween(String value1, String value2) {
            addCriterion("R033 not between", value1, value2, "r033");
            return (Criteria) this;
        }

        public Criteria andR034IsNull() {
            addCriterion("R034 is null");
            return (Criteria) this;
        }

        public Criteria andR034IsNotNull() {
            addCriterion("R034 is not null");
            return (Criteria) this;
        }

        public Criteria andR034EqualTo(String value) {
            addCriterion("R034 =", value, "r034");
            return (Criteria) this;
        }

        public Criteria andR034NotEqualTo(String value) {
            addCriterion("R034 <>", value, "r034");
            return (Criteria) this;
        }

        public Criteria andR034GreaterThan(String value) {
            addCriterion("R034 >", value, "r034");
            return (Criteria) this;
        }

        public Criteria andR034GreaterThanOrEqualTo(String value) {
            addCriterion("R034 >=", value, "r034");
            return (Criteria) this;
        }

        public Criteria andR034LessThan(String value) {
            addCriterion("R034 <", value, "r034");
            return (Criteria) this;
        }

        public Criteria andR034LessThanOrEqualTo(String value) {
            addCriterion("R034 <=", value, "r034");
            return (Criteria) this;
        }

        public Criteria andR034Like(String value) {
            addCriterion("R034 like", value, "r034");
            return (Criteria) this;
        }

        public Criteria andR034NotLike(String value) {
            addCriterion("R034 not like", value, "r034");
            return (Criteria) this;
        }

        public Criteria andR034In(List<String> values) {
            addCriterion("R034 in", values, "r034");
            return (Criteria) this;
        }

        public Criteria andR034NotIn(List<String> values) {
            addCriterion("R034 not in", values, "r034");
            return (Criteria) this;
        }

        public Criteria andR034Between(String value1, String value2) {
            addCriterion("R034 between", value1, value2, "r034");
            return (Criteria) this;
        }

        public Criteria andR034NotBetween(String value1, String value2) {
            addCriterion("R034 not between", value1, value2, "r034");
            return (Criteria) this;
        }

        public Criteria andR035IsNull() {
            addCriterion("R035 is null");
            return (Criteria) this;
        }

        public Criteria andR035IsNotNull() {
            addCriterion("R035 is not null");
            return (Criteria) this;
        }

        public Criteria andR035EqualTo(String value) {
            addCriterion("R035 =", value, "r035");
            return (Criteria) this;
        }

        public Criteria andR035NotEqualTo(String value) {
            addCriterion("R035 <>", value, "r035");
            return (Criteria) this;
        }

        public Criteria andR035GreaterThan(String value) {
            addCriterion("R035 >", value, "r035");
            return (Criteria) this;
        }

        public Criteria andR035GreaterThanOrEqualTo(String value) {
            addCriterion("R035 >=", value, "r035");
            return (Criteria) this;
        }

        public Criteria andR035LessThan(String value) {
            addCriterion("R035 <", value, "r035");
            return (Criteria) this;
        }

        public Criteria andR035LessThanOrEqualTo(String value) {
            addCriterion("R035 <=", value, "r035");
            return (Criteria) this;
        }

        public Criteria andR035Like(String value) {
            addCriterion("R035 like", value, "r035");
            return (Criteria) this;
        }

        public Criteria andR035NotLike(String value) {
            addCriterion("R035 not like", value, "r035");
            return (Criteria) this;
        }

        public Criteria andR035In(List<String> values) {
            addCriterion("R035 in", values, "r035");
            return (Criteria) this;
        }

        public Criteria andR035NotIn(List<String> values) {
            addCriterion("R035 not in", values, "r035");
            return (Criteria) this;
        }

        public Criteria andR035Between(String value1, String value2) {
            addCriterion("R035 between", value1, value2, "r035");
            return (Criteria) this;
        }

        public Criteria andR035NotBetween(String value1, String value2) {
            addCriterion("R035 not between", value1, value2, "r035");
            return (Criteria) this;
        }

        public Criteria andR036IsNull() {
            addCriterion("R036 is null");
            return (Criteria) this;
        }

        public Criteria andR036IsNotNull() {
            addCriterion("R036 is not null");
            return (Criteria) this;
        }

        public Criteria andR036EqualTo(String value) {
            addCriterion("R036 =", value, "r036");
            return (Criteria) this;
        }

        public Criteria andR036NotEqualTo(String value) {
            addCriterion("R036 <>", value, "r036");
            return (Criteria) this;
        }

        public Criteria andR036GreaterThan(String value) {
            addCriterion("R036 >", value, "r036");
            return (Criteria) this;
        }

        public Criteria andR036GreaterThanOrEqualTo(String value) {
            addCriterion("R036 >=", value, "r036");
            return (Criteria) this;
        }

        public Criteria andR036LessThan(String value) {
            addCriterion("R036 <", value, "r036");
            return (Criteria) this;
        }

        public Criteria andR036LessThanOrEqualTo(String value) {
            addCriterion("R036 <=", value, "r036");
            return (Criteria) this;
        }

        public Criteria andR036Like(String value) {
            addCriterion("R036 like", value, "r036");
            return (Criteria) this;
        }

        public Criteria andR036NotLike(String value) {
            addCriterion("R036 not like", value, "r036");
            return (Criteria) this;
        }

        public Criteria andR036In(List<String> values) {
            addCriterion("R036 in", values, "r036");
            return (Criteria) this;
        }

        public Criteria andR036NotIn(List<String> values) {
            addCriterion("R036 not in", values, "r036");
            return (Criteria) this;
        }

        public Criteria andR036Between(String value1, String value2) {
            addCriterion("R036 between", value1, value2, "r036");
            return (Criteria) this;
        }

        public Criteria andR036NotBetween(String value1, String value2) {
            addCriterion("R036 not between", value1, value2, "r036");
            return (Criteria) this;
        }

        public Criteria andR037IsNull() {
            addCriterion("R037 is null");
            return (Criteria) this;
        }

        public Criteria andR037IsNotNull() {
            addCriterion("R037 is not null");
            return (Criteria) this;
        }

        public Criteria andR037EqualTo(String value) {
            addCriterion("R037 =", value, "r037");
            return (Criteria) this;
        }

        public Criteria andR037NotEqualTo(String value) {
            addCriterion("R037 <>", value, "r037");
            return (Criteria) this;
        }

        public Criteria andR037GreaterThan(String value) {
            addCriterion("R037 >", value, "r037");
            return (Criteria) this;
        }

        public Criteria andR037GreaterThanOrEqualTo(String value) {
            addCriterion("R037 >=", value, "r037");
            return (Criteria) this;
        }

        public Criteria andR037LessThan(String value) {
            addCriterion("R037 <", value, "r037");
            return (Criteria) this;
        }

        public Criteria andR037LessThanOrEqualTo(String value) {
            addCriterion("R037 <=", value, "r037");
            return (Criteria) this;
        }

        public Criteria andR037Like(String value) {
            addCriterion("R037 like", value, "r037");
            return (Criteria) this;
        }

        public Criteria andR037NotLike(String value) {
            addCriterion("R037 not like", value, "r037");
            return (Criteria) this;
        }

        public Criteria andR037In(List<String> values) {
            addCriterion("R037 in", values, "r037");
            return (Criteria) this;
        }

        public Criteria andR037NotIn(List<String> values) {
            addCriterion("R037 not in", values, "r037");
            return (Criteria) this;
        }

        public Criteria andR037Between(String value1, String value2) {
            addCriterion("R037 between", value1, value2, "r037");
            return (Criteria) this;
        }

        public Criteria andR037NotBetween(String value1, String value2) {
            addCriterion("R037 not between", value1, value2, "r037");
            return (Criteria) this;
        }

        public Criteria andR038IsNull() {
            addCriterion("R038 is null");
            return (Criteria) this;
        }

        public Criteria andR038IsNotNull() {
            addCriterion("R038 is not null");
            return (Criteria) this;
        }

        public Criteria andR038EqualTo(String value) {
            addCriterion("R038 =", value, "r038");
            return (Criteria) this;
        }

        public Criteria andR038NotEqualTo(String value) {
            addCriterion("R038 <>", value, "r038");
            return (Criteria) this;
        }

        public Criteria andR038GreaterThan(String value) {
            addCriterion("R038 >", value, "r038");
            return (Criteria) this;
        }

        public Criteria andR038GreaterThanOrEqualTo(String value) {
            addCriterion("R038 >=", value, "r038");
            return (Criteria) this;
        }

        public Criteria andR038LessThan(String value) {
            addCriterion("R038 <", value, "r038");
            return (Criteria) this;
        }

        public Criteria andR038LessThanOrEqualTo(String value) {
            addCriterion("R038 <=", value, "r038");
            return (Criteria) this;
        }

        public Criteria andR038Like(String value) {
            addCriterion("R038 like", value, "r038");
            return (Criteria) this;
        }

        public Criteria andR038NotLike(String value) {
            addCriterion("R038 not like", value, "r038");
            return (Criteria) this;
        }

        public Criteria andR038In(List<String> values) {
            addCriterion("R038 in", values, "r038");
            return (Criteria) this;
        }

        public Criteria andR038NotIn(List<String> values) {
            addCriterion("R038 not in", values, "r038");
            return (Criteria) this;
        }

        public Criteria andR038Between(String value1, String value2) {
            addCriterion("R038 between", value1, value2, "r038");
            return (Criteria) this;
        }

        public Criteria andR038NotBetween(String value1, String value2) {
            addCriterion("R038 not between", value1, value2, "r038");
            return (Criteria) this;
        }

        public Criteria andR039IsNull() {
            addCriterion("R039 is null");
            return (Criteria) this;
        }

        public Criteria andR039IsNotNull() {
            addCriterion("R039 is not null");
            return (Criteria) this;
        }

        public Criteria andR039EqualTo(String value) {
            addCriterion("R039 =", value, "r039");
            return (Criteria) this;
        }

        public Criteria andR039NotEqualTo(String value) {
            addCriterion("R039 <>", value, "r039");
            return (Criteria) this;
        }

        public Criteria andR039GreaterThan(String value) {
            addCriterion("R039 >", value, "r039");
            return (Criteria) this;
        }

        public Criteria andR039GreaterThanOrEqualTo(String value) {
            addCriterion("R039 >=", value, "r039");
            return (Criteria) this;
        }

        public Criteria andR039LessThan(String value) {
            addCriterion("R039 <", value, "r039");
            return (Criteria) this;
        }

        public Criteria andR039LessThanOrEqualTo(String value) {
            addCriterion("R039 <=", value, "r039");
            return (Criteria) this;
        }

        public Criteria andR039Like(String value) {
            addCriterion("R039 like", value, "r039");
            return (Criteria) this;
        }

        public Criteria andR039NotLike(String value) {
            addCriterion("R039 not like", value, "r039");
            return (Criteria) this;
        }

        public Criteria andR039In(List<String> values) {
            addCriterion("R039 in", values, "r039");
            return (Criteria) this;
        }

        public Criteria andR039NotIn(List<String> values) {
            addCriterion("R039 not in", values, "r039");
            return (Criteria) this;
        }

        public Criteria andR039Between(String value1, String value2) {
            addCriterion("R039 between", value1, value2, "r039");
            return (Criteria) this;
        }

        public Criteria andR039NotBetween(String value1, String value2) {
            addCriterion("R039 not between", value1, value2, "r039");
            return (Criteria) this;
        }

        public Criteria andR040IsNull() {
            addCriterion("R040 is null");
            return (Criteria) this;
        }

        public Criteria andR040IsNotNull() {
            addCriterion("R040 is not null");
            return (Criteria) this;
        }

        public Criteria andR040EqualTo(String value) {
            addCriterion("R040 =", value, "r040");
            return (Criteria) this;
        }

        public Criteria andR040NotEqualTo(String value) {
            addCriterion("R040 <>", value, "r040");
            return (Criteria) this;
        }

        public Criteria andR040GreaterThan(String value) {
            addCriterion("R040 >", value, "r040");
            return (Criteria) this;
        }

        public Criteria andR040GreaterThanOrEqualTo(String value) {
            addCriterion("R040 >=", value, "r040");
            return (Criteria) this;
        }

        public Criteria andR040LessThan(String value) {
            addCriterion("R040 <", value, "r040");
            return (Criteria) this;
        }

        public Criteria andR040LessThanOrEqualTo(String value) {
            addCriterion("R040 <=", value, "r040");
            return (Criteria) this;
        }

        public Criteria andR040Like(String value) {
            addCriterion("R040 like", value, "r040");
            return (Criteria) this;
        }

        public Criteria andR040NotLike(String value) {
            addCriterion("R040 not like", value, "r040");
            return (Criteria) this;
        }

        public Criteria andR040In(List<String> values) {
            addCriterion("R040 in", values, "r040");
            return (Criteria) this;
        }

        public Criteria andR040NotIn(List<String> values) {
            addCriterion("R040 not in", values, "r040");
            return (Criteria) this;
        }

        public Criteria andR040Between(String value1, String value2) {
            addCriterion("R040 between", value1, value2, "r040");
            return (Criteria) this;
        }

        public Criteria andR040NotBetween(String value1, String value2) {
            addCriterion("R040 not between", value1, value2, "r040");
            return (Criteria) this;
        }

        public Criteria andR041IsNull() {
            addCriterion("R041 is null");
            return (Criteria) this;
        }

        public Criteria andR041IsNotNull() {
            addCriterion("R041 is not null");
            return (Criteria) this;
        }

        public Criteria andR041EqualTo(String value) {
            addCriterion("R041 =", value, "r041");
            return (Criteria) this;
        }

        public Criteria andR041NotEqualTo(String value) {
            addCriterion("R041 <>", value, "r041");
            return (Criteria) this;
        }

        public Criteria andR041GreaterThan(String value) {
            addCriterion("R041 >", value, "r041");
            return (Criteria) this;
        }

        public Criteria andR041GreaterThanOrEqualTo(String value) {
            addCriterion("R041 >=", value, "r041");
            return (Criteria) this;
        }

        public Criteria andR041LessThan(String value) {
            addCriterion("R041 <", value, "r041");
            return (Criteria) this;
        }

        public Criteria andR041LessThanOrEqualTo(String value) {
            addCriterion("R041 <=", value, "r041");
            return (Criteria) this;
        }

        public Criteria andR041Like(String value) {
            addCriterion("R041 like", value, "r041");
            return (Criteria) this;
        }

        public Criteria andR041NotLike(String value) {
            addCriterion("R041 not like", value, "r041");
            return (Criteria) this;
        }

        public Criteria andR041In(List<String> values) {
            addCriterion("R041 in", values, "r041");
            return (Criteria) this;
        }

        public Criteria andR041NotIn(List<String> values) {
            addCriterion("R041 not in", values, "r041");
            return (Criteria) this;
        }

        public Criteria andR041Between(String value1, String value2) {
            addCriterion("R041 between", value1, value2, "r041");
            return (Criteria) this;
        }

        public Criteria andR041NotBetween(String value1, String value2) {
            addCriterion("R041 not between", value1, value2, "r041");
            return (Criteria) this;
        }

        public Criteria andR042IsNull() {
            addCriterion("R042 is null");
            return (Criteria) this;
        }

        public Criteria andR042IsNotNull() {
            addCriterion("R042 is not null");
            return (Criteria) this;
        }

        public Criteria andR042EqualTo(String value) {
            addCriterion("R042 =", value, "r042");
            return (Criteria) this;
        }

        public Criteria andR042NotEqualTo(String value) {
            addCriterion("R042 <>", value, "r042");
            return (Criteria) this;
        }

        public Criteria andR042GreaterThan(String value) {
            addCriterion("R042 >", value, "r042");
            return (Criteria) this;
        }

        public Criteria andR042GreaterThanOrEqualTo(String value) {
            addCriterion("R042 >=", value, "r042");
            return (Criteria) this;
        }

        public Criteria andR042LessThan(String value) {
            addCriterion("R042 <", value, "r042");
            return (Criteria) this;
        }

        public Criteria andR042LessThanOrEqualTo(String value) {
            addCriterion("R042 <=", value, "r042");
            return (Criteria) this;
        }

        public Criteria andR042Like(String value) {
            addCriterion("R042 like", value, "r042");
            return (Criteria) this;
        }

        public Criteria andR042NotLike(String value) {
            addCriterion("R042 not like", value, "r042");
            return (Criteria) this;
        }

        public Criteria andR042In(List<String> values) {
            addCriterion("R042 in", values, "r042");
            return (Criteria) this;
        }

        public Criteria andR042NotIn(List<String> values) {
            addCriterion("R042 not in", values, "r042");
            return (Criteria) this;
        }

        public Criteria andR042Between(String value1, String value2) {
            addCriterion("R042 between", value1, value2, "r042");
            return (Criteria) this;
        }

        public Criteria andR042NotBetween(String value1, String value2) {
            addCriterion("R042 not between", value1, value2, "r042");
            return (Criteria) this;
        }

        public Criteria andR043IsNull() {
            addCriterion("R043 is null");
            return (Criteria) this;
        }

        public Criteria andR043IsNotNull() {
            addCriterion("R043 is not null");
            return (Criteria) this;
        }

        public Criteria andR043EqualTo(String value) {
            addCriterion("R043 =", value, "r043");
            return (Criteria) this;
        }

        public Criteria andR043NotEqualTo(String value) {
            addCriterion("R043 <>", value, "r043");
            return (Criteria) this;
        }

        public Criteria andR043GreaterThan(String value) {
            addCriterion("R043 >", value, "r043");
            return (Criteria) this;
        }

        public Criteria andR043GreaterThanOrEqualTo(String value) {
            addCriterion("R043 >=", value, "r043");
            return (Criteria) this;
        }

        public Criteria andR043LessThan(String value) {
            addCriterion("R043 <", value, "r043");
            return (Criteria) this;
        }

        public Criteria andR043LessThanOrEqualTo(String value) {
            addCriterion("R043 <=", value, "r043");
            return (Criteria) this;
        }

        public Criteria andR043Like(String value) {
            addCriterion("R043 like", value, "r043");
            return (Criteria) this;
        }

        public Criteria andR043NotLike(String value) {
            addCriterion("R043 not like", value, "r043");
            return (Criteria) this;
        }

        public Criteria andR043In(List<String> values) {
            addCriterion("R043 in", values, "r043");
            return (Criteria) this;
        }

        public Criteria andR043NotIn(List<String> values) {
            addCriterion("R043 not in", values, "r043");
            return (Criteria) this;
        }

        public Criteria andR043Between(String value1, String value2) {
            addCriterion("R043 between", value1, value2, "r043");
            return (Criteria) this;
        }

        public Criteria andR043NotBetween(String value1, String value2) {
            addCriterion("R043 not between", value1, value2, "r043");
            return (Criteria) this;
        }

        public Criteria andR044IsNull() {
            addCriterion("R044 is null");
            return (Criteria) this;
        }

        public Criteria andR044IsNotNull() {
            addCriterion("R044 is not null");
            return (Criteria) this;
        }

        public Criteria andR044EqualTo(String value) {
            addCriterion("R044 =", value, "r044");
            return (Criteria) this;
        }

        public Criteria andR044NotEqualTo(String value) {
            addCriterion("R044 <>", value, "r044");
            return (Criteria) this;
        }

        public Criteria andR044GreaterThan(String value) {
            addCriterion("R044 >", value, "r044");
            return (Criteria) this;
        }

        public Criteria andR044GreaterThanOrEqualTo(String value) {
            addCriterion("R044 >=", value, "r044");
            return (Criteria) this;
        }

        public Criteria andR044LessThan(String value) {
            addCriterion("R044 <", value, "r044");
            return (Criteria) this;
        }

        public Criteria andR044LessThanOrEqualTo(String value) {
            addCriterion("R044 <=", value, "r044");
            return (Criteria) this;
        }

        public Criteria andR044Like(String value) {
            addCriterion("R044 like", value, "r044");
            return (Criteria) this;
        }

        public Criteria andR044NotLike(String value) {
            addCriterion("R044 not like", value, "r044");
            return (Criteria) this;
        }

        public Criteria andR044In(List<String> values) {
            addCriterion("R044 in", values, "r044");
            return (Criteria) this;
        }

        public Criteria andR044NotIn(List<String> values) {
            addCriterion("R044 not in", values, "r044");
            return (Criteria) this;
        }

        public Criteria andR044Between(String value1, String value2) {
            addCriterion("R044 between", value1, value2, "r044");
            return (Criteria) this;
        }

        public Criteria andR044NotBetween(String value1, String value2) {
            addCriterion("R044 not between", value1, value2, "r044");
            return (Criteria) this;
        }

        public Criteria andR045IsNull() {
            addCriterion("R045 is null");
            return (Criteria) this;
        }

        public Criteria andR045IsNotNull() {
            addCriterion("R045 is not null");
            return (Criteria) this;
        }

        public Criteria andR045EqualTo(String value) {
            addCriterion("R045 =", value, "r045");
            return (Criteria) this;
        }

        public Criteria andR045NotEqualTo(String value) {
            addCriterion("R045 <>", value, "r045");
            return (Criteria) this;
        }

        public Criteria andR045GreaterThan(String value) {
            addCriterion("R045 >", value, "r045");
            return (Criteria) this;
        }

        public Criteria andR045GreaterThanOrEqualTo(String value) {
            addCriterion("R045 >=", value, "r045");
            return (Criteria) this;
        }

        public Criteria andR045LessThan(String value) {
            addCriterion("R045 <", value, "r045");
            return (Criteria) this;
        }

        public Criteria andR045LessThanOrEqualTo(String value) {
            addCriterion("R045 <=", value, "r045");
            return (Criteria) this;
        }

        public Criteria andR045Like(String value) {
            addCriterion("R045 like", value, "r045");
            return (Criteria) this;
        }

        public Criteria andR045NotLike(String value) {
            addCriterion("R045 not like", value, "r045");
            return (Criteria) this;
        }

        public Criteria andR045In(List<String> values) {
            addCriterion("R045 in", values, "r045");
            return (Criteria) this;
        }

        public Criteria andR045NotIn(List<String> values) {
            addCriterion("R045 not in", values, "r045");
            return (Criteria) this;
        }

        public Criteria andR045Between(String value1, String value2) {
            addCriterion("R045 between", value1, value2, "r045");
            return (Criteria) this;
        }

        public Criteria andR045NotBetween(String value1, String value2) {
            addCriterion("R045 not between", value1, value2, "r045");
            return (Criteria) this;
        }

        public Criteria andR046IsNull() {
            addCriterion("R046 is null");
            return (Criteria) this;
        }

        public Criteria andR046IsNotNull() {
            addCriterion("R046 is not null");
            return (Criteria) this;
        }

        public Criteria andR046EqualTo(String value) {
            addCriterion("R046 =", value, "r046");
            return (Criteria) this;
        }

        public Criteria andR046NotEqualTo(String value) {
            addCriterion("R046 <>", value, "r046");
            return (Criteria) this;
        }

        public Criteria andR046GreaterThan(String value) {
            addCriterion("R046 >", value, "r046");
            return (Criteria) this;
        }

        public Criteria andR046GreaterThanOrEqualTo(String value) {
            addCriterion("R046 >=", value, "r046");
            return (Criteria) this;
        }

        public Criteria andR046LessThan(String value) {
            addCriterion("R046 <", value, "r046");
            return (Criteria) this;
        }

        public Criteria andR046LessThanOrEqualTo(String value) {
            addCriterion("R046 <=", value, "r046");
            return (Criteria) this;
        }

        public Criteria andR046Like(String value) {
            addCriterion("R046 like", value, "r046");
            return (Criteria) this;
        }

        public Criteria andR046NotLike(String value) {
            addCriterion("R046 not like", value, "r046");
            return (Criteria) this;
        }

        public Criteria andR046In(List<String> values) {
            addCriterion("R046 in", values, "r046");
            return (Criteria) this;
        }

        public Criteria andR046NotIn(List<String> values) {
            addCriterion("R046 not in", values, "r046");
            return (Criteria) this;
        }

        public Criteria andR046Between(String value1, String value2) {
            addCriterion("R046 between", value1, value2, "r046");
            return (Criteria) this;
        }

        public Criteria andR046NotBetween(String value1, String value2) {
            addCriterion("R046 not between", value1, value2, "r046");
            return (Criteria) this;
        }

        public Criteria andR047IsNull() {
            addCriterion("R047 is null");
            return (Criteria) this;
        }

        public Criteria andR047IsNotNull() {
            addCriterion("R047 is not null");
            return (Criteria) this;
        }

        public Criteria andR047EqualTo(String value) {
            addCriterion("R047 =", value, "r047");
            return (Criteria) this;
        }

        public Criteria andR047NotEqualTo(String value) {
            addCriterion("R047 <>", value, "r047");
            return (Criteria) this;
        }

        public Criteria andR047GreaterThan(String value) {
            addCriterion("R047 >", value, "r047");
            return (Criteria) this;
        }

        public Criteria andR047GreaterThanOrEqualTo(String value) {
            addCriterion("R047 >=", value, "r047");
            return (Criteria) this;
        }

        public Criteria andR047LessThan(String value) {
            addCriterion("R047 <", value, "r047");
            return (Criteria) this;
        }

        public Criteria andR047LessThanOrEqualTo(String value) {
            addCriterion("R047 <=", value, "r047");
            return (Criteria) this;
        }

        public Criteria andR047Like(String value) {
            addCriterion("R047 like", value, "r047");
            return (Criteria) this;
        }

        public Criteria andR047NotLike(String value) {
            addCriterion("R047 not like", value, "r047");
            return (Criteria) this;
        }

        public Criteria andR047In(List<String> values) {
            addCriterion("R047 in", values, "r047");
            return (Criteria) this;
        }

        public Criteria andR047NotIn(List<String> values) {
            addCriterion("R047 not in", values, "r047");
            return (Criteria) this;
        }

        public Criteria andR047Between(String value1, String value2) {
            addCriterion("R047 between", value1, value2, "r047");
            return (Criteria) this;
        }

        public Criteria andR047NotBetween(String value1, String value2) {
            addCriterion("R047 not between", value1, value2, "r047");
            return (Criteria) this;
        }

        public Criteria andR048IsNull() {
            addCriterion("R048 is null");
            return (Criteria) this;
        }

        public Criteria andR048IsNotNull() {
            addCriterion("R048 is not null");
            return (Criteria) this;
        }

        public Criteria andR048EqualTo(String value) {
            addCriterion("R048 =", value, "r048");
            return (Criteria) this;
        }

        public Criteria andR048NotEqualTo(String value) {
            addCriterion("R048 <>", value, "r048");
            return (Criteria) this;
        }

        public Criteria andR048GreaterThan(String value) {
            addCriterion("R048 >", value, "r048");
            return (Criteria) this;
        }

        public Criteria andR048GreaterThanOrEqualTo(String value) {
            addCriterion("R048 >=", value, "r048");
            return (Criteria) this;
        }

        public Criteria andR048LessThan(String value) {
            addCriterion("R048 <", value, "r048");
            return (Criteria) this;
        }

        public Criteria andR048LessThanOrEqualTo(String value) {
            addCriterion("R048 <=", value, "r048");
            return (Criteria) this;
        }

        public Criteria andR048Like(String value) {
            addCriterion("R048 like", value, "r048");
            return (Criteria) this;
        }

        public Criteria andR048NotLike(String value) {
            addCriterion("R048 not like", value, "r048");
            return (Criteria) this;
        }

        public Criteria andR048In(List<String> values) {
            addCriterion("R048 in", values, "r048");
            return (Criteria) this;
        }

        public Criteria andR048NotIn(List<String> values) {
            addCriterion("R048 not in", values, "r048");
            return (Criteria) this;
        }

        public Criteria andR048Between(String value1, String value2) {
            addCriterion("R048 between", value1, value2, "r048");
            return (Criteria) this;
        }

        public Criteria andR048NotBetween(String value1, String value2) {
            addCriterion("R048 not between", value1, value2, "r048");
            return (Criteria) this;
        }

        public Criteria andR049IsNull() {
            addCriterion("R049 is null");
            return (Criteria) this;
        }

        public Criteria andR049IsNotNull() {
            addCriterion("R049 is not null");
            return (Criteria) this;
        }

        public Criteria andR049EqualTo(String value) {
            addCriterion("R049 =", value, "r049");
            return (Criteria) this;
        }

        public Criteria andR049NotEqualTo(String value) {
            addCriterion("R049 <>", value, "r049");
            return (Criteria) this;
        }

        public Criteria andR049GreaterThan(String value) {
            addCriterion("R049 >", value, "r049");
            return (Criteria) this;
        }

        public Criteria andR049GreaterThanOrEqualTo(String value) {
            addCriterion("R049 >=", value, "r049");
            return (Criteria) this;
        }

        public Criteria andR049LessThan(String value) {
            addCriterion("R049 <", value, "r049");
            return (Criteria) this;
        }

        public Criteria andR049LessThanOrEqualTo(String value) {
            addCriterion("R049 <=", value, "r049");
            return (Criteria) this;
        }

        public Criteria andR049Like(String value) {
            addCriterion("R049 like", value, "r049");
            return (Criteria) this;
        }

        public Criteria andR049NotLike(String value) {
            addCriterion("R049 not like", value, "r049");
            return (Criteria) this;
        }

        public Criteria andR049In(List<String> values) {
            addCriterion("R049 in", values, "r049");
            return (Criteria) this;
        }

        public Criteria andR049NotIn(List<String> values) {
            addCriterion("R049 not in", values, "r049");
            return (Criteria) this;
        }

        public Criteria andR049Between(String value1, String value2) {
            addCriterion("R049 between", value1, value2, "r049");
            return (Criteria) this;
        }

        public Criteria andR049NotBetween(String value1, String value2) {
            addCriterion("R049 not between", value1, value2, "r049");
            return (Criteria) this;
        }

        public Criteria andR050IsNull() {
            addCriterion("R050 is null");
            return (Criteria) this;
        }

        public Criteria andR050IsNotNull() {
            addCriterion("R050 is not null");
            return (Criteria) this;
        }

        public Criteria andR050EqualTo(String value) {
            addCriterion("R050 =", value, "r050");
            return (Criteria) this;
        }

        public Criteria andR050NotEqualTo(String value) {
            addCriterion("R050 <>", value, "r050");
            return (Criteria) this;
        }

        public Criteria andR050GreaterThan(String value) {
            addCriterion("R050 >", value, "r050");
            return (Criteria) this;
        }

        public Criteria andR050GreaterThanOrEqualTo(String value) {
            addCriterion("R050 >=", value, "r050");
            return (Criteria) this;
        }

        public Criteria andR050LessThan(String value) {
            addCriterion("R050 <", value, "r050");
            return (Criteria) this;
        }

        public Criteria andR050LessThanOrEqualTo(String value) {
            addCriterion("R050 <=", value, "r050");
            return (Criteria) this;
        }

        public Criteria andR050Like(String value) {
            addCriterion("R050 like", value, "r050");
            return (Criteria) this;
        }

        public Criteria andR050NotLike(String value) {
            addCriterion("R050 not like", value, "r050");
            return (Criteria) this;
        }

        public Criteria andR050In(List<String> values) {
            addCriterion("R050 in", values, "r050");
            return (Criteria) this;
        }

        public Criteria andR050NotIn(List<String> values) {
            addCriterion("R050 not in", values, "r050");
            return (Criteria) this;
        }

        public Criteria andR050Between(String value1, String value2) {
            addCriterion("R050 between", value1, value2, "r050");
            return (Criteria) this;
        }

        public Criteria andR050NotBetween(String value1, String value2) {
            addCriterion("R050 not between", value1, value2, "r050");
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