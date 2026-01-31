#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "bulk_upsert_status_response.h"



static bulk_upsert_status_response_t *bulk_upsert_status_response_create_internal(
    char *result_url,
    pinterest_rest_api_bulk_upsert_status__e status
    ) {
    bulk_upsert_status_response_t *bulk_upsert_status_response_local_var = malloc(sizeof(bulk_upsert_status_response_t));
    if (!bulk_upsert_status_response_local_var) {
        return NULL;
    }
    bulk_upsert_status_response_local_var->result_url = result_url;
    bulk_upsert_status_response_local_var->status = status;

    bulk_upsert_status_response_local_var->_library_owned = 1;
    return bulk_upsert_status_response_local_var;
}

__attribute__((deprecated)) bulk_upsert_status_response_t *bulk_upsert_status_response_create(
    char *result_url,
    pinterest_rest_api_bulk_upsert_status__e status
    ) {
    return bulk_upsert_status_response_create_internal (
        result_url,
        status
        );
}

void bulk_upsert_status_response_free(bulk_upsert_status_response_t *bulk_upsert_status_response) {
    if(NULL == bulk_upsert_status_response){
        return ;
    }
    if(bulk_upsert_status_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "bulk_upsert_status_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (bulk_upsert_status_response->result_url) {
        free(bulk_upsert_status_response->result_url);
        bulk_upsert_status_response->result_url = NULL;
    }
    free(bulk_upsert_status_response);
}

cJSON *bulk_upsert_status_response_convertToJSON(bulk_upsert_status_response_t *bulk_upsert_status_response) {
    cJSON *item = cJSON_CreateObject();

    // bulk_upsert_status_response->result_url
    if(bulk_upsert_status_response->result_url) {
    if(cJSON_AddStringToObject(item, "result_url", bulk_upsert_status_response->result_url) == NULL) {
    goto fail; //String
    }
    }


    // bulk_upsert_status_response->status
    if(bulk_upsert_status_response->status != pinterest_rest_api_bulk_upsert_status__NULL) {
    cJSON *status_local_JSON = bulk_upsert_status_convertToJSON(bulk_upsert_status_response->status);
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

bulk_upsert_status_response_t *bulk_upsert_status_response_parseFromJSON(cJSON *bulk_upsert_status_responseJSON){

    bulk_upsert_status_response_t *bulk_upsert_status_response_local_var = NULL;

    // define the local variable for bulk_upsert_status_response->status
    pinterest_rest_api_bulk_upsert_status__e status_local_nonprim = 0;

    // bulk_upsert_status_response->result_url
    cJSON *result_url = cJSON_GetObjectItemCaseSensitive(bulk_upsert_status_responseJSON, "result_url");
    if (cJSON_IsNull(result_url)) {
        result_url = NULL;
    }
    if (result_url) { 
    if(!cJSON_IsString(result_url) && !cJSON_IsNull(result_url))
    {
    goto end; //String
    }
    }

    // bulk_upsert_status_response->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(bulk_upsert_status_responseJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    status_local_nonprim = bulk_upsert_status_parseFromJSON(status); //custom
    }


    bulk_upsert_status_response_local_var = bulk_upsert_status_response_create_internal (
        result_url && !cJSON_IsNull(result_url) ? strdup(result_url->valuestring) : NULL,
        status ? status_local_nonprim : 0
        );

    return bulk_upsert_status_response_local_var;
end:
    if (status_local_nonprim) {
        status_local_nonprim = 0;
    }
    return NULL;

}
