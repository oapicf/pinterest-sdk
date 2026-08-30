/*
 * ProductTagItem.h
 *
 * Product tag request item containing the pin_id of the product to tag.
 */

#ifndef _ProductTagItem_H_
#define _ProductTagItem_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Product tag request item containing the pin_id of the product to tag.
 *
 *  \ingroup Models
 *
 */

class ProductTagItem : public Object {
public:
	/*! \brief Constructor.
	 */
	ProductTagItem();
	ProductTagItem(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProductTagItem();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Pin ID of the product pin to tag onto the hero pin.
	 */
	std::string getPinId();

	/*! \brief Set Pin ID of the product pin to tag onto the hero pin.
	 */
	void setPinId(std::string  pin_id);

private:
	std::string pin_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ProductTagItem_H_ */
