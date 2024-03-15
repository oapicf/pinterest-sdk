#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "media_upload.h"



media_upload_t *media_upload_create(
    char *media_id,
    media_upload_type_t *media_type,
    char *upload_url,
    media_upload_all_of_upload_parameters_t *upload_parameters
    ) {
    media_upload_t *media_upload_local_var = malloc(sizeof(media_upload_t));
    if (!media_upload_local_var) {
        return NULL;
    }
    media_upload_local_var->media_id = media_id;
    media_upload_local_var->media_type = media_type;
    media_upload_local_var->upload_url = upload_url;
    media_upload_local_var->upload_parameters = upload_parameters;

    return media_upload_local_var;
}


void media_upload_free(media_upload_t *media_upload) {
    if(NULL == media_upload){
        return ;
    }
    listEntry_t *listEntry;
    if (media_upload->media_id) {
        free(media_upload->media_id);
        media_upload->media_id = NULL;
    }
    if (media_upload->media_type) {
        media_upload_type_free(media_upload->media_type);
        media_upload->media_type = NULL;
    }
    if (media_upload->upload_url) {
        free(media_upload->upload_url);
        media_upload->upload_url = NULL;
    }
    if (media_upload->upload_parameters) {
        media_upload_all_of_upload_parameters_free(media_upload->upload_parameters);
        media_upload->upload_parameters = NULL;
    }
    free(media_upload);
}

cJSON *media_upload_convertToJSON(media_upload_t *media_upload) {
    cJSON *item = cJSON_CreateObject();

    // media_upload->media_id
    if(media_upload->media_id) {
    if(cJSON_AddStringToObject(item, "media_id", media_upload->media_id) == NULL) {
    goto fail; //String
    }
    }


    // media_upload->media_type
    if(media_upload->media_type) {
    cJSON *media_type_local_JSON = media_upload_type_convertToJSON(media_upload->media_type);
    if(media_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "media_type", media_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // media_upload->upload_url
    if(media_upload->upload_url) {
    if(cJSON_AddStringToObject(item, "upload_url", media_upload->upload_url) == NULL) {
    goto fail; //String
    }
    }


    // media_upload->upload_parameters
    if(media_upload->upload_parameters) {
    cJSON *upload_parameters_local_JSON = media_upload_all_of_upload_parameters_convertToJSON(media_upload->upload_parameters);
    if(upload_parameters_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "upload_parameters", upload_parameters_local_JSON);
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

media_upload_t *media_upload_parseFromJSON(cJSON *media_uploadJSON){

    media_upload_t *media_upload_local_var = NULL;

    // define the local variable for media_upload->media_type
    media_upload_type_t *media_type_local_nonprim = NULL;

    // define the local variable for media_upload->upload_parameters
    media_upload_all_of_upload_parameters_t *upload_parameters_local_nonprim = NULL;

    // media_upload->media_id
    cJSON *media_id = cJSON_GetObjectItemCaseSensitive(media_uploadJSON, "media_id");
    if (media_id) { 
    if(!cJSON_IsString(media_id) && !cJSON_IsNull(media_id))
    {
    goto end; //String
    }
    }

    // media_upload->media_type
    cJSON *media_type = cJSON_GetObjectItemCaseSensitive(media_uploadJSON, "media_type");
    if (media_type) { 
    media_type_local_nonprim = media_upload_type_parseFromJSON(media_type); //custom
    }

    // media_upload->upload_url
    cJSON *upload_url = cJSON_GetObjectItemCaseSensitive(media_uploadJSON, "upload_url");
    if (upload_url) { 
    if(!cJSON_IsString(upload_url) && !cJSON_IsNull(upload_url))
    {
    goto end; //String
    }
    }

    // media_upload->upload_parameters
    cJSON *upload_parameters = cJSON_GetObjectItemCaseSensitive(media_uploadJSON, "upload_parameters");
    if (upload_parameters) { 
    upload_parameters_local_nonprim = media_upload_all_of_upload_parameters_parseFromJSON(upload_parameters); //nonprimitive
    }


    media_upload_local_var = media_upload_create (
        media_id && !cJSON_IsNull(media_id) ? strdup(media_id->valuestring) : NULL,
        media_type ? media_type_local_nonprim : NULL,
        upload_url && !cJSON_IsNull(upload_url) ? strdup(upload_url->valuestring) : NULL,
        upload_parameters ? upload_parameters_local_nonprim : NULL
        );

    return media_upload_local_var;
end:
    if (media_type_local_nonprim) {
        media_upload_type_free(media_type_local_nonprim);
        media_type_local_nonprim = NULL;
    }
    if (upload_parameters_local_nonprim) {
        media_upload_all_of_upload_parameters_free(upload_parameters_local_nonprim);
        upload_parameters_local_nonprim = NULL;
    }
    return NULL;

}
