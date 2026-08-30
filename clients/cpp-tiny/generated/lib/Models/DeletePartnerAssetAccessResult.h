
/*
 * DeletePartnerAssetAccessResult.h
 *
 * The terminated asset access.
 */

#ifndef TINY_CPP_CLIENT_DeletePartnerAssetAccessResult_H_
#define TINY_CPP_CLIENT_DeletePartnerAssetAccessResult_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief The terminated asset access.
 *
 *  \ingroup Models
 *
 */

class DeletePartnerAssetAccessResult{
public:

    /*! \brief Constructor.
	 */
    DeletePartnerAssetAccessResult();
    DeletePartnerAssetAccessResult(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DeletePartnerAssetAccessResult();


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
	void setAssetId(std::string asset_id);
	/*! \brief Get Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
	 */
	std::string getAssetType();

	/*! \brief Set Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
	 */
	void setAssetType(std::string asset_type);
	/*! \brief Get If is_shared_partner=FALSE, you terminated a partner's asset access to your business asset. If is_shared_partner=TRUE, you terminated your asset access to your partner's business asset.
	 */
	bool isIsSharedPartner();

	/*! \brief Set If is_shared_partner=FALSE, you terminated a partner's asset access to your business asset. If is_shared_partner=TRUE, you terminated your asset access to your partner's business asset.
	 */
	void setIsSharedPartner(bool is_shared_partner);
	/*! \brief Get Unique identifier of a business partner.
	 */
	std::string getPartnerId();

	/*! \brief Set Unique identifier of a business partner.
	 */
	void setPartnerId(std::string partner_id);
	/*! \brief Get Permission levels member or partner has on an asset.
	 */
	std::list<std::string> getPermissions();

	/*! \brief Set Permission levels member or partner has on an asset.
	 */
	void setPermissions(std::list<std::string> permissions);


    private:
    std::string asset_id{};
    std::string asset_type{};
    bool is_shared_partner{};
    std::string partner_id{};
    std::list<std::string> permissions;
};
}

#endif /* TINY_CPP_CLIENT_DeletePartnerAssetAccessResult_H_ */
