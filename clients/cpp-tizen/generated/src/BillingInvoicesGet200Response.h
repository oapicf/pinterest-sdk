/*
 * Billing_invoices_get_200_response.h
 *
 * 
 */

#ifndef _Billing_invoices_get_200_response_H_
#define _Billing_invoices_get_200_response_H_


#include <string>
#include "BillingInvoice.h"
#include <list>
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

class Billing_invoices_get_200_response : public Object {
public:
	/*! \brief Constructor.
	 */
	Billing_invoices_get_200_response();
	Billing_invoices_get_200_response(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Billing_invoices_get_200_response();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getBookmark();

	/*! \brief Set 
	 */
	void setBookmark(std::string  bookmark);
	/*! \brief Get 
	 */
	std::list<BillingInvoice> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <BillingInvoice> items);

private:
	std::string bookmark;
	std::list <BillingInvoice>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Billing_invoices_get_200_response_H_ */
