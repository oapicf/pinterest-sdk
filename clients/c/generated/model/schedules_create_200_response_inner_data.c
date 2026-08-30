#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "schedules_create_200_response_inner_data.h"



static schedules_create_200_response_inner_data_t *schedules_create_200_response_inner_data_create_internal(
    schedule_delta_value_t *delta_value,
    int *end_timestamp,
    char *entity_id,
    ad_account_entity_type_t *entity_type,
    char *name,
    schedule_action_t *schedule_action,
    char *schedule_id,
    schedule_status_t *schedule_status,
    schedule_type_t *schedule_type,
    int *start_timestamp,
    char *id,
    pinterest_lib_error_t *exceptions
    ) {
    schedules_create_200_response_inner_data_t *schedules_create_200_response_inner_data_local_var = malloc(sizeof(schedules_create_200_response_inner_data_t));
    if (!schedules_create_200_response_inner_data_local_var) {
        return NULL;
    }
    memset(schedules_create_200_response_inner_data_local_var, 0, sizeof(schedules_create_200_response_inner_data_t));
    schedules_create_200_response_inner_data_local_var->_library_owned = 1;
    schedules_create_200_response_inner_data_local_var->delta_value = delta_value;
    schedules_create_200_response_inner_data_local_var->end_timestamp = end_timestamp;
    schedules_create_200_response_inner_data_local_var->entity_id = entity_id;
    schedules_create_200_response_inner_data_local_var->entity_type = entity_type;
    schedules_create_200_response_inner_data_local_var->name = name;
    schedules_create_200_response_inner_data_local_var->schedule_action = schedule_action;
    schedules_create_200_response_inner_data_local_var->schedule_id = schedule_id;
    schedules_create_200_response_inner_data_local_var->schedule_status = schedule_status;
    schedules_create_200_response_inner_data_local_var->schedule_type = schedule_type;
    schedules_create_200_response_inner_data_local_var->start_timestamp = start_timestamp;
    schedules_create_200_response_inner_data_local_var->id = id;
    schedules_create_200_response_inner_data_local_var->exceptions = exceptions;
    return schedules_create_200_response_inner_data_local_var;
}

__attribute__((deprecated)) schedules_create_200_response_inner_data_t *schedules_create_200_response_inner_data_create(
    schedule_delta_value_t *delta_value,
    int *end_timestamp,
    char *entity_id,
    ad_account_entity_type_t *entity_type,
    char *name,
    schedule_action_t *schedule_action,
    char *schedule_id,
    schedule_status_t *schedule_status,
    schedule_type_t *schedule_type,
    int *start_timestamp,
    char *id,
    pinterest_lib_error_t *exceptions
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
    schedules_create_200_response_inner_data_t *result = schedules_create_200_response_inner_data_create_internal (
        delta_value,
        end_timestamp_copy,
        entity_id,
        entity_type,
        name,
        schedule_action,
        schedule_id,
        schedule_status,
        schedule_type,
        start_timestamp_copy,
        id,
        exceptions
        );
    if (!result) {
        free(end_timestamp_copy);
        free(start_timestamp_copy);
    }
    return result;
}

