#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_preview_request.h"



ad_preview_request_t *ad_preview_request_create(
    char *image_url,
    char *title,
    char *pin_id
    ) {
    ad_preview_request_t *ad_preview_request_local_var = malloc(sizeof(ad_preview_request_t));
    if (!ad_preview_request_local_var) {
        return NULL;
    }
    ad_preview_request_local_var->image_url = image_url;
    ad_preview_request_local_var->title = title;
    ad_preview_request_local_var->pin_id = pin_id;

    return ad_preview_request_local_var;
}


void ad_preview_request_free(ad_preview_request_t *ad_preview_request) {
    if(NULL == ad_preview_request){
        return ;
    }
    listEntry_t *listEntry;
    if (ad_preview_request->image_url) {
        free(ad_preview_request->image_url);
        ad_preview_request->image_url = NULL;
    }
    if (ad_preview_request->title) {
        free(ad_preview_request->title);
        ad_preview_request->title = NULL;
    }
    if (ad_preview_request->pin_id) {
        free(ad_preview_request->pin_id);
        ad_preview_request->pin_id = NULL;
    }
    free(ad_preview_request);
}

cJSON *ad_preview_request_convertToJSON(ad_preview_request_t *ad_preview_request) {
    cJSON *item = cJSON_CreateObject();

    // ad_preview_request->image_url
    if (!ad_preview_request->image_url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "image_url", ad_preview_request->image_url) == NULL) {
    goto fail; //String
    }


    // ad_preview_request->title
    if (!ad_preview_request->title) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "title", ad_preview_request->title) == NULL) {
    goto fail; //String
    }


    // ad_preview_request->pin_id
    if (!ad_preview_request->pin_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "pin_id", ad_preview_request->pin_id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

ad_preview_request_t *ad_preview_request_parseFromJSON(cJSON *ad_preview_requestJSON){

    ad_preview_request_t *ad_preview_request_local_var = NULL;

    // ad_preview_request->image_url
    cJSON *image_url = cJSON_GetObjectItemCaseSensitive(ad_preview_requestJSON, "image_url");
    if (!image_url) {
        goto end;
    }

    
    if(!cJSON_IsString(image_url))
    {
    goto end; //String
    }

    // ad_preview_request->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(ad_preview_requestJSON, "title");
    if (!title) {
        goto end;
    }

    
    if(!cJSON_IsString(title))
    {
    goto end; //String
    }

    // ad_preview_request->pin_id
    cJSON *pin_id = cJSON_GetObjectItemCaseSensitive(ad_preview_requestJSON, "pin_id");
    if (!pin_id) {
        goto end;
    }

    
    if(!cJSON_IsString(pin_id))
    {
    goto end; //String
    }


    ad_preview_request_local_var = ad_preview_request_create (
        strdup(image_url->valuestring),
        strdup(title->valuestring),
        strdup(pin_id->valuestring)
        );

    return ad_preview_request_local_var;
end:
    return NULL;

}
