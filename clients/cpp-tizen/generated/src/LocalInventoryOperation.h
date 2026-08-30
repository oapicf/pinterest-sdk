/*
 * LocalInventoryOperation.h
 *
 * 
 */

#ifndef _LocalInventoryOperation_H_
#define _LocalInventoryOperation_H_


#include <string>
#include "LocalInventoryCreateOperation.h"
#include "LocalInventoryDeleteOperation.h"
#include "LocalInventoryUpdateOperation.h"
#include "LocalInventoryUpsertOperation.h"
#include "RetailLocalInventoryItemAttributes.h"
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

class LocalInventoryOperation : public Object {
public:
	/*! \brief Constructor.
	 */
	LocalInventoryOperation();
	LocalInventoryOperation(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LocalInventoryOperation();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	RetailLocalInventoryItemAttributes getAttributes();

	/*! \brief Set 
	 */
	void setAttributes(RetailLocalInventoryItemAttributes  attributes);
	/*! \brief Get Catalog item id in the merchant namespace
	 */
	std::string getItemId();

	/*! \brief Set Catalog item id in the merchant namespace
	 */
	void setItemId(std::string  item_id);
	/*! \brief Get 
	 */
	std::string getOperation();

	/*! \brief Set 
	 */
	void setOperation(std::string  operation);
	/*! \brief Get Store code for the local inventory item
	 */
	std::string getStoreCode();

	/*! \brief Set Store code for the local inventory item
	 */
	void setStoreCode(std::string  store_code);

private:
	RetailLocalInventoryItemAttributes attributes;
	std::string item_id;
	std::string operation;
	std::string store_code;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LocalInventoryOperation_H_ */
