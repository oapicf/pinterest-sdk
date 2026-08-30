
/*
 * NotificationPostRequest.h
 *
 * Notification request body. Can be either a batch of notification objects or a single notification object.
 */

#ifndef TINY_CPP_CLIENT_NotificationPostRequest_H_
#define TINY_CPP_CLIENT_NotificationPostRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Object.h"

namespace Tiny {


/*! \brief Notification request body. Can be either a batch of notification objects or a single notification object.
 *
 *  \ingroup Models
 *
 */

class NotificationPostRequest{
public:

    /*! \brief Constructor.
	 */
    NotificationPostRequest();
    NotificationPostRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~NotificationPostRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_NotificationPostRequest_H_ */
