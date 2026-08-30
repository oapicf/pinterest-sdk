package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.CampaignBidOptionsUpdate;
import com.prokarma.pkmst.model.IntendedPromotionType;
import com.prokarma.pkmst.model.ObjectiveType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * CampaignUpdateRequestAllOf2
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignUpdateRequestAllOf2   {
  @JsonProperty("bid_options")
  private CampaignBidOptionsUpdate bidOptions;

  @JsonProperty("intended_promotion_type")
  private IntendedPromotionType intendedPromotionType;

  @JsonProperty("is_ltv_optimized")
  private Boolean isLtvOptimized;

  @JsonProperty("is_performance_plus")
  private Boolean isPerformancePlus;

  @JsonProperty("is_top_of_search")
  private Boolean isTopOfSearch;

  @JsonProperty("objective_type")
  private ObjectiveType objectiveType;

  public CampaignUpdateRequestAllOf2 bidOptions(CampaignBidOptionsUpdate bidOptions) {
    this.bidOptions = bidOptions;
    return this;
  }

  /**
   * Get bidOptions
   * @return bidOptions
   */
  @ApiModelProperty(value = "")
  public CampaignBidOptionsUpdate getBidOptions() {
    return bidOptions;
  }

  public void setBidOptions(CampaignBidOptionsUpdate bidOptions) {
    this.bidOptions = bidOptions;
  }

  public CampaignUpdateRequestAllOf2 intendedPromotionType(IntendedPromotionType intendedPromotionType) {
    this.intendedPromotionType = intendedPromotionType;
    return this;
  }

  /**
   * Get intendedPromotionType
   * @return intendedPromotionType
   */
  @ApiModelProperty(value = "")
  public IntendedPromotionType getIntendedPromotionType() {
    return intendedPromotionType;
  }

  public void setIntendedPromotionType(IntendedPromotionType intendedPromotionType) {
    this.intendedPromotionType = intendedPromotionType;
  }

  public CampaignUpdateRequestAllOf2 isLtvOptimized(Boolean isLtvOptimized) {
    this.isLtvOptimized = isLtvOptimized;
    return this;
  }

  /**
   * Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
   * @return isLtvOptimized
   */
  @ApiModelProperty(value = "Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.")
  public Boolean getIsLtvOptimized() {
    return isLtvOptimized;
  }

  public void setIsLtvOptimized(Boolean isLtvOptimized) {
    this.isLtvOptimized = isLtvOptimized;
  }

  public CampaignUpdateRequestAllOf2 isPerformancePlus(Boolean isPerformancePlus) {
    this.isPerformancePlus = isPerformancePlus;
    return this;
  }

  /**
   * Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>. This field is immutable, except only for campaigns in draft status which may update this field.
   * @return isPerformancePlus
   */
  @ApiModelProperty(value = "Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>. This field is immutable, except only for campaigns in draft status which may update this field.")
  public Boolean getIsPerformancePlus() {
    return isPerformancePlus;
  }

  public void setIsPerformancePlus(Boolean isPerformancePlus) {
    this.isPerformancePlus = isPerformancePlus;
  }

  public CampaignUpdateRequestAllOf2 isTopOfSearch(Boolean isTopOfSearch) {
    this.isTopOfSearch = isTopOfSearch;
    return this;
  }

  /**
   * Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field.
   * @return isTopOfSearch
   */
  @ApiModelProperty(value = "Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field.")
  public Boolean getIsTopOfSearch() {
    return isTopOfSearch;
  }

  public void setIsTopOfSearch(Boolean isTopOfSearch) {
    this.isTopOfSearch = isTopOfSearch;
  }

  public CampaignUpdateRequestAllOf2 objectiveType(ObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

  /**
   * Get objectiveType
   * @return objectiveType
   */
  @ApiModelProperty(value = "")
  public ObjectiveType getObjectiveType() {
    return objectiveType;
  }

  public void setObjectiveType(ObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignUpdateRequestAllOf2 campaignUpdateRequestAllOf2 = (CampaignUpdateRequestAllOf2) o;
    return Objects.equals(this.bidOptions, campaignUpdateRequestAllOf2.bidOptions) &&
        Objects.equals(this.intendedPromotionType, campaignUpdateRequestAllOf2.intendedPromotionType) &&
        Objects.equals(this.isLtvOptimized, campaignUpdateRequestAllOf2.isLtvOptimized) &&
        Objects.equals(this.isPerformancePlus, campaignUpdateRequestAllOf2.isPerformancePlus) &&
        Objects.equals(this.isTopOfSearch, campaignUpdateRequestAllOf2.isTopOfSearch) &&
        Objects.equals(this.objectiveType, campaignUpdateRequestAllOf2.objectiveType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidOptions, intendedPromotionType, isLtvOptimized, isPerformancePlus, isTopOfSearch, objectiveType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignUpdateRequestAllOf2 {\n");
    
    sb.append("    bidOptions: ").append(toIndentedString(bidOptions)).append("\n");
    sb.append("    intendedPromotionType: ").append(toIndentedString(intendedPromotionType)).append("\n");
    sb.append("    isLtvOptimized: ").append(toIndentedString(isLtvOptimized)).append("\n");
    sb.append("    isPerformancePlus: ").append(toIndentedString(isPerformancePlus)).append("\n");
    sb.append("    isTopOfSearch: ").append(toIndentedString(isTopOfSearch)).append("\n");
    sb.append("    objectiveType: ").append(toIndentedString(objectiveType)).append("\n");
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

