/*
 * PlacementType.h
 *
 * Placement type for bid multiplier targeting.
 */

#ifndef _PlacementType_H_
#define _PlacementType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Placement type for bid multiplier targeting.
 *
 *  \ingroup Models
 *
 */

class PlacementType : public Object {
public:
	/*! \brief Constructor.
	 */
	PlacementType();
	PlacementType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PlacementType();

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

#endif /* _PlacementType_H_ */
