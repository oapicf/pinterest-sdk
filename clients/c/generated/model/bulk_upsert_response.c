#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "bulk_upsert_response.h"



bulk_upsert_response_t *bulk_upsert_response_create(
    char *request_id
    ) {
    bulk_upsert_response_t *bulk_upsert_response_local_var = malloc(sizeof(bulk_upsert_response_t));
    if (!bulk_upsert_response_local_var) {
        return NULL;
    }
    bulk_upsert_response_local_var->request_id = request_id;

    return bulk_upsert_response_local_var;
}


void bulk_upsert_response_free(bulk_upsert_response_t *bulk_upsert_response) {
    if(NULL == bulk_upsert_response){
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

    // bulk_upsert_response->request_id
    cJSON *request_id = cJSON_GetObjectItemCaseSensitive(bulk_upsert_responseJSON, "request_id");
    if (request_id) { 
    if(!cJSON_IsString(request_id) && !cJSON_IsNull(request_id))
    {
    goto end; //String
    }
    }


    bulk_upsert_response_local_var = bulk_upsert_response_create (
        request_id && !cJSON_IsNull(request_id) ? strdup(request_id->valuestring) : NULL
        );

    return bulk_upsert_response_local_var;
end:
    return NULL;

}
