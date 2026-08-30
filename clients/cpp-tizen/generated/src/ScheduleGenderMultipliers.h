/*
 * ScheduleGenderMultipliers.h
 *
 * This represents a mapping from gender targeting criteria to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 */

#ifndef _ScheduleGenderMultipliers_H_
#define _ScheduleGenderMultipliers_H_


#include <string>
#include "TargetingSpecGender.h"
#include <map>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief This represents a mapping from gender targeting criteria to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 *
 *  \ingroup Models
 *
 */

class ScheduleGenderMultipliers : public Object {
public:
	/*! \brief Constructor.
	 */
	ScheduleGenderMultipliers();
	ScheduleGenderMultipliers(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ScheduleGenderMultipliers();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	TargetingSpecGender getGENDER();

	/*! \brief Set 
	 */
	void setGENDER(TargetingSpecGender  gENDER);

private:
	TargetingSpecGender gENDER;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ScheduleGenderMultipliers_H_ */
