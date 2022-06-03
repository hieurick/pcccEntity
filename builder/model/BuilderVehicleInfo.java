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

public class BuilderVehicleInfo {

	public BuilderVehicleInfo() {
		super();
	}

	protected long BuilderVehicleId;

	public long getBuilderVehicleId() {
		return BuilderVehicleId;
	}

	public void setBuilderVehicleId(long BuilderVehicleId) {
		this.BuilderVehicleId = BuilderVehicleId;
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

	protected String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	protected String typeDetail;

	public String getTypeDetail() {
		return typeDetail;
	}

	public void setTypeDetail(String typeDetail) {
		this.typeDetail = typeDetail;
	}

	protected long quantity;

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	protected String posititon;

	public String getPosititon() {
		return posititon;
	}

	public void setPosititon(String posititon) {
		this.posititon = posititon;
	}

	protected String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
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