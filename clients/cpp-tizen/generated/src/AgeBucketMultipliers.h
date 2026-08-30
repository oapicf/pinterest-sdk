/*
 * AgeBucketMultipliers.h
 *
 * This represents a mapping from age bucket to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified age bucket in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
 */

#ifndef _AgeBucketMultipliers_H_
#define _AgeBucketMultipliers_H_


#include <string>
#include "TargetingSpecAgeBucket.h"
#include <map>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief This represents a mapping from age bucket to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified age bucket in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
 *
 *  \ingroup Models
 *
 */

class AgeBucketMultipliers : public Object {
public:
	/*! \brief Constructor.
	 */
	AgeBucketMultipliers();
	AgeBucketMultipliers(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AgeBucketMultipliers();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Age bucket identifier.
	 */
	TargetingSpecAgeBucket getAGEBUCKET();

	/*! \brief Set Age bucket identifier.
	 */
	void setAGEBUCKET(TargetingSpecAgeBucket  aGE_BUCKET);

private:
	TargetingSpecAgeBucket aGE_BUCKET;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AgeBucketMultipliers_H_ */
