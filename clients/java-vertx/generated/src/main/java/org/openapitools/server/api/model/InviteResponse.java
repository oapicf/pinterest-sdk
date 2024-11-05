package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.BaseInviteDataResponseInviteData;
import org.openapitools.server.api.model.BusinessAccessUserSummary;
import org.openapitools.server.api.model.InviteAssetsSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
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

  public InviteResponse () {

  }

  public InviteResponse (InviteAssetsSummary assetsSummary, List<String> businessRoles, BusinessAccessUserSummary createdByBusiness, BusinessAccessUserSummary createdByUser, Integer createdTime, String id, BaseInviteDataResponseInviteData inviteData, Boolean isReceivedInvite, BusinessAccessUserSummary user) {
    this.assetsSummary = assetsSummary;
    this.businessRoles = businessRoles;
    this.createdByBusiness = createdByBusiness;
    this.createdByUser = createdByUser;
    this.createdTime = createdTime;
    this.id = id;
    this.inviteData = inviteData;
    this.isReceivedInvite = isReceivedInvite;
    this.user = user;
  }

    
  @JsonProperty("assets_summary")
  public InviteAssetsSummary getAssetsSummary() {
    return assetsSummary;
  }
  public void setAssetsSummary(InviteAssetsSummary assetsSummary) {
    this.assetsSummary = assetsSummary;
  }

    
  @JsonProperty("business_roles")
  public List<String> getBusinessRoles() {
    return businessRoles;
  }
  public void setBusinessRoles(List<String> businessRoles) {
    this.businessRoles = businessRoles;
  }

    
  @JsonProperty("created_by_business")
  public BusinessAccessUserSummary getCreatedByBusiness() {
    return createdByBusiness;
  }
  public void setCreatedByBusiness(BusinessAccessUserSummary createdByBusiness) {
    this.createdByBusiness = createdByBusiness;
  }

    
  @JsonProperty("created_by_user")
  public BusinessAccessUserSummary getCreatedByUser() {
    return createdByUser;
  }
  public void setCreatedByUser(BusinessAccessUserSummary createdByUser) {
    this.createdByUser = createdByUser;
  }

    
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("invite_data")
  public BaseInviteDataResponseInviteData getInviteData() {
    return inviteData;
  }
  public void setInviteData(BaseInviteDataResponseInviteData inviteData) {
    this.inviteData = inviteData;
  }

    
  @JsonProperty("is_received_invite")
  public Boolean getIsReceivedInvite() {
    return isReceivedInvite;
  }
  public void setIsReceivedInvite(Boolean isReceivedInvite) {
    this.isReceivedInvite = isReceivedInvite;
  }

    
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
    return Objects.equals(assetsSummary, inviteResponse.assetsSummary) &&
        Objects.equals(businessRoles, inviteResponse.businessRoles) &&
        Objects.equals(createdByBusiness, inviteResponse.createdByBusiness) &&
        Objects.equals(createdByUser, inviteResponse.createdByUser) &&
        Objects.equals(createdTime, inviteResponse.createdTime) &&
        Objects.equals(id, inviteResponse.id) &&
        Objects.equals(inviteData, inviteResponse.inviteData) &&
        Objects.equals(isReceivedInvite, inviteResponse.isReceivedInvite) &&
        Objects.equals(user, inviteResponse.user);
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
