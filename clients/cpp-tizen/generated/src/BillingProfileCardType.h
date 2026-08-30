/*
 * BillingProfileCardType.h
 *
 * Type of the credit card.
 */

#ifndef _BillingProfileCardType_H_
#define _BillingProfileCardType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Type of the credit card.
 *
 *  \ingroup Models
 *
 */

class BillingProfileCardType : public Object {
public:
	/*! \brief Constructor.
	 */
	BillingProfileCardType();
	BillingProfileCardType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BillingProfileCardType();

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

#endif /* _BillingProfileCardType_H_ */
