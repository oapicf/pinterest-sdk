/*
 * CampaignPlanningBudgetRecommendationPoint.h
 *
 * A point estimation containing the estimate data and estimation type for a budget recommendation.
 */

#ifndef _CampaignPlanningBudgetRecommendationPoint_H_
#define _CampaignPlanningBudgetRecommendationPoint_H_


#include <string>
#include "CampaignPlanningEstimationType.h"
#include "CampaignPlanningPointEstimate.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A point estimation containing the estimate data and estimation type for a budget recommendation.
 *
 *  \ingroup Models
 *
 */

class CampaignPlanningBudgetRecommendationPoint : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignPlanningBudgetRecommendationPoint();
	CampaignPlanningBudgetRecommendationPoint(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignPlanningBudgetRecommendationPoint();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Estimation type for this point.
	 */
	CampaignPlanningEstimationType getEstimationType();

	/*! \brief Set Estimation type for this point.
	 */
	void setEstimationType(CampaignPlanningEstimationType  estimation_type);
	/*! \brief Get Point estimate data.
	 */
	CampaignPlanningPointEstimate getPointEstimate();

	/*! \brief Set Point estimate data.
	 */
	void setPointEstimate(CampaignPlanningPointEstimate  point_estimate);

private:
	CampaignPlanningEstimationType estimation_type;
	CampaignPlanningPointEstimate point_estimate;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CampaignPlanningBudgetRecommendationPoint_H_ */
