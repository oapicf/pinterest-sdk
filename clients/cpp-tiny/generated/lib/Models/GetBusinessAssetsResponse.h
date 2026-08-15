
/*
 * GetBusinessAssetsResponse.h
 *
 * An object containing the permissions a business has on the asset.
 */

#ifndef TINY_CPP_CLIENT_GetBusinessAssetsResponse_H_
#define TINY_CPP_CLIENT_GetBusinessAssetsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AssetGroupBinding.h"
#include "GetBusinessAssetsResponse_catalog_info.h"

namespace Tiny {


/*! \brief An object containing the permissions a business has on the asset.
 *
 *  \ingroup Models
 *
 */

class GetBusinessAssetsResponse{
public:

    /*! \brief Constructor.
	 */
    GetBusinessAssetsResponse();
    GetBusinessAssetsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetBusinessAssetsResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	AssetGroupBinding getAssetGroupInfo();

	/*! \brief Set 
	 */
	void setAssetGroupInfo(AssetGroupBinding  asset_group_info);
	/*! \brief Get Unique identifier of a business asset.
	 */
	std::string getAssetId();

	/*! \brief Set Unique identifier of a business asset.
	 */
	void setAssetId(std::string  asset_id);
	/*! \brief Get Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
	 */
	std::string getAssetType();

	/*! \brief Set Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
	 */
	void setAssetType(std::string  asset_type);
	/*! \brief Get 
	 */
	GetBusinessAssetsResponse_catalog_info getCatalogInfo();

	/*! \brief Set 
	 */
	void setCatalogInfo(GetBusinessAssetsResponse_catalog_info  catalog_info);


    private:
    AssetGroupBinding asset_group_info;
    std::string asset_id{};
    std::string asset_type{};
    GetBusinessAssetsResponse_catalog_info catalog_info;
};
}

#endif /* TINY_CPP_CLIENT_GetBusinessAssetsResponse_H_ */
