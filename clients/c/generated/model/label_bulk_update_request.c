#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "label_bulk_update_request.h"



static label_bulk_update_request_t *label_bulk_update_request_create_internal(
    char *id,
    char *parent_id,
    pinterest_rest_api_label_status_bulk_update__e status
    ) {
    label_bulk_update_request_t *label_bulk_update_request_local_var = malloc(sizeof(label_bulk_update_request_t));
    if (!label_bulk_update_request_local_var) {
        return NULL;
    }
    memset(label_bulk_update_request_local_var, 0, sizeof(label_bulk_update_request_t));
    label_bulk_update_request_local_var->_library_owned = 1;
    label_bulk_update_request_local_var->id = id;
    label_bulk_update_request_local_var->parent_id = parent_id;
    label_bulk_update_request_local_var->status = status;
    return label_bulk_update_request_local_var;
}

__attribute__((deprecated)) label_bulk_update_request_t *label_bulk_update_request_create(
    char *id,
    char *parent_id,
    pinterest_rest_api_label_status_bulk_update__e status
    ) {
    label_bulk_update_request_t *result = label_bulk_update_request_create_internal (
        id,
        parent_id,
        status
        );
    if (!result) {
    }
    return result;
}

void label_bulk_update_request_free(label_bulk_update_request_t *label_bulk_update_request) {
    if(NULL == label_bulk_update_request){
        return ;
    }
    if(label_bulk_update_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "label_bulk_update_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (label_bulk_update_request->id) {
        free(label_bulk_update_request->id);
        label_bulk_update_request->id = NULL;
    }
    if (label_bulk_update_request->parent_id) {
        free(label_bulk_update_request->parent_id);
        label_bulk_update_request->parent_id = NULL;
    }
    free(label_bulk_update_request);
}

cJSON *label_bulk_update_request_convertToJSON(label_bulk_update_request_t *label_bulk_update_request) {
    cJSON *item = cJSON_CreateObject();

    // label_bulk_update_request->id
    if (!label_bulk_update_request->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", label_bulk_update_request->id) == NULL) {
    goto fail; //String
    }


    // label_bulk_update_request->parent_id
    if (!label_bulk_update_request->parent_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "parent_id", label_bulk_update_request->parent_id) == NULL) {
    goto fail; //String
    }


    // label_bulk_update_request->status
    if (pinterest_rest_api_label_status_bulk_update__NULL == label_bulk_update_request->status) {
        goto fail;
    }
    cJSON *status_local_JSON = label_status_bulk_update_convertToJSON(label_bulk_update_request->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
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

label_bulk_update_request_t *label_bulk_update_request_parseFromJSON(cJSON *label_bulk_update_requestJSON){

    label_bulk_update_request_t *label_bulk_update_request_local_var = NULL;

    char *id_local_str = NULL;

    char *parent_id_local_str = NULL;

    // define the local variable for label_bulk_update_request->status
    pinterest_rest_api_label_status_bulk_update__e status_local_nonprim = 0;

    // label_bulk_update_request->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(label_bulk_update_requestJSON, "id");
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

    // label_bulk_update_request->parent_id
    cJSON *parent_id = cJSON_GetObjectItemCaseSensitive(label_bulk_update_requestJSON, "parent_id");
    if (cJSON_IsNull(parent_id)) {
        parent_id = NULL;
    }
    if (!parent_id) {
        goto end;
    }

    
    if(!cJSON_IsString(parent_id))
    {
    goto end; //String
    }

    // label_bulk_update_request->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(label_bulk_update_requestJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (!status) {
        goto end;
    }

    
    status_local_nonprim = label_status_bulk_update_parseFromJSON(status); //custom


    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (parent_id && !cJSON_IsNull(parent_id)) parent_id_local_str = strdup(parent_id->valuestring);

    label_bulk_update_request_local_var = label_bulk_update_request_create_internal (
        id_local_str,
        parent_id_local_str,
        status_local_nonprim
        );

    if (!label_bulk_update_request_local_var) {
        goto end;
    }

    return label_bulk_update_request_local_var;
end:
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (parent_id_local_str) {
        free(parent_id_local_str);
        parent_id_local_str = NULL;
    }
    if (status_local_nonprim) {
        status_local_nonprim = 0;
    }
    return NULL;

}
