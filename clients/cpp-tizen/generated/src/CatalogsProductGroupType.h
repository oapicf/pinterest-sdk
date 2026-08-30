/*
 * CatalogsProductGroupType.h
 *
 * Catalog product group type  - **MERCHANT_CREATED**: Product groups created by merchants. - **ALL_PRODUCTS**: Consists of every product in your latest successful feed upload. - **BEST_DEALS**: Consists of products with the deepest drop in price. - **PINNER_FAVORITES**: Consists of products that are resonating most with people on Pinterest, based on engagement. - **TOP_SELLERS**: Consists of products with the highest conversion rate, if you have the conversion tag installed. - **BACK_IN_STOCK**: Consists of products that were previously out of stock and are now in stock. - **NEW_ARRIVALS**: Consists of products that are new to your Catalog. - **SHOPIFY_COLLECTIONS**: Product groups created based on Shopify Product Collections. - **I2PC**: Product groups created based on predicted product category. - **CATALOG_EXPANSION**: Consists of high-potential, recommended products from your catalog.
 */

#ifndef _CatalogsProductGroupType_H_
#define _CatalogsProductGroupType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Catalog product group type  - **MERCHANT_CREATED**: Product groups created by merchants. - **ALL_PRODUCTS**: Consists of every product in your latest successful feed upload. - **BEST_DEALS**: Consists of products with the deepest drop in price. - **PINNER_FAVORITES**: Consists of products that are resonating most with people on Pinterest, based on engagement. - **TOP_SELLERS**: Consists of products with the highest conversion rate, if you have the conversion tag installed. - **BACK_IN_STOCK**: Consists of products that were previously out of stock and are now in stock. - **NEW_ARRIVALS**: Consists of products that are new to your Catalog. - **SHOPIFY_COLLECTIONS**: Product groups created based on Shopify Product Collections. - **I2PC**: Product groups created based on predicted product category. - **CATALOG_EXPANSION**: Consists of high-potential, recommended products from your catalog.
 *
 *  \ingroup Models
 *
 */

class CatalogsProductGroupType : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsProductGroupType();
	CatalogsProductGroupType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsProductGroupType();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsProductGroupType_H_ */
