package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * Related Keyword information of the editorial article
 */
@ApiModel(description = "Related Keyword information of the editorial article")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class KeywordInfo   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("pct_growth_mom")
  private BigDecimal pctGrowthMom;

  public KeywordInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Keyword Name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Keyword Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public KeywordInfo pctGrowthMom(BigDecimal pctGrowthMom) {
    this.pctGrowthMom = pctGrowthMom;
    return this;
  }

   /**
   * MoM growth as a percentage, if there is no growth rate, this field is not present
   * @return pctGrowthMom
  **/
  @ApiModelProperty(value = "MoM growth as a percentage, if there is no growth rate, this field is not present")
  public BigDecimal getPctGrowthMom() {
    return pctGrowthMom;
  }

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

