/*
 * AdGroupCreateRequest.h
 *
 * 
 */

#ifndef _AdGroupCreateRequest_H_
#define _AdGroupCreateRequest_H_


#include <string>
#include "ActionType.h"
#include "BidStrategyType.h"
#include "BudgetType.h"
#include "EntityStatus.h"
#include "PacingDeliveryType.h"
#include "PlacementGroupType.h"
#include "TargetingSpec.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdGroupCreateRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	AdGroupCreateRequest();
	AdGroupCreateRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdGroupCreateRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>.
	 */
	bool getAutoTargetingEnabled();

	/*! \brief Set Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>.
	 */
	void setAutoTargetingEnabled(bool  auto_targeting_enabled);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>.
	 */
	long long getBidMultiplier();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>.
	 */
	void setBidMultiplier(long long  bid_multiplier);
	/*! \brief Get 
	 */
	BudgetType getBudgetType();

	/*! \brief Set 
	 */
	void setBudgetType(BudgetType  budget_type);
	/*! \brief Get 
	 */
	PacingDeliveryType getPacingDeliveryType();

	/*! \brief Set 
	 */
	void setPacingDeliveryType(PacingDeliveryType  pacing_delivery_type);
	/*! \brief Get Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH.
	 */
	int getBidInMicroCurrency();

	/*! \brief Set Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH.
	 */
	void setBidInMicroCurrency(int  bid_in_micro_currency);
	/*! \brief Get 
	 */
	BidStrategyType getBidStrategyType();

	/*! \brief Set 
	 */
	void setBidStrategyType(BidStrategyType  bid_strategy_type);
	/*! \brief Get 
	 */
	ActionType getBillableEvent();

	/*! \brief Set 
	 */
	void setBillableEvent(ActionType  billable_event);
	/*! \brief Get Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
	 */
	int getBudgetInMicroCurrency();

	/*! \brief Set Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
	 */
	void setBudgetInMicroCurrency(int  budget_in_micro_currency);
	/*! \brief Get Campaign ID of the ad group.
	 */
	std::string getCampaignId();

	/*! \brief Set Campaign ID of the ad group.
	 */
	void setCampaignId(std::string  campaign_id);
	/*! \brief Get Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
	 */
	int getEndTime();

	/*! \brief Set Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
	 */
	void setEndTime(int  end_time);
	/*! \brief Get Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.
	 */
	bool getIsCreativeOptimization();

	/*! \brief Set Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.
	 */
	void setIsCreativeOptimization(bool  is_creative_optimization);
	/*! \brief Get Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
	 */
	int getLifetimeFrequencyCap();

	/*! \brief Set Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
	 */
	void setLifetimeFrequencyCap(int  lifetime_frequency_cap);
	/*! \brief Get Ad group name.
	 */
	std::string getName();

	/*! \brief Set Ad group name.
	 */
	void setName(std::string  name);
	/*! \brief Get Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.
	 */
	std::string getOptimizationGoalMetadata();

	/*! \brief Set Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.
	 */
	void setOptimizationGoalMetadata(std::string  optimization_goal_metadata);
	/*! \brief Get <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.
	 */
	PlacementGroupType getPlacementGroup();

	/*! \brief Set <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.
	 */
	void setPlacementGroup(PlacementGroupType  placement_group);
	/*! \brief Get Specify if the promotion is applied at ad group or item level
	 */
	std::string getPromotionApplicationLevel();

	/*! \brief Set Specify if the promotion is applied at ad group or item level
	 */
	void setPromotionApplicationLevel(std::string  promotion_application_level);
	/*! \brief Get Promotion ID. To clear this field, set to null.
	 */
	std::string getPromotionId();

	/*! \brief Set Promotion ID. To clear this field, set to null.
	 */
	void setPromotionId(std::string  promotion_id);
	/*! \brief Get Promotion IDs list. To clear this field, set to an empty array [].
	 */
	std::list<std::string> getPromotionIds();

	/*! \brief Set Promotion IDs list. To clear this field, set to an empty array [].
	 */
	void setPromotionIds(std::list <std::string> promotion_ids);
	/*! \brief Get Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
	 */
	int getStartTime();

	/*! \brief Set Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
	 */
	void setStartTime(int  start_time);
	/*! \brief Get Ad group/entity status.
	 */
	EntityStatus getStatus();

	/*! \brief Set Ad group/entity status.
	 */
	void setStatus(EntityStatus  status);
	/*! \brief Get 
	 */
	TargetingSpec getTargetingSpec();

	/*! \brief Set 
	 */
	void setTargetingSpec(TargetingSpec  targeting_spec);
	/*! \brief Get Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].
	 */
	std::list<std::string> getTargetingTemplateIds();

	/*! \brief Set Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].
	 */
	void setTargetingTemplateIds(std::list <std::string> targeting_template_ids);
	/*! \brief Get Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - EmptyObject - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
	 */
	std::string getTrackingUrls();

	/*! \brief Set Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - EmptyObject - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
	 */
	void setTrackingUrls(std::string  tracking_urls);

private:
	bool auto_targeting_enabled;
	long long bid_multiplier;
	BudgetType budget_type;
	PacingDeliveryType pacing_delivery_type;
	int bid_in_micro_currency;
	BidStrategyType bid_strategy_type;
	ActionType billable_event;
	int budget_in_micro_currency;
	std::string campaign_id;
	int end_time;
	bool is_creative_optimization;
	int lifetime_frequency_cap;
	std::string name;
	std::string optimization_goal_metadata;
	PlacementGroupType placement_group;
	std::string promotion_application_level;
	std::string promotion_id;
	std::list <std::string>promotion_ids;
	int start_time;
	EntityStatus status;
	TargetingSpec targeting_spec;
	std::list <std::string>targeting_template_ids;
	std::string tracking_urls;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdGroupCreateRequest_H_ */
