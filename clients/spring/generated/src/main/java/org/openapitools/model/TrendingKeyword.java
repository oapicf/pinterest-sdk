package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PredictedTimeSeries;
import org.openapitools.model.TimeSeries;
import org.openapitools.model.TrendingKeywordDemographics;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TrendingKeyword
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-31T05:12:58.482218752Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TrendingKeyword {

  private JsonNullable<TrendingKeywordDemographics> demographics = JsonNullable.<TrendingKeywordDemographics>undefined();

  private @Nullable Boolean hasPrediction;

  private @Nullable String keyword;

  private @Nullable Integer pctGrowthMom;

  private @Nullable Integer pctGrowthWow;

  private @Nullable Integer pctGrowthYoy;

  private @Nullable PredictedTimeSeries predictedTimeSeries;

  private @Nullable TimeSeries timeSeries;

  public TrendingKeyword demographics(TrendingKeywordDemographics demographics) {
    this.demographics = JsonNullable.of(demographics);
    return this;
  }

  /**
   * Get demographics
   * @return demographics
   */
  @Valid 
  @Schema(name = "demographics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("demographics")
  public JsonNullable<TrendingKeywordDemographics> getDemographics() {
    return demographics;
  }

  public void setDemographics(JsonNullable<TrendingKeywordDemographics> demographics) {
    this.demographics = demographics;
  }

  public TrendingKeyword hasPrediction(@Nullable Boolean hasPrediction) {
    this.hasPrediction = hasPrediction;
    return this;
  }

  /**
   * Indicates whether the keyword has a prediction available for the next 90 days.<br /> This field is only applicable when `include_prediction` query parameter is set to `true`. <br /> By default, the value is `false` and no prediction data is included in the response.
   * @return hasPrediction
   */
  
  @Schema(name = "has_prediction", example = "false", description = "Indicates whether the keyword has a prediction available for the next 90 days.<br /> This field is only applicable when `include_prediction` query parameter is set to `true`. <br /> By default, the value is `false` and no prediction data is included in the response.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("has_prediction")
  public @Nullable Boolean getHasPrediction() {
    return hasPrediction;
  }

  public void setHasPrediction(@Nullable Boolean hasPrediction) {
    this.hasPrediction = hasPrediction;
  }

  public TrendingKeyword keyword(@Nullable String keyword) {
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
  public @Nullable String getKeyword() {
    return keyword;
  }

  public void setKeyword(@Nullable String keyword) {
    this.keyword = keyword;
  }

  public TrendingKeyword pctGrowthMom(@Nullable Integer pctGrowthMom) {
    this.pctGrowthMom = pctGrowthMom;
    return this;
  }

  /**
   * The month-over-month percent change in search volume for this keyword.<br /> For example, a value of \"400\" would represent a 400% increase in searches in the last 30 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% month-over-month growth.
   * @return pctGrowthMom
   */
  
  @Schema(name = "pct_growth_mom", example = "400", description = "The month-over-month percent change in search volume for this keyword.<br /> For example, a value of \"400\" would represent a 400% increase in searches in the last 30 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% month-over-month growth.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pct_growth_mom")
  public @Nullable Integer getPctGrowthMom() {
    return pctGrowthMom;
  }

  public void setPctGrowthMom(@Nullable Integer pctGrowthMom) {
    this.pctGrowthMom = pctGrowthMom;
  }

  public TrendingKeyword pctGrowthWow(@Nullable Integer pctGrowthWow) {
    this.pctGrowthWow = pctGrowthWow;
    return this;
  }

  /**
   * The week-over-week percent change in search volume for this keyword.<br /> For example, a value of \"50\" would represent a 50% increase in searches in the last seven days compared to the week prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% week-over-week growth.
   * @return pctGrowthWow
   */
  
  @Schema(name = "pct_growth_wow", example = "50", description = "The week-over-week percent change in search volume for this keyword.<br /> For example, a value of \"50\" would represent a 50% increase in searches in the last seven days compared to the week prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% week-over-week growth.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pct_growth_wow")
  public @Nullable Integer getPctGrowthWow() {
    return pctGrowthWow;
  }

  public void setPctGrowthWow(@Nullable Integer pctGrowthWow) {
    this.pctGrowthWow = pctGrowthWow;
  }

  public TrendingKeyword pctGrowthYoy(@Nullable Integer pctGrowthYoy) {
    this.pctGrowthYoy = pctGrowthYoy;
    return this;
  }

  /**
   * The year-over-year percent change in search volume for this keyword.<br /> For example, a value of \"-5\" would represent a 5% decrease in searches in the last 365 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% year-over-year growth.
   * @return pctGrowthYoy
   */
  
  @Schema(name = "pct_growth_yoy", example = "-5", description = "The year-over-year percent change in search volume for this keyword.<br /> For example, a value of \"-5\" would represent a 5% decrease in searches in the last 365 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% year-over-year growth.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pct_growth_yoy")
  public @Nullable Integer getPctGrowthYoy() {
    return pctGrowthYoy;
  }

  public void setPctGrowthYoy(@Nullable Integer pctGrowthYoy) {
    this.pctGrowthYoy = pctGrowthYoy;
  }

  public TrendingKeyword predictedTimeSeries(@Nullable PredictedTimeSeries predictedTimeSeries) {
    this.predictedTimeSeries = predictedTimeSeries;
    return this;
  }

  /**
   * Get predictedTimeSeries
   * @return predictedTimeSeries
   */
  @Valid 
  @Schema(name = "predicted_time_series", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("predicted_time_series")
  public @Nullable PredictedTimeSeries getPredictedTimeSeries() {
    return predictedTimeSeries;
  }

  public void setPredictedTimeSeries(@Nullable PredictedTimeSeries predictedTimeSeries) {
    this.predictedTimeSeries = predictedTimeSeries;
  }

  public TrendingKeyword timeSeries(@Nullable TimeSeries timeSeries) {
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
  public @Nullable TimeSeries getTimeSeries() {
    return timeSeries;
  }

  public void setTimeSeries(@Nullable TimeSeries timeSeries) {
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
    return equalsNullable(this.demographics, trendingKeyword.demographics) &&
        Objects.equals(this.hasPrediction, trendingKeyword.hasPrediction) &&
        Objects.equals(this.keyword, trendingKeyword.keyword) &&
        Objects.equals(this.pctGrowthMom, trendingKeyword.pctGrowthMom) &&
        Objects.equals(this.pctGrowthWow, trendingKeyword.pctGrowthWow) &&
        Objects.equals(this.pctGrowthYoy, trendingKeyword.pctGrowthYoy) &&
        Objects.equals(this.predictedTimeSeries, trendingKeyword.predictedTimeSeries) &&
        Objects.equals(this.timeSeries, trendingKeyword.timeSeries);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(demographics), hasPrediction, keyword, pctGrowthMom, pctGrowthWow, pctGrowthYoy, predictedTimeSeries, timeSeries);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

