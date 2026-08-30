/*
 * LocalInventoryUpdateOperation.h
 *
 * Update operation for local inventory item
 */

#ifndef _LocalInventoryUpdateOperation_H_
#define _LocalInventoryUpdateOperation_H_


#include <string>
#include "RetailLocalInventoryItemAttributesOptional.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Update operation for local inventory item
 *
 *  \ingroup Models
 *
 */

class LocalInventoryUpdateOperation : public Object {
public:
	/*! \brief Constructor.
	 */
	LocalInventoryUpdateOperation();
	LocalInventoryUpdateOperation(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LocalInventoryUpdateOperation();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	RetailLocalInventoryItemAttributesOptional getAttributes();

	/*! \brief Set 
	 */
	void setAttributes(RetailLocalInventoryItemAttributesOptional  attributes);
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
	RetailLocalInventoryItemAttributesOptional attributes;
	std::string item_id;
	std::string operation;
	std::string store_code;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LocalInventoryUpdateOperation_H_ */
