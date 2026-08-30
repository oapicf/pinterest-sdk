package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CampaignBidOptions;
import org.openapitools.model.ConversionObjectiveType;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.IntendedPromotionType;
import org.openapitools.model.MobileAppPlatform;
import org.openapitools.model.TrackingUrls;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Single campaign create item with create-specific defaults.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Single campaign create item with create-specific defaults.")
public class CampaignCreateItem   {
  
  private String adAccountId;

  private String appId;

  private MobileAppPlatform appPlatform;

  private CampaignBidOptions bidOptions;

  private Integer dailySpendCap;

  private Integer defaultAdGroupBudgetInMicroCurrency;

  private Integer endTime;

  private IntendedPromotionType intendedPromotionType;

  private Boolean isAutomatedCampaign = false;

  private Boolean isCampaignBudgetOptimization = true;

  private Boolean isFlexibleDailyBudgets = false;

  private Boolean isLtvOptimized;

  private Boolean isPerformancePlus = false;

  private Boolean isTopOfSearch = false;

  private Integer lifetimeSpendCap;

  private String name;

  private ConversionObjectiveType objectiveType;

  private String orderLineId;

  private Integer startTime;

  private EntityStatus status;

  private TrackingUrls trackingUrls;

  /**
   * Setting this field does nothing. The ad account ID gets set from the path parameter.
   **/
  public CampaignCreateItem adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  
  @ApiModelProperty(example = "549755885175", value = "Setting this field does nothing. The ad account ID gets set from the path parameter.")
  @JsonProperty("ad_account_id")
 @Pattern(regexp="^\\d+$")  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }


  /**
   * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  The store ID of the mobile app for &#x60;APP_INSTALL&#x60; campaigns.
   **/
  public CampaignCreateItem appId(String appId) {
    this.appId = appId;
    return this;
  }

  
  @ApiModelProperty(example = "429047995", value = "[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  The store ID of the mobile app for `APP_INSTALL` campaigns.")
  @JsonProperty("app_id")
  public String getAppId() {
    return appId;
  }
  public void setAppId(String appId) {
    this.appId = appId;
  }


  /**
   * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Platform of the mobile app for &#x60;APP_INSTALL&#x60; campaigns.
   **/
  public CampaignCreateItem appPlatform(MobileAppPlatform appPlatform) {
    this.appPlatform = appPlatform;
    return this;
  }

  
  @ApiModelProperty(example = "IOS", value = "[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Platform of the mobile app for `APP_INSTALL` campaigns.")
  @JsonProperty("app_platform")
  public MobileAppPlatform getAppPlatform() {
    return appPlatform;
  }
  public void setAppPlatform(MobileAppPlatform appPlatform) {
    this.appPlatform = appPlatform;
  }


  /**
   * [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Object describing the campaign level bid multipliers.
   **/
  public CampaignCreateItem bidOptions(CampaignBidOptions bidOptions) {
    this.bidOptions = bidOptions;
    return this;
  }

  
  @ApiModelProperty(value = "[Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Object describing the campaign level bid multipliers.")
  @JsonProperty("bid_options")
  public CampaignBidOptions getBidOptions() {
    return bidOptions;
  }
  public void setBidOptions(CampaignBidOptions bidOptions) {
    this.bidOptions = bidOptions;
  }


  /**
   * Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.
   **/
  public CampaignCreateItem dailySpendCap(Integer dailySpendCap) {
    this.dailySpendCap = dailySpendCap;
    return this;
  }

  
  @ApiModelProperty(example = "1432744744", value = "Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.")
  @JsonProperty("daily_spend_cap")
  public Integer getDailySpendCap() {
    return dailySpendCap;
  }
  public void setDailySpendCap(Integer dailySpendCap) {
    this.dailySpendCap = dailySpendCap;
  }


  /**
   * Setting this field does nothing.
   **/
  public CampaignCreateItem defaultAdGroupBudgetInMicroCurrency(Integer defaultAdGroupBudgetInMicroCurrency) {
    this.defaultAdGroupBudgetInMicroCurrency = defaultAdGroupBudgetInMicroCurrency;
    return this;
  }

  
  @ApiModelProperty(example = "0", value = "Setting this field does nothing.")
  @JsonProperty("default_ad_group_budget_in_micro_currency")
  public Integer getDefaultAdGroupBudgetInMicroCurrency() {
    return defaultAdGroupBudgetInMicroCurrency;
  }
  public void setDefaultAdGroupBudgetInMicroCurrency(Integer defaultAdGroupBudgetInMicroCurrency) {
    this.defaultAdGroupBudgetInMicroCurrency = defaultAdGroupBudgetInMicroCurrency;
  }


  /**
   * Note: To clear this field on update, set the end time to -1. Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If &#x60;end_time&#x60; is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to &#x60;paused&#x60;. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different end times can be set for the campaign&#39;s child ad groups, but they cannot occur after an &#x60;end_time&#x60; specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an &#x60;end_time&#x60; that is earlier than that of the ad group, the campaign &#x60;end_time&#x60; will supersede the ad group &#x60;end_time&#x60;, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
   **/
  public CampaignCreateItem endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

  
  @ApiModelProperty(example = "1644023526", value = "Note: To clear this field on update, set the end time to -1. Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.")
  @JsonProperty("end_time")
  public Integer getEndTime() {
    return endTime;
  }
  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }


  /**
   **/
  public CampaignCreateItem intendedPromotionType(IntendedPromotionType intendedPromotionType) {
    this.intendedPromotionType = intendedPromotionType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("intended_promotion_type")
  public IntendedPromotionType getIntendedPromotionType() {
    return intendedPromotionType;
  }
  public void setIntendedPromotionType(IntendedPromotionType intendedPromotionType) {
    this.intendedPromotionType = intendedPromotionType;
  }


  /**
   * Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES
   **/
  public CampaignCreateItem isAutomatedCampaign(Boolean isAutomatedCampaign) {
    this.isAutomatedCampaign = isAutomatedCampaign;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES")
  @JsonProperty("is_automated_campaign")
  public Boolean getIsAutomatedCampaign() {
    return isAutomatedCampaign;
  }
  public void setIsAutomatedCampaign(Boolean isAutomatedCampaign) {
    this.isAutomatedCampaign = isAutomatedCampaign;
  }


  /**
   * Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.
   **/
  public CampaignCreateItem isCampaignBudgetOptimization(Boolean isCampaignBudgetOptimization) {
    this.isCampaignBudgetOptimization = isCampaignBudgetOptimization;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.")
  @JsonProperty("is_campaign_budget_optimization")
  public Boolean getIsCampaignBudgetOptimization() {
    return isCampaignBudgetOptimization;
  }
  public void setIsCampaignBudgetOptimization(Boolean isCampaignBudgetOptimization) {
    this.isCampaignBudgetOptimization = isCampaignBudgetOptimization;
  }


  /**
   * Determine if a campaign has setup for flexible daily budgets, also known as \&quot;Pinterest Performance+ budgets\&quot;. Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.
   **/
  public CampaignCreateItem isFlexibleDailyBudgets(Boolean isFlexibleDailyBudgets) {
    this.isFlexibleDailyBudgets = isFlexibleDailyBudgets;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.")
  @JsonProperty("is_flexible_daily_budgets")
  public Boolean getIsFlexibleDailyBudgets() {
    return isFlexibleDailyBudgets;
  }
  public void setIsFlexibleDailyBudgets(Boolean isFlexibleDailyBudgets) {
    this.isFlexibleDailyBudgets = isFlexibleDailyBudgets;
  }


  /**
   * Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
   **/
  public CampaignCreateItem isLtvOptimized(Boolean isLtvOptimized) {
    this.isLtvOptimized = isLtvOptimized;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.")
  @JsonProperty("is_ltv_optimized")
  public Boolean getIsLtvOptimized() {
    return isLtvOptimized;
  }
  public void setIsLtvOptimized(Boolean isLtvOptimized) {
    this.isLtvOptimized = isLtvOptimized;
  }


  /**
   * Note: This field is immutable unless the campaign is in draft status. You can only use this feature with the following objectives: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES - APP\\_INSTALL Enable Pinterest Performance+ for your campaign. To learn more, see [Pinterest Performance+ Setup](https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/)
   **/
  public CampaignCreateItem isPerformancePlus(Boolean isPerformancePlus) {
    this.isPerformancePlus = isPerformancePlus;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "Note: This field is immutable unless the campaign is in draft status. You can only use this feature with the following objectives: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES - APP\\_INSTALL Enable Pinterest Performance+ for your campaign. To learn more, see [Pinterest Performance+ Setup](https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/)")
  @JsonProperty("is_performance_plus")
  public Boolean getIsPerformancePlus() {
    return isPerformancePlus;
  }
  public void setIsPerformancePlus(Boolean isPerformancePlus) {
    this.isPerformancePlus = isPerformancePlus;
  }


  /**
   * Note: This field is immutable unless the campaign is in draft status.  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives:  - CONSIDERATION  - WEB\\_CONVERSION  - SALES  - LEADS  - CATALOG\\_SALES  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.
   **/
  public CampaignCreateItem isTopOfSearch(Boolean isTopOfSearch) {
    this.isTopOfSearch = isTopOfSearch;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "Note: This field is immutable unless the campaign is in draft status.  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives:  - CONSIDERATION  - WEB\\_CONVERSION  - SALES  - LEADS  - CATALOG\\_SALES  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.")
  @JsonProperty("is_top_of_search")
  public Boolean getIsTopOfSearch() {
    return isTopOfSearch;
  }
  public void setIsTopOfSearch(Boolean isTopOfSearch) {
    this.isTopOfSearch = isTopOfSearch;
  }


  /**
   * Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.
   **/
  public CampaignCreateItem lifetimeSpendCap(Integer lifetimeSpendCap) {
    this.lifetimeSpendCap = lifetimeSpendCap;
    return this;
  }

  
  @ApiModelProperty(example = "1432744744", value = "Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.")
  @JsonProperty("lifetime_spend_cap")
  public Integer getLifetimeSpendCap() {
    return lifetimeSpendCap;
  }
  public void setLifetimeSpendCap(Integer lifetimeSpendCap) {
    this.lifetimeSpendCap = lifetimeSpendCap;
  }


  /**
   * Campaign name - 255 chars max.
   **/
  public CampaignCreateItem name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "ACME Tools", required = true, value = "Campaign name - 255 chars max.")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   **/
  public CampaignCreateItem objectiveType(ConversionObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("objective_type")
  @NotNull
  public ConversionObjectiveType getObjectiveType() {
    return objectiveType;
  }
  public void setObjectiveType(ConversionObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
  }


  /**
   * Note: To clear this field on update, set the order line ID to 0. Order line ID that appears on the invoice. The order line must not be expired.
   **/
  public CampaignCreateItem orderLineId(String orderLineId) {
    this.orderLineId = orderLineId;
    return this;
  }

  
  @ApiModelProperty(example = "549755885175", value = "Note: To clear this field on update, set the order line ID to 0. Order line ID that appears on the invoice. The order line must not be expired.")
  @JsonProperty("order_line_id")
 @Pattern(regexp="^\\d+$")  public String getOrderLineId() {
    return orderLineId;
  }
  public void setOrderLineId(String orderLineId) {
    this.orderLineId = orderLineId;
  }


  /**
   * Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different start times can be set for the campaign&#39;s child ad groups, but they cannot occur before a &#x60;start_time&#x60; specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a &#x60;start_time&#x60; that is later than that of the ad group, the campaign &#x60;start_time&#x60; will supersede the ad group &#x60;start_time&#x60;, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
   **/
  public CampaignCreateItem startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

  
  @ApiModelProperty(example = "1580865126", value = "Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.")
  @JsonProperty("start_time")
  public Integer getStartTime() {
    return startTime;
  }
  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }


  /**
   **/
  public CampaignCreateItem status(EntityStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }
  public void setStatus(EntityStatus status) {
    this.status = status;
  }


  /**
   **/
  public CampaignCreateItem trackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tracking_urls")
  public TrackingUrls getTrackingUrls() {
    return trackingUrls;
  }
  public void setTrackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignCreateItem campaignCreateItem = (CampaignCreateItem) o;
    return Objects.equals(this.adAccountId, campaignCreateItem.adAccountId) &&
        Objects.equals(this.appId, campaignCreateItem.appId) &&
        Objects.equals(this.appPlatform, campaignCreateItem.appPlatform) &&
        Objects.equals(this.bidOptions, campaignCreateItem.bidOptions) &&
        Objects.equals(this.dailySpendCap, campaignCreateItem.dailySpendCap) &&
        Objects.equals(this.defaultAdGroupBudgetInMicroCurrency, campaignCreateItem.defaultAdGroupBudgetInMicroCurrency) &&
        Objects.equals(this.endTime, campaignCreateItem.endTime) &&
        Objects.equals(this.intendedPromotionType, campaignCreateItem.intendedPromotionType) &&
        Objects.equals(this.isAutomatedCampaign, campaignCreateItem.isAutomatedCampaign) &&
        Objects.equals(this.isCampaignBudgetOptimization, campaignCreateItem.isCampaignBudgetOptimization) &&
        Objects.equals(this.isFlexibleDailyBudgets, campaignCreateItem.isFlexibleDailyBudgets) &&
        Objects.equals(this.isLtvOptimized, campaignCreateItem.isLtvOptimized) &&
        Objects.equals(this.isPerformancePlus, campaignCreateItem.isPerformancePlus) &&
        Objects.equals(this.isTopOfSearch, campaignCreateItem.isTopOfSearch) &&
        Objects.equals(this.lifetimeSpendCap, campaignCreateItem.lifetimeSpendCap) &&
        Objects.equals(this.name, campaignCreateItem.name) &&
        Objects.equals(this.objectiveType, campaignCreateItem.objectiveType) &&
        Objects.equals(this.orderLineId, campaignCreateItem.orderLineId) &&
        Objects.equals(this.startTime, campaignCreateItem.startTime) &&
        Objects.equals(this.status, campaignCreateItem.status) &&
        Objects.equals(this.trackingUrls, campaignCreateItem.trackingUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, appId, appPlatform, bidOptions, dailySpendCap, defaultAdGroupBudgetInMicroCurrency, endTime, intendedPromotionType, isAutomatedCampaign, isCampaignBudgetOptimization, isFlexibleDailyBudgets, isLtvOptimized, isPerformancePlus, isTopOfSearch, lifetimeSpendCap, name, objectiveType, orderLineId, startTime, status, trackingUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignCreateItem {\n");
    
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appPlatform: ").append(toIndentedString(appPlatform)).append("\n");
    sb.append("    bidOptions: ").append(toIndentedString(bidOptions)).append("\n");
    sb.append("    dailySpendCap: ").append(toIndentedString(dailySpendCap)).append("\n");
    sb.append("    defaultAdGroupBudgetInMicroCurrency: ").append(toIndentedString(defaultAdGroupBudgetInMicroCurrency)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    intendedPromotionType: ").append(toIndentedString(intendedPromotionType)).append("\n");
    sb.append("    isAutomatedCampaign: ").append(toIndentedString(isAutomatedCampaign)).append("\n");
    sb.append("    isCampaignBudgetOptimization: ").append(toIndentedString(isCampaignBudgetOptimization)).append("\n");
    sb.append("    isFlexibleDailyBudgets: ").append(toIndentedString(isFlexibleDailyBudgets)).append("\n");
    sb.append("    isLtvOptimized: ").append(toIndentedString(isLtvOptimized)).append("\n");
    sb.append("    isPerformancePlus: ").append(toIndentedString(isPerformancePlus)).append("\n");
    sb.append("    isTopOfSearch: ").append(toIndentedString(isTopOfSearch)).append("\n");
    sb.append("    lifetimeSpendCap: ").append(toIndentedString(lifetimeSpendCap)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    objectiveType: ").append(toIndentedString(objectiveType)).append("\n");
    sb.append("    orderLineId: ").append(toIndentedString(orderLineId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    trackingUrls: ").append(toIndentedString(trackingUrls)).append("\n");
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

