
/*
 * CatalogsCreativeAssetsItemResponse.h
 *
 * Object describing a hotel record
 */

#ifndef TINY_CPP_CLIENT_CatalogsCreativeAssetsItemResponse_H_
#define TINY_CPP_CLIENT_CatalogsCreativeAssetsItemResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsCreativeAssetsAttributes.h"
#include "CatalogsType.h"
#include "Pin.h"
#include <list>

namespace Tiny {


/*! \brief Object describing a hotel record
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
	void setAttributes(CatalogsCreativeAssetsAttributes  attributes);
	/*! \brief Get 
	 */
	CatalogsType getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(CatalogsType  catalog_type);
	/*! \brief Get The catalog creative assets id in the merchant namespace
	 */
	std::string getCreativeAssetsId();

	/*! \brief Set The catalog creative assets id in the merchant namespace
	 */
	void setCreativeAssetsId(std::string  creative_assets_id);
	/*! \brief Get The pins mapped to the item
	 */
	std::list<Pin> getPins();

	/*! \brief Set The pins mapped to the item
	 */
	void setPins(std::list <Pin> pins);


    private:
    CatalogsCreativeAssetsAttributes attributes;
    CatalogsType catalog_type;
    std::string creative_assets_id{};
    std::list<Pin> pins;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsCreativeAssetsItemResponse_H_ */
