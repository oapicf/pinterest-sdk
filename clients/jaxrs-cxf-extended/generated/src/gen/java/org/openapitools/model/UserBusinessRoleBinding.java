package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BusinessAccessUserSummary;
import org.openapitools.model.BusinessMemberAssetsSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UserBusinessRoleBinding  {
  
  @ApiModelProperty(value = "")
  @Valid
  private BusinessMemberAssetsSummary assetsSummary;

 /**
  * The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
  */
  @ApiModelProperty(example = "[\"BIZ_ADMIN\"]", value = "The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.")
  private List<String> businessRoles = new ArrayList<>();

 /**
  * Metadata for the business that created the business relationship.
  */
  @ApiModelProperty(value = "Metadata for the business that created the business relationship.")
  @Valid
  private BusinessAccessUserSummary createdByBusiness;

 /**
  * Metadata for the user that created the business relationship.
  */
  @ApiModelProperty(value = "Metadata for the user that created the business relationship.")
  @Valid
  private BusinessAccessUserSummary createdByUser;

 /**
  * The time the business relationship was created. Returned in milliseconds.
  */
  @ApiModelProperty(example = "1646767577816", value = "The time the business relationship was created. Returned in milliseconds.")
  private Integer createdTime;

 /**
  * Unique identifier of the business member/business partner/employer.
  */
  @ApiModelProperty(example = "383791336903426391", value = "Unique identifier of the business member/business partner/employer.")
  private String id;

 /**
  * This field is only relevant when business_role=\"PARTNER\". <br>If is_shared_partner=FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. <br>If is_shared_partner=TRUE, you can access the partner's business asset. If assets_summary is not empty, the assets listed are the partner's business assets you have access to.
  */
  @ApiModelProperty(example = "false", value = "This field is only relevant when business_role=\"PARTNER\". <br>If is_shared_partner=FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. <br>If is_shared_partner=TRUE, you can access the partner's business asset. If assets_summary is not empty, the assets listed are the partner's business assets you have access to.")
  private Boolean isSharedPartner;

 /**
  * Metadata for the business member/business partner/employer.
  */
  @ApiModelProperty(value = "Metadata for the business member/business partner/employer.")
  @Valid
  private BusinessAccessUserSummary user;
 /**
  * Get assetsSummary
  * @return assetsSummary
  */
  @JsonProperty("assets_summary")
  public BusinessMemberAssetsSummary getAssetsSummary() {
    return assetsSummary;
  }

  /**
   * Sets the <code>assetsSummary</code> property.
   */
 public void setAssetsSummary(BusinessMemberAssetsSummary assetsSummary) {
    this.assetsSummary = assetsSummary;
  }

  /**
   * Sets the <code>assetsSummary</code> property.
   */
  public UserBusinessRoleBinding assetsSummary(BusinessMemberAssetsSummary assetsSummary) {
    this.assetsSummary = assetsSummary;
    return this;
  }

 /**
  * The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
  * @return businessRoles
  */
  @JsonProperty("business_roles")
  public List<String> getBusinessRoles() {
    return businessRoles;
  }

  /**
   * Sets the <code>businessRoles</code> property.
   */
 public void setBusinessRoles(List<String> businessRoles) {
    this.businessRoles = businessRoles;
  }

  /**
   * Sets the <code>businessRoles</code> property.
   */
  public UserBusinessRoleBinding businessRoles(List<String> businessRoles) {
    this.businessRoles = businessRoles;
    return this;
  }

  /**
   * Adds a new item to the <code>businessRoles</code> list.
   */
  public UserBusinessRoleBinding addBusinessRolesItem(String businessRolesItem) {
    this.businessRoles.add(businessRolesItem);
    return this;
  }

 /**
  * Metadata for the business that created the business relationship.
  * @return createdByBusiness
  */
  @JsonProperty("created_by_business")
  public BusinessAccessUserSummary getCreatedByBusiness() {
    return createdByBusiness;
  }

  /**
   * Sets the <code>createdByBusiness</code> property.
   */
 public void setCreatedByBusiness(BusinessAccessUserSummary createdByBusiness) {
    this.createdByBusiness = createdByBusiness;
  }

  /**
   * Sets the <code>createdByBusiness</code> property.
   */
  public UserBusinessRoleBinding createdByBusiness(BusinessAccessUserSummary createdByBusiness) {
    this.createdByBusiness = createdByBusiness;
    return this;
  }

 /**
  * Metadata for the user that created the business relationship.
  * @return createdByUser
  */
  @JsonProperty("created_by_user")
  public BusinessAccessUserSummary getCreatedByUser() {
    return createdByUser;
  }

  /**
   * Sets the <code>createdByUser</code> property.
   */
 public void setCreatedByUser(BusinessAccessUserSummary createdByUser) {
    this.createdByUser = createdByUser;
  }

  /**
   * Sets the <code>createdByUser</code> property.
   */
  public UserBusinessRoleBinding createdByUser(BusinessAccessUserSummary createdByUser) {
    this.createdByUser = createdByUser;
    return this;
  }

 /**
  * The time the business relationship was created. Returned in milliseconds.
  * @return createdTime
  */
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }

  /**
   * Sets the <code>createdTime</code> property.
   */
 public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * Sets the <code>createdTime</code> property.
   */
  public UserBusinessRoleBinding createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

 /**
  * Unique identifier of the business member/business partner/employer.
  * @return id
  */
  @JsonProperty("id")
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public UserBusinessRoleBinding id(String id) {
    this.id = id;
    return this;
  }

 /**
  * This field is only relevant when business_role&#x3D;\&quot;PARTNER\&quot;. &lt;br&gt;If is_shared_partner&#x3D;FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. &lt;br&gt;If is_shared_partner&#x3D;TRUE, you can access the partner&#39;s business asset. If assets_summary is not empty, the assets listed are the partner&#39;s business assets you have access to.
  * @return isSharedPartner
  */
  @JsonProperty("is_shared_partner")
  public Boolean getIsSharedPartner() {
    return isSharedPartner;
  }

  /**
   * Sets the <code>isSharedPartner</code> property.
   */
 public void setIsSharedPartner(Boolean isSharedPartner) {
    this.isSharedPartner = isSharedPartner;
  }

  /**
   * Sets the <code>isSharedPartner</code> property.
   */
  public UserBusinessRoleBinding isSharedPartner(Boolean isSharedPartner) {
    this.isSharedPartner = isSharedPartner;
    return this;
  }

 /**
  * Metadata for the business member/business partner/employer.
  * @return user
  */
  @JsonProperty("user")
  public BusinessAccessUserSummary getUser() {
    return user;
  }

  /**
   * Sets the <code>user</code> property.
   */
 public void setUser(BusinessAccessUserSummary user) {
    this.user = user;
  }

  /**
   * Sets the <code>user</code> property.
   */
  public UserBusinessRoleBinding user(BusinessAccessUserSummary user) {
    this.user = user;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserBusinessRoleBinding userBusinessRoleBinding = (UserBusinessRoleBinding) o;
    return Objects.equals(this.assetsSummary, userBusinessRoleBinding.assetsSummary) &&
        Objects.equals(this.businessRoles, userBusinessRoleBinding.businessRoles) &&
        Objects.equals(this.createdByBusiness, userBusinessRoleBinding.createdByBusiness) &&
        Objects.equals(this.createdByUser, userBusinessRoleBinding.createdByUser) &&
        Objects.equals(this.createdTime, userBusinessRoleBinding.createdTime) &&
        Objects.equals(this.id, userBusinessRoleBinding.id) &&
        Objects.equals(this.isSharedPartner, userBusinessRoleBinding.isSharedPartner) &&
        Objects.equals(this.user, userBusinessRoleBinding.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetsSummary, businessRoles, createdByBusiness, createdByUser, createdTime, id, isSharedPartner, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserBusinessRoleBinding {\n");
    
    sb.append("    assetsSummary: ").append(toIndentedString(assetsSummary)).append("\n");
    sb.append("    businessRoles: ").append(toIndentedString(businessRoles)).append("\n");
    sb.append("    createdByBusiness: ").append(toIndentedString(createdByBusiness)).append("\n");
    sb.append("    createdByUser: ").append(toIndentedString(createdByUser)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isSharedPartner: ").append(toIndentedString(isSharedPartner)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

