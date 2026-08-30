/*
 * AuthRespondInvitesBodyItem.h
 *
 * 
 */

#ifndef _AuthRespondInvitesBodyItem_H_
#define _AuthRespondInvitesBodyItem_H_


#include <string>
#include "AuthRespondInviteAction.h"
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

class AuthRespondInvitesBodyItem : public Object {
public:
	/*! \brief Constructor.
	 */
	AuthRespondInvitesBodyItem();
	AuthRespondInvitesBodyItem(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AuthRespondInvitesBodyItem();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	AuthRespondInviteAction getAction();

	/*! \brief Set 
	 */
	void setAction(AuthRespondInviteAction  action);
	/*! \brief Get Unique identifier of an invite.
	 */
	std::string getInviteId();

	/*! \brief Set Unique identifier of an invite.
	 */
	void setInviteId(std::string  invite_id);

private:
	AuthRespondInviteAction action;
	std::string invite_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AuthRespondInvitesBodyItem_H_ */
