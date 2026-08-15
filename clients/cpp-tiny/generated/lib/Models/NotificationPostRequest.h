
/*
 * Notification_post_request.h
 *
 * Any valid JSON object
 */

#ifndef TINY_CPP_CLIENT_Notification_post_request_H_
#define TINY_CPP_CLIENT_Notification_post_request_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AnyType.h"
#include <map>

namespace Tiny {


/*! \brief Any valid JSON object
 *
 *  \ingroup Models
 *
 */

class Notification_post_request{
public:

    /*! \brief Constructor.
	 */
    Notification_post_request();
    Notification_post_request(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Notification_post_request();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_Notification_post_request_H_ */
