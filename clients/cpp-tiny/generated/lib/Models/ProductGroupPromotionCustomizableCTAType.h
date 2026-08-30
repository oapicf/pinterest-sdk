
/*
 * ProductGroupPromotionCustomizableCTAType.h
 *
 * Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE
 */

#ifndef TINY_CPP_CLIENT_ProductGroupPromotionCustomizableCTAType_H_
#define TINY_CPP_CLIENT_ProductGroupPromotionCustomizableCTAType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE
 *
 *  \ingroup Models
 *
 */

class ProductGroupPromotionCustomizableCTAType{
public:

    /*! \brief Constructor.
	 */
    ProductGroupPromotionCustomizableCTAType();
    ProductGroupPromotionCustomizableCTAType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ProductGroupPromotionCustomizableCTAType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_ProductGroupPromotionCustomizableCTAType_H_ */
