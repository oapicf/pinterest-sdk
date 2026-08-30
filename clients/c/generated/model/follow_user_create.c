#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "follow_user_create.h"



static follow_user_create_t *follow_user_create_create_internal(
    int *auto_follow
    ) {
    follow_user_create_t *follow_user_create_local_var = malloc(sizeof(follow_user_create_t));
    if (!follow_user_create_local_var) {
        return NULL;
    }
    memset(follow_user_create_local_var, 0, sizeof(follow_user_create_t));
    follow_user_create_local_var->_library_owned = 1;
    follow_user_create_local_var->auto_follow = auto_follow;
    return follow_user_create_local_var;
}

__attribute__((deprecated)) follow_user_create_t *follow_user_create_create(
    int *auto_follow
    ) {
    int *auto_follow_copy = NULL;
    if (auto_follow) {
        auto_follow_copy = malloc(sizeof(int));
        if (auto_follow_copy) *auto_follow_copy = *auto_follow;
    }
    follow_user_create_t *result = follow_user_create_create_internal (
        auto_follow_copy
        );
    if (!result) {
        free(auto_follow_copy);
    }
    return result;
}

void follow_user_create_free(follow_user_create_t *follow_user_create) {
    if(NULL == follow_user_create){
        return ;
    }
    if(follow_user_create->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "follow_user_create_free");
        return ;
    }
    listEntry_t *listEntry;
    if (follow_user_create->auto_follow) {
        free(follow_user_create->auto_follow);
        follow_user_create->auto_follow = NULL;
    }
    free(follow_user_create);
}

cJSON *follow_user_create_convertToJSON(follow_user_create_t *follow_user_create) {
    cJSON *item = cJSON_CreateObject();

    // follow_user_create->auto_follow
    if(follow_user_create->auto_follow) {
    if(cJSON_AddBoolToObject(item, "auto_follow", *follow_user_create->auto_follow) == NULL) {
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

follow_user_create_t *follow_user_create_parseFromJSON(cJSON *follow_user_createJSON){

    follow_user_create_t *follow_user_create_local_var = NULL;

    // define the local variable for follow_user_create->auto_follow
    int *auto_follow_local_var = NULL;

    // follow_user_create->auto_follow
    cJSON *auto_follow = cJSON_GetObjectItemCaseSensitive(follow_user_createJSON, "auto_follow");
    if (cJSON_IsNull(auto_follow)) {
        auto_follow = NULL;
    }
    if (auto_follow) { 
    if(!cJSON_IsBool(auto_follow))
    {
    goto end; //Bool
    }
    auto_follow_local_var = malloc(sizeof(int));
    if(!auto_follow_local_var)
    {
        goto end;
    }
    *auto_follow_local_var = auto_follow->valueint;
    }



    follow_user_create_local_var = follow_user_create_create_internal (
        auto_follow_local_var
        );

    if (!follow_user_create_local_var) {
        goto end;
    }

    return follow_user_create_local_var;
end:
    if (auto_follow_local_var) {
        free(auto_follow_local_var);
        auto_follow_local_var = NULL;
    }
    return NULL;

}
