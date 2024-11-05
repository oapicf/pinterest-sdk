package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreateAssetAccessRequestErrorMessageInner;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreateAssetAccessRequestResponse
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreateAssetAccessRequestResponse {

  @Valid
  private JsonNullable<List<@Valid CreateAssetAccessRequestErrorMessageInner>> exceptions = JsonNullable.<List<@Valid CreateAssetAccessRequestErrorMessageInner>>undefined();

  @Valid
  private JsonNullable<Map<String, String>> invites = JsonNullable.<Map<String, String>>undefined();

  public CreateAssetAccessRequestResponse exceptions(List<@Valid CreateAssetAccessRequestErrorMessageInner> exceptions) {
    this.exceptions = JsonNullable.of(exceptions);
    return this;
  }

  public CreateAssetAccessRequestResponse addExceptionsItem(CreateAssetAccessRequestErrorMessageInner exceptionsItem) {
    if (this.exceptions == null || !this.exceptions.isPresent()) {
      this.exceptions = JsonNullable.of(new ArrayList<>());
    }
    this.exceptions.get().add(exceptionsItem);
    return this;
  }

  /**
   * A list of errors associated with the asset access requests. Will be returned if there is an error.
   * @return exceptions
   */
  @Valid 
  @Schema(name = "exceptions", description = "A list of errors associated with the asset access requests. Will be returned if there is an error.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exceptions")
  public JsonNullable<List<@Valid CreateAssetAccessRequestErrorMessageInner>> getExceptions() {
    return exceptions;
  }

  public void setExceptions(JsonNullable<List<@Valid CreateAssetAccessRequestErrorMessageInner>> exceptions) {
    this.exceptions = exceptions;
  }

  public CreateAssetAccessRequestResponse invites(Map<String, String> invites) {
    this.invites = JsonNullable.of(invites);
    return this;
  }

  public CreateAssetAccessRequestResponse putInvitesItem(String key, String invitesItem) {
    if (this.invites == null || !this.invites.isPresent()) {
      this.invites = JsonNullable.of(new HashMap<>());
    }
    this.invites.get().put(key, invitesItem);
    return this;
  }

  /**
   * Get invites
   * @return invites
   */
  
  @Schema(name = "invites", example = "{\"766456567741825556\":\"5349280584552211583\",\"733242520489967216\":\"5349280584552211845\"}", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invites")
  public JsonNullable<Map<String, String>> getInvites() {
    return invites;
  }

  public void setInvites(JsonNullable<Map<String, String>> invites) {
    this.invites = invites;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAssetAccessRequestResponse createAssetAccessRequestResponse = (CreateAssetAccessRequestResponse) o;
    return equalsNullable(this.exceptions, createAssetAccessRequestResponse.exceptions) &&
        equalsNullable(this.invites, createAssetAccessRequestResponse.invites);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(exceptions), hashCodeNullable(invites));
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
    sb.append("class CreateAssetAccessRequestResponse {\n");
    sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
    sb.append("    invites: ").append(toIndentedString(invites)).append("\n");
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

