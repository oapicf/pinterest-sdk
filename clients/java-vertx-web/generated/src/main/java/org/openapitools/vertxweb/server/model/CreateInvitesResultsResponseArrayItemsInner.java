package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.CreateInvitesResultsResponseArrayItemsInnerInvite;
import org.openapitools.vertxweb.server.model.InviteExceptionResponse;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateInvitesResultsResponseArrayItemsInner   {
  
  private InviteExceptionResponse exception;
  private CreateInvitesResultsResponseArrayItemsInnerInvite invite;

  public CreateInvitesResultsResponseArrayItemsInner () {

  }

  public CreateInvitesResultsResponseArrayItemsInner (InviteExceptionResponse exception, CreateInvitesResultsResponseArrayItemsInnerInvite invite) {
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
  public CreateInvitesResultsResponseArrayItemsInnerInvite getInvite() {
    return invite;
  }
  public void setInvite(CreateInvitesResultsResponseArrayItemsInnerInvite invite) {
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
    CreateInvitesResultsResponseArrayItemsInner createInvitesResultsResponseArrayItemsInner = (CreateInvitesResultsResponseArrayItemsInner) o;
    return Objects.equals(exception, createInvitesResultsResponseArrayItemsInner.exception) &&
        Objects.equals(invite, createInvitesResultsResponseArrayItemsInner.invite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exception, invite);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInvitesResultsResponseArrayItemsInner {\n");
    
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
