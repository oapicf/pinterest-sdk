
/*
 * LocalInventoryItemsGetCreate.h
 *
 * Resource create operation model.
 */

#ifndef TINY_CPP_CLIENT_LocalInventoryItemsGetCreate_H_
#define TINY_CPP_CLIENT_LocalInventoryItemsGetCreate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ItemIdStoreCodePair.h"
#include <list>

namespace Tiny {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class LocalInventoryItemsGetCreate{
public:

    /*! \brief Constructor.
	 */
    LocalInventoryItemsGetCreate();
    LocalInventoryItemsGetCreate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LocalInventoryItemsGetCreate();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Array of local inventory item identifiers. Each item requires an item_id and store_code pair. Up to 1000 items.
	 */
	std::list<ItemIdStoreCodePair> getItemFilters();

	/*! \brief Set Array of local inventory item identifiers. Each item requires an item_id and store_code pair. Up to 1000 items.
	 */
	void setItemFilters(std::list<ItemIdStoreCodePair> item_filters);


    private:
    std::list<ItemIdStoreCodePair> item_filters;
};
}

#endif /* TINY_CPP_CLIENT_LocalInventoryItemsGetCreate_H_ */
