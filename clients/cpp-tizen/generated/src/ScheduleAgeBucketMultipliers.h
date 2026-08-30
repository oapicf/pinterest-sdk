/*
 * ScheduleAgeBucketMultipliers.h
 *
 * This represents a mapping from age bucket to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 */

#ifndef _ScheduleAgeBucketMultipliers_H_
#define _ScheduleAgeBucketMultipliers_H_


#include <string>
#include <map>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief This represents a mapping from age bucket to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 *
 *  \ingroup Models
 *
 */

class ScheduleAgeBucketMultipliers : public Object {
public:
	/*! \brief Constructor.
	 */
	ScheduleAgeBucketMultipliers();
	ScheduleAgeBucketMultipliers(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ScheduleAgeBucketMultipliers();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getAGEBUCKET();

	/*! \brief Set 
	 */
	void setAGEBUCKET(std::string  aGE_BUCKET);

private:
	std::string aGE_BUCKET;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ScheduleAgeBucketMultipliers_H_ */
