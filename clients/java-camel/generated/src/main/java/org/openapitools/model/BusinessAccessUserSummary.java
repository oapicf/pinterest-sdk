package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
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
 * Metadata of the member/partner that has access to the asset.
 */

@Schema(name = "BusinessAccessUserSummary", description = "Metadata of the member/partner that has access to the asset.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class BusinessAccessUserSummary {

  private JsonNullable<String> email = JsonNullable.<String>undefined();

  private JsonNullable<@Size(min = 1, max = 20) String> id = JsonNullable.<String>undefined();

  private JsonNullable<String> username = JsonNullable.<String>undefined();

  public BusinessAccessUserSummary email(String email) {
    this.email = JsonNullable.of(email);
    return this;
  }

  /**
   * Email of the business member/partner.
   * @return email
   */
  
  @Schema(name = "email", example = "business0101@business.com", description = "Email of the business member/partner.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public JsonNullable<String> getEmail() {
    return email;
  }

  public void setEmail(JsonNullable<String> email) {
    this.email = email;
  }

  public BusinessAccessUserSummary id(String id) {
    this.id = JsonNullable.of(id);
    return this;
  }

  /**
   * Unique identifier of the business member/partner.
   * @return id
   */
  @Size(min = 1, max = 20) 
  @Schema(name = "id", example = "383791336903426391", description = "Unique identifier of the business member/partner.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public JsonNullable<@Size(min = 1, max = 20) String> getId() {
    return id;
  }

  public void setId(JsonNullable<String> id) {
    this.id = id;
  }

  public BusinessAccessUserSummary username(String username) {
    this.username = JsonNullable.of(username);
    return this;
  }

  /**
   * Username of the business member/partner.
   * @return username
   */
  
  @Schema(name = "username", example = "business0101", description = "Username of the business member/partner.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("username")
  public JsonNullable<String> getUsername() {
    return username;
  }

  public void setUsername(JsonNullable<String> username) {
    this.username = username;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessAccessUserSummary businessAccessUserSummary = (BusinessAccessUserSummary) o;
    return equalsNullable(this.email, businessAccessUserSummary.email) &&
        equalsNullable(this.id, businessAccessUserSummary.id) &&
        equalsNullable(this.username, businessAccessUserSummary.username);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(email), hashCodeNullable(id), hashCodeNullable(username));
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
    sb.append("class BusinessAccessUserSummary {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

