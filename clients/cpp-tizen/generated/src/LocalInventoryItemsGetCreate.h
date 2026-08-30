/*
 * LocalInventoryItemsGetCreate.h
 *
 * Resource create operation model.
 */

#ifndef _LocalInventoryItemsGetCreate_H_
#define _LocalInventoryItemsGetCreate_H_


#include <string>
#include "ItemIdStoreCodePair.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class LocalInventoryItemsGetCreate : public Object {
public:
	/*! \brief Constructor.
	 */
	LocalInventoryItemsGetCreate();
	LocalInventoryItemsGetCreate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LocalInventoryItemsGetCreate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Array of local inventory item identifiers. Each item requires an item_id and store_code pair. Up to 1000 items.
	 */
	std::list<ItemIdStoreCodePair> getItemFilters();

	/*! \brief Set Array of local inventory item identifiers. Each item requires an item_id and store_code pair. Up to 1000 items.
	 */
	void setItemFilters(std::list <ItemIdStoreCodePair> item_filters);

private:
	std::list <ItemIdStoreCodePair>item_filters;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LocalInventoryItemsGetCreate_H_ */
