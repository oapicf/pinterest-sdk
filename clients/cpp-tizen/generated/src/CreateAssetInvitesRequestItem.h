/*
 * CreateAssetInvitesRequestItem.h
 *
 * Object declaring an asset role update to an invite.
 */

#ifndef _CreateAssetInvitesRequestItem_H_
#define _CreateAssetInvitesRequestItem_H_


#include <string>
#include "InviteType.h"
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


/*! \brief Object declaring an asset role update to an invite.
 *
 *  \ingroup Models
 *
 */

class CreateAssetInvitesRequestItem : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateAssetInvitesRequestItem();
	CreateAssetInvitesRequestItem(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateAssetInvitesRequestItem();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	/*! \brief Get An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
	 */
	std::map<std::string, std::string> getAssetIdToPermissions();

	/*! \brief Set An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
	 */
	void setAssetIdToPermissions(std::map <std::string, std::string> asset_id_to_permissions);

private:
	std::string invite_id;
	InviteType invite_type;
	std::map <std::string, std::string>asset_id_to_permissions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateAssetInvitesRequestItem_H_ */
