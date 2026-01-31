package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.TrendingPin;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Individual trending topic within an interest category
 **/
@ApiModel(description = "Individual trending topic within an interest category")
@JsonTypeName("TrendingTopic")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-31T04:55:24.841422791Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TrendingTopic   {
  private String description;
  private Integer percentGrowthMom;
  private @Valid List<@Valid TrendingPin> pins = new ArrayList<>();
  private @Valid List<String> relatedInterests = new ArrayList<>();
  private @Valid List<String> relatedSearches = new ArrayList<>();
  private @Valid Map<String, BigDecimal> timeSeries = new HashMap<>();
  private String title;

  public TrendingTopic() {
  }

  @JsonCreator
  public TrendingTopic(
    @JsonProperty(required = true, value = "description") String description,
    @JsonProperty(required = true, value = "percent_growth_mom") Integer percentGrowthMom,
    @JsonProperty(required = true, value = "pins") List<@Valid TrendingPin> pins,
    @JsonProperty(required = true, value = "related_interests") List<String> relatedInterests,
    @JsonProperty(required = true, value = "related_searches") List<String> relatedSearches,
    @JsonProperty(required = true, value = "time_series") Map<String, BigDecimal> timeSeries,
    @JsonProperty(required = true, value = "title") String title
  ) {
    this.description = description;
    this.percentGrowthMom = percentGrowthMom;
    this.pins = pins;
    this.relatedInterests = relatedInterests;
    this.relatedSearches = relatedSearches;
    this.timeSeries = timeSeries;
    this.title = title;
  }

  /**
   * Description of the trending topic
   **/
  public TrendingTopic description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Description of the trending topic")
  @JsonProperty(required = true, value = "description")
  @NotNull public String getDescription() {
    return description;
  }

  @JsonProperty(required = true, value = "description")
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Month-over-month growth percentage
   **/
  public TrendingTopic percentGrowthMom(Integer percentGrowthMom) {
    this.percentGrowthMom = percentGrowthMom;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Month-over-month growth percentage")
  @JsonProperty(required = true, value = "percent_growth_mom")
  @NotNull public Integer getPercentGrowthMom() {
    return percentGrowthMom;
  }

  @JsonProperty(required = true, value = "percent_growth_mom")
  public void setPercentGrowthMom(Integer percentGrowthMom) {
    this.percentGrowthMom = percentGrowthMom;
  }

  /**
   * Array of pin images related to this trend (up to 6)
   **/
  public TrendingTopic pins(List<@Valid TrendingPin> pins) {
    this.pins = pins;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Array of pin images related to this trend (up to 6)")
  @JsonProperty(required = true, value = "pins")
  @NotNull @Valid  @Size(max=6)public List<@Valid TrendingPin> getPins() {
    return pins;
  }

  @JsonProperty(required = true, value = "pins")
  public void setPins(List<@Valid TrendingPin> pins) {
    this.pins = pins;
  }

  public TrendingTopic addPinsItem(TrendingPin pinsItem) {
    if (this.pins == null) {
      this.pins = new ArrayList<>();
    }

    this.pins.add(pinsItem);
    return this;
  }

  public TrendingTopic removePinsItem(TrendingPin pinsItem) {
    if (pinsItem != null && this.pins != null) {
      this.pins.remove(pinsItem);
    }

    return this;
  }
  /**
   * List of related interest categories
   **/
  public TrendingTopic relatedInterests(List<String> relatedInterests) {
    this.relatedInterests = relatedInterests;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "List of related interest categories")
  @JsonProperty(required = true, value = "related_interests")
  @NotNull public List<String> getRelatedInterests() {
    return relatedInterests;
  }

  @JsonProperty(required = true, value = "related_interests")
  public void setRelatedInterests(List<String> relatedInterests) {
    this.relatedInterests = relatedInterests;
  }

  public TrendingTopic addRelatedInterestsItem(String relatedInterestsItem) {
    if (this.relatedInterests == null) {
      this.relatedInterests = new ArrayList<>();
    }

    this.relatedInterests.add(relatedInterestsItem);
    return this;
  }

  public TrendingTopic removeRelatedInterestsItem(String relatedInterestsItem) {
    if (relatedInterestsItem != null && this.relatedInterests != null) {
      this.relatedInterests.remove(relatedInterestsItem);
    }

    return this;
  }
  /**
   * List of related search terms
   **/
  public TrendingTopic relatedSearches(List<String> relatedSearches) {
    this.relatedSearches = relatedSearches;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "List of related search terms")
  @JsonProperty(required = true, value = "related_searches")
  @NotNull public List<String> getRelatedSearches() {
    return relatedSearches;
  }

  @JsonProperty(required = true, value = "related_searches")
  public void setRelatedSearches(List<String> relatedSearches) {
    this.relatedSearches = relatedSearches;
  }

  public TrendingTopic addRelatedSearchesItem(String relatedSearchesItem) {
    if (this.relatedSearches == null) {
      this.relatedSearches = new ArrayList<>();
    }

    this.relatedSearches.add(relatedSearchesItem);
    return this;
  }

  public TrendingTopic removeRelatedSearchesItem(String relatedSearchesItem) {
    if (relatedSearchesItem != null && this.relatedSearches != null) {
      this.relatedSearches.remove(relatedSearchesItem);
    }

    return this;
  }
  /**
   * Time series data showing trend values over time, with dates as keys and values as numeric
   **/
  public TrendingTopic timeSeries(Map<String, BigDecimal> timeSeries) {
    this.timeSeries = timeSeries;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Time series data showing trend values over time, with dates as keys and values as numeric")
  @JsonProperty(required = true, value = "time_series")
  @NotNull @Valid public Map<String, BigDecimal> getTimeSeries() {
    return timeSeries;
  }

  @JsonProperty(required = true, value = "time_series")
  public void setTimeSeries(Map<String, BigDecimal> timeSeries) {
    this.timeSeries = timeSeries;
  }

  public TrendingTopic putTimeSeriesItem(String key, BigDecimal timeSeriesItem) {
    if (this.timeSeries == null) {
      this.timeSeries = new HashMap<>();
    }

    this.timeSeries.put(key, timeSeriesItem);
    return this;
  }

  public TrendingTopic removeTimeSeriesItem(String key) {
    if (this.timeSeries != null) {
      this.timeSeries.remove(key);
    }

    return this;
  }
  /**
   * Title of the trending topic
   **/
  public TrendingTopic title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Title of the trending topic")
  @JsonProperty(required = true, value = "title")
  @NotNull public String getTitle() {
    return title;
  }

  @JsonProperty(required = true, value = "title")
  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrendingTopic trendingTopic = (TrendingTopic) o;
    return Objects.equals(this.description, trendingTopic.description) &&
        Objects.equals(this.percentGrowthMom, trendingTopic.percentGrowthMom) &&
        Objects.equals(this.pins, trendingTopic.pins) &&
        Objects.equals(this.relatedInterests, trendingTopic.relatedInterests) &&
        Objects.equals(this.relatedSearches, trendingTopic.relatedSearches) &&
        Objects.equals(this.timeSeries, trendingTopic.timeSeries) &&
        Objects.equals(this.title, trendingTopic.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, percentGrowthMom, pins, relatedInterests, relatedSearches, timeSeries, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrendingTopic {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    percentGrowthMom: ").append(toIndentedString(percentGrowthMom)).append("\n");
    sb.append("    pins: ").append(toIndentedString(pins)).append("\n");
    sb.append("    relatedInterests: ").append(toIndentedString(relatedInterests)).append("\n");
    sb.append("    relatedSearches: ").append(toIndentedString(relatedSearches)).append("\n");
    sb.append("    timeSeries: ").append(toIndentedString(timeSeries)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

