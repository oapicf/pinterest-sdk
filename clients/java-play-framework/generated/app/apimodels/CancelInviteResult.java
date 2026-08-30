package apimodels;

import apimodels.CancelInviteResultUser;
import apimodels.InviteDataResponse;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CancelInviteResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CancelInviteResult   {
  @JsonProperty("id")
  @Pattern(regexp="^\\d+$")

  private String id;

  @JsonProperty("invite_data")
  @Valid

  private InviteDataResponse inviteData;

  @JsonProperty("is_received_invite")
  
  private Boolean isReceivedInvite;

  @JsonProperty("user")
  @Valid

  private CancelInviteResultUser user;

  public CancelInviteResult id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CancelInviteResult inviteData(InviteDataResponse inviteData) {
    this.inviteData = inviteData;
    return this;
  }

   /**
   * Get inviteData
   * @return inviteData
  **/
  public InviteDataResponse getInviteData() {
    return inviteData;
  }

  public void setInviteData(InviteDataResponse inviteData) {
    this.inviteData = inviteData;
  }

  public CancelInviteResult isReceivedInvite(Boolean isReceivedInvite) {
    this.isReceivedInvite = isReceivedInvite;
    return this;
  }

   /**
   * Get isReceivedInvite
   * @return isReceivedInvite
  **/
  public Boolean getIsReceivedInvite() {
    return isReceivedInvite;
  }

  public void setIsReceivedInvite(Boolean isReceivedInvite) {
    this.isReceivedInvite = isReceivedInvite;
  }

  public CancelInviteResult user(CancelInviteResultUser user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  public CancelInviteResultUser getUser() {
    return user;
  }

  public void setUser(CancelInviteResultUser user) {
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
    CancelInviteResult cancelInviteResult = (CancelInviteResult) o;
    return Objects.equals(id, cancelInviteResult.id) &&
        Objects.equals(inviteData, cancelInviteResult.inviteData) &&
        Objects.equals(isReceivedInvite, cancelInviteResult.isReceivedInvite) &&
        Objects.equals(user, cancelInviteResult.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, inviteData, isReceivedInvite, user);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelInviteResult {\n");
    
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

