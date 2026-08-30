#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "schedule_create.h"



static schedule_create_t *schedule_create_create_internal(
    schedule_delta_value_t *delta_value,
    int *end_timestamp,
    char *entity_id,
    ad_account_entity_type_t *entity_type,
    char *name,
    schedule_action_t *schedule_action,
    schedule_status_t *schedule_status,
    schedule_type_t *schedule_type,
    int *start_timestamp
    ) {
    schedule_create_t *schedule_create_local_var = malloc(sizeof(schedule_create_t));
    if (!schedule_create_local_var) {
        return NULL;
    }
    memset(schedule_create_local_var, 0, sizeof(schedule_create_t));
    schedule_create_local_var->_library_owned = 1;
    schedule_create_local_var->delta_value = delta_value;
    schedule_create_local_var->end_timestamp = end_timestamp;
    schedule_create_local_var->entity_id = entity_id;
    schedule_create_local_var->entity_type = entity_type;
    schedule_create_local_var->name = name;
    schedule_create_local_var->schedule_action = schedule_action;
    schedule_create_local_var->schedule_status = schedule_status;
    schedule_create_local_var->schedule_type = schedule_type;
    schedule_create_local_var->start_timestamp = start_timestamp;
    return schedule_create_local_var;
}

__attribute__((deprecated)) schedule_create_t *schedule_create_create(
    schedule_delta_value_t *delta_value,
    int *end_timestamp,
    char *entity_id,
    ad_account_entity_type_t *entity_type,
    char *name,
    schedule_action_t *schedule_action,
    schedule_status_t *schedule_status,
    schedule_type_t *schedule_type,
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
    schedule_create_t *result = schedule_create_create_internal (
        delta_value,
        end_timestamp_copy,
        entity_id,
        entity_type,
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

void schedule_create_free(schedule_create_t *schedule_create) {
    if(NULL == schedule_create){
        return ;
    }
    if(schedule_create->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "schedule_create_free");
        return ;
    }
    listEntry_t *listEntry;
    if (schedule_create->delta_value) {
        schedule_delta_value_free(schedule_create->delta_value);
        schedule_create->delta_value = NULL;
    }
    if (schedule_create->end_timestamp) {
        free(schedule_create->end_timestamp);
        schedule_create->end_timestamp = NULL;
    }
    if (schedule_create->entity_id) {
        free(schedule_create->entity_id);
        schedule_create->entity_id = NULL;
    }
    if (schedule_create->entity_type) {
        ad_account_entity_type_free(schedule_create->entity_type);
        schedule_create->entity_type = NULL;
    }
    if (schedule_create->name) {
        free(schedule_create->name);
        schedule_create->name = NULL;
    }
    if (schedule_create->schedule_action) {
        schedule_action_free(schedule_create->schedule_action);
        schedule_create->schedule_action = NULL;
    }
    if (schedule_create->schedule_status) {
        schedule_status_free(schedule_create->schedule_status);
        schedule_create->schedule_status = NULL;
    }
    if (schedule_create->schedule_type) {
        schedule_type_free(schedule_create->schedule_type);
        schedule_create->schedule_type = NULL;
    }
    if (schedule_create->start_timestamp) {
        free(schedule_create->start_timestamp);
        schedule_create->start_timestamp = NULL;
    }
    free(schedule_create);
}

cJSON *schedule_create_convertToJSON(schedule_create_t *schedule_create) {
    cJSON *item = cJSON_CreateObject();

    // schedule_create->delta_value
    if(schedule_create->delta_value) {
    cJSON *delta_value_local_JSON = schedule_delta_value_convertToJSON(schedule_create->delta_value);
    if(delta_value_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "delta_value", delta_value_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // schedule_create->end_timestamp
    if(schedule_create->end_timestamp) {
    if(cJSON_AddNumberToObject(item, "end_timestamp", *schedule_create->end_timestamp) == NULL) {
    goto fail; //Numeric
    }
    }


    // schedule_create->entity_id
    if (!schedule_create->entity_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "entity_id", schedule_create->entity_id) == NULL) {
    goto fail; //String
    }


    // schedule_create->entity_type
    if(schedule_create->entity_type) {
    cJSON *entity_type_local_JSON = ad_account_entity_type_convertToJSON(schedule_create->entity_type);
    if(entity_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "entity_type", entity_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // schedule_create->name
    if(schedule_create->name) {
    if(cJSON_AddStringToObject(item, "name", schedule_create->name) == NULL) {
    goto fail; //String
    }
    }


    // schedule_create->schedule_action
    if(schedule_create->schedule_action) {
    cJSON *schedule_action_local_JSON = schedule_action_convertToJSON(schedule_create->schedule_action);
    if(schedule_action_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "schedule_action", schedule_action_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // schedule_create->schedule_status
    if(schedule_create->schedule_status) {
    cJSON *schedule_status_local_JSON = schedule_status_convertToJSON(schedule_create->schedule_status);
    if(schedule_status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "schedule_status", schedule_status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // schedule_create->schedule_type
    if(schedule_create->schedule_type) {
    cJSON *schedule_type_local_JSON = schedule_type_convertToJSON(schedule_create->schedule_type);
    if(schedule_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "schedule_type", schedule_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // schedule_create->start_timestamp
    if(schedule_create->start_timestamp) {
    if(cJSON_AddNumberToObject(item, "start_timestamp", *schedule_create->start_timestamp) == NULL) {
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

schedule_create_t *schedule_create_parseFromJSON(cJSON *schedule_createJSON){

    schedule_create_t *schedule_create_local_var = NULL;

    // define the local variable for schedule_create->delta_value
    schedule_delta_value_t *delta_value_local_nonprim = NULL;

    // define the local variable for schedule_create->end_timestamp
    int *end_timestamp_local_var = NULL;

    char *entity_id_local_str = NULL;

    // define the local variable for schedule_create->entity_type
    ad_account_entity_type_t *entity_type_local_nonprim = NULL;

    char *name_local_str = NULL;

    // define the local variable for schedule_create->schedule_action
    schedule_action_t *schedule_action_local_nonprim = NULL;

    // define the local variable for schedule_create->schedule_status
    schedule_status_t *schedule_status_local_nonprim = NULL;

    // define the local variable for schedule_create->schedule_type
    schedule_type_t *schedule_type_local_nonprim = NULL;

    // define the local variable for schedule_create->start_timestamp
    int *start_timestamp_local_var = NULL;

    // schedule_create->delta_value
    cJSON *delta_value = cJSON_GetObjectItemCaseSensitive(schedule_createJSON, "delta_value");
    if (cJSON_IsNull(delta_value)) {
        delta_value = NULL;
    }
    if (delta_value) { 
    delta_value_local_nonprim = schedule_delta_value_parseFromJSON(delta_value); //nonprimitive
    }

    // schedule_create->end_timestamp
    cJSON *end_timestamp = cJSON_GetObjectItemCaseSensitive(schedule_createJSON, "end_timestamp");
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

    // schedule_create->entity_id
    cJSON *entity_id = cJSON_GetObjectItemCaseSensitive(schedule_createJSON, "entity_id");
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

    // schedule_create->entity_type
    cJSON *entity_type = cJSON_GetObjectItemCaseSensitive(schedule_createJSON, "entity_type");
    if (cJSON_IsNull(entity_type)) {
        entity_type = NULL;
    }
    if (entity_type) { 
    entity_type_local_nonprim = ad_account_entity_type_parseFromJSON(entity_type); //custom
    }

    // schedule_create->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(schedule_createJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // schedule_create->schedule_action
    cJSON *schedule_action = cJSON_GetObjectItemCaseSensitive(schedule_createJSON, "schedule_action");
    if (cJSON_IsNull(schedule_action)) {
        schedule_action = NULL;
    }
    if (schedule_action) { 
    schedule_action_local_nonprim = schedule_action_parseFromJSON(schedule_action); //custom
    }

    // schedule_create->schedule_status
    cJSON *schedule_status = cJSON_GetObjectItemCaseSensitive(schedule_createJSON, "schedule_status");
    if (cJSON_IsNull(schedule_status)) {
        schedule_status = NULL;
    }
    if (schedule_status) { 
    schedule_status_local_nonprim = schedule_status_parseFromJSON(schedule_status); //custom
    }

    // schedule_create->schedule_type
    cJSON *schedule_type = cJSON_GetObjectItemCaseSensitive(schedule_createJSON, "schedule_type");
    if (cJSON_IsNull(schedule_type)) {
        schedule_type = NULL;
    }
    if (schedule_type) { 
    schedule_type_local_nonprim = schedule_type_parseFromJSON(schedule_type); //custom
    }

    // schedule_create->start_timestamp
    cJSON *start_timestamp = cJSON_GetObjectItemCaseSensitive(schedule_createJSON, "start_timestamp");
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
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    schedule_create_local_var = schedule_create_create_internal (
        delta_value ? delta_value_local_nonprim : NULL,
        end_timestamp_local_var,
        entity_id_local_str,
        entity_type ? entity_type_local_nonprim : NULL,
        name_local_str,
        schedule_action ? schedule_action_local_nonprim : NULL,
        schedule_status ? schedule_status_local_nonprim : NULL,
        schedule_type ? schedule_type_local_nonprim : NULL,
        start_timestamp_local_var
        );

    if (!schedule_create_local_var) {
        goto end;
    }

    return schedule_create_local_var;
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
    return NULL;

}
