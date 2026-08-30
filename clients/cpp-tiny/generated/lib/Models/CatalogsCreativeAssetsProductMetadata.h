
/*
 * CatalogsCreativeAssetsProductMetadata.h
 *
 * Creative assets product metadata entity
 */

#ifndef TINY_CPP_CLIENT_CatalogsCreativeAssetsProductMetadata_H_
#define TINY_CPP_CLIENT_CatalogsCreativeAssetsProductMetadata_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CreativeAssetsVisibilityType.h"

namespace Tiny {


/*! \brief Creative assets product metadata entity
 *
 *  \ingroup Models
 *
 */

class CatalogsCreativeAssetsProductMetadata{
public:

    /*! \brief Constructor.
	 */
    CatalogsCreativeAssetsProductMetadata();
    CatalogsCreativeAssetsProductMetadata(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsCreativeAssetsProductMetadata();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The user-created unique ID that represents the creative assets item.
	 */
	std::string getCreativeAssetsId();

	/*! \brief Set The user-created unique ID that represents the creative assets item.
	 */
	void setCreativeAssetsId(std::string creative_assets_id);
	/*! \brief Get 
	 */
	CreativeAssetsVisibilityType getVisibility();

	/*! \brief Set 
	 */
	void setVisibility(CreativeAssetsVisibilityType visibility);


    private:
    std::string creative_assets_id{};
    CreativeAssetsVisibilityType visibility;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsCreativeAssetsProductMetadata_H_ */
