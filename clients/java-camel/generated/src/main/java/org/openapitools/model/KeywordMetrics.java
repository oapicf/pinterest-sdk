package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Keyword metrics JSON
 */

@Schema(name = "KeywordMetrics", description = "Keyword metrics JSON")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-14T23:03:40.689435566Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class KeywordMetrics {

  private BigDecimal avgCpcInMicroCurrency;

  private String keywordQueryVolume;

  public KeywordMetrics avgCpcInMicroCurrency(BigDecimal avgCpcInMicroCurrency) {
    this.avgCpcInMicroCurrency = avgCpcInMicroCurrency;
    return this;
  }

  /**
   * Average cost per click
   * @return avgCpcInMicroCurrency
  */
  @Valid 
  @Schema(name = "avg_cpc_in_micro_currency", example = "100000", description = "Average cost per click", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("avg_cpc_in_micro_currency")
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
  */
  
  @Schema(name = "keyword_query_volume", example = "5M+", description = "Keyword's search frequency. This value is based on keyword frequency in pepsi client response", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("keyword_query_volume")
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

