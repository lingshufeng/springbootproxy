package microservice.sc.model;

import java.util.ArrayList;
import java.util.List;

public class BhmxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BhmxExample() {
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

        public Criteria andBhIsNull() {
            addCriterion("BH is null");
            return (Criteria) this;
        }

        public Criteria andBhIsNotNull() {
            addCriterion("BH is not null");
            return (Criteria) this;
        }

        public Criteria andBhEqualTo(String value) {
            addCriterion("BH =", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhNotEqualTo(String value) {
            addCriterion("BH <>", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhGreaterThan(String value) {
            addCriterion("BH >", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhGreaterThanOrEqualTo(String value) {
            addCriterion("BH >=", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhLessThan(String value) {
            addCriterion("BH <", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhLessThanOrEqualTo(String value) {
            addCriterion("BH <=", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhLike(String value) {
            addCriterion("BH like", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhNotLike(String value) {
            addCriterion("BH not like", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhIn(List<String> values) {
            addCriterion("BH in", values, "bh");
            return (Criteria) this;
        }

        public Criteria andBhNotIn(List<String> values) {
            addCriterion("BH not in", values, "bh");
            return (Criteria) this;
        }

        public Criteria andBhBetween(String value1, String value2) {
            addCriterion("BH between", value1, value2, "bh");
            return (Criteria) this;
        }

        public Criteria andBhNotBetween(String value1, String value2) {
            addCriterion("BH not between", value1, value2, "bh");
            return (Criteria) this;
        }

        public Criteria andMcIsNull() {
            addCriterion("MC is null");
            return (Criteria) this;
        }

        public Criteria andMcIsNotNull() {
            addCriterion("MC is not null");
            return (Criteria) this;
        }

        public Criteria andMcEqualTo(String value) {
            addCriterion("MC =", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotEqualTo(String value) {
            addCriterion("MC <>", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcGreaterThan(String value) {
            addCriterion("MC >", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcGreaterThanOrEqualTo(String value) {
            addCriterion("MC >=", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcLessThan(String value) {
            addCriterion("MC <", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcLessThanOrEqualTo(String value) {
            addCriterion("MC <=", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcLike(String value) {
            addCriterion("MC like", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotLike(String value) {
            addCriterion("MC not like", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcIn(List<String> values) {
            addCriterion("MC in", values, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotIn(List<String> values) {
            addCriterion("MC not in", values, "mc");
            return (Criteria) this;
        }

        public Criteria andMcBetween(String value1, String value2) {
            addCriterion("MC between", value1, value2, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotBetween(String value1, String value2) {
            addCriterion("MC not between", value1, value2, "mc");
            return (Criteria) this;
        }

        public Criteria andPicIsNull() {
            addCriterion("PIC is null");
            return (Criteria) this;
        }

        public Criteria andPicIsNotNull() {
            addCriterion("PIC is not null");
            return (Criteria) this;
        }

        public Criteria andPicEqualTo(String value) {
            addCriterion("PIC =", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotEqualTo(String value) {
            addCriterion("PIC <>", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThan(String value) {
            addCriterion("PIC >", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThanOrEqualTo(String value) {
            addCriterion("PIC >=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThan(String value) {
            addCriterion("PIC <", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThanOrEqualTo(String value) {
            addCriterion("PIC <=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLike(String value) {
            addCriterion("PIC like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotLike(String value) {
            addCriterion("PIC not like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicIn(List<String> values) {
            addCriterion("PIC in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotIn(List<String> values) {
            addCriterion("PIC not in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicBetween(String value1, String value2) {
            addCriterion("PIC between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotBetween(String value1, String value2) {
            addCriterion("PIC not between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andBingyIsNull() {
            addCriterion("BINGY is null");
            return (Criteria) this;
        }

        public Criteria andBingyIsNotNull() {
            addCriterion("BINGY is not null");
            return (Criteria) this;
        }

        public Criteria andBingyEqualTo(String value) {
            addCriterion("BINGY =", value, "bingy");
            return (Criteria) this;
        }

        public Criteria andBingyNotEqualTo(String value) {
            addCriterion("BINGY <>", value, "bingy");
            return (Criteria) this;
        }

        public Criteria andBingyGreaterThan(String value) {
            addCriterion("BINGY >", value, "bingy");
            return (Criteria) this;
        }

        public Criteria andBingyGreaterThanOrEqualTo(String value) {
            addCriterion("BINGY >=", value, "bingy");
            return (Criteria) this;
        }

        public Criteria andBingyLessThan(String value) {
            addCriterion("BINGY <", value, "bingy");
            return (Criteria) this;
        }

        public Criteria andBingyLessThanOrEqualTo(String value) {
            addCriterion("BINGY <=", value, "bingy");
            return (Criteria) this;
        }

        public Criteria andBingyLike(String value) {
            addCriterion("BINGY like", value, "bingy");
            return (Criteria) this;
        }

        public Criteria andBingyNotLike(String value) {
            addCriterion("BINGY not like", value, "bingy");
            return (Criteria) this;
        }

        public Criteria andBingyIn(List<String> values) {
            addCriterion("BINGY in", values, "bingy");
            return (Criteria) this;
        }

        public Criteria andBingyNotIn(List<String> values) {
            addCriterion("BINGY not in", values, "bingy");
            return (Criteria) this;
        }

        public Criteria andBingyBetween(String value1, String value2) {
            addCriterion("BINGY between", value1, value2, "bingy");
            return (Criteria) this;
        }

        public Criteria andBingyNotBetween(String value1, String value2) {
            addCriterion("BINGY not between", value1, value2, "bingy");
            return (Criteria) this;
        }

        public Criteria andZzIsNull() {
            addCriterion("ZZ is null");
            return (Criteria) this;
        }

        public Criteria andZzIsNotNull() {
            addCriterion("ZZ is not null");
            return (Criteria) this;
        }

        public Criteria andZzEqualTo(String value) {
            addCriterion("ZZ =", value, "zz");
            return (Criteria) this;
        }

        public Criteria andZzNotEqualTo(String value) {
            addCriterion("ZZ <>", value, "zz");
            return (Criteria) this;
        }

        public Criteria andZzGreaterThan(String value) {
            addCriterion("ZZ >", value, "zz");
            return (Criteria) this;
        }

        public Criteria andZzGreaterThanOrEqualTo(String value) {
            addCriterion("ZZ >=", value, "zz");
            return (Criteria) this;
        }

        public Criteria andZzLessThan(String value) {
            addCriterion("ZZ <", value, "zz");
            return (Criteria) this;
        }

        public Criteria andZzLessThanOrEqualTo(String value) {
            addCriterion("ZZ <=", value, "zz");
            return (Criteria) this;
        }

        public Criteria andZzLike(String value) {
            addCriterion("ZZ like", value, "zz");
            return (Criteria) this;
        }

        public Criteria andZzNotLike(String value) {
            addCriterion("ZZ not like", value, "zz");
            return (Criteria) this;
        }

        public Criteria andZzIn(List<String> values) {
            addCriterion("ZZ in", values, "zz");
            return (Criteria) this;
        }

        public Criteria andZzNotIn(List<String> values) {
            addCriterion("ZZ not in", values, "zz");
            return (Criteria) this;
        }

        public Criteria andZzBetween(String value1, String value2) {
            addCriterion("ZZ between", value1, value2, "zz");
            return (Criteria) this;
        }

        public Criteria andZzNotBetween(String value1, String value2) {
            addCriterion("ZZ not between", value1, value2, "zz");
            return (Criteria) this;
        }

        public Criteria andFbtjIsNull() {
            addCriterion("FBTJ is null");
            return (Criteria) this;
        }

        public Criteria andFbtjIsNotNull() {
            addCriterion("FBTJ is not null");
            return (Criteria) this;
        }

        public Criteria andFbtjEqualTo(String value) {
            addCriterion("FBTJ =", value, "fbtj");
            return (Criteria) this;
        }

        public Criteria andFbtjNotEqualTo(String value) {
            addCriterion("FBTJ <>", value, "fbtj");
            return (Criteria) this;
        }

        public Criteria andFbtjGreaterThan(String value) {
            addCriterion("FBTJ >", value, "fbtj");
            return (Criteria) this;
        }

        public Criteria andFbtjGreaterThanOrEqualTo(String value) {
            addCriterion("FBTJ >=", value, "fbtj");
            return (Criteria) this;
        }

        public Criteria andFbtjLessThan(String value) {
            addCriterion("FBTJ <", value, "fbtj");
            return (Criteria) this;
        }

        public Criteria andFbtjLessThanOrEqualTo(String value) {
            addCriterion("FBTJ <=", value, "fbtj");
            return (Criteria) this;
        }

        public Criteria andFbtjLike(String value) {
            addCriterion("FBTJ like", value, "fbtj");
            return (Criteria) this;
        }

        public Criteria andFbtjNotLike(String value) {
            addCriterion("FBTJ not like", value, "fbtj");
            return (Criteria) this;
        }

        public Criteria andFbtjIn(List<String> values) {
            addCriterion("FBTJ in", values, "fbtj");
            return (Criteria) this;
        }

        public Criteria andFbtjNotIn(List<String> values) {
            addCriterion("FBTJ not in", values, "fbtj");
            return (Criteria) this;
        }

        public Criteria andFbtjBetween(String value1, String value2) {
            addCriterion("FBTJ between", value1, value2, "fbtj");
            return (Criteria) this;
        }

        public Criteria andFbtjNotBetween(String value1, String value2) {
            addCriterion("FBTJ not between", value1, value2, "fbtj");
            return (Criteria) this;
        }

        public Criteria andNyfzIsNull() {
            addCriterion("NYFZ is null");
            return (Criteria) this;
        }

        public Criteria andNyfzIsNotNull() {
            addCriterion("NYFZ is not null");
            return (Criteria) this;
        }

        public Criteria andNyfzEqualTo(String value) {
            addCriterion("NYFZ =", value, "nyfz");
            return (Criteria) this;
        }

        public Criteria andNyfzNotEqualTo(String value) {
            addCriterion("NYFZ <>", value, "nyfz");
            return (Criteria) this;
        }

        public Criteria andNyfzGreaterThan(String value) {
            addCriterion("NYFZ >", value, "nyfz");
            return (Criteria) this;
        }

        public Criteria andNyfzGreaterThanOrEqualTo(String value) {
            addCriterion("NYFZ >=", value, "nyfz");
            return (Criteria) this;
        }

        public Criteria andNyfzLessThan(String value) {
            addCriterion("NYFZ <", value, "nyfz");
            return (Criteria) this;
        }

        public Criteria andNyfzLessThanOrEqualTo(String value) {
            addCriterion("NYFZ <=", value, "nyfz");
            return (Criteria) this;
        }

        public Criteria andNyfzLike(String value) {
            addCriterion("NYFZ like", value, "nyfz");
            return (Criteria) this;
        }

        public Criteria andNyfzNotLike(String value) {
            addCriterion("NYFZ not like", value, "nyfz");
            return (Criteria) this;
        }

        public Criteria andNyfzIn(List<String> values) {
            addCriterion("NYFZ in", values, "nyfz");
            return (Criteria) this;
        }

        public Criteria andNyfzNotIn(List<String> values) {
            addCriterion("NYFZ not in", values, "nyfz");
            return (Criteria) this;
        }

        public Criteria andNyfzBetween(String value1, String value2) {
            addCriterion("NYFZ between", value1, value2, "nyfz");
            return (Criteria) this;
        }

        public Criteria andNyfzNotBetween(String value1, String value2) {
            addCriterion("NYFZ not between", value1, value2, "nyfz");
            return (Criteria) this;
        }

        public Criteria andWlfzIsNull() {
            addCriterion("WLFZ is null");
            return (Criteria) this;
        }

        public Criteria andWlfzIsNotNull() {
            addCriterion("WLFZ is not null");
            return (Criteria) this;
        }

        public Criteria andWlfzEqualTo(String value) {
            addCriterion("WLFZ =", value, "wlfz");
            return (Criteria) this;
        }

        public Criteria andWlfzNotEqualTo(String value) {
            addCriterion("WLFZ <>", value, "wlfz");
            return (Criteria) this;
        }

        public Criteria andWlfzGreaterThan(String value) {
            addCriterion("WLFZ >", value, "wlfz");
            return (Criteria) this;
        }

        public Criteria andWlfzGreaterThanOrEqualTo(String value) {
            addCriterion("WLFZ >=", value, "wlfz");
            return (Criteria) this;
        }

        public Criteria andWlfzLessThan(String value) {
            addCriterion("WLFZ <", value, "wlfz");
            return (Criteria) this;
        }

        public Criteria andWlfzLessThanOrEqualTo(String value) {
            addCriterion("WLFZ <=", value, "wlfz");
            return (Criteria) this;
        }

        public Criteria andWlfzLike(String value) {
            addCriterion("WLFZ like", value, "wlfz");
            return (Criteria) this;
        }

        public Criteria andWlfzNotLike(String value) {
            addCriterion("WLFZ not like", value, "wlfz");
            return (Criteria) this;
        }

        public Criteria andWlfzIn(List<String> values) {
            addCriterion("WLFZ in", values, "wlfz");
            return (Criteria) this;
        }

        public Criteria andWlfzNotIn(List<String> values) {
            addCriterion("WLFZ not in", values, "wlfz");
            return (Criteria) this;
        }

        public Criteria andWlfzBetween(String value1, String value2) {
            addCriterion("WLFZ between", value1, value2, "wlfz");
            return (Criteria) this;
        }

        public Criteria andWlfzNotBetween(String value1, String value2) {
            addCriterion("WLFZ not between", value1, value2, "wlfz");
            return (Criteria) this;
        }

        public Criteria andSwfzIsNull() {
            addCriterion("SWFZ is null");
            return (Criteria) this;
        }

        public Criteria andSwfzIsNotNull() {
            addCriterion("SWFZ is not null");
            return (Criteria) this;
        }

        public Criteria andSwfzEqualTo(String value) {
            addCriterion("SWFZ =", value, "swfz");
            return (Criteria) this;
        }

        public Criteria andSwfzNotEqualTo(String value) {
            addCriterion("SWFZ <>", value, "swfz");
            return (Criteria) this;
        }

        public Criteria andSwfzGreaterThan(String value) {
            addCriterion("SWFZ >", value, "swfz");
            return (Criteria) this;
        }

        public Criteria andSwfzGreaterThanOrEqualTo(String value) {
            addCriterion("SWFZ >=", value, "swfz");
            return (Criteria) this;
        }

        public Criteria andSwfzLessThan(String value) {
            addCriterion("SWFZ <", value, "swfz");
            return (Criteria) this;
        }

        public Criteria andSwfzLessThanOrEqualTo(String value) {
            addCriterion("SWFZ <=", value, "swfz");
            return (Criteria) this;
        }

        public Criteria andSwfzLike(String value) {
            addCriterion("SWFZ like", value, "swfz");
            return (Criteria) this;
        }

        public Criteria andSwfzNotLike(String value) {
            addCriterion("SWFZ not like", value, "swfz");
            return (Criteria) this;
        }

        public Criteria andSwfzIn(List<String> values) {
            addCriterion("SWFZ in", values, "swfz");
            return (Criteria) this;
        }

        public Criteria andSwfzNotIn(List<String> values) {
            addCriterion("SWFZ not in", values, "swfz");
            return (Criteria) this;
        }

        public Criteria andSwfzBetween(String value1, String value2) {
            addCriterion("SWFZ between", value1, value2, "swfz");
            return (Criteria) this;
        }

        public Criteria andSwfzNotBetween(String value1, String value2) {
            addCriterion("SWFZ not between", value1, value2, "swfz");
            return (Criteria) this;
        }

        public Criteria andHxfzIsNull() {
            addCriterion("HXFZ is null");
            return (Criteria) this;
        }

        public Criteria andHxfzIsNotNull() {
            addCriterion("HXFZ is not null");
            return (Criteria) this;
        }

        public Criteria andHxfzEqualTo(String value) {
            addCriterion("HXFZ =", value, "hxfz");
            return (Criteria) this;
        }

        public Criteria andHxfzNotEqualTo(String value) {
            addCriterion("HXFZ <>", value, "hxfz");
            return (Criteria) this;
        }

        public Criteria andHxfzGreaterThan(String value) {
            addCriterion("HXFZ >", value, "hxfz");
            return (Criteria) this;
        }

        public Criteria andHxfzGreaterThanOrEqualTo(String value) {
            addCriterion("HXFZ >=", value, "hxfz");
            return (Criteria) this;
        }

        public Criteria andHxfzLessThan(String value) {
            addCriterion("HXFZ <", value, "hxfz");
            return (Criteria) this;
        }

        public Criteria andHxfzLessThanOrEqualTo(String value) {
            addCriterion("HXFZ <=", value, "hxfz");
            return (Criteria) this;
        }

        public Criteria andHxfzLike(String value) {
            addCriterion("HXFZ like", value, "hxfz");
            return (Criteria) this;
        }

        public Criteria andHxfzNotLike(String value) {
            addCriterion("HXFZ not like", value, "hxfz");
            return (Criteria) this;
        }

        public Criteria andHxfzIn(List<String> values) {
            addCriterion("HXFZ in", values, "hxfz");
            return (Criteria) this;
        }

        public Criteria andHxfzNotIn(List<String> values) {
            addCriterion("HXFZ not in", values, "hxfz");
            return (Criteria) this;
        }

        public Criteria andHxfzBetween(String value1, String value2) {
            addCriterion("HXFZ between", value1, value2, "hxfz");
            return (Criteria) this;
        }

        public Criteria andHxfzNotBetween(String value1, String value2) {
            addCriterion("HXFZ not between", value1, value2, "hxfz");
            return (Criteria) this;
        }

        public Criteria andYjfzIsNull() {
            addCriterion("YJFZ is null");
            return (Criteria) this;
        }

        public Criteria andYjfzIsNotNull() {
            addCriterion("YJFZ is not null");
            return (Criteria) this;
        }

        public Criteria andYjfzEqualTo(String value) {
            addCriterion("YJFZ =", value, "yjfz");
            return (Criteria) this;
        }

        public Criteria andYjfzNotEqualTo(String value) {
            addCriterion("YJFZ <>", value, "yjfz");
            return (Criteria) this;
        }

        public Criteria andYjfzGreaterThan(String value) {
            addCriterion("YJFZ >", value, "yjfz");
            return (Criteria) this;
        }

        public Criteria andYjfzGreaterThanOrEqualTo(String value) {
            addCriterion("YJFZ >=", value, "yjfz");
            return (Criteria) this;
        }

        public Criteria andYjfzLessThan(String value) {
            addCriterion("YJFZ <", value, "yjfz");
            return (Criteria) this;
        }

        public Criteria andYjfzLessThanOrEqualTo(String value) {
            addCriterion("YJFZ <=", value, "yjfz");
            return (Criteria) this;
        }

        public Criteria andYjfzLike(String value) {
            addCriterion("YJFZ like", value, "yjfz");
            return (Criteria) this;
        }

        public Criteria andYjfzNotLike(String value) {
            addCriterion("YJFZ not like", value, "yjfz");
            return (Criteria) this;
        }

        public Criteria andYjfzIn(List<String> values) {
            addCriterion("YJFZ in", values, "yjfz");
            return (Criteria) this;
        }

        public Criteria andYjfzNotIn(List<String> values) {
            addCriterion("YJFZ not in", values, "yjfz");
            return (Criteria) this;
        }

        public Criteria andYjfzBetween(String value1, String value2) {
            addCriterion("YJFZ between", value1, value2, "yjfz");
            return (Criteria) this;
        }

        public Criteria andYjfzNotBetween(String value1, String value2) {
            addCriterion("YJFZ not between", value1, value2, "yjfz");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andBchsslIsNull() {
            addCriterion("BCHSSL is null");
            return (Criteria) this;
        }

        public Criteria andBchsslIsNotNull() {
            addCriterion("BCHSSL is not null");
            return (Criteria) this;
        }

        public Criteria andBchsslEqualTo(String value) {
            addCriterion("BCHSSL =", value, "bchssl");
            return (Criteria) this;
        }

        public Criteria andBchsslNotEqualTo(String value) {
            addCriterion("BCHSSL <>", value, "bchssl");
            return (Criteria) this;
        }

        public Criteria andBchsslGreaterThan(String value) {
            addCriterion("BCHSSL >", value, "bchssl");
            return (Criteria) this;
        }

        public Criteria andBchsslGreaterThanOrEqualTo(String value) {
            addCriterion("BCHSSL >=", value, "bchssl");
            return (Criteria) this;
        }

        public Criteria andBchsslLessThan(String value) {
            addCriterion("BCHSSL <", value, "bchssl");
            return (Criteria) this;
        }

        public Criteria andBchsslLessThanOrEqualTo(String value) {
            addCriterion("BCHSSL <=", value, "bchssl");
            return (Criteria) this;
        }

        public Criteria andBchsslLike(String value) {
            addCriterion("BCHSSL like", value, "bchssl");
            return (Criteria) this;
        }

        public Criteria andBchsslNotLike(String value) {
            addCriterion("BCHSSL not like", value, "bchssl");
            return (Criteria) this;
        }

        public Criteria andBchsslIn(List<String> values) {
            addCriterion("BCHSSL in", values, "bchssl");
            return (Criteria) this;
        }

        public Criteria andBchsslNotIn(List<String> values) {
            addCriterion("BCHSSL not in", values, "bchssl");
            return (Criteria) this;
        }

        public Criteria andBchsslBetween(String value1, String value2) {
            addCriterion("BCHSSL between", value1, value2, "bchssl");
            return (Criteria) this;
        }

        public Criteria andBchsslNotBetween(String value1, String value2) {
            addCriterion("BCHSSL not between", value1, value2, "bchssl");
            return (Criteria) this;
        }

        public Criteria andFbjdIsNull() {
            addCriterion("FBJD is null");
            return (Criteria) this;
        }

        public Criteria andFbjdIsNotNull() {
            addCriterion("FBJD is not null");
            return (Criteria) this;
        }

        public Criteria andFbjdEqualTo(String value) {
            addCriterion("FBJD =", value, "fbjd");
            return (Criteria) this;
        }

        public Criteria andFbjdNotEqualTo(String value) {
            addCriterion("FBJD <>", value, "fbjd");
            return (Criteria) this;
        }

        public Criteria andFbjdGreaterThan(String value) {
            addCriterion("FBJD >", value, "fbjd");
            return (Criteria) this;
        }

        public Criteria andFbjdGreaterThanOrEqualTo(String value) {
            addCriterion("FBJD >=", value, "fbjd");
            return (Criteria) this;
        }

        public Criteria andFbjdLessThan(String value) {
            addCriterion("FBJD <", value, "fbjd");
            return (Criteria) this;
        }

        public Criteria andFbjdLessThanOrEqualTo(String value) {
            addCriterion("FBJD <=", value, "fbjd");
            return (Criteria) this;
        }

        public Criteria andFbjdLike(String value) {
            addCriterion("FBJD like", value, "fbjd");
            return (Criteria) this;
        }

        public Criteria andFbjdNotLike(String value) {
            addCriterion("FBJD not like", value, "fbjd");
            return (Criteria) this;
        }

        public Criteria andFbjdIn(List<String> values) {
            addCriterion("FBJD in", values, "fbjd");
            return (Criteria) this;
        }

        public Criteria andFbjdNotIn(List<String> values) {
            addCriterion("FBJD not in", values, "fbjd");
            return (Criteria) this;
        }

        public Criteria andFbjdBetween(String value1, String value2) {
            addCriterion("FBJD between", value1, value2, "fbjd");
            return (Criteria) this;
        }

        public Criteria andFbjdNotBetween(String value1, String value2) {
            addCriterion("FBJD not between", value1, value2, "fbjd");
            return (Criteria) this;
        }

        public Criteria andBfsjIsNull() {
            addCriterion("BFSJ is null");
            return (Criteria) this;
        }

        public Criteria andBfsjIsNotNull() {
            addCriterion("BFSJ is not null");
            return (Criteria) this;
        }

        public Criteria andBfsjEqualTo(String value) {
            addCriterion("BFSJ =", value, "bfsj");
            return (Criteria) this;
        }

        public Criteria andBfsjNotEqualTo(String value) {
            addCriterion("BFSJ <>", value, "bfsj");
            return (Criteria) this;
        }

        public Criteria andBfsjGreaterThan(String value) {
            addCriterion("BFSJ >", value, "bfsj");
            return (Criteria) this;
        }

        public Criteria andBfsjGreaterThanOrEqualTo(String value) {
            addCriterion("BFSJ >=", value, "bfsj");
            return (Criteria) this;
        }

        public Criteria andBfsjLessThan(String value) {
            addCriterion("BFSJ <", value, "bfsj");
            return (Criteria) this;
        }

        public Criteria andBfsjLessThanOrEqualTo(String value) {
            addCriterion("BFSJ <=", value, "bfsj");
            return (Criteria) this;
        }

        public Criteria andBfsjLike(String value) {
            addCriterion("BFSJ like", value, "bfsj");
            return (Criteria) this;
        }

        public Criteria andBfsjNotLike(String value) {
            addCriterion("BFSJ not like", value, "bfsj");
            return (Criteria) this;
        }

        public Criteria andBfsjIn(List<String> values) {
            addCriterion("BFSJ in", values, "bfsj");
            return (Criteria) this;
        }

        public Criteria andBfsjNotIn(List<String> values) {
            addCriterion("BFSJ not in", values, "bfsj");
            return (Criteria) this;
        }

        public Criteria andBfsjBetween(String value1, String value2) {
            addCriterion("BFSJ between", value1, value2, "bfsj");
            return (Criteria) this;
        }

        public Criteria andBfsjNotBetween(String value1, String value2) {
            addCriterion("BFSJ not between", value1, value2, "bfsj");
            return (Criteria) this;
        }

        public Criteria andWdmaxIsNull() {
            addCriterion("WDMAX is null");
            return (Criteria) this;
        }

        public Criteria andWdmaxIsNotNull() {
            addCriterion("WDMAX is not null");
            return (Criteria) this;
        }

        public Criteria andWdmaxEqualTo(String value) {
            addCriterion("WDMAX =", value, "wdmax");
            return (Criteria) this;
        }

        public Criteria andWdmaxNotEqualTo(String value) {
            addCriterion("WDMAX <>", value, "wdmax");
            return (Criteria) this;
        }

        public Criteria andWdmaxGreaterThan(String value) {
            addCriterion("WDMAX >", value, "wdmax");
            return (Criteria) this;
        }

        public Criteria andWdmaxGreaterThanOrEqualTo(String value) {
            addCriterion("WDMAX >=", value, "wdmax");
            return (Criteria) this;
        }

        public Criteria andWdmaxLessThan(String value) {
            addCriterion("WDMAX <", value, "wdmax");
            return (Criteria) this;
        }

        public Criteria andWdmaxLessThanOrEqualTo(String value) {
            addCriterion("WDMAX <=", value, "wdmax");
            return (Criteria) this;
        }

        public Criteria andWdmaxLike(String value) {
            addCriterion("WDMAX like", value, "wdmax");
            return (Criteria) this;
        }

        public Criteria andWdmaxNotLike(String value) {
            addCriterion("WDMAX not like", value, "wdmax");
            return (Criteria) this;
        }

        public Criteria andWdmaxIn(List<String> values) {
            addCriterion("WDMAX in", values, "wdmax");
            return (Criteria) this;
        }

        public Criteria andWdmaxNotIn(List<String> values) {
            addCriterion("WDMAX not in", values, "wdmax");
            return (Criteria) this;
        }

        public Criteria andWdmaxBetween(String value1, String value2) {
            addCriterion("WDMAX between", value1, value2, "wdmax");
            return (Criteria) this;
        }

        public Criteria andWdmaxNotBetween(String value1, String value2) {
            addCriterion("WDMAX not between", value1, value2, "wdmax");
            return (Criteria) this;
        }

        public Criteria andWdminIsNull() {
            addCriterion("WDMIN is null");
            return (Criteria) this;
        }

        public Criteria andWdminIsNotNull() {
            addCriterion("WDMIN is not null");
            return (Criteria) this;
        }

        public Criteria andWdminEqualTo(String value) {
            addCriterion("WDMIN =", value, "wdmin");
            return (Criteria) this;
        }

        public Criteria andWdminNotEqualTo(String value) {
            addCriterion("WDMIN <>", value, "wdmin");
            return (Criteria) this;
        }

        public Criteria andWdminGreaterThan(String value) {
            addCriterion("WDMIN >", value, "wdmin");
            return (Criteria) this;
        }

        public Criteria andWdminGreaterThanOrEqualTo(String value) {
            addCriterion("WDMIN >=", value, "wdmin");
            return (Criteria) this;
        }

        public Criteria andWdminLessThan(String value) {
            addCriterion("WDMIN <", value, "wdmin");
            return (Criteria) this;
        }

        public Criteria andWdminLessThanOrEqualTo(String value) {
            addCriterion("WDMIN <=", value, "wdmin");
            return (Criteria) this;
        }

        public Criteria andWdminLike(String value) {
            addCriterion("WDMIN like", value, "wdmin");
            return (Criteria) this;
        }

        public Criteria andWdminNotLike(String value) {
            addCriterion("WDMIN not like", value, "wdmin");
            return (Criteria) this;
        }

        public Criteria andWdminIn(List<String> values) {
            addCriterion("WDMIN in", values, "wdmin");
            return (Criteria) this;
        }

        public Criteria andWdminNotIn(List<String> values) {
            addCriterion("WDMIN not in", values, "wdmin");
            return (Criteria) this;
        }

        public Criteria andWdminBetween(String value1, String value2) {
            addCriterion("WDMIN between", value1, value2, "wdmin");
            return (Criteria) this;
        }

        public Criteria andWdminNotBetween(String value1, String value2) {
            addCriterion("WDMIN not between", value1, value2, "wdmin");
            return (Criteria) this;
        }

        public Criteria andSdmaxIsNull() {
            addCriterion("SDMAX is null");
            return (Criteria) this;
        }

        public Criteria andSdmaxIsNotNull() {
            addCriterion("SDMAX is not null");
            return (Criteria) this;
        }

        public Criteria andSdmaxEqualTo(String value) {
            addCriterion("SDMAX =", value, "sdmax");
            return (Criteria) this;
        }

        public Criteria andSdmaxNotEqualTo(String value) {
            addCriterion("SDMAX <>", value, "sdmax");
            return (Criteria) this;
        }

        public Criteria andSdmaxGreaterThan(String value) {
            addCriterion("SDMAX >", value, "sdmax");
            return (Criteria) this;
        }

        public Criteria andSdmaxGreaterThanOrEqualTo(String value) {
            addCriterion("SDMAX >=", value, "sdmax");
            return (Criteria) this;
        }

        public Criteria andSdmaxLessThan(String value) {
            addCriterion("SDMAX <", value, "sdmax");
            return (Criteria) this;
        }

        public Criteria andSdmaxLessThanOrEqualTo(String value) {
            addCriterion("SDMAX <=", value, "sdmax");
            return (Criteria) this;
        }

        public Criteria andSdmaxLike(String value) {
            addCriterion("SDMAX like", value, "sdmax");
            return (Criteria) this;
        }

        public Criteria andSdmaxNotLike(String value) {
            addCriterion("SDMAX not like", value, "sdmax");
            return (Criteria) this;
        }

        public Criteria andSdmaxIn(List<String> values) {
            addCriterion("SDMAX in", values, "sdmax");
            return (Criteria) this;
        }

        public Criteria andSdmaxNotIn(List<String> values) {
            addCriterion("SDMAX not in", values, "sdmax");
            return (Criteria) this;
        }

        public Criteria andSdmaxBetween(String value1, String value2) {
            addCriterion("SDMAX between", value1, value2, "sdmax");
            return (Criteria) this;
        }

        public Criteria andSdmaxNotBetween(String value1, String value2) {
            addCriterion("SDMAX not between", value1, value2, "sdmax");
            return (Criteria) this;
        }

        public Criteria andSdminIsNull() {
            addCriterion("SDMIN is null");
            return (Criteria) this;
        }

        public Criteria andSdminIsNotNull() {
            addCriterion("SDMIN is not null");
            return (Criteria) this;
        }

        public Criteria andSdminEqualTo(String value) {
            addCriterion("SDMIN =", value, "sdmin");
            return (Criteria) this;
        }

        public Criteria andSdminNotEqualTo(String value) {
            addCriterion("SDMIN <>", value, "sdmin");
            return (Criteria) this;
        }

        public Criteria andSdminGreaterThan(String value) {
            addCriterion("SDMIN >", value, "sdmin");
            return (Criteria) this;
        }

        public Criteria andSdminGreaterThanOrEqualTo(String value) {
            addCriterion("SDMIN >=", value, "sdmin");
            return (Criteria) this;
        }

        public Criteria andSdminLessThan(String value) {
            addCriterion("SDMIN <", value, "sdmin");
            return (Criteria) this;
        }

        public Criteria andSdminLessThanOrEqualTo(String value) {
            addCriterion("SDMIN <=", value, "sdmin");
            return (Criteria) this;
        }

        public Criteria andSdminLike(String value) {
            addCriterion("SDMIN like", value, "sdmin");
            return (Criteria) this;
        }

        public Criteria andSdminNotLike(String value) {
            addCriterion("SDMIN not like", value, "sdmin");
            return (Criteria) this;
        }

        public Criteria andSdminIn(List<String> values) {
            addCriterion("SDMIN in", values, "sdmin");
            return (Criteria) this;
        }

        public Criteria andSdminNotIn(List<String> values) {
            addCriterion("SDMIN not in", values, "sdmin");
            return (Criteria) this;
        }

        public Criteria andSdminBetween(String value1, String value2) {
            addCriterion("SDMIN between", value1, value2, "sdmin");
            return (Criteria) this;
        }

        public Criteria andSdminNotBetween(String value1, String value2) {
            addCriterion("SDMIN not between", value1, value2, "sdmin");
            return (Criteria) this;
        }

        public Criteria andPlantbhIsNull() {
            addCriterion("PLANTBH is null");
            return (Criteria) this;
        }

        public Criteria andPlantbhIsNotNull() {
            addCriterion("PLANTBH is not null");
            return (Criteria) this;
        }

        public Criteria andPlantbhEqualTo(String value) {
            addCriterion("PLANTBH =", value, "plantbh");
            return (Criteria) this;
        }

        public Criteria andPlantbhNotEqualTo(String value) {
            addCriterion("PLANTBH <>", value, "plantbh");
            return (Criteria) this;
        }

        public Criteria andPlantbhGreaterThan(String value) {
            addCriterion("PLANTBH >", value, "plantbh");
            return (Criteria) this;
        }

        public Criteria andPlantbhGreaterThanOrEqualTo(String value) {
            addCriterion("PLANTBH >=", value, "plantbh");
            return (Criteria) this;
        }

        public Criteria andPlantbhLessThan(String value) {
            addCriterion("PLANTBH <", value, "plantbh");
            return (Criteria) this;
        }

        public Criteria andPlantbhLessThanOrEqualTo(String value) {
            addCriterion("PLANTBH <=", value, "plantbh");
            return (Criteria) this;
        }

        public Criteria andPlantbhLike(String value) {
            addCriterion("PLANTBH like", value, "plantbh");
            return (Criteria) this;
        }

        public Criteria andPlantbhNotLike(String value) {
            addCriterion("PLANTBH not like", value, "plantbh");
            return (Criteria) this;
        }

        public Criteria andPlantbhIn(List<String> values) {
            addCriterion("PLANTBH in", values, "plantbh");
            return (Criteria) this;
        }

        public Criteria andPlantbhNotIn(List<String> values) {
            addCriterion("PLANTBH not in", values, "plantbh");
            return (Criteria) this;
        }

        public Criteria andPlantbhBetween(String value1, String value2) {
            addCriterion("PLANTBH between", value1, value2, "plantbh");
            return (Criteria) this;
        }

        public Criteria andPlantbhNotBetween(String value1, String value2) {
            addCriterion("PLANTBH not between", value1, value2, "plantbh");
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