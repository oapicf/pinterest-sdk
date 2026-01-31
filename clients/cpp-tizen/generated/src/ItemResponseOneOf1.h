/*
 * ItemResponse_oneOf_1.h
 *
 * Error item response
 */

#ifndef _ItemResponse_oneOf_1_H_
#define _ItemResponse_oneOf_1_H_


#include <string>
#include "CatalogsCreativeAssetsItemErrorResponse.h"
#include "CatalogsHotelItemErrorResponse.h"
#include "CatalogsRetailItemErrorResponse.h"
#include "CatalogsType.h"
#include "ItemValidationEvent.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Error item response
 *
 *  \ingroup Models
 *
 */

class ItemResponse_oneOf_1 : public Object {
public:
	/*! \brief Constructor.
	 */
	ItemResponse_oneOf_1();
	ItemResponse_oneOf_1(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ItemResponse_oneOf_1();

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
	/*! \brief Get 
	 */
	std::list<ItemValidationEvent> getErrors();

	/*! \brief Set 
	 */
	void setErrors(std::list <ItemValidationEvent> errors);
	/*! \brief Get The catalog item id in the merchant namespace
	 */
	std::string getItemId();

	/*! \brief Set The catalog item id in the merchant namespace
	 */
	void setItemId(std::string  item_id);
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

private:
	CatalogsType catalog_type;
	std::list <ItemValidationEvent>errors;
	std::string item_id;
	std::string hotel_id;
	std::string creative_assets_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ItemResponse_oneOf_1_H_ */
