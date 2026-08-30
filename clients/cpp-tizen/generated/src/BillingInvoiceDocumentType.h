/*
 * BillingInvoiceDocumentType.h
 *
 * The type of a billing invoice document.
 */

#ifndef _BillingInvoiceDocumentType_H_
#define _BillingInvoiceDocumentType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The type of a billing invoice document.
 *
 *  \ingroup Models
 *
 */

class BillingInvoiceDocumentType : public Object {
public:
	/*! \brief Constructor.
	 */
	BillingInvoiceDocumentType();
	BillingInvoiceDocumentType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BillingInvoiceDocumentType();

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

#endif /* _BillingInvoiceDocumentType_H_ */
