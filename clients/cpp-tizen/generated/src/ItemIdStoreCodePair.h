/*
 * ItemIdStoreCodePair.h
 *
 * A pair of item_id and store_code that uniquely identifies a local inventory item
 */

#ifndef _ItemIdStoreCodePair_H_
#define _ItemIdStoreCodePair_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A pair of item_id and store_code that uniquely identifies a local inventory item
 *
 *  \ingroup Models
 *
 */

class ItemIdStoreCodePair : public Object {
public:
	/*! \brief Constructor.
	 */
	ItemIdStoreCodePair();
	ItemIdStoreCodePair(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ItemIdStoreCodePair();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Catalog item id in the merchant namespace
	 */
	std::string getItemId();

	/*! \brief Set Catalog item id in the merchant namespace
	 */
	void setItemId(std::string  item_id);
	/*! \brief Get Store code for the local inventory item
	 */
	std::string getStoreCode();

	/*! \brief Set Store code for the local inventory item
	 */
	void setStoreCode(std::string  store_code);

private:
	std::string item_id;
	std::string store_code;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ItemIdStoreCodePair_H_ */
