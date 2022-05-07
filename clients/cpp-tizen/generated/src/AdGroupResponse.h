/*
 * AdGroupResponse.h
 *
 * 
 */

#ifndef _AdGroupResponse_H_
#define _AdGroupResponse_H_


#include <string>
#include "ActionType.h"
#include "AdGroupResponse_allOf.h"
#include "AdGroupResponse_allOf_1.h"
#include "AdGroupSummaryStatus.h"
#include "EntityStatus.h"
#include "PacingDeliveryType.h"
#include "PlacementGroupType.h"
#include "TrackingUrls.h"
#include <list>
#include <map>
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

class AdGroupResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	AdGroupResponse();
	AdGroupResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdGroupResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Ad group name.
	 */
	std::string getName();

	/*! \brief Set Ad group name.
	 */
	void setName(std::string  name);
	/*! \brief Get Ad group/entity status.
	 */
	EntityStatus getStatus();

	/*! \brief Set Ad group/entity status.
	 */
	void setStatus(EntityStatus  status);
	/*! \brief Get Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
	 */
	int getBudgetInMicroCurrency();

	/*! \brief Set Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
	 */
	void setBudgetInMicroCurrency(int  budget_in_micro_currency);
	/*! \brief Get Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
	 */
	int getBidInMicroCurrency();

	/*! \brief Set Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
	 */
	void setBidInMicroCurrency(int  bid_in_micro_currency);
	/*! \brief Get Budget type. If DAILY, an ad group's daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group `start_time` and `end_time` range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome.
	 */
	std::string getBudgetType();

	/*! \brief Set Budget type. If DAILY, an ad group's daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group `start_time` and `end_time` range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome.
	 */
	void setBudgetType(std::string  budget_type);
	/*! \brief Get Ad group start time. Unix timestamp in seconds. Defaults to current time.
	 */
	int getStartTime();

	/*! \brief Set Ad group start time. Unix timestamp in seconds. Defaults to current time.
	 */
	void setStartTime(int  start_time);
	/*! \brief Get Ad group end time. Unix timestamp in seconds.
	 */
	int getEndTime();

	/*! \brief Set Ad group end time. Unix timestamp in seconds.
	 */
	void setEndTime(int  end_time);
	/*! \brief Get Ad group targeting specification defining the ad group target audience. For example, '{\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"AGE_BUCKET\":[\"25-34\"]}'
	 */
	std::map<std::string, std::string> getTargetingSpec();

	/*! \brief Set Ad group targeting specification defining the ad group target audience. For example, '{\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"AGE_BUCKET\":[\"25-34\"]}'
	 */
	void setTargetingSpec(std::map <std::string, std::string> targeting_spec);
	/*! \brief Get Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\\\"/docs/redoc/#section/Billable-event\\\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
	 */
	int getLifetimeFrequencyCap();

	/*! \brief Set Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\\\"/docs/redoc/#section/Billable-event\\\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
	 */
	void setLifetimeFrequencyCap(int  lifetime_frequency_cap);
	/*! \brief Get Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
	 */
	TrackingUrls getTrackingUrls();

	/*! \brief Set Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
	 */
	void setTrackingUrls(TrackingUrls  tracking_urls);
	/*! \brief Get Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
	 */
	bool getAutoTargetingEnabled();

	/*! \brief Set Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
	 */
	void setAutoTargetingEnabled(bool  auto_targeting_enabled);
	/*! \brief Get <a href=\\\"/docs/redoc/#section/Placement-group\\\">Placement group</a>.
	 */
	PlacementGroupType getPlacementGroup();

	/*! \brief Set <a href=\\\"/docs/redoc/#section/Placement-group\\\">Placement group</a>.
	 */
	void setPlacementGroup(PlacementGroupType  placement_group);
	/*! \brief Get Pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day.
	 */
	PacingDeliveryType getPacingDeliveryType();

	/*! \brief Set Pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day.
	 */
	void setPacingDeliveryType(PacingDeliveryType  pacing_delivery_type);
	/*! \brief Get oCPM learn mode
	 */
	std::string getConversionLearningModeType();

	/*! \brief Set oCPM learn mode
	 */
	void setConversionLearningModeType(std::string  conversion_learning_mode_type);
	/*! \brief Get Ad group summary status.
	 */
	AdGroupSummaryStatus getSummaryStatus();

	/*! \brief Set Ad group summary status.
	 */
	void setSummaryStatus(AdGroupSummaryStatus  summary_status);
	/*! \brief Get Feed Profile ID associated to the adgroup.
	 */
	std::string getFeedProfileId();

	/*! \brief Set Feed Profile ID associated to the adgroup.
	 */
	void setFeedProfileId(std::string  feed_profile_id);
	/*! \brief Get Campaign ID of the ad group.
	 */
	std::string getCampaignId();

	/*! \brief Set Campaign ID of the ad group.
	 */
	void setCampaignId(std::string  campaign_id);
	/*! \brief Get 
	 */
	ActionType getBillableEvent();

	/*! \brief Set 
	 */
	void setBillableEvent(ActionType  billable_event);
	/*! \brief Get Ad group ID.
	 */
	std::string getId();

	/*! \brief Set Ad group ID.
	 */
	void setId(std::string  id);
	/*! \brief Get Always \"adgroup\".
	 */
	std::string getType();

	/*! \brief Set Always \"adgroup\".
	 */
	void setType(std::string  type);
	/*! \brief Get Advertiser ID.
	 */
	std::string getAdAccountId();

	/*! \brief Set Advertiser ID.
	 */
	void setAdAccountId(std::string  ad_account_id);
	/*! \brief Get Ad group creation time. Unix timestamp in seconds.
	 */
	int getCreatedTime();

	/*! \brief Set Ad group creation time. Unix timestamp in seconds.
	 */
	void setCreatedTime(int  created_time);
	/*! \brief Get Ad group last update time. Unix timestamp in seconds.
	 */
	int getUpdatedTime();

	/*! \brief Set Ad group last update time. Unix timestamp in seconds.
	 */
	void setUpdatedTime(int  updated_time);

private:
	std::string name;
	EntityStatus status;
	int budget_in_micro_currency;
	int bid_in_micro_currency;
	std::string budget_type;
	int start_time;
	int end_time;
	std::map <std::string, std::string>targeting_spec;
	int lifetime_frequency_cap;
	TrackingUrls tracking_urls;
	bool auto_targeting_enabled;
	PlacementGroupType placement_group;
	PacingDeliveryType pacing_delivery_type;
	std::string conversion_learning_mode_type;
	AdGroupSummaryStatus summary_status;
	std::string feed_profile_id;
	std::string campaign_id;
	ActionType billable_event;
	std::string id;
	std::string type;
	std::string ad_account_id;
	int created_time;
	int updated_time;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdGroupResponse_H_ */
