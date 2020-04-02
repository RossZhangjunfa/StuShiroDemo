package com.ross.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoExample() {
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

        public Criteria andRzIdIsNull() {
            addCriterion("rz_id is null");
            return (Criteria) this;
        }

        public Criteria andRzIdIsNotNull() {
            addCriterion("rz_id is not null");
            return (Criteria) this;
        }

        public Criteria andRzIdEqualTo(Integer value) {
            addCriterion("rz_id =", value, "rzId");
            return (Criteria) this;
        }

        public Criteria andRzIdNotEqualTo(Integer value) {
            addCriterion("rz_id <>", value, "rzId");
            return (Criteria) this;
        }

        public Criteria andRzIdGreaterThan(Integer value) {
            addCriterion("rz_id >", value, "rzId");
            return (Criteria) this;
        }

        public Criteria andRzIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rz_id >=", value, "rzId");
            return (Criteria) this;
        }

        public Criteria andRzIdLessThan(Integer value) {
            addCriterion("rz_id <", value, "rzId");
            return (Criteria) this;
        }

        public Criteria andRzIdLessThanOrEqualTo(Integer value) {
            addCriterion("rz_id <=", value, "rzId");
            return (Criteria) this;
        }

        public Criteria andRzIdIn(List<Integer> values) {
            addCriterion("rz_id in", values, "rzId");
            return (Criteria) this;
        }

        public Criteria andRzIdNotIn(List<Integer> values) {
            addCriterion("rz_id not in", values, "rzId");
            return (Criteria) this;
        }

        public Criteria andRzIdBetween(Integer value1, Integer value2) {
            addCriterion("rz_id between", value1, value2, "rzId");
            return (Criteria) this;
        }

        public Criteria andRzIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rz_id not between", value1, value2, "rzId");
            return (Criteria) this;
        }

        public Criteria andRzNameIsNull() {
            addCriterion("rz_name is null");
            return (Criteria) this;
        }

        public Criteria andRzNameIsNotNull() {
            addCriterion("rz_name is not null");
            return (Criteria) this;
        }

        public Criteria andRzNameEqualTo(String value) {
            addCriterion("rz_name =", value, "rzName");
            return (Criteria) this;
        }

        public Criteria andRzNameNotEqualTo(String value) {
            addCriterion("rz_name <>", value, "rzName");
            return (Criteria) this;
        }

        public Criteria andRzNameGreaterThan(String value) {
            addCriterion("rz_name >", value, "rzName");
            return (Criteria) this;
        }

        public Criteria andRzNameGreaterThanOrEqualTo(String value) {
            addCriterion("rz_name >=", value, "rzName");
            return (Criteria) this;
        }

        public Criteria andRzNameLessThan(String value) {
            addCriterion("rz_name <", value, "rzName");
            return (Criteria) this;
        }

        public Criteria andRzNameLessThanOrEqualTo(String value) {
            addCriterion("rz_name <=", value, "rzName");
            return (Criteria) this;
        }

        public Criteria andRzNameLike(String value) {
            addCriterion("rz_name like", value, "rzName");
            return (Criteria) this;
        }

        public Criteria andRzNameNotLike(String value) {
            addCriterion("rz_name not like", value, "rzName");
            return (Criteria) this;
        }

        public Criteria andRzNameIn(List<String> values) {
            addCriterion("rz_name in", values, "rzName");
            return (Criteria) this;
        }

        public Criteria andRzNameNotIn(List<String> values) {
            addCriterion("rz_name not in", values, "rzName");
            return (Criteria) this;
        }

        public Criteria andRzNameBetween(String value1, String value2) {
            addCriterion("rz_name between", value1, value2, "rzName");
            return (Criteria) this;
        }

        public Criteria andRzNameNotBetween(String value1, String value2) {
            addCriterion("rz_name not between", value1, value2, "rzName");
            return (Criteria) this;
        }

        public Criteria andRzSexIsNull() {
            addCriterion("rz_sex is null");
            return (Criteria) this;
        }

        public Criteria andRzSexIsNotNull() {
            addCriterion("rz_sex is not null");
            return (Criteria) this;
        }

        public Criteria andRzSexEqualTo(String value) {
            addCriterion("rz_sex =", value, "rzSex");
            return (Criteria) this;
        }

        public Criteria andRzSexNotEqualTo(String value) {
            addCriterion("rz_sex <>", value, "rzSex");
            return (Criteria) this;
        }

        public Criteria andRzSexGreaterThan(String value) {
            addCriterion("rz_sex >", value, "rzSex");
            return (Criteria) this;
        }

        public Criteria andRzSexGreaterThanOrEqualTo(String value) {
            addCriterion("rz_sex >=", value, "rzSex");
            return (Criteria) this;
        }

        public Criteria andRzSexLessThan(String value) {
            addCriterion("rz_sex <", value, "rzSex");
            return (Criteria) this;
        }

        public Criteria andRzSexLessThanOrEqualTo(String value) {
            addCriterion("rz_sex <=", value, "rzSex");
            return (Criteria) this;
        }

        public Criteria andRzSexLike(String value) {
            addCriterion("rz_sex like", value, "rzSex");
            return (Criteria) this;
        }

        public Criteria andRzSexNotLike(String value) {
            addCriterion("rz_sex not like", value, "rzSex");
            return (Criteria) this;
        }

        public Criteria andRzSexIn(List<String> values) {
            addCriterion("rz_sex in", values, "rzSex");
            return (Criteria) this;
        }

        public Criteria andRzSexNotIn(List<String> values) {
            addCriterion("rz_sex not in", values, "rzSex");
            return (Criteria) this;
        }

        public Criteria andRzSexBetween(String value1, String value2) {
            addCriterion("rz_sex between", value1, value2, "rzSex");
            return (Criteria) this;
        }

        public Criteria andRzSexNotBetween(String value1, String value2) {
            addCriterion("rz_sex not between", value1, value2, "rzSex");
            return (Criteria) this;
        }

        public Criteria andRzAgeIsNull() {
            addCriterion("rz_age is null");
            return (Criteria) this;
        }

        public Criteria andRzAgeIsNotNull() {
            addCriterion("rz_age is not null");
            return (Criteria) this;
        }

        public Criteria andRzAgeEqualTo(String value) {
            addCriterion("rz_age =", value, "rzAge");
            return (Criteria) this;
        }

        public Criteria andRzAgeNotEqualTo(String value) {
            addCriterion("rz_age <>", value, "rzAge");
            return (Criteria) this;
        }

        public Criteria andRzAgeGreaterThan(String value) {
            addCriterion("rz_age >", value, "rzAge");
            return (Criteria) this;
        }

        public Criteria andRzAgeGreaterThanOrEqualTo(String value) {
            addCriterion("rz_age >=", value, "rzAge");
            return (Criteria) this;
        }

        public Criteria andRzAgeLessThan(String value) {
            addCriterion("rz_age <", value, "rzAge");
            return (Criteria) this;
        }

        public Criteria andRzAgeLessThanOrEqualTo(String value) {
            addCriterion("rz_age <=", value, "rzAge");
            return (Criteria) this;
        }

        public Criteria andRzAgeLike(String value) {
            addCriterion("rz_age like", value, "rzAge");
            return (Criteria) this;
        }

        public Criteria andRzAgeNotLike(String value) {
            addCriterion("rz_age not like", value, "rzAge");
            return (Criteria) this;
        }

        public Criteria andRzAgeIn(List<String> values) {
            addCriterion("rz_age in", values, "rzAge");
            return (Criteria) this;
        }

        public Criteria andRzAgeNotIn(List<String> values) {
            addCriterion("rz_age not in", values, "rzAge");
            return (Criteria) this;
        }

        public Criteria andRzAgeBetween(String value1, String value2) {
            addCriterion("rz_age between", value1, value2, "rzAge");
            return (Criteria) this;
        }

        public Criteria andRzAgeNotBetween(String value1, String value2) {
            addCriterion("rz_age not between", value1, value2, "rzAge");
            return (Criteria) this;
        }

        public Criteria andRzBirthdayIsNull() {
            addCriterion("rz_birthday is null");
            return (Criteria) this;
        }

        public Criteria andRzBirthdayIsNotNull() {
            addCriterion("rz_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andRzBirthdayEqualTo(String value) {
            addCriterion("rz_birthday =", value, "rzBirthday");
            return (Criteria) this;
        }

        public Criteria andRzBirthdayNotEqualTo(String value) {
            addCriterion("rz_birthday <>", value, "rzBirthday");
            return (Criteria) this;
        }

        public Criteria andRzBirthdayGreaterThan(String value) {
            addCriterion("rz_birthday >", value, "rzBirthday");
            return (Criteria) this;
        }

        public Criteria andRzBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("rz_birthday >=", value, "rzBirthday");
            return (Criteria) this;
        }

        public Criteria andRzBirthdayLessThan(String value) {
            addCriterion("rz_birthday <", value, "rzBirthday");
            return (Criteria) this;
        }

        public Criteria andRzBirthdayLessThanOrEqualTo(String value) {
            addCriterion("rz_birthday <=", value, "rzBirthday");
            return (Criteria) this;
        }

        public Criteria andRzBirthdayLike(String value) {
            addCriterion("rz_birthday like", value, "rzBirthday");
            return (Criteria) this;
        }

        public Criteria andRzBirthdayNotLike(String value) {
            addCriterion("rz_birthday not like", value, "rzBirthday");
            return (Criteria) this;
        }

        public Criteria andRzBirthdayIn(List<String> values) {
            addCriterion("rz_birthday in", values, "rzBirthday");
            return (Criteria) this;
        }

        public Criteria andRzBirthdayNotIn(List<String> values) {
            addCriterion("rz_birthday not in", values, "rzBirthday");
            return (Criteria) this;
        }

        public Criteria andRzBirthdayBetween(String value1, String value2) {
            addCriterion("rz_birthday between", value1, value2, "rzBirthday");
            return (Criteria) this;
        }

        public Criteria andRzBirthdayNotBetween(String value1, String value2) {
            addCriterion("rz_birthday not between", value1, value2, "rzBirthday");
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