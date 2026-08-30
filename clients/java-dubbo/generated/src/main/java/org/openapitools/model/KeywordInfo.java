package org.openapitools.model;

import java.math.BigDecimal;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Related Keyword information of the editorial article
 */
public class KeywordInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Keyword Name
   */
  @JsonProperty("name")
  private String name;

  /**
   * MoM growth as a percentage, if there is no growth rate, this field is not present
   */
  @JsonProperty("pct_growth_mom")
  private BigDecimal pctGrowthMom;

  /**
   * Keyword Name
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * MoM growth as a percentage, if there is no growth rate, this field is not present
   * @return pctGrowthMom
   */
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
