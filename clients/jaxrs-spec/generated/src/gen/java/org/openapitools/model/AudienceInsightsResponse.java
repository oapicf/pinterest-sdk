package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AudienceCategory;
import org.openapitools.model.AudienceDemographics;
import org.openapitools.model.AudienceInsightType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Audience interests and demographics.
 **/
@ApiModel(description = "Audience interests and demographics.")
@JsonTypeName("AudienceInsightsResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AudienceInsightsResponse   {
  private @Valid List<@Valid AudienceCategory> categories = new ArrayList<>();
  private AudienceDemographics demographics;
  private AudienceInsightType type = AudienceInsightType.YOUR_TOTAL_AUDIENCE;
  private String date;
  private Integer size;
  private Boolean sizeIsUpperBound;

  /**
   * Category interest distribution
   **/
  public AudienceInsightsResponse categories(List<@Valid AudienceCategory> categories) {
    this.categories = categories;
    return this;
  }

  
  @ApiModelProperty(value = "Category interest distribution")
  @JsonProperty("categories")
  @Valid public List<@Valid AudienceCategory> getCategories() {
    return categories;
  }

  @JsonProperty("categories")
  public void setCategories(List<@Valid AudienceCategory> categories) {
    this.categories = categories;
  }

  public AudienceInsightsResponse addCategoriesItem(AudienceCategory categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }

    this.categories.add(categoriesItem);
    return this;
  }

  public AudienceInsightsResponse removeCategoriesItem(AudienceCategory categoriesItem) {
    if (categoriesItem != null && this.categories != null) {
      this.categories.remove(categoriesItem);
    }

    return this;
  }
  /**
   **/
  public AudienceInsightsResponse demographics(AudienceDemographics demographics) {
    this.demographics = demographics;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("demographics")
  @Valid public AudienceDemographics getDemographics() {
    return demographics;
  }

  @JsonProperty("demographics")
  public void setDemographics(AudienceDemographics demographics) {
    this.demographics = demographics;
  }

  /**
   **/
  public AudienceInsightsResponse type(AudienceInsightType type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public AudienceInsightType getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(AudienceInsightType type) {
    this.type = type;
  }

  /**
   * Generation date
   **/
  public AudienceInsightsResponse date(String date) {
    this.date = date;
    return this;
  }

  
  @ApiModelProperty(example = "2022-10-09", value = "Generation date")
  @JsonProperty("date")
   @Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")public String getDate() {
    return date;
  }

  @JsonProperty("date")
  public void setDate(String date) {
    this.date = date;
  }

  /**
   * Population count.
   **/
  public AudienceInsightsResponse size(Integer size) {
    this.size = size;
    return this;
  }

  
  @ApiModelProperty(example = "10000", value = "Population count.")
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }

  @JsonProperty("size")
  public void setSize(Integer size) {
    this.size = size;
  }

  /**
   * Indicates whether the audience size has been rounded up to the next highest upper boundary.
   **/
  public AudienceInsightsResponse sizeIsUpperBound(Boolean sizeIsUpperBound) {
    this.sizeIsUpperBound = sizeIsUpperBound;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "Indicates whether the audience size has been rounded up to the next highest upper boundary.")
  @JsonProperty("size_is_upper_bound")
  public Boolean getSizeIsUpperBound() {
    return sizeIsUpperBound;
  }

  @JsonProperty("size_is_upper_bound")
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

