package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CancelInviteException;
import org.openapitools.model.CancelInviteResult;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CancelInviteResultItem
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CancelInviteResultItem {

  private JsonNullable<CancelInviteException> exception = JsonNullable.<CancelInviteException>undefined();

  private JsonNullable<CancelInviteResult> invite = JsonNullable.<CancelInviteResult>undefined();

  public CancelInviteResultItem exception(CancelInviteException exception) {
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
  public JsonNullable<CancelInviteException> getException() {
    return exception;
  }

  public void setException(JsonNullable<CancelInviteException> exception) {
    this.exception = exception;
  }

  public CancelInviteResultItem invite(CancelInviteResult invite) {
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
  public JsonNullable<CancelInviteResult> getInvite() {
    return invite;
  }

  public void setInvite(JsonNullable<CancelInviteResult> invite) {
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
    CancelInviteResultItem cancelInviteResultItem = (CancelInviteResultItem) o;
    return equalsNullable(this.exception, cancelInviteResultItem.exception) &&
        equalsNullable(this.invite, cancelInviteResultItem.invite);
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
    sb.append("class CancelInviteResultItem {\n");
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

