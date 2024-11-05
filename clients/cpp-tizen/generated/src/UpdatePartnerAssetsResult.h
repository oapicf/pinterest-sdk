/*
 * UpdatePartnerAssetsResult.h
 *
 * An object containing the permissions a business partner has on the asset.
 */

#ifndef _UpdatePartnerAssetsResult_H_
#define _UpdatePartnerAssetsResult_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief An object containing the permissions a business partner has on the asset.
 *
 *  \ingroup Models
 *
 */

class UpdatePartnerAssetsResult : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdatePartnerAssetsResult();
	UpdatePartnerAssetsResult(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdatePartnerAssetsResult();

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
	std::string asset_id;
	std::string asset_type;
	std::string partner_id;
	std::list <std::string>permissions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdatePartnerAssetsResult_H_ */
