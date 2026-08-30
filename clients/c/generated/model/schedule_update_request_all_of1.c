#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "schedule_update_request_all_of1.h"



static schedule_update_request_all_of1_t *schedule_update_request_all_of1_create_internal(
    char *entity_id,
    char *entity_type,
    char *id
    ) {
    schedule_update_request_all_of1_t *schedule_update_request_all_of1_local_var = malloc(sizeof(schedule_update_request_all_of1_t));
    if (!schedule_update_request_all_of1_local_var) {
        return NULL;
    }
    memset(schedule_update_request_all_of1_local_var, 0, sizeof(schedule_update_request_all_of1_t));
    schedule_update_request_all_of1_local_var->_library_owned = 1;
    schedule_update_request_all_of1_local_var->entity_id = entity_id;
    schedule_update_request_all_of1_local_var->entity_type = entity_type;
    schedule_update_request_all_of1_local_var->id = id;
    return schedule_update_request_all_of1_local_var;
}

__attribute__((deprecated)) schedule_update_request_all_of1_t *schedule_update_request_all_of1_create(
    char *entity_id,
    char *entity_type,
    char *id
    ) {
    schedule_update_request_all_of1_t *result = schedule_update_request_all_of1_create_internal (
        entity_id,
        entity_type,
        id
        );
    if (!result) {
    }
    return result;
}

void schedule_update_request_all_of1_free(schedule_update_request_all_of1_t *schedule_update_request_all_of1) {
    if(NULL == schedule_update_request_all_of1){
        return ;
    }
    if(schedule_update_request_all_of1->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "schedule_update_request_all_of1_free");
        return ;
    }
    listEntry_t *listEntry;
    if (schedule_update_request_all_of1->entity_id) {
        free(schedule_update_request_all_of1->entity_id);
        schedule_update_request_all_of1->entity_id = NULL;
    }
    if (schedule_update_request_all_of1->entity_type) {
        free(schedule_update_request_all_of1->entity_type);
        schedule_update_request_all_of1->entity_type = NULL;
    }
    if (schedule_update_request_all_of1->id) {
        free(schedule_update_request_all_of1->id);
        schedule_update_request_all_of1->id = NULL;
    }
    free(schedule_update_request_all_of1);
}

cJSON *schedule_update_request_all_of1_convertToJSON(schedule_update_request_all_of1_t *schedule_update_request_all_of1) {
    cJSON *item = cJSON_CreateObject();

    // schedule_update_request_all_of1->entity_id
    if(schedule_update_request_all_of1->entity_id) {
    if(cJSON_AddStringToObject(item, "entity_id", schedule_update_request_all_of1->entity_id) == NULL) {
    goto fail; //String
    }
    }


    // schedule_update_request_all_of1->entity_type
    if(schedule_update_request_all_of1->entity_type) {
    if(cJSON_AddStringToObject(item, "entity_type", schedule_update_request_all_of1->entity_type) == NULL) {
    goto fail; //String
    }
    }


    // schedule_update_request_all_of1->id
    if (!schedule_update_request_all_of1->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", schedule_update_request_all_of1->id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

schedule_update_request_all_of1_t *schedule_update_request_all_of1_parseFromJSON(cJSON *schedule_update_request_all_of1JSON){

    schedule_update_request_all_of1_t *schedule_update_request_all_of1_local_var = NULL;

    char *entity_id_local_str = NULL;

    char *entity_type_local_str = NULL;

    char *id_local_str = NULL;

    // schedule_update_request_all_of1->entity_id
    cJSON *entity_id = cJSON_GetObjectItemCaseSensitive(schedule_update_request_all_of1JSON, "entity_id");
    if (cJSON_IsNull(entity_id)) {
        entity_id = NULL;
    }
    if (entity_id) { 
    if(!cJSON_IsString(entity_id) && !cJSON_IsNull(entity_id))
    {
    goto end; //String
    }
    }

    // schedule_update_request_all_of1->entity_type
    cJSON *entity_type = cJSON_GetObjectItemCaseSensitive(schedule_update_request_all_of1JSON, "entity_type");
    if (cJSON_IsNull(entity_type)) {
        entity_type = NULL;
    }
    if (entity_type) { 
    if(!cJSON_IsString(entity_type) && !cJSON_IsNull(entity_type))
    {
    goto end; //String
    }
    }

    // schedule_update_request_all_of1->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(schedule_update_request_all_of1JSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }


    if (entity_id && !cJSON_IsNull(entity_id)) entity_id_local_str = strdup(entity_id->valuestring);
    if (entity_type && !cJSON_IsNull(entity_type)) entity_type_local_str = strdup(entity_type->valuestring);
    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);

    schedule_update_request_all_of1_local_var = schedule_update_request_all_of1_create_internal (
        entity_id_local_str,
        entity_type_local_str,
        id_local_str
        );

    if (!schedule_update_request_all_of1_local_var) {
        goto end;
    }

    return schedule_update_request_all_of1_local_var;
end:
    if (entity_id_local_str) {
        free(entity_id_local_str);
        entity_id_local_str = NULL;
    }
    if (entity_type_local_str) {
        free(entity_type_local_str);
        entity_type_local_str = NULL;
    }
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    return NULL;

}
