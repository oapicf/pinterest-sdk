/*
 * CampaignPlanningCurveEstimate.h
 *
 * 
 */

#ifndef _CampaignPlanningCurveEstimate_H_
#define _CampaignPlanningCurveEstimate_H_


#include <string>
#include "CampaignPlanningEstimationType.h"
#include "CampaignPlanningPointEstimate.h"
#include <list>
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

class CampaignPlanningCurveEstimate : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignPlanningCurveEstimate();
	CampaignPlanningCurveEstimate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignPlanningCurveEstimate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Estimation type for campaign planning estimated curve
	 */
	CampaignPlanningEstimationType getEstimationType();

	/*! \brief Set Estimation type for campaign planning estimated curve
	 */
	void setEstimationType(CampaignPlanningEstimationType  estimation_type);
	/*! \brief Get The estimation points that make up the estimated curve.
	 */
	std::list<CampaignPlanningPointEstimate> getPoints();

	/*! \brief Set The estimation points that make up the estimated curve.
	 */
	void setPoints(std::list <CampaignPlanningPointEstimate> points);

private:
	CampaignPlanningEstimationType estimation_type;
	std::list <CampaignPlanningPointEstimate>points;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CampaignPlanningCurveEstimate_H_ */
