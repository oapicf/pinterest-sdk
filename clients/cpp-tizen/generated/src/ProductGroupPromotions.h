/*
 * ProductGroupPromotions.h
 *
 * Wrapper model for ProductGroupPromotion.
 */

#ifndef _ProductGroupPromotions_H_
#define _ProductGroupPromotions_H_


#include <string>
#include "ProductGroupPromotionResponseItem.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Wrapper model for ProductGroupPromotion.
 *
 *  \ingroup Models
 *
 */

class ProductGroupPromotions : public Object {
public:
	/*! \brief Constructor.
	 */
	ProductGroupPromotions();
	ProductGroupPromotions(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProductGroupPromotions();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Response-only: created or updated product group promotions, or exceptions.
	 */
	std::list<ProductGroupPromotionResponseItem> getItems();

	/*! \brief Set Response-only: created or updated product group promotions, or exceptions.
	 */
	void setItems(std::list <ProductGroupPromotionResponseItem> items);

private:
	std::list <ProductGroupPromotionResponseItem>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ProductGroupPromotions_H_ */
