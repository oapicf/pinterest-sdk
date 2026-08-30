/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PredictedTimeSeries;
import org.openapitools.model.TimeSeries;
import org.openapitools.model.TrendingKeywordDemographics;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TrendingKeyword   {
  
  private TrendingKeywordDemographics demographics;
  private Boolean hasPrediction;
  private String keyword;
  private Integer pctGrowthMom;
  private Integer pctGrowthWow;
  private Integer pctGrowthYoy;
  private PredictedTimeSeries predictedTimeSeries;
  private TimeSeries timeSeries;

  /**
   */
  public TrendingKeyword demographics(TrendingKeywordDemographics demographics) {
    this.demographics = demographics;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("demographics")
  public TrendingKeywordDemographics getDemographics() {
    return demographics;
  }
  public void setDemographics(TrendingKeywordDemographics demographics) {
    this.demographics = demographics;
  }

  /**
   * Indicates whether the keyword has a prediction available for the next 90 days. This field is only applicable when `include_prediction` query parameter is set to `true`. By default, the value is `false` and no prediction data is included in the response.
   */
  public TrendingKeyword hasPrediction(Boolean hasPrediction) {
    this.hasPrediction = hasPrediction;
    return this;
  }

  
  @ApiModelProperty(value = "Indicates whether the keyword has a prediction available for the next 90 days. This field is only applicable when `include_prediction` query parameter is set to `true`. By default, the value is `false` and no prediction data is included in the response.")
  @JsonProperty("has_prediction")
  public Boolean getHasPrediction() {
    return hasPrediction;
  }
  public void setHasPrediction(Boolean hasPrediction) {
    this.hasPrediction = hasPrediction;
  }

  /**
   * The keyword that is trending.
   */
  public TrendingKeyword keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

  
  @ApiModelProperty(value = "The keyword that is trending.")
  @JsonProperty("keyword")
  public String getKeyword() {
    return keyword;
  }
  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  /**
   * The month-over-month percent change in search volume for this keyword. For example, a value of \"400\" would represent a 400% increase in searches in the last 30 days compared to the month prior. **Note**: growth rates are rounded, with a maximum of +/- 10000% change. A value of 10001 indicates that this keyword experienced > 10000% month-over-month growth.
   */
  public TrendingKeyword pctGrowthMom(Integer pctGrowthMom) {
    this.pctGrowthMom = pctGrowthMom;
    return this;
  }

  
  @ApiModelProperty(value = "The month-over-month percent change in search volume for this keyword. For example, a value of \"400\" would represent a 400% increase in searches in the last 30 days compared to the month prior. **Note**: growth rates are rounded, with a maximum of +/- 10000% change. A value of 10001 indicates that this keyword experienced > 10000% month-over-month growth.")
  @JsonProperty("pct_growth_mom")
  public Integer getPctGrowthMom() {
    return pctGrowthMom;
  }
  public void setPctGrowthMom(Integer pctGrowthMom) {
    this.pctGrowthMom = pctGrowthMom;
  }

  /**
   * The week-over-week percent change in search volume for this keyword. For example, a value of \"50\" would represent a 50% increase in searches in the last seven days compared to the week prior. **Note**: growth rates are rounded, with a maximum of +/- 10000% change. A value of 10001 indicates that this keyword experienced > 10000% week-over-week growth.
   */
  public TrendingKeyword pctGrowthWow(Integer pctGrowthWow) {
    this.pctGrowthWow = pctGrowthWow;
    return this;
  }

  
  @ApiModelProperty(value = "The week-over-week percent change in search volume for this keyword. For example, a value of \"50\" would represent a 50% increase in searches in the last seven days compared to the week prior. **Note**: growth rates are rounded, with a maximum of +/- 10000% change. A value of 10001 indicates that this keyword experienced > 10000% week-over-week growth.")
  @JsonProperty("pct_growth_wow")
  public Integer getPctGrowthWow() {
    return pctGrowthWow;
  }
  public void setPctGrowthWow(Integer pctGrowthWow) {
    this.pctGrowthWow = pctGrowthWow;
  }

  /**
   * The year-over-year percent change in search volume for this keyword. For example, a value of \"-5\" would represent a 5% decrease in searches in the last 365 days compared to the month prior. **Note**: growth rates are rounded, with a maximum of +/- 10000% change. A value of 10001 indicates that this keyword experienced > 10000% year-over-year growth.
   */
  public TrendingKeyword pctGrowthYoy(Integer pctGrowthYoy) {
    this.pctGrowthYoy = pctGrowthYoy;
    return this;
  }

  
  @ApiModelProperty(value = "The year-over-year percent change in search volume for this keyword. For example, a value of \"-5\" would represent a 5% decrease in searches in the last 365 days compared to the month prior. **Note**: growth rates are rounded, with a maximum of +/- 10000% change. A value of 10001 indicates that this keyword experienced > 10000% year-over-year growth.")
  @JsonProperty("pct_growth_yoy")
  public Integer getPctGrowthYoy() {
    return pctGrowthYoy;
  }
  public void setPctGrowthYoy(Integer pctGrowthYoy) {
    this.pctGrowthYoy = pctGrowthYoy;
  }

  /**
   * A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months. These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword. Similar to the historical `time_series`, normalization is applied independently to the predicted time series of each keyword, but the `normalize_against_group` query parameter can be used in cases where you wish to compare relative predicted volume between keywords.  **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.  **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week. For example, a value of `2024-01-07` would include predicted searches for the week ending on `2024-01-07`.
   */
  public TrendingKeyword predictedTimeSeries(PredictedTimeSeries predictedTimeSeries) {
    this.predictedTimeSeries = predictedTimeSeries;
    return this;
  }

  
  @ApiModelProperty(value = "A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months. These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword. Similar to the historical `time_series`, normalization is applied independently to the predicted time series of each keyword, but the `normalize_against_group` query parameter can be used in cases where you wish to compare relative predicted volume between keywords.  **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.  **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week. For example, a value of `2024-01-07` would include predicted searches for the week ending on `2024-01-07`.")
  @JsonProperty("predicted_time_series")
  public PredictedTimeSeries getPredictedTimeSeries() {
    return predictedTimeSeries;
  }
  public void setPredictedTimeSeries(PredictedTimeSeries predictedTimeSeries) {
    this.predictedTimeSeries = predictedTimeSeries;
  }

  /**
   * A sequence of weekly observations of the relative search volume for this keyword over the past year. These values are normalized to a [0-100] range, and can be used to visualize the history of user interest in this keyword. By default, normalization is applied independently to the time series of each keyword, but the `normalize_against_group` query parameter can be used in cases where you wish to compare relative volume between keywords.  **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week. For example, a value of `2023-10-31` would include searches that happened between `2023-10-25` and `2023-10-31`.
   */
  public TrendingKeyword timeSeries(TimeSeries timeSeries) {
    this.timeSeries = timeSeries;
    return this;
  }

  
  @ApiModelProperty(value = "A sequence of weekly observations of the relative search volume for this keyword over the past year. These values are normalized to a [0-100] range, and can be used to visualize the history of user interest in this keyword. By default, normalization is applied independently to the time series of each keyword, but the `normalize_against_group` query parameter can be used in cases where you wish to compare relative volume between keywords.  **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week. For example, a value of `2023-10-31` would include searches that happened between `2023-10-25` and `2023-10-31`.")
  @JsonProperty("time_series")
  public TimeSeries getTimeSeries() {
    return timeSeries;
  }
  public void setTimeSeries(TimeSeries timeSeries) {
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
    TrendingKeyword trendingKeyword = (TrendingKeyword) o;
    return Objects.equals(demographics, trendingKeyword.demographics) &&
        Objects.equals(hasPrediction, trendingKeyword.hasPrediction) &&
        Objects.equals(keyword, trendingKeyword.keyword) &&
        Objects.equals(pctGrowthMom, trendingKeyword.pctGrowthMom) &&
        Objects.equals(pctGrowthWow, trendingKeyword.pctGrowthWow) &&
        Objects.equals(pctGrowthYoy, trendingKeyword.pctGrowthYoy) &&
        Objects.equals(predictedTimeSeries, trendingKeyword.predictedTimeSeries) &&
        Objects.equals(timeSeries, trendingKeyword.timeSeries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(demographics, hasPrediction, keyword, pctGrowthMom, pctGrowthWow, pctGrowthYoy, predictedTimeSeries, timeSeries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrendingKeyword {\n");
    
    sb.append("    demographics: ").append(toIndentedString(demographics)).append("\n");
    sb.append("    hasPrediction: ").append(toIndentedString(hasPrediction)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    pctGrowthMom: ").append(toIndentedString(pctGrowthMom)).append("\n");
    sb.append("    pctGrowthWow: ").append(toIndentedString(pctGrowthWow)).append("\n");
    sb.append("    pctGrowthYoy: ").append(toIndentedString(pctGrowthYoy)).append("\n");
    sb.append("    predictedTimeSeries: ").append(toIndentedString(predictedTimeSeries)).append("\n");
    sb.append("    timeSeries: ").append(toIndentedString(timeSeries)).append("\n");
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

