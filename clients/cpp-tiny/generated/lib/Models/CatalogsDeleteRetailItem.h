
/*
 * CatalogsDeleteRetailItem.h
 *
 * An item to be deleted
 */

#ifndef TINY_CPP_CLIENT_CatalogsDeleteRetailItem_H_
#define TINY_CPP_CLIENT_CatalogsDeleteRetailItem_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief An item to be deleted
 *
 *  \ingroup Models
 *
 */

class CatalogsDeleteRetailItem{
public:

    /*! \brief Constructor.
	 */
    CatalogsDeleteRetailItem();
    CatalogsDeleteRetailItem(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsDeleteRetailItem();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The catalog item id in the merchant namespace
	 */
	std::string getItemId();

	/*! \brief Set The catalog item id in the merchant namespace
	 */
	void setItemId(std::string item_id);
	/*! \brief Get The millisecond timestamp when the item was lastly modified by the merchant.
	 */
	long getLastUpdatedTime();

	/*! \brief Set The millisecond timestamp when the item was lastly modified by the merchant.
	 */
	void setLastUpdatedTime(long last_updated_time);
	/*! \brief Get 
	 */
	std::string getOperation();

	/*! \brief Set 
	 */
	void setOperation(std::string operation);


    private:
    std::string item_id{};
    long last_updated_time{};
    std::string operation{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsDeleteRetailItem_H_ */
