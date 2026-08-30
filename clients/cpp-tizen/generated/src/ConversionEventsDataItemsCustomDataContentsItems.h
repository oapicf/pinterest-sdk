/*
 * ConversionEventsDataItemsCustomDataContentsItems.h
 *
 * 
 */

#ifndef _ConversionEventsDataItemsCustomDataContentsItems_H_
#define _ConversionEventsDataItemsCustomDataContentsItems_H_


#include <string>
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

class ConversionEventsDataItemsCustomDataContentsItems : public Object {
public:
	/*! \brief Constructor.
	 */
	ConversionEventsDataItemsCustomDataContentsItems();
	ConversionEventsDataItemsCustomDataContentsItems(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConversionEventsDataItemsCustomDataContentsItems();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
	 */
	std::string getId();

	/*! \brief Set The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
	 */
	void setId(std::string  id);
	/*! \brief Get The brand of a product.
	 */
	std::string getItemBrand();

	/*! \brief Set The brand of a product.
	 */
	void setItemBrand(std::string  item_brand);
	/*! \brief Get The brand ID of a product.
	 */
	std::string getItemBrandId();

	/*! \brief Set The brand ID of a product.
	 */
	void setItemBrandId(std::string  item_brand_id);
	/*! \brief Get The category of a product.
	 */
	std::string getItemCategory();

	/*! \brief Set The category of a product.
	 */
	void setItemCategory(std::string  item_category);
	/*! \brief Get The name of a product.
	 */
	std::string getItemName();

	/*! \brief Set The name of a product.
	 */
	void setItemName(std::string  item_name);
	/*! \brief Get The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
	 */
	std::string getItemPrice();

	/*! \brief Set The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
	 */
	void setItemPrice(std::string  item_price);
	/*! \brief Get The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
	 */
	long long getQuantity();

	/*! \brief Set The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
	 */
	void setQuantity(long long  quantity);

private:
	std::string id;
	std::string item_brand;
	std::string item_brand_id;
	std::string item_category;
	std::string item_name;
	std::string item_price;
	long long quantity;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ConversionEventsDataItemsCustomDataContentsItems_H_ */
