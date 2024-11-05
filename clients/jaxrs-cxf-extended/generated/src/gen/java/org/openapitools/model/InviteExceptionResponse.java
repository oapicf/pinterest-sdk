package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * An exception object if there is an error performing the action. Will only be provided if there is an error.
 */
@ApiModel(description="An exception object if there is an error performing the action. Will only be provided if there is an error.")

public class InviteExceptionResponse  {
  
 /**
  * Unique identifier of the invite/request.
  */
  @ApiModelProperty(example = "383791336903426391", value = "Unique identifier of the invite/request.")
  private String inviteOrRequestId;

 /**
  * Error code associated with the error in performing the action on the invite/request.
  */
  @ApiModelProperty(example = "403", value = "Error code associated with the error in performing the action on the invite/request.")
  private Integer code;

 /**
  * Error message associated with the error in performing the action on the invite/request.
  */
  @ApiModelProperty(example = "You hit the maximum number of pending invites allowed.", value = "Error message associated with the error in performing the action on the invite/request.")
  private String message;

 /**
  * A list of users' usernames or emails OR a list of partner ids that caused the error.
  */
  @ApiModelProperty(example = "[\"businessMember0101\",\"business+member@business.com\"]", value = "A list of users' usernames or emails OR a list of partner ids that caused the error.")
  private List<String> usersOrPartnerIds;
 /**
  * Unique identifier of the invite/request.
  * @return inviteOrRequestId
  */
  @JsonProperty("invite_or_request_id")
 @Pattern(regexp="^\\d+$")  public String getInviteOrRequestId() {
    return inviteOrRequestId;
  }

  /**
   * Sets the <code>inviteOrRequestId</code> property.
   */
 public void setInviteOrRequestId(String inviteOrRequestId) {
    this.inviteOrRequestId = inviteOrRequestId;
  }

  /**
   * Sets the <code>inviteOrRequestId</code> property.
   */
  public InviteExceptionResponse inviteOrRequestId(String inviteOrRequestId) {
    this.inviteOrRequestId = inviteOrRequestId;
    return this;
  }

 /**
  * Error code associated with the error in performing the action on the invite/request.
  * @return code
  */
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }

  /**
   * Sets the <code>code</code> property.
   */
 public void setCode(Integer code) {
    this.code = code;
  }

  /**
   * Sets the <code>code</code> property.
   */
  public InviteExceptionResponse code(Integer code) {
    this.code = code;
    return this;
  }

 /**
  * Error message associated with the error in performing the action on the invite/request.
  * @return message
  */
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  /**
   * Sets the <code>message</code> property.
   */
 public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Sets the <code>message</code> property.
   */
  public InviteExceptionResponse message(String message) {
    this.message = message;
    return this;
  }

 /**
  * A list of users&#39; usernames or emails OR a list of partner ids that caused the error.
  * @return usersOrPartnerIds
  */
  @JsonProperty("users_or_partner_ids")
  public List<String> getUsersOrPartnerIds() {
    return usersOrPartnerIds;
  }

  /**
   * Sets the <code>usersOrPartnerIds</code> property.
   */
 public void setUsersOrPartnerIds(List<String> usersOrPartnerIds) {
    this.usersOrPartnerIds = usersOrPartnerIds;
  }

  /**
   * Sets the <code>usersOrPartnerIds</code> property.
   */
  public InviteExceptionResponse usersOrPartnerIds(List<String> usersOrPartnerIds) {
    this.usersOrPartnerIds = usersOrPartnerIds;
    return this;
  }

  /**
   * Adds a new item to the <code>usersOrPartnerIds</code> list.
   */
  public InviteExceptionResponse addUsersOrPartnerIdsItem(String usersOrPartnerIdsItem) {
    this.usersOrPartnerIds.add(usersOrPartnerIdsItem);
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
    InviteExceptionResponse inviteExceptionResponse = (InviteExceptionResponse) o;
    return Objects.equals(this.inviteOrRequestId, inviteExceptionResponse.inviteOrRequestId) &&
        Objects.equals(this.code, inviteExceptionResponse.code) &&
        Objects.equals(this.message, inviteExceptionResponse.message) &&
        Objects.equals(this.usersOrPartnerIds, inviteExceptionResponse.usersOrPartnerIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inviteOrRequestId, code, message, usersOrPartnerIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InviteExceptionResponse {\n");
    
    sb.append("    inviteOrRequestId: ").append(toIndentedString(inviteOrRequestId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    usersOrPartnerIds: ").append(toIndentedString(usersOrPartnerIds)).append("\n");
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

