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

	/*! \brief Get The price of a product. Accepted as a string in the request; it will be parsed into a double. For example, if there are two products in a checkout event, the value should be the total price
	 */
	std::string getItemPrice();

	/*! \brief Set The price of a product. Accepted as a string in the request; it will be parsed into a double. For example, if there are two products in a checkout event, the value should be the total price
	 */
	void setItemPrice(std::string  item_price);
	/*! \brief Get The amount of a product.
	 */
	long long getQuantity();

	/*! \brief Set The amount of a product.
	 */
	void setQuantity(long long  quantity);

private:
	std::string item_price;
	long long quantity;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ConversionEvents_data_inner_custom_data_contents_inner_H_ */
