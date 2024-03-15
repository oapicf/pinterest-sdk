package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AudienceCategory;
import org.openapitools.model.AudienceDemographics;
import org.openapitools.model.AudienceInsightType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Audience interests and demographics.
 **/
@ApiModel(description="Audience interests and demographics.")

public class AudienceInsightsResponse  {
  
  @ApiModelProperty(value = "Category interest distribution")
 /**
   * Category interest distribution
  **/
  private List<AudienceCategory> categories;

  @ApiModelProperty(value = "")
  private AudienceDemographics demographics;

  @ApiModelProperty(value = "")
  private AudienceInsightType type = AudienceInsightType.YOUR_TOTAL_AUDIENCE;

  @ApiModelProperty(example = "2022-10-09", value = "Generation date")
 /**
   * Generation date
  **/
  private String date;

  @ApiModelProperty(example = "10000", value = "Population count.")
 /**
   * Population count.
  **/
  private Integer size;

  @ApiModelProperty(example = "true", value = "Indicates whether the audience size has been rounded up to the next highest upper boundary.")
 /**
   * Indicates whether the audience size has been rounded up to the next highest upper boundary.
  **/
  private Boolean sizeIsUpperBound;
 /**
   * Category interest distribution
   * @return categories
  **/
  @JsonProperty("categories")
  public List<AudienceCategory> getCategories() {
    return categories;
  }

  public void setCategories(List<AudienceCategory> categories) {
    this.categories = categories;
  }

  public AudienceInsightsResponse categories(List<AudienceCategory> categories) {
    this.categories = categories;
    return this;
  }

  public AudienceInsightsResponse addCategoriesItem(AudienceCategory categoriesItem) {
    this.categories.add(categoriesItem);
    return this;
  }

 /**
   * Get demographics
   * @return demographics
  **/
  @JsonProperty("demographics")
  public AudienceDemographics getDemographics() {
    return demographics;
  }

  public void setDemographics(AudienceDemographics demographics) {
    this.demographics = demographics;
  }

  public AudienceInsightsResponse demographics(AudienceDemographics demographics) {
    this.demographics = demographics;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public AudienceInsightType getType() {
    return type;
  }

  public void setType(AudienceInsightType type) {
    this.type = type;
  }

  public AudienceInsightsResponse type(AudienceInsightType type) {
    this.type = type;
    return this;
  }

 /**
   * Generation date
   * @return date
  **/
  @JsonProperty("date")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public AudienceInsightsResponse date(String date) {
    this.date = date;
    return this;
  }

 /**
   * Population count.
   * @return size
  **/
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public AudienceInsightsResponse size(Integer size) {
    this.size = size;
    return this;
  }

 /**
   * Indicates whether the audience size has been rounded up to the next highest upper boundary.
   * @return sizeIsUpperBound
  **/
  @JsonProperty("size_is_upper_bound")
  public Boolean getSizeIsUpperBound() {
    return sizeIsUpperBound;
  }

  public void setSizeIsUpperBound(Boolean sizeIsUpperBound) {
    this.sizeIsUpperBound = sizeIsUpperBound;
  }

  public AudienceInsightsResponse sizeIsUpperBound(Boolean sizeIsUpperBound) {
    this.sizeIsUpperBound = sizeIsUpperBound;
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
    AudienceInsightsResponse audienceInsightsResponse = (AudienceInsightsResponse) o;
    return Objects.equals(this.categories, audienceInsightsResponse.categories) &&
        Objects.equals(this.demographics, audienceInsightsResponse.demographics) &&
        Objects.equals(this.type, audienceInsightsResponse.type) &&
        Objects.equals(this.date, audienceInsightsResponse.date) &&
        Objects.equals(this.size, audienceInsightsResponse.size) &&
        Objects.equals(this.sizeIsUpperBound, audienceInsightsResponse.sizeIsUpperBound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categories, demographics, type, date, size, sizeIsUpperBound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceInsightsResponse {\n");
    
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    demographics: ").append(toIndentedString(demographics)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sizeIsUpperBound: ").append(toIndentedString(sizeIsUpperBound)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

