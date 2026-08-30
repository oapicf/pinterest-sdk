package org.openapitools.model;

import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Related Keyword information of the editorial article
 */
@ApiModel(description="Related Keyword information of the editorial article")

public class KeywordInfo  {
  
 /**
  * Keyword Name
  */
  @ApiModelProperty(required = true, value = "Keyword Name")

  private String name;

 /**
  * MoM growth as a percentage, if there is no growth rate, this field is not present
  */
  @ApiModelProperty(value = "MoM growth as a percentage, if there is no growth rate, this field is not present")

  @Valid

  private BigDecimal pctGrowthMom;
 /**
   * Keyword Name
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public KeywordInfo name(String name) {
    this.name = name;
    return this;
  }

 /**
   * MoM growth as a percentage, if there is no growth rate, this field is not present
   * @return pctGrowthMom
  **/
  @JsonProperty("pct_growth_mom")
  public BigDecimal getPctGrowthMom() {
    return pctGrowthMom;
  }

  public void setPctGrowthMom(BigDecimal pctGrowthMom) {
    this.pctGrowthMom = pctGrowthMom;
  }

  public KeywordInfo pctGrowthMom(BigDecimal pctGrowthMom) {
    this.pctGrowthMom = pctGrowthMom;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordInfo keywordInfo = (KeywordInfo) o;
    return Objects.equals(this.name, keywordInfo.name) &&
        Objects.equals(this.pctGrowthMom, keywordInfo.pctGrowthMom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, pctGrowthMom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordInfo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pctGrowthMom: ").append(toIndentedString(pctGrowthMom)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

