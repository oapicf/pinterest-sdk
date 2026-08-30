
/*
 * BillingInvoiceDocumentType.h
 *
 * The type of a billing invoice document.
 */

#ifndef TINY_CPP_CLIENT_BillingInvoiceDocumentType_H_
#define TINY_CPP_CLIENT_BillingInvoiceDocumentType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The type of a billing invoice document.
 *
 *  \ingroup Models
 *
 */

class BillingInvoiceDocumentType{
public:

    /*! \brief Constructor.
	 */
    BillingInvoiceDocumentType();
    BillingInvoiceDocumentType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BillingInvoiceDocumentType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_BillingInvoiceDocumentType_H_ */
