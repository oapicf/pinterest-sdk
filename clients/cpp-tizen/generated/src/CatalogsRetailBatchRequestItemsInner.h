/*
 * CatalogsRetailBatchRequest_items_inner.h
 *
 * 
 */

#ifndef _CatalogsRetailBatchRequest_items_inner_H_
#define _CatalogsRetailBatchRequest_items_inner_H_


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

class CatalogsRetailBatchRequest_items_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsRetailBatchRequest_items_inner();
	CatalogsRetailBatchRequest_items_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsRetailBatchRequest_items_inner();

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
	std::string getOperation();

	/*! \brief Set 
	 */
	void setOperation(std::string  operation);
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
	std::string operation;
	ItemAttributesRequest attributes;
	std::list <UpdateMaskFieldType>update_mask;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsRetailBatchRequest_items_inner_H_ */
