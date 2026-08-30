
/*
 * CampaignDeliveryEstimatesResponse.h
 *
 * Delivery estimates response for a campaign.
 */

#ifndef TINY_CPP_CLIENT_CampaignDeliveryEstimatesResponse_H_
#define TINY_CPP_CLIENT_CampaignDeliveryEstimatesResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CampaignDeliveryEstimatesDerivedMetrics.h"
#include "CampaignPlanningCurveEstimate.h"
#include <list>

namespace Tiny {


/*! \brief Delivery estimates response for a campaign.
 *
 *  \ingroup Models
 *
 */

class CampaignDeliveryEstimatesResponse{
public:

    /*! \brief Constructor.
	 */
    CampaignDeliveryEstimatesResponse();
    CampaignDeliveryEstimatesResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignDeliveryEstimatesResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Estimated curves. Each curve will pertain to a single estimation type.
	 */
	std::list<CampaignPlanningCurveEstimate> getCurves();

	/*! \brief Set Estimated curves. Each curve will pertain to a single estimation type.
	 */
	void setCurves(std::list<CampaignPlanningCurveEstimate> curves);
	/*! \brief Get 
	 */
	CampaignDeliveryEstimatesDerivedMetrics getDerivedMetrics();

	/*! \brief Set 
	 */
	void setDerivedMetrics(CampaignDeliveryEstimatesDerivedMetrics derived_metrics);
	/*! \brief Get Maximum potential spend estimate.
	 */
	int getMaxPotentialSpend();

	/*! \brief Set Maximum potential spend estimate.
	 */
	void setMaxPotentialSpend(int max_potential_spend);


    private:
    std::list<CampaignPlanningCurveEstimate> curves;
    CampaignDeliveryEstimatesDerivedMetrics derived_metrics;
    int max_potential_spend{};
};
}

#endif /* TINY_CPP_CLIENT_CampaignDeliveryEstimatesResponse_H_ */
