package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * An exception object if there is an error performing the cancellation. It will only be provided if there is an error.
 */

@Schema(name = "DeleteInvitesResultsResponseArray_items_inner_exception", description = "An exception object if there is an error performing the cancellation. It will only be provided if there is an error.")
@JsonTypeName("DeleteInvitesResultsResponseArray_items_inner_exception")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DeleteInvitesResultsResponseArrayItemsInnerException {

  private String inviteId;

  private String message;

  public DeleteInvitesResultsResponseArrayItemsInnerException inviteId(String inviteId) {
    this.inviteId = inviteId;
    return this;
  }

  /**
   * Unique identifier of an invite.
   * @return inviteId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "invite_id", description = "Unique identifier of an invite.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invite_id")
  public String getInviteId() {
    return inviteId;
  }

  public void setInviteId(String inviteId) {
    this.inviteId = inviteId;
  }

  public DeleteInvitesResultsResponseArrayItemsInnerException message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Error message associated with the error in performing the action on the invite/request.
   * @return message
   */
  
  @Schema(name = "message", example = "Business Invite request cannot be performed on current invitation status.", description = "Error message associated with the error in performing the action on the invite/request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    return Objects.equals(this.inviteId, deleteInvitesResultsResponseArrayItemsInnerException.inviteId) &&
        Objects.equals(this.message, deleteInvitesResultsResponseArrayItemsInnerException.message);
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

