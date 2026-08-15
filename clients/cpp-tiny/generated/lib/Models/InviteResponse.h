
/*
 * InviteResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_InviteResponse_H_
#define TINY_CPP_CLIENT_InviteResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BaseInviteDataResponse_invite_data.h"
#include "BusinessAccessUserSummary.h"
#include "InviteAssetsSummary.h"
#include "Object.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class InviteResponse{
public:

    /*! \brief Constructor.
	 */
    InviteResponse();
    InviteResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~InviteResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
	bool isIsReceivedInvite();

	/*! \brief Set Indicates whether the invite/request was received.
	 */
	void setIsReceivedInvite(bool  is_received_invite);
	/*! \brief Get Metadata for the member/partner that was sent the invite/request.
	 */
	BusinessAccessUserSummary getUser();

	/*! \brief Set Metadata for the member/partner that was sent the invite/request.
	 */
	void setUser(BusinessAccessUserSummary  user);
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
	Object getCreatedByBusiness();

	/*! \brief Set Metadata for the business that created the invite/request.
	 */
	void setCreatedByBusiness(Object  created_by_business);
	/*! \brief Get Metadata for the user that created the invite/request.
	 */
	Object getCreatedByUser();

	/*! \brief Set Metadata for the user that created the invite/request.
	 */
	void setCreatedByUser(Object  created_by_user);
	/*! \brief Get The time the invite/request was created. Returned in milliseconds.
	 */
	int getCreatedTime();

	/*! \brief Set The time the invite/request was created. Returned in milliseconds.
	 */
	void setCreatedTime(int  created_time);


    private:
    std::string id{};
    BaseInviteDataResponse_invite_data invite_data;
    bool is_received_invite{};
    BusinessAccessUserSummary user;
    InviteAssetsSummary assets_summary;
    std::list<std::string> business_roles;
    Object created_by_business;
    Object created_by_user;
    int created_time{};
};
}

#endif /* TINY_CPP_CLIENT_InviteResponse_H_ */
