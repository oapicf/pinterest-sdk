package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * InnerProductCategoriesMetricsHighlights
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-31T04:52:46.215362801Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class InnerProductCategoriesMetricsHighlights   {
  @JsonProperty("pct_change_mom")
  private BigDecimal pctChangeMom;

  public InnerProductCategoriesMetricsHighlights pctChangeMom(BigDecimal pctChangeMom) {
    this.pctChangeMom = pctChangeMom;
    return this;
  }

  /**
   * Month-over-month percentage change
   * @return pctChangeMom
   */
  @ApiModelProperty(required = true, value = "Month-over-month percentage change")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

