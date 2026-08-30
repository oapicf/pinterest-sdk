/*
 * CampaignPlanningConversionAttribution.h
 *
 * Attribution windows for a conversion event.
 */

#ifndef _CampaignPlanningConversionAttribution_H_
#define _CampaignPlanningConversionAttribution_H_


#include <string>
#include "CampaignPlanningConversionAttributionWindowDays.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Attribution windows for a conversion event.
 *
 *  \ingroup Models
 *
 */

class CampaignPlanningConversionAttribution : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignPlanningConversionAttribution();
	CampaignPlanningConversionAttribution(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignPlanningConversionAttribution();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Number of days to use as the conversion attribution window for a pin click action.
	 */
	CampaignPlanningConversionAttributionWindowDays getClickWindowDays();

	/*! \brief Set Number of days to use as the conversion attribution window for a pin click action.
	 */
	void setClickWindowDays(CampaignPlanningConversionAttributionWindowDays  click_window_days);
	/*! \brief Get Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes.
	 */
	CampaignPlanningConversionAttributionWindowDays getEngagementWindowDays();

	/*! \brief Set Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes.
	 */
	void setEngagementWindowDays(CampaignPlanningConversionAttributionWindowDays  engagement_window_days);
	/*! \brief Get Number of days to use as the conversion attribution window for a view action.
	 */
	CampaignPlanningConversionAttributionWindowDays getViewWindowDays();

	/*! \brief Set Number of days to use as the conversion attribution window for a view action.
	 */
	void setViewWindowDays(CampaignPlanningConversionAttributionWindowDays  view_window_days);

private:
	CampaignPlanningConversionAttributionWindowDays click_window_days;
	CampaignPlanningConversionAttributionWindowDays engagement_window_days;
	CampaignPlanningConversionAttributionWindowDays view_window_days;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CampaignPlanningConversionAttribution_H_ */
