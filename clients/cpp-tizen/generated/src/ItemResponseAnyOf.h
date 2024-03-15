/*
 * ItemResponse_anyOf.h
 *
 * 
 */

#ifndef _ItemResponse_anyOf_H_
#define _ItemResponse_anyOf_H_


#include <string>
#include "CatalogsHotelAttributes.h"
#include "CatalogsHotelItemResponse.h"
#include "CatalogsRetailItemResponse.h"
#include "CatalogsType.h"
#include "Pin.h"
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

	/*! \brief Get 
	 */
	CatalogsType getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(CatalogsType  catalog_type);
	/*! \brief Get The catalog retail item id in the merchant namespace
	 */
	std::string getItemId();

	/*! \brief Set The catalog retail item id in the merchant namespace
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

private:
	CatalogsType catalog_type;
	std::string item_id;
	std::list <Pin>pins;
	CatalogsHotelAttributes attributes;
	std::string hotel_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ItemResponse_anyOf_H_ */
