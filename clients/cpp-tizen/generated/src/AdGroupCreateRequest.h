/*
 * AdGroupCreateRequest.h
 *
 * 
 */

#ifndef _AdGroupCreateRequest_H_
#define _AdGroupCreateRequest_H_


#include <string>
#include "ActionType.h"
#include "AdGroupCommon.h"
#include "AdGroupCommon_tracking_urls.h"
#include "AdGroupCreateRequest_allOf.h"
#include "BudgetType.h"
#include "EntityStatus.h"
#include "PacingDeliveryType.h"
#include "PlacementGroupType.h"
#include "TargetingSpec.h"
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
	/*! \brief Get 
	 */
	std::string getBidStrategyType();

	/*! \brief Set 
	 */
	void setBidStrategyType(std::string  bid_strategy_type);
	/*! \brief Get 
	 */
	BudgetType getBudgetType();

	/*! \brief Set 
	 */
	void setBudgetType(BudgetType  budget_type);
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
	/*! \brief Get 
	 */
	TargetingSpec getTargetingSpec();

	/*! \brief Set 
	 */
	void setTargetingSpec(TargetingSpec  targeting_spec);
	/*! \brief Get Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\\\"/docs/redoc/#section/Billable-event\\\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
	 */
	int getLifetimeFrequencyCap();

	/*! \brief Set Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\\\"/docs/redoc/#section/Billable-event\\\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
	 */
	void setLifetimeFrequencyCap(int  lifetime_frequency_cap);
	/*! \brief Get 
	 */
	AdGroupCommon_tracking_urls getTrackingUrls();

	/*! \brief Set 
	 */
	void setTrackingUrls(AdGroupCommon_tracking_urls  tracking_urls);
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

private:
	std::string name;
	EntityStatus status;
	int budget_in_micro_currency;
	int bid_in_micro_currency;
	std::string bid_strategy_type;
	BudgetType budget_type;
	int start_time;
	int end_time;
	TargetingSpec targeting_spec;
	int lifetime_frequency_cap;
	AdGroupCommon_tracking_urls tracking_urls;
	bool auto_targeting_enabled;
	PlacementGroupType placement_group;
	PacingDeliveryType pacing_delivery_type;
	std::string campaign_id;
	ActionType billable_event;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdGroupCreateRequest_H_ */
