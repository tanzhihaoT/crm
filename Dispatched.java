/**
 * 文件名:派公表
 * 版权(c) 2019-雷升公司 crm项目组：
 * 版 本 号： 1.0
 */

package com.how2java.shiro.entity;

/**
 * @author tanzhihao
 * @date 2019-11-27 12:01
 * @Version crm1.0
 */

public class Dispatched {
    /**
     * 任务编号
     */
    private int pkTaskId;
    /**
     *任务名称
     */
    private String dispatchingTaskName;
    /**
     *任务内容
     */
    private String dispatchingTaskContent;
    /**
     *状态
     */
    private String dispatchingState;
    /**
     *优先级
     */
    private String dispatchingPriority;
    /**
     *开始时间
     */
    private String dispatchingStartTime;
    /**
     *结束时间
     */
    private String dispatchingEndTime;
    /**
     *员工id
     */
    private int fkUserId;
    /**
     *投诉编号
     */
    private int fkComId;
    /**
     *最后修改时间
     */
    private String dispatchingGtmModified;
    /**
     *最后修改人
     */
    private String dispatchingUpdteUser;
    /**
     *创建时间
     */
    private String dispatchingGmtCreate;
    /**
     *创建人
     */
    private String dispatchingCreationUser;

    @Override
    public String toString() {
        return "Dispatched{" +
                "pkTaskId=" + pkTaskId +
                ", dispatchingTaskName='" + dispatchingTaskName + '\'' +
                ", dispatchingTaskContent='" + dispatchingTaskContent + '\'' +
                ", dispatchingState='" + dispatchingState + '\'' +
                ", dispatchingPriority='" + dispatchingPriority + '\'' +
                ", dispatchingStartTime='" + dispatchingStartTime + '\'' +
                ", dispatchingEndTime='" + dispatchingEndTime + '\'' +
                ", fkUserId=" + fkUserId +
                ", fkComId=" + fkComId +
                ", dispatchingGtmModified='" + dispatchingGtmModified + '\'' +
                ", dispatchingUpdteUser='" + dispatchingUpdteUser + '\'' +
                ", dispatchingGmtCreate='" + dispatchingGmtCreate + '\'' +
                ", dispatchingCreationUser='" + dispatchingCreationUser + '\'' +
                '}';
    }

    public Dispatched(int pkTaskId, String dispatchingTaskName, String dispatchingTaskContent, String dispatchingState, String dispatchingPriority, String dispatchingStartTime, String dispatchingEndTime, int fkUserId, int fkComId, String dispatchingGtmModified, String dispatchingUpdteUser, String dispatchingGmtCreate, String dispatchingCreationUser) {
        this.pkTaskId = pkTaskId;
        this.dispatchingTaskName = dispatchingTaskName;
        this.dispatchingTaskContent = dispatchingTaskContent;
        this.dispatchingState = dispatchingState;
        this.dispatchingPriority = dispatchingPriority;
        this.dispatchingStartTime = dispatchingStartTime;
        this.dispatchingEndTime = dispatchingEndTime;
        this.fkUserId = fkUserId;
        this.fkComId = fkComId;
        this.dispatchingGtmModified = dispatchingGtmModified;
        this.dispatchingUpdteUser = dispatchingUpdteUser;
        this.dispatchingGmtCreate = dispatchingGmtCreate;
        this.dispatchingCreationUser = dispatchingCreationUser;
    }

    public Dispatched() {
    }

    public int getPkTaskId() {
        return pkTaskId;
    }

    public void setPkTaskId(int pkTaskId) {
        this.pkTaskId = pkTaskId;
    }

    public String getDispatchingTaskName() {
        return dispatchingTaskName;
    }

    public void setDispatchingTaskName(String dispatchingTaskName) {
        this.dispatchingTaskName = dispatchingTaskName;
    }

    public String getDispatchingTaskContent() {
        return dispatchingTaskContent;
    }

    public void setDispatchingTaskContent(String dispatchingTaskContent) {
        this.dispatchingTaskContent = dispatchingTaskContent;
    }

    public String getDispatchingState() {
        return dispatchingState;
    }

    public void setDispatchingState(String dispatchingState) {
        this.dispatchingState = dispatchingState;
    }

    public String getDispatchingPriority() {
        return dispatchingPriority;
    }

    public void setDispatchingPriority(String dispatchingPriority) {
        this.dispatchingPriority = dispatchingPriority;
    }

    public String getDispatchingStartTime() {
        return dispatchingStartTime;
    }

    public void setDispatchingStartTime(String dispatchingStartTime) {
        this.dispatchingStartTime = dispatchingStartTime;
    }

    public String getDispatchingEndTime() {
        return dispatchingEndTime;
    }

    public void setDispatchingEndTime(String dispatchingEndTime) {
        this.dispatchingEndTime = dispatchingEndTime;
    }

    public int getFkUserId() {
        return fkUserId;
    }

    public void setFkUserId(int fkUserId) {
        this.fkUserId = fkUserId;
    }

    public int getFkComId() {
        return fkComId;
    }

    public void setFkComId(int fkComId) {
        this.fkComId = fkComId;
    }

    public String getDispatchingGtmModified() {
        return dispatchingGtmModified;
    }

    public void setDispatchingGtmModified(String dispatchingGtmModified) {
        this.dispatchingGtmModified = dispatchingGtmModified;
    }

    public String getDispatchingUpdteUser() {
        return dispatchingUpdteUser;
    }

    public void setDispatchingUpdteUser(String dispatchingUpdteUser) {
        this.dispatchingUpdteUser = dispatchingUpdteUser;
    }

    public String getDispatchingGmtCreate() {
        return dispatchingGmtCreate;
    }

    public void setDispatchingGmtCreate(String dispatchingGmtCreate) {
        this.dispatchingGmtCreate = dispatchingGmtCreate;
    }

    public String getDispatchingCreationUser() {
        return dispatchingCreationUser;
    }

    public void setDispatchingCreationUser(String dispatchingCreationUser) {
        this.dispatchingCreationUser = dispatchingCreationUser;
    }
}
