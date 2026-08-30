/*
 * DiscountStatus.h
 *
 * Discount status based on the current time and start and end time of discount
 */

#ifndef _DiscountStatus_H_
#define _DiscountStatus_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Discount status based on the current time and start and end time of discount
 *
 *  \ingroup Models
 *
 */

class DiscountStatus : public Object {
public:
	/*! \brief Constructor.
	 */
	DiscountStatus();
	DiscountStatus(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DiscountStatus();

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

#endif /* _DiscountStatus_H_ */
