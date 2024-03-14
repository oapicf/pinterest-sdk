/*
 * ItemBatchRecord.h
 *
 * Object describing an item batch record
 */

#ifndef _ItemBatchRecord_H_
#define _ItemBatchRecord_H_


#include <string>
#include "ItemCreateBatchRecord.h"
#include "ItemDeleteDiscontinuedBatchRecord.h"
#include "ItemUpdateBatchRecord.h"
#include "UpdatableItemAttributes.h"
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
	UpdatableItemAttributes getAttributes();

	/*! \brief Set 
	 */
	void setAttributes(UpdatableItemAttributes  attributes);

private:
	std::string item_id;
	UpdatableItemAttributes attributes;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ItemBatchRecord_H_ */
