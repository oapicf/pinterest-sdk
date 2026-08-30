
/*
 * BillingInvoiceStatus.h
 *
 * The status of a billing invoice.
 */

#ifndef TINY_CPP_CLIENT_BillingInvoiceStatus_H_
#define TINY_CPP_CLIENT_BillingInvoiceStatus_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The status of a billing invoice.
 *
 *  \ingroup Models
 *
 */

class BillingInvoiceStatus{
public:

    /*! \brief Constructor.
	 */
    BillingInvoiceStatus();
    BillingInvoiceStatus(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BillingInvoiceStatus();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_BillingInvoiceStatus_H_ */
