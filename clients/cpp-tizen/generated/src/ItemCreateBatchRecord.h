/*
 * ItemCreateBatchRecord.h
 *
 * Object describing an item batch record to create items
 */

#ifndef _ItemCreateBatchRecord_H_
#define _ItemCreateBatchRecord_H_


#include <string>
#include "ItemAttributesRequest.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Object describing an item batch record to create items
 *
 *  \ingroup Models
 *
 */

class ItemCreateBatchRecord : public Object {
public:
	/*! \brief Constructor.
	 */
	ItemCreateBatchRecord();
	ItemCreateBatchRecord(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ItemCreateBatchRecord();

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

#endif /* _ItemCreateBatchRecord_H_ */