void schedules_create_200_response_inner_data_free(schedules_create_200_response_inner_data_t *schedules_create_200_response_inner_data) {
    if(NULL == schedules_create_200_response_inner_data){
        return ;
    }
    if(schedules_create_200_response_inner_data->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "schedules_create_200_response_inner_data_free");
        return ;
    }
    listEntry_t *listEntry;
    if (schedules_create_200_response_inner_data->delta_value) {
        schedule_delta_value_free(schedules_create_200_response_inner_data->delta_value);
        schedules_create_200_response_inner_data->delta_value = NULL;
    }
    if (schedules_create_200_response_inner_data->end_timestamp) {
        free(schedules_create_200_response_inner_data->end_timestamp);
        schedules_create_200_response_inner_data->end_timestamp = NULL;
    }
    if (schedules_create_200_response_inner_data->entity_id) {
        free(schedules_create_200_response_inner_data->entity_id);
        schedules_create_200_response_inner_data->entity_id = NULL;
    }
    if (schedules_create_200_response_inner_data->entity_type) {
        ad_account_entity_type_free(schedules_create_200_response_inner_data->entity_type);
        schedules_create_200_response_inner_data->entity_type = NULL;
    }
    if (schedules_create_200_response_inner_data->name) {
        free(schedules_create_200_response_inner_data->name);
        schedules_create_200_response_inner_data->name = NULL;
    }
    if (schedules_create_200_response_inner_data->schedule_action) {
        schedule_action_free(schedules_create_200_response_inner_data->schedule_action);
        schedules_create_200_response_inner_data->schedule_action = NULL;
    }
    if (schedules_create_200_response_inner_data->schedule_id) {
        free(schedules_create_200_response_inner_data->schedule_id);
        schedules_create_200_response_inner_data->schedule_id = NULL;
    }
    if (schedules_create_200_response_inner_data->schedule_status) {
        schedule_status_free(schedules_create_200_response_inner_data->schedule_status);
        schedules_create_200_response_inner_data->schedule_status = NULL;
    }
    if (schedules_create_200_response_inner_data->schedule_type) {
        schedule_type_free(schedules_create_200_response_inner_data->schedule_type);
        schedules_create_200_response_inner_data->schedule_type = NULL;
    }
    if (schedules_create_200_response_inner_data->start_timestamp) {
        free(schedules_create_200_response_inner_data->start_timestamp);
        schedules_create_200_response_inner_data->start_timestamp = NULL;
    }
    if (schedules_create_200_response_inner_data->id) {
        free(schedules_create_200_response_inner_data->id);
        schedules_create_200_response_inner_data->id = NULL;
    }
    if (schedules_create_200_response_inner_data->exceptions) {
        pinterest_lib_error_free(schedules_create_200_response_inner_data->exceptions);
        schedules_create_200_response_inner_data->exceptions = NULL;
    }
    free(schedules_create_200_response_inner_data);
}

