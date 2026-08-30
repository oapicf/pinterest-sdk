/*
 * RetailLocalInventoryItemAttributes.h
 *
 * Local inventory attributes for retail items (required fields for create/upsert)
 */

#ifndef _RetailLocalInventoryItemAttributes_H_
#define _RetailLocalInventoryItemAttributes_H_


#include <string>
#include "ItemAvailability.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Local inventory attributes for retail items (required fields for create/upsert)
 *
 *  \ingroup Models
 *
 */

class RetailLocalInventoryItemAttributes : public Object {
public:
	/*! \brief Constructor.
	 */
	RetailLocalInventoryItemAttributes();
	RetailLocalInventoryItemAttributes(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RetailLocalInventoryItemAttributes();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Ad link for the item
	 */
	std::string getAdLink();

	/*! \brief Set Ad link for the item
	 */
	void setAdLink(std::string  ad_link);
	/*! \brief Get Availability status of the item
	 */
	ItemAvailability getAvailability();

	/*! \brief Set Availability status of the item
	 */
	void setAvailability(ItemAvailability  availability);
	/*! \brief Get The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars.
	 */
	std::string getPrice();

	/*! \brief Set The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars.
	 */
	void setPrice(std::string  price);
	/*! \brief Get The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
	 */
	std::string getSalePrice();

	/*! \brief Set The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
	 */
	void setSalePrice(std::string  sale_price);

private:
	std::string ad_link;
	ItemAvailability availability;
	std::string price;
	std::string sale_price;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RetailLocalInventoryItemAttributes_H_ */
