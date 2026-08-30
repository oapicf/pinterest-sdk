/*
 * CampaignDeliveryEstimatesResponse.h
 *
 * Delivery estimates response for a campaign.
 */

#ifndef _CampaignDeliveryEstimatesResponse_H_
#define _CampaignDeliveryEstimatesResponse_H_


#include <string>
#include "CampaignDeliveryEstimatesDerivedMetrics.h"
#include "CampaignPlanningCurveEstimate.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Delivery estimates response for a campaign.
 *
 *  \ingroup Models
 *
 */

class CampaignDeliveryEstimatesResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignDeliveryEstimatesResponse();
	CampaignDeliveryEstimatesResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignDeliveryEstimatesResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Estimated curves. Each curve will pertain to a single estimation type.
	 */
	std::list<CampaignPlanningCurveEstimate> getCurves();

	/*! \brief Set Estimated curves. Each curve will pertain to a single estimation type.
	 */
	void setCurves(std::list <CampaignPlanningCurveEstimate> curves);
	/*! \brief Get 
	 */
	CampaignDeliveryEstimatesDerivedMetrics getDerivedMetrics();

	/*! \brief Set 
	 */
	void setDerivedMetrics(CampaignDeliveryEstimatesDerivedMetrics  derived_metrics);
	/*! \brief Get Maximum potential spend estimate.
	 */
	int getMaxPotentialSpend();

	/*! \brief Set Maximum potential spend estimate.
	 */
	void setMaxPotentialSpend(int  max_potential_spend);

private:
	std::list <CampaignPlanningCurveEstimate>curves;
	CampaignDeliveryEstimatesDerivedMetrics derived_metrics;
	int max_potential_spend;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CampaignDeliveryEstimatesResponse_H_ */
