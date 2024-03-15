#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "media_upload_details.h"



media_upload_details_t *media_upload_details_create(
    char *media_id,
    media_upload_type_t *media_type,
    media_upload_status_t *status
    ) {
    media_upload_details_t *media_upload_details_local_var = malloc(sizeof(media_upload_details_t));
    if (!media_upload_details_local_var) {
        return NULL;
    }
    media_upload_details_local_var->media_id = media_id;
    media_upload_details_local_var->media_type = media_type;
    media_upload_details_local_var->status = status;

    return media_upload_details_local_var;
}


void media_upload_details_free(media_upload_details_t *media_upload_details) {
    if(NULL == media_upload_details){
        return ;
    }
    listEntry_t *listEntry;
    if (media_upload_details->media_id) {
        free(media_upload_details->media_id);
        media_upload_details->media_id = NULL;
    }
    if (media_upload_details->media_type) {
        media_upload_type_free(media_upload_details->media_type);
        media_upload_details->media_type = NULL;
    }
    if (media_upload_details->status) {
        media_upload_status_free(media_upload_details->status);
        media_upload_details->status = NULL;
    }
    free(media_upload_details);
}

cJSON *media_upload_details_convertToJSON(media_upload_details_t *media_upload_details) {
    cJSON *item = cJSON_CreateObject();

    // media_upload_details->media_id
    if(media_upload_details->media_id) {
    if(cJSON_AddStringToObject(item, "media_id", media_upload_details->media_id) == NULL) {
    goto fail; //String
    }
    }


    // media_upload_details->media_type
    if(media_upload_details->media_type) {
    cJSON *media_type_local_JSON = media_upload_type_convertToJSON(media_upload_details->media_type);
    if(media_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "media_type", media_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // media_upload_details->status
    if(media_upload_details->status) {
    cJSON *status_local_JSON = media_upload_status_convertToJSON(media_upload_details->status);
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

media_upload_details_t *media_upload_details_parseFromJSON(cJSON *media_upload_detailsJSON){

    media_upload_details_t *media_upload_details_local_var = NULL;

    // define the local variable for media_upload_details->media_type
    media_upload_type_t *media_type_local_nonprim = NULL;

    // define the local variable for media_upload_details->status
    media_upload_status_t *status_local_nonprim = NULL;

    // media_upload_details->media_id
    cJSON *media_id = cJSON_GetObjectItemCaseSensitive(media_upload_detailsJSON, "media_id");
    if (media_id) { 
    if(!cJSON_IsString(media_id) && !cJSON_IsNull(media_id))
    {
    goto end; //String
    }
    }

    // media_upload_details->media_type
    cJSON *media_type = cJSON_GetObjectItemCaseSensitive(media_upload_detailsJSON, "media_type");
    if (media_type) { 
    media_type_local_nonprim = media_upload_type_parseFromJSON(media_type); //custom
    }

    // media_upload_details->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(media_upload_detailsJSON, "status");
    if (status) { 
    status_local_nonprim = media_upload_status_parseFromJSON(status); //custom
    }


    media_upload_details_local_var = media_upload_details_create (
        media_id && !cJSON_IsNull(media_id) ? strdup(media_id->valuestring) : NULL,
        media_type ? media_type_local_nonprim : NULL,
        status ? status_local_nonprim : NULL
        );

    return media_upload_details_local_var;
end:
    if (media_type_local_nonprim) {
        media_upload_type_free(media_type_local_nonprim);
        media_type_local_nonprim = NULL;
    }
    if (status_local_nonprim) {
        media_upload_status_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    return NULL;

}
