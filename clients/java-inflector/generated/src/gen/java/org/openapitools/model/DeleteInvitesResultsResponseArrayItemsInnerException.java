package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * An exception object if there is an error performing the cancellation. It will only be provided if there is an error.
 **/

@ApiModel(description = "An exception object if there is an error performing the cancellation. It will only be provided if there is an error.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-11-05T02:02:36.960464654Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DeleteInvitesResultsResponseArrayItemsInnerException   {
  @JsonProperty("invite_id")
  private String inviteId;

  @JsonProperty("message")
  private String message;

  /**
   * Unique identifier of an invite.
   **/
  public DeleteInvitesResultsResponseArrayItemsInnerException inviteId(String inviteId) {
    this.inviteId = inviteId;
    return this;
  }

  
  @ApiModelProperty(value = "Unique identifier of an invite.")
  @JsonProperty("invite_id")
  public String getInviteId() {
    return inviteId;
  }
  public void setInviteId(String inviteId) {
    this.inviteId = inviteId;
  }

  /**
   * Error message associated with the error in performing the action on the invite/request.
   **/
  public DeleteInvitesResultsResponseArrayItemsInnerException message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(example = "Business Invite request cannot be performed on current invitation status.", value = "Error message associated with the error in performing the action on the invite/request.")
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

