
/*
 * CampaignPlanningExperimentBudgetRecommendation.h
 *
 * Experimental budget recommendation for a single experiment version.
 */

#ifndef TINY_CPP_CLIENT_CampaignPlanningExperimentBudgetRecommendation_H_
#define TINY_CPP_CLIENT_CampaignPlanningExperimentBudgetRecommendation_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CampaignPlanningBudgetRecommendationPoint.h"
#include <list>

namespace Tiny {


/*! \brief Experimental budget recommendation for a single experiment version.
 *
 *  \ingroup Models
 *
 */

class CampaignPlanningExperimentBudgetRecommendation{
public:

    /*! \brief Constructor.
	 */
    CampaignPlanningExperimentBudgetRecommendation();
    CampaignPlanningExperimentBudgetRecommendation(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignPlanningExperimentBudgetRecommendation();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Recommended budget for this experiment version.
	 */
	int getBudgetRecommendation();

	/*! \brief Set Recommended budget for this experiment version.
	 */
	void setBudgetRecommendation(int budget_recommendation);
	/*! \brief Get Recommended lifetime days for this experiment.
	 */
	int getLifetimeDaysRecommendation();

	/*! \brief Set Recommended lifetime days for this experiment.
	 */
	void setLifetimeDaysRecommendation(int lifetime_days_recommendation);
	/*! \brief Get Point estimations for this experiment version.
	 */
	std::list<CampaignPlanningBudgetRecommendationPoint> getPointEstimations();

	/*! \brief Set Point estimations for this experiment version.
	 */
	void setPointEstimations(std::list<CampaignPlanningBudgetRecommendationPoint> point_estimations);
	/*! \brief Get Version identifier for the experiment.
	 */
	std::string getVersionId();

	/*! \brief Set Version identifier for the experiment.
	 */
	void setVersionId(std::string version_id);


    private:
    int budget_recommendation{};
    int lifetime_days_recommendation{};
    std::list<CampaignPlanningBudgetRecommendationPoint> point_estimations;
    std::string version_id{};
};
}

#endif /* TINY_CPP_CLIENT_CampaignPlanningExperimentBudgetRecommendation_H_ */
