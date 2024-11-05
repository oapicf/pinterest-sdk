package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;



/**
 * An exception object if there is an error performing the action. Will only be provided if there is an error.
 **/

@ApiModel(description = "An exception object if there is an error performing the action. Will only be provided if there is an error.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-11-05T02:02:36.960464654Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class InviteExceptionResponse   {
  @JsonProperty("invite_or_request_id")
  private String inviteOrRequestId;

  @JsonProperty("code")
  private Integer code;

  @JsonProperty("message")
  private String message;

  @JsonProperty("users_or_partner_ids")
  private List<String> usersOrPartnerIds = null;

  /**
   * Unique identifier of the invite/request.
   **/
  public InviteExceptionResponse inviteOrRequestId(String inviteOrRequestId) {
    this.inviteOrRequestId = inviteOrRequestId;
    return this;
  }

  
  @ApiModelProperty(example = "383791336903426391", value = "Unique identifier of the invite/request.")
  @JsonProperty("invite_or_request_id")
  public String getInviteOrRequestId() {
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
   * A list of users' usernames or emails OR a list of partner ids that caused the error.
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InviteExceptionResponse inviteExceptionResponse = (InviteExceptionResponse) o;
    return Objects.equals(inviteOrRequestId, inviteExceptionResponse.inviteOrRequestId) &&
        Objects.equals(code, inviteExceptionResponse.code) &&
        Objects.equals(message, inviteExceptionResponse.message) &&
        Objects.equals(usersOrPartnerIds, inviteExceptionResponse.usersOrPartnerIds);
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

