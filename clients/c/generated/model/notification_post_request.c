#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "notification_post_request.h"



static notification_post_request_t *notification_post_request_create_internal(
    ) {
    notification_post_request_t *notification_post_request_local_var = malloc(sizeof(notification_post_request_t));
    if (!notification_post_request_local_var) {
        return NULL;
    }

    notification_post_request_local_var->_library_owned = 1;
    return notification_post_request_local_var;
}

__attribute__((deprecated)) notification_post_request_t *notification_post_request_create(
    ) {
    return notification_post_request_create_internal (
        );
}

void notification_post_request_free(notification_post_request_t *notification_post_request) {
    if(NULL == notification_post_request){
        return ;
    }
    if(notification_post_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "notification_post_request_free");
        return ;
    }
    listEntry_t *listEntry;
    free(notification_post_request);
}

cJSON *notification_post_request_convertToJSON(notification_post_request_t *notification_post_request) {
    cJSON *item = cJSON_CreateObject();
    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

notification_post_request_t *notification_post_request_parseFromJSON(cJSON *notification_post_requestJSON){

    notification_post_request_t *notification_post_request_local_var = NULL;


    notification_post_request_local_var = notification_post_request_create_internal (
        );

    return notification_post_request_local_var;
end:
    return NULL;

}
