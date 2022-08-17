/*
 * CampaignResponse_allOf.h
 *
 * 
 */

#ifndef _CampaignResponse_allOf_H_
#define _CampaignResponse_allOf_H_


#include <string>
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

class CampaignResponse_allOf : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignResponse_allOf();
	CampaignResponse_allOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignResponse_allOf();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ObjectiveType getObjectiveType();

	/*! \brief Set 
	 */
	void setObjectiveType(ObjectiveType  objective_type);
	/*! \brief Get Campaign creation time. Unix timestamp in seconds.
	 */
	int getCreatedTime();

	/*! \brief Set Campaign creation time. Unix timestamp in seconds.
	 */
	void setCreatedTime(int  created_time);
	/*! \brief Get UTC timestamp. Last update time.
	 */
	int getUpdatedTime();

	/*! \brief Set UTC timestamp. Last update time.
	 */
	void setUpdatedTime(int  updated_time);
	/*! \brief Get Always \"campaign\".
	 */
	std::string getType();

	/*! \brief Set Always \"campaign\".
	 */
	void setType(std::string  type);
	/*! \brief Get Determines if a campaign has flexible daily budgets setup.
	 */
	bool getIsFlexibleDailyBudgets();

	/*! \brief Set Determines if a campaign has flexible daily budgets setup.
	 */
	void setIsFlexibleDailyBudgets(bool  is_flexible_daily_budgets);
	/*! \brief Get Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.
	 */
	bool getIsCampaignBudgetOptimization();

	/*! \brief Set Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.
	 */
	void setIsCampaignBudgetOptimization(bool  is_campaign_budget_optimization);

private:
	ObjectiveType objective_type;
	int created_time;
	int updated_time;
	std::string type;
	bool is_flexible_daily_budgets;
	bool is_campaign_budget_optimization;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CampaignResponse_allOf_H_ */
