/*
 * ConversionEvents_data_inner_custom_data_contents_inner.h
 *
 * 
 */

#ifndef _ConversionEvents_data_inner_custom_data_contents_inner_H_
#define _ConversionEvents_data_inner_custom_data_contents_inner_H_


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

class ConversionEvents_data_inner_custom_data_contents_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	ConversionEvents_data_inner_custom_data_contents_inner();
	ConversionEvents_data_inner_custom_data_contents_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConversionEvents_data_inner_custom_data_contents_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
	 */
	std::string getId();

	/*! \brief Set The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
	 */
	void setId(std::string  id);
	/*! \brief Get The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
	 */
	std::string getItemPrice();

	/*! \brief Set The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
	 */
	void setItemPrice(std::string  item_price);
	/*! \brief Get The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
	 */
	long long getQuantity();

	/*! \brief Set The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
	 */
	void setQuantity(long long  quantity);
	/*! \brief Get The name of a product.
	 */
	std::string getItemName();

	/*! \brief Set The name of a product.
	 */
	void setItemName(std::string  item_name);
	/*! \brief Get The category of a product.
	 */
	std::string getItemCategory();

	/*! \brief Set The category of a product.
	 */
	void setItemCategory(std::string  item_category);
	/*! \brief Get The brand of a product.
	 */
	std::string getItemBrand();

	/*! \brief Set The brand of a product.
	 */
	void setItemBrand(std::string  item_brand);

private:
	std::string id;
	std::string item_price;
	long long quantity;
	std::string item_name;
	std::string item_category;
	std::string item_brand;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ConversionEvents_data_inner_custom_data_contents_inner_H_ */
