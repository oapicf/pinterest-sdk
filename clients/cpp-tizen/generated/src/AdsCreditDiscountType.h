/*
 * AdsCreditDiscountType.h
 *
 * 
 */

#ifndef _AdsCreditDiscountType_H_
#define _AdsCreditDiscountType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdsCreditDiscountType : public Object {
public:
	/*! \brief Constructor.
	 */
	AdsCreditDiscountType();
	AdsCreditDiscountType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdsCreditDiscountType();

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

#endif /* _AdsCreditDiscountType_H_ */
