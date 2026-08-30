/*
 * CampaignPlanningConversionAttributionWindowDays.h
 *
 * Conversion attribution window in days.
 */

#ifndef _CampaignPlanningConversionAttributionWindowDays_H_
#define _CampaignPlanningConversionAttributionWindowDays_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Conversion attribution window in days.
 *
 *  \ingroup Models
 *
 */

class CampaignPlanningConversionAttributionWindowDays : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignPlanningConversionAttributionWindowDays();
	CampaignPlanningConversionAttributionWindowDays(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignPlanningConversionAttributionWindowDays();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _CampaignPlanningConversionAttributionWindowDays_H_ */
