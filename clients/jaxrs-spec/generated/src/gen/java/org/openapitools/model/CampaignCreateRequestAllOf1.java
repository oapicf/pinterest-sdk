package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CampaignBidOptionsCreate;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.IntendedPromotionType;
import org.openapitools.model.ObjectiveType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("CampaignCreateRequestAllOf1")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignCreateRequestAllOf1   {
  private CampaignBidOptionsCreate bidOptions;
  private IntendedPromotionType intendedPromotionType;
  private Boolean isAutomatedCampaign;
  private Boolean isCampaignBudgetOptimization;
  private Boolean isFlexibleDailyBudgets;
  private Boolean isLtvOptimized;
  private Boolean isPerformancePlus = false;
  private Boolean isTopOfSearch = false;
  private ObjectiveType objectiveType;
  private EntityStatus status;

  public CampaignCreateRequestAllOf1() {
  }

  @JsonCreator
  public CampaignCreateRequestAllOf1(
    @JsonProperty(required = true, value = "objective_type") ObjectiveType objectiveType
  ) {
    this.objectiveType = objectiveType;
  }

  /**
   **/
  public CampaignCreateRequestAllOf1 bidOptions(CampaignBidOptionsCreate bidOptions) {
    this.bidOptions = bidOptions;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("bid_options")
  @Valid public CampaignBidOptionsCreate getBidOptions() {
    return bidOptions;
  }

  @JsonProperty("bid_options")
  public void setBidOptions(CampaignBidOptionsCreate bidOptions) {
    this.bidOptions = bidOptions;
  }

  /**
   **/
  public CampaignCreateRequestAllOf1 intendedPromotionType(IntendedPromotionType intendedPromotionType) {
    this.intendedPromotionType = intendedPromotionType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("intended_promotion_type")
  public IntendedPromotionType getIntendedPromotionType() {
    return intendedPromotionType;
  }

  @JsonProperty("intended_promotion_type")
  public void setIntendedPromotionType(IntendedPromotionType intendedPromotionType) {
    this.intendedPromotionType = intendedPromotionType;
  }

  /**
   * Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - CATALOG\\_SALES
   **/
  public CampaignCreateRequestAllOf1 isAutomatedCampaign(Boolean isAutomatedCampaign) {
    this.isAutomatedCampaign = isAutomatedCampaign;
    return this;
  }

  
  @ApiModelProperty(value = "Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - CATALOG\\_SALES")
  @JsonProperty("is_automated_campaign")
  public Boolean getIsAutomatedCampaign() {
    return isAutomatedCampaign;
  }

  @JsonProperty("is_automated_campaign")
  public void setIsAutomatedCampaign(Boolean isAutomatedCampaign) {
    this.isAutomatedCampaign = isAutomatedCampaign;
  }

  /**
   * Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.
   **/
  public CampaignCreateRequestAllOf1 isCampaignBudgetOptimization(Boolean isCampaignBudgetOptimization) {
    this.isCampaignBudgetOptimization = isCampaignBudgetOptimization;
    return this;
  }

  
  @ApiModelProperty(value = "Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.")
  @JsonProperty("is_campaign_budget_optimization")
  public Boolean getIsCampaignBudgetOptimization() {
    return isCampaignBudgetOptimization;
  }

  @JsonProperty("is_campaign_budget_optimization")
  public void setIsCampaignBudgetOptimization(Boolean isCampaignBudgetOptimization) {
    this.isCampaignBudgetOptimization = isCampaignBudgetOptimization;
  }

  /**
   * Determine if a campaign has setup for flexible daily budgets, also known as \&quot;Pinterest Performance+ budgets\&quot;. Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.
   **/
  public CampaignCreateRequestAllOf1 isFlexibleDailyBudgets(Boolean isFlexibleDailyBudgets) {
    this.isFlexibleDailyBudgets = isFlexibleDailyBudgets;
    return this;
  }

  
  @ApiModelProperty(value = "Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.")
  @JsonProperty("is_flexible_daily_budgets")
  public Boolean getIsFlexibleDailyBudgets() {
    return isFlexibleDailyBudgets;
  }

  @JsonProperty("is_flexible_daily_budgets")
  public void setIsFlexibleDailyBudgets(Boolean isFlexibleDailyBudgets) {
    this.isFlexibleDailyBudgets = isFlexibleDailyBudgets;
  }

  /**
   * Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
   **/
  public CampaignCreateRequestAllOf1 isLtvOptimized(Boolean isLtvOptimized) {
    this.isLtvOptimized = isLtvOptimized;
    return this;
  }

  
  @ApiModelProperty(value = "Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.")
  @JsonProperty("is_ltv_optimized")
  public Boolean getIsLtvOptimized() {
    return isLtvOptimized;
  }

  @JsonProperty("is_ltv_optimized")
  public void setIsLtvOptimized(Boolean isLtvOptimized) {
    this.isLtvOptimized = isLtvOptimized;
  }

  /**
   * Enable Pinterest Performance+ for your campaign. To learn more, see &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\&quot;&gt;Pinterest Performance+ Setup&lt;/a&gt;.
   **/
  public CampaignCreateRequestAllOf1 isPerformancePlus(Boolean isPerformancePlus) {
    this.isPerformancePlus = isPerformancePlus;
    return this;
  }

  
  @ApiModelProperty(value = "Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>.")
  @JsonProperty("is_performance_plus")
  public Boolean getIsPerformancePlus() {
    return isPerformancePlus;
  }

  @JsonProperty("is_performance_plus")
  public void setIsPerformancePlus(Boolean isPerformancePlus) {
    this.isPerformancePlus = isPerformancePlus;
  }

  /**
   * &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt;  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives: &#x60;CONSIDERATION&#x60; &#x60;WEB_CONVERSION&#x60; &#x60;CATALOG_SALES&#x60;  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.  You cannot change your &#x60;true&#x60; or &#x60;false&#x60; selection of this campaign if you &lt;a href&#x3D;\&quot;https://developer.pinterest.com/docs/api/v5/campaigns-update\&quot; target&#x3D;\&quot;blank\&quot;&gt;update it&lt;/a&gt;.
   **/
  public CampaignCreateRequestAllOf1 isTopOfSearch(Boolean isTopOfSearch) {
    this.isTopOfSearch = isTopOfSearch;
    return this;
  }

  
  @ApiModelProperty(value = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a>  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives: `CONSIDERATION` `WEB_CONVERSION` `CATALOG_SALES`  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.  You cannot change your `true` or `false` selection of this campaign if you <a href=\"https://developer.pinterest.com/docs/api/v5/campaigns-update\" target=\"blank\">update it</a>.")
  @JsonProperty("is_top_of_search")
  public Boolean getIsTopOfSearch() {
    return isTopOfSearch;
  }

  @JsonProperty("is_top_of_search")
  public void setIsTopOfSearch(Boolean isTopOfSearch) {
    this.isTopOfSearch = isTopOfSearch;
  }

  /**
   **/
  public CampaignCreateRequestAllOf1 objectiveType(ObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "objective_type")
  @NotNull public ObjectiveType getObjectiveType() {
    return objectiveType;
  }

  @JsonProperty(required = true, value = "objective_type")
  public void setObjectiveType(ObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
  }

  /**
   **/
  public CampaignCreateRequestAllOf1 status(EntityStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(EntityStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignCreateRequestAllOf1 campaignCreateRequestAllOf1 = (CampaignCreateRequestAllOf1) o;
    return Objects.equals(this.bidOptions, campaignCreateRequestAllOf1.bidOptions) &&
        Objects.equals(this.intendedPromotionType, campaignCreateRequestAllOf1.intendedPromotionType) &&
        Objects.equals(this.isAutomatedCampaign, campaignCreateRequestAllOf1.isAutomatedCampaign) &&
        Objects.equals(this.isCampaignBudgetOptimization, campaignCreateRequestAllOf1.isCampaignBudgetOptimization) &&
        Objects.equals(this.isFlexibleDailyBudgets, campaignCreateRequestAllOf1.isFlexibleDailyBudgets) &&
        Objects.equals(this.isLtvOptimized, campaignCreateRequestAllOf1.isLtvOptimized) &&
        Objects.equals(this.isPerformancePlus, campaignCreateRequestAllOf1.isPerformancePlus) &&
        Objects.equals(this.isTopOfSearch, campaignCreateRequestAllOf1.isTopOfSearch) &&
        Objects.equals(this.objectiveType, campaignCreateRequestAllOf1.objectiveType) &&
        Objects.equals(this.status, campaignCreateRequestAllOf1.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidOptions, intendedPromotionType, isAutomatedCampaign, isCampaignBudgetOptimization, isFlexibleDailyBudgets, isLtvOptimized, isPerformancePlus, isTopOfSearch, objectiveType, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignCreateRequestAllOf1 {\n");
    
    sb.append("    bidOptions: ").append(toIndentedString(bidOptions)).append("\n");
    sb.append("    intendedPromotionType: ").append(toIndentedString(intendedPromotionType)).append("\n");
    sb.append("    isAutomatedCampaign: ").append(toIndentedString(isAutomatedCampaign)).append("\n");
    sb.append("    isCampaignBudgetOptimization: ").append(toIndentedString(isCampaignBudgetOptimization)).append("\n");
    sb.append("    isFlexibleDailyBudgets: ").append(toIndentedString(isFlexibleDailyBudgets)).append("\n");
    sb.append("    isLtvOptimized: ").append(toIndentedString(isLtvOptimized)).append("\n");
    sb.append("    isPerformancePlus: ").append(toIndentedString(isPerformancePlus)).append("\n");
    sb.append("    isTopOfSearch: ").append(toIndentedString(isTopOfSearch)).append("\n");
    sb.append("    objectiveType: ").append(toIndentedString(objectiveType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
