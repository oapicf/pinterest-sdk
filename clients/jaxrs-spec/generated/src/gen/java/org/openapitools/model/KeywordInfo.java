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

/**
 * Related Keyword information of the editorial article
 **/
@ApiModel(description = "Related Keyword information of the editorial article")
@JsonTypeName("KeywordInfo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class KeywordInfo   {
  private String name;
  private BigDecimal pctGrowthMom;

  public KeywordInfo() {
  }

  @JsonCreator
  public KeywordInfo(
    @JsonProperty(required = true, value = "name") String name
  ) {
    this.name = name;
  }

  /**
   * Keyword Name
   **/
  public KeywordInfo name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Keyword Name")
  @JsonProperty(required = true, value = "name")
  @NotNull public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * MoM growth as a percentage, if there is no growth rate, this field is not present
   **/
  public KeywordInfo pctGrowthMom(BigDecimal pctGrowthMom) {
    this.pctGrowthMom = pctGrowthMom;
    return this;
  }

  
  @ApiModelProperty(value = "MoM growth as a percentage, if there is no growth rate, this field is not present")
  @JsonProperty("pct_growth_mom")
  @Valid public BigDecimal getPctGrowthMom() {
    return pctGrowthMom;
  }

  @JsonProperty("pct_growth_mom")
  public void setPctGrowthMom(BigDecimal pctGrowthMom) {
    this.pctGrowthMom = pctGrowthMom;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
