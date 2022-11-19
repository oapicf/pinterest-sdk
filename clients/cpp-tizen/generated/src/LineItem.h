/*
 * LineItem.h
 *
 * 
 */

#ifndef _LineItem_H_
#define _LineItem_H_


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

class LineItem : public Object {
public:
	/*! \brief Constructor.
	 */
	LineItem();
	LineItem(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LineItem();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Product brand. For example, \"Parker\".
	 */
	std::string getProductBrand();

	/*! \brief Set Product brand. For example, \"Parker\".
	 */
	void setProductBrand(std::string  product_brand);
	/*! \brief Get Product category. For example, \"Shoes\".
	 */
	std::string getProductCategory();

	/*! \brief Set Product category. For example, \"Shoes\".
	 */
	void setProductCategory(std::string  product_category);
	/*! \brief Get Product ID. For example, 1414.
	 */
	int getProductId();

	/*! \brief Set Product ID. For example, 1414.
	 */
	void setProductId(int  product_id);
	/*! \brief Get Product name. For example, \"Parker Boots\".
	 */
	std::string getProductName();

	/*! \brief Set Product name. For example, \"Parker Boots\".
	 */
	void setProductName(std::string  product_name);
	/*! \brief Get Product price. For example, \"99.99\".
	 */
	std::string getProductPrice();

	/*! \brief Set Product price. For example, \"99.99\".
	 */
	void setProductPrice(std::string  product_price);
	/*! \brief Get Product quantity. For example, 2.
	 */
	int getProductQuantity();

	/*! \brief Set Product quantity. For example, 2.
	 */
	void setProductQuantity(int  product_quantity);
	/*! \brief Get Product variant. For example, \"Red\".
	 */
	std::string getProductVariant();

	/*! \brief Set Product variant. For example, \"Red\".
	 */
	void setProductVariant(std::string  product_variant);
	/*! \brief Get Product variant ID. For example, \"1414-34832\".
	 */
	std::string getProductVariantId();

	/*! \brief Set Product variant ID. For example, \"1414-34832\".
	 */
	void setProductVariantId(std::string  product_variant_id);

private:
	std::string product_brand;
	std::string product_category;
	int product_id;
	std::string product_name;
	std::string product_price;
	int product_quantity;
	std::string product_variant;
	std::string product_variant_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LineItem_H_ */
