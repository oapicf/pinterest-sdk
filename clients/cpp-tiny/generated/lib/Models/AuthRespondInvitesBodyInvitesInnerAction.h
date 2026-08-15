
/*
 * AuthRespondInvitesBody_invites_inner_action.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AuthRespondInvitesBody_invites_inner_action_H_
#define TINY_CPP_CLIENT_AuthRespondInvitesBody_invites_inner_action_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Permissions.h"
#include <list>
#include <map>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AuthRespondInvitesBody_invites_inner_action{
public:

    /*! \brief Constructor.
	 */
    AuthRespondInvitesBody_invites_inner_action();
    AuthRespondInvitesBody_invites_inner_action(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AuthRespondInvitesBody_invites_inner_action();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Whether the invite/request is accepted.
	 */
	bool isAcceptInvite();

	/*! \brief Set Whether the invite/request is accepted.
	 */
	void setAcceptInvite(bool  accept_invite);
	/*! \brief Get An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
	 */
	Map<std::string, std::string> getAssetIdToPermissions();

	/*! \brief Set An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
	 */
	void setAssetIdToPermissions(Map <std::string, std::string> asset_id_to_permissions);


    private:
    bool accept_invite{};
    Map<std::string, std::string> asset_id_to_permissions;
};
}

#endif /* TINY_CPP_CLIENT_AuthRespondInvitesBody_invites_inner_action_H_ */
