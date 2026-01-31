#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "system_user_update_request.h"



static system_user_update_request_t *system_user_update_request_create_internal(
    char *name
    ) {
    system_user_update_request_t *system_user_update_request_local_var = malloc(sizeof(system_user_update_request_t));
    if (!system_user_update_request_local_var) {
        return NULL;
    }
    system_user_update_request_local_var->name = name;

    system_user_update_request_local_var->_library_owned = 1;
    return system_user_update_request_local_var;
}

__attribute__((deprecated)) system_user_update_request_t *system_user_update_request_create(
    char *name
    ) {
    return system_user_update_request_create_internal (
        name
        );
}

void system_user_update_request_free(system_user_update_request_t *system_user_update_request) {
    if(NULL == system_user_update_request){
        return ;
    }
    if(system_user_update_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "system_user_update_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (system_user_update_request->name) {
        free(system_user_update_request->name);
        system_user_update_request->name = NULL;
    }
    free(system_user_update_request);
}

cJSON *system_user_update_request_convertToJSON(system_user_update_request_t *system_user_update_request) {
    cJSON *item = cJSON_CreateObject();

    // system_user_update_request->name
    if (!system_user_update_request->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", system_user_update_request->name) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

system_user_update_request_t *system_user_update_request_parseFromJSON(cJSON *system_user_update_requestJSON){

    system_user_update_request_t *system_user_update_request_local_var = NULL;

    // system_user_update_request->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(system_user_update_requestJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }


    system_user_update_request_local_var = system_user_update_request_create_internal (
        strdup(name->valuestring)
        );

    return system_user_update_request_local_var;
end:
    return NULL;

}
