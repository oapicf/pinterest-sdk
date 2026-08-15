
/*
 * Role.h
 *
 * An internal role type used on business access, EMPLOYEE, ADMIN.
 */

#ifndef TINY_CPP_CLIENT_Role_H_
#define TINY_CPP_CLIENT_Role_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief An internal role type used on business access, EMPLOYEE, ADMIN.
 *
 *  \ingroup Models
 *
 */

class Role{
public:

    /*! \brief Constructor.
	 */
    Role();
    Role(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Role();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_Role_H_ */
