/*
 * PlacementTrafficType.h
 *
 * A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both.
 */

#ifndef _PlacementTrafficType_H_
#define _PlacementTrafficType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both.
 *
 *  \ingroup Models
 *
 */

class PlacementTrafficType : public Object {
public:
	/*! \brief Constructor.
	 */
	PlacementTrafficType();
	PlacementTrafficType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PlacementTrafficType();

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

#endif /* _PlacementTrafficType_H_ */
