
/*
 * ProductGroupPromotionResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ProductGroupPromotionResponse_H_
#define TINY_CPP_CLIENT_ProductGroupPromotionResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ProductGroupPromotionResponseItem.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ProductGroupPromotionResponse{
public:

    /*! \brief Constructor.
	 */
    ProductGroupPromotionResponse();
    ProductGroupPromotionResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ProductGroupPromotionResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<ProductGroupPromotionResponseItem> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <ProductGroupPromotionResponseItem> items);


    private:
    std::list<ProductGroupPromotionResponseItem> items;
};
}

#endif /* TINY_CPP_CLIENT_ProductGroupPromotionResponse_H_ */
