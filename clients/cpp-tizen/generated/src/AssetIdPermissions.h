/*
 * AssetIdPermissions.h
 *
 * An object containing the permissions a business member has on the asset.
 */

#ifndef _AssetIdPermissions_H_
#define _AssetIdPermissions_H_


#include <string>
#include "AssetGroupBinding.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief An object containing the permissions a business member has on the asset.
 *
 *  \ingroup Models
 *
 */

class AssetIdPermissions : public Object {
public:
	/*! \brief Constructor.
	 */
	AssetIdPermissions();
	AssetIdPermissions(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AssetIdPermissions();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Unique identifier of a business asset.
	 */
	std::string getAssetId();

	/*! \brief Set Unique identifier of a business asset.
	 */
	void setAssetId(std::string  asset_id);
	/*! \brief Get Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.
	 */
	std::string getAssetType();

	/*! \brief Set Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.
	 */
	void setAssetType(std::string  asset_type);
	/*! \brief Get Permission levels member or partner has on an asset.
	 */
	std::list<std::string> getPermissions();

	/*! \brief Set Permission levels member or partner has on an asset.
	 */
	void setPermissions(std::list <std::string> permissions);
	/*! \brief Get 
	 */
	AssetGroupBinding getAssetGroupInfo();

	/*! \brief Set 
	 */
	void setAssetGroupInfo(AssetGroupBinding  asset_group_info);

private:
	std::string asset_id;
	std::string asset_type;
	std::list <std::string>permissions;
	AssetGroupBinding asset_group_info;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AssetIdPermissions_H_ */
