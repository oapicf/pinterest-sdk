package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("InnerProductCategoriesMetricsHighlights")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class InnerProductCategoriesMetricsHighlights   {
  private BigDecimal pctChangeMom;

  public InnerProductCategoriesMetricsHighlights() {
  }

  @JsonCreator
  public InnerProductCategoriesMetricsHighlights(
    @JsonProperty(required = true, value = "pct_change_mom") BigDecimal pctChangeMom
  ) {
    this.pctChangeMom = pctChangeMom;
  }

  /**
   * Month-over-month percentage change
   **/
  public InnerProductCategoriesMetricsHighlights pctChangeMom(BigDecimal pctChangeMom) {
    this.pctChangeMom = pctChangeMom;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Month-over-month percentage change")
  @JsonProperty(required = true, value = "pct_change_mom")
  @NotNull @Valid public BigDecimal getPctChangeMom() {
    return pctChangeMom;
  }

  @JsonProperty(required = true, value = "pct_change_mom")
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
