#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "entity_label.h"



static entity_label_t *entity_label_create_internal(
    char *entity_id,
    label_parent_type_t *entity_type,
    char *label_id,
    entity_label_status_t *status
    ) {
    entity_label_t *entity_label_local_var = malloc(sizeof(entity_label_t));
    if (!entity_label_local_var) {
        return NULL;
    }
    memset(entity_label_local_var, 0, sizeof(entity_label_t));
    entity_label_local_var->_library_owned = 1;
    entity_label_local_var->entity_id = entity_id;
    entity_label_local_var->entity_type = entity_type;
    entity_label_local_var->label_id = label_id;
    entity_label_local_var->status = status;
    return entity_label_local_var;
}

__attribute__((deprecated)) entity_label_t *entity_label_create(
    char *entity_id,
    label_parent_type_t *entity_type,
    char *label_id,
    entity_label_status_t *status
    ) {
    entity_label_t *result = entity_label_create_internal (
        entity_id,
        entity_type,
        label_id,
        status
        );
    if (!result) {
    }
    return result;
}

void entity_label_free(entity_label_t *entity_label) {
    if(NULL == entity_label){
        return ;
    }
    if(entity_label->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "entity_label_free");
        return ;
    }
    listEntry_t *listEntry;
    if (entity_label->entity_id) {
        free(entity_label->entity_id);
        entity_label->entity_id = NULL;
    }
    if (entity_label->entity_type) {
        label_parent_type_free(entity_label->entity_type);
        entity_label->entity_type = NULL;
    }
    if (entity_label->label_id) {
        free(entity_label->label_id);
        entity_label->label_id = NULL;
    }
    if (entity_label->status) {
        entity_label_status_free(entity_label->status);
        entity_label->status = NULL;
    }
    free(entity_label);
}

cJSON *entity_label_convertToJSON(entity_label_t *entity_label) {
    cJSON *item = cJSON_CreateObject();

    // entity_label->entity_id
    if (!entity_label->entity_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "entity_id", entity_label->entity_id) == NULL) {
    goto fail; //String
    }


    // entity_label->entity_type
    if(entity_label->entity_type) {
    cJSON *entity_type_local_JSON = label_parent_type_convertToJSON(entity_label->entity_type);
    if(entity_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "entity_type", entity_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // entity_label->label_id
    if (!entity_label->label_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "label_id", entity_label->label_id) == NULL) {
    goto fail; //String
    }


    // entity_label->status
    if(entity_label->status) {
    cJSON *status_local_JSON = entity_label_status_convertToJSON(entity_label->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

entity_label_t *entity_label_parseFromJSON(cJSON *entity_labelJSON){

    entity_label_t *entity_label_local_var = NULL;

    char *entity_id_local_str = NULL;

    // define the local variable for entity_label->entity_type
    label_parent_type_t *entity_type_local_nonprim = NULL;

    char *label_id_local_str = NULL;

    // define the local variable for entity_label->status
    entity_label_status_t *status_local_nonprim = NULL;

    // entity_label->entity_id
    cJSON *entity_id = cJSON_GetObjectItemCaseSensitive(entity_labelJSON, "entity_id");
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

    // entity_label->entity_type
    cJSON *entity_type = cJSON_GetObjectItemCaseSensitive(entity_labelJSON, "entity_type");
    if (cJSON_IsNull(entity_type)) {
        entity_type = NULL;
    }
    if (entity_type) { 
    entity_type_local_nonprim = label_parent_type_parseFromJSON(entity_type); //custom
    }

    // entity_label->label_id
    cJSON *label_id = cJSON_GetObjectItemCaseSensitive(entity_labelJSON, "label_id");
    if (cJSON_IsNull(label_id)) {
        label_id = NULL;
    }
    if (!label_id) {
        goto end;
    }

    
    if(!cJSON_IsString(label_id))
    {
    goto end; //String
    }

    // entity_label->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(entity_labelJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    status_local_nonprim = entity_label_status_parseFromJSON(status); //custom
    }


    if (entity_id && !cJSON_IsNull(entity_id)) entity_id_local_str = strdup(entity_id->valuestring);
    if (label_id && !cJSON_IsNull(label_id)) label_id_local_str = strdup(label_id->valuestring);

    entity_label_local_var = entity_label_create_internal (
        entity_id_local_str,
        entity_type ? entity_type_local_nonprim : NULL,
        label_id_local_str,
        status ? status_local_nonprim : NULL
        );

    if (!entity_label_local_var) {
        goto end;
    }

    return entity_label_local_var;
end:
    if (entity_id_local_str) {
        free(entity_id_local_str);
        entity_id_local_str = NULL;
    }
    if (entity_type_local_nonprim) {
        label_parent_type_free(entity_type_local_nonprim);
        entity_type_local_nonprim = NULL;
    }
    if (label_id_local_str) {
        free(label_id_local_str);
        label_id_local_str = NULL;
    }
    if (status_local_nonprim) {
        entity_label_status_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    return NULL;

}
