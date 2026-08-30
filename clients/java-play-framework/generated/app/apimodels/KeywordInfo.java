package apimodels;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Related Keyword information of the editorial article
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class KeywordInfo   {
  @JsonProperty("name")
  @NotNull

  private String name;

  @JsonProperty("pct_growth_mom")
  @Valid

  private BigDecimal pctGrowthMom;

  public KeywordInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Keyword Name
   * @return name
  **/
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
    return Objects.equals(name, keywordInfo.name) &&
        Objects.equals(pctGrowthMom, keywordInfo.pctGrowthMom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, pctGrowthMom);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

