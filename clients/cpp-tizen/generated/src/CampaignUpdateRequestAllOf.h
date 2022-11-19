/*
 * CampaignUpdateRequest_allOf.h
 *
 * 
 */

#ifndef _CampaignUpdateRequest_allOf_H_
#define _CampaignUpdateRequest_allOf_H_


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

class CampaignUpdateRequest_allOf : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignUpdateRequest_allOf();
	CampaignUpdateRequest_allOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignUpdateRequest_allOf();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	/*! \brief Get 
	 */
	bool getIsAutomatedCampaign();

	/*! \brief Set 
	 */
	void setIsAutomatedCampaign(bool  is_automated_campaign);
	/*! \brief Get 
	 */
	EntityStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(EntityStatus  status);

private:
	bool is_campaign_budget_optimization;
	bool is_flexible_daily_budgets;
	bool is_automated_campaign;
	EntityStatus status;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CampaignUpdateRequest_allOf_H_ */
