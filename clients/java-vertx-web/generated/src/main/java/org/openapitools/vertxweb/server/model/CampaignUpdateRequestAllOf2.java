package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.CampaignBidOptionsUpdate;
import org.openapitools.vertxweb.server.model.IntendedPromotionType;
import org.openapitools.vertxweb.server.model.ObjectiveType;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CampaignUpdateRequestAllOf2   {
  
  private CampaignBidOptionsUpdate bidOptions;
  private IntendedPromotionType intendedPromotionType;
  private Boolean isLtvOptimized;
  private Boolean isPerformancePlus;
  private Boolean isTopOfSearch;
  private ObjectiveType objectiveType;

  public CampaignUpdateRequestAllOf2 () {

  }

  public CampaignUpdateRequestAllOf2 (CampaignBidOptionsUpdate bidOptions, IntendedPromotionType intendedPromotionType, Boolean isLtvOptimized, Boolean isPerformancePlus, Boolean isTopOfSearch, ObjectiveType objectiveType) {
    this.bidOptions = bidOptions;
    this.intendedPromotionType = intendedPromotionType;
    this.isLtvOptimized = isLtvOptimized;
    this.isPerformancePlus = isPerformancePlus;
    this.isTopOfSearch = isTopOfSearch;
    this.objectiveType = objectiveType;
  }

    
  @JsonProperty("bid_options")
  public CampaignBidOptionsUpdate getBidOptions() {
    return bidOptions;
  }
  public void setBidOptions(CampaignBidOptionsUpdate bidOptions) {
    this.bidOptions = bidOptions;
  }

    
  @JsonProperty("intended_promotion_type")
  public IntendedPromotionType getIntendedPromotionType() {
    return intendedPromotionType;
  }
  public void setIntendedPromotionType(IntendedPromotionType intendedPromotionType) {
    this.intendedPromotionType = intendedPromotionType;
  }

    
  @JsonProperty("is_ltv_optimized")
  public Boolean getIsLtvOptimized() {
    return isLtvOptimized;
  }
  public void setIsLtvOptimized(Boolean isLtvOptimized) {
    this.isLtvOptimized = isLtvOptimized;
  }

    
  @JsonProperty("is_performance_plus")
  public Boolean getIsPerformancePlus() {
    return isPerformancePlus;
  }
  public void setIsPerformancePlus(Boolean isPerformancePlus) {
    this.isPerformancePlus = isPerformancePlus;
  }

    
  @JsonProperty("is_top_of_search")
  public Boolean getIsTopOfSearch() {
    return isTopOfSearch;
  }
  public void setIsTopOfSearch(Boolean isTopOfSearch) {
    this.isTopOfSearch = isTopOfSearch;
  }

    
  @JsonProperty("objective_type")
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
    return Objects.equals(bidOptions, campaignUpdateRequestAllOf2.bidOptions) &&
        Objects.equals(intendedPromotionType, campaignUpdateRequestAllOf2.intendedPromotionType) &&
        Objects.equals(isLtvOptimized, campaignUpdateRequestAllOf2.isLtvOptimized) &&
        Objects.equals(isPerformancePlus, campaignUpdateRequestAllOf2.isPerformancePlus) &&
        Objects.equals(isTopOfSearch, campaignUpdateRequestAllOf2.isTopOfSearch) &&
        Objects.equals(objectiveType, campaignUpdateRequestAllOf2.objectiveType);
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
