package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.InviteBusinessRoleBinding;
import org.openapitools.vertxweb.server.model.InviteExceptionResponse;

/**
 * An item representing the result of an invite/request action. Contains either an exception (on error) or an invite binding (on success).
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InviteActionResultItem   {
  
  private InviteExceptionResponse exception;
  private InviteBusinessRoleBinding invite;

  public InviteActionResultItem () {

  }

  public InviteActionResultItem (InviteExceptionResponse exception, InviteBusinessRoleBinding invite) {
    this.exception = exception;
    this.invite = invite;
  }

    
  @JsonProperty("exception")
  public InviteExceptionResponse getException() {
    return exception;
  }
  public void setException(InviteExceptionResponse exception) {
    this.exception = exception;
  }

    
  @JsonProperty("invite")
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
