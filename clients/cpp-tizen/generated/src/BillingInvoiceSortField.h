/*
 * BillingInvoiceSortField.h
 *
 * Field by which to sort billing invoices.
 */

#ifndef _BillingInvoiceSortField_H_
#define _BillingInvoiceSortField_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Field by which to sort billing invoices.
 *
 *  \ingroup Models
 *
 */

class BillingInvoiceSortField : public Object {
public:
	/*! \brief Constructor.
	 */
	BillingInvoiceSortField();
	BillingInvoiceSortField(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BillingInvoiceSortField();

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

#endif /* _BillingInvoiceSortField_H_ */
