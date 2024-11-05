/*
 * InviteBusinessRoleBinding.h
 *
 * An invite object if the invite/request was successfully updated. Will only be provided if the an invite/request is successfully updated.
 */

#ifndef _InviteBusinessRoleBinding_H_
#define _InviteBusinessRoleBinding_H_


#include <string>
#include "BaseInviteDataResponse_invite_data.h"
#include "BusinessAccessUserSummary.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief An invite object if the invite/request was successfully updated. Will only be provided if the an invite/request is successfully updated.
 *
 *  \ingroup Models
 *
 */

class InviteBusinessRoleBinding : public Object {
public:
	/*! \brief Constructor.
	 */
	InviteBusinessRoleBinding();
	InviteBusinessRoleBinding(char* str);

	/*! \brief Destructor.
	 */
	virtual ~InviteBusinessRoleBinding();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Unique identifier for the business that created the invite/request.
	 */
	std::string getCreatedByBusinessId();

	/*! \brief Set Unique identifier for the business that created the invite/request.
	 */
	void setCreatedByBusinessId(std::string  created_by_business_id);
	/*! \brief Get Unique identifier for the user that created the invite/request.
	 */
	std::string getCreatedByUserId();

	/*! \brief Set Unique identifier for the user that created the invite/request.
	 */
	void setCreatedByUserId(std::string  created_by_user_id);
	/*! \brief Get Metadata for the user that updated the invite/request.
	 */
	BusinessAccessUserSummary getUser();

	/*! \brief Set Metadata for the user that updated the invite/request.
	 */
	void setUser(BusinessAccessUserSummary  user);
	/*! \brief Get Unique identifier of the invite/request.
	 */
	std::string getId();

	/*! \brief Set Unique identifier of the invite/request.
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	BaseInviteDataResponse_invite_data getInviteData();

	/*! \brief Set 
	 */
	void setInviteData(BaseInviteDataResponse_invite_data  invite_data);
	/*! \brief Get Indicates whether the invite/request was received.
	 */
	bool getIsReceivedInvite();

	/*! \brief Set Indicates whether the invite/request was received.
	 */
	void setIsReceivedInvite(bool  is_received_invite);

private:
	std::string created_by_business_id;
	std::string created_by_user_id;
	BusinessAccessUserSummary user;
	std::string id;
	BaseInviteDataResponse_invite_data invite_data;
	bool is_received_invite;
	void __init();
	void __cleanup();

};
}
}

#endif /* _InviteBusinessRoleBinding_H_ */
