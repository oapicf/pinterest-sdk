package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */

@Schema(name = "SystemUserUpdateWithRequiredBody", description = "Resource create or update operation model with required body fields (no OptionalProperties).")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class SystemUserUpdateWithRequiredBody {

  private String name;

  public SystemUserUpdateWithRequiredBody() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SystemUserUpdateWithRequiredBody(String name) {
    this.name = name;
  }

  public SystemUserUpdateWithRequiredBody name(String name) {
    this.name = name;
    return this;
  }

  /**
   * New system user name
   * @return name
   */
  @NotNull 
  @Schema(name = "name", description = "New system user name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemUserUpdateWithRequiredBody systemUserUpdateWithRequiredBody = (SystemUserUpdateWithRequiredBody) o;
    return Objects.equals(this.name, systemUserUpdateWithRequiredBody.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemUserUpdateWithRequiredBody {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

