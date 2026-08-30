
/*
 * LocalInventoryOperation.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_LocalInventoryOperation_H_
#define TINY_CPP_CLIENT_LocalInventoryOperation_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "LocalInventoryCreateOperation.h"
#include "LocalInventoryDeleteOperation.h"
#include "LocalInventoryUpdateOperation.h"
#include "LocalInventoryUpsertOperation.h"
#include "RetailLocalInventoryItemAttributes.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class LocalInventoryOperation{
public:

    /*! \brief Constructor.
	 */
    LocalInventoryOperation();
    LocalInventoryOperation(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LocalInventoryOperation();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	RetailLocalInventoryItemAttributes getAttributes();

	/*! \brief Set 
	 */
	void setAttributes(RetailLocalInventoryItemAttributes attributes);
	/*! \brief Get Catalog item id in the merchant namespace
	 */
	std::string getItemId();

	/*! \brief Set Catalog item id in the merchant namespace
	 */
	void setItemId(std::string item_id);
	/*! \brief Get 
	 */
	std::string getOperation();

	/*! \brief Set 
	 */
	void setOperation(std::string operation);
	/*! \brief Get Store code for the local inventory item
	 */
	std::string getStoreCode();

	/*! \brief Set Store code for the local inventory item
	 */
	void setStoreCode(std::string store_code);


    private:
    RetailLocalInventoryItemAttributes attributes;
    std::string item_id{};
    std::string operation{};
    std::string store_code{};
};
}

#endif /* TINY_CPP_CLIENT_LocalInventoryOperation_H_ */
