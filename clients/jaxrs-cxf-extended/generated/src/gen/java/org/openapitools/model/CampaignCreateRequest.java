package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CampaignBidOptionsCreate;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.IntendedPromotionType;
import org.openapitools.model.ObjectiveType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CampaignCreateRequest  {
  
  @ApiModelProperty(value = "")
  @Valid
  private CampaignBidOptionsCreate bidOptions;

  @ApiModelProperty(value = "")
  @Valid
  private IntendedPromotionType intendedPromotionType;

 /**
  * Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - CATALOG\\_SALES
  */
  @ApiModelProperty(value = "Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - CATALOG\\_SALES")
  private Boolean isAutomatedCampaign;

 /**
  * Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.
  */
  @ApiModelProperty(value = "Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.")
  private Boolean isCampaignBudgetOptimization;

 /**
  * Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.
  */
  @ApiModelProperty(value = "Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.")
  private Boolean isFlexibleDailyBudgets;

 /**
  * Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
  */
  @ApiModelProperty(value = "Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.")
  private Boolean isLtvOptimized;

 /**
  * Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>.
  */
  @ApiModelProperty(value = "Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>.")
  private Boolean isPerformancePlus = false;

 /**
  * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a>  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives: `CONSIDERATION` `WEB_CONVERSION` `CATALOG_SALES`  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.  You cannot change your `true` or `false` selection of this campaign if you <a href=\"https://developer.pinterest.com/docs/api/v5/campaigns-update\" target=\"blank\">update it</a>.
  */
  @ApiModelProperty(value = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a>  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives: `CONSIDERATION` `WEB_CONVERSION` `CATALOG_SALES`  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.  You cannot change your `true` or `false` selection of this campaign if you <a href=\"https://developer.pinterest.com/docs/api/v5/campaigns-update\" target=\"blank\">update it</a>.")
  private Boolean isTopOfSearch = false;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private ObjectiveType objectiveType;

  @ApiModelProperty(value = "")
  @Valid
  private EntityStatus status;

 /**
  * Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
  */
  @ApiModelProperty(example = "549755885175", required = true, value = "Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.")
  private String adAccountId;

 /**
  * Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
  */
  @ApiModelProperty(example = "1432744744", value = "Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.")
  private Integer dailySpendCap;

 /**
  * When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
  */
  @ApiModelProperty(value = "When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.")
  private Integer defaultAdGroupBudgetInMicroCurrency;

 /**
  * Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
  */
  @ApiModelProperty(example = "1644023526", value = "Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.")
  private Integer endTime;

 /**
  * Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
  */
  @ApiModelProperty(example = "1432744744", value = "Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.")
  private Integer lifetimeSpendCap;

 /**
  * Campaign name.
  */
  @ApiModelProperty(example = "ACME Tools", required = true, value = "Campaign name.")
  private String name;

 /**
  * Order line ID that appears on the invoice.
  */
  @ApiModelProperty(example = "549755885175", value = "Order line ID that appears on the invoice.")
  private String orderLineId;

 /**
  * Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
  */
  @ApiModelProperty(example = "1580865126", value = "Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.")
  private Integer startTime;

  @ApiModelProperty(value = "")
  private Object trackingUrls;
 /**
  * Get bidOptions
  * @return bidOptions
  */
  @JsonProperty("bid_options")
  public CampaignBidOptionsCreate getBidOptions() {
    return bidOptions;
  }

  /**
   * Sets the <code>bidOptions</code> property.
   */
 public void setBidOptions(CampaignBidOptionsCreate bidOptions) {
    this.bidOptions = bidOptions;
  }

  /**
   * Sets the <code>bidOptions</code> property.
   */
  public CampaignCreateRequest bidOptions(CampaignBidOptionsCreate bidOptions) {
    this.bidOptions = bidOptions;
    return this;
  }

 /**
  * Get intendedPromotionType
  * @return intendedPromotionType
  */
  @JsonProperty("intended_promotion_type")
  public IntendedPromotionType getIntendedPromotionType() {
    return intendedPromotionType;
  }

  /**
   * Sets the <code>intendedPromotionType</code> property.
   */
 public void setIntendedPromotionType(IntendedPromotionType intendedPromotionType) {
    this.intendedPromotionType = intendedPromotionType;
  }

  /**
   * Sets the <code>intendedPromotionType</code> property.
   */
  public CampaignCreateRequest intendedPromotionType(IntendedPromotionType intendedPromotionType) {
    this.intendedPromotionType = intendedPromotionType;
    return this;
  }

 /**
  * Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - CATALOG\\_SALES
  * @return isAutomatedCampaign
  */
  @JsonProperty("is_automated_campaign")
  public Boolean getIsAutomatedCampaign() {
    return isAutomatedCampaign;
  }

  /**
   * Sets the <code>isAutomatedCampaign</code> property.
   */
 public void setIsAutomatedCampaign(Boolean isAutomatedCampaign) {
    this.isAutomatedCampaign = isAutomatedCampaign;
  }

  /**
   * Sets the <code>isAutomatedCampaign</code> property.
   */
  public CampaignCreateRequest isAutomatedCampaign(Boolean isAutomatedCampaign) {
    this.isAutomatedCampaign = isAutomatedCampaign;
    return this;
  }

 /**
  * Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.
  * @return isCampaignBudgetOptimization
  */
  @JsonProperty("is_campaign_budget_optimization")
  public Boolean getIsCampaignBudgetOptimization() {
    return isCampaignBudgetOptimization;
  }

  /**
   * Sets the <code>isCampaignBudgetOptimization</code> property.
   */
 public void setIsCampaignBudgetOptimization(Boolean isCampaignBudgetOptimization) {
    this.isCampaignBudgetOptimization = isCampaignBudgetOptimization;
  }

  /**
   * Sets the <code>isCampaignBudgetOptimization</code> property.
   */
  public CampaignCreateRequest isCampaignBudgetOptimization(Boolean isCampaignBudgetOptimization) {
    this.isCampaignBudgetOptimization = isCampaignBudgetOptimization;
    return this;
  }

 /**
  * Determine if a campaign has setup for flexible daily budgets, also known as \&quot;Pinterest Performance+ budgets\&quot;. Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.
  * @return isFlexibleDailyBudgets
  */
  @JsonProperty("is_flexible_daily_budgets")
  public Boolean getIsFlexibleDailyBudgets() {
    return isFlexibleDailyBudgets;
  }

  /**
   * Sets the <code>isFlexibleDailyBudgets</code> property.
   */
 public void setIsFlexibleDailyBudgets(Boolean isFlexibleDailyBudgets) {
    this.isFlexibleDailyBudgets = isFlexibleDailyBudgets;
  }

  /**
   * Sets the <code>isFlexibleDailyBudgets</code> property.
   */
  public CampaignCreateRequest isFlexibleDailyBudgets(Boolean isFlexibleDailyBudgets) {
    this.isFlexibleDailyBudgets = isFlexibleDailyBudgets;
    return this;
  }

 /**
  * Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
  * @return isLtvOptimized
  */
  @JsonProperty("is_ltv_optimized")
  public Boolean getIsLtvOptimized() {
    return isLtvOptimized;
  }

  /**
   * Sets the <code>isLtvOptimized</code> property.
   */
 public void setIsLtvOptimized(Boolean isLtvOptimized) {
    this.isLtvOptimized = isLtvOptimized;
  }

  /**
   * Sets the <code>isLtvOptimized</code> property.
   */
  public CampaignCreateRequest isLtvOptimized(Boolean isLtvOptimized) {
    this.isLtvOptimized = isLtvOptimized;
    return this;
  }

 /**
  * Enable Pinterest Performance+ for your campaign. To learn more, see &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\&quot;&gt;Pinterest Performance+ Setup&lt;/a&gt;.
  * @return isPerformancePlus
  */
  @JsonProperty("is_performance_plus")
  public Boolean getIsPerformancePlus() {
    return isPerformancePlus;
  }

  /**
   * Sets the <code>isPerformancePlus</code> property.
   */
 public void setIsPerformancePlus(Boolean isPerformancePlus) {
    this.isPerformancePlus = isPerformancePlus;
  }

  /**
   * Sets the <code>isPerformancePlus</code> property.
   */
  public CampaignCreateRequest isPerformancePlus(Boolean isPerformancePlus) {
    this.isPerformancePlus = isPerformancePlus;
    return this;
  }

 /**
  * &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt;  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives: &#x60;CONSIDERATION&#x60; &#x60;WEB_CONVERSION&#x60; &#x60;CATALOG_SALES&#x60;  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.  You cannot change your &#x60;true&#x60; or &#x60;false&#x60; selection of this campaign if you &lt;a href&#x3D;\&quot;https://developer.pinterest.com/docs/api/v5/campaigns-update\&quot; target&#x3D;\&quot;blank\&quot;&gt;update it&lt;/a&gt;.
  * @return isTopOfSearch
  */
  @JsonProperty("is_top_of_search")
  public Boolean getIsTopOfSearch() {
    return isTopOfSearch;
  }

  /**
   * Sets the <code>isTopOfSearch</code> property.
   */
 public void setIsTopOfSearch(Boolean isTopOfSearch) {
    this.isTopOfSearch = isTopOfSearch;
  }

  /**
   * Sets the <code>isTopOfSearch</code> property.
   */
  public CampaignCreateRequest isTopOfSearch(Boolean isTopOfSearch) {
    this.isTopOfSearch = isTopOfSearch;
    return this;
  }

 /**
  * Get objectiveType
  * @return objectiveType
  */
  @JsonProperty("objective_type")
  @NotNull
  public ObjectiveType getObjectiveType() {
    return objectiveType;
  }

  /**
   * Sets the <code>objectiveType</code> property.
   */
 public void setObjectiveType(ObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
  }

  /**
   * Sets the <code>objectiveType</code> property.
   */
  public CampaignCreateRequest objectiveType(ObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

 /**
  * Get status
  * @return status
  */
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(EntityStatus status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
  public CampaignCreateRequest status(EntityStatus status) {
    this.status = status;
    return this;
  }

 /**
  * Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
  * @return adAccountId
  */
  @JsonProperty("ad_account_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getAdAccountId() {
    return adAccountId;
  }

  /**
   * Sets the <code>adAccountId</code> property.
   */
 public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Sets the <code>adAccountId</code> property.
   */
  public CampaignCreateRequest adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

 /**
  * Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time.
  * @return dailySpendCap
  */
  @JsonProperty("daily_spend_cap")
  public Integer getDailySpendCap() {
    return dailySpendCap;
  }

  /**
   * Sets the <code>dailySpendCap</code> property.
   */
 public void setDailySpendCap(Integer dailySpendCap) {
    this.dailySpendCap = dailySpendCap;
  }

  /**
   * Sets the <code>dailySpendCap</code> property.
   */
  public CampaignCreateRequest dailySpendCap(Integer dailySpendCap) {
    this.dailySpendCap = dailySpendCap;
    return this;
  }

 /**
  * When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
  * @return defaultAdGroupBudgetInMicroCurrency
  */
  @JsonProperty("default_ad_group_budget_in_micro_currency")
  public Integer getDefaultAdGroupBudgetInMicroCurrency() {
    return defaultAdGroupBudgetInMicroCurrency;
  }

  /**
   * Sets the <code>defaultAdGroupBudgetInMicroCurrency</code> property.
   */
 public void setDefaultAdGroupBudgetInMicroCurrency(Integer defaultAdGroupBudgetInMicroCurrency) {
    this.defaultAdGroupBudgetInMicroCurrency = defaultAdGroupBudgetInMicroCurrency;
  }

  /**
   * Sets the <code>defaultAdGroupBudgetInMicroCurrency</code> property.
   */
  public CampaignCreateRequest defaultAdGroupBudgetInMicroCurrency(Integer defaultAdGroupBudgetInMicroCurrency) {
    this.defaultAdGroupBudgetInMicroCurrency = defaultAdGroupBudgetInMicroCurrency;
    return this;
  }

 /**
  * Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If &#x60;end_time&#x60; is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to &#x60;paused&#x60;. Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-campaigns/#campaign-scheduling\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling campaigns&lt;/a&gt;. Different end times can be set for the campaign&#39;s child ad groups, but they cannot occur after an &#x60;end_time&#x60; specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an &#x60;end_time&#x60; that is earlier than that of the ad group, the campaign &#x60;end_time&#x60; will supersede the ad group &#x60;end_time&#x60;, and the request will not return an error. - In this scenario, if you call &lt;a href&#x3D;\&quot;/docs/api/v5/campaigns-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List campaigns&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/api/v5/ad_groups-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List ad groups&lt;/a&gt;, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
  * @return endTime
  */
  @JsonProperty("end_time")
  public Integer getEndTime() {
    return endTime;
  }

  /**
   * Sets the <code>endTime</code> property.
   */
 public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  /**
   * Sets the <code>endTime</code> property.
   */
  public CampaignCreateRequest endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

 /**
  * Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time.
  * @return lifetimeSpendCap
  */
  @JsonProperty("lifetime_spend_cap")
  public Integer getLifetimeSpendCap() {
    return lifetimeSpendCap;
  }

  /**
   * Sets the <code>lifetimeSpendCap</code> property.
   */
 public void setLifetimeSpendCap(Integer lifetimeSpendCap) {
    this.lifetimeSpendCap = lifetimeSpendCap;
  }

  /**
   * Sets the <code>lifetimeSpendCap</code> property.
   */
  public CampaignCreateRequest lifetimeSpendCap(Integer lifetimeSpendCap) {
    this.lifetimeSpendCap = lifetimeSpendCap;
    return this;
  }

 /**
  * Campaign name.
  * @return name
  */
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public CampaignCreateRequest name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Order line ID that appears on the invoice.
  * @return orderLineId
  */
  @JsonProperty("order_line_id")
 @Pattern(regexp="^\\d+$")  public String getOrderLineId() {
    return orderLineId;
  }

  /**
   * Sets the <code>orderLineId</code> property.
   */
 public void setOrderLineId(String orderLineId) {
    this.orderLineId = orderLineId;
  }

  /**
   * Sets the <code>orderLineId</code> property.
   */
  public CampaignCreateRequest orderLineId(String orderLineId) {
    this.orderLineId = orderLineId;
    return this;
  }

 /**
  * Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-campaigns/#campaign-scheduling\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling campaigns&lt;/a&gt;. Different start times can be set for the campaign&#39;s child ad groups, but they cannot occur before a &#x60;start_time&#x60; specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a &#x60;start_time&#x60; that is later than that of the ad group, the campaign &#x60;start_time&#x60; will supersede the ad group &#x60;start_time&#x60;, and the request will not return an error. - In this scenario, if you call &lt;a href&#x3D;\&quot;/docs/api/v5/campaigns-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List campaigns&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/api/v5/ad_groups-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List ad groups&lt;/a&gt;, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
  * @return startTime
  */
  @JsonProperty("start_time")
  public Integer getStartTime() {
    return startTime;
  }

  /**
   * Sets the <code>startTime</code> property.
   */
 public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  /**
   * Sets the <code>startTime</code> property.
   */
  public CampaignCreateRequest startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

 /**
  * Get trackingUrls
  * @return trackingUrls
  */
  @JsonProperty("tracking_urls")
  public Object getTrackingUrls() {
    return trackingUrls;
  }

  /**
   * Sets the <code>trackingUrls</code> property.
   */
 public void setTrackingUrls(Object trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  /**
   * Sets the <code>trackingUrls</code> property.
   */
  public CampaignCreateRequest trackingUrls(Object trackingUrls) {
    this.trackingUrls = trackingUrls;
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
    CampaignCreateRequest campaignCreateRequest = (CampaignCreateRequest) o;
    return Objects.equals(this.bidOptions, campaignCreateRequest.bidOptions) &&
        Objects.equals(this.intendedPromotionType, campaignCreateRequest.intendedPromotionType) &&
        Objects.equals(this.isAutomatedCampaign, campaignCreateRequest.isAutomatedCampaign) &&
        Objects.equals(this.isCampaignBudgetOptimization, campaignCreateRequest.isCampaignBudgetOptimization) &&
        Objects.equals(this.isFlexibleDailyBudgets, campaignCreateRequest.isFlexibleDailyBudgets) &&
        Objects.equals(this.isLtvOptimized, campaignCreateRequest.isLtvOptimized) &&
        Objects.equals(this.isPerformancePlus, campaignCreateRequest.isPerformancePlus) &&
        Objects.equals(this.isTopOfSearch, campaignCreateRequest.isTopOfSearch) &&
        Objects.equals(this.objectiveType, campaignCreateRequest.objectiveType) &&
        Objects.equals(this.status, campaignCreateRequest.status) &&
        Objects.equals(this.adAccountId, campaignCreateRequest.adAccountId) &&
        Objects.equals(this.dailySpendCap, campaignCreateRequest.dailySpendCap) &&
        Objects.equals(this.defaultAdGroupBudgetInMicroCurrency, campaignCreateRequest.defaultAdGroupBudgetInMicroCurrency) &&
        Objects.equals(this.endTime, campaignCreateRequest.endTime) &&
        Objects.equals(this.lifetimeSpendCap, campaignCreateRequest.lifetimeSpendCap) &&
        Objects.equals(this.name, campaignCreateRequest.name) &&
        Objects.equals(this.orderLineId, campaignCreateRequest.orderLineId) &&
        Objects.equals(this.startTime, campaignCreateRequest.startTime) &&
        Objects.equals(this.trackingUrls, campaignCreateRequest.trackingUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidOptions, intendedPromotionType, isAutomatedCampaign, isCampaignBudgetOptimization, isFlexibleDailyBudgets, isLtvOptimized, isPerformancePlus, isTopOfSearch, objectiveType, status, adAccountId, dailySpendCap, defaultAdGroupBudgetInMicroCurrency, endTime, lifetimeSpendCap, name, orderLineId, startTime, trackingUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignCreateRequest {\n");
    
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
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    dailySpendCap: ").append(toIndentedString(dailySpendCap)).append("\n");
    sb.append("    defaultAdGroupBudgetInMicroCurrency: ").append(toIndentedString(defaultAdGroupBudgetInMicroCurrency)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    lifetimeSpendCap: ").append(toIndentedString(lifetimeSpendCap)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orderLineId: ").append(toIndentedString(orderLineId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    trackingUrls: ").append(toIndentedString(trackingUrls)).append("\n");
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

