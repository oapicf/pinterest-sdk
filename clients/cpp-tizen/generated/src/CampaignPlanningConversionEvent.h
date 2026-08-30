/*
 * CampaignPlanningConversionEvent.h
 *
 * Conversion event for which a conversion rate estimate is computed.
 */

#ifndef _CampaignPlanningConversionEvent_H_
#define _CampaignPlanningConversionEvent_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Conversion event for which a conversion rate estimate is computed.
 *
 *  \ingroup Models
 *
 */

class CampaignPlanningConversionEvent : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignPlanningConversionEvent();
	CampaignPlanningConversionEvent(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignPlanningConversionEvent();

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

#endif /* _CampaignPlanningConversionEvent_H_ */
