/*
 * AssetIdPermissions.h
 *
 * An object containing the permissions a business member has on the asset.
 */

#ifndef _AssetIdPermissions_H_
#define _AssetIdPermissions_H_


#include <string>
#include "AssetGroupBinding.h"
#include "AssetTypeResponse.h"
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

	/*! \brief Get An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals 'ASSET_GROUP'.
	 */
	AssetGroupBinding getAssetGroupInfo();

	/*! \brief Set An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals 'ASSET_GROUP'.
	 */
	void setAssetGroupInfo(AssetGroupBinding  asset_group_info);
	/*! \brief Get Unique identifier of a business asset.
	 */
	std::string getAssetId();

	/*! \brief Set Unique identifier of a business asset.
	 */
	void setAssetId(std::string  asset_id);
	/*! \brief Get 
	 */
	AssetTypeResponse getAssetType();

	/*! \brief Set 
	 */
	void setAssetType(AssetTypeResponse  asset_type);
	/*! \brief Get Permission levels member or partner has on an asset.
	 */
	std::list<std::string> getPermissions();

	/*! \brief Set Permission levels member or partner has on an asset.
	 */
	void setPermissions(std::list <std::string> permissions);

private:
	AssetGroupBinding asset_group_info;
	std::string asset_id;
	AssetTypeResponse asset_type;
	std::list <std::string>permissions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AssetIdPermissions_H_ */
