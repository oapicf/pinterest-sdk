package apimodels;

import apimodels.InviteBusinessRoleBinding;
import apimodels.InviteExceptionResponse;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * An item representing the result of an invite/request action. Contains either an exception (on error) or an invite binding (on success).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class InviteActionResultItem   {
  @JsonProperty("exception")
  @Valid

  private InviteExceptionResponse exception;

  @JsonProperty("invite")
  @Valid

  private InviteBusinessRoleBinding invite;

  public InviteActionResultItem exception(InviteExceptionResponse exception) {
    this.exception = exception;
    return this;
  }

   /**
   * Get exception
   * @return exception
  **/
  public InviteExceptionResponse getException() {
    return exception;
  }

  public void setException(InviteExceptionResponse exception) {
    this.exception = exception;
  }

  public InviteActionResultItem invite(InviteBusinessRoleBinding invite) {
    this.invite = invite;
    return this;
  }

   /**
   * Get invite
   * @return invite
  **/
  public InviteBusinessRoleBinding getInvite() {
    return invite;
  }

  public void setInvite(InviteBusinessRoleBinding invite) {
    this.invite = invite;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InviteActionResultItem inviteActionResultItem = (InviteActionResultItem) o;
    return Objects.equals(exception, inviteActionResultItem.exception) &&
        Objects.equals(invite, inviteActionResultItem.invite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exception, invite);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InviteActionResultItem {\n");
    
    sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
    sb.append("    invite: ").append(toIndentedString(invite)).append("\n");
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

