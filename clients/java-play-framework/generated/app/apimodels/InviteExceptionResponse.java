package apimodels;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * An exception object if there is an error performing the action. Will only be provided if there is an error.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class InviteExceptionResponse   {
  @JsonProperty("invite_or_request_id")
  @Pattern(regexp="^\\d+$")

  private String inviteOrRequestId;

  @JsonProperty("code")
  
  private Integer code;

  @JsonProperty("message")
  
  private String message;

  @JsonProperty("users_or_partner_ids")
  
  private List<String> usersOrPartnerIds = null;

  public InviteExceptionResponse inviteOrRequestId(String inviteOrRequestId) {
    this.inviteOrRequestId = inviteOrRequestId;
    return this;
  }

   /**
   * Unique identifier of the invite/request.
   * @return inviteOrRequestId
  **/
  public String getInviteOrRequestId() {
    return inviteOrRequestId;
  }

  public void setInviteOrRequestId(String inviteOrRequestId) {
    this.inviteOrRequestId = inviteOrRequestId;
  }

  public InviteExceptionResponse code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Error code associated with the error in performing the action on the invite/request.
   * @return code
  **/
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public InviteExceptionResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Error message associated with the error in performing the action on the invite/request.
   * @return message
  **/
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public InviteExceptionResponse usersOrPartnerIds(List<String> usersOrPartnerIds) {
    this.usersOrPartnerIds = usersOrPartnerIds;
    return this;
  }

  public InviteExceptionResponse addUsersOrPartnerIdsItem(String usersOrPartnerIdsItem) {
    if (this.usersOrPartnerIds == null) {
      this.usersOrPartnerIds = new ArrayList<>();
    }
    this.usersOrPartnerIds.add(usersOrPartnerIdsItem);
    return this;
  }

   /**
   * A list of users' usernames or emails OR a list of partner ids that caused the error.
   * @return usersOrPartnerIds
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

