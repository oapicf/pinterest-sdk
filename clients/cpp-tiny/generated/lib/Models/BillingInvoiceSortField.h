
/*
 * BillingInvoiceSortField.h
 *
 * Field by which to sort billing invoices.
 */

#ifndef TINY_CPP_CLIENT_BillingInvoiceSortField_H_
#define TINY_CPP_CLIENT_BillingInvoiceSortField_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Field by which to sort billing invoices.
 *
 *  \ingroup Models
 *
 */

class BillingInvoiceSortField{
public:

    /*! \brief Constructor.
	 */
    BillingInvoiceSortField();
    BillingInvoiceSortField(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BillingInvoiceSortField();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_BillingInvoiceSortField_H_ */
