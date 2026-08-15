
/*
 * UpdatePartnerAssetsResult.h
 *
 * An object containing the permissions a business partner has on the asset.
 */

#ifndef TINY_CPP_CLIENT_UpdatePartnerAssetsResult_H_
#define TINY_CPP_CLIENT_UpdatePartnerAssetsResult_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief An object containing the permissions a business partner has on the asset.
 *
 *  \ingroup Models
 *
 */

class UpdatePartnerAssetsResult{
public:

    /*! \brief Constructor.
	 */
    UpdatePartnerAssetsResult();
    UpdatePartnerAssetsResult(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdatePartnerAssetsResult();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
	/*! \brief Get Unique identifier of a business partner.
	 */
	std::string getPartnerId();

	/*! \brief Set Unique identifier of a business partner.
	 */
	void setPartnerId(std::string  partner_id);
	/*! \brief Get Permission levels member or partner has on an asset.
	 */
	std::list<std::string> getPermissions();

	/*! \brief Set Permission levels member or partner has on an asset.
	 */
	void setPermissions(std::list <std::string> permissions);


    private:
    std::string asset_id{};
    std::string asset_type{};
    std::string partner_id{};
    std::list<std::string> permissions;
};
}

#endif /* TINY_CPP_CLIENT_UpdatePartnerAssetsResult_H_ */
