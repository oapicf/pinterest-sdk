/*
 * ItemDeleteDiscontinuedBatchRecord.h
 *
 * Object describing an item batch record to discontinue items
 */

#ifndef _ItemDeleteDiscontinuedBatchRecord_H_
#define _ItemDeleteDiscontinuedBatchRecord_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Object describing an item batch record to discontinue items
 *
 *  \ingroup Models
 *
 */

class ItemDeleteDiscontinuedBatchRecord : public Object {
public:
	/*! \brief Constructor.
	 */
	ItemDeleteDiscontinuedBatchRecord();
	ItemDeleteDiscontinuedBatchRecord(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ItemDeleteDiscontinuedBatchRecord();

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

#endif /* _ItemDeleteDiscontinuedBatchRecord_H_ */
