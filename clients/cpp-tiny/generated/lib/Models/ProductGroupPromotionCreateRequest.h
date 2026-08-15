
/*
 * ProductGroupPromotionCreateRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ProductGroupPromotionCreateRequest_H_
#define TINY_CPP_CLIENT_ProductGroupPromotionCreateRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ProductGroupPromotion.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ProductGroupPromotionCreateRequest{
public:

    /*! \brief Constructor.
	 */
    ProductGroupPromotionCreateRequest();
    ProductGroupPromotionCreateRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ProductGroupPromotionCreateRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get ID of the Ad Group the Product Group Promotion belongs to.
	 */
	std::string getAdGroupId();

	/*! \brief Set ID of the Ad Group the Product Group Promotion belongs to.
	 */
	void setAdGroupId(std::string  ad_group_id);
	/*! \brief Get 
	 */
	std::list<ProductGroupPromotion> getProductGroupPromotion();

	/*! \brief Set 
	 */
	void setProductGroupPromotion(std::list <ProductGroupPromotion> product_group_promotion);


    private:
    std::string ad_group_id{};
    std::list<ProductGroupPromotion> product_group_promotion;
};
}

#endif /* TINY_CPP_CLIENT_ProductGroupPromotionCreateRequest_H_ */
