
/*
 * BillingProfilePaymentMethodBrand.h
 *
 * Brand of the payment method.
 */

#ifndef TINY_CPP_CLIENT_BillingProfilePaymentMethodBrand_H_
#define TINY_CPP_CLIENT_BillingProfilePaymentMethodBrand_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Brand of the payment method.
 *
 *  \ingroup Models
 *
 */

class BillingProfilePaymentMethodBrand{
public:

    /*! \brief Constructor.
	 */
    BillingProfilePaymentMethodBrand();
    BillingProfilePaymentMethodBrand(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BillingProfilePaymentMethodBrand();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_BillingProfilePaymentMethodBrand_H_ */
