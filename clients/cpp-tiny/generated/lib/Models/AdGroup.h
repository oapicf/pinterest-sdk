
/*
 * AdGroup.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdGroup_H_
#define TINY_CPP_CLIENT_AdGroup_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ActionType.h"
#include "AdGroupTrackingURLs.h"
#include "AdgroupTrackingFeatures.h"
#include "AnyType.h"
#include "BidStrategyType.h"
#include "BudgetType.h"
#include "ConversionLearningModeType.h"
#include "EntityStatus.h"
#include "NullableOptimizationGoalMetadata.h"
#include "PacingDeliveryType.h"
#include "PerformancePlusCampaignSettings.h"
#include "PlacementGroupType.h"
#include "PlacementTrafficType.h"
#include "PromotionApplicationLevel.h"
#include "SummaryStatus.h"
#include "TargetingSpecOptimal.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdGroup{
public:

    /*! \brief Constructor.
	 */
    AdGroup();
    AdGroup(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdGroup();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Advertiser ID.
	 */
	std::string getAdAccountId();

	/*! \brief Set Advertiser ID.
	 */
	void setAdAccountId(std::string ad_account_id);
	/*! \brief Get Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
	 */
	int getBidInMicroCurrency();

	/*! \brief Set Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
	 */
	void setBidInMicroCurrency(int bid_in_micro_currency);
	/*! \brief Get 
	 */
	BidStrategyType getBidStrategyType();

	/*! \brief Set 
	 */
	void setBidStrategyType(BidStrategyType bid_strategy_type);
	/*! \brief Get 
	 */
	ActionType getBillableEvent();

	/*! \brief Set 
	 */
	void setBillableEvent(ActionType billable_event);
	/*! \brief Get Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
	 */
	int getBudgetInMicroCurrency();

	/*! \brief Set Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
	 */
	void setBudgetInMicroCurrency(int budget_in_micro_currency);
	/*! \brief Get Campaign ID of the ad group.
	 */
	std::string getCampaignId();

	/*! \brief Set Campaign ID of the ad group.
	 */
	void setCampaignId(std::string campaign_id);
	/*! \brief Get oCPM learn mode
	 */
	ConversionLearningModeType getConversionLearningModeType();

	/*! \brief Set oCPM learn mode
	 */
	void setConversionLearningModeType(ConversionLearningModeType conversion_learning_mode_type);
	/*! \brief Get Ad group creation time. Unix timestamp in seconds.
	 */
	int getCreatedTime();

	/*! \brief Set Ad group creation time. Unix timestamp in seconds.
	 */
	void setCreatedTime(int created_time);
	/*! \brief Get Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the `targeting_template_ids` field as well as the `AUDIENCE_INCLUDE` field of the `targeting_spec`. To clear the customer segment ID, set this field to '0'.
	 */
	std::string getCustomerSegmentId();

	/*! \brief Set Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the `targeting_template_ids` field as well as the `AUDIENCE_INCLUDE` field of the `targeting_spec`. To clear the customer segment ID, set this field to '0'.
	 */
	void setCustomerSegmentId(std::string customer_segment_id);
	/*! \brief Get [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.
	 */
	AnyType getDcaAssets();

	/*! \brief Set [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.
	 */
	void setDcaAssets(AnyType dca_assets);
	/*! \brief Get Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO.
	 */
	int getEndTime();

	/*! \brief Set Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO.
	 */
	void setEndTime(int end_time);
	/*! \brief Get 
	 */
	AdgroupTrackingFeatures getExtFeatures();

	/*! \brief Set 
	 */
	void setExtFeatures(AdgroupTrackingFeatures ext_features);
	/*! \brief Get Feed Profile ID associated to the adgroup.
	 */
	std::string getFeedProfileId();

	/*! \brief Set Feed Profile ID associated to the adgroup.
	 */
	void setFeedProfileId(std::string feed_profile_id);
	/*! \brief Get Ad group ID.
	 */
	std::string getId();

	/*! \brief Set Ad group ID.
	 */
	void setId(std::string id);
	/*! \brief Get Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.
	 */
	bool isIsCreativeOptimization();

	/*! \brief Set Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.
	 */
	void setIsCreativeOptimization(bool is_creative_optimization);
	/*! \brief Get Indicates whether the ad group should use the local inventory.
	 */
	bool isIsLocalInventory();

	/*! \brief Set Indicates whether the ad group should use the local inventory.
	 */
	void setIsLocalInventory(bool is_local_inventory);
	/*! \brief Get Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the `end_time` field.
	 */
	int getLifetimeFrequencyCap();

	/*! \brief Set Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the `end_time` field.
	 */
	void setLifetimeFrequencyCap(int lifetime_frequency_cap);
	/*! \brief Get The targeting radius of the local inventory ads in miles.
	 */
	long getLocalInventoryRadiusInMiles();

	/*! \brief Set The targeting radius of the local inventory ads in miles.
	 */
	void setLocalInventoryRadiusInMiles(long local_inventory_radius_in_miles);
	/*! \brief Get Ad group name.
	 */
	std::string getName();

	/*! \brief Set Ad group name.
	 */
	void setName(std::string name);
	/*! \brief Get Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.
	 */
	NullableOptimizationGoalMetadata getOptimizationGoalMetadata();

	/*! \brief Set Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.
	 */
	void setOptimizationGoalMetadata(NullableOptimizationGoalMetadata optimization_goal_metadata);
	/*! \brief Get Pinterest Performance+ campaign settings.
	 */
	PerformancePlusCampaignSettings getPerformancePlusCampaignSettings();

	/*! \brief Set Pinterest Performance+ campaign settings.
	 */
	void setPerformancePlusCampaignSettings(PerformancePlusCampaignSettings performance_plus_campaign_settings);
	/*! \brief Get [Placement group](https://help.pinterest.com/en/business/article/placement-groups).
	 */
	PlacementGroupType getPlacementGroup();

	/*! \brief Set [Placement group](https://help.pinterest.com/en/business/article/placement-groups).
	 */
	void setPlacementGroup(PlacementGroupType placement_group);
	/*! \brief Get A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both
	 */
	PlacementTrafficType getPlacementTrafficType();

	/*! \brief Set A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both
	 */
	void setPlacementTrafficType(PlacementTrafficType placement_traffic_type);
	/*! \brief Get Specify if the promotion is applied at ad group or item level
	 */
	PromotionApplicationLevel getPromotionApplicationLevel();

	/*! \brief Set Specify if the promotion is applied at ad group or item level
	 */
	void setPromotionApplicationLevel(PromotionApplicationLevel promotion_application_level);
	/*! \brief Get Promotion ID. To clear this field, set to null.
	 */
	std::string getPromotionId();

	/*! \brief Set Promotion ID. To clear this field, set to null.
	 */
	void setPromotionId(std::string promotion_id);
	/*! \brief Get Promotion IDs list. To clear this field, set to an empty array [].
	 */
	std::list<std::string> getPromotionIds();

	/*! \brief Set Promotion IDs list. To clear this field, set to an empty array [].
	 */
	void setPromotionIds(std::list<std::string> promotion_ids);
	/*! \brief Get Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
	 */
	int getStartTime();

	/*! \brief Set Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
	 */
	void setStartTime(int start_time);
	/*! \brief Get Ad group/entity status.
	 */
	EntityStatus getStatus();

	/*! \brief Set Ad group/entity status.
	 */
	void setStatus(EntityStatus status);
	/*! \brief Get 
	 */
	SummaryStatus getSummaryStatus();

	/*! \brief Set 
	 */
	void setSummaryStatus(SummaryStatus summary_status);
	/*! \brief Get 
	 */
	TargetingSpecOptimal getTargetingSpec();

	/*! \brief Set 
	 */
	void setTargetingSpec(TargetingSpecOptimal targeting_spec);
	/*! \brief Get Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].
	 */
	std::list<std::string> getTargetingTemplateIds();

	/*! \brief Set Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].
	 */
	void setTargetingTemplateIds(std::list<std::string> targeting_template_ids);
	/*! \brief Get 
	 */
	AdGroupTrackingURLs getTrackingUrls();

	/*! \brief Set 
	 */
	void setTrackingUrls(AdGroupTrackingURLs tracking_urls);
	/*! \brief Get Always \"adgroup\".
	 */
	std::string getType();

	/*! \brief Set Always \"adgroup\".
	 */
	void setType(std::string type);
	/*! \brief Get Ad group last update time. Unix timestamp in seconds.
	 */
	int getUpdatedTime();

	/*! \brief Set Ad group last update time. Unix timestamp in seconds.
	 */
	void setUpdatedTime(int updated_time);
	/*! \brief Get Enable auto-targeting for ad group. Default value is True. Also known as [\"Performance+ targeting\"](https://help.pinterest.com/en/business/article/performance-plus-targeting).
	 */
	bool isAutoTargetingEnabled();

	/*! \brief Set Enable auto-targeting for ad group. Default value is True. Also known as [\"Performance+ targeting\"](https://help.pinterest.com/en/business/article/performance-plus-targeting).
	 */
	void setAutoTargetingEnabled(bool auto_targeting_enabled);
	/*! \brief Get [Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns).
	 */
	long getBidMultiplier();

	/*! \brief Set [Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns).
	 */
	void setBidMultiplier(long bid_multiplier);
	/*! \brief Get 
	 */
	BudgetType getBudgetType();

	/*! \brief Set 
	 */
	void setBudgetType(BudgetType budget_type);
	/*! \brief Get 
	 */
	PacingDeliveryType getPacingDeliveryType();

	/*! \brief Set 
	 */
	void setPacingDeliveryType(PacingDeliveryType pacing_delivery_type);


    private:
    std::string ad_account_id{};
    int bid_in_micro_currency{};
    BidStrategyType bid_strategy_type;
    ActionType billable_event;
    int budget_in_micro_currency{};
    std::string campaign_id{};
    ConversionLearningModeType conversion_learning_mode_type;
    int created_time{};
    std::string customer_segment_id{};
    AnyType dca_assets;
    int end_time{};
    AdgroupTrackingFeatures ext_features;
    std::string feed_profile_id{};
    std::string id{};
    bool is_creative_optimization{};
    bool is_local_inventory{};
    int lifetime_frequency_cap{};
    long local_inventory_radius_in_miles{};
    std::string name{};
    NullableOptimizationGoalMetadata optimization_goal_metadata;
    PerformancePlusCampaignSettings performance_plus_campaign_settings;
    PlacementGroupType placement_group;
    PlacementTrafficType placement_traffic_type;
    PromotionApplicationLevel promotion_application_level;
    std::string promotion_id{};
    std::list<std::string> promotion_ids;
    int start_time{};
    EntityStatus status;
    SummaryStatus summary_status;
    TargetingSpecOptimal targeting_spec;
    std::list<std::string> targeting_template_ids;
    AdGroupTrackingURLs tracking_urls;
    std::string type{};
    int updated_time{};
    bool auto_targeting_enabled{};
    long bid_multiplier{};
    BudgetType budget_type;
    PacingDeliveryType pacing_delivery_type;
};
}

#endif /* TINY_CPP_CLIENT_AdGroup_H_ */
