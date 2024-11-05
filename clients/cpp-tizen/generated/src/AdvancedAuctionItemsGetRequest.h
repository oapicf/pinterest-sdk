/*
 * AdvancedAuctionItemsGetRequest.h
 *
 * Request object used to get bid options values for a batch of retail catalog items
 */

#ifndef _AdvancedAuctionItemsGetRequest_H_
#define _AdvancedAuctionItemsGetRequest_H_


#include <string>
#include "AdvancedAuctionItemsGetRecord.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Request object used to get bid options values for a batch of retail catalog items
 *
 *  \ingroup Models
 *
 */

class AdvancedAuctionItemsGetRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	AdvancedAuctionItemsGetRequest();
	AdvancedAuctionItemsGetRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdvancedAuctionItemsGetRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Catalog id pertaining to the retail item
	 */
	std::string getCatalogId();

	/*! \brief Set Catalog id pertaining to the retail item
	 */
	void setCatalogId(std::string  catalog_id);
	/*! \brief Get A list of retail catalog items to fetch bid options for
	 */
	std::list<AdvancedAuctionItemsGetRecord> getItems();

	/*! \brief Set A list of retail catalog items to fetch bid options for
	 */
	void setItems(std::list <AdvancedAuctionItemsGetRecord> items);

private:
	std::string catalog_id;
	std::list <AdvancedAuctionItemsGetRecord>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdvancedAuctionItemsGetRequest_H_ */
