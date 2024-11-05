/*
 * ItemUpsertBatchRecord.h
 *
 * Object describing an item batch record to upsert items
 */

#ifndef _ItemUpsertBatchRecord_H_
#define _ItemUpsertBatchRecord_H_


#include <string>
#include "ItemAttributesRequest.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Object describing an item batch record to upsert items
 *
 *  \ingroup Models
 *
 */

class ItemUpsertBatchRecord : public Object {
public:
	/*! \brief Constructor.
	 */
	ItemUpsertBatchRecord();
	ItemUpsertBatchRecord(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ItemUpsertBatchRecord();

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

private:
	std::string item_id;
	ItemAttributesRequest attributes;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ItemUpsertBatchRecord_H_ */
