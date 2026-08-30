
/*
 * CampaignPlanningBudgetRecommendation.h
 *
 * Budget recommendation response containing recommended budget, estimated days, and point estimations.
 */

#ifndef TINY_CPP_CLIENT_CampaignPlanningBudgetRecommendation_H_
#define TINY_CPP_CLIENT_CampaignPlanningBudgetRecommendation_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CampaignPlanningBudgetRecommendationPoint.h"
#include "CampaignPlanningExperimentBudgetRecommendation.h"
#include <list>

namespace Tiny {


/*! \brief Budget recommendation response containing recommended budget, estimated days, and point estimations.
 *
 *  \ingroup Models
 *
 */

class CampaignPlanningBudgetRecommendation{
public:

    /*! \brief Constructor.
	 */
    CampaignPlanningBudgetRecommendation();
    CampaignPlanningBudgetRecommendation(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignPlanningBudgetRecommendation();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The recommended budget amount.
	 */
	int getBudgetRecommendation();

	/*! \brief Set The recommended budget amount.
	 */
	void setBudgetRecommendation(int budget_recommendation);
	/*! \brief Get List of experimental budget recommendations.
	 */
	std::list<CampaignPlanningExperimentBudgetRecommendation> getExperimentCampaignBudgetRecommendation();

	/*! \brief Set List of experimental budget recommendations.
	 */
	void setExperimentCampaignBudgetRecommendation(std::list<CampaignPlanningExperimentBudgetRecommendation> experiment_campaign_budget_recommendation);
	/*! \brief Get Recommended number of days for the campaign lifetime.
	 */
	int getLifetimeDaysRecommendation();

	/*! \brief Set Recommended number of days for the campaign lifetime.
	 */
	void setLifetimeDaysRecommendation(int lifetime_days_recommendation);
	/*! \brief Get List of point estimations for different budget scenarios.
	 */
	std::list<CampaignPlanningBudgetRecommendationPoint> getPointEstimations();

	/*! \brief Set List of point estimations for different budget scenarios.
	 */
	void setPointEstimations(std::list<CampaignPlanningBudgetRecommendationPoint> point_estimations);


    private:
    int budget_recommendation{};
    std::list<CampaignPlanningExperimentBudgetRecommendation> experiment_campaign_budget_recommendation;
    int lifetime_days_recommendation{};
    std::list<CampaignPlanningBudgetRecommendationPoint> point_estimations;
};
}

#endif /* TINY_CPP_CLIENT_CampaignPlanningBudgetRecommendation_H_ */
