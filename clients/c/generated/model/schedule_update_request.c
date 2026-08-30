#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "schedule_update_request.h"



static schedule_update_request_t *schedule_update_request_create_internal(
    char *entity_id,
    char *entity_type,
    char *id,
    schedule_common_delta_value_t *delta_value,
    int *end_timestamp,
    char *name,
    pinterest_rest_api_schedule_action__e schedule_action,
    pinterest_rest_api_schedule_status__e schedule_status,
    pinterest_rest_api_schedule_type__e schedule_type,
    int *start_timestamp
    ) {
    schedule_update_request_t *schedule_update_request_local_var = malloc(sizeof(schedule_update_request_t));
    if (!schedule_update_request_local_var) {
        return NULL;
    }
    memset(schedule_update_request_local_var, 0, sizeof(schedule_update_request_t));
    schedule_update_request_local_var->_library_owned = 1;
    schedule_update_request_local_var->entity_id = entity_id;
    schedule_update_request_local_var->entity_type = entity_type;
    schedule_update_request_local_var->id = id;
    schedule_update_request_local_var->delta_value = delta_value;
    schedule_update_request_local_var->end_timestamp = end_timestamp;
    schedule_update_request_local_var->name = name;
    schedule_update_request_local_var->schedule_action = schedule_action;
    schedule_update_request_local_var->schedule_status = schedule_status;
    schedule_update_request_local_var->schedule_type = schedule_type;
    schedule_update_request_local_var->start_timestamp = start_timestamp;
    return schedule_update_request_local_var;
}

__attribute__((deprecated)) schedule_update_request_t *schedule_update_request_create(
    char *entity_id,
    char *entity_type,
    char *id,
    schedule_common_delta_value_t *delta_value,
    int *end_timestamp,
    char *name,
    pinterest_rest_api_schedule_action__e schedule_action,
    pinterest_rest_api_schedule_status__e schedule_status,
    pinterest_rest_api_schedule_type__e schedule_type,
    int *start_timestamp
    ) {
    int *end_timestamp_copy = NULL;
    if (end_timestamp) {
        end_timestamp_copy = malloc(sizeof(int));
        if (end_timestamp_copy) *end_timestamp_copy = *end_timestamp;
    }
    int *start_timestamp_copy = NULL;
    if (start_timestamp) {
        start_timestamp_copy = malloc(sizeof(int));
        if (start_timestamp_copy) *start_timestamp_copy = *start_timestamp;
    }
    schedule_update_request_t *result = schedule_update_request_create_internal (
        entity_id,
        entity_type,
        id,
        delta_value,
        end_timestamp_copy,
        name,
        schedule_action,
        schedule_status,
        schedule_type,
        start_timestamp_copy
        );
    if (!result) {
        free(end_timestamp_copy);
        free(start_timestamp_copy);
    }
    return result;
}

void schedule_update_request_free(schedule_update_request_t *schedule_update_request) {
    if(NULL == schedule_update_request){
        return ;
    }
    if(schedule_update_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "schedule_update_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (schedule_update_request->entity_id) {
        free(schedule_update_request->entity_id);
        schedule_update_request->entity_id = NULL;
    }
    if (schedule_update_request->entity_type) {
        free(schedule_update_request->entity_type);
        schedule_update_request->entity_type = NULL;
    }
    if (schedule_update_request->id) {
        free(schedule_update_request->id);
        schedule_update_request->id = NULL;
    }
    if (schedule_update_request->delta_value) {
        schedule_common_delta_value_free(schedule_update_request->delta_value);
        schedule_update_request->delta_value = NULL;
    }
    if (schedule_update_request->end_timestamp) {
        free(schedule_update_request->end_timestamp);
        schedule_update_request->end_timestamp = NULL;
    }
    if (schedule_update_request->name) {
        free(schedule_update_request->name);
        schedule_update_request->name = NULL;
    }
    if (schedule_update_request->start_timestamp) {
        free(schedule_update_request->start_timestamp);
        schedule_update_request->start_timestamp = NULL;
    }
    free(schedule_update_request);
}

