/*
 * LocalInventoryItemResponse.h
 *
 * Local inventory item response
 */

#ifndef _LocalInventoryItemResponse_H_
#define _LocalInventoryItemResponse_H_


#include <string>
#include "ItemAvailability.h"
#include "StoreMetadata.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Local inventory item response
 *
 *  \ingroup Models
 *
 */

class LocalInventoryItemResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	LocalInventoryItemResponse();
	LocalInventoryItemResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LocalInventoryItemResponse();

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
	/*! \brief Get The millisecond timestamp when the local inventory item was created
	 */
	long long getCreatedAt();

	/*! \brief Set The millisecond timestamp when the local inventory item was created
	 */
	void setCreatedAt(long long  created_at);
	/*! \brief Get The catalog item id in the merchant namespace
	 */
	std::string getItemId();

	/*! \brief Set The catalog item id in the merchant namespace
	 */
	void setItemId(std::string  item_id);
	/*! \brief Get The millisecond timestamp when the local inventory item was lastly modified by the merchant.
	 */
	long long getLastUpdatedTime();

	/*! \brief Set The millisecond timestamp when the local inventory item was lastly modified by the merchant.
	 */
	void setLastUpdatedTime(long long  last_updated_time);
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
	/*! \brief Get Store metadata for this local inventory item
	 */
	StoreMetadata getStoreMetadata();

	/*! \brief Set Store metadata for this local inventory item
	 */
	void setStoreMetadata(StoreMetadata  store_metadata);

private:
	std::string ad_link;
	ItemAvailability availability;
	long long created_at;
	std::string item_id;
	long long last_updated_time;
	std::string price;
	std::string sale_price;
	StoreMetadata store_metadata;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LocalInventoryItemResponse_H_ */
