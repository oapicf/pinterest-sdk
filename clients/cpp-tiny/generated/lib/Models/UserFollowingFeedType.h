
/*
 * UserFollowingFeedType.h
 *
 * Specifies the type of followees to be kept when filtering them.
 */

#ifndef TINY_CPP_CLIENT_UserFollowingFeedType_H_
#define TINY_CPP_CLIENT_UserFollowingFeedType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Specifies the type of followees to be kept when filtering them.
 *
 *  \ingroup Models
 *
 */

class UserFollowingFeedType{
public:

    /*! \brief Constructor.
	 */
    UserFollowingFeedType();
    UserFollowingFeedType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UserFollowingFeedType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_UserFollowingFeedType_H_ */
