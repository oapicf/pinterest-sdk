
/*
 * CatalogsHotelItemResponse.h
 *
 * Object describing a hotel record
 */

#ifndef TINY_CPP_CLIENT_CatalogsHotelItemResponse_H_
#define TINY_CPP_CLIENT_CatalogsHotelItemResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsHotelAttributes.h"
#include "Pin.h"
#include <list>

namespace Tiny {


/*! \brief Object describing a hotel record
 *
 *  \ingroup Models
 *
 */

class CatalogsHotelItemResponse{
public:

    /*! \brief Constructor.
	 */
    CatalogsHotelItemResponse();
    CatalogsHotelItemResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsHotelItemResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsHotelAttributes getAttributes();

	/*! \brief Set 
	 */
	void setAttributes(CatalogsHotelAttributes attributes);
	/*! \brief Get 
	 */
	std::string getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(std::string catalog_type);
	/*! \brief Get The catalog hotel id in the merchant namespace
	 */
	std::string getHotelId();

	/*! \brief Set The catalog hotel id in the merchant namespace
	 */
	void setHotelId(std::string hotel_id);
	/*! \brief Get Discriminator literal identifying this leaf inside an `ItemResponse` payload.
	 */
	std::string getItemResponseKind();

	/*! \brief Set Discriminator literal identifying this leaf inside an `ItemResponse` payload.
	 */
	void setItemResponseKind(std::string item_response_kind);
	/*! \brief Get The pins mapped to the item
	 */
	std::list<Pin> getPins();

	/*! \brief Set The pins mapped to the item
	 */
	void setPins(std::list<Pin> pins);


    private:
    CatalogsHotelAttributes attributes;
    std::string catalog_type{};
    std::string hotel_id{};
    std::string item_response_kind{};
    std::list<Pin> pins;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsHotelItemResponse_H_ */
