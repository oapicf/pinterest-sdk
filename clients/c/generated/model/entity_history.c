#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "entity_history.h"



static entity_history_t *entity_history_create_internal(
    int *change_timestamp,
    list_t *data_changes,
    char *entity_id,
    char *entity_name,
    char *ldap,
    change_history_operation_type_t *operation,
    char *user_id
    ) {
    entity_history_t *entity_history_local_var = malloc(sizeof(entity_history_t));
    if (!entity_history_local_var) {
        return NULL;
    }
    memset(entity_history_local_var, 0, sizeof(entity_history_t));
    entity_history_local_var->_library_owned = 1;
    entity_history_local_var->change_timestamp = change_timestamp;
    entity_history_local_var->data_changes = data_changes;
    entity_history_local_var->entity_id = entity_id;
    entity_history_local_var->entity_name = entity_name;
    entity_history_local_var->ldap = ldap;
    entity_history_local_var->operation = operation;
    entity_history_local_var->user_id = user_id;
    return entity_history_local_var;
}

__attribute__((deprecated)) entity_history_t *entity_history_create(
    int *change_timestamp,
    list_t *data_changes,
    char *entity_id,
    char *entity_name,
    char *ldap,
    change_history_operation_type_t *operation,
    char *user_id
    ) {
    int *change_timestamp_copy = NULL;
    if (change_timestamp) {
        change_timestamp_copy = malloc(sizeof(int));
        if (change_timestamp_copy) *change_timestamp_copy = *change_timestamp;
    }
    entity_history_t *result = entity_history_create_internal (
        change_timestamp_copy,
        data_changes,
        entity_id,
        entity_name,
        ldap,
        operation,
        user_id
        );
    if (!result) {
        free(change_timestamp_copy);
    }
    return result;
}

void entity_history_free(entity_history_t *entity_history) {
    if(NULL == entity_history){
        return ;
    }
    if(entity_history->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "entity_history_free");
        return ;
    }
    listEntry_t *listEntry;
    if (entity_history->change_timestamp) {
        free(entity_history->change_timestamp);
        entity_history->change_timestamp = NULL;
    }
    if (entity_history->data_changes) {
        list_ForEach(listEntry, entity_history->data_changes) {
            entity_data_change_history_free(listEntry->data);
        }
        list_freeList(entity_history->data_changes);
        entity_history->data_changes = NULL;
    }
    if (entity_history->entity_id) {
        free(entity_history->entity_id);
        entity_history->entity_id = NULL;
    }
    if (entity_history->entity_name) {
        free(entity_history->entity_name);
        entity_history->entity_name = NULL;
    }
    if (entity_history->ldap) {
        free(entity_history->ldap);
        entity_history->ldap = NULL;
    }
    if (entity_history->operation) {
        change_history_operation_type_free(entity_history->operation);
        entity_history->operation = NULL;
    }
    if (entity_history->user_id) {
        free(entity_history->user_id);
        entity_history->user_id = NULL;
    }
    free(entity_history);
}

