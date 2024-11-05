package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.CatalogsProductGroupMultipleStringCriteria;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreativeAssetsIdFilter
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreativeAssetsIdFilter {

  private CatalogsProductGroupMultipleStringCriteria CREATIVE_ASSETS_ID;

  public CreativeAssetsIdFilter() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreativeAssetsIdFilter(CatalogsProductGroupMultipleStringCriteria CREATIVE_ASSETS_ID) {
    this.CREATIVE_ASSETS_ID = CREATIVE_ASSETS_ID;
  }

  public CreativeAssetsIdFilter CREATIVE_ASSETS_ID(CatalogsProductGroupMultipleStringCriteria CREATIVE_ASSETS_ID) {
    this.CREATIVE_ASSETS_ID = CREATIVE_ASSETS_ID;
    return this;
  }

  /**
   * Get CREATIVE_ASSETS_ID
   * @return CREATIVE_ASSETS_ID
   */
  @NotNull @Valid 
  @Schema(name = "CREATIVE_ASSETS_ID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CREATIVE_ASSETS_ID")
  public CatalogsProductGroupMultipleStringCriteria getCREATIVEASSETSID() {
    return CREATIVE_ASSETS_ID;
  }

  public void setCREATIVEASSETSID(CatalogsProductGroupMultipleStringCriteria CREATIVE_ASSETS_ID) {
    this.CREATIVE_ASSETS_ID = CREATIVE_ASSETS_ID;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeAssetsIdFilter creativeAssetsIdFilter = (CreativeAssetsIdFilter) o;
    return Objects.equals(this.CREATIVE_ASSETS_ID, creativeAssetsIdFilter.CREATIVE_ASSETS_ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CREATIVE_ASSETS_ID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeAssetsIdFilter {\n");
    sb.append("    CREATIVE_ASSETS_ID: ").append(toIndentedString(CREATIVE_ASSETS_ID)).append("\n");
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

