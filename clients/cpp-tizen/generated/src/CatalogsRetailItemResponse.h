/*
 * CatalogsRetailItemResponse.h
 *
 * Object describing a retail item record
 */

#ifndef _CatalogsRetailItemResponse_H_
#define _CatalogsRetailItemResponse_H_


#include <string>
#include "CatalogsType.h"
#include "ItemAttributes.h"
#include "Pin.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Object describing a retail item record
 *
 *  \ingroup Models
 *
 */

class CatalogsRetailItemResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsRetailItemResponse();
	CatalogsRetailItemResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsRetailItemResponse();

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
	ItemAttributes getAttributes();

	/*! \brief Set 
	 */
	void setAttributes(ItemAttributes  attributes);

private:
	CatalogsType catalog_type;
	std::string item_id;
	std::list <Pin>pins;
	ItemAttributes attributes;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsRetailItemResponse_H_ */
