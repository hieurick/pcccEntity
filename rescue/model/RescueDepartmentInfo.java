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

public class RescueDepartmentInfo {

	public RescueDepartmentInfo() {
		super();
	}

	protected long rescueDepartmentId;

	public long getRescueDepartmentId() {
		return rescueDepartmentId;
	}

	public void setRescueDepartmentId(long rescueDepartmentId) {
		this.rescueDepartmentId = rescueDepartmentId;
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

	protected String center;

	public String getCenter() {
		return center;
	}

	public void setCenter(String center) {
		this.center = center;
	}

	protected String search;

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	protected String staffOwner;

	public String getStaffOwner() {
		return staffOwner;
	}

	public void setStaffOwner(String staffOwner) {
		this.staffOwner = staffOwner;
	}

	protected String contactPhone;

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	protected Long waterpointnumber;

	public Long getWaterpointnumber() {
		return waterpointnumber;
	}

	public void setWaterpointnumber(Long waterpointnumber) {
		this.waterpointnumber = waterpointnumber;
	}

	protected Long devicenumber;

	public Long getDevicenumber() {
		return devicenumber;
	}

	public void setDevicenumber(Long devicenumber) {
		this.devicenumber = devicenumber;
	}

	protected String avatarUrl;

	public String getAvatarUrl() {
		return avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	protected Long deptTypeId;

	public Long getDeptTypeId() {
		return deptTypeId;
	}

	public void setDeptTypeId(Long deptTypeId) {
		this.deptTypeId = deptTypeId;
	}

	protected String deptTypeName;

	public String getDeptTypeName() {
		return deptTypeName;
	}

	public void setDeptTypeName(String deptTypeName) {
		this.deptTypeName = deptTypeName;
	}

	protected Boolean isDisplayOnMap;

	public Boolean isIsDisplayOnMap() {
		return isDisplayOnMap;
	}

	public void setIsDisplayOnMap(Boolean isDisplayOnMap) {
		this.isDisplayOnMap = isDisplayOnMap;
	}

	protected Long fireStaffNumber;

	public Long getFireStaffNumber() {
		return fireStaffNumber;
	}

	public void setFireStaffNumber(Long fireStaffNumber) {
		this.fireStaffNumber = fireStaffNumber;
	}

	protected Long manageStaffNumber;

	public Long getManageStaffNumber() {
		return manageStaffNumber;
	}

	public void setManageStaffNumber(Long manageStaffNumber) {
		this.manageStaffNumber = manageStaffNumber;
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

}