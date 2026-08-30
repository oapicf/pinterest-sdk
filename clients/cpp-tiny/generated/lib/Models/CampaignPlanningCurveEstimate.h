
/*
 * CampaignPlanningCurveEstimate.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CampaignPlanningCurveEstimate_H_
#define TINY_CPP_CLIENT_CampaignPlanningCurveEstimate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CampaignPlanningEstimationType.h"
#include "CampaignPlanningPointEstimate.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CampaignPlanningCurveEstimate{
public:

    /*! \brief Constructor.
	 */
    CampaignPlanningCurveEstimate();
    CampaignPlanningCurveEstimate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignPlanningCurveEstimate();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Estimation type for campaign planning estimated curve
	 */
	CampaignPlanningEstimationType getEstimationType();

	/*! \brief Set Estimation type for campaign planning estimated curve
	 */
	void setEstimationType(CampaignPlanningEstimationType estimation_type);
	/*! \brief Get The estimation points that make up the estimated curve.
	 */
	std::list<CampaignPlanningPointEstimate> getPoints();

	/*! \brief Set The estimation points that make up the estimated curve.
	 */
	void setPoints(std::list<CampaignPlanningPointEstimate> points);


    private:
    CampaignPlanningEstimationType estimation_type;
    std::list<CampaignPlanningPointEstimate> points;
};
}

#endif /* TINY_CPP_CLIENT_CampaignPlanningCurveEstimate_H_ */
