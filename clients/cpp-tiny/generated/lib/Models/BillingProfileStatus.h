
/*
 * BillingProfileStatus.h
 *
 * Billing profile status
 */

#ifndef TINY_CPP_CLIENT_BillingProfileStatus_H_
#define TINY_CPP_CLIENT_BillingProfileStatus_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Billing profile status
 *
 *  \ingroup Models
 *
 */

class BillingProfileStatus{
public:

    /*! \brief Constructor.
	 */
    BillingProfileStatus();
    BillingProfileStatus(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BillingProfileStatus();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_BillingProfileStatus_H_ */
