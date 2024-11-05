/*
 * AppTypeMultipliers.h
 *
 * This represents a mapping from app type targeting criteria to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified app type in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
 */

#ifndef _AppTypeMultipliers_H_
#define _AppTypeMultipliers_H_


#include <string>
#include "TargetingSpecAppType.h"
#include <map>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief This represents a mapping from app type targeting criteria to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified app type in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
 *
 *  \ingroup Models
 *
 */

class AppTypeMultipliers : public Object {
public:
	/*! \brief Constructor.
	 */
	AppTypeMultipliers();
	AppTypeMultipliers(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AppTypeMultipliers();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	TargetingSpecAppType getAPPTYPE();

	/*! \brief Set 
	 */
	void setAPPTYPE(TargetingSpecAppType  aPP_TYPE);

private:
	TargetingSpecAppType aPP_TYPE;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AppTypeMultipliers_H_ */
