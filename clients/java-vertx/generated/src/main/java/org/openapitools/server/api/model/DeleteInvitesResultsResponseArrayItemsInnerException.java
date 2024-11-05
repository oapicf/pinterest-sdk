package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An exception object if there is an error performing the cancellation. It will only be provided if there is an error.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteInvitesResultsResponseArrayItemsInnerException   {
  
  private String inviteId;
  private String message;

  public DeleteInvitesResultsResponseArrayItemsInnerException () {

  }

  public DeleteInvitesResultsResponseArrayItemsInnerException (String inviteId, String message) {
    this.inviteId = inviteId;
    this.message = message;
  }

    
  @JsonProperty("invite_id")
  public String getInviteId() {
    return inviteId;
  }
  public void setInviteId(String inviteId) {
    this.inviteId = inviteId;
  }

    
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteInvitesResultsResponseArrayItemsInnerException deleteInvitesResultsResponseArrayItemsInnerException = (DeleteInvitesResultsResponseArrayItemsInnerException) o;
    return Objects.equals(inviteId, deleteInvitesResultsResponseArrayItemsInnerException.inviteId) &&
        Objects.equals(message, deleteInvitesResultsResponseArrayItemsInnerException.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inviteId, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteInvitesResultsResponseArrayItemsInnerException {\n");
    
    sb.append("    inviteId: ").append(toIndentedString(inviteId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
