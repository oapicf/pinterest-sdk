/*
 * AdvancedAuctionItems.h
 *
 * Response object containing item bid options
 */

#ifndef _AdvancedAuctionItems_H_
#define _AdvancedAuctionItems_H_


#include <string>
#include "AdvancedAuctionItem.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Response object containing item bid options
 *
 *  \ingroup Models
 *
 */

class AdvancedAuctionItems : public Object {
public:
	/*! \brief Constructor.
	 */
	AdvancedAuctionItems();
	AdvancedAuctionItems(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdvancedAuctionItems();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Response object of item bid options
	 */
	std::string getCatalogId();

	/*! \brief Set Response object of item bid options
	 */
	void setCatalogId(std::string  catalog_id);
	/*! \brief Get Array with item bid options
	 */
	std::list<AdvancedAuctionItem> getItems();

	/*! \brief Set Array with item bid options
	 */
	void setItems(std::list <AdvancedAuctionItem> items);

private:
	std::string catalog_id;
	std::list <AdvancedAuctionItem>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdvancedAuctionItems_H_ */
