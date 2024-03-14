/*
 * CatalogsProductGroupType.h
 *
 * &lt;p&gt;Catalog product group type&lt;/p&gt; &lt;p&gt;MERCHANT_CREATED: Product groups created by merchants. &lt;br&gt;ALL_PRODUCTS: Consists of every product in your latest successful feed upload. &lt;br&gt;BEST_DEALS: Consists of products with the deepest drop in price. &lt;br&gt;PINNER_FAVORITES: Consists of products that are resonating most with people on Pinterest, based on engagement. &lt;br&gt;TOP_SELLERS: Consists of products with the highest conversion rate, if you have the conversion tag installed. &lt;br&gt;BACK_IN_STOCK: Consists of products that were previously out of stock and are now in stock. &lt;br&gt;NEW_ARRIVALS: Consists of products that are new to your Catalog. &lt;br&gt;SHOPIFY_COLLECTION: Product groups created based on Shopify Product Collections. &lt;br&gt;I2PC: Product groups created based on predicted product category.&lt;/p&gt;
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


/*! \brief <p>Catalog product group type</p> <p>MERCHANT_CREATED: Product groups created by merchants. <br>ALL_PRODUCTS: Consists of every product in your latest successful feed upload. <br>BEST_DEALS: Consists of products with the deepest drop in price. <br>PINNER_FAVORITES: Consists of products that are resonating most with people on Pinterest, based on engagement. <br>TOP_SELLERS: Consists of products with the highest conversion rate, if you have the conversion tag installed. <br>BACK_IN_STOCK: Consists of products that were previously out of stock and are now in stock. <br>NEW_ARRIVALS: Consists of products that are new to your Catalog. <br>SHOPIFY_COLLECTION: Product groups created based on Shopify Product Collections. <br>I2PC: Product groups created based on predicted product category.</p>
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
