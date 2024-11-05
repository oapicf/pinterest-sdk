/*
 * ItemBatchRecord.h
 *
 * Object describing an item batch record
 */

#ifndef _ItemBatchRecord_H_
#define _ItemBatchRecord_H_


#include <string>
#include "ItemAttributesRequest.h"
#include "ItemCreateBatchRecord.h"
#include "ItemDeleteBatchRecord.h"
#include "ItemDeleteDiscontinuedBatchRecord.h"
#include "ItemUpdateBatchRecord.h"
#include "ItemUpsertBatchRecord.h"
#include "UpdateMaskFieldType.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Object describing an item batch record
 *
 *  \ingroup Models
 *
 */

class ItemBatchRecord : public Object {
public:
	/*! \brief Constructor.
	 */
	ItemBatchRecord();
	ItemBatchRecord(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ItemBatchRecord();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The catalog item id in the merchant namespace
	 */
	std::string getItemId();

	/*! \brief Set The catalog item id in the merchant namespace
	 */
	void setItemId(std::string  item_id);
	/*! \brief Get 
	 */
	ItemAttributesRequest getAttributes();

	/*! \brief Set 
	 */
	void setAttributes(ItemAttributesRequest  attributes);
	/*! \brief Get The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
	 */
	std::list<UpdateMaskFieldType> getUpdateMask();

	/*! \brief Set The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
	 */
	void setUpdateMask(std::list <UpdateMaskFieldType> update_mask);

private:
	std::string item_id;
	ItemAttributesRequest attributes;
	std::list <UpdateMaskFieldType>update_mask;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ItemBatchRecord_H_ */
