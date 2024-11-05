package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.BusinessAccessUserSummary;
import org.openapitools.server.api.model.BusinessMemberAssetsSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserBusinessRoleBinding   {
  
  private BusinessMemberAssetsSummary assetsSummary;
  private List<String> businessRoles = new ArrayList<>();
  private BusinessAccessUserSummary createdByBusiness;
  private BusinessAccessUserSummary createdByUser;
  private Integer createdTime;
  private String id;
  private Boolean isSharedPartner;
  private BusinessAccessUserSummary user;

  public UserBusinessRoleBinding () {

  }

  public UserBusinessRoleBinding (BusinessMemberAssetsSummary assetsSummary, List<String> businessRoles, BusinessAccessUserSummary createdByBusiness, BusinessAccessUserSummary createdByUser, Integer createdTime, String id, Boolean isSharedPartner, BusinessAccessUserSummary user) {
    this.assetsSummary = assetsSummary;
    this.businessRoles = businessRoles;
    this.createdByBusiness = createdByBusiness;
    this.createdByUser = createdByUser;
    this.createdTime = createdTime;
    this.id = id;
    this.isSharedPartner = isSharedPartner;
    this.user = user;
  }

    
  @JsonProperty("assets_summary")
  public BusinessMemberAssetsSummary getAssetsSummary() {
    return assetsSummary;
  }
  public void setAssetsSummary(BusinessMemberAssetsSummary assetsSummary) {
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

    
  @JsonProperty("is_shared_partner")
  public Boolean getIsSharedPartner() {
    return isSharedPartner;
  }
  public void setIsSharedPartner(Boolean isSharedPartner) {
    this.isSharedPartner = isSharedPartner;
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
    UserBusinessRoleBinding userBusinessRoleBinding = (UserBusinessRoleBinding) o;
    return Objects.equals(assetsSummary, userBusinessRoleBinding.assetsSummary) &&
        Objects.equals(businessRoles, userBusinessRoleBinding.businessRoles) &&
        Objects.equals(createdByBusiness, userBusinessRoleBinding.createdByBusiness) &&
        Objects.equals(createdByUser, userBusinessRoleBinding.createdByUser) &&
        Objects.equals(createdTime, userBusinessRoleBinding.createdTime) &&
        Objects.equals(id, userBusinessRoleBinding.id) &&
        Objects.equals(isSharedPartner, userBusinessRoleBinding.isSharedPartner) &&
        Objects.equals(user, userBusinessRoleBinding.user);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
