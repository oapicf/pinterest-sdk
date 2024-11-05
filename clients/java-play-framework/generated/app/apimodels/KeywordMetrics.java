package apimodels;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Keyword metrics JSON
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class KeywordMetrics   {
  @JsonProperty("avg_cpc_in_micro_currency")
  @Valid

  private BigDecimal avgCpcInMicroCurrency;

  @JsonProperty("keyword_query_volume")
  
  private String keywordQueryVolume;

  public KeywordMetrics avgCpcInMicroCurrency(BigDecimal avgCpcInMicroCurrency) {
    this.avgCpcInMicroCurrency = avgCpcInMicroCurrency;
    return this;
  }

   /**
   * Average cost per click
   * @return avgCpcInMicroCurrency
  **/
  public BigDecimal getAvgCpcInMicroCurrency() {
    return avgCpcInMicroCurrency;
  }

  public void setAvgCpcInMicroCurrency(BigDecimal avgCpcInMicroCurrency) {
    this.avgCpcInMicroCurrency = avgCpcInMicroCurrency;
  }

  public KeywordMetrics keywordQueryVolume(String keywordQueryVolume) {
    this.keywordQueryVolume = keywordQueryVolume;
    return this;
  }

   /**
   * Keyword's search frequency. This value is based on keyword frequency in pepsi client response
   * @return keywordQueryVolume
  **/
  public String getKeywordQueryVolume() {
    return keywordQueryVolume;
  }

  public void setKeywordQueryVolume(String keywordQueryVolume) {
    this.keywordQueryVolume = keywordQueryVolume;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordMetrics keywordMetrics = (KeywordMetrics) o;
    return Objects.equals(avgCpcInMicroCurrency, keywordMetrics.avgCpcInMicroCurrency) &&
        Objects.equals(keywordQueryVolume, keywordMetrics.keywordQueryVolume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avgCpcInMicroCurrency, keywordQueryVolume);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordMetrics {\n");
    
    sb.append("    avgCpcInMicroCurrency: ").append(toIndentedString(avgCpcInMicroCurrency)).append("\n");
    sb.append("    keywordQueryVolume: ").append(toIndentedString(keywordQueryVolume)).append("\n");
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

