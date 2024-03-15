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

/**
 * Keyword metrics JSON
 **/
@ApiModel(description = "Keyword metrics JSON")
@JsonTypeName("KeywordMetrics")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class KeywordMetrics   {
  private @Valid BigDecimal avgCpcInMicroCurrency;
  private @Valid String keywordQueryVolume;

  /**
   * Average cost per click
   **/
  public KeywordMetrics avgCpcInMicroCurrency(BigDecimal avgCpcInMicroCurrency) {
    this.avgCpcInMicroCurrency = avgCpcInMicroCurrency;
    return this;
  }

  
  @ApiModelProperty(example = "100000", value = "Average cost per click")
  @JsonProperty("avg_cpc_in_micro_currency")
  public BigDecimal getAvgCpcInMicroCurrency() {
    return avgCpcInMicroCurrency;
  }

  @JsonProperty("avg_cpc_in_micro_currency")
  public void setAvgCpcInMicroCurrency(BigDecimal avgCpcInMicroCurrency) {
    this.avgCpcInMicroCurrency = avgCpcInMicroCurrency;
  }

  /**
   * Keyword&#39;s search frequency. This value is based on keyword frequency in pepsi client response
   **/
  public KeywordMetrics keywordQueryVolume(String keywordQueryVolume) {
    this.keywordQueryVolume = keywordQueryVolume;
    return this;
  }

  
  @ApiModelProperty(example = "5M+", value = "Keyword's search frequency. This value is based on keyword frequency in pepsi client response")
  @JsonProperty("keyword_query_volume")
  public String getKeywordQueryVolume() {
    return keywordQueryVolume;
  }

  @JsonProperty("keyword_query_volume")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

