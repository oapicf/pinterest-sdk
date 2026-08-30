
/*
 * BillingType.h
 *
 * Advertisers billing type
 */

#ifndef TINY_CPP_CLIENT_BillingType_H_
#define TINY_CPP_CLIENT_BillingType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Advertisers billing type
 *
 *  \ingroup Models
 *
 */

class BillingType{
public:

    /*! \brief Constructor.
	 */
    BillingType();
    BillingType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BillingType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_BillingType_H_ */
