/*
 * AuthRespondInvitesBody_invites_inner_action.h
 *
 * 
 */

#ifndef _AuthRespondInvitesBody_invites_inner_action_H_
#define _AuthRespondInvitesBody_invites_inner_action_H_


#include <string>
#include "Permissions.h"
#include <list>
#include <map>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AuthRespondInvitesBody_invites_inner_action : public Object {
public:
	/*! \brief Constructor.
	 */
	AuthRespondInvitesBody_invites_inner_action();
	AuthRespondInvitesBody_invites_inner_action(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AuthRespondInvitesBody_invites_inner_action();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Whether the invite/request is accepted.
	 */
	bool getAcceptInvite();

	/*! \brief Set Whether the invite/request is accepted.
	 */
	void setAcceptInvite(bool  accept_invite);
	/*! \brief Get An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
	 */
	std::map<std::string, std::string> getAssetIdToPermissions();

	/*! \brief Set An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
	 */
	void setAssetIdToPermissions(std::map <std::string, std::string> asset_id_to_permissions);

private:
	bool accept_invite;
	std::map <std::string, std::string>asset_id_to_permissions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AuthRespondInvitesBody_invites_inner_action_H_ */
