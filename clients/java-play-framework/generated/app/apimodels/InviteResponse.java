package apimodels;

import apimodels.BaseInviteDataResponseInviteData;
import apimodels.BusinessAccessUserSummary;
import apimodels.InviteAssetsSummary;
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
 * InviteResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class InviteResponse   {
  @JsonProperty("id")
  @Pattern(regexp="^\\d+$")

  private String id;

  @JsonProperty("invite_data")
  @Valid

  private BaseInviteDataResponseInviteData inviteData;

  @JsonProperty("is_received_invite")
  
  private Boolean isReceivedInvite;

  @JsonProperty("user")
  @Valid

  private BusinessAccessUserSummary user;

  @JsonProperty("assets_summary")
  @Valid

  private InviteAssetsSummary assetsSummary;

  @JsonProperty("business_roles")
  
  private List<String> businessRoles = null;

  @JsonProperty("created_by_business")
  
  private Object createdByBusiness;

  @JsonProperty("created_by_user")
  
  private Object createdByUser;

  @JsonProperty("created_time")
  
  private Integer createdTime;

  public InviteResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the invite/request.
   * @return id
  **/
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
  **/
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
  **/
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
  **/
  public BusinessAccessUserSummary getUser() {
    return user;
  }

  public void setUser(BusinessAccessUserSummary user) {
    this.user = user;
  }

  public InviteResponse assetsSummary(InviteAssetsSummary assetsSummary) {
    this.assetsSummary = assetsSummary;
    return this;
  }

   /**
   * Get assetsSummary
   * @return assetsSummary
  **/
  public InviteAssetsSummary getAssetsSummary() {
    return assetsSummary;
  }

  public void setAssetsSummary(InviteAssetsSummary assetsSummary) {
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
  **/
  public List<String> getBusinessRoles() {
    return businessRoles;
  }

  public void setBusinessRoles(List<String> businessRoles) {
    this.businessRoles = businessRoles;
  }

  public InviteResponse createdByBusiness(Object createdByBusiness) {
    this.createdByBusiness = createdByBusiness;
    return this;
  }

   /**
   * Metadata for the business that created the invite/request.
   * @return createdByBusiness
  **/
  public Object getCreatedByBusiness() {
    return createdByBusiness;
  }

  public void setCreatedByBusiness(Object createdByBusiness) {
    this.createdByBusiness = createdByBusiness;
  }

  public InviteResponse createdByUser(Object createdByUser) {
    this.createdByUser = createdByUser;
    return this;
  }

   /**
   * Metadata for the user that created the invite/request.
   * @return createdByUser
  **/
  public Object getCreatedByUser() {
    return createdByUser;
  }

  public void setCreatedByUser(Object createdByUser) {
    this.createdByUser = createdByUser;
  }

  public InviteResponse createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * The time the invite/request was created. Returned in milliseconds.
   * @return createdTime
  **/
  public Integer getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
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
    return Objects.equals(id, inviteResponse.id) &&
        Objects.equals(inviteData, inviteResponse.inviteData) &&
        Objects.equals(isReceivedInvite, inviteResponse.isReceivedInvite) &&
        Objects.equals(user, inviteResponse.user) &&
        Objects.equals(assetsSummary, inviteResponse.assetsSummary) &&
        Objects.equals(businessRoles, inviteResponse.businessRoles) &&
        Objects.equals(createdByBusiness, inviteResponse.createdByBusiness) &&
        Objects.equals(createdByUser, inviteResponse.createdByUser) &&
        Objects.equals(createdTime, inviteResponse.createdTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, inviteData, isReceivedInvite, user, assetsSummary, businessRoles, createdByBusiness, createdByUser, createdTime);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

