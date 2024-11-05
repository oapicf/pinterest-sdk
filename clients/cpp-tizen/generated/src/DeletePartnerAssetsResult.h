/*
 * DeletePartnerAssetsResult.h
 *
 * The terminated asset access.
 */

#ifndef _DeletePartnerAssetsResult_H_
#define _DeletePartnerAssetsResult_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The terminated asset access.
 *
 *  \ingroup Models
 *
 */

class DeletePartnerAssetsResult : public Object {
public:
	/*! \brief Constructor.
	 */
	DeletePartnerAssetsResult();
	DeletePartnerAssetsResult(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DeletePartnerAssetsResult();

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
	/*! \brief Get If is_shared_partner=FALSE, you terminated a partner's asset access to your business asset.<br> If is_shared_partner=TRUE, you terminated your asset access to your partner's business asset.
	 */
	bool getIsSharedPartner();

	/*! \brief Set If is_shared_partner=FALSE, you terminated a partner's asset access to your business asset.<br> If is_shared_partner=TRUE, you terminated your asset access to your partner's business asset.
	 */
	void setIsSharedPartner(bool  is_shared_partner);
	/*! \brief Get Unique identifier of a business partner.
	 */
	std::string getPartnerId();

	/*! \brief Set Unique identifier of a business partner.
	 */
	void setPartnerId(std::string  partner_id);

private:
	std::string asset_id;
	std::string asset_type;
	std::list <std::string>permissions;
	bool is_shared_partner;
	std::string partner_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DeletePartnerAssetsResult_H_ */
