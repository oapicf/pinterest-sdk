package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.CatalogsLocalStoresCreate200ResponseInnerData;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CatalogsLocalStoresCreate200ResponseInner
 */

@JsonTypeName("catalogs_local_stores_create_200_response_inner")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsLocalStoresCreate200ResponseInner {

  private CatalogsLocalStoresCreate200ResponseInnerData data;

  public CatalogsLocalStoresCreate200ResponseInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsLocalStoresCreate200ResponseInner(CatalogsLocalStoresCreate200ResponseInnerData data) {
    this.data = data;
  }

  public CatalogsLocalStoresCreate200ResponseInner data(CatalogsLocalStoresCreate200ResponseInnerData data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @NotNull @Valid 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("data")
  public CatalogsLocalStoresCreate200ResponseInnerData getData() {
    return data;
  }

  public void setData(CatalogsLocalStoresCreate200ResponseInnerData data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsLocalStoresCreate200ResponseInner catalogsLocalStoresCreate200ResponseInner = (CatalogsLocalStoresCreate200ResponseInner) o;
    return Objects.equals(this.data, catalogsLocalStoresCreate200ResponseInner.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsLocalStoresCreate200ResponseInner {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

