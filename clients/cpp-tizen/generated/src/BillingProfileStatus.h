/*
 * BillingProfileStatus.h
 *
 * Billing profile status
 */

#ifndef _BillingProfileStatus_H_
#define _BillingProfileStatus_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Billing profile status
 *
 *  \ingroup Models
 *
 */

class BillingProfileStatus : public Object {
public:
	/*! \brief Constructor.
	 */
	BillingProfileStatus();
	BillingProfileStatus(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BillingProfileStatus();

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

#endif /* _BillingProfileStatus_H_ */
