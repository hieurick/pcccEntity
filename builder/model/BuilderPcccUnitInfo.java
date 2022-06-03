/*
   Copyright (c) 2021-present zFANTASISTAz
*/

package builder.rest.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author HieuNN
 * @generated
 */

/*
 * NOTE FOR DEVELOPERS:
 *
 * Never modify or reference this class directly
 */
/*
*/

public class BuilderPcccUnitInfo {

	public BuilderPcccUnitInfo() {
		super();
	}

	protected long BuilderPcccUnitId;

	public long getBuilderPcccUnitId() {
		return BuilderPcccUnitId;
	}

	public void setBuilderPcccUnitId(long BuilderPcccUnitId) {
		this.BuilderPcccUnitId = BuilderPcccUnitId;
	}

	protected long groupId;

	public long getGroupId() {
		return groupId;
	}

	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}

	protected long companyId;

	public long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}

	protected long userId;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	protected String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	protected Date createDate;

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	protected Date modifiedDate;

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	protected Boolean active;

	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected Long builderId;

	public Long getBuilderId() {
		return builderId;
	}

	public void setBuilderId(Long builderId) {
		this.builderId = builderId;
	}

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	protected Date dob;

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	protected String dept;

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	protected String phoneNumber;

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	protected Boolean inWorkingTime;

	public Boolean isInWorkingTime() {
		return inWorkingTime;
	}

	public void setInWorkingTime(Boolean inWorkingTime) {
		this.inWorkingTime = inWorkingTime;
	}

	protected Boolean haveCert;

	public Boolean isHaveCert() {
		return haveCert;
	}

	public void setHaveCert(Boolean haveCert) {
		this.haveCert = haveCert;
	}

	protected Boolean isLeader;

	public Boolean isIsLeader() {
		return isLeader;
	}

	public void setIsLeader(Boolean isLeader) {
		this.isLeader = isLeader;
	}

	protected String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	protected Long userApproveId;

	public Long getUserApproveId() {
		return userApproveId;
	}

	public void setUserApproveId(Long userApproveId) {
		this.userApproveId = userApproveId;
	}

	protected String userApproveName;

	public String getUserApproveName() {
		return userApproveName;
	}

	public void setUserApproveName(String userApproveName) {
		this.userApproveName = userApproveName;
	}

}