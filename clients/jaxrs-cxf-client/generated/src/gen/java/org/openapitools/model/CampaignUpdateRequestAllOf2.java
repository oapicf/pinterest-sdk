package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CampaignBidOptionsUpdate;
import org.openapitools.model.IntendedPromotionType;
import org.openapitools.model.ObjectiveType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CampaignUpdateRequestAllOf2  {
  
  @ApiModelProperty(value = "")

  private CampaignBidOptionsUpdate bidOptions;

  @ApiModelProperty(value = "")

  private IntendedPromotionType intendedPromotionType;

 /**
  * Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
  */
  @ApiModelProperty(value = "Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.")

  private Boolean isLtvOptimized;

 /**
  * Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>. This field is immutable, except only for campaigns in draft status which may update this field.
  */
  @ApiModelProperty(value = "Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>. This field is immutable, except only for campaigns in draft status which may update this field.")

  private Boolean isPerformancePlus;

 /**
  * Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field.
  */
  @ApiModelProperty(value = "Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field.")

  private Boolean isTopOfSearch;

  @ApiModelProperty(value = "")

  private ObjectiveType objectiveType;
 /**
   * Get bidOptions
   * @return bidOptions
  **/
  @JsonProperty("bid_options")
  public CampaignBidOptionsUpdate getBidOptions() {
    return bidOptions;
  }

  public void setBidOptions(CampaignBidOptionsUpdate bidOptions) {
    this.bidOptions = bidOptions;
  }

  public CampaignUpdateRequestAllOf2 bidOptions(CampaignBidOptionsUpdate bidOptions) {
    this.bidOptions = bidOptions;
    return this;
  }

 /**
   * Get intendedPromotionType
   * @return intendedPromotionType
  **/
  @JsonProperty("intended_promotion_type")
  public IntendedPromotionType getIntendedPromotionType() {
    return intendedPromotionType;
  }

  public void setIntendedPromotionType(IntendedPromotionType intendedPromotionType) {
    this.intendedPromotionType = intendedPromotionType;
  }

  public CampaignUpdateRequestAllOf2 intendedPromotionType(IntendedPromotionType intendedPromotionType) {
    this.intendedPromotionType = intendedPromotionType;
    return this;
  }

 /**
   * Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
   * @return isLtvOptimized
  **/
  @JsonProperty("is_ltv_optimized")
  public Boolean getIsLtvOptimized() {
    return isLtvOptimized;
  }

  public void setIsLtvOptimized(Boolean isLtvOptimized) {
    this.isLtvOptimized = isLtvOptimized;
  }

  public CampaignUpdateRequestAllOf2 isLtvOptimized(Boolean isLtvOptimized) {
    this.isLtvOptimized = isLtvOptimized;
    return this;
  }

 /**
   * Enable Pinterest Performance+ for your campaign. To learn more, see &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\&quot;&gt;Pinterest Performance+ Setup&lt;/a&gt;. This field is immutable, except only for campaigns in draft status which may update this field.
   * @return isPerformancePlus
  **/
  @JsonProperty("is_performance_plus")
  public Boolean getIsPerformancePlus() {
    return isPerformancePlus;
  }

  public void setIsPerformancePlus(Boolean isPerformancePlus) {
    this.isPerformancePlus = isPerformancePlus;
  }

  public CampaignUpdateRequestAllOf2 isPerformancePlus(Boolean isPerformancePlus) {
    this.isPerformancePlus = isPerformancePlus;
    return this;
  }

 /**
   * Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field.
   * @return isTopOfSearch
  **/
  @JsonProperty("is_top_of_search")
  public Boolean getIsTopOfSearch() {
    return isTopOfSearch;
  }

  public void setIsTopOfSearch(Boolean isTopOfSearch) {
    this.isTopOfSearch = isTopOfSearch;
  }

  public CampaignUpdateRequestAllOf2 isTopOfSearch(Boolean isTopOfSearch) {
    this.isTopOfSearch = isTopOfSearch;
    return this;
  }

 /**
   * Get objectiveType
   * @return objectiveType
  **/
  @JsonProperty("objective_type")
  public ObjectiveType getObjectiveType() {
    return objectiveType;
  }

  public void setObjectiveType(ObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
  }

  public CampaignUpdateRequestAllOf2 objectiveType(ObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

