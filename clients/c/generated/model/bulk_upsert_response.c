#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "bulk_upsert_response.h"



static bulk_upsert_response_t *bulk_upsert_response_create_internal(
    char *request_id
    ) {
    bulk_upsert_response_t *bulk_upsert_response_local_var = malloc(sizeof(bulk_upsert_response_t));
    if (!bulk_upsert_response_local_var) {
        return NULL;
    }
    memset(bulk_upsert_response_local_var, 0, sizeof(bulk_upsert_response_t));
    bulk_upsert_response_local_var->_library_owned = 1;
    bulk_upsert_response_local_var->request_id = request_id;
    return bulk_upsert_response_local_var;
}

__attribute__((deprecated)) bulk_upsert_response_t *bulk_upsert_response_create(
    char *request_id
    ) {
    bulk_upsert_response_t *result = bulk_upsert_response_create_internal (
        request_id
        );
    if (!result) {
    }
    return result;
}

void bulk_upsert_response_free(bulk_upsert_response_t *bulk_upsert_response) {
    if(NULL == bulk_upsert_response){
        return ;
    }
    if(bulk_upsert_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "bulk_upsert_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (bulk_upsert_response->request_id) {
        free(bulk_upsert_response->request_id);
        bulk_upsert_response->request_id = NULL;
    }
    free(bulk_upsert_response);
}

cJSON *bulk_upsert_response_convertToJSON(bulk_upsert_response_t *bulk_upsert_response) {
    cJSON *item = cJSON_CreateObject();

    // bulk_upsert_response->request_id
    if(bulk_upsert_response->request_id) {
    if(cJSON_AddStringToObject(item, "request_id", bulk_upsert_response->request_id) == NULL) {
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

bulk_upsert_response_t *bulk_upsert_response_parseFromJSON(cJSON *bulk_upsert_responseJSON){

    bulk_upsert_response_t *bulk_upsert_response_local_var = NULL;

    char *request_id_local_str = NULL;

    // bulk_upsert_response->request_id
    cJSON *request_id = cJSON_GetObjectItemCaseSensitive(bulk_upsert_responseJSON, "request_id");
    if (cJSON_IsNull(request_id)) {
        request_id = NULL;
    }
    if (request_id) { 
    if(!cJSON_IsString(request_id) && !cJSON_IsNull(request_id))
    {
    goto end; //String
    }
    }


    if (request_id && !cJSON_IsNull(request_id)) request_id_local_str = strdup(request_id->valuestring);

    bulk_upsert_response_local_var = bulk_upsert_response_create_internal (
        request_id_local_str
        );

    if (!bulk_upsert_response_local_var) {
        goto end;
    }

    return bulk_upsert_response_local_var;
end:
    if (request_id_local_str) {
        free(request_id_local_str);
        request_id_local_str = NULL;
    }
    return NULL;

}
