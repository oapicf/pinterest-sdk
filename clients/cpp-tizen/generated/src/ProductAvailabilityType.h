/*
 * ProductAvailabilityType.h
 *
 * Default availability for products in a feed.
 */

#ifndef _ProductAvailabilityType_H_
#define _ProductAvailabilityType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Default availability for products in a feed.
 *
 *  \ingroup Models
 *
 */

class ProductAvailabilityType : public Object {
public:
	/*! \brief Constructor.
	 */
	ProductAvailabilityType();
	ProductAvailabilityType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProductAvailabilityType();

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

#endif /* _ProductAvailabilityType_H_ */
