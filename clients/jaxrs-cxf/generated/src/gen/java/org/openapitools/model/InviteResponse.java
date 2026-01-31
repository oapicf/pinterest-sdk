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
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class InviteResponse  {
  
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

  private Object createdByBusiness;

 /**
  * Metadata for the user that created the invite/request.
  */
  @ApiModelProperty(value = "Metadata for the user that created the invite/request.")

  private Object createdByUser;

 /**
  * The time the invite/request was created. Returned in milliseconds.
  */
  @ApiModelProperty(example = "1646767577816", value = "The time the invite/request was created. Returned in milliseconds.")

  private Integer createdTime;
 /**
   * Unique identifier of the invite/request.
   * @return id
  **/
  @JsonProperty("id")
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InviteResponse id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get inviteData
   * @return inviteData
  **/
  @JsonProperty("invite_data")
  public BaseInviteDataResponseInviteData getInviteData() {
    return inviteData;
  }

  public void setInviteData(BaseInviteDataResponseInviteData inviteData) {
    this.inviteData = inviteData;
  }

  public InviteResponse inviteData(BaseInviteDataResponseInviteData inviteData) {
    this.inviteData = inviteData;
    return this;
  }

 /**
   * Indicates whether the invite/request was received.
   * @return isReceivedInvite
  **/
  @JsonProperty("is_received_invite")
  public Boolean getIsReceivedInvite() {
    return isReceivedInvite;
  }

  public void setIsReceivedInvite(Boolean isReceivedInvite) {
    this.isReceivedInvite = isReceivedInvite;
  }

  public InviteResponse isReceivedInvite(Boolean isReceivedInvite) {
    this.isReceivedInvite = isReceivedInvite;
    return this;
  }

 /**
   * Metadata for the member/partner that was sent the invite/request.
   * @return user
  **/
  @JsonProperty("user")
  public BusinessAccessUserSummary getUser() {
    return user;
  }

  public void setUser(BusinessAccessUserSummary user) {
    this.user = user;
  }

  public InviteResponse user(BusinessAccessUserSummary user) {
    this.user = user;
    return this;
  }

 /**
   * Get assetsSummary
   * @return assetsSummary
  **/
  @JsonProperty("assets_summary")
  public InviteAssetsSummary getAssetsSummary() {
    return assetsSummary;
  }

  public void setAssetsSummary(InviteAssetsSummary assetsSummary) {
    this.assetsSummary = assetsSummary;
  }

  public InviteResponse assetsSummary(InviteAssetsSummary assetsSummary) {
    this.assetsSummary = assetsSummary;
    return this;
  }

 /**
   * The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
   * @return businessRoles
  **/
  @JsonProperty("business_roles")
  public List<String> getBusinessRoles() {
    return businessRoles;
  }

  public void setBusinessRoles(List<String> businessRoles) {
    this.businessRoles = businessRoles;
  }

  public InviteResponse businessRoles(List<String> businessRoles) {
    this.businessRoles = businessRoles;
    return this;
  }

  public InviteResponse addBusinessRolesItem(String businessRolesItem) {
    this.businessRoles.add(businessRolesItem);
    return this;
  }

 /**
   * Metadata for the business that created the invite/request.
   * @return createdByBusiness
  **/
  @JsonProperty("created_by_business")
  public Object getCreatedByBusiness() {
    return createdByBusiness;
  }

  public void setCreatedByBusiness(Object createdByBusiness) {
    this.createdByBusiness = createdByBusiness;
  }

  public InviteResponse createdByBusiness(Object createdByBusiness) {
    this.createdByBusiness = createdByBusiness;
    return this;
  }

 /**
   * Metadata for the user that created the invite/request.
   * @return createdByUser
  **/
  @JsonProperty("created_by_user")
  public Object getCreatedByUser() {
    return createdByUser;
  }

  public void setCreatedByUser(Object createdByUser) {
    this.createdByUser = createdByUser;
  }

  public InviteResponse createdByUser(Object createdByUser) {
    this.createdByUser = createdByUser;
    return this;
  }

 /**
   * The time the invite/request was created. Returned in milliseconds.
   * @return createdTime
  **/
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  public InviteResponse createdTime(Integer createdTime) {
    this.createdTime = createdTime;
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
    return Objects.equals(this.id, inviteResponse.id) &&
        Objects.equals(this.inviteData, inviteResponse.inviteData) &&
        Objects.equals(this.isReceivedInvite, inviteResponse.isReceivedInvite) &&
        Objects.equals(this.user, inviteResponse.user) &&
        Objects.equals(this.assetsSummary, inviteResponse.assetsSummary) &&
        Objects.equals(this.businessRoles, inviteResponse.businessRoles) &&
        Objects.equals(this.createdByBusiness, inviteResponse.createdByBusiness) &&
        Objects.equals(this.createdByUser, inviteResponse.createdByUser) &&
        Objects.equals(this.createdTime, inviteResponse.createdTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, inviteData, isReceivedInvite, user, assetsSummary, businessRoles, createdByBusiness, createdByUser, createdTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InviteResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inviteData: ").append(toIndentedString(inviteData)).append("\n");
    sb.append("    isReceivedInvite: ").append(toIndentedString(isReceivedInvite)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    assetsSummary: ").append(toIndentedString(assetsSummary)).append("\n");
    sb.append("    businessRoles: ").append(toIndentedString(businessRoles)).append("\n");
    sb.append("    createdByBusiness: ").append(toIndentedString(createdByBusiness)).append("\n");
    sb.append("    createdByUser: ").append(toIndentedString(createdByUser)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
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

