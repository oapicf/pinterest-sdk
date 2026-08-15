
/*
 * BusinessRole.h
 *
 * The access level a member/partner has to the business. Values are case-sensitive. &lt;br&gt; - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. &lt;br&gt; - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. &lt;br&gt; - PARTNER: Can only view and access assets you assign them to/or they assign to you.
 */

#ifndef TINY_CPP_CLIENT_BusinessRole_H_
#define TINY_CPP_CLIENT_BusinessRole_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The access level a member/partner has to the business. Values are case-sensitive. <br> - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. <br> - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. <br> - PARTNER: Can only view and access assets you assign them to/or they assign to you.
 *
 *  \ingroup Models
 *
 */

class BusinessRole{
public:

    /*! \brief Constructor.
	 */
    BusinessRole();
    BusinessRole(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BusinessRole();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_BusinessRole_H_ */
