/*
 * CampaignPlanningBudgetRecommendation.h
 *
 * Budget recommendation response containing recommended budget, estimated days, and point estimations.
 */

#ifndef _CampaignPlanningBudgetRecommendation_H_
#define _CampaignPlanningBudgetRecommendation_H_


#include <string>
#include "CampaignPlanningBudgetRecommendationPoint.h"
#include "CampaignPlanningExperimentBudgetRecommendation.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Budget recommendation response containing recommended budget, estimated days, and point estimations.
 *
 *  \ingroup Models
 *
 */

class CampaignPlanningBudgetRecommendation : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignPlanningBudgetRecommendation();
	CampaignPlanningBudgetRecommendation(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignPlanningBudgetRecommendation();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The recommended budget amount.
	 */
	int getBudgetRecommendation();

	/*! \brief Set The recommended budget amount.
	 */
	void setBudgetRecommendation(int  budget_recommendation);
	/*! \brief Get List of experimental budget recommendations.
	 */
	std::list<CampaignPlanningExperimentBudgetRecommendation> getExperimentCampaignBudgetRecommendation();

	/*! \brief Set List of experimental budget recommendations.
	 */
	void setExperimentCampaignBudgetRecommendation(std::list <CampaignPlanningExperimentBudgetRecommendation> experiment_campaign_budget_recommendation);
	/*! \brief Get Recommended number of days for the campaign lifetime.
	 */
	int getLifetimeDaysRecommendation();

	/*! \brief Set Recommended number of days for the campaign lifetime.
	 */
	void setLifetimeDaysRecommendation(int  lifetime_days_recommendation);
	/*! \brief Get List of point estimations for different budget scenarios.
	 */
	std::list<CampaignPlanningBudgetRecommendationPoint> getPointEstimations();

	/*! \brief Set List of point estimations for different budget scenarios.
	 */
	void setPointEstimations(std::list <CampaignPlanningBudgetRecommendationPoint> point_estimations);

private:
	int budget_recommendation;
	std::list <CampaignPlanningExperimentBudgetRecommendation>experiment_campaign_budget_recommendation;
	int lifetime_days_recommendation;
	std::list <CampaignPlanningBudgetRecommendationPoint>point_estimations;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CampaignPlanningBudgetRecommendation_H_ */
