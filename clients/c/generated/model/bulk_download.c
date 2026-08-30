#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "bulk_download.h"



static bulk_download_t *bulk_download_create_internal(
    char *request_id
    ) {
    bulk_download_t *bulk_download_local_var = malloc(sizeof(bulk_download_t));
    if (!bulk_download_local_var) {
        return NULL;
    }
    memset(bulk_download_local_var, 0, sizeof(bulk_download_t));
    bulk_download_local_var->_library_owned = 1;
    bulk_download_local_var->request_id = request_id;
    return bulk_download_local_var;
}

__attribute__((deprecated)) bulk_download_t *bulk_download_create(
    char *request_id
    ) {
    bulk_download_t *result = bulk_download_create_internal (
        request_id
        );
    if (!result) {
    }
    return result;
}

void bulk_download_free(bulk_download_t *bulk_download) {
    if(NULL == bulk_download){
        return ;
    }
    if(bulk_download->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "bulk_download_free");
        return ;
    }
    listEntry_t *listEntry;
    if (bulk_download->request_id) {
        free(bulk_download->request_id);
        bulk_download->request_id = NULL;
    }
    free(bulk_download);
}

cJSON *bulk_download_convertToJSON(bulk_download_t *bulk_download) {
    cJSON *item = cJSON_CreateObject();

    // bulk_download->request_id
    if(bulk_download->request_id) {
    if(cJSON_AddStringToObject(item, "request_id", bulk_download->request_id) == NULL) {
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

bulk_download_t *bulk_download_parseFromJSON(cJSON *bulk_downloadJSON){

    bulk_download_t *bulk_download_local_var = NULL;

    char *request_id_local_str = NULL;

    // bulk_download->request_id
    cJSON *request_id = cJSON_GetObjectItemCaseSensitive(bulk_downloadJSON, "request_id");
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

    bulk_download_local_var = bulk_download_create_internal (
        request_id_local_str
        );

    if (!bulk_download_local_var) {
        goto end;
    }

    return bulk_download_local_var;
end:
    if (request_id_local_str) {
        free(request_id_local_str);
        request_id_local_str = NULL;
    }
    return NULL;

}
