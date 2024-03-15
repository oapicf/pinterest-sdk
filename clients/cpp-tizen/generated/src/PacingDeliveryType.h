/*
 * PacingDeliveryType.h
 *
 * Ad group pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day. When using CBO, only the STANDARD pacing delivery type is allowed.
 */

#ifndef _PacingDeliveryType_H_
#define _PacingDeliveryType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ad group pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day. When using CBO, only the STANDARD pacing delivery type is allowed.
 *
 *  \ingroup Models
 *
 */

class PacingDeliveryType : public Object {
public:
	/*! \brief Constructor.
	 */
	PacingDeliveryType();
	PacingDeliveryType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PacingDeliveryType();

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

#endif /* _PacingDeliveryType_H_ */
