package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class InnerProductCategoriesMetricsHighlights   {
  
  private BigDecimal pctChangeMom;

  /**
   * Month-over-month percentage change
   **/
  public InnerProductCategoriesMetricsHighlights pctChangeMom(BigDecimal pctChangeMom) {
    this.pctChangeMom = pctChangeMom;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Month-over-month percentage change")
  @JsonProperty("pct_change_mom")
  @NotNull
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

