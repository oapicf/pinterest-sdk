#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_preview_create_from_image.h"



ad_preview_create_from_image_t *ad_preview_create_from_image_create(
    char *image_url,
    char *title
    ) {
    ad_preview_create_from_image_t *ad_preview_create_from_image_local_var = malloc(sizeof(ad_preview_create_from_image_t));
    if (!ad_preview_create_from_image_local_var) {
        return NULL;
    }
    ad_preview_create_from_image_local_var->image_url = image_url;
    ad_preview_create_from_image_local_var->title = title;

    return ad_preview_create_from_image_local_var;
}


void ad_preview_create_from_image_free(ad_preview_create_from_image_t *ad_preview_create_from_image) {
    if(NULL == ad_preview_create_from_image){
        return ;
    }
    listEntry_t *listEntry;
    if (ad_preview_create_from_image->image_url) {
        free(ad_preview_create_from_image->image_url);
        ad_preview_create_from_image->image_url = NULL;
    }
    if (ad_preview_create_from_image->title) {
        free(ad_preview_create_from_image->title);
        ad_preview_create_from_image->title = NULL;
    }
    free(ad_preview_create_from_image);
}

cJSON *ad_preview_create_from_image_convertToJSON(ad_preview_create_from_image_t *ad_preview_create_from_image) {
    cJSON *item = cJSON_CreateObject();

    // ad_preview_create_from_image->image_url
    if (!ad_preview_create_from_image->image_url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "image_url", ad_preview_create_from_image->image_url) == NULL) {
    goto fail; //String
    }


    // ad_preview_create_from_image->title
    if (!ad_preview_create_from_image->title) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "title", ad_preview_create_from_image->title) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

ad_preview_create_from_image_t *ad_preview_create_from_image_parseFromJSON(cJSON *ad_preview_create_from_imageJSON){

    ad_preview_create_from_image_t *ad_preview_create_from_image_local_var = NULL;

    // ad_preview_create_from_image->image_url
    cJSON *image_url = cJSON_GetObjectItemCaseSensitive(ad_preview_create_from_imageJSON, "image_url");
    if (!image_url) {
        goto end;
    }

    
    if(!cJSON_IsString(image_url))
    {
    goto end; //String
    }

    // ad_preview_create_from_image->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(ad_preview_create_from_imageJSON, "title");
    if (!title) {
        goto end;
    }

    
    if(!cJSON_IsString(title))
    {
    goto end; //String
    }


    ad_preview_create_from_image_local_var = ad_preview_create_from_image_create (
        strdup(image_url->valuestring),
        strdup(title->valuestring)
        );

    return ad_preview_create_from_image_local_var;
end:
    return NULL;

}
