/*
 * BillingType.h
 *
 * Advertisers billing type
 */

#ifndef _BillingType_H_
#define _BillingType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Advertisers billing type
 *
 *  \ingroup Models
 *
 */

class BillingType : public Object {
public:
	/*! \brief Constructor.
	 */
	BillingType();
	BillingType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BillingType();

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

#endif /* _BillingType_H_ */
