
/*
 * UserAccountType.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_UserAccountType_H_
#define TINY_CPP_CLIENT_UserAccountType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class UserAccountType{
public:

    /*! \brief Constructor.
	 */
    UserAccountType();
    UserAccountType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UserAccountType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_UserAccountType_H_ */
