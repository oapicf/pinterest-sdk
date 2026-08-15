
/*
 * ItemDeleteBatchRecord.h
 *
 * Object describing an item batch record to delete items
 */

#ifndef TINY_CPP_CLIENT_ItemDeleteBatchRecord_H_
#define TINY_CPP_CLIENT_ItemDeleteBatchRecord_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Object describing an item batch record to delete items
 *
 *  \ingroup Models
 *
 */

class ItemDeleteBatchRecord{
public:

    /*! \brief Constructor.
	 */
    ItemDeleteBatchRecord();
    ItemDeleteBatchRecord(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ItemDeleteBatchRecord();


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
	void setItemId(std::string  item_id);


    private:
    std::string item_id{};
};
}

#endif /* TINY_CPP_CLIENT_ItemDeleteBatchRecord_H_ */
