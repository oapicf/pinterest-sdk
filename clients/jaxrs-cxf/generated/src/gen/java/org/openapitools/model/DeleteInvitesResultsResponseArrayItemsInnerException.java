package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * An exception object if there is an error performing the cancellation. It will only be provided if there is an error.
 **/
@ApiModel(description="An exception object if there is an error performing the cancellation. It will only be provided if there is an error.")

public class DeleteInvitesResultsResponseArrayItemsInnerException  {
  
  @ApiModelProperty(value = "Unique identifier of an invite.")
 /**
   * Unique identifier of an invite.
  **/
  private String inviteId;

  @ApiModelProperty(example = "Business Invite request cannot be performed on current invitation status.", value = "Error message associated with the error in performing the action on the invite/request.")
 /**
   * Error message associated with the error in performing the action on the invite/request.
  **/
  private String message;
 /**
   * Unique identifier of an invite.
   * @return inviteId
  **/
  @JsonProperty("invite_id")
 @Pattern(regexp="^\\d+$")  public String getInviteId() {
    return inviteId;
  }

  public void setInviteId(String inviteId) {
    this.inviteId = inviteId;
  }

  public DeleteInvitesResultsResponseArrayItemsInnerException inviteId(String inviteId) {
    this.inviteId = inviteId;
    return this;
  }

 /**
   * Error message associated with the error in performing the action on the invite/request.
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public DeleteInvitesResultsResponseArrayItemsInnerException message(String message) {
    this.message = message;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

