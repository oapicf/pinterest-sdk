package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An exception object if there is an error performing the cancellation. It will only be provided if there is an error.
 */
@ApiModel(description="An exception object if there is an error performing the cancellation. It will only be provided if there is an error.")

public class CancelInviteException  {
  
  @ApiModelProperty(value = "")

  private String inviteId;

  @ApiModelProperty(value = "")

  private String message;
 /**
   * Get inviteId
   * @return inviteId
  **/
  @JsonProperty("invite_id")
 @Pattern(regexp="^\\d+$")  public String getInviteId() {
    return inviteId;
  }

  public void setInviteId(String inviteId) {
    this.inviteId = inviteId;
  }

  public CancelInviteException inviteId(String inviteId) {
    this.inviteId = inviteId;
    return this;
  }

 /**
   * Get message
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public CancelInviteException message(String message) {
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
    CancelInviteException cancelInviteException = (CancelInviteException) o;
    return Objects.equals(this.inviteId, cancelInviteException.inviteId) &&
        Objects.equals(this.message, cancelInviteException.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inviteId, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelInviteException {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

