package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * An exception object if there is an error performing the action. Will only be provided if there is an error.
 */

@Schema(name = "InviteExceptionResponse", description = "An exception object if there is an error performing the action. Will only be provided if there is an error.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class InviteExceptionResponse {

  private JsonNullable<@Pattern(regexp = "^\\d+$") String> inviteOrRequestId = JsonNullable.<String>undefined();

  private Integer code;

  private String message;

  @Valid
  private JsonNullable<List<String>> usersOrPartnerIds = JsonNullable.<List<String>>undefined();

  public InviteExceptionResponse inviteOrRequestId(String inviteOrRequestId) {
    this.inviteOrRequestId = JsonNullable.of(inviteOrRequestId);
    return this;
  }

  /**
   * Unique identifier of the invite/request.
   * @return inviteOrRequestId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "invite_or_request_id", example = "383791336903426391", description = "Unique identifier of the invite/request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invite_or_request_id")
  public JsonNullable<@Pattern(regexp = "^\\d+$") String> getInviteOrRequestId() {
    return inviteOrRequestId;
  }

  public void setInviteOrRequestId(JsonNullable<String> inviteOrRequestId) {
    this.inviteOrRequestId = inviteOrRequestId;
  }

  public InviteExceptionResponse code(Integer code) {
    this.code = code;
    return this;
  }

  /**
   * Error code associated with the error in performing the action on the invite/request.
   * @return code
   */
  
  @Schema(name = "code", example = "403", description = "Error code associated with the error in performing the action on the invite/request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
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
   */
  
  @Schema(name = "message", example = "You hit the maximum number of pending invites allowed.", description = "Error message associated with the error in performing the action on the invite/request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public InviteExceptionResponse usersOrPartnerIds(List<String> usersOrPartnerIds) {
    this.usersOrPartnerIds = JsonNullable.of(usersOrPartnerIds);
    return this;
  }

  public InviteExceptionResponse addUsersOrPartnerIdsItem(String usersOrPartnerIdsItem) {
    if (this.usersOrPartnerIds == null || !this.usersOrPartnerIds.isPresent()) {
      this.usersOrPartnerIds = JsonNullable.of(new ArrayList<>());
    }
    this.usersOrPartnerIds.get().add(usersOrPartnerIdsItem);
    return this;
  }

  /**
   * A list of users' usernames or emails OR a list of partner ids that caused the error.
   * @return usersOrPartnerIds
   */
  
  @Schema(name = "users_or_partner_ids", example = "[\"businessMember0101\",\"business+member@business.com\"]", description = "A list of users' usernames or emails OR a list of partner ids that caused the error.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("users_or_partner_ids")
  public JsonNullable<List<String>> getUsersOrPartnerIds() {
    return usersOrPartnerIds;
  }

  public void setUsersOrPartnerIds(JsonNullable<List<String>> usersOrPartnerIds) {
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
    return equalsNullable(this.inviteOrRequestId, inviteExceptionResponse.inviteOrRequestId) &&
        Objects.equals(this.code, inviteExceptionResponse.code) &&
        Objects.equals(this.message, inviteExceptionResponse.message) &&
        equalsNullable(this.usersOrPartnerIds, inviteExceptionResponse.usersOrPartnerIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(inviteOrRequestId), code, message, hashCodeNullable(usersOrPartnerIds));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

