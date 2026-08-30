package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BusinessAccessUserSummary;
import org.openapitools.model.InviteAssetsSummary;
import org.openapitools.model.InviteDataResponse;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * A user&#39;s username or email OR a partner id that caused the error.
 */
public class InviteResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("assets_summary")
  private InviteAssetsSummary assetsSummary;

  /**
   * The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
   */
  @JsonProperty("business_roles")
  private List<String> businessRoles = new ArrayList<>();

  /**
   * Metadata for the business that created the invite/request.
   */
  @JsonProperty("created_by_business")
  private BusinessAccessUserSummary createdByBusiness;

  /**
   * Metadata for the user that created the invite/request.
   */
  @JsonProperty("created_by_user")
  private BusinessAccessUserSummary createdByUser;

  /**
   * The time the invite/request was created. Returned in milliseconds.
   */
  @JsonProperty("created_time")
  private Integer createdTime;

  /**
   * Unique identifier of the invite/request.
   */
  @JsonProperty("id")
  private String id;

  @JsonProperty("invite_data")
  private InviteDataResponse inviteData;

  /**
   * Indicates whether the invite/request was received.
   */
  @JsonProperty("is_received_invite")
  private Boolean isReceivedInvite;

  /**
   * Metadata for the member/partner that was sent the invite/request.
   */
  @JsonProperty("user")
  private BusinessAccessUserSummary user;

  /**
   * 
   * @return assetsSummary
   */
  public InviteAssetsSummary getAssetsSummary() {
    return assetsSummary;
  }

  public void setAssetsSummary(InviteAssetsSummary assetsSummary) {
    this.assetsSummary = assetsSummary;
  }

  /**
   * The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
   * @return businessRoles
   */
  public List<String> getBusinessRoles() {
    return businessRoles;
  }

  public void setBusinessRoles(List<String> businessRoles) {
    this.businessRoles = businessRoles;
  }

  /**
   * Metadata for the business that created the invite/request.
   * @return createdByBusiness
   */
  public BusinessAccessUserSummary getCreatedByBusiness() {
    return createdByBusiness;
  }

  public void setCreatedByBusiness(BusinessAccessUserSummary createdByBusiness) {
    this.createdByBusiness = createdByBusiness;
  }

  /**
   * Metadata for the user that created the invite/request.
   * @return createdByUser
   */
  public BusinessAccessUserSummary getCreatedByUser() {
    return createdByUser;
  }

  public void setCreatedByUser(BusinessAccessUserSummary createdByUser) {
    this.createdByUser = createdByUser;
  }

  /**
   * The time the invite/request was created. Returned in milliseconds.
   * @return createdTime
   */
  public Integer getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * Unique identifier of the invite/request.
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * 
   * @return inviteData
   */
  public InviteDataResponse getInviteData() {
    return inviteData;
  }

  public void setInviteData(InviteDataResponse inviteData) {
    this.inviteData = inviteData;
  }

  /**
   * Indicates whether the invite/request was received.
   * @return isReceivedInvite
   */
  public Boolean getIsReceivedInvite() {
    return isReceivedInvite;
  }

  public void setIsReceivedInvite(Boolean isReceivedInvite) {
    this.isReceivedInvite = isReceivedInvite;
  }

  /**
   * Metadata for the member/partner that was sent the invite/request.
   * @return user
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
