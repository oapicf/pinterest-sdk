/*
 * ItemDeleteBatchRecord.h
 *
 * Object describing an item batch record to delete items
 */

#ifndef _ItemDeleteBatchRecord_H_
#define _ItemDeleteBatchRecord_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Object describing an item batch record to delete items
 *
 *  \ingroup Models
 *
 */

class ItemDeleteBatchRecord : public Object {
public:
	/*! \brief Constructor.
	 */
	ItemDeleteBatchRecord();
	ItemDeleteBatchRecord(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ItemDeleteBatchRecord();

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

private:
	std::string item_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ItemDeleteBatchRecord_H_ */
