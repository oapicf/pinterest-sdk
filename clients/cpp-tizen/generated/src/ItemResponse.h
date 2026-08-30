/*
 * ItemResponse.h
 *
 * Object describing an item record or error. Discriminated by &#x60;item_response_kind&#x60; (one unique value per leaf).
 */

#ifndef _ItemResponse_H_
#define _ItemResponse_H_


#include <string>
#include "CatalogsCreativeAssetsAttributes.h"
#include "CatalogsCreativeAssetsItemErrorResponse.h"
#include "CatalogsCreativeAssetsItemResponse.h"
#include "CatalogsHotelItemErrorResponse.h"
#include "CatalogsHotelItemResponse.h"
#include "CatalogsRetailItemErrorResponse.h"
#include "CatalogsRetailItemResponse.h"
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


/*! \brief Object describing an item record or error. Discriminated by `item_response_kind` (one unique value per leaf).
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
	CatalogsCreativeAssetsAttributes getAttributes();

	/*! \brief Set 
	 */
	void setAttributes(CatalogsCreativeAssetsAttributes  attributes);
	/*! \brief Get 
	 */
	std::string getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(std::string  catalog_type);
	/*! \brief Get The catalog item id in the merchant namespace
	 */
	std::string getItemId();

	/*! \brief Set The catalog item id in the merchant namespace
	 */
	void setItemId(std::string  item_id);
	/*! \brief Get Discriminator literal identifying this leaf inside an `ItemResponse` payload.
	 */
	std::string getItemResponseKind();

	/*! \brief Set Discriminator literal identifying this leaf inside an `ItemResponse` payload.
	 */
	void setItemResponseKind(std::string  item_response_kind);
	/*! \brief Get The pins mapped to the item
	 */
	std::list<Pin> getPins();

	/*! \brief Set The pins mapped to the item
	 */
	void setPins(std::list <Pin> pins);
	/*! \brief Get The catalog hotel id in the merchant namespace
	 */
	std::string getHotelId();

	/*! \brief Set The catalog hotel id in the merchant namespace
	 */
	void setHotelId(std::string  hotel_id);
	/*! \brief Get The catalog creative assets id in the merchant namespace
	 */
	std::string getCreativeAssetsId();

	/*! \brief Set The catalog creative assets id in the merchant namespace
	 */
	void setCreativeAssetsId(std::string  creative_assets_id);
	/*! \brief Get Array with the errors for the item id requested
	 */
	std::list<ItemValidationEvent> getErrors();

	/*! \brief Set Array with the errors for the item id requested
	 */
	void setErrors(std::list <ItemValidationEvent> errors);

private:
	CatalogsCreativeAssetsAttributes attributes;
	std::string catalog_type;
	std::string item_id;
	std::string item_response_kind;
	std::list <Pin>pins;
	std::string hotel_id;
	std::string creative_assets_id;
	std::list <ItemValidationEvent>errors;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ItemResponse_H_ */
