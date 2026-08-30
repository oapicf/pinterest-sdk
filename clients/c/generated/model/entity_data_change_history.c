#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "entity_data_change_history.h"



static entity_data_change_history_t *entity_data_change_history_create_internal(
    char *changed_field_id,
    char *changed_field_name,
    change_history_data_type_t *data_type,
    char *new_data_value,
    char *old_data_value
    ) {
    entity_data_change_history_t *entity_data_change_history_local_var = malloc(sizeof(entity_data_change_history_t));
    if (!entity_data_change_history_local_var) {
        return NULL;
    }
    memset(entity_data_change_history_local_var, 0, sizeof(entity_data_change_history_t));
    entity_data_change_history_local_var->_library_owned = 1;
    entity_data_change_history_local_var->changed_field_id = changed_field_id;
    entity_data_change_history_local_var->changed_field_name = changed_field_name;
    entity_data_change_history_local_var->data_type = data_type;
    entity_data_change_history_local_var->new_data_value = new_data_value;
    entity_data_change_history_local_var->old_data_value = old_data_value;
    return entity_data_change_history_local_var;
}

__attribute__((deprecated)) entity_data_change_history_t *entity_data_change_history_create(
    char *changed_field_id,
    char *changed_field_name,
    change_history_data_type_t *data_type,
    char *new_data_value,
    char *old_data_value
    ) {
    entity_data_change_history_t *result = entity_data_change_history_create_internal (
        changed_field_id,
        changed_field_name,
        data_type,
        new_data_value,
        old_data_value
        );
    if (!result) {
    }
    return result;
}

void entity_data_change_history_free(entity_data_change_history_t *entity_data_change_history) {
    if(NULL == entity_data_change_history){
        return ;
    }
    if(entity_data_change_history->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "entity_data_change_history_free");
        return ;
    }
    listEntry_t *listEntry;
    if (entity_data_change_history->changed_field_id) {
        free(entity_data_change_history->changed_field_id);
        entity_data_change_history->changed_field_id = NULL;
    }
    if (entity_data_change_history->changed_field_name) {
        free(entity_data_change_history->changed_field_name);
        entity_data_change_history->changed_field_name = NULL;
    }
    if (entity_data_change_history->data_type) {
        change_history_data_type_free(entity_data_change_history->data_type);
        entity_data_change_history->data_type = NULL;
    }
    if (entity_data_change_history->new_data_value) {
        free(entity_data_change_history->new_data_value);
        entity_data_change_history->new_data_value = NULL;
    }
    if (entity_data_change_history->old_data_value) {
        free(entity_data_change_history->old_data_value);
        entity_data_change_history->old_data_value = NULL;
    }
    free(entity_data_change_history);
}

