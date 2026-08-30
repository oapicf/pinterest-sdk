package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.ActionType;
import org.openapitools.server.model.AdGroupTrackingURLs;
import org.openapitools.server.model.AdgroupTrackingFeatures;
import org.openapitools.server.model.BidStrategyType;
import org.openapitools.server.model.ConversionLearningModeType;
import org.openapitools.server.model.EntityStatus;
import org.openapitools.server.model.NullableOptimizationGoalMetadata;
import org.openapitools.server.model.PerformancePlusCampaignSettings;
import org.openapitools.server.model.PlacementGroupType;
import org.openapitools.server.model.PlacementTrafficType;
import org.openapitools.server.model.PromotionApplicationLevel;
import org.openapitools.server.model.SummaryStatus;
import org.openapitools.server.model.TargetingSpecOptimal;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AdGroupBase   {

    private String adAccountId;
    private Integer bidInMicroCurrency;
    private BidStrategyType bidStrategyType;
    private ActionType billableEvent;
    private Integer budgetInMicroCurrency;
    private String campaignId;
    private ConversionLearningModeType conversionLearningModeType;
    private Integer createdTime;
    private String customerSegmentId;
    private Object dcaAssets = null;
    private Integer endTime;
    private AdgroupTrackingFeatures extFeatures;
    private String feedProfileId;
    private String id;
    private Boolean isCreativeOptimization;
    private Boolean isLocalInventory;
    private Integer lifetimeFrequencyCap;
    private BigDecimal localInventoryRadiusInMiles;
    private String name;
    private NullableOptimizationGoalMetadata optimizationGoalMetadata;
    private PerformancePlusCampaignSettings performancePlusCampaignSettings;
    private PlacementGroupType placementGroup;
    private PlacementTrafficType placementTrafficType;
    private PromotionApplicationLevel promotionApplicationLevel;
    private String promotionId = "0";
    private List<String> promotionIds = new ArrayList<>();
    private Integer startTime;
    private EntityStatus status;
    private SummaryStatus summaryStatus;
    private TargetingSpecOptimal targetingSpec;
    private List<@Pattern(regexp = "^\\d+$")String> targetingTemplateIds;
    private AdGroupTrackingURLs trackingUrls;
    private String type = "adgroup";
    private Integer updatedTime;

    /**
     * Default constructor.
     */
    public AdGroupBase() {
    // JSON-B / Jackson
    }

    /**
     * Create AdGroupBase.
     *
     * @param adAccountId Advertiser ID.
     * @param bidInMicroCurrency Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
     * @param bidStrategyType bidStrategyType
     * @param billableEvent billableEvent
     * @param budgetInMicroCurrency Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
     * @param campaignId Campaign ID of the ad group.
     * @param conversionLearningModeType oCPM learn mode
     * @param createdTime Ad group creation time. Unix timestamp in seconds.
     * @param customerSegmentId Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the &#x60;targeting_template_ids&#x60; field as well as the &#x60;AUDIENCE_INCLUDE&#x60; field of the &#x60;targeting_spec&#x60;. To clear the customer segment ID, set this field to &#39;0&#39;.
     * @param dcaAssets [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.
     * @param endTime Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to &#x60;paused&#x60;. Cannot occur after &#x60;end_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO.
     * @param extFeatures extFeatures
     * @param feedProfileId Feed Profile ID associated to the adgroup.
     * @param id Ad group ID.
     * @param isCreativeOptimization Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.
     * @param isLocalInventory Indicates whether the ad group should use the local inventory.
     * @param lifetimeFrequencyCap Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the &#x60;end_time&#x60; field.
     * @param localInventoryRadiusInMiles The targeting radius of the local inventory ads in miles.
     * @param name Ad group name.
     * @param optimizationGoalMetadata Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;.
     * @param performancePlusCampaignSettings Pinterest Performance+ campaign settings.
     * @param placementGroup [Placement group](https://help.pinterest.com/en/business/article/placement-groups).
     * @param placementTrafficType A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both
     * @param promotionApplicationLevel Specify if the promotion is applied at ad group or item level
     * @param promotionId Promotion ID. To clear this field, set to null.
     * @param promotionIds Promotion IDs list. To clear this field, set to an empty array [].
     * @param startTime Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign&#39;s &#x60;start_time&#x60;. Cannot precede &#x60;start_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
     * @param status Ad group/entity status.
     * @param summaryStatus summaryStatus
     * @param targetingSpec targetingSpec
     * @param targetingTemplateIds Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to [&#39;0&#39;].
     * @param trackingUrls trackingUrls
     * @param type Always \&quot;adgroup\&quot;.
     * @param updatedTime Ad group last update time. Unix timestamp in seconds.
     */
    public AdGroupBase(
        String adAccountId, 
        Integer bidInMicroCurrency, 
        BidStrategyType bidStrategyType, 
        ActionType billableEvent, 
        Integer budgetInMicroCurrency, 
        String campaignId, 
        ConversionLearningModeType conversionLearningModeType, 
        Integer createdTime, 
        String customerSegmentId, 
        Object dcaAssets, 
        Integer endTime, 
        AdgroupTrackingFeatures extFeatures, 
        String feedProfileId, 
        String id, 
        Boolean isCreativeOptimization, 
        Boolean isLocalInventory, 
        Integer lifetimeFrequencyCap, 
        BigDecimal localInventoryRadiusInMiles, 
        String name, 
        NullableOptimizationGoalMetadata optimizationGoalMetadata, 
        PerformancePlusCampaignSettings performancePlusCampaignSettings, 
        PlacementGroupType placementGroup, 
        PlacementTrafficType placementTrafficType, 
        PromotionApplicationLevel promotionApplicationLevel, 
        String promotionId, 
        List<String> promotionIds, 
        Integer startTime, 
        EntityStatus status, 
        SummaryStatus summaryStatus, 
        TargetingSpecOptimal targetingSpec, 
        List<@Pattern(regexp = "^\\d+$")String> targetingTemplateIds, 
        AdGroupTrackingURLs trackingUrls, 
        String type, 
        Integer updatedTime
    ) {
        this.adAccountId = adAccountId;
        this.bidInMicroCurrency = bidInMicroCurrency;
        this.bidStrategyType = bidStrategyType;
        this.billableEvent = billableEvent;
        this.budgetInMicroCurrency = budgetInMicroCurrency;
        this.campaignId = campaignId;
        this.conversionLearningModeType = conversionLearningModeType;
        this.createdTime = createdTime;
        this.customerSegmentId = customerSegmentId;
        this.dcaAssets = dcaAssets;
        this.endTime = endTime;
        this.extFeatures = extFeatures;
        this.feedProfileId = feedProfileId;
        this.id = id;
        this.isCreativeOptimization = isCreativeOptimization;
        this.isLocalInventory = isLocalInventory;
        this.lifetimeFrequencyCap = lifetimeFrequencyCap;
        this.localInventoryRadiusInMiles = localInventoryRadiusInMiles;
        this.name = name;
        this.optimizationGoalMetadata = optimizationGoalMetadata;
        this.performancePlusCampaignSettings = performancePlusCampaignSettings;
        this.placementGroup = placementGroup;
        this.placementTrafficType = placementTrafficType;
        this.promotionApplicationLevel = promotionApplicationLevel;
        this.promotionId = promotionId;
        this.promotionIds = promotionIds;
        this.startTime = startTime;
        this.status = status;
        this.summaryStatus = summaryStatus;
        this.targetingSpec = targetingSpec;
        this.targetingTemplateIds = targetingTemplateIds;
        this.trackingUrls = trackingUrls;
        this.type = type;
        this.updatedTime = updatedTime;
    }



    /**
     * Advertiser ID.
     * @return adAccountId
     */
    public String getAdAccountId() {
        return adAccountId;
    }

    public void setAdAccountId(String adAccountId) {
        this.adAccountId = adAccountId;
    }

    /**
     * Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
     * @return bidInMicroCurrency
     */
    public Integer getBidInMicroCurrency() {
        return bidInMicroCurrency;
    }

    public void setBidInMicroCurrency(Integer bidInMicroCurrency) {
        this.bidInMicroCurrency = bidInMicroCurrency;
    }

    /**
     * Get bidStrategyType
     * @return bidStrategyType
     */
    public BidStrategyType getBidStrategyType() {
        return bidStrategyType;
    }

    public void setBidStrategyType(BidStrategyType bidStrategyType) {
        this.bidStrategyType = bidStrategyType;
    }

    /**
     * Get billableEvent
     * @return billableEvent
     */
    public ActionType getBillableEvent() {
        return billableEvent;
    }

    public void setBillableEvent(ActionType billableEvent) {
        this.billableEvent = billableEvent;
    }

    /**
     * Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
     * @return budgetInMicroCurrency
     */
    public Integer getBudgetInMicroCurrency() {
        return budgetInMicroCurrency;
    }

    public void setBudgetInMicroCurrency(Integer budgetInMicroCurrency) {
        this.budgetInMicroCurrency = budgetInMicroCurrency;
    }

    /**
     * Campaign ID of the ad group.
     * @return campaignId
     */
    public String getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * oCPM learn mode
     * @return conversionLearningModeType
     */
    public ConversionLearningModeType getConversionLearningModeType() {
        return conversionLearningModeType;
    }

    public void setConversionLearningModeType(ConversionLearningModeType conversionLearningModeType) {
        this.conversionLearningModeType = conversionLearningModeType;
    }

    /**
     * Ad group creation time. Unix timestamp in seconds.
     * @return createdTime
     */
    public Integer getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Integer createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the `targeting_template_ids` field as well as the `AUDIENCE_INCLUDE` field of the `targeting_spec`. To clear the customer segment ID, set this field to '0'.
     * @return customerSegmentId
     */
    public String getCustomerSegmentId() {
        return customerSegmentId;
    }

    public void setCustomerSegmentId(String customerSegmentId) {
        this.customerSegmentId = customerSegmentId;
    }

    /**
     * [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.
     * @return dcaAssets
     */
    public Object getDcaAssets() {
        return dcaAssets;
    }

    public void setDcaAssets(Object dcaAssets) {
        this.dcaAssets = dcaAssets;
    }

    /**
     * Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO.
     * @return endTime
     */
    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    /**
     * Get extFeatures
     * @return extFeatures
     */
    public AdgroupTrackingFeatures getExtFeatures() {
        return extFeatures;
    }

    public void setExtFeatures(AdgroupTrackingFeatures extFeatures) {
        this.extFeatures = extFeatures;
    }

    /**
     * Feed Profile ID associated to the adgroup.
     * @return feedProfileId
     */
    public String getFeedProfileId() {
        return feedProfileId;
    }

    public void setFeedProfileId(String feedProfileId) {
        this.feedProfileId = feedProfileId;
    }

    /**
     * Ad group ID.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.
     * @return isCreativeOptimization
     */
    public Boolean getIsCreativeOptimization() {
        return isCreativeOptimization;
    }

    public void setIsCreativeOptimization(Boolean isCreativeOptimization) {
        this.isCreativeOptimization = isCreativeOptimization;
    }

    /**
     * Indicates whether the ad group should use the local inventory.
     * @return isLocalInventory
     */
    public Boolean getIsLocalInventory() {
        return isLocalInventory;
    }

    public void setIsLocalInventory(Boolean isLocalInventory) {
        this.isLocalInventory = isLocalInventory;
    }

    /**
     * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the `end_time` field.
     * @return lifetimeFrequencyCap
     */
    public Integer getLifetimeFrequencyCap() {
        return lifetimeFrequencyCap;
    }

    public void setLifetimeFrequencyCap(Integer lifetimeFrequencyCap) {
        this.lifetimeFrequencyCap = lifetimeFrequencyCap;
    }

    /**
     * The targeting radius of the local inventory ads in miles.
     * @return localInventoryRadiusInMiles
     */
    public BigDecimal getLocalInventoryRadiusInMiles() {
        return localInventoryRadiusInMiles;
    }

    public void setLocalInventoryRadiusInMiles(BigDecimal localInventoryRadiusInMiles) {
        this.localInventoryRadiusInMiles = localInventoryRadiusInMiles;
    }

    /**
     * Ad group name.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.
     * @return optimizationGoalMetadata
     */
    public NullableOptimizationGoalMetadata getOptimizationGoalMetadata() {
        return optimizationGoalMetadata;
    }

    public void setOptimizationGoalMetadata(NullableOptimizationGoalMetadata optimizationGoalMetadata) {
        this.optimizationGoalMetadata = optimizationGoalMetadata;
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
     * [Placement group](https://help.pinterest.com/en/business/article/placement-groups).
     * @return placementGroup
     */
    public PlacementGroupType getPlacementGroup() {
        return placementGroup;
    }

    public void setPlacementGroup(PlacementGroupType placementGroup) {
        this.placementGroup = placementGroup;
    }

    /**
     * A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both
     * @return placementTrafficType
     */
    public PlacementTrafficType getPlacementTrafficType() {
        return placementTrafficType;
    }

    public void setPlacementTrafficType(PlacementTrafficType placementTrafficType) {
        this.placementTrafficType = placementTrafficType;
    }

    /**
     * Specify if the promotion is applied at ad group or item level
     * @return promotionApplicationLevel
     */
    public PromotionApplicationLevel getPromotionApplicationLevel() {
        return promotionApplicationLevel;
    }

    public void setPromotionApplicationLevel(PromotionApplicationLevel promotionApplicationLevel) {
        this.promotionApplicationLevel = promotionApplicationLevel;
    }

    /**
     * Promotion ID. To clear this field, set to null.
     * @return promotionId
     */
    public String getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(String promotionId) {
        this.promotionId = promotionId;
    }

    /**
     * Promotion IDs list. To clear this field, set to an empty array [].
     * @return promotionIds
     */
    public List<String> getPromotionIds() {
        return promotionIds;
    }

    public void setPromotionIds(List<String> promotionIds) {
        this.promotionIds = promotionIds;
    }

    /**
     * Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
     * @return startTime
     */
    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    /**
     * Ad group/entity status.
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
     * Get targetingSpec
     * @return targetingSpec
     */
    public TargetingSpecOptimal getTargetingSpec() {
        return targetingSpec;
    }

    public void setTargetingSpec(TargetingSpecOptimal targetingSpec) {
        this.targetingSpec = targetingSpec;
    }

    /**
     * Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].
     * @return targetingTemplateIds
     */
    public List<@Pattern(regexp = "^\\d+$")String> getTargetingTemplateIds() {
        return targetingTemplateIds;
    }

    public void setTargetingTemplateIds(List<@Pattern(regexp = "^\\d+$")String> targetingTemplateIds) {
        this.targetingTemplateIds = targetingTemplateIds;
    }

    /**
     * Get trackingUrls
     * @return trackingUrls
     */
    public AdGroupTrackingURLs getTrackingUrls() {
        return trackingUrls;
    }

    public void setTrackingUrls(AdGroupTrackingURLs trackingUrls) {
        this.trackingUrls = trackingUrls;
    }

    /**
     * Always \"adgroup\".
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * Ad group last update time. Unix timestamp in seconds.
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
        sb.append("class AdGroupBase {\n");
        
        sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
        sb.append("    bidInMicroCurrency: ").append(toIndentedString(bidInMicroCurrency)).append("\n");
        sb.append("    bidStrategyType: ").append(toIndentedString(bidStrategyType)).append("\n");
        sb.append("    billableEvent: ").append(toIndentedString(billableEvent)).append("\n");
        sb.append("    budgetInMicroCurrency: ").append(toIndentedString(budgetInMicroCurrency)).append("\n");
        sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
        sb.append("    conversionLearningModeType: ").append(toIndentedString(conversionLearningModeType)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    customerSegmentId: ").append(toIndentedString(customerSegmentId)).append("\n");
        sb.append("    dcaAssets: ").append(toIndentedString(dcaAssets)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    extFeatures: ").append(toIndentedString(extFeatures)).append("\n");
        sb.append("    feedProfileId: ").append(toIndentedString(feedProfileId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isCreativeOptimization: ").append(toIndentedString(isCreativeOptimization)).append("\n");
        sb.append("    isLocalInventory: ").append(toIndentedString(isLocalInventory)).append("\n");
        sb.append("    lifetimeFrequencyCap: ").append(toIndentedString(lifetimeFrequencyCap)).append("\n");
        sb.append("    localInventoryRadiusInMiles: ").append(toIndentedString(localInventoryRadiusInMiles)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    optimizationGoalMetadata: ").append(toIndentedString(optimizationGoalMetadata)).append("\n");
        sb.append("    performancePlusCampaignSettings: ").append(toIndentedString(performancePlusCampaignSettings)).append("\n");
        sb.append("    placementGroup: ").append(toIndentedString(placementGroup)).append("\n");
        sb.append("    placementTrafficType: ").append(toIndentedString(placementTrafficType)).append("\n");
        sb.append("    promotionApplicationLevel: ").append(toIndentedString(promotionApplicationLevel)).append("\n");
        sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
        sb.append("    promotionIds: ").append(toIndentedString(promotionIds)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    summaryStatus: ").append(toIndentedString(summaryStatus)).append("\n");
        sb.append("    targetingSpec: ").append(toIndentedString(targetingSpec)).append("\n");
        sb.append("    targetingTemplateIds: ").append(toIndentedString(targetingTemplateIds)).append("\n");
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

