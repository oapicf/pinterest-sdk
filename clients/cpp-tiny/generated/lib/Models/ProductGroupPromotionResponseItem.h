
/*
 * ProductGroupPromotionResponseItem.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ProductGroupPromotionResponseItem_H_
#define TINY_CPP_CLIENT_ProductGroupPromotionResponseItem_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Exception.h"
#include "ProductGroupPromotion.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ProductGroupPromotionResponseItem{
public:

    /*! \brief Constructor.
	 */
    ProductGroupPromotionResponseItem();
    ProductGroupPromotionResponseItem(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ProductGroupPromotionResponseItem();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ProductGroupPromotion getData();

	/*! \brief Set 
	 */
	void setData(ProductGroupPromotion  data);
	/*! \brief Get 
	 */
	std::list<Exception> getExceptions();

	/*! \brief Set 
	 */
	void setExceptions(std::list <Exception> exceptions);


    private:
    ProductGroupPromotion data;
    std::list<Exception> exceptions;
};
}

#endif /* TINY_CPP_CLIENT_ProductGroupPromotionResponseItem_H_ */
