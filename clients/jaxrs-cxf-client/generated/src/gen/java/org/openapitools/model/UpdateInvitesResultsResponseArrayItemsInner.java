package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.InviteBusinessRoleBinding;
import org.openapitools.model.InviteExceptionResponse;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdateInvitesResultsResponseArrayItemsInner  {
  
  @ApiModelProperty(value = "")
  private InviteExceptionResponse exception;

  @ApiModelProperty(value = "")
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

  public UpdateInvitesResultsResponseArrayItemsInner exception(InviteExceptionResponse exception) {
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

  public UpdateInvitesResultsResponseArrayItemsInner invite(InviteBusinessRoleBinding invite) {
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
    UpdateInvitesResultsResponseArrayItemsInner updateInvitesResultsResponseArrayItemsInner = (UpdateInvitesResultsResponseArrayItemsInner) o;
    return Objects.equals(this.exception, updateInvitesResultsResponseArrayItemsInner.exception) &&
        Objects.equals(this.invite, updateInvitesResultsResponseArrayItemsInner.invite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exception, invite);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateInvitesResultsResponseArrayItemsInner {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

