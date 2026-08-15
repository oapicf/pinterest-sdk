
/*
 * Billing_invoices_get_200_response.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Billing_invoices_get_200_response_H_
#define TINY_CPP_CLIENT_Billing_invoices_get_200_response_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BillingInvoiceResponse.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Billing_invoices_get_200_response{
public:

    /*! \brief Constructor.
	 */
    Billing_invoices_get_200_response();
    Billing_invoices_get_200_response(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Billing_invoices_get_200_response();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getBookmark();

	/*! \brief Set 
	 */
	void setBookmark(std::string  bookmark);
	/*! \brief Get 
	 */
	std::list<BillingInvoiceResponse> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <BillingInvoiceResponse> items);


    private:
    std::string bookmark{};
    std::list<BillingInvoiceResponse> items;
};
}

#endif /* TINY_CPP_CLIENT_Billing_invoices_get_200_response_H_ */
