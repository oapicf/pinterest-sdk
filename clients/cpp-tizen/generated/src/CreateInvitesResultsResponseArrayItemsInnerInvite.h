/*
 * CreateInvitesResultsResponseArray_items_inner_invite.h
 *
 * An invite object if the invite/request was successfully created. Will only be provided if the an invite/request is successfully created.
 */

#ifndef _CreateInvitesResultsResponseArray_items_inner_invite_H_
#define _CreateInvitesResultsResponseArray_items_inner_invite_H_


#include <string>
#include "BusinessAccessUserSummary.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief An invite object if the invite/request was successfully created. Will only be provided if the an invite/request is successfully created.
 *
 *  \ingroup Models
 *
 */

class CreateInvitesResultsResponseArray_items_inner_invite : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateInvitesResultsResponseArray_items_inner_invite();
	CreateInvitesResultsResponseArray_items_inner_invite(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateInvitesResultsResponseArray_items_inner_invite();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Unique identifier of the invite/request.
	 */
	std::string getId();

	/*! \brief Set Unique identifier of the invite/request.
	 */
	void setId(std::string  id);
	/*! \brief Get Metadata for the member/partner that was sent the invite/request.
	 */
	BusinessAccessUserSummary getUser();

	/*! \brief Set Metadata for the member/partner that was sent the invite/request.
	 */
	void setUser(BusinessAccessUserSummary  user);

private:
	std::string id;
	BusinessAccessUserSummary user;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateInvitesResultsResponseArray_items_inner_invite_H_ */
