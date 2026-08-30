
/*
 * ProductTagItem.h
 *
 * Product tag request item containing the pin_id of the product to tag.
 */

#ifndef TINY_CPP_CLIENT_ProductTagItem_H_
#define TINY_CPP_CLIENT_ProductTagItem_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Product tag request item containing the pin_id of the product to tag.
 *
 *  \ingroup Models
 *
 */

class ProductTagItem{
public:

    /*! \brief Constructor.
	 */
    ProductTagItem();
    ProductTagItem(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ProductTagItem();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Pin ID of the product pin to tag onto the hero pin.
	 */
	std::string getPinId();

	/*! \brief Set Pin ID of the product pin to tag onto the hero pin.
	 */
	void setPinId(std::string pin_id);


    private:
    std::string pin_id{};
};
}

#endif /* TINY_CPP_CLIENT_ProductTagItem_H_ */
