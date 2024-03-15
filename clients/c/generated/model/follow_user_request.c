#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "follow_user_request.h"



follow_user_request_t *follow_user_request_create(
    int auto_follow
    ) {
    follow_user_request_t *follow_user_request_local_var = malloc(sizeof(follow_user_request_t));
    if (!follow_user_request_local_var) {
        return NULL;
    }
    follow_user_request_local_var->auto_follow = auto_follow;

    return follow_user_request_local_var;
}


void follow_user_request_free(follow_user_request_t *follow_user_request) {
    if(NULL == follow_user_request){
        return ;
    }
    listEntry_t *listEntry;
    free(follow_user_request);
}

cJSON *follow_user_request_convertToJSON(follow_user_request_t *follow_user_request) {
    cJSON *item = cJSON_CreateObject();

    // follow_user_request->auto_follow
    if(follow_user_request->auto_follow) {
    if(cJSON_AddBoolToObject(item, "auto_follow", follow_user_request->auto_follow) == NULL) {
    goto fail; //Bool
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

follow_user_request_t *follow_user_request_parseFromJSON(cJSON *follow_user_requestJSON){

    follow_user_request_t *follow_user_request_local_var = NULL;

    // follow_user_request->auto_follow
    cJSON *auto_follow = cJSON_GetObjectItemCaseSensitive(follow_user_requestJSON, "auto_follow");
    if (auto_follow) { 
    if(!cJSON_IsBool(auto_follow))
    {
    goto end; //Bool
    }
    }


    follow_user_request_local_var = follow_user_request_create (
        auto_follow ? auto_follow->valueint : 0
        );

    return follow_user_request_local_var;
end:
    return NULL;

}
