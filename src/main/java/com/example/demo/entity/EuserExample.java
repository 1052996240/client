package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class EuserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EuserExample() {
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

        public Criteria andU001IsNull() {
            addCriterion("U001 is null");
            return (Criteria) this;
        }

        public Criteria andU001IsNotNull() {
            addCriterion("U001 is not null");
            return (Criteria) this;
        }

        public Criteria andU001EqualTo(String value) {
            addCriterion("U001 =", value, "u001");
            return (Criteria) this;
        }

        public Criteria andU001NotEqualTo(String value) {
            addCriterion("U001 <>", value, "u001");
            return (Criteria) this;
        }

        public Criteria andU001GreaterThan(String value) {
            addCriterion("U001 >", value, "u001");
            return (Criteria) this;
        }

        public Criteria andU001GreaterThanOrEqualTo(String value) {
            addCriterion("U001 >=", value, "u001");
            return (Criteria) this;
        }

        public Criteria andU001LessThan(String value) {
            addCriterion("U001 <", value, "u001");
            return (Criteria) this;
        }

        public Criteria andU001LessThanOrEqualTo(String value) {
            addCriterion("U001 <=", value, "u001");
            return (Criteria) this;
        }

        public Criteria andU001Like(String value) {
            addCriterion("U001 like", value, "u001");
            return (Criteria) this;
        }

        public Criteria andU001NotLike(String value) {
            addCriterion("U001 not like", value, "u001");
            return (Criteria) this;
        }

        public Criteria andU001In(List<String> values) {
            addCriterion("U001 in", values, "u001");
            return (Criteria) this;
        }

        public Criteria andU001NotIn(List<String> values) {
            addCriterion("U001 not in", values, "u001");
            return (Criteria) this;
        }

        public Criteria andU001Between(String value1, String value2) {
            addCriterion("U001 between", value1, value2, "u001");
            return (Criteria) this;
        }

        public Criteria andU001NotBetween(String value1, String value2) {
            addCriterion("U001 not between", value1, value2, "u001");
            return (Criteria) this;
        }

        public Criteria andU002IsNull() {
            addCriterion("U002 is null");
            return (Criteria) this;
        }

        public Criteria andU002IsNotNull() {
            addCriterion("U002 is not null");
            return (Criteria) this;
        }

        public Criteria andU002EqualTo(String value) {
            addCriterion("U002 =", value, "u002");
            return (Criteria) this;
        }

        public Criteria andU002NotEqualTo(String value) {
            addCriterion("U002 <>", value, "u002");
            return (Criteria) this;
        }

        public Criteria andU002GreaterThan(String value) {
            addCriterion("U002 >", value, "u002");
            return (Criteria) this;
        }

        public Criteria andU002GreaterThanOrEqualTo(String value) {
            addCriterion("U002 >=", value, "u002");
            return (Criteria) this;
        }

        public Criteria andU002LessThan(String value) {
            addCriterion("U002 <", value, "u002");
            return (Criteria) this;
        }

        public Criteria andU002LessThanOrEqualTo(String value) {
            addCriterion("U002 <=", value, "u002");
            return (Criteria) this;
        }

        public Criteria andU002Like(String value) {
            addCriterion("U002 like", value, "u002");
            return (Criteria) this;
        }

        public Criteria andU002NotLike(String value) {
            addCriterion("U002 not like", value, "u002");
            return (Criteria) this;
        }

        public Criteria andU002In(List<String> values) {
            addCriterion("U002 in", values, "u002");
            return (Criteria) this;
        }

        public Criteria andU002NotIn(List<String> values) {
            addCriterion("U002 not in", values, "u002");
            return (Criteria) this;
        }

        public Criteria andU002Between(String value1, String value2) {
            addCriterion("U002 between", value1, value2, "u002");
            return (Criteria) this;
        }

        public Criteria andU002NotBetween(String value1, String value2) {
            addCriterion("U002 not between", value1, value2, "u002");
            return (Criteria) this;
        }

        public Criteria andU003IsNull() {
            addCriterion("U003 is null");
            return (Criteria) this;
        }

        public Criteria andU003IsNotNull() {
            addCriterion("U003 is not null");
            return (Criteria) this;
        }

        public Criteria andU003EqualTo(String value) {
            addCriterion("U003 =", value, "u003");
            return (Criteria) this;
        }

        public Criteria andU003NotEqualTo(String value) {
            addCriterion("U003 <>", value, "u003");
            return (Criteria) this;
        }

        public Criteria andU003GreaterThan(String value) {
            addCriterion("U003 >", value, "u003");
            return (Criteria) this;
        }

        public Criteria andU003GreaterThanOrEqualTo(String value) {
            addCriterion("U003 >=", value, "u003");
            return (Criteria) this;
        }

        public Criteria andU003LessThan(String value) {
            addCriterion("U003 <", value, "u003");
            return (Criteria) this;
        }

        public Criteria andU003LessThanOrEqualTo(String value) {
            addCriterion("U003 <=", value, "u003");
            return (Criteria) this;
        }

        public Criteria andU003Like(String value) {
            addCriterion("U003 like", value, "u003");
            return (Criteria) this;
        }

        public Criteria andU003NotLike(String value) {
            addCriterion("U003 not like", value, "u003");
            return (Criteria) this;
        }

        public Criteria andU003In(List<String> values) {
            addCriterion("U003 in", values, "u003");
            return (Criteria) this;
        }

        public Criteria andU003NotIn(List<String> values) {
            addCriterion("U003 not in", values, "u003");
            return (Criteria) this;
        }

        public Criteria andU003Between(String value1, String value2) {
            addCriterion("U003 between", value1, value2, "u003");
            return (Criteria) this;
        }

        public Criteria andU003NotBetween(String value1, String value2) {
            addCriterion("U003 not between", value1, value2, "u003");
            return (Criteria) this;
        }

        public Criteria andU004IsNull() {
            addCriterion("U004 is null");
            return (Criteria) this;
        }

        public Criteria andU004IsNotNull() {
            addCriterion("U004 is not null");
            return (Criteria) this;
        }

        public Criteria andU004EqualTo(String value) {
            addCriterion("U004 =", value, "u004");
            return (Criteria) this;
        }

        public Criteria andU004NotEqualTo(String value) {
            addCriterion("U004 <>", value, "u004");
            return (Criteria) this;
        }

        public Criteria andU004GreaterThan(String value) {
            addCriterion("U004 >", value, "u004");
            return (Criteria) this;
        }

        public Criteria andU004GreaterThanOrEqualTo(String value) {
            addCriterion("U004 >=", value, "u004");
            return (Criteria) this;
        }

        public Criteria andU004LessThan(String value) {
            addCriterion("U004 <", value, "u004");
            return (Criteria) this;
        }

        public Criteria andU004LessThanOrEqualTo(String value) {
            addCriterion("U004 <=", value, "u004");
            return (Criteria) this;
        }

        public Criteria andU004Like(String value) {
            addCriterion("U004 like", value, "u004");
            return (Criteria) this;
        }

        public Criteria andU004NotLike(String value) {
            addCriterion("U004 not like", value, "u004");
            return (Criteria) this;
        }

        public Criteria andU004In(List<String> values) {
            addCriterion("U004 in", values, "u004");
            return (Criteria) this;
        }

        public Criteria andU004NotIn(List<String> values) {
            addCriterion("U004 not in", values, "u004");
            return (Criteria) this;
        }

        public Criteria andU004Between(String value1, String value2) {
            addCriterion("U004 between", value1, value2, "u004");
            return (Criteria) this;
        }

        public Criteria andU004NotBetween(String value1, String value2) {
            addCriterion("U004 not between", value1, value2, "u004");
            return (Criteria) this;
        }

        public Criteria andU005IsNull() {
            addCriterion("U005 is null");
            return (Criteria) this;
        }

        public Criteria andU005IsNotNull() {
            addCriterion("U005 is not null");
            return (Criteria) this;
        }

        public Criteria andU005EqualTo(String value) {
            addCriterion("U005 =", value, "u005");
            return (Criteria) this;
        }

        public Criteria andU005NotEqualTo(String value) {
            addCriterion("U005 <>", value, "u005");
            return (Criteria) this;
        }

        public Criteria andU005GreaterThan(String value) {
            addCriterion("U005 >", value, "u005");
            return (Criteria) this;
        }

        public Criteria andU005GreaterThanOrEqualTo(String value) {
            addCriterion("U005 >=", value, "u005");
            return (Criteria) this;
        }

        public Criteria andU005LessThan(String value) {
            addCriterion("U005 <", value, "u005");
            return (Criteria) this;
        }

        public Criteria andU005LessThanOrEqualTo(String value) {
            addCriterion("U005 <=", value, "u005");
            return (Criteria) this;
        }

        public Criteria andU005Like(String value) {
            addCriterion("U005 like", value, "u005");
            return (Criteria) this;
        }

        public Criteria andU005NotLike(String value) {
            addCriterion("U005 not like", value, "u005");
            return (Criteria) this;
        }

        public Criteria andU005In(List<String> values) {
            addCriterion("U005 in", values, "u005");
            return (Criteria) this;
        }

        public Criteria andU005NotIn(List<String> values) {
            addCriterion("U005 not in", values, "u005");
            return (Criteria) this;
        }

        public Criteria andU005Between(String value1, String value2) {
            addCriterion("U005 between", value1, value2, "u005");
            return (Criteria) this;
        }

        public Criteria andU005NotBetween(String value1, String value2) {
            addCriterion("U005 not between", value1, value2, "u005");
            return (Criteria) this;
        }

        public Criteria andU006IsNull() {
            addCriterion("U006 is null");
            return (Criteria) this;
        }

        public Criteria andU006IsNotNull() {
            addCriterion("U006 is not null");
            return (Criteria) this;
        }

        public Criteria andU006EqualTo(String value) {
            addCriterion("U006 =", value, "u006");
            return (Criteria) this;
        }

        public Criteria andU006NotEqualTo(String value) {
            addCriterion("U006 <>", value, "u006");
            return (Criteria) this;
        }

        public Criteria andU006GreaterThan(String value) {
            addCriterion("U006 >", value, "u006");
            return (Criteria) this;
        }

        public Criteria andU006GreaterThanOrEqualTo(String value) {
            addCriterion("U006 >=", value, "u006");
            return (Criteria) this;
        }

        public Criteria andU006LessThan(String value) {
            addCriterion("U006 <", value, "u006");
            return (Criteria) this;
        }

        public Criteria andU006LessThanOrEqualTo(String value) {
            addCriterion("U006 <=", value, "u006");
            return (Criteria) this;
        }

        public Criteria andU006Like(String value) {
            addCriterion("U006 like", value, "u006");
            return (Criteria) this;
        }

        public Criteria andU006NotLike(String value) {
            addCriterion("U006 not like", value, "u006");
            return (Criteria) this;
        }

        public Criteria andU006In(List<String> values) {
            addCriterion("U006 in", values, "u006");
            return (Criteria) this;
        }

        public Criteria andU006NotIn(List<String> values) {
            addCriterion("U006 not in", values, "u006");
            return (Criteria) this;
        }

        public Criteria andU006Between(String value1, String value2) {
            addCriterion("U006 between", value1, value2, "u006");
            return (Criteria) this;
        }

        public Criteria andU006NotBetween(String value1, String value2) {
            addCriterion("U006 not between", value1, value2, "u006");
            return (Criteria) this;
        }

        public Criteria andU007IsNull() {
            addCriterion("U007 is null");
            return (Criteria) this;
        }

        public Criteria andU007IsNotNull() {
            addCriterion("U007 is not null");
            return (Criteria) this;
        }

        public Criteria andU007EqualTo(String value) {
            addCriterion("U007 =", value, "u007");
            return (Criteria) this;
        }

        public Criteria andU007NotEqualTo(String value) {
            addCriterion("U007 <>", value, "u007");
            return (Criteria) this;
        }

        public Criteria andU007GreaterThan(String value) {
            addCriterion("U007 >", value, "u007");
            return (Criteria) this;
        }

        public Criteria andU007GreaterThanOrEqualTo(String value) {
            addCriterion("U007 >=", value, "u007");
            return (Criteria) this;
        }

        public Criteria andU007LessThan(String value) {
            addCriterion("U007 <", value, "u007");
            return (Criteria) this;
        }

        public Criteria andU007LessThanOrEqualTo(String value) {
            addCriterion("U007 <=", value, "u007");
            return (Criteria) this;
        }

        public Criteria andU007Like(String value) {
            addCriterion("U007 like", value, "u007");
            return (Criteria) this;
        }

        public Criteria andU007NotLike(String value) {
            addCriterion("U007 not like", value, "u007");
            return (Criteria) this;
        }

        public Criteria andU007In(List<String> values) {
            addCriterion("U007 in", values, "u007");
            return (Criteria) this;
        }

        public Criteria andU007NotIn(List<String> values) {
            addCriterion("U007 not in", values, "u007");
            return (Criteria) this;
        }

        public Criteria andU007Between(String value1, String value2) {
            addCriterion("U007 between", value1, value2, "u007");
            return (Criteria) this;
        }

        public Criteria andU007NotBetween(String value1, String value2) {
            addCriterion("U007 not between", value1, value2, "u007");
            return (Criteria) this;
        }

        public Criteria andU008IsNull() {
            addCriterion("U008 is null");
            return (Criteria) this;
        }

        public Criteria andU008IsNotNull() {
            addCriterion("U008 is not null");
            return (Criteria) this;
        }

        public Criteria andU008EqualTo(String value) {
            addCriterion("U008 =", value, "u008");
            return (Criteria) this;
        }

        public Criteria andU008NotEqualTo(String value) {
            addCriterion("U008 <>", value, "u008");
            return (Criteria) this;
        }

        public Criteria andU008GreaterThan(String value) {
            addCriterion("U008 >", value, "u008");
            return (Criteria) this;
        }

        public Criteria andU008GreaterThanOrEqualTo(String value) {
            addCriterion("U008 >=", value, "u008");
            return (Criteria) this;
        }

        public Criteria andU008LessThan(String value) {
            addCriterion("U008 <", value, "u008");
            return (Criteria) this;
        }

        public Criteria andU008LessThanOrEqualTo(String value) {
            addCriterion("U008 <=", value, "u008");
            return (Criteria) this;
        }

        public Criteria andU008Like(String value) {
            addCriterion("U008 like", value, "u008");
            return (Criteria) this;
        }

        public Criteria andU008NotLike(String value) {
            addCriterion("U008 not like", value, "u008");
            return (Criteria) this;
        }

        public Criteria andU008In(List<String> values) {
            addCriterion("U008 in", values, "u008");
            return (Criteria) this;
        }

        public Criteria andU008NotIn(List<String> values) {
            addCriterion("U008 not in", values, "u008");
            return (Criteria) this;
        }

        public Criteria andU008Between(String value1, String value2) {
            addCriterion("U008 between", value1, value2, "u008");
            return (Criteria) this;
        }

        public Criteria andU008NotBetween(String value1, String value2) {
            addCriterion("U008 not between", value1, value2, "u008");
            return (Criteria) this;
        }

        public Criteria andU009IsNull() {
            addCriterion("U009 is null");
            return (Criteria) this;
        }

        public Criteria andU009IsNotNull() {
            addCriterion("U009 is not null");
            return (Criteria) this;
        }

        public Criteria andU009EqualTo(String value) {
            addCriterion("U009 =", value, "u009");
            return (Criteria) this;
        }

        public Criteria andU009NotEqualTo(String value) {
            addCriterion("U009 <>", value, "u009");
            return (Criteria) this;
        }

        public Criteria andU009GreaterThan(String value) {
            addCriterion("U009 >", value, "u009");
            return (Criteria) this;
        }

        public Criteria andU009GreaterThanOrEqualTo(String value) {
            addCriterion("U009 >=", value, "u009");
            return (Criteria) this;
        }

        public Criteria andU009LessThan(String value) {
            addCriterion("U009 <", value, "u009");
            return (Criteria) this;
        }

        public Criteria andU009LessThanOrEqualTo(String value) {
            addCriterion("U009 <=", value, "u009");
            return (Criteria) this;
        }

        public Criteria andU009Like(String value) {
            addCriterion("U009 like", value, "u009");
            return (Criteria) this;
        }

        public Criteria andU009NotLike(String value) {
            addCriterion("U009 not like", value, "u009");
            return (Criteria) this;
        }

        public Criteria andU009In(List<String> values) {
            addCriterion("U009 in", values, "u009");
            return (Criteria) this;
        }

        public Criteria andU009NotIn(List<String> values) {
            addCriterion("U009 not in", values, "u009");
            return (Criteria) this;
        }

        public Criteria andU009Between(String value1, String value2) {
            addCriterion("U009 between", value1, value2, "u009");
            return (Criteria) this;
        }

        public Criteria andU009NotBetween(String value1, String value2) {
            addCriterion("U009 not between", value1, value2, "u009");
            return (Criteria) this;
        }

        public Criteria andU0010IsNull() {
            addCriterion("U0010 is null");
            return (Criteria) this;
        }

        public Criteria andU0010IsNotNull() {
            addCriterion("U0010 is not null");
            return (Criteria) this;
        }

        public Criteria andU0010EqualTo(String value) {
            addCriterion("U0010 =", value, "u0010");
            return (Criteria) this;
        }

        public Criteria andU0010NotEqualTo(String value) {
            addCriterion("U0010 <>", value, "u0010");
            return (Criteria) this;
        }

        public Criteria andU0010GreaterThan(String value) {
            addCriterion("U0010 >", value, "u0010");
            return (Criteria) this;
        }

        public Criteria andU0010GreaterThanOrEqualTo(String value) {
            addCriterion("U0010 >=", value, "u0010");
            return (Criteria) this;
        }

        public Criteria andU0010LessThan(String value) {
            addCriterion("U0010 <", value, "u0010");
            return (Criteria) this;
        }

        public Criteria andU0010LessThanOrEqualTo(String value) {
            addCriterion("U0010 <=", value, "u0010");
            return (Criteria) this;
        }

        public Criteria andU0010Like(String value) {
            addCriterion("U0010 like", value, "u0010");
            return (Criteria) this;
        }

        public Criteria andU0010NotLike(String value) {
            addCriterion("U0010 not like", value, "u0010");
            return (Criteria) this;
        }

        public Criteria andU0010In(List<String> values) {
            addCriterion("U0010 in", values, "u0010");
            return (Criteria) this;
        }

        public Criteria andU0010NotIn(List<String> values) {
            addCriterion("U0010 not in", values, "u0010");
            return (Criteria) this;
        }

        public Criteria andU0010Between(String value1, String value2) {
            addCriterion("U0010 between", value1, value2, "u0010");
            return (Criteria) this;
        }

        public Criteria andU0010NotBetween(String value1, String value2) {
            addCriterion("U0010 not between", value1, value2, "u0010");
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