package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BaseInviteDataResponse;
import org.openapitools.model.InviteExceptionResponse;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RespondToInvitesResponseArrayItemsInner
 */

@JsonTypeName("RespondToInvitesResponseArray_items_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class RespondToInvitesResponseArrayItemsInner {

  private JsonNullable<InviteExceptionResponse> exception = JsonNullable.<InviteExceptionResponse>undefined();

  private JsonNullable<BaseInviteDataResponse> invite = JsonNullable.<BaseInviteDataResponse>undefined();

  public RespondToInvitesResponseArrayItemsInner exception(InviteExceptionResponse exception) {
    this.exception = JsonNullable.of(exception);
    return this;
  }

  /**
   * Get exception
   * @return exception
   */
  @Valid 
  @Schema(name = "exception", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exception")
  public JsonNullable<InviteExceptionResponse> getException() {
    return exception;
  }

  public void setException(JsonNullable<InviteExceptionResponse> exception) {
    this.exception = exception;
  }

  public RespondToInvitesResponseArrayItemsInner invite(BaseInviteDataResponse invite) {
    this.invite = JsonNullable.of(invite);
    return this;
  }

  /**
   * Get invite
   * @return invite
   */
  @Valid 
  @Schema(name = "invite", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invite")
  public JsonNullable<BaseInviteDataResponse> getInvite() {
    return invite;
  }

  public void setInvite(JsonNullable<BaseInviteDataResponse> invite) {
    this.invite = invite;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RespondToInvitesResponseArrayItemsInner respondToInvitesResponseArrayItemsInner = (RespondToInvitesResponseArrayItemsInner) o;
    return equalsNullable(this.exception, respondToInvitesResponseArrayItemsInner.exception) &&
        equalsNullable(this.invite, respondToInvitesResponseArrayItemsInner.invite);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(exception), hashCodeNullable(invite));
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
    sb.append("class RespondToInvitesResponseArrayItemsInner {\n");
    sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
    sb.append("    invite: ").append(toIndentedString(invite)).append("\n");
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

