/*
 * GenderMultipliers.h
 *
 * This represents a mapping from gender targeting criteria to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified gender in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
 */

#ifndef _GenderMultipliers_H_
#define _GenderMultipliers_H_


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


/*! \brief This represents a mapping from gender targeting criteria to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified gender in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
 *
 *  \ingroup Models
 *
 */

class GenderMultipliers : public Object {
public:
	/*! \brief Constructor.
	 */
	GenderMultipliers();
	GenderMultipliers(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GenderMultipliers();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Gender identifier.
	 */
	TargetingSpecGender getGENDER();

	/*! \brief Set Gender identifier.
	 */
	void setGENDER(TargetingSpecGender  gENDER);

private:
	TargetingSpecGender gENDER;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GenderMultipliers_H_ */
