#ifndef TINY_CPP_CLIENT_NotificationApi_H_
#define TINY_CPP_CLIENT_NotificationApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "NotificationPostRequest.h"
#include "NotificationResponse.h"
#include "Pinterest.Lib.Error.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class NotificationApi : public Service {
public:
    NotificationApi() = default;

    virtual ~NotificationApi();

    /**
    * Receive notifications from external partners..
    *
    * Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests' systems. This API is gated and you need to request access to this feature.
    * \param notificationPostRequest  *Required*
    */
    Response<
                NotificationResponse
        >
    notification_post(
            
            NotificationPostRequest notificationPostRequest
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_NotificationApi_H_ */