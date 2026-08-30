#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/notification_post_request.h"
#include "../model/notification_response.h"
#include "../model/pinterest_lib_error.h"


// Receive notifications from external partners.
//
// Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests' systems. This API is gated and you need to request access to this feature.
//
notification_response_t*
NotificationAPI_notificationPost(apiClient_t *apiClient, notification_post_request_t *notification_post_request);


