/*
 * CampaignCreateCommon_allOf.h
 *
 * 
 */

#ifndef _CampaignCreateCommon_allOf_H_
#define _CampaignCreateCommon_allOf_H_


#include <string>
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

class CampaignCreateCommon_allOf : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignCreateCommon_allOf();
	CampaignCreateCommon_allOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignCreateCommon_allOf();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	EntityStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(EntityStatus  status);
	/*! \brief Get 
	 */
	bool getIsCampaignBudgetOptimization();

	/*! \brief Set 
	 */
	void setIsCampaignBudgetOptimization(bool  is_campaign_budget_optimization);
	/*! \brief Get 
	 */
	bool getIsFlexibleDailyBudgets();

	/*! \brief Set 
	 */
	void setIsFlexibleDailyBudgets(bool  is_flexible_daily_budgets);
	/*! \brief Get When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
	 */
	int getDefaultAdGroupBudgetInMicroCurrency();

	/*! \brief Set When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
	 */
	void setDefaultAdGroupBudgetInMicroCurrency(int  default_ad_group_budget_in_micro_currency);
	/*! \brief Get 
	 */
	bool getIsAutomatedCampaign();

	/*! \brief Set 
	 */
	void setIsAutomatedCampaign(bool  is_automated_campaign);

private:
	EntityStatus status;
	bool is_campaign_budget_optimization;
	bool is_flexible_daily_budgets;
	int default_ad_group_budget_in_micro_currency;
	bool is_automated_campaign;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CampaignCreateCommon_allOf_H_ */
