
/*
 * CampaignPlanningBudgetRecommendationPoint.h
 *
 * A point estimation containing the estimate data and estimation type for a budget recommendation.
 */

#ifndef TINY_CPP_CLIENT_CampaignPlanningBudgetRecommendationPoint_H_
#define TINY_CPP_CLIENT_CampaignPlanningBudgetRecommendationPoint_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CampaignPlanningEstimationType.h"
#include "CampaignPlanningPointEstimate.h"

namespace Tiny {


/*! \brief A point estimation containing the estimate data and estimation type for a budget recommendation.
 *
 *  \ingroup Models
 *
 */

class CampaignPlanningBudgetRecommendationPoint{
public:

    /*! \brief Constructor.
	 */
    CampaignPlanningBudgetRecommendationPoint();
    CampaignPlanningBudgetRecommendationPoint(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignPlanningBudgetRecommendationPoint();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Estimation type for this point.
	 */
	CampaignPlanningEstimationType getEstimationType();

	/*! \brief Set Estimation type for this point.
	 */
	void setEstimationType(CampaignPlanningEstimationType estimation_type);
	/*! \brief Get Point estimate data.
	 */
	CampaignPlanningPointEstimate getPointEstimate();

	/*! \brief Set Point estimate data.
	 */
	void setPointEstimate(CampaignPlanningPointEstimate point_estimate);


    private:
    CampaignPlanningEstimationType estimation_type;
    CampaignPlanningPointEstimate point_estimate;
};
}

#endif /* TINY_CPP_CLIENT_CampaignPlanningBudgetRecommendationPoint_H_ */
