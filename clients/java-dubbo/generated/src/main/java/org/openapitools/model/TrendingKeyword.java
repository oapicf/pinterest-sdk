package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PredictedTimeSeries;
import org.openapitools.model.TimeSeries;
import org.openapitools.model.TrendingKeywordDemographics;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class TrendingKeyword implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("demographics")
  private TrendingKeywordDemographics demographics;

  /**
   * Indicates whether the keyword has a prediction available for the next 90 days. This field is only applicable when &#x60;include_prediction&#x60; query parameter is set to &#x60;true&#x60;. By default, the value is &#x60;false&#x60; and no prediction data is included in the response.
   */
  @JsonProperty("has_prediction")
  private Boolean hasPrediction;

  /**
   * The keyword that is trending.
   */
  @JsonProperty("keyword")
  private String keyword;

  /**
   * The month-over-month percent change in search volume for this keyword. For example, a value of \&quot;400\&quot; would represent a 400% increase in searches in the last 30 days compared to the month prior. **Note**: growth rates are rounded, with a maximum of +/- 10000% change. A value of 10001 indicates that this keyword experienced &gt; 10000% month-over-month growth.
   */
  @JsonProperty("pct_growth_mom")
  private Integer pctGrowthMom;

  /**
   * The week-over-week percent change in search volume for this keyword. For example, a value of \&quot;50\&quot; would represent a 50% increase in searches in the last seven days compared to the week prior. **Note**: growth rates are rounded, with a maximum of +/- 10000% change. A value of 10001 indicates that this keyword experienced &gt; 10000% week-over-week growth.
   */
  @JsonProperty("pct_growth_wow")
  private Integer pctGrowthWow;

  /**
   * The year-over-year percent change in search volume for this keyword. For example, a value of \&quot;-5\&quot; would represent a 5% decrease in searches in the last 365 days compared to the month prior. **Note**: growth rates are rounded, with a maximum of +/- 10000% change. A value of 10001 indicates that this keyword experienced &gt; 10000% year-over-year growth.
   */
  @JsonProperty("pct_growth_yoy")
  private Integer pctGrowthYoy;

  /**
   * A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months. These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword. Similar to the historical &#x60;time_series&#x60;, normalization is applied independently to the predicted time series of each keyword, but the &#x60;normalize_against_group&#x60; query parameter can be used in cases where you wish to compare relative predicted volume between keywords.  **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.  **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week. For example, a value of &#x60;2024-01-07&#x60; would include predicted searches for the week ending on &#x60;2024-01-07&#x60;.
   */
  @JsonProperty("predicted_time_series")
  private PredictedTimeSeries predictedTimeSeries;

  /**
   * A sequence of weekly observations of the relative search volume for this keyword over the past year. These values are normalized to a [0-100] range, and can be used to visualize the history of user interest in this keyword. By default, normalization is applied independently to the time series of each keyword, but the &#x60;normalize_against_group&#x60; query parameter can be used in cases where you wish to compare relative volume between keywords.  **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week. For example, a value of &#x60;2023-10-31&#x60; would include searches that happened between &#x60;2023-10-25&#x60; and &#x60;2023-10-31&#x60;.
   */
  @JsonProperty("time_series")
  private TimeSeries timeSeries;

  /**
   * 
   * @return demographics
   */
  public TrendingKeywordDemographics getDemographics() {
    return demographics;
  }

  public void setDemographics(TrendingKeywordDemographics demographics) {
    this.demographics = demographics;
  }

  /**
   * Indicates whether the keyword has a prediction available for the next 90 days. This field is only applicable when &#x60;include_prediction&#x60; query parameter is set to &#x60;true&#x60;. By default, the value is &#x60;false&#x60; and no prediction data is included in the response.
   * @return hasPrediction
   */
  public Boolean getHasPrediction() {
    return hasPrediction;
  }

  public void setHasPrediction(Boolean hasPrediction) {
    this.hasPrediction = hasPrediction;
  }

  /**
   * The keyword that is trending.
   * @return keyword
   */
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  /**
   * The month-over-month percent change in search volume for this keyword. For example, a value of \&quot;400\&quot; would represent a 400% increase in searches in the last 30 days compared to the month prior. **Note**: growth rates are rounded, with a maximum of +/- 10000% change. A value of 10001 indicates that this keyword experienced &gt; 10000% month-over-month growth.
   * @return pctGrowthMom
   */
  public Integer getPctGrowthMom() {
    return pctGrowthMom;
  }

  public void setPctGrowthMom(Integer pctGrowthMom) {
    this.pctGrowthMom = pctGrowthMom;
  }

  /**
   * The week-over-week percent change in search volume for this keyword. For example, a value of \&quot;50\&quot; would represent a 50% increase in searches in the last seven days compared to the week prior. **Note**: growth rates are rounded, with a maximum of +/- 10000% change. A value of 10001 indicates that this keyword experienced &gt; 10000% week-over-week growth.
   * @return pctGrowthWow
   */
  public Integer getPctGrowthWow() {
    return pctGrowthWow;
  }

  public void setPctGrowthWow(Integer pctGrowthWow) {
    this.pctGrowthWow = pctGrowthWow;
  }

  /**
   * The year-over-year percent change in search volume for this keyword. For example, a value of \&quot;-5\&quot; would represent a 5% decrease in searches in the last 365 days compared to the month prior. **Note**: growth rates are rounded, with a maximum of +/- 10000% change. A value of 10001 indicates that this keyword experienced &gt; 10000% year-over-year growth.
   * @return pctGrowthYoy
   */
  public Integer getPctGrowthYoy() {
    return pctGrowthYoy;
  }

  public void setPctGrowthYoy(Integer pctGrowthYoy) {
    this.pctGrowthYoy = pctGrowthYoy;
  }

  /**
   * A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months. These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword. Similar to the historical &#x60;time_series&#x60;, normalization is applied independently to the predicted time series of each keyword, but the &#x60;normalize_against_group&#x60; query parameter can be used in cases where you wish to compare relative predicted volume between keywords.  **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.  **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week. For example, a value of &#x60;2024-01-07&#x60; would include predicted searches for the week ending on &#x60;2024-01-07&#x60;.
   * @return predictedTimeSeries
   */
  public PredictedTimeSeries getPredictedTimeSeries() {
    return predictedTimeSeries;
  }

  public void setPredictedTimeSeries(PredictedTimeSeries predictedTimeSeries) {
    this.predictedTimeSeries = predictedTimeSeries;
  }

  /**
   * A sequence of weekly observations of the relative search volume for this keyword over the past year. These values are normalized to a [0-100] range, and can be used to visualize the history of user interest in this keyword. By default, normalization is applied independently to the time series of each keyword, but the &#x60;normalize_against_group&#x60; query parameter can be used in cases where you wish to compare relative volume between keywords.  **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week. For example, a value of &#x60;2023-10-31&#x60; would include searches that happened between &#x60;2023-10-25&#x60; and &#x60;2023-10-31&#x60;.
   * @return timeSeries
   */
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
    return Objects.equals(this.demographics, trendingKeyword.demographics) &&
        Objects.equals(this.hasPrediction, trendingKeyword.hasPrediction) &&
        Objects.equals(this.keyword, trendingKeyword.keyword) &&
        Objects.equals(this.pctGrowthMom, trendingKeyword.pctGrowthMom) &&
        Objects.equals(this.pctGrowthWow, trendingKeyword.pctGrowthWow) &&
        Objects.equals(this.pctGrowthYoy, trendingKeyword.pctGrowthYoy) &&
        Objects.equals(this.predictedTimeSeries, trendingKeyword.predictedTimeSeries) &&
        Objects.equals(this.timeSeries, trendingKeyword.timeSeries);
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
