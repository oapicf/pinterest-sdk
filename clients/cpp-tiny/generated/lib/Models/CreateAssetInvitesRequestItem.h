
/*
 * CreateAssetInvitesRequestItem.h
 *
 * Object declaring an asset role update to an invite.
 */

#ifndef TINY_CPP_CLIENT_CreateAssetInvitesRequestItem_H_
#define TINY_CPP_CLIENT_CreateAssetInvitesRequestItem_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "InviteType.h"
#include "Permissions.h"
#include <list>
#include <map>

namespace Tiny {


/*! \brief Object declaring an asset role update to an invite.
 *
 *  \ingroup Models
 *
 */

class CreateAssetInvitesRequestItem{
public:

    /*! \brief Constructor.
	 */
    CreateAssetInvitesRequestItem();
    CreateAssetInvitesRequestItem(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateAssetInvitesRequestItem();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
	 */
	Map<std::string, std::string> getAssetIdToPermissions();

	/*! \brief Set An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
	 */
	void setAssetIdToPermissions(Map <std::string, std::string> asset_id_to_permissions);
	/*! \brief Get Unique identifier of an invite.
	 */
	std::string getInviteId();

	/*! \brief Set Unique identifier of an invite.
	 */
	void setInviteId(std::string  invite_id);
	/*! \brief Get 
	 */
	InviteType getInviteType();

	/*! \brief Set 
	 */
	void setInviteType(InviteType  invite_type);


    private:
    Map<std::string, std::string> asset_id_to_permissions;
    std::string invite_id{};
    InviteType invite_type;
};
}

#endif /* TINY_CPP_CLIENT_CreateAssetInvitesRequestItem_H_ */
