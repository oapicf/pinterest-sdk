package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * An exception object if there is an error performing the cancellation. It will only be provided if there is an error.
 */
@ApiModel(description = "An exception object if there is an error performing the cancellation. It will only be provided if there is an error.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DeleteInvitesResultsResponseArrayItemsInnerException   {
  @JsonProperty("invite_id")
  private String inviteId;

  @JsonProperty("message")
  private String message;

  public DeleteInvitesResultsResponseArrayItemsInnerException inviteId(String inviteId) {
    this.inviteId = inviteId;
    return this;
  }

  /**
   * Unique identifier of an invite.
   * @return inviteId
   */
  @ApiModelProperty(value = "Unique identifier of an invite.")
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
  @ApiModelProperty(example = "Business Invite request cannot be performed on current invitation status.", value = "Error message associated with the error in performing the action on the invite/request.")
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

