#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "system_user_update_with_required_body.h"



static system_user_update_with_required_body_t *system_user_update_with_required_body_create_internal(
    char *name
    ) {
    system_user_update_with_required_body_t *system_user_update_with_required_body_local_var = malloc(sizeof(system_user_update_with_required_body_t));
    if (!system_user_update_with_required_body_local_var) {
        return NULL;
    }
    memset(system_user_update_with_required_body_local_var, 0, sizeof(system_user_update_with_required_body_t));
    system_user_update_with_required_body_local_var->_library_owned = 1;
    system_user_update_with_required_body_local_var->name = name;
    return system_user_update_with_required_body_local_var;
}

__attribute__((deprecated)) system_user_update_with_required_body_t *system_user_update_with_required_body_create(
    char *name
    ) {
    system_user_update_with_required_body_t *result = system_user_update_with_required_body_create_internal (
        name
        );
    if (!result) {
    }
    return result;
}

void system_user_update_with_required_body_free(system_user_update_with_required_body_t *system_user_update_with_required_body) {
    if(NULL == system_user_update_with_required_body){
        return ;
    }
    if(system_user_update_with_required_body->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "system_user_update_with_required_body_free");
        return ;
    }
    listEntry_t *listEntry;
    if (system_user_update_with_required_body->name) {
        free(system_user_update_with_required_body->name);
        system_user_update_with_required_body->name = NULL;
    }
    free(system_user_update_with_required_body);
}

cJSON *system_user_update_with_required_body_convertToJSON(system_user_update_with_required_body_t *system_user_update_with_required_body) {
    cJSON *item = cJSON_CreateObject();

    // system_user_update_with_required_body->name
    if (!system_user_update_with_required_body->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", system_user_update_with_required_body->name) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

system_user_update_with_required_body_t *system_user_update_with_required_body_parseFromJSON(cJSON *system_user_update_with_required_bodyJSON){

    system_user_update_with_required_body_t *system_user_update_with_required_body_local_var = NULL;

    char *name_local_str = NULL;

    // system_user_update_with_required_body->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(system_user_update_with_required_bodyJSON, "name");
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


    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    system_user_update_with_required_body_local_var = system_user_update_with_required_body_create_internal (
        name_local_str
        );

    if (!system_user_update_with_required_body_local_var) {
        goto end;
    }

    return system_user_update_with_required_body_local_var;
end:
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    return NULL;

}
