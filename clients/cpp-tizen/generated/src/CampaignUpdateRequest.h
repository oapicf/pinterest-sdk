/*
 * CampaignUpdateRequest.h
 *
 * 
 */

#ifndef _CampaignUpdateRequest_H_
#define _CampaignUpdateRequest_H_


#include <string>
#include "AdCommon_tracking_urls.h"
#include "EntityStatus.h"
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

class CampaignUpdateRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignUpdateRequest();
	CampaignUpdateRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignUpdateRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Campaign ID.
	 */
	std::string getId();

	/*! \brief Set Campaign ID.
	 */
	void setId(std::string  id);
	/*! \brief Get Campaign's Advertiser ID.
	 */
	std::string getAdAccountId();

	/*! \brief Set Campaign's Advertiser ID.
	 */
	void setAdAccountId(std::string  ad_account_id);
	/*! \brief Get Campaign name.
	 */
	std::string getName();

	/*! \brief Set Campaign name.
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	EntityStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(EntityStatus  status);
	/*! \brief Get Campaign total spending cap.
	 */
	int getLifetimeSpendCap();

	/*! \brief Set Campaign total spending cap.
	 */
	void setLifetimeSpendCap(int  lifetime_spend_cap);
	/*! \brief Get Campaign daily spending cap.
	 */
	int getDailySpendCap();

	/*! \brief Set Campaign daily spending cap.
	 */
	void setDailySpendCap(int  daily_spend_cap);
	/*! \brief Get Order line ID that appears on the invoice.
	 */
	std::string getOrderLineId();

	/*! \brief Set Order line ID that appears on the invoice.
	 */
	void setOrderLineId(std::string  order_line_id);
	/*! \brief Get 
	 */
	AdCommon_tracking_urls getTrackingUrls();

	/*! \brief Set 
	 */
	void setTrackingUrls(AdCommon_tracking_urls  tracking_urls);
	/*! \brief Get Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
	 */
	int getStartTime();

	/*! \brief Set Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
	 */
	void setStartTime(int  start_time);
	/*! \brief Get Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
	 */
	int getEndTime();

	/*! \brief Set Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
	 */
	void setEndTime(int  end_time);
	/*! \brief Get Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.
	 */
	bool getIsCampaignBudgetOptimization();

	/*! \brief Set Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.
	 */
	void setIsCampaignBudgetOptimization(bool  is_campaign_budget_optimization);
	/*! \brief Get Determine if a campaign has flexible daily budgets setup.
	 */
	bool getIsFlexibleDailyBudgets();

	/*! \brief Set Determine if a campaign has flexible daily budgets setup.
	 */
	void setIsFlexibleDailyBudgets(bool  is_flexible_daily_budgets);
	/*! \brief Get When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
	 */
	int getDefaultAdGroupBudgetInMicroCurrency();

	/*! \brief Set When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
	 */
	void setDefaultAdGroupBudgetInMicroCurrency(int  default_ad_group_budget_in_micro_currency);
	/*! \brief Get Specifies whether the campaign was created in the automated campaign flow
	 */
	bool getIsAutomatedCampaign();

	/*! \brief Set Specifies whether the campaign was created in the automated campaign flow
	 */
	void setIsAutomatedCampaign(bool  is_automated_campaign);

private:
	std::string id;
	std::string ad_account_id;
	std::string name;
	EntityStatus status;
	int lifetime_spend_cap;
	int daily_spend_cap;
	std::string order_line_id;
	AdCommon_tracking_urls tracking_urls;
	int start_time;
	int end_time;
	bool is_campaign_budget_optimization;
	bool is_flexible_daily_budgets;
	int default_ad_group_budget_in_micro_currency;
	bool is_automated_campaign;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CampaignUpdateRequest_H_ */
