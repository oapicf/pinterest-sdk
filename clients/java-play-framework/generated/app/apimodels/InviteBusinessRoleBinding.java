package apimodels;

import apimodels.BaseInviteDataResponseInviteData;
import apimodels.BusinessAccessUserSummary;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * An invite object if the invite/request was successfully updated. Will only be provided if the an invite/request is successfully updated.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class InviteBusinessRoleBinding   {
  @JsonProperty("created_by_business_id")
  
  private String createdByBusinessId;

  @JsonProperty("created_by_user_id")
  
  private String createdByUserId;

  @JsonProperty("user")
  @Valid

  private BusinessAccessUserSummary user;

  @JsonProperty("id")
  @Pattern(regexp="^\\d+$")

  private String id;

  @JsonProperty("invite_data")
  @Valid

  private BaseInviteDataResponseInviteData inviteData;

  @JsonProperty("is_received_invite")
  
  private Boolean isReceivedInvite;

  public InviteBusinessRoleBinding createdByBusinessId(String createdByBusinessId) {
    this.createdByBusinessId = createdByBusinessId;
    return this;
  }

   /**
   * Unique identifier for the business that created the invite/request.
   * @return createdByBusinessId
  **/
  public String getCreatedByBusinessId() {
    return createdByBusinessId;
  }

  public void setCreatedByBusinessId(String createdByBusinessId) {
    this.createdByBusinessId = createdByBusinessId;
  }

  public InviteBusinessRoleBinding createdByUserId(String createdByUserId) {
    this.createdByUserId = createdByUserId;
    return this;
  }

   /**
   * Unique identifier for the user that created the invite/request.
   * @return createdByUserId
  **/
  public String getCreatedByUserId() {
    return createdByUserId;
  }

  public void setCreatedByUserId(String createdByUserId) {
    this.createdByUserId = createdByUserId;
  }

  public InviteBusinessRoleBinding user(BusinessAccessUserSummary user) {
    this.user = user;
    return this;
  }

   /**
   * Metadata for the user that updated the invite/request.
   * @return user
  **/
  public BusinessAccessUserSummary getUser() {
    return user;
  }

  public void setUser(BusinessAccessUserSummary user) {
    this.user = user;
  }

  public InviteBusinessRoleBinding id(String id) {
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

  public InviteBusinessRoleBinding inviteData(BaseInviteDataResponseInviteData inviteData) {
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

  public InviteBusinessRoleBinding isReceivedInvite(Boolean isReceivedInvite) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InviteBusinessRoleBinding inviteBusinessRoleBinding = (InviteBusinessRoleBinding) o;
    return Objects.equals(createdByBusinessId, inviteBusinessRoleBinding.createdByBusinessId) &&
        Objects.equals(createdByUserId, inviteBusinessRoleBinding.createdByUserId) &&
        Objects.equals(user, inviteBusinessRoleBinding.user) &&
        Objects.equals(id, inviteBusinessRoleBinding.id) &&
        Objects.equals(inviteData, inviteBusinessRoleBinding.inviteData) &&
        Objects.equals(isReceivedInvite, inviteBusinessRoleBinding.isReceivedInvite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdByBusinessId, createdByUserId, user, id, inviteData, isReceivedInvite);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InviteBusinessRoleBinding {\n");
    
    sb.append("    createdByBusinessId: ").append(toIndentedString(createdByBusinessId)).append("\n");
    sb.append("    createdByUserId: ").append(toIndentedString(createdByUserId)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inviteData: ").append(toIndentedString(inviteData)).append("\n");
    sb.append("    isReceivedInvite: ").append(toIndentedString(isReceivedInvite)).append("\n");
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

