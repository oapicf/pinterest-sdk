
/*
 * ItemResponse.h
 *
 * Object describing an item record or error
 */

#ifndef TINY_CPP_CLIENT_ItemResponse_H_
#define TINY_CPP_CLIENT_ItemResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsCreativeAssetsAttributes.h"
#include "CatalogsType.h"
#include "ItemResponse_oneOf.h"
#include "ItemResponse_oneOf_1.h"
#include "ItemValidationEvent.h"
#include "Pin.h"
#include <list>

namespace Tiny {


/*! \brief Object describing an item record or error
 *
 *  \ingroup Models
 *
 */

class ItemResponse{
public:

    /*! \brief Constructor.
	 */
    ItemResponse();
    ItemResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ItemResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsType getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(CatalogsType  catalog_type);
	/*! \brief Get 
	 */
	CatalogsCreativeAssetsAttributes getAttributes();

	/*! \brief Set 
	 */
	void setAttributes(CatalogsCreativeAssetsAttributes  attributes);
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
    CatalogsType catalog_type;
    CatalogsCreativeAssetsAttributes attributes;
    std::string item_id{};
    std::list<Pin> pins;
    std::string hotel_id{};
    std::string creative_assets_id{};
    std::list<ItemValidationEvent> errors;
};
}

#endif /* TINY_CPP_CLIENT_ItemResponse_H_ */
