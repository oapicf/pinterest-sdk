package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.CatalogsProductGroupMultipleMediaTypesCriteria;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * MediaTypeFilter
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class MediaTypeFilter {

  private CatalogsProductGroupMultipleMediaTypesCriteria MEDIA_TYPE;

  public MediaTypeFilter() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MediaTypeFilter(CatalogsProductGroupMultipleMediaTypesCriteria MEDIA_TYPE) {
    this.MEDIA_TYPE = MEDIA_TYPE;
  }

  public MediaTypeFilter MEDIA_TYPE(CatalogsProductGroupMultipleMediaTypesCriteria MEDIA_TYPE) {
    this.MEDIA_TYPE = MEDIA_TYPE;
    return this;
  }

  /**
   * Get MEDIA_TYPE
   * @return MEDIA_TYPE
   */
  @NotNull @Valid 
  @Schema(name = "MEDIA_TYPE", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("MEDIA_TYPE")
  public CatalogsProductGroupMultipleMediaTypesCriteria getMEDIATYPE() {
    return MEDIA_TYPE;
  }

  public void setMEDIATYPE(CatalogsProductGroupMultipleMediaTypesCriteria MEDIA_TYPE) {
    this.MEDIA_TYPE = MEDIA_TYPE;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaTypeFilter mediaTypeFilter = (MediaTypeFilter) o;
    return Objects.equals(this.MEDIA_TYPE, mediaTypeFilter.MEDIA_TYPE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(MEDIA_TYPE);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaTypeFilter {\n");
    sb.append("    MEDIA_TYPE: ").append(toIndentedString(MEDIA_TYPE)).append("\n");
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

