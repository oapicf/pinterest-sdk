/*
 * ItemAvailability.h
 *
 * Availability of the item
 */

#ifndef _ItemAvailability_H_
#define _ItemAvailability_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Availability of the item
 *
 *  \ingroup Models
 *
 */

class ItemAvailability : public Object {
public:
	/*! \brief Constructor.
	 */
	ItemAvailability();
	ItemAvailability(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ItemAvailability();

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

#endif /* _ItemAvailability_H_ */
