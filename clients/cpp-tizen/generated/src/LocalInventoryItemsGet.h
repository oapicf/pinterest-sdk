/*
 * LocalInventoryItemsGet.h
 *
 * Model for getting local inventory items
 */

#ifndef _LocalInventoryItemsGet_H_
#define _LocalInventoryItemsGet_H_


#include <string>
#include "LocalInventoryItemResponse.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Model for getting local inventory items
 *
 *  \ingroup Models
 *
 */

class LocalInventoryItemsGet : public Object {
public:
	/*! \brief Constructor.
	 */
	LocalInventoryItemsGet();
	LocalInventoryItemsGet(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LocalInventoryItemsGet();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Array of local inventory items
	 */
	std::list<LocalInventoryItemResponse> getItems();

	/*! \brief Set Array of local inventory items
	 */
	void setItems(std::list <LocalInventoryItemResponse> items);

private:
	std::list <LocalInventoryItemResponse>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LocalInventoryItemsGet_H_ */
