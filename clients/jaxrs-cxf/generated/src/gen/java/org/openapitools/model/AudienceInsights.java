package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AudienceCategory;
import org.openapitools.model.AudienceDemographics;
import org.openapitools.model.AudienceInsightType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Audience interests and demographics.
 */
@ApiModel(description="Audience interests and demographics.")

public class AudienceInsights  {
  
 /**
  * Category interest distribution
  */
  @ApiModelProperty(value = "Category interest distribution")

  @Valid

  private List<@Valid AudienceCategory> categories = new ArrayList<>();

 /**
  * Generation date
  */
  @ApiModelProperty(example = "2022-10-09", value = "Generation date")

  private String date;

  @ApiModelProperty(value = "")

  @Valid

  private AudienceDemographics demographics;

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

  @ApiModelProperty(value = "")

  @Valid

  private AudienceInsightType type;
 /**
   * Category interest distribution
   * @return categories
  **/
  @JsonProperty("categories")
  public List<@Valid AudienceCategory> getCategories() {
    return categories;
  }

  public void setCategories(List<@Valid AudienceCategory> categories) {
    this.categories = categories;
  }

  public AudienceInsights categories(List<@Valid AudienceCategory> categories) {
    this.categories = categories;
    return this;
  }

  public AudienceInsights addCategoriesItem(AudienceCategory categoriesItem) {
    this.categories.add(categoriesItem);
    return this;
  }

 /**
   * Generation date
   * @return date
  **/
  @JsonProperty("date")
 @Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public AudienceInsights date(String date) {
    this.date = date;
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

  public AudienceInsights demographics(AudienceDemographics demographics) {
    this.demographics = demographics;
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

  public AudienceInsights size(Integer size) {
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

  public AudienceInsights sizeIsUpperBound(Boolean sizeIsUpperBound) {
    this.sizeIsUpperBound = sizeIsUpperBound;
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

  public AudienceInsights type(AudienceInsightType type) {
    this.type = type;
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
    AudienceInsights audienceInsights = (AudienceInsights) o;
    return Objects.equals(this.categories, audienceInsights.categories) &&
        Objects.equals(this.date, audienceInsights.date) &&
        Objects.equals(this.demographics, audienceInsights.demographics) &&
        Objects.equals(this.size, audienceInsights.size) &&
        Objects.equals(this.sizeIsUpperBound, audienceInsights.sizeIsUpperBound) &&
        Objects.equals(this.type, audienceInsights.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categories, date, demographics, size, sizeIsUpperBound, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceInsights {\n");
    
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    demographics: ").append(toIndentedString(demographics)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sizeIsUpperBound: ").append(toIndentedString(sizeIsUpperBound)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

