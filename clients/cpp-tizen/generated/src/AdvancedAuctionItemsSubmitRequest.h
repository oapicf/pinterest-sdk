/*
 * AdvancedAuctionItemsSubmitRequest.h
 *
 * Request containing operations to perform on bid prices and bid multipliers for a batch of retail catalog items
 */

#ifndef _AdvancedAuctionItemsSubmitRequest_H_
#define _AdvancedAuctionItemsSubmitRequest_H_


#include <string>
#include "AdvancedAuctionItemsSubmitRecord.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Request containing operations to perform on bid prices and bid multipliers for a batch of retail catalog items
 *
 *  \ingroup Models
 *
 */

class AdvancedAuctionItemsSubmitRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	AdvancedAuctionItemsSubmitRequest();
	AdvancedAuctionItemsSubmitRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdvancedAuctionItemsSubmitRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Catalog id pertaining to all items
	 */
	std::string getCatalogId();

	/*! \brief Set Catalog id pertaining to all items
	 */
	void setCatalogId(std::string  catalog_id);
	/*! \brief Get Array of item bid option operations
	 */
	std::list<AdvancedAuctionItemsSubmitRecord> getItems();

	/*! \brief Set Array of item bid option operations
	 */
	void setItems(std::list <AdvancedAuctionItemsSubmitRecord> items);

private:
	std::string catalog_id;
	std::list <AdvancedAuctionItemsSubmitRecord>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdvancedAuctionItemsSubmitRequest_H_ */
