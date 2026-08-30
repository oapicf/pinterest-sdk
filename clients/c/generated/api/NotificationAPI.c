#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>

#include "NotificationAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define MAX_NUMBER_LENGTH_LONG 21


// Receive notifications from external partners.
//
// Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests' systems. This API is gated and you need to request access to this feature.
//
notification_response_t*
NotificationAPI_notificationPost(apiClient_t *apiClient, notification_post_request_t *notification_post_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/notifications");





    // Body Param
    cJSON *localVarSingleItemJSON_notification_post_request = NULL;
    if (notification_post_request != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_notification_post_request = notification_post_request_convertToJSON(notification_post_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_notification_post_request);
        localVarBodyLength = strlen(localVarBodyParameters);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/json"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","The request has succeeded.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","The request could not be understood by the server due to unexpected data.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","An unexpected error response.");
    //}
    //nonprimitive not container
    notification_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *NotificationAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = notification_response_parseFromJSON(NotificationAPIlocalVarJSON);
        cJSON_Delete(NotificationAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    if (localVarSingleItemJSON_notification_post_request) {
        cJSON_Delete(localVarSingleItemJSON_notification_post_request);
        localVarSingleItemJSON_notification_post_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

