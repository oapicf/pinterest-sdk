
/*
 * CatalogsCreativeAssetsBatchItem.h
 *
 * Creative assets batch item
 */

#ifndef TINY_CPP_CLIENT_CatalogsCreativeAssetsBatchItem_H_
#define TINY_CPP_CLIENT_CatalogsCreativeAssetsBatchItem_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsCreateCreativeAssetsItem.h"
#include "CatalogsDeleteCreativeAssetsItem.h"
#include "CatalogsUpdatableCreativeAssetsAttributes.h"
#include "CatalogsUpdateCreativeAssetsItem.h"
#include "CatalogsUpsertCreativeAssetsItem.h"

namespace Tiny {


/*! \brief Creative assets batch item
 *
 *  \ingroup Models
 *
 */

class CatalogsCreativeAssetsBatchItem{
public:

    /*! \brief Constructor.
	 */
    CatalogsCreativeAssetsBatchItem();
    CatalogsCreativeAssetsBatchItem(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsCreativeAssetsBatchItem();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsUpdatableCreativeAssetsAttributes getAttributes();

	/*! \brief Set 
	 */
	void setAttributes(CatalogsUpdatableCreativeAssetsAttributes  attributes);
	/*! \brief Get The catalog creative assets id in the merchant namespace
	 */
	std::string getCreativeAssetsId();

	/*! \brief Set The catalog creative assets id in the merchant namespace
	 */
	void setCreativeAssetsId(std::string  creative_assets_id);
	/*! \brief Get 
	 */
	std::string getOperation();

	/*! \brief Set 
	 */
	void setOperation(std::string  operation);


    private:
    CatalogsUpdatableCreativeAssetsAttributes attributes;
    std::string creative_assets_id{};
    std::string operation{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsCreativeAssetsBatchItem_H_ */
