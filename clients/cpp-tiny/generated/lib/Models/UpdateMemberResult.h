
/*
 * UpdateMemberResult.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_UpdateMemberResult_H_
#define TINY_CPP_CLIENT_UpdateMemberResult_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class UpdateMemberResult{
public:

    /*! \brief Constructor.
	 */
    UpdateMemberResult();
    UpdateMemberResult(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdateMemberResult();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The access level a member has to the business. Values are case-sensitive. <br> - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. <br> - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access.
	 */
	std::string getBusinessRole();

	/*! \brief Set The access level a member has to the business. Values are case-sensitive. <br> - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. <br> - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access.
	 */
	void setBusinessRole(std::string  business_role);
	/*! \brief Get Unique identifier of the business member.
	 */
	std::string getMemberId();

	/*! \brief Set Unique identifier of the business member.
	 */
	void setMemberId(std::string  member_id);


    private:
    std::string business_role{};
    std::string member_id{};
};
}

#endif /* TINY_CPP_CLIENT_UpdateMemberResult_H_ */
