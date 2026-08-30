/*
 * CampaignPlanningExperimentBudgetRecommendation.h
 *
 * Experimental budget recommendation for a single experiment version.
 */

#ifndef _CampaignPlanningExperimentBudgetRecommendation_H_
#define _CampaignPlanningExperimentBudgetRecommendation_H_


#include <string>
#include "CampaignPlanningBudgetRecommendationPoint.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Experimental budget recommendation for a single experiment version.
 *
 *  \ingroup Models
 *
 */

class CampaignPlanningExperimentBudgetRecommendation : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignPlanningExperimentBudgetRecommendation();
	CampaignPlanningExperimentBudgetRecommendation(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignPlanningExperimentBudgetRecommendation();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Recommended budget for this experiment version.
	 */
	int getBudgetRecommendation();

	/*! \brief Set Recommended budget for this experiment version.
	 */
	void setBudgetRecommendation(int  budget_recommendation);
	/*! \brief Get Recommended lifetime days for this experiment.
	 */
	int getLifetimeDaysRecommendation();

	/*! \brief Set Recommended lifetime days for this experiment.
	 */
	void setLifetimeDaysRecommendation(int  lifetime_days_recommendation);
	/*! \brief Get Point estimations for this experiment version.
	 */
	std::list<CampaignPlanningBudgetRecommendationPoint> getPointEstimations();

	/*! \brief Set Point estimations for this experiment version.
	 */
	void setPointEstimations(std::list <CampaignPlanningBudgetRecommendationPoint> point_estimations);
	/*! \brief Get Version identifier for the experiment.
	 */
	std::string getVersionId();

	/*! \brief Set Version identifier for the experiment.
	 */
	void setVersionId(std::string  version_id);

private:
	int budget_recommendation;
	int lifetime_days_recommendation;
	std::list <CampaignPlanningBudgetRecommendationPoint>point_estimations;
	std::string version_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CampaignPlanningExperimentBudgetRecommendation_H_ */
