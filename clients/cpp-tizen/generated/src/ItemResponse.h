/*
 * ItemResponse.h
 *
 * Object describing an item record
 */

#ifndef _ItemResponse_H_
#define _ItemResponse_H_


#include <string>
#include "CatalogsHotelAttributes.h"
#include "CatalogsType.h"
#include "ItemResponse_anyOf.h"
#include "ItemResponse_anyOf_1.h"
#include "ItemValidationEvent.h"
#include "Pin.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Object describing an item record
 *
 *  \ingroup Models
 *
 */

class ItemResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	ItemResponse();
	ItemResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ItemResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsType getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(CatalogsType  catalog_type);
	/*! \brief Get The catalog item id in the merchant namespace
	 */
	std::string getItemId();

	/*! \brief Set The catalog item id in the merchant namespace
	 */
	void setItemId(std::string  item_id);
	/*! \brief Get The pins mapped to the item
	 */
	std::list<Pin> getPins();

	/*! \brief Set The pins mapped to the item
	 */
	void setPins(std::list <Pin> pins);
	/*! \brief Get 
	 */
	CatalogsHotelAttributes getAttributes();

	/*! \brief Set 
	 */
	void setAttributes(CatalogsHotelAttributes  attributes);
	/*! \brief Get The catalog hotel id in the merchant namespace
	 */
	std::string getHotelId();

	/*! \brief Set The catalog hotel id in the merchant namespace
	 */
	void setHotelId(std::string  hotel_id);
	/*! \brief Get Array with the errors for the item id requested
	 */
	std::list<ItemValidationEvent> getErrors();

	/*! \brief Set Array with the errors for the item id requested
	 */
	void setErrors(std::list <ItemValidationEvent> errors);

private:
	CatalogsType catalog_type;
	std::string item_id;
	std::list <Pin>pins;
	CatalogsHotelAttributes attributes;
	std::string hotel_id;
	std::list <ItemValidationEvent>errors;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ItemResponse_H_ */
