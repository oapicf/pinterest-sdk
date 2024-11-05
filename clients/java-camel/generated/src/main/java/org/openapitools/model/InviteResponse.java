package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BaseInviteDataResponseInviteData;
import org.openapitools.model.BusinessAccessUserSummary;
import org.openapitools.model.InviteAssetsSummary;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * InviteResponse
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class InviteResponse {

  private JsonNullable<InviteAssetsSummary> assetsSummary = JsonNullable.<InviteAssetsSummary>undefined();

  @Valid
  private List<String> businessRoles = new ArrayList<>();

  private JsonNullable<BusinessAccessUserSummary> createdByBusiness = JsonNullable.<BusinessAccessUserSummary>undefined();

  private JsonNullable<BusinessAccessUserSummary> createdByUser = JsonNullable.<BusinessAccessUserSummary>undefined();

  private Integer createdTime;

  private String id;

  private BaseInviteDataResponseInviteData inviteData;

  private Boolean isReceivedInvite;

  private BusinessAccessUserSummary user;

  public InviteResponse assetsSummary(InviteAssetsSummary assetsSummary) {
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
  public JsonNullable<InviteAssetsSummary> getAssetsSummary() {
    return assetsSummary;
  }

  public void setAssetsSummary(JsonNullable<InviteAssetsSummary> assetsSummary) {
    this.assetsSummary = assetsSummary;
  }

  public InviteResponse businessRoles(List<String> businessRoles) {
    this.businessRoles = businessRoles;
    return this;
  }

  public InviteResponse addBusinessRolesItem(String businessRolesItem) {
    if (this.businessRoles == null) {
      this.businessRoles = new ArrayList<>();
    }
    this.businessRoles.add(businessRolesItem);
    return this;
  }

  /**
   * The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
   * @return businessRoles
   */
  
  @Schema(name = "business_roles", example = "[\"BIZ_ADMIN\"]", description = "The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("business_roles")
  public List<String> getBusinessRoles() {
    return businessRoles;
  }

  public void setBusinessRoles(List<String> businessRoles) {
    this.businessRoles = businessRoles;
  }

  public InviteResponse createdByBusiness(BusinessAccessUserSummary createdByBusiness) {
    this.createdByBusiness = JsonNullable.of(createdByBusiness);
    return this;
  }

  /**
   * Metadata for the business that created the invite/request.
   * @return createdByBusiness
   */
  @Valid 
  @Schema(name = "created_by_business", description = "Metadata for the business that created the invite/request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_by_business")
  public JsonNullable<BusinessAccessUserSummary> getCreatedByBusiness() {
    return createdByBusiness;
  }

  public void setCreatedByBusiness(JsonNullable<BusinessAccessUserSummary> createdByBusiness) {
    this.createdByBusiness = createdByBusiness;
  }

  public InviteResponse createdByUser(BusinessAccessUserSummary createdByUser) {
    this.createdByUser = JsonNullable.of(createdByUser);
    return this;
  }

  /**
   * Metadata for the user that created the invite/request.
   * @return createdByUser
   */
  @Valid 
  @Schema(name = "created_by_user", description = "Metadata for the user that created the invite/request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_by_user")
  public JsonNullable<BusinessAccessUserSummary> getCreatedByUser() {
    return createdByUser;
  }

  public void setCreatedByUser(JsonNullable<BusinessAccessUserSummary> createdByUser) {
    this.createdByUser = createdByUser;
  }

  public InviteResponse createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * The time the invite/request was created. Returned in milliseconds.
   * @return createdTime
   */
  
  @Schema(name = "created_time", example = "1646767577816", description = "The time the invite/request was created. Returned in milliseconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  public InviteResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the invite/request.
   * @return id
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", example = "383791336903426391", description = "Unique identifier of the invite/request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InviteResponse inviteData(BaseInviteDataResponseInviteData inviteData) {
    this.inviteData = inviteData;
    return this;
  }

  /**
   * Get inviteData
   * @return inviteData
   */
  @Valid 
  @Schema(name = "invite_data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invite_data")
  public BaseInviteDataResponseInviteData getInviteData() {
    return inviteData;
  }

  public void setInviteData(BaseInviteDataResponseInviteData inviteData) {
    this.inviteData = inviteData;
  }

  public InviteResponse isReceivedInvite(Boolean isReceivedInvite) {
    this.isReceivedInvite = isReceivedInvite;
    return this;
  }

  /**
   * Indicates whether the invite/request was received.
   * @return isReceivedInvite
   */
  
  @Schema(name = "is_received_invite", description = "Indicates whether the invite/request was received.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_received_invite")
  public Boolean getIsReceivedInvite() {
    return isReceivedInvite;
  }

  public void setIsReceivedInvite(Boolean isReceivedInvite) {
    this.isReceivedInvite = isReceivedInvite;
  }

  public InviteResponse user(BusinessAccessUserSummary user) {
    this.user = user;
    return this;
  }

  /**
   * Metadata for the member/partner that was sent the invite/request.
   * @return user
   */
  @Valid 
  @Schema(name = "user", description = "Metadata for the member/partner that was sent the invite/request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    return equalsNullable(this.assetsSummary, inviteResponse.assetsSummary) &&
        Objects.equals(this.businessRoles, inviteResponse.businessRoles) &&
        equalsNullable(this.createdByBusiness, inviteResponse.createdByBusiness) &&
        equalsNullable(this.createdByUser, inviteResponse.createdByUser) &&
        Objects.equals(this.createdTime, inviteResponse.createdTime) &&
        Objects.equals(this.id, inviteResponse.id) &&
        Objects.equals(this.inviteData, inviteResponse.inviteData) &&
        Objects.equals(this.isReceivedInvite, inviteResponse.isReceivedInvite) &&
        Objects.equals(this.user, inviteResponse.user);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(assetsSummary), businessRoles, hashCodeNullable(createdByBusiness), hashCodeNullable(createdByUser), createdTime, id, inviteData, isReceivedInvite, user);
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

