package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.CampaignBidOptionsUpdate;
import org.openapitools.server.model.EntityStatus;
import org.openapitools.server.model.IntendedPromotionType;
import org.openapitools.server.model.ObjectiveType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CampaignUpdateRequest   {

    private CampaignBidOptionsUpdate bidOptions;
    private IntendedPromotionType intendedPromotionType;
    private Boolean isLtvOptimized;
    private Boolean isPerformancePlus;
    private Boolean isTopOfSearch;
    private ObjectiveType objectiveType;
    private String adAccountId;
    private Integer dailySpendCap;
    private Integer defaultAdGroupBudgetInMicroCurrency;
    private Integer endTime;
    private String id;
    private Boolean isAutomatedCampaign;
    private Boolean isCampaignBudgetOptimization;
    private Boolean isFlexibleDailyBudgets;
    private Integer lifetimeSpendCap;
    private String name;
    private String orderLineId;
    private Integer startTime;
    private EntityStatus status;
    private Object trackingUrls;

    /**
     * Default constructor.
     */
    public CampaignUpdateRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create CampaignUpdateRequest.
     *
     * @param bidOptions bidOptions
     * @param intendedPromotionType intendedPromotionType
     * @param isLtvOptimized Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
     * @param isPerformancePlus Enable Pinterest Performance+ for your campaign. To learn more, see &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\&quot;&gt;Pinterest Performance+ Setup&lt;/a&gt;. This field is immutable, except only for campaigns in draft status which may update this field.
     * @param isTopOfSearch Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field.
     * @param objectiveType objectiveType
     * @param adAccountId Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
     * @param dailySpendCap Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time.
     * @param defaultAdGroupBudgetInMicroCurrency When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
     * @param endTime Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If &#x60;end_time&#x60; is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to &#x60;paused&#x60;. Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-campaigns/#campaign-scheduling\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling campaigns&lt;/a&gt;. Different end times can be set for the campaign&#39;s child ad groups, but they cannot occur after an &#x60;end_time&#x60; specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an &#x60;end_time&#x60; that is earlier than that of the ad group, the campaign &#x60;end_time&#x60; will supersede the ad group &#x60;end_time&#x60;, and the request will not return an error. - In this scenario, if you call &lt;a href&#x3D;\&quot;/docs/api/v5/campaigns-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List campaigns&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/api/v5/ad_groups-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List ad groups&lt;/a&gt;, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
     * @param id Campaign ID.
     * @param isAutomatedCampaign Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - CATALOG\\_SALES
     * @param isCampaignBudgetOptimization Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.
     * @param isFlexibleDailyBudgets Determine if a campaign has setup for flexible daily budgets, also known as \&quot;Pinterest Performance+ budgets\&quot;. Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.
     * @param lifetimeSpendCap Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time.
     * @param name Campaign name.
     * @param orderLineId Order line ID that appears on the invoice.
     * @param startTime Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-campaigns/#campaign-scheduling\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling campaigns&lt;/a&gt;. Different start times can be set for the campaign&#39;s child ad groups, but they cannot occur before a &#x60;start_time&#x60; specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a &#x60;start_time&#x60; that is later than that of the ad group, the campaign &#x60;start_time&#x60; will supersede the ad group &#x60;start_time&#x60;, and the request will not return an error. - In this scenario, if you call &lt;a href&#x3D;\&quot;/docs/api/v5/campaigns-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List campaigns&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/api/v5/ad_groups-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List ad groups&lt;/a&gt;, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
     * @param status status
     * @param trackingUrls trackingUrls
     */
    public CampaignUpdateRequest(
        CampaignBidOptionsUpdate bidOptions, 
        IntendedPromotionType intendedPromotionType, 
        Boolean isLtvOptimized, 
        Boolean isPerformancePlus, 
        Boolean isTopOfSearch, 
        ObjectiveType objectiveType, 
        String adAccountId, 
        Integer dailySpendCap, 
        Integer defaultAdGroupBudgetInMicroCurrency, 
        Integer endTime, 
        String id, 
        Boolean isAutomatedCampaign, 
        Boolean isCampaignBudgetOptimization, 
        Boolean isFlexibleDailyBudgets, 
        Integer lifetimeSpendCap, 
        String name, 
        String orderLineId, 
        Integer startTime, 
        EntityStatus status, 
        Object trackingUrls
    ) {
        this.bidOptions = bidOptions;
        this.intendedPromotionType = intendedPromotionType;
        this.isLtvOptimized = isLtvOptimized;
        this.isPerformancePlus = isPerformancePlus;
        this.isTopOfSearch = isTopOfSearch;
        this.objectiveType = objectiveType;
        this.adAccountId = adAccountId;
        this.dailySpendCap = dailySpendCap;
        this.defaultAdGroupBudgetInMicroCurrency = defaultAdGroupBudgetInMicroCurrency;
        this.endTime = endTime;
        this.id = id;
        this.isAutomatedCampaign = isAutomatedCampaign;
        this.isCampaignBudgetOptimization = isCampaignBudgetOptimization;
        this.isFlexibleDailyBudgets = isFlexibleDailyBudgets;
        this.lifetimeSpendCap = lifetimeSpendCap;
        this.name = name;
        this.orderLineId = orderLineId;
        this.startTime = startTime;
        this.status = status;
        this.trackingUrls = trackingUrls;
    }



    /**
     * Get bidOptions
     * @return bidOptions
     */
    public CampaignBidOptionsUpdate getBidOptions() {
        return bidOptions;
    }

    public void setBidOptions(CampaignBidOptionsUpdate bidOptions) {
        this.bidOptions = bidOptions;
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
     * Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>. This field is immutable, except only for campaigns in draft status which may update this field.
     * @return isPerformancePlus
     */
    public Boolean getIsPerformancePlus() {
        return isPerformancePlus;
    }

    public void setIsPerformancePlus(Boolean isPerformancePlus) {
        this.isPerformancePlus = isPerformancePlus;
    }

    /**
     * Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field.
     * @return isTopOfSearch
     */
    public Boolean getIsTopOfSearch() {
        return isTopOfSearch;
    }

    public void setIsTopOfSearch(Boolean isTopOfSearch) {
        this.isTopOfSearch = isTopOfSearch;
    }

    /**
     * Get objectiveType
     * @return objectiveType
     */
    public ObjectiveType getObjectiveType() {
        return objectiveType;
    }

    public void setObjectiveType(ObjectiveType objectiveType) {
        this.objectiveType = objectiveType;
    }

    /**
     * Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
     * @return adAccountId
     */
    public String getAdAccountId() {
        return adAccountId;
    }

    public void setAdAccountId(String adAccountId) {
        this.adAccountId = adAccountId;
    }

    /**
     * Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
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
     * Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
     * @return endTime
     */
    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    /**
     * Campaign ID.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - CATALOG\\_SALES
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
     * Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
     * @return lifetimeSpendCap
     */
    public Integer getLifetimeSpendCap() {
        return lifetimeSpendCap;
    }

    public void setLifetimeSpendCap(Integer lifetimeSpendCap) {
        this.lifetimeSpendCap = lifetimeSpendCap;
    }

    /**
     * Campaign name.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Order line ID that appears on the invoice.
     * @return orderLineId
     */
    public String getOrderLineId() {
        return orderLineId;
    }

    public void setOrderLineId(String orderLineId) {
        this.orderLineId = orderLineId;
    }

    /**
     * Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
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
     * Get trackingUrls
     * @return trackingUrls
     */
    public Object getTrackingUrls() {
        return trackingUrls;
    }

    public void setTrackingUrls(Object trackingUrls) {
        this.trackingUrls = trackingUrls;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CampaignUpdateRequest {\n");
        
        sb.append("    bidOptions: ").append(toIndentedString(bidOptions)).append("\n");
        sb.append("    intendedPromotionType: ").append(toIndentedString(intendedPromotionType)).append("\n");
        sb.append("    isLtvOptimized: ").append(toIndentedString(isLtvOptimized)).append("\n");
        sb.append("    isPerformancePlus: ").append(toIndentedString(isPerformancePlus)).append("\n");
        sb.append("    isTopOfSearch: ").append(toIndentedString(isTopOfSearch)).append("\n");
        sb.append("    objectiveType: ").append(toIndentedString(objectiveType)).append("\n");
        sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
        sb.append("    dailySpendCap: ").append(toIndentedString(dailySpendCap)).append("\n");
        sb.append("    defaultAdGroupBudgetInMicroCurrency: ").append(toIndentedString(defaultAdGroupBudgetInMicroCurrency)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isAutomatedCampaign: ").append(toIndentedString(isAutomatedCampaign)).append("\n");
        sb.append("    isCampaignBudgetOptimization: ").append(toIndentedString(isCampaignBudgetOptimization)).append("\n");
        sb.append("    isFlexibleDailyBudgets: ").append(toIndentedString(isFlexibleDailyBudgets)).append("\n");
        sb.append("    lifetimeSpendCap: ").append(toIndentedString(lifetimeSpendCap)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

