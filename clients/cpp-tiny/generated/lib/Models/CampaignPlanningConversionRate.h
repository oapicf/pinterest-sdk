
/*
 * CampaignPlanningConversionRate.h
 *
 * Conversion rate estimate for a specific conversion event and attribution window combination.
 */

#ifndef TINY_CPP_CLIENT_CampaignPlanningConversionRate_H_
#define TINY_CPP_CLIENT_CampaignPlanningConversionRate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CampaignPlanningConversionAttribution.h"
#include "CampaignPlanningConversionEvent.h"

namespace Tiny {


/*! \brief Conversion rate estimate for a specific conversion event and attribution window combination.
 *
 *  \ingroup Models
 *
 */

class CampaignPlanningConversionRate{
public:

    /*! \brief Constructor.
	 */
    CampaignPlanningConversionRate();
    CampaignPlanningConversionRate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignPlanningConversionRate();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CampaignPlanningConversionAttribution getAttributionWindows();

	/*! \brief Set 
	 */
	void setAttributionWindows(CampaignPlanningConversionAttribution attribution_windows);
	/*! \brief Get 
	 */
	CampaignPlanningConversionEvent getConversionEvent();

	/*! \brief Set 
	 */
	void setConversionEvent(CampaignPlanningConversionEvent conversion_event);
	/*! \brief Get Conversion rate estimate. Used to translate impressions into conversions for oCPM ads.
	 */
	float getConversionRate();

	/*! \brief Set Conversion rate estimate. Used to translate impressions into conversions for oCPM ads.
	 */
	void setConversionRate(float conversion_rate);


    private:
    CampaignPlanningConversionAttribution attribution_windows;
    CampaignPlanningConversionEvent conversion_event;
    float conversion_rate{};
};
}

#endif /* TINY_CPP_CLIENT_CampaignPlanningConversionRate_H_ */
