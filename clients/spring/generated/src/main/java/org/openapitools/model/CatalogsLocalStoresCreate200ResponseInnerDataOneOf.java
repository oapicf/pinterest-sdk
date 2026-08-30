package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.PinterestLibError;
import org.springframework.lang.Nullable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CatalogsLocalStoresCreate200ResponseInnerDataOneOf
 */

@JsonTypeName("catalogs_local_stores_create_200_response_inner_data_oneOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsLocalStoresCreate200ResponseInnerDataOneOf implements CatalogsLocalStoresCreate200ResponseInnerData {

  private String id;

  private PinterestLibError exceptions;

  public CatalogsLocalStoresCreate200ResponseInnerDataOneOf() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsLocalStoresCreate200ResponseInnerDataOneOf(String id, PinterestLibError exceptions) {
    this.id = id;
    this.exceptions = exceptions;
  }

  public CatalogsLocalStoresCreate200ResponseInnerDataOneOf id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the local store.
   * @return id
   */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", example = "1234567890", description = "The ID of the local store.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  public CatalogsLocalStoresCreate200ResponseInnerDataOneOf exceptions(PinterestLibError exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  /**
   * Get exceptions
   * @return exceptions
   */
  @NotNull @Valid 
  @Schema(name = "exceptions", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("exceptions")
  public PinterestLibError getExceptions() {
    return exceptions;
  }

  @JsonProperty("exceptions")
  public void setExceptions(PinterestLibError exceptions) {
    this.exceptions = exceptions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsLocalStoresCreate200ResponseInnerDataOneOf catalogsLocalStoresCreate200ResponseInnerDataOneOf = (CatalogsLocalStoresCreate200ResponseInnerDataOneOf) o;
    return Objects.equals(this.id, catalogsLocalStoresCreate200ResponseInnerDataOneOf.id) &&
        Objects.equals(this.exceptions, catalogsLocalStoresCreate200ResponseInnerDataOneOf.exceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, exceptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsLocalStoresCreate200ResponseInnerDataOneOf {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
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

