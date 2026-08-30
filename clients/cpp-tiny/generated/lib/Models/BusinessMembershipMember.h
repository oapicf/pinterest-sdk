
/*
 * BusinessMembershipMember.h
 *
 * A business member identified by &#x60;member_id&#x60; with their &#x60;business_role&#x60; in the business.
 */

#ifndef TINY_CPP_CLIENT_BusinessMembershipMember_H_
#define TINY_CPP_CLIENT_BusinessMembershipMember_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BusinessRoleForMembers.h"

namespace Tiny {


/*! \brief A business member identified by `member_id` with their `business_role` in the business.
 *
 *  \ingroup Models
 *
 */

class BusinessMembershipMember{
public:

    /*! \brief Constructor.
	 */
    BusinessMembershipMember();
    BusinessMembershipMember(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BusinessMembershipMember();


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
	/*! \brief Get Unique identifier of the member.
	 */
	std::string getMemberId();

	/*! \brief Set Unique identifier of the member.
	 */
	void setMemberId(std::string member_id);


    private:
    BusinessRoleForMembers business_role;
    std::string member_id{};
};
}

#endif /* TINY_CPP_CLIENT_BusinessMembershipMember_H_ */
