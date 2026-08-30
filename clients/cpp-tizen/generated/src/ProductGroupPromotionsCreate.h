/*
 * ProductGroupPromotionsCreate.h
 *
 * Resource create operation model.
 */

#ifndef _ProductGroupPromotionsCreate_H_
#define _ProductGroupPromotionsCreate_H_


#include <string>
#include "ProductGroupPromotion.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class ProductGroupPromotionsCreate : public Object {
public:
	/*! \brief Constructor.
	 */
	ProductGroupPromotionsCreate();
	ProductGroupPromotionsCreate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProductGroupPromotionsCreate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get ID of the ad group the product group promotion belongs to.
	 */
	std::string getAdGroupId();

	/*! \brief Set ID of the ad group the product group promotion belongs to.
	 */
	void setAdGroupId(std::string  ad_group_id);
	/*! \brief Get List of product group promotions to create or update.
	 */
	std::list<ProductGroupPromotion> getProductGroupPromotion();

	/*! \brief Set List of product group promotions to create or update.
	 */
	void setProductGroupPromotion(std::list <ProductGroupPromotion> product_group_promotion);

private:
	std::string ad_group_id;
	std::list <ProductGroupPromotion>product_group_promotion;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ProductGroupPromotionsCreate_H_ */
