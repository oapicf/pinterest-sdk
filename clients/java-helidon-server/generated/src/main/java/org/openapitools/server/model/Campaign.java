package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.CampaignBidOptions;
import org.openapitools.server.model.CampaignObjectiveType;
import org.openapitools.server.model.EntityStatus;
import org.openapitools.server.model.IntendedPromotionType;
import org.openapitools.server.model.PerformancePlusCampaignSettings;
import org.openapitools.server.model.SummaryStatus;
import org.openapitools.server.model.TrackingUrls;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class Campaign   {

    private String adAccountId;
    private CampaignBidOptions bidOptions;
    private Integer createdTime;
    private Integer dailySpendCap;
    private Integer defaultAdGroupBudgetInMicroCurrency;
    private Integer endTime;
    private String id;
    private IntendedPromotionType intendedPromotionType;
    private Boolean isAutomatedCampaign;
    private Boolean isCampaignBudgetOptimization;
    private Boolean isCarting;
    private Boolean isFlexibleDailyBudgets;
    private Boolean isLtvOptimized;
    private Boolean isPerformancePlus;
    private Boolean isTopOfSearch;
    private Integer lifetimeSpendCap;
    private String name;
    private CampaignObjectiveType objectiveType;
    private String orderLineId;
    private PerformancePlusCampaignSettings performancePlusCampaignSettings;
    private Integer startTime;
    private EntityStatus status;
    private SummaryStatus summaryStatus;
    private TrackingUrls trackingUrls;
    private String type;
    private Integer updatedTime;

    /**
     * Default constructor.
     */
    public Campaign() {
    // JSON-B / Jackson
    }

    /**
     * Create Campaign.
     *
     * @param adAccountId Campaign&#39;s Advertiser ID.
     * @param bidOptions [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Object describing the campaign level bid multipliers.
     * @param createdTime Campaign creation time. Unix timestamp in seconds.
     * @param dailySpendCap Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.
     * @param defaultAdGroupBudgetInMicroCurrency When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
     * @param endTime Note: To clear this field on update, set the end time to -1. Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If &#x60;end_time&#x60; is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to &#x60;paused&#x60;. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different end times can be set for the campaign&#39;s child ad groups, but they cannot occur after an &#x60;end_time&#x60; specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an &#x60;end_time&#x60; that is earlier than that of the ad group, the campaign &#x60;end_time&#x60; will supersede the ad group &#x60;end_time&#x60;, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
     * @param id Campaign ID, must be associated with the ad account ID provided in the path.
     * @param intendedPromotionType intendedPromotionType
     * @param isAutomatedCampaign Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES
     * @param isCampaignBudgetOptimization Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.
     * @param isCarting Whether the campaign contains a carting(where-to-buy link) ad.
     * @param isFlexibleDailyBudgets Determine if a campaign has setup for flexible daily budgets, also known as \&quot;Pinterest Performance+ budgets\&quot;. Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.
     * @param isLtvOptimized Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
     * @param isPerformancePlus Note: This field is immutable unless the campaign is in draft status. You can only use this feature with the following objectives: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES - APP\\_INSTALL Enable Pinterest Performance+ for your campaign. To learn more, see [Pinterest Performance+ Setup](https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/)
     * @param isTopOfSearch Note: This field is immutable unless the campaign is in draft status.  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives:  - CONSIDERATION  - WEB\\_CONVERSION  - SALES  - LEADS  - CATALOG\\_SALES  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.
     * @param lifetimeSpendCap Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.
     * @param name Campaign name - 255 chars max.
     * @param objectiveType objectiveType
     * @param orderLineId Note: To clear this field on update, set the order line ID to 0. Order line ID that appears on the invoice. The order line must not be expired.
     * @param performancePlusCampaignSettings Pinterest Performance+ campaign settings.
     * @param startTime Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different start times can be set for the campaign&#39;s child ad groups, but they cannot occur before a &#x60;start_time&#x60; specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a &#x60;start_time&#x60; that is later than that of the ad group, the campaign &#x60;start_time&#x60; will supersede the ad group &#x60;start_time&#x60;, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
     * @param status status
     * @param summaryStatus summaryStatus
     * @param trackingUrls trackingUrls
     * @param type Always \&quot;campaign\&quot;.
     * @param updatedTime UTC timestamp. Last update time.
     */
    public Campaign(
        String adAccountId, 
        CampaignBidOptions bidOptions, 
        Integer createdTime, 
        Integer dailySpendCap, 
        Integer defaultAdGroupBudgetInMicroCurrency, 
        Integer endTime, 
        String id, 
        IntendedPromotionType intendedPromotionType, 
        Boolean isAutomatedCampaign, 
        Boolean isCampaignBudgetOptimization, 
        Boolean isCarting, 
        Boolean isFlexibleDailyBudgets, 
        Boolean isLtvOptimized, 
        Boolean isPerformancePlus, 
        Boolean isTopOfSearch, 
        Integer lifetimeSpendCap, 
        String name, 
        CampaignObjectiveType objectiveType, 
        String orderLineId, 
        PerformancePlusCampaignSettings performancePlusCampaignSettings, 
        Integer startTime, 
        EntityStatus status, 
        SummaryStatus summaryStatus, 
        TrackingUrls trackingUrls, 
        String type, 
        Integer updatedTime
    ) {
        this.adAccountId = adAccountId;
        this.bidOptions = bidOptions;
        this.createdTime = createdTime;
        this.dailySpendCap = dailySpendCap;
        this.defaultAdGroupBudgetInMicroCurrency = defaultAdGroupBudgetInMicroCurrency;
        this.endTime = endTime;
        this.id = id;
        this.intendedPromotionType = intendedPromotionType;
        this.isAutomatedCampaign = isAutomatedCampaign;
        this.isCampaignBudgetOptimization = isCampaignBudgetOptimization;
        this.isCarting = isCarting;
        this.isFlexibleDailyBudgets = isFlexibleDailyBudgets;
        this.isLtvOptimized = isLtvOptimized;
        this.isPerformancePlus = isPerformancePlus;
        this.isTopOfSearch = isTopOfSearch;
        this.lifetimeSpendCap = lifetimeSpendCap;
        this.name = name;
        this.objectiveType = objectiveType;
        this.orderLineId = orderLineId;
        this.performancePlusCampaignSettings = performancePlusCampaignSettings;
        this.startTime = startTime;
        this.status = status;
        this.summaryStatus = summaryStatus;
        this.trackingUrls = trackingUrls;
        this.type = type;
        this.updatedTime = updatedTime;
    }



    /**
     * Campaign's Advertiser ID.
     * @return adAccountId
     */
    public String getAdAccountId() {
        return adAccountId;
    }

    public void setAdAccountId(String adAccountId) {
        this.adAccountId = adAccountId;
    }

    /**
     * [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Object describing the campaign level bid multipliers.
     * @return bidOptions
     */
    public CampaignBidOptions getBidOptions() {
        return bidOptions;
    }

    public void setBidOptions(CampaignBidOptions bidOptions) {
        this.bidOptions = bidOptions;
    }

    /**
     * Campaign creation time. Unix timestamp in seconds.
     * @return createdTime
     */
    public Integer getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Integer createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.
     * @return dailySpendCap
     */
    public Integer getDailySpendCap() {
        return dailySpendCap;
    }

    public void setDailySpendCap(Integer dailySpendCap) {
        this.dailySpendCap = dailySpendCap;
    }

    /**
     * When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
     * @return defaultAdGroupBudgetInMicroCurrency
     */
    public Integer getDefaultAdGroupBudgetInMicroCurrency() {
        return defaultAdGroupBudgetInMicroCurrency;
    }

    public void setDefaultAdGroupBudgetInMicroCurrency(Integer defaultAdGroupBudgetInMicroCurrency) {
        this.defaultAdGroupBudgetInMicroCurrency = defaultAdGroupBudgetInMicroCurrency;
    }

    /**
     * Note: To clear this field on update, set the end time to -1. Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
     * @return endTime
     */
    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    /**
     * Campaign ID, must be associated with the ad account ID provided in the path.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Get intendedPromotionType
     * @return intendedPromotionType
     */
    public IntendedPromotionType getIntendedPromotionType() {
        return intendedPromotionType;
    }

    public void setIntendedPromotionType(IntendedPromotionType intendedPromotionType) {
        this.intendedPromotionType = intendedPromotionType;
    }

    /**
     * Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES
     * @return isAutomatedCampaign
     */
    public Boolean getIsAutomatedCampaign() {
        return isAutomatedCampaign;
    }

    public void setIsAutomatedCampaign(Boolean isAutomatedCampaign) {
        this.isAutomatedCampaign = isAutomatedCampaign;
    }

    /**
     * Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.
     * @return isCampaignBudgetOptimization
     */
    public Boolean getIsCampaignBudgetOptimization() {
        return isCampaignBudgetOptimization;
    }

    public void setIsCampaignBudgetOptimization(Boolean isCampaignBudgetOptimization) {
        this.isCampaignBudgetOptimization = isCampaignBudgetOptimization;
    }

    /**
     * Whether the campaign contains a carting(where-to-buy link) ad.
     * @return isCarting
     */
    public Boolean getIsCarting() {
        return isCarting;
    }

    public void setIsCarting(Boolean isCarting) {
        this.isCarting = isCarting;
    }

    /**
     * Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.
     * @return isFlexibleDailyBudgets
     */
    public Boolean getIsFlexibleDailyBudgets() {
        return isFlexibleDailyBudgets;
    }

    public void setIsFlexibleDailyBudgets(Boolean isFlexibleDailyBudgets) {
        this.isFlexibleDailyBudgets = isFlexibleDailyBudgets;
    }

    /**
     * Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
     * @return isLtvOptimized
     */
    public Boolean getIsLtvOptimized() {
        return isLtvOptimized;
    }

    public void setIsLtvOptimized(Boolean isLtvOptimized) {
        this.isLtvOptimized = isLtvOptimized;
    }

    /**
     * Note: This field is immutable unless the campaign is in draft status. You can only use this feature with the following objectives: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES - APP\\_INSTALL Enable Pinterest Performance+ for your campaign. To learn more, see [Pinterest Performance+ Setup](https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/)
     * @return isPerformancePlus
     */
    public Boolean getIsPerformancePlus() {
        return isPerformancePlus;
    }

    public void setIsPerformancePlus(Boolean isPerformancePlus) {
        this.isPerformancePlus = isPerformancePlus;
    }

    /**
     * Note: This field is immutable unless the campaign is in draft status.  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives:  - CONSIDERATION  - WEB\\_CONVERSION  - SALES  - LEADS  - CATALOG\\_SALES  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.
     * @return isTopOfSearch
     */
    public Boolean getIsTopOfSearch() {
        return isTopOfSearch;
    }

    public void setIsTopOfSearch(Boolean isTopOfSearch) {
        this.isTopOfSearch = isTopOfSearch;
    }

    /**
     * Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.
     * @return lifetimeSpendCap
     */
    public Integer getLifetimeSpendCap() {
        return lifetimeSpendCap;
    }

    public void setLifetimeSpendCap(Integer lifetimeSpendCap) {
        this.lifetimeSpendCap = lifetimeSpendCap;
    }

    /**
     * Campaign name - 255 chars max.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get objectiveType
     * @return objectiveType
     */
    public CampaignObjectiveType getObjectiveType() {
        return objectiveType;
    }

    public void setObjectiveType(CampaignObjectiveType objectiveType) {
        this.objectiveType = objectiveType;
    }

    /**
     * Note: To clear this field on update, set the order line ID to 0. Order line ID that appears on the invoice. The order line must not be expired.
     * @return orderLineId
     */
    public String getOrderLineId() {
        return orderLineId;
    }

    public void setOrderLineId(String orderLineId) {
        this.orderLineId = orderLineId;
    }

    /**
     * Pinterest Performance+ campaign settings.
     * @return performancePlusCampaignSettings
     */
    public PerformancePlusCampaignSettings getPerformancePlusCampaignSettings() {
        return performancePlusCampaignSettings;
    }

    public void setPerformancePlusCampaignSettings(PerformancePlusCampaignSettings performancePlusCampaignSettings) {
        this.performancePlusCampaignSettings = performancePlusCampaignSettings;
    }

    /**
     * Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
     * @return startTime
     */
    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    /**
     * Get status
     * @return status
     */
    public EntityStatus getStatus() {
        return status;
    }

    public void setStatus(EntityStatus status) {
        this.status = status;
    }

    /**
     * Get summaryStatus
     * @return summaryStatus
     */
    public SummaryStatus getSummaryStatus() {
        return summaryStatus;
    }

    public void setSummaryStatus(SummaryStatus summaryStatus) {
        this.summaryStatus = summaryStatus;
    }

    /**
     * Get trackingUrls
     * @return trackingUrls
     */
    public TrackingUrls getTrackingUrls() {
        return trackingUrls;
    }

    public void setTrackingUrls(TrackingUrls trackingUrls) {
        this.trackingUrls = trackingUrls;
    }

    /**
     * Always \"campaign\".
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * UTC timestamp. Last update time.
     * @return updatedTime
     */
    public Integer getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Integer updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Campaign {\n");
        
        sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
        sb.append("    bidOptions: ").append(toIndentedString(bidOptions)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    dailySpendCap: ").append(toIndentedString(dailySpendCap)).append("\n");
        sb.append("    defaultAdGroupBudgetInMicroCurrency: ").append(toIndentedString(defaultAdGroupBudgetInMicroCurrency)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    intendedPromotionType: ").append(toIndentedString(intendedPromotionType)).append("\n");
        sb.append("    isAutomatedCampaign: ").append(toIndentedString(isAutomatedCampaign)).append("\n");
        sb.append("    isCampaignBudgetOptimization: ").append(toIndentedString(isCampaignBudgetOptimization)).append("\n");
        sb.append("    isCarting: ").append(toIndentedString(isCarting)).append("\n");
        sb.append("    isFlexibleDailyBudgets: ").append(toIndentedString(isFlexibleDailyBudgets)).append("\n");
        sb.append("    isLtvOptimized: ").append(toIndentedString(isLtvOptimized)).append("\n");
        sb.append("    isPerformancePlus: ").append(toIndentedString(isPerformancePlus)).append("\n");
        sb.append("    isTopOfSearch: ").append(toIndentedString(isTopOfSearch)).append("\n");
        sb.append("    lifetimeSpendCap: ").append(toIndentedString(lifetimeSpendCap)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    objectiveType: ").append(toIndentedString(objectiveType)).append("\n");
        sb.append("    orderLineId: ").append(toIndentedString(orderLineId)).append("\n");
        sb.append("    performancePlusCampaignSettings: ").append(toIndentedString(performancePlusCampaignSettings)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    summaryStatus: ").append(toIndentedString(summaryStatus)).append("\n");
        sb.append("    trackingUrls: ").append(toIndentedString(trackingUrls)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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