cJSON *entity_data_change_history_convertToJSON(entity_data_change_history_t *entity_data_change_history) {
    cJSON *item = cJSON_CreateObject();

    // entity_data_change_history->changed_field_id
    if(entity_data_change_history->changed_field_id) {
    if(cJSON_AddStringToObject(item, "changed_field_id", entity_data_change_history->changed_field_id) == NULL) {
    goto fail; //String
    }
    }


    // entity_data_change_history->changed_field_name
    if(entity_data_change_history->changed_field_name) {
    if(cJSON_AddStringToObject(item, "changed_field_name", entity_data_change_history->changed_field_name) == NULL) {
    goto fail; //String
    }
    }


    // entity_data_change_history->data_type
    if(entity_data_change_history->data_type) {
    cJSON *data_type_local_JSON = change_history_data_type_convertToJSON(entity_data_change_history->data_type);
    if(data_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "data_type", data_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // entity_data_change_history->new_data_value
    if(entity_data_change_history->new_data_value) {
    if(cJSON_AddStringToObject(item, "new_data_value", entity_data_change_history->new_data_value) == NULL) {
    goto fail; //String
    }
    }


    // entity_data_change_history->old_data_value
    if(entity_data_change_history->old_data_value) {
    if(cJSON_AddStringToObject(item, "old_data_value", entity_data_change_history->old_data_value) == NULL) {
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

entity_data_change_history_t *entity_data_change_history_parseFromJSON(cJSON *entity_data_change_historyJSON){

    entity_data_change_history_t *entity_data_change_history_local_var = NULL;

    char *changed_field_id_local_str = NULL;

    char *changed_field_name_local_str = NULL;

    // define the local variable for entity_data_change_history->data_type
    change_history_data_type_t *data_type_local_nonprim = NULL;

    char *new_data_value_local_str = NULL;

    char *old_data_value_local_str = NULL;

    // entity_data_change_history->changed_field_id
    cJSON *changed_field_id = cJSON_GetObjectItemCaseSensitive(entity_data_change_historyJSON, "changed_field_id");
    if (cJSON_IsNull(changed_field_id)) {
        changed_field_id = NULL;
    }
    if (changed_field_id) { 
    if(!cJSON_IsString(changed_field_id) && !cJSON_IsNull(changed_field_id))
    {
    goto end; //String
    }
    }

    // entity_data_change_history->changed_field_name
    cJSON *changed_field_name = cJSON_GetObjectItemCaseSensitive(entity_data_change_historyJSON, "changed_field_name");
    if (cJSON_IsNull(changed_field_name)) {
        changed_field_name = NULL;
    }
    if (changed_field_name) { 
    if(!cJSON_IsString(changed_field_name) && !cJSON_IsNull(changed_field_name))
    {
    goto end; //String
    }
    }

    // entity_data_change_history->data_type
    cJSON *data_type = cJSON_GetObjectItemCaseSensitive(entity_data_change_historyJSON, "data_type");
    if (cJSON_IsNull(data_type)) {
        data_type = NULL;
    }
    if (data_type) { 
    data_type_local_nonprim = change_history_data_type_parseFromJSON(data_type); //custom
    }

    // entity_data_change_history->new_data_value
    cJSON *new_data_value = cJSON_GetObjectItemCaseSensitive(entity_data_change_historyJSON, "new_data_value");
    if (cJSON_IsNull(new_data_value)) {
        new_data_value = NULL;
    }
    if (new_data_value) { 
    if(!cJSON_IsString(new_data_value) && !cJSON_IsNull(new_data_value))
    {
    goto end; //String
    }
    }

    // entity_data_change_history->old_data_value
    cJSON *old_data_value = cJSON_GetObjectItemCaseSensitive(entity_data_change_historyJSON, "old_data_value");
    if (cJSON_IsNull(old_data_value)) {
        old_data_value = NULL;
    }
    if (old_data_value) { 
    if(!cJSON_IsString(old_data_value) && !cJSON_IsNull(old_data_value))
    {
    goto end; //String
    }
    }


    if (changed_field_id && !cJSON_IsNull(changed_field_id)) changed_field_id_local_str = strdup(changed_field_id->valuestring);
    if (changed_field_name && !cJSON_IsNull(changed_field_name)) changed_field_name_local_str = strdup(changed_field_name->valuestring);
    if (new_data_value && !cJSON_IsNull(new_data_value)) new_data_value_local_str = strdup(new_data_value->valuestring);
    if (old_data_value && !cJSON_IsNull(old_data_value)) old_data_value_local_str = strdup(old_data_value->valuestring);

    entity_data_change_history_local_var = entity_data_change_history_create_internal (
        changed_field_id_local_str,
        changed_field_name_local_str,
        data_type ? data_type_local_nonprim : NULL,
        new_data_value_local_str,
        old_data_value_local_str
        );

    if (!entity_data_change_history_local_var) {
        goto end;
    }

    return entity_data_change_history_local_var;
end:
    if (changed_field_id_local_str) {
        free(changed_field_id_local_str);
        changed_field_id_local_str = NULL;
    }
    if (changed_field_name_local_str) {
        free(changed_field_name_local_str);
        changed_field_name_local_str = NULL;
    }
    if (data_type_local_nonprim) {
        change_history_data_type_free(data_type_local_nonprim);
        data_type_local_nonprim = NULL;
    }
    if (new_data_value_local_str) {
        free(new_data_value_local_str);
        new_data_value_local_str = NULL;
    }
    if (old_data_value_local_str) {
        free(old_data_value_local_str);
        old_data_value_local_str = NULL;
    }
    return NULL;

}
