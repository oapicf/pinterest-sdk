/*
 * ItemResponse_anyOf.h
 *
 * 
 */

#ifndef _ItemResponse_anyOf_H_
#define _ItemResponse_anyOf_H_


#include <string>
#include "ItemAttributes.h"
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

class ItemResponse_anyOf : public Object {
public:
	/*! \brief Constructor.
	 */
	ItemResponse_anyOf();
	ItemResponse_anyOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ItemResponse_anyOf();

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
	ItemAttributes getAttributes();

	/*! \brief Set 
	 */
	void setAttributes(ItemAttributes  attributes);

private:
	std::string item_id;
	ItemAttributes attributes;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ItemResponse_anyOf_H_ */
