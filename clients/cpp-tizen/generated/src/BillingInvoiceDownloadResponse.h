/*
 * BillingInvoiceDownloadResponse.h
 *
 * 
 */

#ifndef _BillingInvoiceDownloadResponse_H_
#define _BillingInvoiceDownloadResponse_H_


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

class BillingInvoiceDownloadResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	BillingInvoiceDownloadResponse();
	BillingInvoiceDownloadResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BillingInvoiceDownloadResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The download url for the billing invoice
	 */
	std::string getDownloadUrl();

	/*! \brief Set The download url for the billing invoice
	 */
	void setDownloadUrl(std::string  download_url);
	/*! \brief Get The billing invoice id
	 */
	std::string getId();

	/*! \brief Set The billing invoice id
	 */
	void setId(std::string  id);

private:
	std::string download_url;
	std::string id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BillingInvoiceDownloadResponse_H_ */
