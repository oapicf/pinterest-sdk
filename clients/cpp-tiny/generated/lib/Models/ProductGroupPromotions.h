
/*
 * ProductGroupPromotions.h
 *
 * Wrapper model for ProductGroupPromotion.
 */

#ifndef TINY_CPP_CLIENT_ProductGroupPromotions_H_
#define TINY_CPP_CLIENT_ProductGroupPromotions_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ProductGroupPromotionResponseItem.h"
#include <list>

namespace Tiny {


/*! \brief Wrapper model for ProductGroupPromotion.
 *
 *  \ingroup Models
 *
 */

class ProductGroupPromotions{
public:

    /*! \brief Constructor.
	 */
    ProductGroupPromotions();
    ProductGroupPromotions(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ProductGroupPromotions();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Response-only: created or updated product group promotions, or exceptions.
	 */
	std::list<ProductGroupPromotionResponseItem> getItems();

	/*! \brief Set Response-only: created or updated product group promotions, or exceptions.
	 */
	void setItems(std::list<ProductGroupPromotionResponseItem> items);


    private:
    std::list<ProductGroupPromotionResponseItem> items;
};
}

#endif /* TINY_CPP_CLIENT_ProductGroupPromotions_H_ */
