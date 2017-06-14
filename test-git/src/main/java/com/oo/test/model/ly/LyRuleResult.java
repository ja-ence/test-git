package com.oo.test.model.ly;

import java.util.Date;

public class LyRuleResult {
    /**
     *
     */
    private Long id;

    /**
     *申请单编号
     */
    private String appCode;

    /**
     *人工前决策结果
     */
    private String beforeResult;

    /**
     *人工后决策结果
     */
    private String afterResult;

    /**
     *工作流分配
     */
    private String workflowQueue;

    /**
     *决策引擎版本
     */
    private String stragetyversion;

    /**
     *决策引擎版本日期
     */
    private String stragetyversionDate;

    /**
     *是否征信异常 Y:征信异常 N:征信正常
     */
    private String zhengxinAbnormal;

    /**
     *测试标志文本
     */
    private String testFlag;

    /**
     *汇总原因码
     */
    private String mergeRcode;

    /**
     *拒绝原因码
     */
    private String refuseRcode;

    /**
     *风控节点
     */
    private String riskNode;

    /**
     *决策树分组
     */
    private String treeGroup;

    /**
     *基本准入原因码
     */
    private String fundRcode;

    /**
     *外部黑名单原因码
     */
    private String blacklistRcode;

    /**
     *外部咨信原因码
     */
    private String externalRcode;

    /**
     *前海征信原因码
     */
    private String qianhaiRcode;

    /**
     *创建日期
     */
    private Date createTime;

    /**
     *
     */
    private String score;

    /**
     *同盾黑名单详情
     */
    private String tdBlacklistDetail;

    /**
     *百融黑名单详情
     */
    private String brBlacklistDetail;

    /**
     *绿湾驾驶证状态
     */
    private String lwDriverStatus;

    /**
     *可度分
     */
    private Integer qhCredooScore;

    /**
     *数据状态描述
     */
    private String xlDataStatusValue;

    /**
     *ins-Acode
     */
    private String insRuleACode;

    /**
     *ins-Bcode
     */
    private String insRuleBCode;

    /**
     *分组等级
     */
    private String riskGrade;

    /**
     *分组标签
     */
    private String riskLabel;

    /**
     *审核工作流标签
     */
    private String workflowLabel;

    /**
     *申请人国政通不良详情
     */
    private String gztBadInfoDetail;

    /**
     *配偶国政通不良详情
     */
    private String mtGztBadInfoDetail;

    /**
     *担保人国政通不良详情
     */
    private String gtGztBadInfoDetail;

    /**
     *预授信额度
     */
    private Integer preCredit;

    /**
     *预授利率
     */
    private String preRate;

    /**
     *反欺诈结果
     */
    private String fraudAlert;

    /**
     *反欺诈分数
     */
    private Integer fraudScore;

    /**
     *异常征信项
     */
    private String abnormalItem;

    /**
     *
     */
    public Long getId() {
        return id;
    }

    /**
     *
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     *申请单编号
     */
    public String getAppCode() {
        return appCode;
    }

    /**
     *申请单编号
     */
    public void setAppCode(String appCode) {
        this.appCode = appCode == null ? null : appCode.trim();
    }

    /**
     *人工前决策结果
     */
    public String getBeforeResult() {
        return beforeResult;
    }

    /**
     *人工前决策结果
     */
    public void setBeforeResult(String beforeResult) {
        this.beforeResult = beforeResult == null ? null : beforeResult.trim();
    }

    /**
     *人工后决策结果
     */
    public String getAfterResult() {
        return afterResult;
    }

    /**
     *人工后决策结果
     */
    public void setAfterResult(String afterResult) {
        this.afterResult = afterResult == null ? null : afterResult.trim();
    }

    /**
     *工作流分配
     */
    public String getWorkflowQueue() {
        return workflowQueue;
    }

    /**
     *工作流分配
     */
    public void setWorkflowQueue(String workflowQueue) {
        this.workflowQueue = workflowQueue == null ? null : workflowQueue.trim();
    }

    /**
     *决策引擎版本
     */
    public String getStragetyversion() {
        return stragetyversion;
    }

    /**
     *决策引擎版本
     */
    public void setStragetyversion(String stragetyversion) {
        this.stragetyversion = stragetyversion == null ? null : stragetyversion.trim();
    }

    /**
     *决策引擎版本日期
     */
    public String getStragetyversionDate() {
        return stragetyversionDate;
    }

