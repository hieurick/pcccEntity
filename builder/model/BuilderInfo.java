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

public class BuilderInfo {

	public BuilderInfo() {
		super();
	}

	protected long builderId;

	public long getBuilderId() {
		return builderId;
	}

	public void setBuilderId(long builderId) {
		this.builderId = builderId;
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

	protected String code;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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

	protected String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	protected String phone;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	protected String otherPhone;

	public String getOtherPhone() {
		return otherPhone;
	}

	public void setOtherPhone(String otherPhone) {
		this.otherPhone = otherPhone;
	}

	protected String direction;

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	protected Boolean isDisplayOnMap;

	public Boolean isIsDisplayOnMap() {
		return isDisplayOnMap;
	}

	public void setIsDisplayOnMap(Boolean isDisplayOnMap) {
		this.isDisplayOnMap = isDisplayOnMap;
	}

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	protected Date registerDate;

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	protected Date expireDate;

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	protected String startUpYear;

	public String getStartUpYear() {
		return startUpYear;
	}

	public void setStartUpYear(String startUpYear) {
		this.startUpYear = startUpYear;
	}

	protected Long sensorNumber;

	public Long getSensorNumber() {
		return sensorNumber;
	}

	public void setSensorNumber(Long sensorNumber) {
		this.sensorNumber = sensorNumber;
	}

	protected String search;

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	protected Long ownerTypeId;

	public Long getOwnerTypeId() {
		return ownerTypeId;
	}

	public void setOwnerTypeId(Long ownerTypeId) {
		this.ownerTypeId = ownerTypeId;
	}

	protected String ownerTypeName;

	public String getOwnerTypeName() {
		return ownerTypeName;
	}

	public void setOwnerTypeName(String ownerTypeName) {
		this.ownerTypeName = ownerTypeName;
	}

	protected Boolean fireInsuranceRequired;

	public Boolean isFireInsuranceRequired() {
		return fireInsuranceRequired;
	}

	public void setFireInsuranceRequired(Boolean fireInsuranceRequired) {
		this.fireInsuranceRequired = fireInsuranceRequired;
	}

	protected Boolean fireInsuranceBought;

	public Boolean isFireInsuranceBought() {
		return fireInsuranceBought;
	}

	public void setFireInsuranceBought(Boolean fireInsuranceBought) {
		this.fireInsuranceBought = fireInsuranceBought;
	}

	protected String web;

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	protected String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	protected String avatar;

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	protected Long checkNumberPerYear;

	public Long getCheckNumberPerYear() {
		return checkNumberPerYear;
	}

	public void setCheckNumberPerYear(Long checkNumberPerYear) {
		this.checkNumberPerYear = checkNumberPerYear;
	}

	protected String lat_;

	public String getLat_() {
		return lat_;
	}

	public void setLat_(String lat_) {
		this.lat_ = lat_;
	}

	protected String long_;

	public String getLong_() {
		return long_;
	}

	public void setLong_(String long_) {
		this.long_ = long_;
	}

	protected String adminiLevel;

	public String getAdminiLevel() {
		return adminiLevel;
	}

	public void setAdminiLevel(String adminiLevel) {
		this.adminiLevel = adminiLevel;
	}

	protected String investmentType;

	public String getInvestmentType() {
		return investmentType;
	}

	public void setInvestmentType(String investmentType) {
		this.investmentType = investmentType;
	}

	protected Long investmentTypeId;

	public Long getInvestmentTypeId() {
		return investmentTypeId;
	}

	public void setInvestmentTypeId(Long investmentTypeId) {
		this.investmentTypeId = investmentTypeId;
	}

	protected String investmentTypeName;

	public String getInvestmentTypeName() {
		return investmentTypeName;
	}

	public void setInvestmentTypeName(String investmentTypeName) {
		this.investmentTypeName = investmentTypeName;
	}

	protected String economicSectors;

	public String getEconomicSectors() {
		return economicSectors;
	}

	public void setEconomicSectors(String economicSectors) {
		this.economicSectors = economicSectors;
	}

	protected String activityType;

	public String getActivityType() {
		return activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	protected Long activityTypeId;

	public Long getActivityTypeId() {
		return activityTypeId;
	}

	public void setActivityTypeId(Long activityTypeId) {
		this.activityTypeId = activityTypeId;
	}

	protected String activityTypeName;

	public String getActivityTypeName() {
		return activityTypeName;
	}

	public void setActivityTypeName(String activityTypeName) {
		this.activityTypeName = activityTypeName;
	}

	protected String branchField;

	public String getBranchField() {
		return branchField;
	}

	public void setBranchField(String branchField) {
		this.branchField = branchField;
	}

	protected Long residentId;

	public Long getResidentId() {
		return residentId;
	}

	public void setResidentId(Long residentId) {
		this.residentId = residentId;
	}

	protected Long rescueDepartmentId;

	public Long getRescueDepartmentId() {
		return rescueDepartmentId;
	}

	public void setRescueDepartmentId(Long rescueDepartmentId) {
		this.rescueDepartmentId = rescueDepartmentId;
	}

	protected Long cadresId;

	public Long getCadresId() {
		return cadresId;
	}

	public void setCadresId(Long cadresId) {
		this.cadresId = cadresId;
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

	protected String rescueDepartmentName;

	public String getRescueDepartmentName() {
		return rescueDepartmentName;
	}

	public void setRescueDepartmentName(String rescueDepartmentName) {
		this.rescueDepartmentName = rescueDepartmentName;
	}

	protected String cadresName;

	public String getCadresName() {
		return cadresName;
	}

	public void setCadresName(String cadresName) {
		this.cadresName = cadresName;
	}

	protected String residentName;

	public String getResidentName() {
		return residentName;
	}

	public void setResidentName(String residentName) {
		this.residentName = residentName;
	}

}