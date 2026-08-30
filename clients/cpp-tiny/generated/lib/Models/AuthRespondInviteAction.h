
/*
 * AuthRespondInviteAction.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AuthRespondInviteAction_H_
#define TINY_CPP_CLIENT_AuthRespondInviteAction_H_


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

class AuthRespondInviteAction{
public:

    /*! \brief Constructor.
	 */
    AuthRespondInviteAction();
    AuthRespondInviteAction(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AuthRespondInviteAction();


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
	void setAcceptInvite(bool accept_invite);
	/*! \brief Get An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.
	 */
	std::map<std::string, std::list> getAssetIdToPermissions();

	/*! \brief Set An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.
	 */
	void setAssetIdToPermissions(std::map<std::string, std::list> asset_id_to_permissions);


    private:
    bool accept_invite{};
    std::map<std::string, std::list> asset_id_to_permissions;
};
}

#endif /* TINY_CPP_CLIENT_AuthRespondInviteAction_H_ */
