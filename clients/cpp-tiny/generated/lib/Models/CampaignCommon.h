
/*
 * CampaignCommon.h
 *
 * Campaign Data
 */

#ifndef TINY_CPP_CLIENT_CampaignCommon_H_
#define TINY_CPP_CLIENT_CampaignCommon_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "EntityStatus.h"
#include "TrackingUrls.h"

namespace Tiny {


/*! \brief Campaign Data
 *
 *  \ingroup Models
 *
 */

class CampaignCommon{
public:

    /*! \brief Constructor.
	 */
    CampaignCommon();
    CampaignCommon(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignCommon();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
	/*! \brief Get Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
	 */
	int getEndTime();

	/*! \brief Set Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
	 */
	void setEndTime(int  end_time);
	/*! \brief Get Specifies whether the campaign was created in the automated campaign flow
	 */
	bool isIsAutomatedCampaign();

	/*! \brief Set Specifies whether the campaign was created in the automated campaign flow
	 */
	void setIsAutomatedCampaign(bool  is_automated_campaign);
	/*! \brief Get Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\".
	 */
	bool isIsFlexibleDailyBudgets();

	/*! \brief Set Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\".
	 */
	void setIsFlexibleDailyBudgets(bool  is_flexible_daily_budgets);
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
	EntityStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(EntityStatus  status);
	/*! \brief Get 
	 */
	TrackingUrls getTrackingUrls();

	/*! \brief Set 
	 */
	void setTrackingUrls(TrackingUrls  tracking_urls);


    private:
    std::string ad_account_id{};
    int daily_spend_cap{};
    int end_time{};
    bool is_automated_campaign{};
    bool is_flexible_daily_budgets{};
    int lifetime_spend_cap{};
    std::string name{};
    std::string order_line_id{};
    int start_time{};
    EntityStatus status;
    TrackingUrls tracking_urls;
};
}

#endif /* TINY_CPP_CLIENT_CampaignCommon_H_ */
