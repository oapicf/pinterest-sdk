package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.InviteBusinessRoleBinding;
import org.openapitools.model.InviteExceptionResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An item representing the result of an invite/request action. Contains either an exception (on error) or an invite binding (on success).
 */
@ApiModel(description="An item representing the result of an invite/request action. Contains either an exception (on error) or an invite binding (on success).")

public class InviteActionResultItem  {
  
  @ApiModelProperty(value = "")

  @Valid

  private InviteExceptionResponse exception;

  @ApiModelProperty(value = "")

  @Valid

  private InviteBusinessRoleBinding invite;
 /**
   * Get exception
   * @return exception
  **/
  @JsonProperty("exception")
  public InviteExceptionResponse getException() {
    return exception;
  }

  public void setException(InviteExceptionResponse exception) {
    this.exception = exception;
  }

  public InviteActionResultItem exception(InviteExceptionResponse exception) {
    this.exception = exception;
    return this;
  }

 /**
   * Get invite
   * @return invite
  **/
  @JsonProperty("invite")
  public InviteBusinessRoleBinding getInvite() {
    return invite;
  }

  public void setInvite(InviteBusinessRoleBinding invite) {
    this.invite = invite;
  }

  public InviteActionResultItem invite(InviteBusinessRoleBinding invite) {
    this.invite = invite;
    return this;
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
    return Objects.equals(this.exception, inviteActionResultItem.exception) &&
        Objects.equals(this.invite, inviteActionResultItem.invite);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

