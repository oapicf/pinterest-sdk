
/*
 * ItemUpdateBatchRecord.h
 *
 * Object describing an item batch record to update items
 */

#ifndef TINY_CPP_CLIENT_ItemUpdateBatchRecord_H_
#define TINY_CPP_CLIENT_ItemUpdateBatchRecord_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "UpdatableItemAttributes.h"
#include "UpdateMaskFieldType.h"
#include <list>

namespace Tiny {


/*! \brief Object describing an item batch record to update items
 *
 *  \ingroup Models
 *
 */

class ItemUpdateBatchRecord{
public:

    /*! \brief Constructor.
	 */
    ItemUpdateBatchRecord();
    ItemUpdateBatchRecord(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ItemUpdateBatchRecord();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	UpdatableItemAttributes getAttributes();

	/*! \brief Set 
	 */
	void setAttributes(UpdatableItemAttributes  attributes);
	/*! \brief Get The catalog item id in the merchant namespace
	 */
	std::string getItemId();

	/*! \brief Set The catalog item id in the merchant namespace
	 */
	void setItemId(std::string  item_id);
	/*! \brief Get The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
	 */
	std::list<UpdateMaskFieldType> getUpdateMask();

	/*! \brief Set The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
	 */
	void setUpdateMask(std::list <UpdateMaskFieldType> update_mask);


    private:
    UpdatableItemAttributes attributes;
    std::string item_id{};
    std::list<UpdateMaskFieldType> update_mask;
};
}

#endif /* TINY_CPP_CLIENT_ItemUpdateBatchRecord_H_ */
