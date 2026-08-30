
/*
 * UpdatePartnerAssetAccessItem.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_UpdatePartnerAssetAccessItem_H_
#define TINY_CPP_CLIENT_UpdatePartnerAssetAccessItem_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Permissions.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class UpdatePartnerAssetAccessItem{
public:

    /*! \brief Constructor.
	 */
    UpdatePartnerAssetAccessItem();
    UpdatePartnerAssetAccessItem(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdatePartnerAssetAccessItem();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Unique identifier of the business asset.
	 */
	std::string getAssetId();

	/*! \brief Set Unique identifier of the business asset.
	 */
	void setAssetId(std::string asset_id);
	/*! \brief Get Unique identifier of a business partner to update asset access to.
	 */
	std::string getPartnerId();

	/*! \brief Set Unique identifier of a business partner to update asset access to.
	 */
	void setPartnerId(std::string partner_id);
	/*! \brief Get A non-empty array of permissions to assign to the partner.
	 */
	std::list<Permissions> getPermissions();

	/*! \brief Set A non-empty array of permissions to assign to the partner.
	 */
	void setPermissions(std::list<Permissions> permissions);


    private:
    std::string asset_id{};
    std::string partner_id{};
    std::list<Permissions> permissions;
};
}

#endif /* TINY_CPP_CLIENT_UpdatePartnerAssetAccessItem_H_ */
