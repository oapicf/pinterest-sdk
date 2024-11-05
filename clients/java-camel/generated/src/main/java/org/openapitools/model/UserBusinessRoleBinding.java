package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BusinessAccessUserSummary;
import org.openapitools.model.BusinessMemberAssetsSummary;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UserBusinessRoleBinding
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UserBusinessRoleBinding {

  private JsonNullable<BusinessMemberAssetsSummary> assetsSummary = JsonNullable.<BusinessMemberAssetsSummary>undefined();

  @Valid
  private List<String> businessRoles = new ArrayList<>();

  private JsonNullable<BusinessAccessUserSummary> createdByBusiness = JsonNullable.<BusinessAccessUserSummary>undefined();

  private JsonNullable<BusinessAccessUserSummary> createdByUser = JsonNullable.<BusinessAccessUserSummary>undefined();

  private JsonNullable<Integer> createdTime = JsonNullable.<Integer>undefined();

  private String id;

  private Boolean isSharedPartner;

  private JsonNullable<BusinessAccessUserSummary> user = JsonNullable.<BusinessAccessUserSummary>undefined();

  public UserBusinessRoleBinding assetsSummary(BusinessMemberAssetsSummary assetsSummary) {
    this.assetsSummary = JsonNullable.of(assetsSummary);
    return this;
  }

  /**
   * Get assetsSummary
   * @return assetsSummary
   */
  @Valid 
  @Schema(name = "assets_summary", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assets_summary")
  public JsonNullable<BusinessMemberAssetsSummary> getAssetsSummary() {
    return assetsSummary;
  }

  public void setAssetsSummary(JsonNullable<BusinessMemberAssetsSummary> assetsSummary) {
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
   */
  
  @Schema(name = "business_roles", example = "[\"BIZ_ADMIN\"]", description = "The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("business_roles")
  public List<String> getBusinessRoles() {
    return businessRoles;
  }

  public void setBusinessRoles(List<String> businessRoles) {
    this.businessRoles = businessRoles;
  }

  public UserBusinessRoleBinding createdByBusiness(BusinessAccessUserSummary createdByBusiness) {
    this.createdByBusiness = JsonNullable.of(createdByBusiness);
    return this;
  }

  /**
   * Metadata for the business that created the business relationship.
   * @return createdByBusiness
   */
  @Valid 
  @Schema(name = "created_by_business", description = "Metadata for the business that created the business relationship.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_by_business")
  public JsonNullable<BusinessAccessUserSummary> getCreatedByBusiness() {
    return createdByBusiness;
  }

  public void setCreatedByBusiness(JsonNullable<BusinessAccessUserSummary> createdByBusiness) {
    this.createdByBusiness = createdByBusiness;
  }

  public UserBusinessRoleBinding createdByUser(BusinessAccessUserSummary createdByUser) {
    this.createdByUser = JsonNullable.of(createdByUser);
    return this;
  }

  /**
   * Metadata for the user that created the business relationship.
   * @return createdByUser
   */
  @Valid 
  @Schema(name = "created_by_user", description = "Metadata for the user that created the business relationship.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_by_user")
  public JsonNullable<BusinessAccessUserSummary> getCreatedByUser() {
    return createdByUser;
  }

  public void setCreatedByUser(JsonNullable<BusinessAccessUserSummary> createdByUser) {
    this.createdByUser = createdByUser;
  }

  public UserBusinessRoleBinding createdTime(Integer createdTime) {
    this.createdTime = JsonNullable.of(createdTime);
    return this;
  }

  /**
   * The time the business relationship was created. Returned in milliseconds.
   * @return createdTime
   */
  
  @Schema(name = "created_time", example = "1646767577816", description = "The time the business relationship was created. Returned in milliseconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_time")
  public JsonNullable<Integer> getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(JsonNullable<Integer> createdTime) {
    this.createdTime = createdTime;
  }

  public UserBusinessRoleBinding id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the business member/business partner/employer.
   * @return id
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", example = "383791336903426391", description = "Unique identifier of the business member/business partner/employer.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
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
   */
  
  @Schema(name = "is_shared_partner", example = "false", description = "This field is only relevant when business_role=\"PARTNER\". <br>If is_shared_partner=FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. <br>If is_shared_partner=TRUE, you can access the partner's business asset. If assets_summary is not empty, the assets listed are the partner's business assets you have access to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_shared_partner")
  public Boolean getIsSharedPartner() {
    return isSharedPartner;
  }

  public void setIsSharedPartner(Boolean isSharedPartner) {
    this.isSharedPartner = isSharedPartner;
  }

  public UserBusinessRoleBinding user(BusinessAccessUserSummary user) {
    this.user = JsonNullable.of(user);
    return this;
  }

  /**
   * Metadata for the business member/business partner/employer.
   * @return user
   */
  @Valid 
  @Schema(name = "user", description = "Metadata for the business member/business partner/employer.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user")
  public JsonNullable<BusinessAccessUserSummary> getUser() {
    return user;
  }

  public void setUser(JsonNullable<BusinessAccessUserSummary> user) {
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
    return equalsNullable(this.assetsSummary, userBusinessRoleBinding.assetsSummary) &&
        Objects.equals(this.businessRoles, userBusinessRoleBinding.businessRoles) &&
        equalsNullable(this.createdByBusiness, userBusinessRoleBinding.createdByBusiness) &&
        equalsNullable(this.createdByUser, userBusinessRoleBinding.createdByUser) &&
        equalsNullable(this.createdTime, userBusinessRoleBinding.createdTime) &&
        Objects.equals(this.id, userBusinessRoleBinding.id) &&
        Objects.equals(this.isSharedPartner, userBusinessRoleBinding.isSharedPartner) &&
        equalsNullable(this.user, userBusinessRoleBinding.user);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(assetsSummary), businessRoles, hashCodeNullable(createdByBusiness), hashCodeNullable(createdByUser), hashCodeNullable(createdTime), id, isSharedPartner, hashCodeNullable(user));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

