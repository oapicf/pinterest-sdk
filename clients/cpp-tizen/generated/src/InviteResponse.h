/*
 * InviteResponse.h
 *
 * 
 */

#ifndef _InviteResponse_H_
#define _InviteResponse_H_


#include <string>
#include "BaseInviteDataResponse_invite_data.h"
#include "BusinessAccessUserSummary.h"
#include "InviteAssetsSummary.h"
#include <list>
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

class InviteResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	InviteResponse();
	InviteResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~InviteResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	InviteAssetsSummary getAssetsSummary();

	/*! \brief Set 
	 */
	void setAssetsSummary(InviteAssetsSummary  assets_summary);
	/*! \brief Get The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
	 */
	std::list<std::string> getBusinessRoles();

	/*! \brief Set The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
	 */
	void setBusinessRoles(std::list <std::string> business_roles);
	/*! \brief Get Metadata for the business that created the invite/request.
	 */
	BusinessAccessUserSummary getCreatedByBusiness();

	/*! \brief Set Metadata for the business that created the invite/request.
	 */
	void setCreatedByBusiness(BusinessAccessUserSummary  created_by_business);
	/*! \brief Get Metadata for the user that created the invite/request.
	 */
	BusinessAccessUserSummary getCreatedByUser();

	/*! \brief Set Metadata for the user that created the invite/request.
	 */
	void setCreatedByUser(BusinessAccessUserSummary  created_by_user);
	/*! \brief Get The time the invite/request was created. Returned in milliseconds.
	 */
	int getCreatedTime();

	/*! \brief Set The time the invite/request was created. Returned in milliseconds.
	 */
	void setCreatedTime(int  created_time);
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
	/*! \brief Get Metadata for the member/partner that was sent the invite/request.
	 */
	BusinessAccessUserSummary getUser();

	/*! \brief Set Metadata for the member/partner that was sent the invite/request.
	 */
	void setUser(BusinessAccessUserSummary  user);

private:
	InviteAssetsSummary assets_summary;
	std::list <std::string>business_roles;
	BusinessAccessUserSummary created_by_business;
	BusinessAccessUserSummary created_by_user;
	int created_time;
	std::string id;
	BaseInviteDataResponse_invite_data invite_data;
	bool is_received_invite;
	BusinessAccessUserSummary user;
	void __init();
	void __cleanup();

};
}
}

#endif /* _InviteResponse_H_ */
