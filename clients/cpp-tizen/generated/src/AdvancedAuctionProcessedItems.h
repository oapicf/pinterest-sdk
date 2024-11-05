/*
 * AdvancedAuctionProcessedItems.h
 *
 * Response object containing the results of an operation on an item bid option
 */

#ifndef _AdvancedAuctionProcessedItems_H_
#define _AdvancedAuctionProcessedItems_H_


#include <string>
#include "AdvancedAuctionProcessedItem.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Response object containing the results of an operation on an item bid option
 *
 *  \ingroup Models
 *
 */

class AdvancedAuctionProcessedItems : public Object {
public:
	/*! \brief Constructor.
	 */
	AdvancedAuctionProcessedItems();
	AdvancedAuctionProcessedItems(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdvancedAuctionProcessedItems();

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
	/*! \brief Get Array of advanced auction processed items
	 */
	std::list<AdvancedAuctionProcessedItem> getItems();

	/*! \brief Set Array of advanced auction processed items
	 */
	void setItems(std::list <AdvancedAuctionProcessedItem> items);

private:
	std::string catalog_id;
	std::list <AdvancedAuctionProcessedItem>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdvancedAuctionProcessedItems_H_ */
