package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * An exception object if there is an error performing the action. Will only be provided if there is an error.
 */
public class InviteExceptionResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Error code associated with the error in performing the action on the invite/request.
   */
  @JsonProperty("code")
  private Integer code;

  /**
   * Unique identifier of the invite/request.
   */
  @JsonProperty("invite_or_request_id")
  private String inviteOrRequestId;

  /**
   * Error message associated with the error in performing the action on the invite/request.
   */
  @JsonProperty("message")
  private String message;

  /**
   * A list of users&#39; usernames or emails OR a list of partner ids that caused the error.
   */
  @JsonProperty("users_or_partner_ids")
  private List<String> usersOrPartnerIds = new ArrayList<>();

  /**
   * Error code associated with the error in performing the action on the invite/request.
   * @return code
   */
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  /**
   * Unique identifier of the invite/request.
   * @return inviteOrRequestId
   */
  public String getInviteOrRequestId() {
    return inviteOrRequestId;
  }

  public void setInviteOrRequestId(String inviteOrRequestId) {
    this.inviteOrRequestId = inviteOrRequestId;
  }

  /**
   * Error message associated with the error in performing the action on the invite/request.
   * @return message
   */
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * A list of users&#39; usernames or emails OR a list of partner ids that caused the error.
   * @return usersOrPartnerIds
   */
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
    return Objects.equals(this.code, inviteExceptionResponse.code) &&
        Objects.equals(this.inviteOrRequestId, inviteExceptionResponse.inviteOrRequestId) &&
        Objects.equals(this.message, inviteExceptionResponse.message) &&
        Objects.equals(this.usersOrPartnerIds, inviteExceptionResponse.usersOrPartnerIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, inviteOrRequestId, message, usersOrPartnerIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InviteExceptionResponse {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    inviteOrRequestId: ").append(toIndentedString(inviteOrRequestId)).append("\n");
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
