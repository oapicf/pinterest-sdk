package apimodels;

import apimodels.PredictedTimeSeries;
import apimodels.TimeSeries;
import apimodels.TrendingKeywordDemographics;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * TrendingKeyword
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TrendingKeyword   {
  @JsonProperty("demographics")
  @Valid

  private TrendingKeywordDemographics demographics;

  @JsonProperty("has_prediction")
  
  private Boolean hasPrediction;

  @JsonProperty("keyword")
  @Size(min=1)

  private String keyword;

  @JsonProperty("pct_growth_mom")
  
  private Integer pctGrowthMom;

  @JsonProperty("pct_growth_wow")
  
  private Integer pctGrowthWow;

  @JsonProperty("pct_growth_yoy")
  
  private Integer pctGrowthYoy;

  @JsonProperty("predicted_time_series")
  @Valid

  private PredictedTimeSeries predictedTimeSeries;

  @JsonProperty("time_series")
  @Valid

  private TimeSeries timeSeries;

  public TrendingKeyword demographics(TrendingKeywordDemographics demographics) {
    this.demographics = demographics;
    return this;
  }

   /**
   * Get demographics
   * @return demographics
  **/
  public TrendingKeywordDemographics getDemographics() {
    return demographics;
  }

  public void setDemographics(TrendingKeywordDemographics demographics) {
    this.demographics = demographics;
  }

  public TrendingKeyword hasPrediction(Boolean hasPrediction) {
    this.hasPrediction = hasPrediction;
    return this;
  }

   /**
   * Indicates whether the keyword has a prediction available for the next 90 days. This field is only applicable when `include_prediction` query parameter is set to `true`. By default, the value is `false` and no prediction data is included in the response.
   * @return hasPrediction
  **/
  public Boolean getHasPrediction() {
    return hasPrediction;
  }

  public void setHasPrediction(Boolean hasPrediction) {
    this.hasPrediction = hasPrediction;
  }

  public TrendingKeyword keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

   /**
   * The keyword that is trending.
   * @return keyword
  **/
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  public TrendingKeyword pctGrowthMom(Integer pctGrowthMom) {
    this.pctGrowthMom = pctGrowthMom;
    return this;
  }

   /**
   * The month-over-month percent change in search volume for this keyword. For example, a value of \"400\" would represent a 400% increase in searches in the last 30 days compared to the month prior. **Note**: growth rates are rounded, with a maximum of +/- 10000% change. A value of 10001 indicates that this keyword experienced > 10000% month-over-month growth.
   * @return pctGrowthMom
  **/
  public Integer getPctGrowthMom() {
    return pctGrowthMom;
  }

  public void setPctGrowthMom(Integer pctGrowthMom) {
    this.pctGrowthMom = pctGrowthMom;
  }

  public TrendingKeyword pctGrowthWow(Integer pctGrowthWow) {
    this.pctGrowthWow = pctGrowthWow;
    return this;
  }

   /**
   * The week-over-week percent change in search volume for this keyword. For example, a value of \"50\" would represent a 50% increase in searches in the last seven days compared to the week prior. **Note**: growth rates are rounded, with a maximum of +/- 10000% change. A value of 10001 indicates that this keyword experienced > 10000% week-over-week growth.
   * @return pctGrowthWow
  **/
  public Integer getPctGrowthWow() {
    return pctGrowthWow;
  }

  public void setPctGrowthWow(Integer pctGrowthWow) {
    this.pctGrowthWow = pctGrowthWow;
  }

  public TrendingKeyword pctGrowthYoy(Integer pctGrowthYoy) {
    this.pctGrowthYoy = pctGrowthYoy;
    return this;
  }

   /**
   * The year-over-year percent change in search volume for this keyword. For example, a value of \"-5\" would represent a 5% decrease in searches in the last 365 days compared to the month prior. **Note**: growth rates are rounded, with a maximum of +/- 10000% change. A value of 10001 indicates that this keyword experienced > 10000% year-over-year growth.
   * @return pctGrowthYoy
  **/
  public Integer getPctGrowthYoy() {
    return pctGrowthYoy;
  }

  public void setPctGrowthYoy(Integer pctGrowthYoy) {
    this.pctGrowthYoy = pctGrowthYoy;
  }

  public TrendingKeyword predictedTimeSeries(PredictedTimeSeries predictedTimeSeries) {
    this.predictedTimeSeries = predictedTimeSeries;
    return this;
  }

   /**
   * A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months. These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword. Similar to the historical `time_series`, normalization is applied independently to the predicted time series of each keyword, but the `normalize_against_group` query parameter can be used in cases where you wish to compare relative predicted volume between keywords.  **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.  **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week. For example, a value of `2024-01-07` would include predicted searches for the week ending on `2024-01-07`.
   * @return predictedTimeSeries
  **/
  public PredictedTimeSeries getPredictedTimeSeries() {
    return predictedTimeSeries;
  }

  public void setPredictedTimeSeries(PredictedTimeSeries predictedTimeSeries) {
    this.predictedTimeSeries = predictedTimeSeries;
  }

  public TrendingKeyword timeSeries(TimeSeries timeSeries) {
    this.timeSeries = timeSeries;
    return this;
  }

   /**
   * A sequence of weekly observations of the relative search volume for this keyword over the past year. These values are normalized to a [0-100] range, and can be used to visualize the history of user interest in this keyword. By default, normalization is applied independently to the time series of each keyword, but the `normalize_against_group` query parameter can be used in cases where you wish to compare relative volume between keywords.  **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week. For example, a value of `2023-10-31` would include searches that happened between `2023-10-25` and `2023-10-31`.
   * @return timeSeries
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