    /**
     *决策引擎版本日期
     */
    public void setStragetyversionDate(String stragetyversionDate) {
        this.stragetyversionDate = stragetyversionDate == null ? null : stragetyversionDate.trim();
    }

    /**
     *是否征信异常 Y:征信异常 N:征信正常
     */
    public String getZhengxinAbnormal() {
        return zhengxinAbnormal;
    }

    /**
     *是否征信异常 Y:征信异常 N:征信正常
     */
    public void setZhengxinAbnormal(String zhengxinAbnormal) {
        this.zhengxinAbnormal = zhengxinAbnormal == null ? null : zhengxinAbnormal.trim();
    }

    /**
     *测试标志文本
     */
    public String getTestFlag() {
        return testFlag;
    }

    /**
     *测试标志文本
     */
    public void setTestFlag(String testFlag) {
        this.testFlag = testFlag == null ? null : testFlag.trim();
    }

    /**
     *汇总原因码
     */
    public String getMergeRcode() {
        return mergeRcode;
    }

    /**
     *汇总原因码
     */
    public void setMergeRcode(String mergeRcode) {
        this.mergeRcode = mergeRcode == null ? null : mergeRcode.trim();
    }

    /**
     *拒绝原因码
     */
    public String getRefuseRcode() {
        return refuseRcode;
    }

    /**
     *拒绝原因码
     */
    public void setRefuseRcode(String refuseRcode) {
        this.refuseRcode = refuseRcode == null ? null : refuseRcode.trim();
    }

    /**
     *风控节点
     */
    public String getRiskNode() {
        return riskNode;
    }

    /**
     *风控节点
     */
    public void setRiskNode(String riskNode) {
        this.riskNode = riskNode == null ? null : riskNode.trim();
    }

    /**
     *决策树分组
     */
    public String getTreeGroup() {
        return treeGroup;
    }

    /**
     *决策树分组
     */
    public void setTreeGroup(String treeGroup) {
        this.treeGroup = treeGroup == null ? null : treeGroup.trim();
    }

    /**
     *基本准入原因码
     */
    public String getFundRcode() {
        return fundRcode;
    }

    /**
     *基本准入原因码
     */
    public void setFundRcode(String fundRcode) {
        this.fundRcode = fundRcode == null ? null : fundRcode.trim();
    }

    /**
     *外部黑名单原因码
     */
    public String getBlacklistRcode() {
        return blacklistRcode;
    }

    /**
     *外部黑名单原因码
     */
    public void setBlacklistRcode(String blacklistRcode) {
        this.blacklistRcode = blacklistRcode == null ? null : blacklistRcode.trim();
    }

    /**
     *外部咨信原因码
     */
    public String getExternalRcode() {
        return externalRcode;
    }

    /**
     *外部咨信原因码
     */
    public void setExternalRcode(String externalRcode) {
        this.externalRcode = externalRcode == null ? null : externalRcode.trim();
    }

    /**
     *前海征信原因码
     */
    public String getQianhaiRcode() {
        return qianhaiRcode;
    }

    /**
     *前海征信原因码
     */
    public void setQianhaiRcode(String qianhaiRcode) {
        this.qianhaiRcode = qianhaiRcode == null ? null : qianhaiRcode.trim();
    }

    /**
     *创建日期
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     *创建日期
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     *
     */
    public String getScore() {
        return score;
    }

    /**
     *
     */
    public void setScore(String score) {
        this.score = score == null ? null : score.trim();
    }

    /**
     *同盾黑名单详情
     */
    public String getTdBlacklistDetail() {
        return tdBlacklistDetail;
    }

    /**
     *同盾黑名单详情
     */
    public void setTdBlacklistDetail(String tdBlacklistDetail) {
        this.tdBlacklistDetail = tdBlacklistDetail == null ? null : tdBlacklistDetail.trim();
    }

    /**
     *百融黑名单详情
     */
    public String getBrBlacklistDetail() {
        return brBlacklistDetail;
    }

    /**
     *百融黑名单详情
     */
    public void setBrBlacklistDetail(String brBlacklistDetail) {
        this.brBlacklistDetail = brBlacklistDetail == null ? null : brBlacklistDetail.trim();
    }

    /**
     *绿湾驾驶证状态
     */
    public String getLwDriverStatus() {
        return lwDriverStatus;
    }

    /**
     *绿湾驾驶证状态
     */
    public void setLwDriverStatus(String lwDriverStatus) {
        this.lwDriverStatus = lwDriverStatus == null ? null : lwDriverStatus.trim();
    }

    /**
     *可度分
     */
    public Integer getQhCredooScore() {
        return qhCredooScore;
    }

