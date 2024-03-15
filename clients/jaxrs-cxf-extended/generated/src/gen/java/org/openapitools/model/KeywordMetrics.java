package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Keyword metrics JSON
 */
@ApiModel(description="Keyword metrics JSON")

public class KeywordMetrics  {
  
 /**
  * Average cost per click
  */
  @ApiModelProperty(example = "100000", value = "Average cost per click")
  @Valid
  private BigDecimal avgCpcInMicroCurrency;

 /**
  * Keyword's search frequency. This value is based on keyword frequency in pepsi client response
  */
  @ApiModelProperty(example = "5M+", value = "Keyword's search frequency. This value is based on keyword frequency in pepsi client response")
  private String keywordQueryVolume;
 /**
  * Average cost per click
  * @return avgCpcInMicroCurrency
  */
  @JsonProperty("avg_cpc_in_micro_currency")
  public BigDecimal getAvgCpcInMicroCurrency() {
    return avgCpcInMicroCurrency;
  }

  /**
   * Sets the <code>avgCpcInMicroCurrency</code> property.
   */
 public void setAvgCpcInMicroCurrency(BigDecimal avgCpcInMicroCurrency) {
    this.avgCpcInMicroCurrency = avgCpcInMicroCurrency;
  }

  /**
   * Sets the <code>avgCpcInMicroCurrency</code> property.
   */
  public KeywordMetrics avgCpcInMicroCurrency(BigDecimal avgCpcInMicroCurrency) {
    this.avgCpcInMicroCurrency = avgCpcInMicroCurrency;
    return this;
  }

 /**
  * Keyword&#39;s search frequency. This value is based on keyword frequency in pepsi client response
  * @return keywordQueryVolume
  */
  @JsonProperty("keyword_query_volume")
  public String getKeywordQueryVolume() {
    return keywordQueryVolume;
  }

  /**
   * Sets the <code>keywordQueryVolume</code> property.
   */
 public void setKeywordQueryVolume(String keywordQueryVolume) {
    this.keywordQueryVolume = keywordQueryVolume;
  }

  /**
   * Sets the <code>keywordQueryVolume</code> property.
   */
  public KeywordMetrics keywordQueryVolume(String keywordQueryVolume) {
    this.keywordQueryVolume = keywordQueryVolume;
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
    KeywordMetrics keywordMetrics = (KeywordMetrics) o;
    return Objects.equals(this.avgCpcInMicroCurrency, keywordMetrics.avgCpcInMicroCurrency) &&
        Objects.equals(this.keywordQueryVolume, keywordMetrics.keywordQueryVolume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avgCpcInMicroCurrency, keywordQueryVolume);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

