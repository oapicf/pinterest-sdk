
/*
 * ProductGroupPromotionsUpdateWithRequiredBody.h
 *
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */

#ifndef TINY_CPP_CLIENT_ProductGroupPromotionsUpdateWithRequiredBody_H_
#define TINY_CPP_CLIENT_ProductGroupPromotionsUpdateWithRequiredBody_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ProductGroupPromotion.h"
#include <list>

namespace Tiny {


/*! \brief Resource create or update operation model with required body fields (no OptionalProperties).
 *
 *  \ingroup Models
 *
 */

class ProductGroupPromotionsUpdateWithRequiredBody{
public:

    /*! \brief Constructor.
	 */
    ProductGroupPromotionsUpdateWithRequiredBody();
    ProductGroupPromotionsUpdateWithRequiredBody(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ProductGroupPromotionsUpdateWithRequiredBody();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get ID of the ad group the product group promotion belongs to.
	 */
	std::string getAdGroupId();

	/*! \brief Set ID of the ad group the product group promotion belongs to.
	 */
	void setAdGroupId(std::string ad_group_id);
	/*! \brief Get List of product group promotions to create or update.
	 */
	std::list<ProductGroupPromotion> getProductGroupPromotion();

	/*! \brief Set List of product group promotions to create or update.
	 */
	void setProductGroupPromotion(std::list<ProductGroupPromotion> product_group_promotion);


    private:
    std::string ad_group_id{};
    std::list<ProductGroupPromotion> product_group_promotion;
};
}

#endif /* TINY_CPP_CLIENT_ProductGroupPromotionsUpdateWithRequiredBody_H_ */
