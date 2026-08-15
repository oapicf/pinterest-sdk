
/*
 * CustomizableCTAType.h
 *
 * Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_SITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)
 */

#ifndef TINY_CPP_CLIENT_CustomizableCTAType_H_
#define TINY_CPP_CLIENT_CustomizableCTAType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_SITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)
 *
 *  \ingroup Models
 *
 */

class CustomizableCTAType{
public:

    /*! \brief Constructor.
	 */
    CustomizableCTAType();
    CustomizableCTAType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CustomizableCTAType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_CustomizableCTAType_H_ */
