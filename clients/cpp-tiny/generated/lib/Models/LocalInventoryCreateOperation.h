
/*
 * LocalInventoryCreateOperation.h
 *
 * Create operation for local inventory item
 */

#ifndef TINY_CPP_CLIENT_LocalInventoryCreateOperation_H_
#define TINY_CPP_CLIENT_LocalInventoryCreateOperation_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RetailLocalInventoryItemAttributes.h"

namespace Tiny {


/*! \brief Create operation for local inventory item
 *
 *  \ingroup Models
 *
 */

class LocalInventoryCreateOperation{
public:

    /*! \brief Constructor.
	 */
    LocalInventoryCreateOperation();
    LocalInventoryCreateOperation(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LocalInventoryCreateOperation();


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

#endif /* TINY_CPP_CLIENT_LocalInventoryCreateOperation_H_ */
