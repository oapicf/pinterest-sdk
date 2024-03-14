/*
 * PlacementGroupType.h
 *
 * Campaign placement group type
 */

#ifndef _PlacementGroupType_H_
#define _PlacementGroupType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Campaign placement group type
 *
 *  \ingroup Models
 *
 */

class PlacementGroupType : public Object {
public:
	/*! \brief Constructor.
	 */
	PlacementGroupType();
	PlacementGroupType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PlacementGroupType();

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

#endif /* _PlacementGroupType_H_ */
