/*
 * CatalogsRetailBatchRequestItemsItems.h
 *
 * 
 */

#ifndef _CatalogsRetailBatchRequestItemsItems_H_
#define _CatalogsRetailBatchRequestItemsItems_H_


#include <string>
#include "CatalogsCreateRetailItem.h"
#include "CatalogsDeleteRetailItem.h"
#include "CatalogsUpdateRetailItem.h"
#include "CatalogsUpsertRetailItem.h"
#include "ItemAttributesRequest.h"
#include "UpdateMaskFieldType.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsRetailBatchRequestItemsItems : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsRetailBatchRequestItemsItems();
	CatalogsRetailBatchRequestItemsItems(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsRetailBatchRequestItemsItems();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	/*! \brief Get The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
	 */
	std::list<UpdateMaskFieldType> getUpdateMask();

	/*! \brief Set The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
	 */
	void setUpdateMask(std::list <UpdateMaskFieldType> update_mask);
	/*! \brief Get The millisecond timestamp when the item was lastly modified by the merchant.
	 */
	long long getLastUpdatedTime();

	/*! \brief Set The millisecond timestamp when the item was lastly modified by the merchant.
	 */
	void setLastUpdatedTime(long long  last_updated_time);

private:
	ItemAttributesRequest attributes;
	std::string item_id;
	std::string operation;
	std::list <UpdateMaskFieldType>update_mask;
	long long last_updated_time;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsRetailBatchRequestItemsItems_H_ */
