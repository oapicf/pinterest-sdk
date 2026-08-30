/*
 * CampaignCreateRequest.h
 *
 * 
 */

#ifndef _CampaignCreateRequest_H_
#define _CampaignCreateRequest_H_


#include <string>
#include "CampaignBidOptionsCreate.h"
#include "EntityStatus.h"
#include "IntendedPromotionType.h"
#include "ObjectiveType.h"
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

class CampaignCreateRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignCreateRequest();
	CampaignCreateRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignCreateRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CampaignBidOptionsCreate getBidOptions();

	/*! \brief Set 
	 */
	void setBidOptions(CampaignBidOptionsCreate  bid_options);
	/*! \brief Get 
	 */
	IntendedPromotionType getIntendedPromotionType();

	/*! \brief Set 
	 */
	void setIntendedPromotionType(IntendedPromotionType  intended_promotion_type);
	/*! \brief Get Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - CATALOG\\_SALES
	 */
	bool getIsAutomatedCampaign();

	/*! \brief Set Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - CATALOG\\_SALES
	 */
	void setIsAutomatedCampaign(bool  is_automated_campaign);
	/*! \brief Get Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.
	 */
	bool getIsCampaignBudgetOptimization();

	/*! \brief Set Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.
	 */
	void setIsCampaignBudgetOptimization(bool  is_campaign_budget_optimization);
	/*! \brief Get Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.
	 */
	bool getIsFlexibleDailyBudgets();

	/*! \brief Set Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.
	 */
	void setIsFlexibleDailyBudgets(bool  is_flexible_daily_budgets);
	/*! \brief Get Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
	 */
	bool getIsLtvOptimized();

	/*! \brief Set Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
	 */
	void setIsLtvOptimized(bool  is_ltv_optimized);
	/*! \brief Get Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>.
	 */
	bool getIsPerformancePlus();

	/*! \brief Set Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>.
	 */
	void setIsPerformancePlus(bool  is_performance_plus);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a>  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives: `CONSIDERATION` `WEB_CONVERSION` `CATALOG_SALES`  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.  You cannot change your `true` or `false` selection of this campaign if you <a href=\"https://developer.pinterest.com/docs/api/v5/campaigns-update\" target=\"blank\">update it</a>.
	 */
	bool getIsTopOfSearch();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a>  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives: `CONSIDERATION` `WEB_CONVERSION` `CATALOG_SALES`  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.  You cannot change your `true` or `false` selection of this campaign if you <a href=\"https://developer.pinterest.com/docs/api/v5/campaigns-update\" target=\"blank\">update it</a>.
	 */
	void setIsTopOfSearch(bool  is_top_of_search);
	/*! \brief Get 
	 */
	ObjectiveType getObjectiveType();

	/*! \brief Set 
	 */
	void setObjectiveType(ObjectiveType  objective_type);
	/*! \brief Get 
	 */
	EntityStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(EntityStatus  status);
	/*! \brief Get Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
	 */
	std::string getAdAccountId();

	/*! \brief Set Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
	 */
	void setAdAccountId(std::string  ad_account_id);
	/*! \brief Get Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
	 */
	int getDailySpendCap();

	/*! \brief Set Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
	 */
	void setDailySpendCap(int  daily_spend_cap);
	/*! \brief Get When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
	 */
	int getDefaultAdGroupBudgetInMicroCurrency();

	/*! \brief Set When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
	 */
	void setDefaultAdGroupBudgetInMicroCurrency(int  default_ad_group_budget_in_micro_currency);
	/*! \brief Get Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
	 */
	int getEndTime();

	/*! \brief Set Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
	 */
	void setEndTime(int  end_time);
	/*! \brief Get Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
	 */
	int getLifetimeSpendCap();

	/*! \brief Set Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
	 */
	void setLifetimeSpendCap(int  lifetime_spend_cap);
	/*! \brief Get Campaign name.
	 */
	std::string getName();

	/*! \brief Set Campaign name.
	 */
	void setName(std::string  name);
	/*! \brief Get Order line ID that appears on the invoice.
	 */
	std::string getOrderLineId();

	/*! \brief Set Order line ID that appears on the invoice.
	 */
	void setOrderLineId(std::string  order_line_id);
	/*! \brief Get Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
	 */
	int getStartTime();

	/*! \brief Set Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
	 */
	void setStartTime(int  start_time);
	/*! \brief Get 
	 */
	std::string getTrackingUrls();

	/*! \brief Set 
	 */
	void setTrackingUrls(std::string  tracking_urls);

private:
	CampaignBidOptionsCreate bid_options;
	IntendedPromotionType intended_promotion_type;
	bool is_automated_campaign;
	bool is_campaign_budget_optimization;
	bool is_flexible_daily_budgets;
	bool is_ltv_optimized;
	bool is_performance_plus;
	bool is_top_of_search;
	ObjectiveType objective_type;
	EntityStatus status;
	std::string ad_account_id;
	int daily_spend_cap;
	int default_ad_group_budget_in_micro_currency;
	int end_time;
	int lifetime_spend_cap;
	std::string name;
	std::string order_line_id;
	int start_time;
	std::string tracking_urls;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CampaignCreateRequest_H_ */
