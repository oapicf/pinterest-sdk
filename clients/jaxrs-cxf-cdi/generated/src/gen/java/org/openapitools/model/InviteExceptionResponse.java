package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * An exception object if there is an error performing the action. Will only be provided if there is an error.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "An exception object if there is an error performing the action. Will only be provided if there is an error.")
public class InviteExceptionResponse   {
  
  private String inviteOrRequestId;

  private Integer code;

  private String message;

  private List<String> usersOrPartnerIds;

  /**
   * Unique identifier of the invite/request.
   **/
  public InviteExceptionResponse inviteOrRequestId(String inviteOrRequestId) {
    this.inviteOrRequestId = inviteOrRequestId;
    return this;
  }

  
  @ApiModelProperty(example = "383791336903426391", value = "Unique identifier of the invite/request.")
  @JsonProperty("invite_or_request_id")
 @Pattern(regexp="^\\d+$")  public String getInviteOrRequestId() {
    return inviteOrRequestId;
  }
  public void setInviteOrRequestId(String inviteOrRequestId) {
    this.inviteOrRequestId = inviteOrRequestId;
  }


  /**
   * Error code associated with the error in performing the action on the invite/request.
   **/
  public InviteExceptionResponse code(Integer code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(example = "403", value = "Error code associated with the error in performing the action on the invite/request.")
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
  }


  /**
   * Error message associated with the error in performing the action on the invite/request.
   **/
  public InviteExceptionResponse message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(example = "You hit the maximum number of pending invites allowed.", value = "Error message associated with the error in performing the action on the invite/request.")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }


  /**
   * A list of users&#39; usernames or emails OR a list of partner ids that caused the error.
   **/
  public InviteExceptionResponse usersOrPartnerIds(List<String> usersOrPartnerIds) {
    this.usersOrPartnerIds = usersOrPartnerIds;
    return this;
  }

  
  @ApiModelProperty(example = "[\"businessMember0101\",\"business+member@business.com\"]", value = "A list of users' usernames or emails OR a list of partner ids that caused the error.")
  @JsonProperty("users_or_partner_ids")
  public List<String> getUsersOrPartnerIds() {
    return usersOrPartnerIds;
  }
  public void setUsersOrPartnerIds(List<String> usersOrPartnerIds) {
    this.usersOrPartnerIds = usersOrPartnerIds;
  }

  public InviteExceptionResponse addUsersOrPartnerIdsItem(String usersOrPartnerIdsItem) {
    if (this.usersOrPartnerIds == null) {
      this.usersOrPartnerIds = new ArrayList<>();
    }
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

