/*
 * ScheduleAudienceMultipliers.h
 *
 * This represents a mapping from Audience ID to a bid price change value. This is paired with the bid_multipliers schedule type. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 */

#ifndef _ScheduleAudienceMultipliers_H_
#define _ScheduleAudienceMultipliers_H_


#include <string>
#include <map>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief This represents a mapping from Audience ID to a bid price change value. This is paired with the bid_multipliers schedule type. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 *
 *  \ingroup Models
 *
 */

class ScheduleAudienceMultipliers : public Object {
public:
	/*! \brief Constructor.
	 */
	ScheduleAudienceMultipliers();
	ScheduleAudienceMultipliers(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ScheduleAudienceMultipliers();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getAUDIENCEID();

	/*! \brief Set 
	 */
	void setAUDIENCEID(std::string  aUDIENCE_ID);

private:
	std::string aUDIENCE_ID;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ScheduleAudienceMultipliers_H_ */
