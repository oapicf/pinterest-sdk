
/*
 * CatalogsRetailItemResponse.h
 *
 * Object describing a retail item record
 */

#ifndef TINY_CPP_CLIENT_CatalogsRetailItemResponse_H_
#define TINY_CPP_CLIENT_CatalogsRetailItemResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ItemAttributes.h"
#include "Pin.h"
#include <list>

namespace Tiny {


/*! \brief Object describing a retail item record
 *
 *  \ingroup Models
 *
 */

class CatalogsRetailItemResponse{
public:

    /*! \brief Constructor.
	 */
    CatalogsRetailItemResponse();
    CatalogsRetailItemResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsRetailItemResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ItemAttributes getAttributes();

	/*! \brief Set 
	 */
	void setAttributes(ItemAttributes attributes);
	/*! \brief Get 
	 */
	std::string getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(std::string catalog_type);
	/*! \brief Get The catalog retail item id in the merchant namespace
	 */
	std::string getItemId();

	/*! \brief Set The catalog retail item id in the merchant namespace
	 */
	void setItemId(std::string item_id);
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
    ItemAttributes attributes;
    std::string catalog_type{};
    std::string item_id{};
    std::string item_response_kind{};
    std::list<Pin> pins;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsRetailItemResponse_H_ */
