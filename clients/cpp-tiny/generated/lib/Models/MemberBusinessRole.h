
/*
 * MemberBusinessRole.h
 *
 * The access level a member/partner has to the business. Values are case-sensitive. - EMPLOYEE: Can only view and access ad accounts you assign to them. They cannot see details about other employees, external partners or other ad accounts. - BIZ_ADMIN: Have full control of roles and can add employees, external partners as well as grant ad account access.
 */

#ifndef TINY_CPP_CLIENT_MemberBusinessRole_H_
#define TINY_CPP_CLIENT_MemberBusinessRole_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The access level a member/partner has to the business. Values are case-sensitive. - EMPLOYEE: Can only view and access ad accounts you assign to them. They cannot see details about other employees, external partners or other ad accounts. - BIZ_ADMIN: Have full control of roles and can add employees, external partners as well as grant ad account access.
 *
 *  \ingroup Models
 *
 */

class MemberBusinessRole{
public:

    /*! \brief Constructor.
	 */
    MemberBusinessRole();
    MemberBusinessRole(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MemberBusinessRole();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_MemberBusinessRole_H_ */
