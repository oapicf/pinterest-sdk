#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "schedule_create_request_all_of1.h"



static schedule_create_request_all_of1_t *schedule_create_request_all_of1_create_internal(
    char *entity_id,
    char *entity_type
    ) {
    schedule_create_request_all_of1_t *schedule_create_request_all_of1_local_var = malloc(sizeof(schedule_create_request_all_of1_t));
    if (!schedule_create_request_all_of1_local_var) {
        return NULL;
    }
    memset(schedule_create_request_all_of1_local_var, 0, sizeof(schedule_create_request_all_of1_t));
    schedule_create_request_all_of1_local_var->_library_owned = 1;
    schedule_create_request_all_of1_local_var->entity_id = entity_id;
    schedule_create_request_all_of1_local_var->entity_type = entity_type;
    return schedule_create_request_all_of1_local_var;
}

__attribute__((deprecated)) schedule_create_request_all_of1_t *schedule_create_request_all_of1_create(
    char *entity_id,
    char *entity_type
    ) {
    schedule_create_request_all_of1_t *result = schedule_create_request_all_of1_create_internal (
        entity_id,
        entity_type
        );
    if (!result) {
    }
    return result;
}

void schedule_create_request_all_of1_free(schedule_create_request_all_of1_t *schedule_create_request_all_of1) {
    if(NULL == schedule_create_request_all_of1){
        return ;
    }
    if(schedule_create_request_all_of1->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "schedule_create_request_all_of1_free");
        return ;
    }
    listEntry_t *listEntry;
    if (schedule_create_request_all_of1->entity_id) {
        free(schedule_create_request_all_of1->entity_id);
        schedule_create_request_all_of1->entity_id = NULL;
    }
    if (schedule_create_request_all_of1->entity_type) {
        free(schedule_create_request_all_of1->entity_type);
        schedule_create_request_all_of1->entity_type = NULL;
    }
    free(schedule_create_request_all_of1);
}

cJSON *schedule_create_request_all_of1_convertToJSON(schedule_create_request_all_of1_t *schedule_create_request_all_of1) {
    cJSON *item = cJSON_CreateObject();

    // schedule_create_request_all_of1->entity_id
    if (!schedule_create_request_all_of1->entity_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "entity_id", schedule_create_request_all_of1->entity_id) == NULL) {
    goto fail; //String
    }


    // schedule_create_request_all_of1->entity_type
    if (!schedule_create_request_all_of1->entity_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "entity_type", schedule_create_request_all_of1->entity_type) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

schedule_create_request_all_of1_t *schedule_create_request_all_of1_parseFromJSON(cJSON *schedule_create_request_all_of1JSON){

    schedule_create_request_all_of1_t *schedule_create_request_all_of1_local_var = NULL;

    char *entity_id_local_str = NULL;

    char *entity_type_local_str = NULL;

    // schedule_create_request_all_of1->entity_id
    cJSON *entity_id = cJSON_GetObjectItemCaseSensitive(schedule_create_request_all_of1JSON, "entity_id");
    if (cJSON_IsNull(entity_id)) {
        entity_id = NULL;
    }
    if (!entity_id) {
        goto end;
    }

    
    if(!cJSON_IsString(entity_id))
    {
    goto end; //String
    }

    // schedule_create_request_all_of1->entity_type
    cJSON *entity_type = cJSON_GetObjectItemCaseSensitive(schedule_create_request_all_of1JSON, "entity_type");
    if (cJSON_IsNull(entity_type)) {
        entity_type = NULL;
    }
    if (!entity_type) {
        goto end;
    }

    
    if(!cJSON_IsString(entity_type))
    {
    goto end; //String
    }


    if (entity_id && !cJSON_IsNull(entity_id)) entity_id_local_str = strdup(entity_id->valuestring);
    if (entity_type && !cJSON_IsNull(entity_type)) entity_type_local_str = strdup(entity_type->valuestring);

    schedule_create_request_all_of1_local_var = schedule_create_request_all_of1_create_internal (
        entity_id_local_str,
        entity_type_local_str
        );

    if (!schedule_create_request_all_of1_local_var) {
        goto end;
    }

    return schedule_create_request_all_of1_local_var;
end:
    if (entity_id_local_str) {
        free(entity_id_local_str);
        entity_id_local_str = NULL;
    }
    if (entity_type_local_str) {
        free(entity_type_local_str);
        entity_type_local_str = NULL;
    }
    return NULL;

}
