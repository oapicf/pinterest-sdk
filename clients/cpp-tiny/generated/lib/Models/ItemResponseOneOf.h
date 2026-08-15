
/*
 * ItemResponse_oneOf.h
 *
 * Successful item response
 */

#ifndef TINY_CPP_CLIENT_ItemResponse_oneOf_H_
#define TINY_CPP_CLIENT_ItemResponse_oneOf_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsCreativeAssetsAttributes.h"
#include "CatalogsCreativeAssetsItemResponse.h"
#include "CatalogsHotelItemResponse.h"
#include "CatalogsRetailItemResponse.h"
#include "CatalogsType.h"
#include "Pin.h"
#include <list>

namespace Tiny {


/*! \brief Successful item response
 *
 *  \ingroup Models
 *
 */

class ItemResponse_oneOf{
public:

    /*! \brief Constructor.
	 */
    ItemResponse_oneOf();
    ItemResponse_oneOf(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ItemResponse_oneOf();


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
    CatalogsCreativeAssetsAttributes attributes;
    std::string item_id{};
    std::list<Pin> pins;
    std::string hotel_id{};
    std::string creative_assets_id{};
};
}

#endif /* TINY_CPP_CLIENT_ItemResponse_oneOf_H_ */
