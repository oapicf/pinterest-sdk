package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * An exception object if there is an error performing the action. Will only be provided if there is an error.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InviteExceptionResponse   {
  
  private String inviteOrRequestId;
  private Integer code;
  private String message;
  private List<String> usersOrPartnerIds;

  public InviteExceptionResponse () {

  }

  public InviteExceptionResponse (String inviteOrRequestId, Integer code, String message, List<String> usersOrPartnerIds) {
    this.inviteOrRequestId = inviteOrRequestId;
    this.code = code;
    this.message = message;
    this.usersOrPartnerIds = usersOrPartnerIds;
  }

    
  @JsonProperty("invite_or_request_id")
  public String getInviteOrRequestId() {
    return inviteOrRequestId;
  }
  public void setInviteOrRequestId(String inviteOrRequestId) {
    this.inviteOrRequestId = inviteOrRequestId;
  }

    
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
  }

    
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

    
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
