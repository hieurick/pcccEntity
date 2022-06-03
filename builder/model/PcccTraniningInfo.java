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

public class PcccTraniningInfo {

	public PcccTraniningInfo() {
		super();
	}

	protected long PcccTraniningId;

	public long getPcccTraniningId() {
		return PcccTraniningId;
	}

	public void setPcccTraniningId(long PcccTraniningId) {
		this.PcccTraniningId = PcccTraniningId;
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

	protected String documentCode;

	public String getDocumentCode() {
		return documentCode;
	}

	public void setDocumentCode(String documentCode) {
		this.documentCode = documentCode;
	}

	protected String documentPosition;

	public String getDocumentPosition() {
		return documentPosition;
	}

	public void setDocumentPosition(String documentPosition) {
		this.documentPosition = documentPosition;
	}

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	protected Date traniningDate;

	public Date getTraniningDate() {
		return traniningDate;
	}

	public void setTraniningDate(Date traniningDate) {
		this.traniningDate = traniningDate;
	}

	protected String traniningCertNumber;

	public String getTraniningCertNumber() {
		return traniningCertNumber;
	}

	public void setTraniningCertNumber(String traniningCertNumber) {
		this.traniningCertNumber = traniningCertNumber;
	}

	protected String traniningContent;

	public String getTraniningContent() {
		return traniningContent;
	}

	public void setTraniningContent(String traniningContent) {
		this.traniningContent = traniningContent;
	}

	protected String traniningDuration;

	public String getTraniningDuration() {
		return traniningDuration;
	}

	public void setTraniningDuration(String traniningDuration) {
		this.traniningDuration = traniningDuration;
	}

	protected Long rescueUnitNumber;

	public Long getRescueUnitNumber() {
		return rescueUnitNumber;
	}

	public void setRescueUnitNumber(Long rescueUnitNumber) {
		this.rescueUnitNumber = rescueUnitNumber;
	}

	protected Long leaderNumber;

	public Long getLeaderNumber() {
		return leaderNumber;
	}

	public void setLeaderNumber(Long leaderNumber) {
		this.leaderNumber = leaderNumber;
	}

	protected Long staffNumber;

	public Long getStaffNumber() {
		return staffNumber;
	}

	public void setStaffNumber(Long staffNumber) {
		this.staffNumber = staffNumber;
	}

	protected Long otherObjectNumber;

	public Long getOtherObjectNumber() {
		return otherObjectNumber;
	}

	public void setOtherObjectNumber(Long otherObjectNumber) {
		this.otherObjectNumber = otherObjectNumber;
	}

	protected String properties;

	public String getProperties() {
		return properties;
	}

	public void setProperties(String properties) {
		this.properties = properties;
	}

	protected String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	protected Long builderId;

	public Long getBuilderId() {
		return builderId;
	}

	public void setBuilderId(Long builderId) {
		this.builderId = builderId;
	}

	protected Long provinceId;

	public Long getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(Long provinceId) {
		this.provinceId = provinceId;
	}

	protected Long districtId;

	public Long getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Long districtId) {
		this.districtId = districtId;
	}

	protected String provinceName;

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	protected String districtName;

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	protected String builderName;

	public String getBuilderName() {
		return builderName;
	}

	public void setBuilderName(String builderName) {
		this.builderName = builderName;
	}

}