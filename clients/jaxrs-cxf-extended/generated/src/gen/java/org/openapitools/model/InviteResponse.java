package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BaseInviteDataResponseInviteData;
import org.openapitools.model.BusinessAccessUserSummary;
import org.openapitools.model.InviteAssetsSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class InviteResponse  {
  
  @ApiModelProperty(value = "")
  @Valid
  private InviteAssetsSummary assetsSummary;

 /**
  * The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
  */
  @ApiModelProperty(example = "[\"BIZ_ADMIN\"]", value = "The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.")
  private List<String> businessRoles = new ArrayList<>();

 /**
  * Metadata for the business that created the invite/request.
  */
  @ApiModelProperty(value = "Metadata for the business that created the invite/request.")
  @Valid
  private BusinessAccessUserSummary createdByBusiness;

 /**
  * Metadata for the user that created the invite/request.
  */
  @ApiModelProperty(value = "Metadata for the user that created the invite/request.")
  @Valid
  private BusinessAccessUserSummary createdByUser;

 /**
  * The time the invite/request was created. Returned in milliseconds.
  */
  @ApiModelProperty(example = "1646767577816", value = "The time the invite/request was created. Returned in milliseconds.")
  private Integer createdTime;

 /**
  * Unique identifier of the invite/request.
  */
  @ApiModelProperty(example = "383791336903426391", value = "Unique identifier of the invite/request.")
  private String id;

  @ApiModelProperty(value = "")
  @Valid
  private BaseInviteDataResponseInviteData inviteData;

 /**
  * Indicates whether the invite/request was received.
  */
  @ApiModelProperty(value = "Indicates whether the invite/request was received.")
  private Boolean isReceivedInvite;

 /**
  * Metadata for the member/partner that was sent the invite/request.
  */
  @ApiModelProperty(value = "Metadata for the member/partner that was sent the invite/request.")
  @Valid
  private BusinessAccessUserSummary user;
 /**
  * Get assetsSummary
  * @return assetsSummary
  */
  @JsonProperty("assets_summary")
  public InviteAssetsSummary getAssetsSummary() {
    return assetsSummary;
  }

  /**
   * Sets the <code>assetsSummary</code> property.
   */
 public void setAssetsSummary(InviteAssetsSummary assetsSummary) {
    this.assetsSummary = assetsSummary;
  }

  /**
   * Sets the <code>assetsSummary</code> property.
   */
  public InviteResponse assetsSummary(InviteAssetsSummary assetsSummary) {
    this.assetsSummary = assetsSummary;
    return this;
  }

 /**
  * The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
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
  public InviteResponse businessRoles(List<String> businessRoles) {
    this.businessRoles = businessRoles;
    return this;
  }

  /**
   * Adds a new item to the <code>businessRoles</code> list.
   */
  public InviteResponse addBusinessRolesItem(String businessRolesItem) {
    this.businessRoles.add(businessRolesItem);
    return this;
  }

 /**
  * Metadata for the business that created the invite/request.
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
  public InviteResponse createdByBusiness(BusinessAccessUserSummary createdByBusiness) {
    this.createdByBusiness = createdByBusiness;
    return this;
  }

 /**
  * Metadata for the user that created the invite/request.
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
  public InviteResponse createdByUser(BusinessAccessUserSummary createdByUser) {
    this.createdByUser = createdByUser;
    return this;
  }

 /**
  * The time the invite/request was created. Returned in milliseconds.
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
  public InviteResponse createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

 /**
  * Unique identifier of the invite/request.
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
  public InviteResponse id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Get inviteData
  * @return inviteData
  */
  @JsonProperty("invite_data")
  public BaseInviteDataResponseInviteData getInviteData() {
    return inviteData;
  }

  /**
   * Sets the <code>inviteData</code> property.
   */
 public void setInviteData(BaseInviteDataResponseInviteData inviteData) {
    this.inviteData = inviteData;
  }

  /**
   * Sets the <code>inviteData</code> property.
   */
  public InviteResponse inviteData(BaseInviteDataResponseInviteData inviteData) {
    this.inviteData = inviteData;
    return this;
  }

 /**
  * Indicates whether the invite/request was received.
  * @return isReceivedInvite
  */
  @JsonProperty("is_received_invite")
  public Boolean getIsReceivedInvite() {
    return isReceivedInvite;
  }

  /**
   * Sets the <code>isReceivedInvite</code> property.
   */
 public void setIsReceivedInvite(Boolean isReceivedInvite) {
    this.isReceivedInvite = isReceivedInvite;
  }

  /**
   * Sets the <code>isReceivedInvite</code> property.
   */
  public InviteResponse isReceivedInvite(Boolean isReceivedInvite) {
    this.isReceivedInvite = isReceivedInvite;
    return this;
  }

 /**
  * Metadata for the member/partner that was sent the invite/request.
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
  public InviteResponse user(BusinessAccessUserSummary user) {
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
    InviteResponse inviteResponse = (InviteResponse) o;
    return Objects.equals(this.assetsSummary, inviteResponse.assetsSummary) &&
        Objects.equals(this.businessRoles, inviteResponse.businessRoles) &&
        Objects.equals(this.createdByBusiness, inviteResponse.createdByBusiness) &&
        Objects.equals(this.createdByUser, inviteResponse.createdByUser) &&
        Objects.equals(this.createdTime, inviteResponse.createdTime) &&
        Objects.equals(this.id, inviteResponse.id) &&
        Objects.equals(this.inviteData, inviteResponse.inviteData) &&
        Objects.equals(this.isReceivedInvite, inviteResponse.isReceivedInvite) &&
        Objects.equals(this.user, inviteResponse.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetsSummary, businessRoles, createdByBusiness, createdByUser, createdTime, id, inviteData, isReceivedInvite, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InviteResponse {\n");
    
    sb.append("    assetsSummary: ").append(toIndentedString(assetsSummary)).append("\n");
    sb.append("    businessRoles: ").append(toIndentedString(businessRoles)).append("\n");
    sb.append("    createdByBusiness: ").append(toIndentedString(createdByBusiness)).append("\n");
    sb.append("    createdByUser: ").append(toIndentedString(createdByUser)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inviteData: ").append(toIndentedString(inviteData)).append("\n");
    sb.append("    isReceivedInvite: ").append(toIndentedString(isReceivedInvite)).append("\n");
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

