/*
   Copyright (c) 2021-present zFANTASISTAz
*/

package rescue.rest.model;

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

public class WaterPointInfo {

	public WaterPointInfo() {
		super();
	}

	protected long waterPointId;

	public long getWaterPointId() {
		return waterPointId;
	}

	public void setWaterPointId(long waterPointId) {
		this.waterPointId = waterPointId;
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

	protected String phone;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	protected String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	protected Long waterPointTypeId;

	public Long getWaterPointTypeId() {
		return waterPointTypeId;
	}

	public void setWaterPointTypeId(Long waterPointTypeId) {
		this.waterPointTypeId = waterPointTypeId;
	}

	protected String waterPointTypeName;

	public String getWaterPointTypeName() {
		return waterPointTypeName;
	}

	public void setWaterPointTypeName(String waterPointTypeName) {
		this.waterPointTypeName = waterPointTypeName;
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

	protected String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	protected String important;

	public String getImportant() {
		return important;
	}

	public void setImportant(String important) {
		this.important = important;
	}

	protected String search;

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	protected Boolean waterAvaiable;

	public Boolean isWaterAvaiable() {
		return waterAvaiable;
	}

	public void setWaterAvaiable(Boolean waterAvaiable) {
		this.waterAvaiable = waterAvaiable;
	}

	protected Boolean isDisplayOnMap;

	public Boolean isIsDisplayOnMap() {
		return isDisplayOnMap;
	}

	public void setIsDisplayOnMap(Boolean isDisplayOnMap) {
		this.isDisplayOnMap = isDisplayOnMap;
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

	protected Long rescueDepartmentId;

	public Long getRescueDepartmentId() {
		return rescueDepartmentId;
	}

	public void setRescueDepartmentId(Long rescueDepartmentId) {
		this.rescueDepartmentId = rescueDepartmentId;
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

}