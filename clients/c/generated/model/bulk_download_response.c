#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "bulk_download_response.h"



bulk_download_response_t *bulk_download_response_create(
    char *request_id
    ) {
    bulk_download_response_t *bulk_download_response_local_var = malloc(sizeof(bulk_download_response_t));
    if (!bulk_download_response_local_var) {
        return NULL;
    }
    bulk_download_response_local_var->request_id = request_id;

    return bulk_download_response_local_var;
}


void bulk_download_response_free(bulk_download_response_t *bulk_download_response) {
    if(NULL == bulk_download_response){
        return ;
    }
    listEntry_t *listEntry;
    if (bulk_download_response->request_id) {
        free(bulk_download_response->request_id);
        bulk_download_response->request_id = NULL;
    }
    free(bulk_download_response);
}

cJSON *bulk_download_response_convertToJSON(bulk_download_response_t *bulk_download_response) {
    cJSON *item = cJSON_CreateObject();

    // bulk_download_response->request_id
    if(bulk_download_response->request_id) {
    if(cJSON_AddStringToObject(item, "request_id", bulk_download_response->request_id) == NULL) {
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

bulk_download_response_t *bulk_download_response_parseFromJSON(cJSON *bulk_download_responseJSON){

    bulk_download_response_t *bulk_download_response_local_var = NULL;

    // bulk_download_response->request_id
    cJSON *request_id = cJSON_GetObjectItemCaseSensitive(bulk_download_responseJSON, "request_id");
    if (request_id) { 
    if(!cJSON_IsString(request_id) && !cJSON_IsNull(request_id))
    {
    goto end; //String
    }
    }


    bulk_download_response_local_var = bulk_download_response_create (
        request_id && !cJSON_IsNull(request_id) ? strdup(request_id->valuestring) : NULL
        );

    return bulk_download_response_local_var;
end:
    return NULL;

}
