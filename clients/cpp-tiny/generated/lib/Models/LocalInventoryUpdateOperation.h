
/*
 * LocalInventoryUpdateOperation.h
 *
 * Update operation for local inventory item
 */

#ifndef TINY_CPP_CLIENT_LocalInventoryUpdateOperation_H_
#define TINY_CPP_CLIENT_LocalInventoryUpdateOperation_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RetailLocalInventoryItemAttributesOptional.h"

namespace Tiny {


/*! \brief Update operation for local inventory item
 *
 *  \ingroup Models
 *
 */

class LocalInventoryUpdateOperation{
public:

    /*! \brief Constructor.
	 */
    LocalInventoryUpdateOperation();
    LocalInventoryUpdateOperation(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LocalInventoryUpdateOperation();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	RetailLocalInventoryItemAttributesOptional getAttributes();

	/*! \brief Set 
	 */
	void setAttributes(RetailLocalInventoryItemAttributesOptional attributes);
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
    RetailLocalInventoryItemAttributesOptional attributes;
    std::string item_id{};
    std::string operation{};
    std::string store_code{};
};
}

#endif /* TINY_CPP_CLIENT_LocalInventoryUpdateOperation_H_ */
