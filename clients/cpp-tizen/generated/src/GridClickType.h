/*
 * GridClickType.h
 *
 * Where a user is taken after clicking on an ad in grid.
 */

#ifndef _GridClickType_H_
#define _GridClickType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Where a user is taken after clicking on an ad in grid.
 *
 *  \ingroup Models
 *
 */

class GridClickType : public Object {
public:
	/*! \brief Constructor.
	 */
	GridClickType();
	GridClickType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GridClickType();

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

#endif /* _GridClickType_H_ */
