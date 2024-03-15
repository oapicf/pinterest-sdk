#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "media_upload_request.h"



media_upload_request_t *media_upload_request_create(
    media_upload_type_t *media_type
    ) {
    media_upload_request_t *media_upload_request_local_var = malloc(sizeof(media_upload_request_t));
    if (!media_upload_request_local_var) {
        return NULL;
    }
    media_upload_request_local_var->media_type = media_type;

    return media_upload_request_local_var;
}


void media_upload_request_free(media_upload_request_t *media_upload_request) {
    if(NULL == media_upload_request){
        return ;
    }
    listEntry_t *listEntry;
    if (media_upload_request->media_type) {
        media_upload_type_free(media_upload_request->media_type);
        media_upload_request->media_type = NULL;
    }
    free(media_upload_request);
}

cJSON *media_upload_request_convertToJSON(media_upload_request_t *media_upload_request) {
    cJSON *item = cJSON_CreateObject();

    // media_upload_request->media_type
    if (!media_upload_request->media_type) {
        goto fail;
    }
    cJSON *media_type_local_JSON = media_upload_type_convertToJSON(media_upload_request->media_type);
    if(media_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "media_type", media_type_local_JSON);
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

media_upload_request_t *media_upload_request_parseFromJSON(cJSON *media_upload_requestJSON){

    media_upload_request_t *media_upload_request_local_var = NULL;

    // define the local variable for media_upload_request->media_type
    media_upload_type_t *media_type_local_nonprim = NULL;

    // media_upload_request->media_type
    cJSON *media_type = cJSON_GetObjectItemCaseSensitive(media_upload_requestJSON, "media_type");
    if (!media_type) {
        goto end;
    }

    
    media_type_local_nonprim = media_upload_type_parseFromJSON(media_type); //custom


    media_upload_request_local_var = media_upload_request_create (
        media_type_local_nonprim
        );

    return media_upload_request_local_var;
end:
    if (media_type_local_nonprim) {
        media_upload_type_free(media_type_local_nonprim);
        media_type_local_nonprim = NULL;
    }
    return NULL;

}
