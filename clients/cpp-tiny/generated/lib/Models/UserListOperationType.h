
/*
 * UserListOperationType.h
 *
 * User list operation type (add or remove)
 */

#ifndef TINY_CPP_CLIENT_UserListOperationType_H_
#define TINY_CPP_CLIENT_UserListOperationType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief User list operation type (add or remove)
 *
 *  \ingroup Models
 *
 */

class UserListOperationType{
public:

    /*! \brief Constructor.
	 */
    UserListOperationType();
    UserListOperationType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UserListOperationType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_UserListOperationType_H_ */
