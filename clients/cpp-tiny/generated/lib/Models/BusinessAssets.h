
/*
 * BusinessAssets.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_BusinessAssets_H_
#define TINY_CPP_CLIENT_BusinessAssets_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AssetGroupBinding.h"
#include "AssetTypeResponse.h"
#include "CatalogBinding.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class BusinessAssets{
public:

    /*! \brief Constructor.
	 */
    BusinessAssets();
    BusinessAssets(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BusinessAssets();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals 'ASSET_GROUP'.
	 */
	AssetGroupBinding getAssetGroupInfo();

	/*! \brief Set An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals 'ASSET_GROUP'.
	 */
	void setAssetGroupInfo(AssetGroupBinding asset_group_info);
	/*! \brief Get Unique identifier of a business asset.
	 */
	std::string getAssetId();

	/*! \brief Set Unique identifier of a business asset.
	 */
	void setAssetId(std::string asset_id);
	/*! \brief Get 
	 */
	AssetTypeResponse getAssetType();

	/*! \brief Set 
	 */
	void setAssetType(AssetTypeResponse asset_type);
	/*! \brief Get Permission levels the requesting business has on an asset.
	 */
	std::list<std::string> getPermissions();

	/*! \brief Set Permission levels the requesting business has on an asset.
	 */
	void setPermissions(std::list<std::string> permissions);
	/*! \brief Get An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals 'CATALOG'.
	 */
	CatalogBinding getCatalogInfo();

	/*! \brief Set An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals 'CATALOG'.
	 */
	void setCatalogInfo(CatalogBinding catalog_info);


    private:
    AssetGroupBinding asset_group_info;
    std::string asset_id{};
    AssetTypeResponse asset_type;
    std::list<std::string> permissions;
    CatalogBinding catalog_info;
};
}

#endif /* TINY_CPP_CLIENT_BusinessAssets_H_ */
