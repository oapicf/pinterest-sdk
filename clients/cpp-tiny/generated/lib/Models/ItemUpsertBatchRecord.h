
/*
 * ItemUpsertBatchRecord.h
 *
 * Object describing an item batch record to upsert items
 */

#ifndef TINY_CPP_CLIENT_ItemUpsertBatchRecord_H_
#define TINY_CPP_CLIENT_ItemUpsertBatchRecord_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ItemAttributesRequest.h"

namespace Tiny {


/*! \brief Object describing an item batch record to upsert items
 *
 *  \ingroup Models
 *
 */

class ItemUpsertBatchRecord{
public:

    /*! \brief Constructor.
	 */
    ItemUpsertBatchRecord();
    ItemUpsertBatchRecord(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ItemUpsertBatchRecord();


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
	void setAttributes(ItemAttributesRequest attributes);
	/*! \brief Get The catalog item id in the merchant namespace
	 */
	std::string getItemId();

	/*! \brief Set The catalog item id in the merchant namespace
	 */
	void setItemId(std::string item_id);


    private:
    ItemAttributesRequest attributes;
    std::string item_id{};
};
}

#endif /* TINY_CPP_CLIENT_ItemUpsertBatchRecord_H_ */
