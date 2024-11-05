package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.BaseInviteDataResponse;
import org.openapitools.vertxweb.server.model.DeleteInvitesResultsResponseArrayItemsInnerException;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteInvitesResultsResponseArrayItemsInner   {
  
  private DeleteInvitesResultsResponseArrayItemsInnerException exception;
  private BaseInviteDataResponse invite;

  public DeleteInvitesResultsResponseArrayItemsInner () {

  }

  public DeleteInvitesResultsResponseArrayItemsInner (DeleteInvitesResultsResponseArrayItemsInnerException exception, BaseInviteDataResponse invite) {
    this.exception = exception;
    this.invite = invite;
  }

    
  @JsonProperty("exception")
  public DeleteInvitesResultsResponseArrayItemsInnerException getException() {
    return exception;
  }
  public void setException(DeleteInvitesResultsResponseArrayItemsInnerException exception) {
    this.exception = exception;
  }

    
  @JsonProperty("invite")
  public BaseInviteDataResponse getInvite() {
    return invite;
  }
  public void setInvite(BaseInviteDataResponse invite) {
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
    DeleteInvitesResultsResponseArrayItemsInner deleteInvitesResultsResponseArrayItemsInner = (DeleteInvitesResultsResponseArrayItemsInner) o;
    return Objects.equals(exception, deleteInvitesResultsResponseArrayItemsInner.exception) &&
        Objects.equals(invite, deleteInvitesResultsResponseArrayItemsInner.invite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exception, invite);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteInvitesResultsResponseArrayItemsInner {\n");
    
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
