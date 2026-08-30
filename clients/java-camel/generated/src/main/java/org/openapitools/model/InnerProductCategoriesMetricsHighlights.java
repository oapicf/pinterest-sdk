package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * InnerProductCategoriesMetricsHighlights
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class InnerProductCategoriesMetricsHighlights {

  private BigDecimal pctChangeMom;

  public InnerProductCategoriesMetricsHighlights() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public InnerProductCategoriesMetricsHighlights(BigDecimal pctChangeMom) {
    this.pctChangeMom = pctChangeMom;
  }

  public InnerProductCategoriesMetricsHighlights pctChangeMom(BigDecimal pctChangeMom) {
    this.pctChangeMom = pctChangeMom;
    return this;
  }

  /**
   * Month-over-month percentage change
   * @return pctChangeMom
   */
  @NotNull @Valid 
  @Schema(name = "pct_change_mom", description = "Month-over-month percentage change", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pct_change_mom")
  public BigDecimal getPctChangeMom() {
    return pctChangeMom;
  }

  public void setPctChangeMom(BigDecimal pctChangeMom) {
    this.pctChangeMom = pctChangeMom;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InnerProductCategoriesMetricsHighlights innerProductCategoriesMetricsHighlights = (InnerProductCategoriesMetricsHighlights) o;
    return Objects.equals(this.pctChangeMom, innerProductCategoriesMetricsHighlights.pctChangeMom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pctChangeMom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InnerProductCategoriesMetricsHighlights {\n");
    sb.append("    pctChangeMom: ").append(toIndentedString(pctChangeMom)).append("\n");
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

