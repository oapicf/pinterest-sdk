/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.AudienceCategory;
import org.openapitools.client.model.AudienceDemographics;
import org.openapitools.client.model.AudienceInsightType;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Audience interests and demographics.
 **/
@ApiModel(description = "Audience interests and demographics.")
public class AudienceInsightsResponse {
  
  @SerializedName("categories")
  private List<AudienceCategory> categories = null;
  @SerializedName("demographics")
  private AudienceDemographics demographics = null;
  @SerializedName("type")
  private AudienceInsightType type = null;
  @SerializedName("date")
  private String date = null;
  @SerializedName("size")
  private Integer size = null;
  @SerializedName("size_is_upper_bound")
  private Boolean sizeIsUpperBound = null;

  /**
   * Category interest distribution
   **/
  @ApiModelProperty(value = "Category interest distribution")
  public List<AudienceCategory> getCategories() {
    return categories;
  }
  public void setCategories(List<AudienceCategory> categories) {
    this.categories = categories;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public AudienceDemographics getDemographics() {
    return demographics;
  }
  public void setDemographics(AudienceDemographics demographics) {
    this.demographics = demographics;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public AudienceInsightType getType() {
    return type;
  }
  public void setType(AudienceInsightType type) {
    this.type = type;
  }

  /**
   * Generation date
   **/
  @ApiModelProperty(value = "Generation date")
  public String getDate() {
    return date;
  }
  public void setDate(String date) {
    this.date = date;
  }

  /**
   * Population count.
   **/
  @ApiModelProperty(value = "Population count.")
  public Integer getSize() {
    return size;
  }
  public void setSize(Integer size) {
    this.size = size;
  }

  /**
   * Indicates whether the audience size has been rounded up to the next highest upper boundary.
   **/
  @ApiModelProperty(value = "Indicates whether the audience size has been rounded up to the next highest upper boundary.")
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
    return (this.categories == null ? audienceInsightsResponse.categories == null : this.categories.equals(audienceInsightsResponse.categories)) &&
        (this.demographics == null ? audienceInsightsResponse.demographics == null : this.demographics.equals(audienceInsightsResponse.demographics)) &&
        (this.type == null ? audienceInsightsResponse.type == null : this.type.equals(audienceInsightsResponse.type)) &&
        (this.date == null ? audienceInsightsResponse.date == null : this.date.equals(audienceInsightsResponse.date)) &&
        (this.size == null ? audienceInsightsResponse.size == null : this.size.equals(audienceInsightsResponse.size)) &&
        (this.sizeIsUpperBound == null ? audienceInsightsResponse.sizeIsUpperBound == null : this.sizeIsUpperBound.equals(audienceInsightsResponse.sizeIsUpperBound));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.categories == null ? 0: this.categories.hashCode());
    result = 31 * result + (this.demographics == null ? 0: this.demographics.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.date == null ? 0: this.date.hashCode());
    result = 31 * result + (this.size == null ? 0: this.size.hashCode());
    result = 31 * result + (this.sizeIsUpperBound == null ? 0: this.sizeIsUpperBound.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceInsightsResponse {\n");
    
    sb.append("  categories: ").append(categories).append("\n");
    sb.append("  demographics: ").append(demographics).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  date: ").append(date).append("\n");
    sb.append("  size: ").append(size).append("\n");
    sb.append("  sizeIsUpperBound: ").append(sizeIsUpperBound).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
