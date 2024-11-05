package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.InviteBusinessRoleBinding;
import org.openapitools.server.api.model.InviteExceptionResponse;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateInvitesResultsResponseArrayItemsInner   {
  
  private InviteExceptionResponse exception;
  private InviteBusinessRoleBinding invite;

  public UpdateInvitesResultsResponseArrayItemsInner () {

  }

  public UpdateInvitesResultsResponseArrayItemsInner (InviteExceptionResponse exception, InviteBusinessRoleBinding invite) {
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
    UpdateInvitesResultsResponseArrayItemsInner updateInvitesResultsResponseArrayItemsInner = (UpdateInvitesResultsResponseArrayItemsInner) o;
    return Objects.equals(exception, updateInvitesResultsResponseArrayItemsInner.exception) &&
        Objects.equals(invite, updateInvitesResultsResponseArrayItemsInner.invite);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
