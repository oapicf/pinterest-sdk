package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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

/**
 * Individual trending topic within an interest category
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Individual trending topic within an interest category")
public class TrendingTopic   {
  
  private String description;

  private String id;

  private Integer percentGrowthMom;

  private List<@Valid TrendingPin> pins = new ArrayList<>();

  private List<String> relatedInterests = new ArrayList<>();

  private List<String> relatedSearches = new ArrayList<>();

  private Map<String, BigDecimal> timeSeries = new HashMap<>();

  private String title;

  /**
   * Description of the trending topic
   **/
  public TrendingTopic description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Description of the trending topic")
  @JsonProperty("description")
  @NotNull
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Unique identifier for the trending topic
   **/
  public TrendingTopic id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Unique identifier for the trending topic")
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Month-over-month growth percentage
   **/
  public TrendingTopic percentGrowthMom(Integer percentGrowthMom) {
    this.percentGrowthMom = percentGrowthMom;
    return this;
  }

  
  @ApiModelProperty(value = "Month-over-month growth percentage")
  @JsonProperty("percent_growth_mom")
  public Integer getPercentGrowthMom() {
    return percentGrowthMom;
  }
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
  @JsonProperty("pins")
  @NotNull
 @Size(max=6)  public List<@Valid TrendingPin> getPins() {
    return pins;
  }
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


  /**
   * List of related interest categories
   **/
  public TrendingTopic relatedInterests(List<String> relatedInterests) {
    this.relatedInterests = relatedInterests;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "List of related interest categories")
  @JsonProperty("related_interests")
  @NotNull
  public List<String> getRelatedInterests() {
    return relatedInterests;
  }
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


  /**
   * List of related search terms
   **/
  public TrendingTopic relatedSearches(List<String> relatedSearches) {
    this.relatedSearches = relatedSearches;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "List of related search terms")
  @JsonProperty("related_searches")
  @NotNull
  public List<String> getRelatedSearches() {
    return relatedSearches;
  }
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


  /**
   * Time series data showing trend values over time, with dates as keys and values as numeric
   **/
  public TrendingTopic timeSeries(Map<String, BigDecimal> timeSeries) {
    this.timeSeries = timeSeries;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Time series data showing trend values over time, with dates as keys and values as numeric")
  @JsonProperty("time_series")
  @NotNull
  public Map<String, BigDecimal> getTimeSeries() {
    return timeSeries;
  }
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

  /**
   * Title of the trending topic
   **/
  public TrendingTopic title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Title of the trending topic")
  @JsonProperty("title")
  @NotNull
  public String getTitle() {
    return title;
  }
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
        Objects.equals(this.id, trendingTopic.id) &&
        Objects.equals(this.percentGrowthMom, trendingTopic.percentGrowthMom) &&
        Objects.equals(this.pins, trendingTopic.pins) &&
        Objects.equals(this.relatedInterests, trendingTopic.relatedInterests) &&
        Objects.equals(this.relatedSearches, trendingTopic.relatedSearches) &&
        Objects.equals(this.timeSeries, trendingTopic.timeSeries) &&
        Objects.equals(this.title, trendingTopic.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, percentGrowthMom, pins, relatedInterests, relatedSearches, timeSeries, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrendingTopic {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

