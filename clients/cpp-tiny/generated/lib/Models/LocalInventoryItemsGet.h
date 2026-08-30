
/*
 * LocalInventoryItemsGet.h
 *
 * Model for getting local inventory items
 */

#ifndef TINY_CPP_CLIENT_LocalInventoryItemsGet_H_
#define TINY_CPP_CLIENT_LocalInventoryItemsGet_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "LocalInventoryItemResponse.h"
#include <list>

namespace Tiny {


/*! \brief Model for getting local inventory items
 *
 *  \ingroup Models
 *
 */

class LocalInventoryItemsGet{
public:

    /*! \brief Constructor.
	 */
    LocalInventoryItemsGet();
    LocalInventoryItemsGet(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LocalInventoryItemsGet();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Array of local inventory items
	 */
	std::list<LocalInventoryItemResponse> getItems();

	/*! \brief Set Array of local inventory items
	 */
	void setItems(std::list<LocalInventoryItemResponse> items);


    private:
    std::list<LocalInventoryItemResponse> items;
};
}

#endif /* TINY_CPP_CLIENT_LocalInventoryItemsGet_H_ */
