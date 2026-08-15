
/*
 * UserListType.h
 *
 * User list type
 */

#ifndef TINY_CPP_CLIENT_UserListType_H_
#define TINY_CPP_CLIENT_UserListType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief User list type
 *
 *  \ingroup Models
 *
 */

class UserListType{
public:

    /*! \brief Constructor.
	 */
    UserListType();
    UserListType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UserListType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_UserListType_H_ */
