/*
 * ProductAvailability.h
 *
 * Product availability.
 */

#ifndef _ProductAvailability_H_
#define _ProductAvailability_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Product availability.
 *
 *  \ingroup Models
 *
 */

class ProductAvailability : public Object {
public:
	/*! \brief Constructor.
	 */
	ProductAvailability();
	ProductAvailability(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProductAvailability();

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

#endif /* _ProductAvailability_H_ */
