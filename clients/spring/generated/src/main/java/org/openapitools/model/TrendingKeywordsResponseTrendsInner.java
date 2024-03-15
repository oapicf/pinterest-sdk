package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.TrendingKeywordsResponseTrendsInnerTimeSeries;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TrendingKeywordsResponseTrendsInner
 */

@JsonTypeName("TrendingKeywordsResponse_trends_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class TrendingKeywordsResponseTrendsInner {

  private String keyword;

  private Integer pctGrowthWow;

  private Integer pctGrowthMom;

  private Integer pctGrowthYoy;

  private TrendingKeywordsResponseTrendsInnerTimeSeries timeSeries;

  public TrendingKeywordsResponseTrendsInner keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

  /**
   * The keyword that is trending.
   * @return keyword
  */
  @Size(min = 1) 
  @Schema(name = "keyword", example = "couples halloween costumes", description = "The keyword that is trending.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("keyword")
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  public TrendingKeywordsResponseTrendsInner pctGrowthWow(Integer pctGrowthWow) {
    this.pctGrowthWow = pctGrowthWow;
    return this;
  }

  /**
   * The week-over-week percent change in search volume for this keyword.<br /> For example, a value of \"50\" would represent a 50% increase in searches in the last seven days compared to the week prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% week-over-week growth.
   * @return pctGrowthWow
  */
  
  @Schema(name = "pct_growth_wow", example = "50", description = "The week-over-week percent change in search volume for this keyword.<br /> For example, a value of \"50\" would represent a 50% increase in searches in the last seven days compared to the week prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% week-over-week growth.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pct_growth_wow")
  public Integer getPctGrowthWow() {
    return pctGrowthWow;
  }

  public void setPctGrowthWow(Integer pctGrowthWow) {
    this.pctGrowthWow = pctGrowthWow;
  }

  public TrendingKeywordsResponseTrendsInner pctGrowthMom(Integer pctGrowthMom) {
    this.pctGrowthMom = pctGrowthMom;
    return this;
  }

  /**
   * The month-over-month percent change in search volume for this keyword.<br /> For example, a value of \"400\" would represent a 400% increase in searches in the last 30 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% month-over-month growth.
   * @return pctGrowthMom
  */
  
  @Schema(name = "pct_growth_mom", example = "400", description = "The month-over-month percent change in search volume for this keyword.<br /> For example, a value of \"400\" would represent a 400% increase in searches in the last 30 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% month-over-month growth.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pct_growth_mom")
  public Integer getPctGrowthMom() {
    return pctGrowthMom;
  }

  public void setPctGrowthMom(Integer pctGrowthMom) {
    this.pctGrowthMom = pctGrowthMom;
  }

  public TrendingKeywordsResponseTrendsInner pctGrowthYoy(Integer pctGrowthYoy) {
    this.pctGrowthYoy = pctGrowthYoy;
    return this;
  }

  /**
   * The year-over-year percent change in search volume for this keyword.<br /> For example, a value of \"-5\" would represent a 5% decrease in searches in the last 365 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% year-over-year growth.
   * @return pctGrowthYoy
  */
  
  @Schema(name = "pct_growth_yoy", example = "-5", description = "The year-over-year percent change in search volume for this keyword.<br /> For example, a value of \"-5\" would represent a 5% decrease in searches in the last 365 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% year-over-year growth.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pct_growth_yoy")
  public Integer getPctGrowthYoy() {
    return pctGrowthYoy;
  }

  public void setPctGrowthYoy(Integer pctGrowthYoy) {
    this.pctGrowthYoy = pctGrowthYoy;
  }

  public TrendingKeywordsResponseTrendsInner timeSeries(TrendingKeywordsResponseTrendsInnerTimeSeries timeSeries) {
    this.timeSeries = timeSeries;
    return this;
  }

  /**
   * Get timeSeries
   * @return timeSeries
  */
  @Valid 
  @Schema(name = "time_series", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("time_series")
  public TrendingKeywordsResponseTrendsInnerTimeSeries getTimeSeries() {
    return timeSeries;
  }

  public void setTimeSeries(TrendingKeywordsResponseTrendsInnerTimeSeries timeSeries) {
    this.timeSeries = timeSeries;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrendingKeywordsResponseTrendsInner trendingKeywordsResponseTrendsInner = (TrendingKeywordsResponseTrendsInner) o;
    return Objects.equals(this.keyword, trendingKeywordsResponseTrendsInner.keyword) &&
        Objects.equals(this.pctGrowthWow, trendingKeywordsResponseTrendsInner.pctGrowthWow) &&
        Objects.equals(this.pctGrowthMom, trendingKeywordsResponseTrendsInner.pctGrowthMom) &&
        Objects.equals(this.pctGrowthYoy, trendingKeywordsResponseTrendsInner.pctGrowthYoy) &&
        Objects.equals(this.timeSeries, trendingKeywordsResponseTrendsInner.timeSeries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyword, pctGrowthWow, pctGrowthMom, pctGrowthYoy, timeSeries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrendingKeywordsResponseTrendsInner {\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    pctGrowthWow: ").append(toIndentedString(pctGrowthWow)).append("\n");
    sb.append("    pctGrowthMom: ").append(toIndentedString(pctGrowthMom)).append("\n");
    sb.append("    pctGrowthYoy: ").append(toIndentedString(pctGrowthYoy)).append("\n");
    sb.append("    timeSeries: ").append(toIndentedString(timeSeries)).append("\n");
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

