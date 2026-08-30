/*
 * BillingInvoiceStatus.h
 *
 * The status of a billing invoice.
 */

#ifndef _BillingInvoiceStatus_H_
#define _BillingInvoiceStatus_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The status of a billing invoice.
 *
 *  \ingroup Models
 *
 */

class BillingInvoiceStatus : public Object {
public:
	/*! \brief Constructor.
	 */
	BillingInvoiceStatus();
	BillingInvoiceStatus(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BillingInvoiceStatus();

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

#endif /* _BillingInvoiceStatus_H_ */
