
/*
 * CatalogsCreateRetailItem.h
 *
 * An item to be created
 */

#ifndef TINY_CPP_CLIENT_CatalogsCreateRetailItem_H_
#define TINY_CPP_CLIENT_CatalogsCreateRetailItem_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ItemAttributesRequest.h"

namespace Tiny {


/*! \brief An item to be created
 *
 *  \ingroup Models
 *
 */

class CatalogsCreateRetailItem{
public:

    /*! \brief Constructor.
	 */
    CatalogsCreateRetailItem();
    CatalogsCreateRetailItem(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsCreateRetailItem();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ItemAttributesRequest getAttributes();

	/*! \brief Set 
	 */
	void setAttributes(ItemAttributesRequest  attributes);
	/*! \brief Get The catalog item id in the merchant namespace
	 */
	std::string getItemId();

	/*! \brief Set The catalog item id in the merchant namespace
	 */
	void setItemId(std::string  item_id);
	/*! \brief Get 
	 */
	std::string getOperation();

	/*! \brief Set 
	 */
	void setOperation(std::string  operation);


    private:
    ItemAttributesRequest attributes;
    std::string item_id{};
    std::string operation{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsCreateRetailItem_H_ */