    /**
     *可度分
     */
    public void setQhCredooScore(Integer qhCredooScore) {
        this.qhCredooScore = qhCredooScore;
    }

    /**
     *数据状态描述
     */
    public String getXlDataStatusValue() {
        return xlDataStatusValue;
    }

    /**
     *数据状态描述
     */
    public void setXlDataStatusValue(String xlDataStatusValue) {
        this.xlDataStatusValue = xlDataStatusValue == null ? null : xlDataStatusValue.trim();
    }

    /**
     *ins-Acode
     */
    public String getInsRuleACode() {
        return insRuleACode;
    }

    /**
     *ins-Acode
     */
    public void setInsRuleACode(String insRuleACode) {
        this.insRuleACode = insRuleACode == null ? null : insRuleACode.trim();
    }

    /**
     *ins-Bcode
     */
    public String getInsRuleBCode() {
        return insRuleBCode;
    }

    /**
     *ins-Bcode
     */
    public void setInsRuleBCode(String insRuleBCode) {
        this.insRuleBCode = insRuleBCode == null ? null : insRuleBCode.trim();
    }

    /**
     *分组等级
     */
    public String getRiskGrade() {
        return riskGrade;
    }

    /**
     *分组等级
     */
    public void setRiskGrade(String riskGrade) {
        this.riskGrade = riskGrade == null ? null : riskGrade.trim();
    }

    /**
     *分组标签
     */
    public String getRiskLabel() {
        return riskLabel;
    }

    /**
     *分组标签
     */
    public void setRiskLabel(String riskLabel) {
        this.riskLabel = riskLabel == null ? null : riskLabel.trim();
    }

    /**
     *审核工作流标签
     */
    public String getWorkflowLabel() {
        return workflowLabel;
    }

    /**
     *审核工作流标签
     */
    public void setWorkflowLabel(String workflowLabel) {
        this.workflowLabel = workflowLabel == null ? null : workflowLabel.trim();
    }

    /**
     *申请人国政通不良详情
     */
    public String getGztBadInfoDetail() {
        return gztBadInfoDetail;
    }

    /**
     *申请人国政通不良详情
     */
    public void setGztBadInfoDetail(String gztBadInfoDetail) {
        this.gztBadInfoDetail = gztBadInfoDetail == null ? null : gztBadInfoDetail.trim();
    }

    /**
     *配偶国政通不良详情
     */
    public String getMtGztBadInfoDetail() {
        return mtGztBadInfoDetail;
    }

    /**
     *配偶国政通不良详情
     */
    public void setMtGztBadInfoDetail(String mtGztBadInfoDetail) {
        this.mtGztBadInfoDetail = mtGztBadInfoDetail == null ? null : mtGztBadInfoDetail.trim();
    }

    /**
     *担保人国政通不良详情
     */
    public String getGtGztBadInfoDetail() {
        return gtGztBadInfoDetail;
    }

    /**
     *担保人国政通不良详情
     */
    public void setGtGztBadInfoDetail(String gtGztBadInfoDetail) {
        this.gtGztBadInfoDetail = gtGztBadInfoDetail == null ? null : gtGztBadInfoDetail.trim();
    }

    /**
     *预授信额度
     */
    public Integer getPreCredit() {
        return preCredit;
    }

    /**
     *预授信额度
     */
    public void setPreCredit(Integer preCredit) {
        this.preCredit = preCredit;
    }

    /**
     *预授利率
     */
    public String getPreRate() {
        return preRate;
    }

    /**
     *预授利率
     */
    public void setPreRate(String preRate) {
        this.preRate = preRate == null ? null : preRate.trim();
    }

    /**
     *反欺诈结果
     */
    public String getFraudAlert() {
        return fraudAlert;
    }

    /**
     *反欺诈结果
     */
    public void setFraudAlert(String fraudAlert) {
        this.fraudAlert = fraudAlert == null ? null : fraudAlert.trim();
    }

    /**
     *反欺诈分数
     */
    public Integer getFraudScore() {
        return fraudScore;
    }

    /**
     *反欺诈分数
     */
    public void setFraudScore(Integer fraudScore) {
        this.fraudScore = fraudScore;
    }

    /**
     *异常征信项
     */
    public String getAbnormalItem() {
        return abnormalItem;
    }

    /**
     *异常征信项
     */
    public void setAbnormalItem(String abnormalItem) {
        this.abnormalItem = abnormalItem == null ? null : abnormalItem.trim();
    }
}