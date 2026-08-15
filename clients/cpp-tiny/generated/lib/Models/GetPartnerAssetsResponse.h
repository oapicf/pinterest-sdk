
/*
 * GetPartnerAssetsResponse.h
 *
 * An object containing the permissions a you/your business partner has on the asset.
 */

#ifndef TINY_CPP_CLIENT_GetPartnerAssetsResponse_H_
#define TINY_CPP_CLIENT_GetPartnerAssetsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AssetGroupBinding.h"
#include <list>

namespace Tiny {


/*! \brief An object containing the permissions a you/your business partner has on the asset.
 *
 *  \ingroup Models
 *
 */

class GetPartnerAssetsResponse{
public:

    /*! \brief Constructor.
	 */
    GetPartnerAssetsResponse();
    GetPartnerAssetsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetPartnerAssetsResponse();


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
	/*! \brief Get The permissions you or your partner has on the asset. If partner_type=INTERNAL, the permission levels are for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the permission levels are for the access you have to the partner's business asset.
	 */
	std::list<std::string> getPermissions();

	/*! \brief Set The permissions you or your partner has on the asset. If partner_type=INTERNAL, the permission levels are for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the permission levels are for the access you have to the partner's business asset.
	 */
	void setPermissions(std::list <std::string> permissions);


    private:
    AssetGroupBinding asset_group_info;
    std::string asset_id{};
    std::string asset_type{};
    std::list<std::string> permissions;
};
}

#endif /* TINY_CPP_CLIENT_GetPartnerAssetsResponse_H_ */