cJSON *entity_history_convertToJSON(entity_history_t *entity_history) {
    cJSON *item = cJSON_CreateObject();

    // entity_history->change_timestamp
    if(entity_history->change_timestamp) {
    if(cJSON_AddNumberToObject(item, "change_timestamp", *entity_history->change_timestamp) == NULL) {
    goto fail; //Numeric
    }
    }


    // entity_history->data_changes
    if(entity_history->data_changes) {
    cJSON *data_changes = cJSON_AddArrayToObject(item, "data_changes");
    if(data_changes == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *data_changesListEntry;
    if (entity_history->data_changes) {
    list_ForEach(data_changesListEntry, entity_history->data_changes) {
    cJSON *itemLocal = entity_data_change_history_convertToJSON(data_changesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(data_changes, itemLocal);
    }
    }
    }


    // entity_history->entity_id
    if(entity_history->entity_id) {
    if(cJSON_AddStringToObject(item, "entity_id", entity_history->entity_id) == NULL) {
    goto fail; //String
    }
    }


    // entity_history->entity_name
    if(entity_history->entity_name) {
    if(cJSON_AddStringToObject(item, "entity_name", entity_history->entity_name) == NULL) {
    goto fail; //String
    }
    }


    // entity_history->ldap
    if(entity_history->ldap) {
    if(cJSON_AddStringToObject(item, "ldap", entity_history->ldap) == NULL) {
    goto fail; //String
    }
    }


    // entity_history->operation
    if(entity_history->operation) {
    cJSON *operation_local_JSON = change_history_operation_type_convertToJSON(entity_history->operation);
    if(operation_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "operation", operation_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // entity_history->user_id
    if(entity_history->user_id) {
    if(cJSON_AddStringToObject(item, "user_id", entity_history->user_id) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

entity_history_t *entity_history_parseFromJSON(cJSON *entity_historyJSON){

    entity_history_t *entity_history_local_var = NULL;

    // define the local variable for entity_history->change_timestamp
    int *change_timestamp_local_var = NULL;

    // define the local list for entity_history->data_changes
    list_t *data_changesList = NULL;

    char *entity_id_local_str = NULL;

    char *entity_name_local_str = NULL;

    char *ldap_local_str = NULL;

    // define the local variable for entity_history->operation
    change_history_operation_type_t *operation_local_nonprim = NULL;

    char *user_id_local_str = NULL;

    // entity_history->change_timestamp
    cJSON *change_timestamp = cJSON_GetObjectItemCaseSensitive(entity_historyJSON, "change_timestamp");
    if (cJSON_IsNull(change_timestamp)) {
        change_timestamp = NULL;
    }
    if (change_timestamp) { 
    if(!cJSON_IsNumber(change_timestamp))
    {
    goto end; //Numeric
    }
    change_timestamp_local_var = malloc(sizeof(int));
    if(!change_timestamp_local_var)
    {
        goto end;
    }
    *change_timestamp_local_var = change_timestamp->valuedouble;
    }

    // entity_history->data_changes
    cJSON *data_changes = cJSON_GetObjectItemCaseSensitive(entity_historyJSON, "data_changes");
    if (cJSON_IsNull(data_changes)) {
        data_changes = NULL;
    }
    if (data_changes) { 
    cJSON *data_changes_local_nonprimitive = NULL;
    if(!cJSON_IsArray(data_changes)){
        goto end; //nonprimitive container
    }

    data_changesList = list_createList();

    cJSON_ArrayForEach(data_changes_local_nonprimitive,data_changes )
    {
        if(!cJSON_IsObject(data_changes_local_nonprimitive)){
            goto end;
        }
        entity_data_change_history_t *data_changesItem = entity_data_change_history_parseFromJSON(data_changes_local_nonprimitive);

        list_addElement(data_changesList, data_changesItem);
    }
    }

    // entity_history->entity_id
    cJSON *entity_id = cJSON_GetObjectItemCaseSensitive(entity_historyJSON, "entity_id");
    if (cJSON_IsNull(entity_id)) {
        entity_id = NULL;
    }
    if (entity_id) { 
    if(!cJSON_IsString(entity_id) && !cJSON_IsNull(entity_id))
    {
    goto end; //String
    }
    }

    // entity_history->entity_name
    cJSON *entity_name = cJSON_GetObjectItemCaseSensitive(entity_historyJSON, "entity_name");
    if (cJSON_IsNull(entity_name)) {
        entity_name = NULL;
    }
    if (entity_name) { 
    if(!cJSON_IsString(entity_name) && !cJSON_IsNull(entity_name))
    {
    goto end; //String
    }
    }

    // entity_history->ldap
    cJSON *ldap = cJSON_GetObjectItemCaseSensitive(entity_historyJSON, "ldap");
    if (cJSON_IsNull(ldap)) {
        ldap = NULL;
    }
    if (ldap) { 
    if(!cJSON_IsString(ldap) && !cJSON_IsNull(ldap))
    {
    goto end; //String
    }
    }

    // entity_history->operation
    cJSON *operation = cJSON_GetObjectItemCaseSensitive(entity_historyJSON, "operation");
    if (cJSON_IsNull(operation)) {
        operation = NULL;
    }
    if (operation) { 
    operation_local_nonprim = change_history_operation_type_parseFromJSON(operation); //custom
    }

    // entity_history->user_id
    cJSON *user_id = cJSON_GetObjectItemCaseSensitive(entity_historyJSON, "user_id");
    if (cJSON_IsNull(user_id)) {
        user_id = NULL;
    }
    if (user_id) { 
    if(!cJSON_IsString(user_id) && !cJSON_IsNull(user_id))
    {
    goto end; //String
    }
    }


    if (entity_id && !cJSON_IsNull(entity_id)) entity_id_local_str = strdup(entity_id->valuestring);
    if (entity_name && !cJSON_IsNull(entity_name)) entity_name_local_str = strdup(entity_name->valuestring);
    if (ldap && !cJSON_IsNull(ldap)) ldap_local_str = strdup(ldap->valuestring);
    if (user_id && !cJSON_IsNull(user_id)) user_id_local_str = strdup(user_id->valuestring);

    entity_history_local_var = entity_history_create_internal (
        change_timestamp_local_var,
        data_changes ? data_changesList : NULL,
        entity_id_local_str,
        entity_name_local_str,
        ldap_local_str,
        operation ? operation_local_nonprim : NULL,
        user_id_local_str
        );

    if (!entity_history_local_var) {
        goto end;
    }

    return entity_history_local_var;
end:
    if (change_timestamp_local_var) {
        free(change_timestamp_local_var);
        change_timestamp_local_var = NULL;
    }
    if (data_changesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, data_changesList) {
            entity_data_change_history_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(data_changesList);
        data_changesList = NULL;
    }
    if (entity_id_local_str) {
        free(entity_id_local_str);
        entity_id_local_str = NULL;
    }
    if (entity_name_local_str) {
        free(entity_name_local_str);
        entity_name_local_str = NULL;
    }
    if (ldap_local_str) {
        free(ldap_local_str);
        ldap_local_str = NULL;
    }
    if (operation_local_nonprim) {
        change_history_operation_type_free(operation_local_nonprim);
        operation_local_nonprim = NULL;
    }
    if (user_id_local_str) {
        free(user_id_local_str);
        user_id_local_str = NULL;
    }
    return NULL;

}
