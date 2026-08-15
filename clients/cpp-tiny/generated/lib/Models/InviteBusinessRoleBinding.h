
/*
 * InviteBusinessRoleBinding.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_InviteBusinessRoleBinding_H_
#define TINY_CPP_CLIENT_InviteBusinessRoleBinding_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BaseInviteDataResponse_invite_data.h"
#include "Object.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class InviteBusinessRoleBinding{
public:

    /*! \brief Constructor.
	 */
    InviteBusinessRoleBinding();
    InviteBusinessRoleBinding(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~InviteBusinessRoleBinding();


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
	/*! \brief Get Metadata for the user that updated the invite/request.
	 */
	Object getUser();

	/*! \brief Set Metadata for the user that updated the invite/request.
	 */
	void setUser(Object  user);
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


    private:
    std::string id{};
    BaseInviteDataResponse_invite_data invite_data;
    bool is_received_invite{};
    Object user;
    std::string created_by_business_id{};
    std::string created_by_user_id{};
};
}

#endif /* TINY_CPP_CLIENT_InviteBusinessRoleBinding_H_ */
