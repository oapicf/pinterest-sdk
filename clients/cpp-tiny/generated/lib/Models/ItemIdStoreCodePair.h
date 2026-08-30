
/*
 * ItemIdStoreCodePair.h
 *
 * A pair of item_id and store_code that uniquely identifies a local inventory item
 */

#ifndef TINY_CPP_CLIENT_ItemIdStoreCodePair_H_
#define TINY_CPP_CLIENT_ItemIdStoreCodePair_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief A pair of item_id and store_code that uniquely identifies a local inventory item
 *
 *  \ingroup Models
 *
 */

class ItemIdStoreCodePair{
public:

    /*! \brief Constructor.
	 */
    ItemIdStoreCodePair();
    ItemIdStoreCodePair(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ItemIdStoreCodePair();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Catalog item id in the merchant namespace
	 */
	std::string getItemId();

	/*! \brief Set Catalog item id in the merchant namespace
	 */
	void setItemId(std::string item_id);
	/*! \brief Get Store code for the local inventory item
	 */
	std::string getStoreCode();

	/*! \brief Set Store code for the local inventory item
	 */
	void setStoreCode(std::string store_code);


    private:
    std::string item_id{};
    std::string store_code{};
};
}

#endif /* TINY_CPP_CLIENT_ItemIdStoreCodePair_H_ */
