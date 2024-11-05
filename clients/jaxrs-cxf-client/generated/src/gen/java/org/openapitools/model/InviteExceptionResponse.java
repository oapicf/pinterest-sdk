package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * An exception object if there is an error performing the action. Will only be provided if there is an error.
 **/
@ApiModel(description="An exception object if there is an error performing the action. Will only be provided if there is an error.")

public class InviteExceptionResponse  {
  
  @ApiModelProperty(example = "383791336903426391", value = "Unique identifier of the invite/request.")
 /**
   * Unique identifier of the invite/request.
  **/
  private String inviteOrRequestId;

  @ApiModelProperty(example = "403", value = "Error code associated with the error in performing the action on the invite/request.")
 /**
   * Error code associated with the error in performing the action on the invite/request.
  **/
  private Integer code;

  @ApiModelProperty(example = "You hit the maximum number of pending invites allowed.", value = "Error message associated with the error in performing the action on the invite/request.")
 /**
   * Error message associated with the error in performing the action on the invite/request.
  **/
  private String message;

  @ApiModelProperty(example = "[\"businessMember0101\",\"business+member@business.com\"]", value = "A list of users' usernames or emails OR a list of partner ids that caused the error.")
 /**
   * A list of users' usernames or emails OR a list of partner ids that caused the error.
  **/
  private List<String> usersOrPartnerIds;
 /**
   * Unique identifier of the invite/request.
   * @return inviteOrRequestId
  **/
  @JsonProperty("invite_or_request_id")
  public String getInviteOrRequestId() {
    return inviteOrRequestId;
  }

  public void setInviteOrRequestId(String inviteOrRequestId) {
    this.inviteOrRequestId = inviteOrRequestId;
  }

  public InviteExceptionResponse inviteOrRequestId(String inviteOrRequestId) {
    this.inviteOrRequestId = inviteOrRequestId;
    return this;
  }

 /**
   * Error code associated with the error in performing the action on the invite/request.
   * @return code
  **/
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public InviteExceptionResponse code(Integer code) {
    this.code = code;
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

  public InviteExceptionResponse message(String message) {
    this.message = message;
    return this;
  }

 /**
   * A list of users&#39; usernames or emails OR a list of partner ids that caused the error.
   * @return usersOrPartnerIds
  **/
  @JsonProperty("users_or_partner_ids")
  public List<String> getUsersOrPartnerIds() {
    return usersOrPartnerIds;
  }

  public void setUsersOrPartnerIds(List<String> usersOrPartnerIds) {
    this.usersOrPartnerIds = usersOrPartnerIds;
  }

  public InviteExceptionResponse usersOrPartnerIds(List<String> usersOrPartnerIds) {
    this.usersOrPartnerIds = usersOrPartnerIds;
    return this;
  }

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

