
/*
 * ItemResponse_oneOf_1.h
 *
 * Error item response
 */

#ifndef TINY_CPP_CLIENT_ItemResponse_oneOf_1_H_
#define TINY_CPP_CLIENT_ItemResponse_oneOf_1_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsCreativeAssetsItemErrorResponse.h"
#include "CatalogsHotelItemErrorResponse.h"
#include "CatalogsRetailItemErrorResponse.h"
#include "CatalogsType.h"
#include "ItemValidationEvent.h"
#include <list>

namespace Tiny {


/*! \brief Error item response
 *
 *  \ingroup Models
 *
 */

class ItemResponse_oneOf_1{
public:

    /*! \brief Constructor.
	 */
    ItemResponse_oneOf_1();
    ItemResponse_oneOf_1(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ItemResponse_oneOf_1();


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
    std::list<ItemValidationEvent> errors;
    std::string item_id{};
    std::string hotel_id{};
    std::string creative_assets_id{};
};
}

#endif /* TINY_CPP_CLIENT_ItemResponse_oneOf_1_H_ */
