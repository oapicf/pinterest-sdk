/*
 * CampaignPlanningConversionRate.h
 *
 * Conversion rate estimate for a specific conversion event and attribution window combination.
 */

#ifndef _CampaignPlanningConversionRate_H_
#define _CampaignPlanningConversionRate_H_


#include <string>
#include "CampaignPlanningConversionAttribution.h"
#include "CampaignPlanningConversionEvent.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Conversion rate estimate for a specific conversion event and attribution window combination.
 *
 *  \ingroup Models
 *
 */

class CampaignPlanningConversionRate : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignPlanningConversionRate();
	CampaignPlanningConversionRate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignPlanningConversionRate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CampaignPlanningConversionAttribution getAttributionWindows();

	/*! \brief Set 
	 */
	void setAttributionWindows(CampaignPlanningConversionAttribution  attribution_windows);
	/*! \brief Get 
	 */
	CampaignPlanningConversionEvent getConversionEvent();

	/*! \brief Set 
	 */
	void setConversionEvent(CampaignPlanningConversionEvent  conversion_event);
	/*! \brief Get Conversion rate estimate. Used to translate impressions into conversions for oCPM ads.
	 */
	float getConversionRate();

	/*! \brief Set Conversion rate estimate. Used to translate impressions into conversions for oCPM ads.
	 */
	void setConversionRate(float  conversion_rate);

private:
	CampaignPlanningConversionAttribution attribution_windows;
	CampaignPlanningConversionEvent conversion_event;
	float conversion_rate;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CampaignPlanningConversionRate_H_ */
