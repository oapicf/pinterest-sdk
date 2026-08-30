
/*
 * CampaignPlanningConversionAttribution.h
 *
 * Attribution windows for a conversion event.
 */

#ifndef TINY_CPP_CLIENT_CampaignPlanningConversionAttribution_H_
#define TINY_CPP_CLIENT_CampaignPlanningConversionAttribution_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CampaignPlanningConversionAttributionWindowDays.h"

namespace Tiny {


/*! \brief Attribution windows for a conversion event.
 *
 *  \ingroup Models
 *
 */

class CampaignPlanningConversionAttribution{
public:

    /*! \brief Constructor.
	 */
    CampaignPlanningConversionAttribution();
    CampaignPlanningConversionAttribution(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignPlanningConversionAttribution();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Number of days to use as the conversion attribution window for a pin click action.
	 */
	CampaignPlanningConversionAttributionWindowDays getClickWindowDays();

	/*! \brief Set Number of days to use as the conversion attribution window for a pin click action.
	 */
	void setClickWindowDays(CampaignPlanningConversionAttributionWindowDays click_window_days);
	/*! \brief Get Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes.
	 */
	CampaignPlanningConversionAttributionWindowDays getEngagementWindowDays();

	/*! \brief Set Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes.
	 */
	void setEngagementWindowDays(CampaignPlanningConversionAttributionWindowDays engagement_window_days);
	/*! \brief Get Number of days to use as the conversion attribution window for a view action.
	 */
	CampaignPlanningConversionAttributionWindowDays getViewWindowDays();

	/*! \brief Set Number of days to use as the conversion attribution window for a view action.
	 */
	void setViewWindowDays(CampaignPlanningConversionAttributionWindowDays view_window_days);


    private:
    CampaignPlanningConversionAttributionWindowDays click_window_days;
    CampaignPlanningConversionAttributionWindowDays engagement_window_days;
    CampaignPlanningConversionAttributionWindowDays view_window_days;
};
}

#endif /* TINY_CPP_CLIENT_CampaignPlanningConversionAttribution_H_ */
