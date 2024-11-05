package apimodels;

import apimodels.BusinessAccessUserSummary;
import apimodels.BusinessMemberAssetsSummary;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * UserBusinessRoleBinding
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class UserBusinessRoleBinding   {
  @JsonProperty("assets_summary")
  @Valid

  private BusinessMemberAssetsSummary assetsSummary;

  @JsonProperty("business_roles")
  
  private List<String> businessRoles = null;

  @JsonProperty("created_by_business")
  @Valid

  private BusinessAccessUserSummary createdByBusiness;

  @JsonProperty("created_by_user")
  @Valid

  private BusinessAccessUserSummary createdByUser;

  @JsonProperty("created_time")
  
  private Integer createdTime;

  @JsonProperty("id")
  @Pattern(regexp="^\\d+$")

  private String id;

  @JsonProperty("is_shared_partner")
  
  private Boolean isSharedPartner;

  @JsonProperty("user")
  @Valid

  private BusinessAccessUserSummary user;

  public UserBusinessRoleBinding assetsSummary(BusinessMemberAssetsSummary assetsSummary) {
    this.assetsSummary = assetsSummary;
    return this;
  }

   /**
   * Get assetsSummary
   * @return assetsSummary
  **/
  public BusinessMemberAssetsSummary getAssetsSummary() {
    return assetsSummary;
  }

  public void setAssetsSummary(BusinessMemberAssetsSummary assetsSummary) {
    this.assetsSummary = assetsSummary;
  }

  public UserBusinessRoleBinding businessRoles(List<String> businessRoles) {
    this.businessRoles = businessRoles;
    return this;
  }

  public UserBusinessRoleBinding addBusinessRolesItem(String businessRolesItem) {
    if (this.businessRoles == null) {
      this.businessRoles = new ArrayList<>();
    }
    this.businessRoles.add(businessRolesItem);
    return this;
  }

   /**
   * The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
   * @return businessRoles
  **/
  public List<String> getBusinessRoles() {
    return businessRoles;
  }

  public void setBusinessRoles(List<String> businessRoles) {
    this.businessRoles = businessRoles;
  }

  public UserBusinessRoleBinding createdByBusiness(BusinessAccessUserSummary createdByBusiness) {
    this.createdByBusiness = createdByBusiness;
    return this;
  }

   /**
   * Metadata for the business that created the business relationship.
   * @return createdByBusiness
  **/
  public BusinessAccessUserSummary getCreatedByBusiness() {
    return createdByBusiness;
  }

  public void setCreatedByBusiness(BusinessAccessUserSummary createdByBusiness) {
    this.createdByBusiness = createdByBusiness;
  }

  public UserBusinessRoleBinding createdByUser(BusinessAccessUserSummary createdByUser) {
    this.createdByUser = createdByUser;
    return this;
  }

   /**
   * Metadata for the user that created the business relationship.
   * @return createdByUser
  **/
  public BusinessAccessUserSummary getCreatedByUser() {
    return createdByUser;
  }

  public void setCreatedByUser(BusinessAccessUserSummary createdByUser) {
    this.createdByUser = createdByUser;
  }

  public UserBusinessRoleBinding createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * The time the business relationship was created. Returned in milliseconds.
   * @return createdTime
  **/
  public Integer getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  public UserBusinessRoleBinding id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the business member/business partner/employer.
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UserBusinessRoleBinding isSharedPartner(Boolean isSharedPartner) {
    this.isSharedPartner = isSharedPartner;
    return this;
  }

   /**
   * This field is only relevant when business_role=\"PARTNER\". <br>If is_shared_partner=FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. <br>If is_shared_partner=TRUE, you can access the partner's business asset. If assets_summary is not empty, the assets listed are the partner's business assets you have access to.
   * @return isSharedPartner
  **/
  public Boolean getIsSharedPartner() {
    return isSharedPartner;
  }

  public void setIsSharedPartner(Boolean isSharedPartner) {
    this.isSharedPartner = isSharedPartner;
  }

  public UserBusinessRoleBinding user(BusinessAccessUserSummary user) {
    this.user = user;
    return this;
  }

   /**
   * Metadata for the business member/business partner/employer.
   * @return user
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

