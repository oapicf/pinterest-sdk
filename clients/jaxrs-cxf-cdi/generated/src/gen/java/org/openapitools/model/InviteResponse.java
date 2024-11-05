package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BaseInviteDataResponseInviteData;
import org.openapitools.model.BusinessAccessUserSummary;
import org.openapitools.model.InviteAssetsSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class InviteResponse   {
  
  private InviteAssetsSummary assetsSummary;

  private List<String> businessRoles = new ArrayList<>();

  private BusinessAccessUserSummary createdByBusiness;

  private BusinessAccessUserSummary createdByUser;

  private Integer createdTime;

  private String id;

  private BaseInviteDataResponseInviteData inviteData;

  private Boolean isReceivedInvite;

  private BusinessAccessUserSummary user;

  /**
   **/
  public InviteResponse assetsSummary(InviteAssetsSummary assetsSummary) {
    this.assetsSummary = assetsSummary;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("assets_summary")
  public InviteAssetsSummary getAssetsSummary() {
    return assetsSummary;
  }
  public void setAssetsSummary(InviteAssetsSummary assetsSummary) {
    this.assetsSummary = assetsSummary;
  }


  /**
   * The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
   **/
  public InviteResponse businessRoles(List<String> businessRoles) {
    this.businessRoles = businessRoles;
    return this;
  }

  
  @ApiModelProperty(example = "[\"BIZ_ADMIN\"]", value = "The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.")
  @JsonProperty("business_roles")
  public List<String> getBusinessRoles() {
    return businessRoles;
  }
  public void setBusinessRoles(List<String> businessRoles) {
    this.businessRoles = businessRoles;
  }

  public InviteResponse addBusinessRolesItem(String businessRolesItem) {
    if (this.businessRoles == null) {
      this.businessRoles = new ArrayList<>();
    }
    this.businessRoles.add(businessRolesItem);
    return this;
  }


  /**
   * Metadata for the business that created the invite/request.
   **/
  public InviteResponse createdByBusiness(BusinessAccessUserSummary createdByBusiness) {
    this.createdByBusiness = createdByBusiness;
    return this;
  }

  
  @ApiModelProperty(value = "Metadata for the business that created the invite/request.")
  @JsonProperty("created_by_business")
  public BusinessAccessUserSummary getCreatedByBusiness() {
    return createdByBusiness;
  }
  public void setCreatedByBusiness(BusinessAccessUserSummary createdByBusiness) {
    this.createdByBusiness = createdByBusiness;
  }


  /**
   * Metadata for the user that created the invite/request.
   **/
  public InviteResponse createdByUser(BusinessAccessUserSummary createdByUser) {
    this.createdByUser = createdByUser;
    return this;
  }

  
  @ApiModelProperty(value = "Metadata for the user that created the invite/request.")
  @JsonProperty("created_by_user")
  public BusinessAccessUserSummary getCreatedByUser() {
    return createdByUser;
  }
  public void setCreatedByUser(BusinessAccessUserSummary createdByUser) {
    this.createdByUser = createdByUser;
  }


  /**
   * The time the invite/request was created. Returned in milliseconds.
   **/
  public InviteResponse createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  
  @ApiModelProperty(example = "1646767577816", value = "The time the invite/request was created. Returned in milliseconds.")
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }


  /**
   * Unique identifier of the invite/request.
   **/
  public InviteResponse id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "383791336903426391", value = "Unique identifier of the invite/request.")
  @JsonProperty("id")
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public InviteResponse inviteData(BaseInviteDataResponseInviteData inviteData) {
    this.inviteData = inviteData;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("invite_data")
  public BaseInviteDataResponseInviteData getInviteData() {
    return inviteData;
  }
  public void setInviteData(BaseInviteDataResponseInviteData inviteData) {
    this.inviteData = inviteData;
  }


  /**
   * Indicates whether the invite/request was received.
   **/
  public InviteResponse isReceivedInvite(Boolean isReceivedInvite) {
    this.isReceivedInvite = isReceivedInvite;
    return this;
  }

  
  @ApiModelProperty(value = "Indicates whether the invite/request was received.")
  @JsonProperty("is_received_invite")
  public Boolean getIsReceivedInvite() {
    return isReceivedInvite;
  }
  public void setIsReceivedInvite(Boolean isReceivedInvite) {
    this.isReceivedInvite = isReceivedInvite;
  }


  /**
   * Metadata for the member/partner that was sent the invite/request.
   **/
  public InviteResponse user(BusinessAccessUserSummary user) {
    this.user = user;
    return this;
  }

  
  @ApiModelProperty(value = "Metadata for the member/partner that was sent the invite/request.")
  @JsonProperty("user")
  public BusinessAccessUserSummary getUser() {
    return user;
  }
  public void setUser(BusinessAccessUserSummary user) {
    this.user = user;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

