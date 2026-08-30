#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_preview_source_image.h"



static ad_preview_source_image_t *ad_preview_source_image_create_internal(
    char *image_url,
    char *promotion_id,
    char *title
    ) {
    ad_preview_source_image_t *ad_preview_source_image_local_var = malloc(sizeof(ad_preview_source_image_t));
    if (!ad_preview_source_image_local_var) {
        return NULL;
    }
    memset(ad_preview_source_image_local_var, 0, sizeof(ad_preview_source_image_t));
    ad_preview_source_image_local_var->_library_owned = 1;
    ad_preview_source_image_local_var->image_url = image_url;
    ad_preview_source_image_local_var->promotion_id = promotion_id;
    ad_preview_source_image_local_var->title = title;
    return ad_preview_source_image_local_var;
}

__attribute__((deprecated)) ad_preview_source_image_t *ad_preview_source_image_create(
    char *image_url,
    char *promotion_id,
    char *title
    ) {
    ad_preview_source_image_t *result = ad_preview_source_image_create_internal (
        image_url,
        promotion_id,
        title
        );
    if (!result) {
    }
    return result;
}

void ad_preview_source_image_free(ad_preview_source_image_t *ad_preview_source_image) {
    if(NULL == ad_preview_source_image){
        return ;
    }
    if(ad_preview_source_image->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ad_preview_source_image_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ad_preview_source_image->image_url) {
        free(ad_preview_source_image->image_url);
        ad_preview_source_image->image_url = NULL;
    }
    if (ad_preview_source_image->promotion_id) {
        free(ad_preview_source_image->promotion_id);
        ad_preview_source_image->promotion_id = NULL;
    }
    if (ad_preview_source_image->title) {
        free(ad_preview_source_image->title);
        ad_preview_source_image->title = NULL;
    }
    free(ad_preview_source_image);
}

cJSON *ad_preview_source_image_convertToJSON(ad_preview_source_image_t *ad_preview_source_image) {
    cJSON *item = cJSON_CreateObject();

    // ad_preview_source_image->image_url
    if (!ad_preview_source_image->image_url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "image_url", ad_preview_source_image->image_url) == NULL) {
    goto fail; //String
    }


    // ad_preview_source_image->promotion_id
    if(ad_preview_source_image->promotion_id) {
    if(cJSON_AddStringToObject(item, "promotion_id", ad_preview_source_image->promotion_id) == NULL) {
    goto fail; //String
    }
    }


    // ad_preview_source_image->title
    if (!ad_preview_source_image->title) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "title", ad_preview_source_image->title) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

ad_preview_source_image_t *ad_preview_source_image_parseFromJSON(cJSON *ad_preview_source_imageJSON){

    ad_preview_source_image_t *ad_preview_source_image_local_var = NULL;

    char *image_url_local_str = NULL;

    char *promotion_id_local_str = NULL;

    char *title_local_str = NULL;

    // ad_preview_source_image->image_url
    cJSON *image_url = cJSON_GetObjectItemCaseSensitive(ad_preview_source_imageJSON, "image_url");
    if (cJSON_IsNull(image_url)) {
        image_url = NULL;
    }
    if (!image_url) {
        goto end;
    }

    
    if(!cJSON_IsString(image_url))
    {
    goto end; //String
    }

    // ad_preview_source_image->promotion_id
    cJSON *promotion_id = cJSON_GetObjectItemCaseSensitive(ad_preview_source_imageJSON, "promotion_id");
    if (cJSON_IsNull(promotion_id)) {
        promotion_id = NULL;
    }
    if (promotion_id) { 
    if(!cJSON_IsString(promotion_id) && !cJSON_IsNull(promotion_id))
    {
    goto end; //String
    }
    }

    // ad_preview_source_image->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(ad_preview_source_imageJSON, "title");
    if (cJSON_IsNull(title)) {
        title = NULL;
    }
    if (!title) {
        goto end;
    }

    
    if(!cJSON_IsString(title))
    {
    goto end; //String
    }


    if (image_url && !cJSON_IsNull(image_url)) image_url_local_str = strdup(image_url->valuestring);
    if (promotion_id && !cJSON_IsNull(promotion_id)) promotion_id_local_str = strdup(promotion_id->valuestring);
    if (title && !cJSON_IsNull(title)) title_local_str = strdup(title->valuestring);

    ad_preview_source_image_local_var = ad_preview_source_image_create_internal (
        image_url_local_str,
        promotion_id_local_str,
        title_local_str
        );

    if (!ad_preview_source_image_local_var) {
        goto end;
    }

    return ad_preview_source_image_local_var;
end:
    if (image_url_local_str) {
        free(image_url_local_str);
        image_url_local_str = NULL;
    }
    if (promotion_id_local_str) {
        free(promotion_id_local_str);
        promotion_id_local_str = NULL;
    }
    if (title_local_str) {
        free(title_local_str);
        title_local_str = NULL;
    }
    return NULL;

}
