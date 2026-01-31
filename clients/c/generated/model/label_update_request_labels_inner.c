#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "label_update_request_labels_inner.h"



static label_update_request_labels_inner_t *label_update_request_labels_inner_create_internal(
    char *id,
    pinterest_rest_api_label_status__e status,
    char *value
    ) {
    label_update_request_labels_inner_t *label_update_request_labels_inner_local_var = malloc(sizeof(label_update_request_labels_inner_t));
    if (!label_update_request_labels_inner_local_var) {
        return NULL;
    }
    label_update_request_labels_inner_local_var->id = id;
    label_update_request_labels_inner_local_var->status = status;
    label_update_request_labels_inner_local_var->value = value;

    label_update_request_labels_inner_local_var->_library_owned = 1;
    return label_update_request_labels_inner_local_var;
}

__attribute__((deprecated)) label_update_request_labels_inner_t *label_update_request_labels_inner_create(
    char *id,
    pinterest_rest_api_label_status__e status,
    char *value
    ) {
    return label_update_request_labels_inner_create_internal (
        id,
        status,
        value
        );
}

void label_update_request_labels_inner_free(label_update_request_labels_inner_t *label_update_request_labels_inner) {
    if(NULL == label_update_request_labels_inner){
        return ;
    }
    if(label_update_request_labels_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "label_update_request_labels_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (label_update_request_labels_inner->id) {
        free(label_update_request_labels_inner->id);
        label_update_request_labels_inner->id = NULL;
    }
    if (label_update_request_labels_inner->value) {
        free(label_update_request_labels_inner->value);
        label_update_request_labels_inner->value = NULL;
    }
    free(label_update_request_labels_inner);
}

cJSON *label_update_request_labels_inner_convertToJSON(label_update_request_labels_inner_t *label_update_request_labels_inner) {
    cJSON *item = cJSON_CreateObject();

    // label_update_request_labels_inner->id
    if (!label_update_request_labels_inner->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", label_update_request_labels_inner->id) == NULL) {
    goto fail; //String
    }


    // label_update_request_labels_inner->status
    if(label_update_request_labels_inner->status != pinterest_rest_api_label_status__NULL) {
    cJSON *status_local_JSON = label_status_convertToJSON(label_update_request_labels_inner->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // label_update_request_labels_inner->value
    if(label_update_request_labels_inner->value) {
    if(cJSON_AddStringToObject(item, "value", label_update_request_labels_inner->value) == NULL) {
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

label_update_request_labels_inner_t *label_update_request_labels_inner_parseFromJSON(cJSON *label_update_request_labels_innerJSON){

    label_update_request_labels_inner_t *label_update_request_labels_inner_local_var = NULL;

    // define the local variable for label_update_request_labels_inner->status
    pinterest_rest_api_label_status__e status_local_nonprim = 0;

    // label_update_request_labels_inner->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(label_update_request_labels_innerJSON, "id");
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

    // label_update_request_labels_inner->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(label_update_request_labels_innerJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    status_local_nonprim = label_status_parseFromJSON(status); //custom
    }

    // label_update_request_labels_inner->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(label_update_request_labels_innerJSON, "value");
    if (cJSON_IsNull(value)) {
        value = NULL;
    }
    if (value) { 
    if(!cJSON_IsString(value) && !cJSON_IsNull(value))
    {
    goto end; //String
    }
    }


    label_update_request_labels_inner_local_var = label_update_request_labels_inner_create_internal (
        strdup(id->valuestring),
        status ? status_local_nonprim : 0,
        value && !cJSON_IsNull(value) ? strdup(value->valuestring) : NULL
        );

    return label_update_request_labels_inner_local_var;
end:
    if (status_local_nonprim) {
        status_local_nonprim = 0;
    }
    return NULL;

}
