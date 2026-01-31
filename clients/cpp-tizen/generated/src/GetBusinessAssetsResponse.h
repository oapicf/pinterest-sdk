/*
 * GetBusinessAssetsResponse.h
 *
 * An object containing the permissions a business has on the asset.
 */

#ifndef _GetBusinessAssetsResponse_H_
#define _GetBusinessAssetsResponse_H_


#include <string>
#include "AssetGroupBinding.h"
#include "GetBusinessAssetsResponse_catalog_info.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief An object containing the permissions a business has on the asset.
 *
 *  \ingroup Models
 *
 */

class GetBusinessAssetsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetBusinessAssetsResponse();
	GetBusinessAssetsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetBusinessAssetsResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string asset_id;
	std::string asset_type;
	GetBusinessAssetsResponse_catalog_info catalog_info;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetBusinessAssetsResponse_H_ */
