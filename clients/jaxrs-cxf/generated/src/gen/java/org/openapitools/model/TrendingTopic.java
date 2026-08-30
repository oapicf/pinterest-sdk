package org.openapitools.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.TrendingPin;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Individual trending topic within an interest category
 */
@ApiModel(description="Individual trending topic within an interest category")

public class TrendingTopic  {
  
 /**
  * Description of the trending topic
  */
  @ApiModelProperty(required = true, value = "Description of the trending topic")

  private String description;

 /**
  * Unique identifier for the trending topic
  */
  @ApiModelProperty(required = true, value = "Unique identifier for the trending topic")

  private String id;

 /**
  * Month-over-month growth percentage
  */
  @ApiModelProperty(value = "Month-over-month growth percentage")

  private Integer percentGrowthMom;

 /**
  * Array of pin images related to this trend (up to 6)
  */
  @ApiModelProperty(required = true, value = "Array of pin images related to this trend (up to 6)")

  @Valid

  private List<@Valid TrendingPin> pins = new ArrayList<>();

 /**
  * List of related interest categories
  */
  @ApiModelProperty(required = true, value = "List of related interest categories")

  private List<String> relatedInterests = new ArrayList<>();

 /**
  * List of related search terms
  */
  @ApiModelProperty(required = true, value = "List of related search terms")

  private List<String> relatedSearches = new ArrayList<>();

 /**
  * Time series data showing trend values over time, with dates as keys and values as numeric
  */
  @ApiModelProperty(required = true, value = "Time series data showing trend values over time, with dates as keys and values as numeric")

  @Valid

  private Map<String, BigDecimal> timeSeries = new HashMap<>();

 /**
  * Title of the trending topic
  */
  @ApiModelProperty(required = true, value = "Title of the trending topic")

  private String title;
 /**
   * Description of the trending topic
   * @return description
  **/
  @JsonProperty("description")
  @NotNull
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TrendingTopic description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Unique identifier for the trending topic
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TrendingTopic id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Month-over-month growth percentage
   * @return percentGrowthMom
  **/
  @JsonProperty("percent_growth_mom")
  public Integer getPercentGrowthMom() {
    return percentGrowthMom;
  }

  public void setPercentGrowthMom(Integer percentGrowthMom) {
    this.percentGrowthMom = percentGrowthMom;
  }

  public TrendingTopic percentGrowthMom(Integer percentGrowthMom) {
    this.percentGrowthMom = percentGrowthMom;
    return this;
  }

 /**
   * Array of pin images related to this trend (up to 6)
   * @return pins
  **/
  @JsonProperty("pins")
  @NotNull
 @Size(max=6)  public List<@Valid TrendingPin> getPins() {
    return pins;
  }

  public void setPins(List<@Valid TrendingPin> pins) {
    this.pins = pins;
  }

  public TrendingTopic pins(List<@Valid TrendingPin> pins) {
    this.pins = pins;
    return this;
  }

  public TrendingTopic addPinsItem(TrendingPin pinsItem) {
    this.pins.add(pinsItem);
    return this;
  }

 /**
   * List of related interest categories
   * @return relatedInterests
  **/
  @JsonProperty("related_interests")
  @NotNull
  public List<String> getRelatedInterests() {
    return relatedInterests;
  }

  public void setRelatedInterests(List<String> relatedInterests) {
    this.relatedInterests = relatedInterests;
  }

  public TrendingTopic relatedInterests(List<String> relatedInterests) {
    this.relatedInterests = relatedInterests;
    return this;
  }

  public TrendingTopic addRelatedInterestsItem(String relatedInterestsItem) {
    this.relatedInterests.add(relatedInterestsItem);
    return this;
  }

 /**
   * List of related search terms
   * @return relatedSearches
  **/
  @JsonProperty("related_searches")
  @NotNull
  public List<String> getRelatedSearches() {
    return relatedSearches;
  }

  public void setRelatedSearches(List<String> relatedSearches) {
    this.relatedSearches = relatedSearches;
  }

  public TrendingTopic relatedSearches(List<String> relatedSearches) {
    this.relatedSearches = relatedSearches;
    return this;
  }

  public TrendingTopic addRelatedSearchesItem(String relatedSearchesItem) {
    this.relatedSearches.add(relatedSearchesItem);
    return this;
  }

 /**
   * Time series data showing trend values over time, with dates as keys and values as numeric
   * @return timeSeries
  **/
  @JsonProperty("time_series")
  @NotNull
  public Map<String, BigDecimal> getTimeSeries() {
    return timeSeries;
  }

  public void setTimeSeries(Map<String, BigDecimal> timeSeries) {
    this.timeSeries = timeSeries;
  }

  public TrendingTopic timeSeries(Map<String, BigDecimal> timeSeries) {
    this.timeSeries = timeSeries;
    return this;
  }

  public TrendingTopic putTimeSeriesItem(String key, BigDecimal timeSeriesItem) {
    this.timeSeries.put(key, timeSeriesItem);
    return this;
  }

 /**
   * Title of the trending topic
   * @return title
  **/
  @JsonProperty("title")
  @NotNull
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public TrendingTopic title(String title) {
    this.title = title;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

