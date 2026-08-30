
/*
 * BusinessRoleForInvite.h
 *
 * The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.
 */

#ifndef TINY_CPP_CLIENT_BusinessRoleForInvite_H_
#define TINY_CPP_CLIENT_BusinessRoleForInvite_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.
 *
 *  \ingroup Models
 *
 */

class BusinessRoleForInvite{
public:

    /*! \brief Constructor.
	 */
    BusinessRoleForInvite();
    BusinessRoleForInvite(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BusinessRoleForInvite();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_BusinessRoleForInvite_H_ */
