
/*
 * DeleteBusinessMembershipMember.h
 *
 * Single instance of a business member to be removed from the business.
 */

#ifndef TINY_CPP_CLIENT_DeleteBusinessMembershipMember_H_
#define TINY_CPP_CLIENT_DeleteBusinessMembershipMember_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BusinessRoleForMembers.h"

namespace Tiny {


/*! \brief Single instance of a business member to be removed from the business.
 *
 *  \ingroup Models
 *
 */

class DeleteBusinessMembershipMember{
public:

    /*! \brief Constructor.
	 */
    DeleteBusinessMembershipMember();
    DeleteBusinessMembershipMember(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DeleteBusinessMembershipMember();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	BusinessRoleForMembers getBusinessRole();

	/*! \brief Set 
	 */
	void setBusinessRole(BusinessRoleForMembers business_role);
	/*! \brief Get Unique identifier of the member
	 */
	std::string getMemberId();

	/*! \brief Set Unique identifier of the member
	 */
	void setMemberId(std::string member_id);


    private:
    BusinessRoleForMembers business_role;
    std::string member_id{};
};
}

#endif /* TINY_CPP_CLIENT_DeleteBusinessMembershipMember_H_ */
