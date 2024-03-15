package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.AudienceCategory;
import com.prokarma.pkmst.model.AudienceDemographics;
import com.prokarma.pkmst.model.AudienceInsightType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Audience interests and demographics.
 */
@ApiModel(description = "Audience interests and demographics.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AudienceInsightsResponse   {
  @JsonProperty("categories")
  
  private List<AudienceCategory> categories = null;

  @JsonProperty("demographics")
  private AudienceDemographics demographics;

  @JsonProperty("type")
  private AudienceInsightType type = AudienceInsightType.YOUR_TOTAL_AUDIENCE;

  @JsonProperty("date")
  private String date;

  @JsonProperty("size")
  private Integer size;

  @JsonProperty("size_is_upper_bound")
  private Boolean sizeIsUpperBound;

  public AudienceInsightsResponse categories(List<AudienceCategory> categories) {
    this.categories = categories;
    return this;
  }

  public AudienceInsightsResponse addCategoriesItem(AudienceCategory categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Category interest distribution
   * @return categories
  **/
  @ApiModelProperty(value = "Category interest distribution")
  public List<AudienceCategory> getCategories() {
    return categories;
  }

  public void setCategories(List<AudienceCategory> categories) {
    this.categories = categories;
  }

  public AudienceInsightsResponse demographics(AudienceDemographics demographics) {
    this.demographics = demographics;
    return this;
  }

   /**
   * Get demographics
   * @return demographics
  **/
  @ApiModelProperty(value = "")
  public AudienceDemographics getDemographics() {
    return demographics;
  }

  public void setDemographics(AudienceDemographics demographics) {
    this.demographics = demographics;
  }

  public AudienceInsightsResponse type(AudienceInsightType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public AudienceInsightType getType() {
    return type;
  }

  public void setType(AudienceInsightType type) {
    this.type = type;
  }

  public AudienceInsightsResponse date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Generation date
   * @return date
  **/
  @ApiModelProperty(example = "2022-10-09", value = "Generation date")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public AudienceInsightsResponse size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Population count.
   * @return size
  **/
  @ApiModelProperty(example = "10000", value = "Population count.")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public AudienceInsightsResponse sizeIsUpperBound(Boolean sizeIsUpperBound) {
    this.sizeIsUpperBound = sizeIsUpperBound;
    return this;
  }

   /**
   * Indicates whether the audience size has been rounded up to the next highest upper boundary.
   * @return sizeIsUpperBound
  **/
  @ApiModelProperty(example = "true", value = "Indicates whether the audience size has been rounded up to the next highest upper boundary.")
  public Boolean getSizeIsUpperBound() {
    return sizeIsUpperBound;
  }

  public void setSizeIsUpperBound(Boolean sizeIsUpperBound) {
    this.sizeIsUpperBound = sizeIsUpperBound;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

