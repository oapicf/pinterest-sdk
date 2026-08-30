/*
 * AuthRespondInviteAction.h
 *
 * 
 */

#ifndef _AuthRespondInviteAction_H_
#define _AuthRespondInviteAction_H_


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

class AuthRespondInviteAction : public Object {
public:
	/*! \brief Constructor.
	 */
	AuthRespondInviteAction();
	AuthRespondInviteAction(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AuthRespondInviteAction();

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

#endif /* _AuthRespondInviteAction_H_ */