cJSON *schedule_update_request_convertToJSON(schedule_update_request_t *schedule_update_request) {
    cJSON *item = cJSON_CreateObject();

    // schedule_update_request->entity_id
    if(schedule_update_request->entity_id) {
    if(cJSON_AddStringToObject(item, "entity_id", schedule_update_request->entity_id) == NULL) {
    goto fail; //String
    }
    }


    // schedule_update_request->entity_type
    if(schedule_update_request->entity_type) {
    if(cJSON_AddStringToObject(item, "entity_type", schedule_update_request->entity_type) == NULL) {
    goto fail; //String
    }
    }


    // schedule_update_request->id
    if (!schedule_update_request->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", schedule_update_request->id) == NULL) {
    goto fail; //String
    }


    // schedule_update_request->delta_value
    if(schedule_update_request->delta_value) {
    cJSON *delta_value_local_JSON = schedule_common_delta_value_convertToJSON(schedule_update_request->delta_value);
    if(delta_value_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "delta_value", delta_value_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // schedule_update_request->end_timestamp
    if(schedule_update_request->end_timestamp) {
    if(cJSON_AddNumberToObject(item, "end_timestamp", *schedule_update_request->end_timestamp) == NULL) {
    goto fail; //Numeric
    }
    }


    // schedule_update_request->name
    if(schedule_update_request->name) {
    if(cJSON_AddStringToObject(item, "name", schedule_update_request->name) == NULL) {
    goto fail; //String
    }
    }


    // schedule_update_request->schedule_action
    if(schedule_update_request->schedule_action != pinterest_rest_api_schedule_action__NULL) {
    cJSON *schedule_action_local_JSON = schedule_action_convertToJSON(schedule_update_request->schedule_action);
    if(schedule_action_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "schedule_action", schedule_action_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // schedule_update_request->schedule_status
    if(schedule_update_request->schedule_status != pinterest_rest_api_schedule_status__NULL) {
    cJSON *schedule_status_local_JSON = schedule_status_convertToJSON(schedule_update_request->schedule_status);
    if(schedule_status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "schedule_status", schedule_status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // schedule_update_request->schedule_type
    if(schedule_update_request->schedule_type != pinterest_rest_api_schedule_type__NULL) {
    cJSON *schedule_type_local_JSON = schedule_type_convertToJSON(schedule_update_request->schedule_type);
    if(schedule_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "schedule_type", schedule_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // schedule_update_request->start_timestamp
    if(schedule_update_request->start_timestamp) {
    if(cJSON_AddNumberToObject(item, "start_timestamp", *schedule_update_request->start_timestamp) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

schedule_update_request_t *schedule_update_request_parseFromJSON(cJSON *schedule_update_requestJSON){

    schedule_update_request_t *schedule_update_request_local_var = NULL;

    char *entity_id_local_str = NULL;

    char *entity_type_local_str = NULL;

    char *id_local_str = NULL;

    // define the local variable for schedule_update_request->delta_value
    schedule_common_delta_value_t *delta_value_local_nonprim = NULL;

    // define the local variable for schedule_update_request->end_timestamp
    int *end_timestamp_local_var = NULL;

    char *name_local_str = NULL;

    // define the local variable for schedule_update_request->schedule_action
    pinterest_rest_api_schedule_action__e schedule_action_local_nonprim = 0;

    // define the local variable for schedule_update_request->schedule_status
    pinterest_rest_api_schedule_status__e schedule_status_local_nonprim = 0;

    // define the local variable for schedule_update_request->schedule_type
    pinterest_rest_api_schedule_type__e schedule_type_local_nonprim = 0;

    // define the local variable for schedule_update_request->start_timestamp
    int *start_timestamp_local_var = NULL;

    // schedule_update_request->entity_id
    cJSON *entity_id = cJSON_GetObjectItemCaseSensitive(schedule_update_requestJSON, "entity_id");
    if (cJSON_IsNull(entity_id)) {
        entity_id = NULL;
    }
    if (entity_id) { 
    if(!cJSON_IsString(entity_id) && !cJSON_IsNull(entity_id))
    {
    goto end; //String
    }
    }

    // schedule_update_request->entity_type
    cJSON *entity_type = cJSON_GetObjectItemCaseSensitive(schedule_update_requestJSON, "entity_type");
    if (cJSON_IsNull(entity_type)) {
        entity_type = NULL;
    }
    if (entity_type) { 
    if(!cJSON_IsString(entity_type) && !cJSON_IsNull(entity_type))
    {
    goto end; //String
    }
    }

    // schedule_update_request->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(schedule_update_requestJSON, "id");
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

    // schedule_update_request->delta_value
    cJSON *delta_value = cJSON_GetObjectItemCaseSensitive(schedule_update_requestJSON, "delta_value");
    if (cJSON_IsNull(delta_value)) {
        delta_value = NULL;
    }
    if (delta_value) { 
    delta_value_local_nonprim = schedule_common_delta_value_parseFromJSON(delta_value); //nonprimitive
    }

    // schedule_update_request->end_timestamp
    cJSON *end_timestamp = cJSON_GetObjectItemCaseSensitive(schedule_update_requestJSON, "end_timestamp");
    if (cJSON_IsNull(end_timestamp)) {
        end_timestamp = NULL;
    }
    if (end_timestamp) { 
    if(!cJSON_IsNumber(end_timestamp))
    {
    goto end; //Numeric
    }
    end_timestamp_local_var = malloc(sizeof(int));
    if(!end_timestamp_local_var)
    {
        goto end;
    }
    *end_timestamp_local_var = end_timestamp->valuedouble;
    }

    // schedule_update_request->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(schedule_update_requestJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // schedule_update_request->schedule_action
    cJSON *schedule_action = cJSON_GetObjectItemCaseSensitive(schedule_update_requestJSON, "schedule_action");
    if (cJSON_IsNull(schedule_action)) {
        schedule_action = NULL;
    }
    if (schedule_action) { 
    schedule_action_local_nonprim = schedule_action_parseFromJSON(schedule_action); //custom
    }

    // schedule_update_request->schedule_status
    cJSON *schedule_status = cJSON_GetObjectItemCaseSensitive(schedule_update_requestJSON, "schedule_status");
    if (cJSON_IsNull(schedule_status)) {
        schedule_status = NULL;
    }
    if (schedule_status) { 
    schedule_status_local_nonprim = schedule_status_parseFromJSON(schedule_status); //custom
    }

    // schedule_update_request->schedule_type
    cJSON *schedule_type = cJSON_GetObjectItemCaseSensitive(schedule_update_requestJSON, "schedule_type");
    if (cJSON_IsNull(schedule_type)) {
        schedule_type = NULL;
    }
    if (schedule_type) { 
    schedule_type_local_nonprim = schedule_type_parseFromJSON(schedule_type); //custom
    }

    // schedule_update_request->start_timestamp
    cJSON *start_timestamp = cJSON_GetObjectItemCaseSensitive(schedule_update_requestJSON, "start_timestamp");
    if (cJSON_IsNull(start_timestamp)) {
        start_timestamp = NULL;
    }
    if (start_timestamp) { 
    if(!cJSON_IsNumber(start_timestamp))
    {
    goto end; //Numeric
    }
    start_timestamp_local_var = malloc(sizeof(int));
    if(!start_timestamp_local_var)
    {
        goto end;
    }
    *start_timestamp_local_var = start_timestamp->valuedouble;
    }


    if (entity_id && !cJSON_IsNull(entity_id)) entity_id_local_str = strdup(entity_id->valuestring);
    if (entity_type && !cJSON_IsNull(entity_type)) entity_type_local_str = strdup(entity_type->valuestring);
    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    schedule_update_request_local_var = schedule_update_request_create_internal (
        entity_id_local_str,
        entity_type_local_str,
        id_local_str,
        delta_value ? delta_value_local_nonprim : NULL,
        end_timestamp_local_var,
        name_local_str,
        schedule_action ? schedule_action_local_nonprim : 0,
        schedule_status ? schedule_status_local_nonprim : 0,
        schedule_type ? schedule_type_local_nonprim : 0,
        start_timestamp_local_var
        );

    if (!schedule_update_request_local_var) {
        goto end;
    }

    return schedule_update_request_local_var;
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
    if (delta_value_local_nonprim) {
        schedule_common_delta_value_free(delta_value_local_nonprim);
        delta_value_local_nonprim = NULL;
    }
    if (end_timestamp_local_var) {
        free(end_timestamp_local_var);
        end_timestamp_local_var = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (schedule_action_local_nonprim) {
        schedule_action_local_nonprim = 0;
    }
    if (schedule_status_local_nonprim) {
        schedule_status_local_nonprim = 0;
    }
    if (schedule_type_local_nonprim) {
        schedule_type_local_nonprim = 0;
    }
    if (start_timestamp_local_var) {
        free(start_timestamp_local_var);
        start_timestamp_local_var = NULL;
    }
    return NULL;

}
