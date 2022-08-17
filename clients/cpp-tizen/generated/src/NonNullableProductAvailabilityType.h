/*
 * NonNullableProductAvailabilityType.h
 *
 * Product availability.
 */

#ifndef _NonNullableProductAvailabilityType_H_
#define _NonNullableProductAvailabilityType_H_


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

class NonNullableProductAvailabilityType : public Object {
public:
	/*! \brief Constructor.
	 */
	NonNullableProductAvailabilityType();
	NonNullableProductAvailabilityType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~NonNullableProductAvailabilityType();

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

#endif /* _NonNullableProductAvailabilityType_H_ */
