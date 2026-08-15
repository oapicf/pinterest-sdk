
/*
 * ConversionEvents_data_inner_custom_data_contents_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ConversionEvents_data_inner_custom_data_contents_inner_H_
#define TINY_CPP_CLIENT_ConversionEvents_data_inner_custom_data_contents_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ConversionEvents_data_inner_custom_data_contents_inner{
public:

    /*! \brief Constructor.
	 */
    ConversionEvents_data_inner_custom_data_contents_inner();
    ConversionEvents_data_inner_custom_data_contents_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ConversionEvents_data_inner_custom_data_contents_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
	 */
	std::string getId();

	/*! \brief Set The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
	 */
	void setId(std::string  id);
	/*! \brief Get The brand of a product.
	 */
	std::string getItemBrand();

	/*! \brief Set The brand of a product.
	 */
	void setItemBrand(std::string  item_brand);
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
	/*! \brief Get The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
	 */
	std::string getItemPrice();

	/*! \brief Set The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
	 */
	void setItemPrice(std::string  item_price);
	/*! \brief Get The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
	 */
	long getQuantity();

	/*! \brief Set The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
	 */
	void setQuantity(long  quantity);


    private:
    std::string id{};
    std::string item_brand{};
    std::string item_category{};
    std::string item_name{};
    std::string item_price{};
    long quantity{};
};
}

#endif /* TINY_CPP_CLIENT_ConversionEvents_data_inner_custom_data_contents_inner_H_ */
