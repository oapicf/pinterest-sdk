
/*
 * BusinessRoleForMembers.h
 *
 * The access level a member has to the business. Values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access.
 */

#ifndef TINY_CPP_CLIENT_BusinessRoleForMembers_H_
#define TINY_CPP_CLIENT_BusinessRoleForMembers_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The access level a member has to the business. Values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access.
 *
 *  \ingroup Models
 *
 */

class BusinessRoleForMembers{
public:

    /*! \brief Constructor.
	 */
    BusinessRoleForMembers();
    BusinessRoleForMembers(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BusinessRoleForMembers();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_BusinessRoleForMembers_H_ */
