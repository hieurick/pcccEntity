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

public class PcccCheckBuilderInfo {

	public PcccCheckBuilderInfo() {
		super();
	}

	protected long PcccCheckBuilderId;

	public long getPcccCheckBuilderId() {
		return PcccCheckBuilderId;
	}

	public void setPcccCheckBuilderId(long PcccCheckBuilderId) {
		this.PcccCheckBuilderId = PcccCheckBuilderId;
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

	protected Long statusId;

	public Long getStatusId() {
		return statusId;
	}

	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}

	protected String statusName;

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	protected String checkName;

	public String getCheckName() {
		return checkName;
	}

	public void setCheckName(String checkName) {
		this.checkName = checkName;
	}

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	protected Date checkDate;

	public Date getCheckDate() {
		return checkDate;
	}

	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
	}

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	protected Date checkStartDate;

	public Date getCheckStartDate() {
		return checkStartDate;
	}

	public void setCheckStartDate(Date checkStartDate) {
		this.checkStartDate = checkStartDate;
	}

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	protected Date checkEndDate;

	public Date getCheckEndDate() {
		return checkEndDate;
	}

	public void setCheckEndDate(Date checkEndDate) {
		this.checkEndDate = checkEndDate;
	}

	protected String checkDesc;

	public String getCheckDesc() {
		return checkDesc;
	}

	public void setCheckDesc(String checkDesc) {
		this.checkDesc = checkDesc;
	}

	protected String checkContent;

	public String getCheckContent() {
		return checkContent;
	}

	public void setCheckContent(String checkContent) {
		this.checkContent = checkContent;
	}

	protected Long checkStatusId;

	public Long getCheckStatusId() {
		return checkStatusId;
	}

	public void setCheckStatusId(Long checkStatusId) {
		this.checkStatusId = checkStatusId;
	}

	protected String checkStatusName;

	public String getCheckStatusName() {
		return checkStatusName;
	}

	public void setCheckStatusName(String checkStatusName) {
		this.checkStatusName = checkStatusName;
	}

	protected String checkCadresName;

	public String getCheckCadresName() {
		return checkCadresName;
	}

	public void setCheckCadresName(String checkCadresName) {
		this.checkCadresName = checkCadresName;
	}

	protected Long checkCadresId;

	public Long getCheckCadresId() {
		return checkCadresId;
	}

	public void setCheckCadresId(Long checkCadresId) {
		this.checkCadresId = checkCadresId;
	}

	protected String checkDecide;

	public String getCheckDecide() {
		return checkDecide;
	}

	public void setCheckDecide(String checkDecide) {
		this.checkDecide = checkDecide;
	}

	protected String checkInfomation;

	public String getCheckInfomation() {
		return checkInfomation;
	}

	public void setCheckInfomation(String checkInfomation) {
		this.checkInfomation = checkInfomation;
	}

	protected String checkEvaluate;

	public String getCheckEvaluate() {
		return checkEvaluate;
	}

	public void setCheckEvaluate(String checkEvaluate) {
		this.checkEvaluate = checkEvaluate;
	}

	protected String checkCadresEvaluate;

	public String getCheckCadresEvaluate() {
		return checkCadresEvaluate;
	}

	public void setCheckCadresEvaluate(String checkCadresEvaluate) {
		this.checkCadresEvaluate = checkCadresEvaluate;
	}

	protected String checkNote;

	public String getCheckNote() {
		return checkNote;
	}

	public void setCheckNote(String checkNote) {
		this.checkNote = checkNote;
	}

	protected String search;

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	protected String rerejectReason;

	public String getRerejectReason() {
		return rerejectReason;
	}

	public void setRerejectReason(String rerejectReason) {
		this.rerejectReason = rerejectReason;
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

	protected Long checkPlanId;

	public Long getCheckPlanId() {
		return checkPlanId;
	}

	public void setCheckPlanId(Long checkPlanId) {
		this.checkPlanId = checkPlanId;
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

	protected String checkPlanName;

	public String getCheckPlanName() {
		return checkPlanName;
	}

	public void setCheckPlanName(String checkPlanName) {
		this.checkPlanName = checkPlanName;
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