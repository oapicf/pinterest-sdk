package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.CatalogsProductGroupFilterOperatorTypeCriteria;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * LinkFilter
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LinkFilter {

  private CatalogsProductGroupFilterOperatorTypeCriteria LINK;

  public LinkFilter() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LinkFilter(CatalogsProductGroupFilterOperatorTypeCriteria LINK) {
    this.LINK = LINK;
  }

  public LinkFilter LINK(CatalogsProductGroupFilterOperatorTypeCriteria LINK) {
    this.LINK = LINK;
    return this;
  }

  /**
   * Get LINK
   * @return LINK
   */
  @NotNull @Valid 
  @Schema(name = "LINK", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("LINK")
  public CatalogsProductGroupFilterOperatorTypeCriteria getLINK() {
    return LINK;
  }

  public void setLINK(CatalogsProductGroupFilterOperatorTypeCriteria LINK) {
    this.LINK = LINK;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkFilter linkFilter = (LinkFilter) o;
    return Objects.equals(this.LINK, linkFilter.LINK);
  }

  @Override
  public int hashCode() {
    return Objects.hash(LINK);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkFilter {\n");
    sb.append("    LINK: ").append(toIndentedString(LINK)).append("\n");
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

