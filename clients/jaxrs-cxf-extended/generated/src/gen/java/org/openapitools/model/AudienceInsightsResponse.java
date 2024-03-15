package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AudienceCategory;
import org.openapitools.model.AudienceDemographics;
import org.openapitools.model.AudienceInsightType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Audience interests and demographics.
 */
@ApiModel(description="Audience interests and demographics.")

public class AudienceInsightsResponse  {
  
 /**
  * Category interest distribution
  */
  @ApiModelProperty(value = "Category interest distribution")
  @Valid
  private List<@Valid AudienceCategory> categories;

  @ApiModelProperty(value = "")
  @Valid
  private AudienceDemographics demographics;

  @ApiModelProperty(value = "")
  @Valid
  private AudienceInsightType type = AudienceInsightType.YOUR_TOTAL_AUDIENCE;

 /**
  * Generation date
  */
  @ApiModelProperty(example = "2022-10-09", value = "Generation date")
  private String date;

 /**
  * Population count.
  */
  @ApiModelProperty(example = "10000", value = "Population count.")
  private Integer size;

 /**
  * Indicates whether the audience size has been rounded up to the next highest upper boundary.
  */
  @ApiModelProperty(example = "true", value = "Indicates whether the audience size has been rounded up to the next highest upper boundary.")
  private Boolean sizeIsUpperBound;
 /**
  * Category interest distribution
  * @return categories
  */
  @JsonProperty("categories")
  public List<@Valid AudienceCategory> getCategories() {
    return categories;
  }

  /**
   * Sets the <code>categories</code> property.
   */
 public void setCategories(List<@Valid AudienceCategory> categories) {
    this.categories = categories;
  }

  /**
   * Sets the <code>categories</code> property.
   */
  public AudienceInsightsResponse categories(List<@Valid AudienceCategory> categories) {
    this.categories = categories;
    return this;
  }

  /**
   * Adds a new item to the <code>categories</code> list.
   */
  public AudienceInsightsResponse addCategoriesItem(AudienceCategory categoriesItem) {
    this.categories.add(categoriesItem);
    return this;
  }

 /**
  * Get demographics
  * @return demographics
  */
  @JsonProperty("demographics")
  public AudienceDemographics getDemographics() {
    return demographics;
  }

  /**
   * Sets the <code>demographics</code> property.
   */
 public void setDemographics(AudienceDemographics demographics) {
    this.demographics = demographics;
  }

  /**
   * Sets the <code>demographics</code> property.
   */
  public AudienceInsightsResponse demographics(AudienceDemographics demographics) {
    this.demographics = demographics;
    return this;
  }

 /**
  * Get type
  * @return type
  */
  @JsonProperty("type")
  public AudienceInsightType getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(AudienceInsightType type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public AudienceInsightsResponse type(AudienceInsightType type) {
    this.type = type;
    return this;
  }

 /**
  * Generation date
  * @return date
  */
  @JsonProperty("date")
 @Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")  public String getDate() {
    return date;
  }

  /**
   * Sets the <code>date</code> property.
   */
 public void setDate(String date) {
    this.date = date;
  }

  /**
   * Sets the <code>date</code> property.
   */
  public AudienceInsightsResponse date(String date) {
    this.date = date;
    return this;
  }

 /**
  * Population count.
  * @return size
  */
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }

  /**
   * Sets the <code>size</code> property.
   */
 public void setSize(Integer size) {
    this.size = size;
  }

  /**
   * Sets the <code>size</code> property.
   */
  public AudienceInsightsResponse size(Integer size) {
    this.size = size;
    return this;
  }

 /**
  * Indicates whether the audience size has been rounded up to the next highest upper boundary.
  * @return sizeIsUpperBound
  */
  @JsonProperty("size_is_upper_bound")
  public Boolean getSizeIsUpperBound() {
    return sizeIsUpperBound;
  }

  /**
   * Sets the <code>sizeIsUpperBound</code> property.
   */
 public void setSizeIsUpperBound(Boolean sizeIsUpperBound) {
    this.sizeIsUpperBound = sizeIsUpperBound;
  }

  /**
   * Sets the <code>sizeIsUpperBound</code> property.
   */
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

