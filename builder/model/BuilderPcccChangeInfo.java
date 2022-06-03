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

public class BuilderPcccChangeInfo {

	public BuilderPcccChangeInfo() {
		super();
	}

	protected long BuilderPcccChangeId;

	public long getBuilderPcccChangeId() {
		return BuilderPcccChangeId;
	}

	public void setBuilderPcccChangeId(long BuilderPcccChangeId) {
		this.BuilderPcccChangeId = BuilderPcccChangeId;
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

	protected String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	protected String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	protected String properties;

	public String getProperties() {
		return properties;
	}

	public void setProperties(String properties) {
		this.properties = properties;
	}

	protected Long builderId;

	public Long getBuilderId() {
		return builderId;
	}

	public void setBuilderId(Long builderId) {
		this.builderId = builderId;
	}

	protected String builderName;

	public String getBuilderName() {
		return builderName;
	}

	public void setBuilderName(String builderName) {
		this.builderName = builderName;
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