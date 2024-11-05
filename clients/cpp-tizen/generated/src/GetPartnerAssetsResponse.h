/*
 * GetPartnerAssetsResponse.h
 *
 * An object containing the permissions a you/your business partner has on the asset.
 */

#ifndef _GetPartnerAssetsResponse_H_
#define _GetPartnerAssetsResponse_H_


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


/*! \brief An object containing the permissions a you/your business partner has on the asset.
 *
 *  \ingroup Models
 *
 */

class GetPartnerAssetsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetPartnerAssetsResponse();
	GetPartnerAssetsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetPartnerAssetsResponse();

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
	/*! \brief Get The permissions you or your partner has on the asset. If partner_type=INTERNAL, the permission levels are for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the permission levels are for the access you have to the partner's business asset.
	 */
	std::list<std::string> getPermissions();

	/*! \brief Set The permissions you or your partner has on the asset. If partner_type=INTERNAL, the permission levels are for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the permission levels are for the access you have to the partner's business asset.
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

#endif /* _GetPartnerAssetsResponse_H_ */
