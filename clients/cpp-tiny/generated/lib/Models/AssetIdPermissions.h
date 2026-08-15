
/*
 * AssetIdPermissions.h
 *
 * An object containing the permissions a business member has on the asset.
 */

#ifndef TINY_CPP_CLIENT_AssetIdPermissions_H_
#define TINY_CPP_CLIENT_AssetIdPermissions_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AssetGroupBinding.h"
#include <list>

namespace Tiny {


/*! \brief An object containing the permissions a business member has on the asset.
 *
 *  \ingroup Models
 *
 */

class AssetIdPermissions{
public:

    /*! \brief Constructor.
	 */
    AssetIdPermissions();
    AssetIdPermissions(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AssetIdPermissions();


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
	/*! \brief Get Permission levels member or partner has on an asset.
	 */
	std::list<std::string> getPermissions();

	/*! \brief Set Permission levels member or partner has on an asset.
	 */
	void setPermissions(std::list <std::string> permissions);


    private:
    AssetGroupBinding asset_group_info;
    std::string asset_id{};
    std::string asset_type{};
    std::list<std::string> permissions;
};
}

#endif /* TINY_CPP_CLIENT_AssetIdPermissions_H_ */