cJSON *schedules_create_200_response_inner_data_convertToJSON(schedules_create_200_response_inner_data_t *schedules_create_200_response_inner_data) {
    cJSON *item = cJSON_CreateObject();

    // schedules_create_200_response_inner_data->delta_value
    if(schedules_create_200_response_inner_data->delta_value) {
    cJSON *delta_value_local_JSON = schedule_delta_value_convertToJSON(schedules_create_200_response_inner_data->delta_value);
    if(delta_value_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "delta_value", delta_value_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // schedules_create_200_response_inner_data->end_timestamp
    if(schedules_create_200_response_inner_data->end_timestamp) {
    if(cJSON_AddNumberToObject(item, "end_timestamp", *schedules_create_200_response_inner_data->end_timestamp) == NULL) {
    goto fail; //Numeric
    }
    }


    // schedules_create_200_response_inner_data->entity_id
    if (!schedules_create_200_response_inner_data->entity_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "entity_id", schedules_create_200_response_inner_data->entity_id) == NULL) {
    goto fail; //String
    }


    // schedules_create_200_response_inner_data->entity_type
    if(schedules_create_200_response_inner_data->entity_type) {
    cJSON *entity_type_local_JSON = ad_account_entity_type_convertToJSON(schedules_create_200_response_inner_data->entity_type);
    if(entity_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "entity_type", entity_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // schedules_create_200_response_inner_data->name
    if(schedules_create_200_response_inner_data->name) {
    if(cJSON_AddStringToObject(item, "name", schedules_create_200_response_inner_data->name) == NULL) {
    goto fail; //String
    }
    }


    // schedules_create_200_response_inner_data->schedule_action
    if(schedules_create_200_response_inner_data->schedule_action) {
    cJSON *schedule_action_local_JSON = schedule_action_convertToJSON(schedules_create_200_response_inner_data->schedule_action);
    if(schedule_action_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "schedule_action", schedule_action_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // schedules_create_200_response_inner_data->schedule_id
    if (!schedules_create_200_response_inner_data->schedule_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "schedule_id", schedules_create_200_response_inner_data->schedule_id) == NULL) {
    goto fail; //String
    }


    // schedules_create_200_response_inner_data->schedule_status
    if(schedules_create_200_response_inner_data->schedule_status) {
    cJSON *schedule_status_local_JSON = schedule_status_convertToJSON(schedules_create_200_response_inner_data->schedule_status);
    if(schedule_status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "schedule_status", schedule_status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // schedules_create_200_response_inner_data->schedule_type
    if(schedules_create_200_response_inner_data->schedule_type) {
    cJSON *schedule_type_local_JSON = schedule_type_convertToJSON(schedules_create_200_response_inner_data->schedule_type);
    if(schedule_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "schedule_type", schedule_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // schedules_create_200_response_inner_data->start_timestamp
    if(schedules_create_200_response_inner_data->start_timestamp) {
    if(cJSON_AddNumberToObject(item, "start_timestamp", *schedules_create_200_response_inner_data->start_timestamp) == NULL) {
    goto fail; //Numeric
    }
    }


    // schedules_create_200_response_inner_data->id
    if (!schedules_create_200_response_inner_data->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", schedules_create_200_response_inner_data->id) == NULL) {
    goto fail; //String
    }


    // schedules_create_200_response_inner_data->exceptions
    if (!schedules_create_200_response_inner_data->exceptions) {
        goto fail;
    }
    cJSON *exceptions_local_JSON = pinterest_lib_error_convertToJSON(schedules_create_200_response_inner_data->exceptions);
    if(exceptions_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "exceptions", exceptions_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

schedules_create_200_response_inner_data_t *schedules_create_200_response_inner_data_parseFromJSON(cJSON *schedules_create_200_response_inner_dataJSON){

    schedules_create_200_response_inner_data_t *schedules_create_200_response_inner_data_local_var = NULL;

    // define the local variable for schedules_create_200_response_inner_data->delta_value
    schedule_delta_value_t *delta_value_local_nonprim = NULL;

    // define the local variable for schedules_create_200_response_inner_data->end_timestamp
    int *end_timestamp_local_var = NULL;

    char *entity_id_local_str = NULL;

    // define the local variable for schedules_create_200_response_inner_data->entity_type
    ad_account_entity_type_t *entity_type_local_nonprim = NULL;

    char *name_local_str = NULL;

    // define the local variable for schedules_create_200_response_inner_data->schedule_action
    schedule_action_t *schedule_action_local_nonprim = NULL;

    char *schedule_id_local_str = NULL;

    // define the local variable for schedules_create_200_response_inner_data->schedule_status
    schedule_status_t *schedule_status_local_nonprim = NULL;

    // define the local variable for schedules_create_200_response_inner_data->schedule_type
    schedule_type_t *schedule_type_local_nonprim = NULL;

    // define the local variable for schedules_create_200_response_inner_data->start_timestamp
    int *start_timestamp_local_var = NULL;

    char *id_local_str = NULL;

    // define the local variable for schedules_create_200_response_inner_data->exceptions
    pinterest_lib_error_t *exceptions_local_nonprim = NULL;

    // schedules_create_200_response_inner_data->delta_value
    cJSON *delta_value = cJSON_GetObjectItemCaseSensitive(schedules_create_200_response_inner_dataJSON, "delta_value");
    if (cJSON_IsNull(delta_value)) {
        delta_value = NULL;
    }
    if (delta_value) { 
    delta_value_local_nonprim = schedule_delta_value_parseFromJSON(delta_value); //nonprimitive
    }

    // schedules_create_200_response_inner_data->end_timestamp
    cJSON *end_timestamp = cJSON_GetObjectItemCaseSensitive(schedules_create_200_response_inner_dataJSON, "end_timestamp");
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

    // schedules_create_200_response_inner_data->entity_id
    cJSON *entity_id = cJSON_GetObjectItemCaseSensitive(schedules_create_200_response_inner_dataJSON, "entity_id");
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

    // schedules_create_200_response_inner_data->entity_type
    cJSON *entity_type = cJSON_GetObjectItemCaseSensitive(schedules_create_200_response_inner_dataJSON, "entity_type");
    if (cJSON_IsNull(entity_type)) {
        entity_type = NULL;
    }
    if (entity_type) { 
    entity_type_local_nonprim = ad_account_entity_type_parseFromJSON(entity_type); //custom
    }

    // schedules_create_200_response_inner_data->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(schedules_create_200_response_inner_dataJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // schedules_create_200_response_inner_data->schedule_action
    cJSON *schedule_action = cJSON_GetObjectItemCaseSensitive(schedules_create_200_response_inner_dataJSON, "schedule_action");
    if (cJSON_IsNull(schedule_action)) {
        schedule_action = NULL;
    }
    if (schedule_action) { 
    schedule_action_local_nonprim = schedule_action_parseFromJSON(schedule_action); //custom
    }

    // schedules_create_200_response_inner_data->schedule_id
    cJSON *schedule_id = cJSON_GetObjectItemCaseSensitive(schedules_create_200_response_inner_dataJSON, "schedule_id");
    if (cJSON_IsNull(schedule_id)) {
        schedule_id = NULL;
    }
    if (!schedule_id) {
        goto end;
    }

    
    if(!cJSON_IsString(schedule_id))
    {
    goto end; //String
    }

    // schedules_create_200_response_inner_data->schedule_status
    cJSON *schedule_status = cJSON_GetObjectItemCaseSensitive(schedules_create_200_response_inner_dataJSON, "schedule_status");
    if (cJSON_IsNull(schedule_status)) {
        schedule_status = NULL;
    }
    if (schedule_status) { 
    schedule_status_local_nonprim = schedule_status_parseFromJSON(schedule_status); //custom
    }

    // schedules_create_200_response_inner_data->schedule_type
    cJSON *schedule_type = cJSON_GetObjectItemCaseSensitive(schedules_create_200_response_inner_dataJSON, "schedule_type");
    if (cJSON_IsNull(schedule_type)) {
        schedule_type = NULL;
    }
    if (schedule_type) { 
    schedule_type_local_nonprim = schedule_type_parseFromJSON(schedule_type); //custom
    }

    // schedules_create_200_response_inner_data->start_timestamp
    cJSON *start_timestamp = cJSON_GetObjectItemCaseSensitive(schedules_create_200_response_inner_dataJSON, "start_timestamp");
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

    // schedules_create_200_response_inner_data->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(schedules_create_200_response_inner_dataJSON, "id");
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

    // schedules_create_200_response_inner_data->exceptions
    cJSON *exceptions = cJSON_GetObjectItemCaseSensitive(schedules_create_200_response_inner_dataJSON, "exceptions");
    if (cJSON_IsNull(exceptions)) {
        exceptions = NULL;
    }
    if (!exceptions) {
        goto end;
    }

    
    exceptions_local_nonprim = pinterest_lib_error_parseFromJSON(exceptions); //nonprimitive


    if (entity_id && !cJSON_IsNull(entity_id)) entity_id_local_str = strdup(entity_id->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);
    if (schedule_id && !cJSON_IsNull(schedule_id)) schedule_id_local_str = strdup(schedule_id->valuestring);
    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);

    schedules_create_200_response_inner_data_local_var = schedules_create_200_response_inner_data_create_internal (
        delta_value ? delta_value_local_nonprim : NULL,
        end_timestamp_local_var,
        entity_id_local_str,
        entity_type ? entity_type_local_nonprim : NULL,
        name_local_str,
        schedule_action ? schedule_action_local_nonprim : NULL,
        schedule_id_local_str,
        schedule_status ? schedule_status_local_nonprim : NULL,
        schedule_type ? schedule_type_local_nonprim : NULL,
        start_timestamp_local_var,
        id_local_str,
        exceptions_local_nonprim
        );

    if (!schedules_create_200_response_inner_data_local_var) {
        goto end;
    }

    return schedules_create_200_response_inner_data_local_var;
end:
    if (delta_value_local_nonprim) {
        schedule_delta_value_free(delta_value_local_nonprim);
        delta_value_local_nonprim = NULL;
    }
    if (end_timestamp_local_var) {
        free(end_timestamp_local_var);
        end_timestamp_local_var = NULL;
    }
    if (entity_id_local_str) {
        free(entity_id_local_str);
        entity_id_local_str = NULL;
    }
    if (entity_type_local_nonprim) {
        ad_account_entity_type_free(entity_type_local_nonprim);
        entity_type_local_nonprim = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (schedule_action_local_nonprim) {
        schedule_action_free(schedule_action_local_nonprim);
        schedule_action_local_nonprim = NULL;
    }
    if (schedule_id_local_str) {
        free(schedule_id_local_str);
        schedule_id_local_str = NULL;
    }
    if (schedule_status_local_nonprim) {
        schedule_status_free(schedule_status_local_nonprim);
        schedule_status_local_nonprim = NULL;
    }
    if (schedule_type_local_nonprim) {
        schedule_type_free(schedule_type_local_nonprim);
        schedule_type_local_nonprim = NULL;
    }
    if (start_timestamp_local_var) {
        free(start_timestamp_local_var);
        start_timestamp_local_var = NULL;
    }
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (exceptions_local_nonprim) {
        pinterest_lib_error_free(exceptions_local_nonprim);
        exceptions_local_nonprim = NULL;
    }
    return NULL;

}
