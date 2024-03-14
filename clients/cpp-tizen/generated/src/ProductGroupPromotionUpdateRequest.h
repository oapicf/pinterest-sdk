/*
 * ProductGroupPromotionUpdateRequest.h
 *
 * 
 */

#ifndef _ProductGroupPromotionUpdateRequest_H_
#define _ProductGroupPromotionUpdateRequest_H_


#include <string>
#include "ProductGroupPromotionUpdateItem.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ProductGroupPromotionUpdateRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	ProductGroupPromotionUpdateRequest();
	ProductGroupPromotionUpdateRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProductGroupPromotionUpdateRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get ID of the ad group the product group belongs to.
	 */
	std::string getAdGroupId();

	/*! \brief Set ID of the ad group the product group belongs to.
	 */
	void setAdGroupId(std::string  ad_group_id);
	/*! \brief Get 
	 */
	std::list<ProductGroupPromotionUpdateItem> getProductGroupPromotion();

	/*! \brief Set 
	 */
	void setProductGroupPromotion(std::list <ProductGroupPromotionUpdateItem> product_group_promotion);

private:
	std::string ad_group_id;
	std::list <ProductGroupPromotionUpdateItem>product_group_promotion;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ProductGroupPromotionUpdateRequest_H_ */
