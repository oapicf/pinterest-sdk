#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "label_update_item.h"



static label_update_item_t *label_update_item_create_internal(
    char *id,
    pinterest_rest_api_label_status__e status,
    char *value
    ) {
    label_update_item_t *label_update_item_local_var = malloc(sizeof(label_update_item_t));
    if (!label_update_item_local_var) {
        return NULL;
    }
    memset(label_update_item_local_var, 0, sizeof(label_update_item_t));
    label_update_item_local_var->_library_owned = 1;
    label_update_item_local_var->id = id;
    label_update_item_local_var->status = status;
    label_update_item_local_var->value = value;
    return label_update_item_local_var;
}

__attribute__((deprecated)) label_update_item_t *label_update_item_create(
    char *id,
    pinterest_rest_api_label_status__e status,
    char *value
    ) {
    label_update_item_t *result = label_update_item_create_internal (
        id,
        status,
        value
        );
    if (!result) {
    }
    return result;
}

void label_update_item_free(label_update_item_t *label_update_item) {
    if(NULL == label_update_item){
        return ;
    }
    if(label_update_item->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "label_update_item_free");
        return ;
    }
    listEntry_t *listEntry;
    if (label_update_item->id) {
        free(label_update_item->id);
        label_update_item->id = NULL;
    }
    if (label_update_item->value) {
        free(label_update_item->value);
        label_update_item->value = NULL;
    }
    free(label_update_item);
}

cJSON *label_update_item_convertToJSON(label_update_item_t *label_update_item) {
    cJSON *item = cJSON_CreateObject();

    // label_update_item->id
    if (!label_update_item->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", label_update_item->id) == NULL) {
    goto fail; //String
    }


    // label_update_item->status
    if(label_update_item->status != pinterest_rest_api_label_status__NULL) {
    cJSON *status_local_JSON = label_status_convertToJSON(label_update_item->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // label_update_item->value
    if(label_update_item->value) {
    if(cJSON_AddStringToObject(item, "value", label_update_item->value) == NULL) {
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

label_update_item_t *label_update_item_parseFromJSON(cJSON *label_update_itemJSON){

    label_update_item_t *label_update_item_local_var = NULL;

    char *id_local_str = NULL;

    // define the local variable for label_update_item->status
    pinterest_rest_api_label_status__e status_local_nonprim = 0;

    char *value_local_str = NULL;

    // label_update_item->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(label_update_itemJSON, "id");
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

    // label_update_item->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(label_update_itemJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    status_local_nonprim = label_status_parseFromJSON(status); //custom
    }

    // label_update_item->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(label_update_itemJSON, "value");
    if (cJSON_IsNull(value)) {
        value = NULL;
    }
    if (value) { 
    if(!cJSON_IsString(value) && !cJSON_IsNull(value))
    {
    goto end; //String
    }
    }


    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (value && !cJSON_IsNull(value)) value_local_str = strdup(value->valuestring);

    label_update_item_local_var = label_update_item_create_internal (
        id_local_str,
        status ? status_local_nonprim : 0,
        value_local_str
        );

    if (!label_update_item_local_var) {
        goto end;
    }

    return label_update_item_local_var;
end:
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (status_local_nonprim) {
        status_local_nonprim = 0;
    }
    if (value_local_str) {
        free(value_local_str);
        value_local_str = NULL;
    }
    return NULL;

}
