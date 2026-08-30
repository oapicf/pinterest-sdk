
/*
 * CatalogsCreativeAssetsItemResponse.h
 *
 * Object describing a creative assets item record
 */

#ifndef TINY_CPP_CLIENT_CatalogsCreativeAssetsItemResponse_H_
#define TINY_CPP_CLIENT_CatalogsCreativeAssetsItemResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsCreativeAssetsAttributes.h"
#include "Pin.h"
#include <list>

namespace Tiny {


/*! \brief Object describing a creative assets item record
 *
 *  \ingroup Models
 *
 */

class CatalogsCreativeAssetsItemResponse{
public:

    /*! \brief Constructor.
	 */
    CatalogsCreativeAssetsItemResponse();
    CatalogsCreativeAssetsItemResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsCreativeAssetsItemResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsCreativeAssetsAttributes getAttributes();

	/*! \brief Set 
	 */
	void setAttributes(CatalogsCreativeAssetsAttributes attributes);
	/*! \brief Get 
	 */
	std::string getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(std::string catalog_type);
	/*! \brief Get The catalog creative assets id in the merchant namespace
	 */
	std::string getCreativeAssetsId();

	/*! \brief Set The catalog creative assets id in the merchant namespace
	 */
	void setCreativeAssetsId(std::string creative_assets_id);
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
    CatalogsCreativeAssetsAttributes attributes;
    std::string catalog_type{};
    std::string creative_assets_id{};
    std::string item_response_kind{};
    std::list<Pin> pins;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsCreativeAssetsItemResponse_H_ */
