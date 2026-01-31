#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_preview_request.h"


char* ad_preview_request_creative_type_ToString(pinterest_rest_api_ad_preview_request_CREATIVETYPE_e creative_type) {
    char* creative_typeArray[] =  { "NULL", "SHOPPING", "CAROUSEL", "COLLECTION", "REGULAR" };
    return creative_typeArray[creative_type];
}

pinterest_rest_api_ad_preview_request_CREATIVETYPE_e ad_preview_request_creative_type_FromString(char* creative_type){
    int stringToReturn = 0;
    char *creative_typeArray[] =  { "NULL", "SHOPPING", "CAROUSEL", "COLLECTION", "REGULAR" };
    size_t sizeofArray = sizeof(creative_typeArray) / sizeof(creative_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(creative_type, creative_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* ad_preview_request_preferred_media_type_ToString(pinterest_rest_api_ad_preview_request_PREFERREDMEDIATYPE_e preferred_media_type) {
    char* preferred_media_typeArray[] =  { "NULL", "VIDEO", "IMAGE" };
    return preferred_media_typeArray[preferred_media_type];
}

pinterest_rest_api_ad_preview_request_PREFERREDMEDIATYPE_e ad_preview_request_preferred_media_type_FromString(char* preferred_media_type){
    int stringToReturn = 0;
    char *preferred_media_typeArray[] =  { "NULL", "VIDEO", "IMAGE" };
    size_t sizeofArray = sizeof(preferred_media_typeArray) / sizeof(preferred_media_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(preferred_media_type, preferred_media_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static ad_preview_request_t *ad_preview_request_create_internal(
    char *image_url,
    char *title,
    char *pin_id,
    char *catalog_product_group_id,
    pinterest_rest_api_ad_preview_request_CREATIVETYPE_e creative_type,
    customizable_cta_type_t *customizable_cta_type,
    char *hero_image_title,
    char *hero_image_url,
    char *hero_pin_id,
    char *image_tag,
    char *item_id,
    pinterest_rest_api_ad_preview_request_PREFERREDMEDIATYPE_e preferred_media_type,
    char *video_tag
    ) {
    ad_preview_request_t *ad_preview_request_local_var = malloc(sizeof(ad_preview_request_t));
    if (!ad_preview_request_local_var) {
        return NULL;
    }
    ad_preview_request_local_var->image_url = image_url;
    ad_preview_request_local_var->title = title;
    ad_preview_request_local_var->pin_id = pin_id;
    ad_preview_request_local_var->catalog_product_group_id = catalog_product_group_id;
    ad_preview_request_local_var->creative_type = creative_type;
    ad_preview_request_local_var->customizable_cta_type = customizable_cta_type;
    ad_preview_request_local_var->hero_image_title = hero_image_title;
    ad_preview_request_local_var->hero_image_url = hero_image_url;
    ad_preview_request_local_var->hero_pin_id = hero_pin_id;
    ad_preview_request_local_var->image_tag = image_tag;
    ad_preview_request_local_var->item_id = item_id;
    ad_preview_request_local_var->preferred_media_type = preferred_media_type;
    ad_preview_request_local_var->video_tag = video_tag;

    ad_preview_request_local_var->_library_owned = 1;
    return ad_preview_request_local_var;
}

__attribute__((deprecated)) ad_preview_request_t *ad_preview_request_create(
    char *image_url,
    char *title,
    char *pin_id,
    char *catalog_product_group_id,
    pinterest_rest_api_ad_preview_request_CREATIVETYPE_e creative_type,
    customizable_cta_type_t *customizable_cta_type,
    char *hero_image_title,
    char *hero_image_url,
    char *hero_pin_id,
    char *image_tag,
    char *item_id,
    pinterest_rest_api_ad_preview_request_PREFERREDMEDIATYPE_e preferred_media_type,
    char *video_tag
    ) {
    return ad_preview_request_create_internal (
        image_url,
        title,
        pin_id,
        catalog_product_group_id,
        creative_type,
        customizable_cta_type,
        hero_image_title,
        hero_image_url,
        hero_pin_id,
        image_tag,
        item_id,
        preferred_media_type,
        video_tag
        );
}

void ad_preview_request_free(ad_preview_request_t *ad_preview_request) {
    if(NULL == ad_preview_request){
        return ;
    }
    if(ad_preview_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ad_preview_request_free");
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
    if (ad_preview_request->catalog_product_group_id) {
        free(ad_preview_request->catalog_product_group_id);
        ad_preview_request->catalog_product_group_id = NULL;
    }
    if (ad_preview_request->customizable_cta_type) {
        customizable_cta_type_free(ad_preview_request->customizable_cta_type);
        ad_preview_request->customizable_cta_type = NULL;
    }
    if (ad_preview_request->hero_image_title) {
        free(ad_preview_request->hero_image_title);
        ad_preview_request->hero_image_title = NULL;
    }
    if (ad_preview_request->hero_image_url) {
        free(ad_preview_request->hero_image_url);
        ad_preview_request->hero_image_url = NULL;
    }
    if (ad_preview_request->hero_pin_id) {
        free(ad_preview_request->hero_pin_id);
        ad_preview_request->hero_pin_id = NULL;
    }
    if (ad_preview_request->image_tag) {
        free(ad_preview_request->image_tag);
        ad_preview_request->image_tag = NULL;
    }
    if (ad_preview_request->item_id) {
        free(ad_preview_request->item_id);
        ad_preview_request->item_id = NULL;
    }
    if (ad_preview_request->video_tag) {
        free(ad_preview_request->video_tag);
        ad_preview_request->video_tag = NULL;
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


    // ad_preview_request->catalog_product_group_id
    if (!ad_preview_request->catalog_product_group_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_product_group_id", ad_preview_request->catalog_product_group_id) == NULL) {
    goto fail; //String
    }


    // ad_preview_request->creative_type
    if (pinterest_rest_api_ad_preview_request_CREATIVETYPE_NULL == ad_preview_request->creative_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "creative_type", ad_preview_request_creative_type_ToString(ad_preview_request->creative_type)) == NULL)
    {
    goto fail; //Enum
    }


    // ad_preview_request->customizable_cta_type
    if(ad_preview_request->customizable_cta_type) {
    cJSON *customizable_cta_type_local_JSON = customizable_cta_type_convertToJSON(ad_preview_request->customizable_cta_type);
    if(customizable_cta_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "customizable_cta_type", customizable_cta_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_preview_request->hero_image_title
    if(ad_preview_request->hero_image_title) {
    if(cJSON_AddStringToObject(item, "hero_image_title", ad_preview_request->hero_image_title) == NULL) {
    goto fail; //String
    }
    }


    // ad_preview_request->hero_image_url
    if(ad_preview_request->hero_image_url) {
    if(cJSON_AddStringToObject(item, "hero_image_url", ad_preview_request->hero_image_url) == NULL) {
    goto fail; //String
    }
    }


    // ad_preview_request->hero_pin_id
    if(ad_preview_request->hero_pin_id) {
    if(cJSON_AddStringToObject(item, "hero_pin_id", ad_preview_request->hero_pin_id) == NULL) {
    goto fail; //String
    }
    }


    // ad_preview_request->image_tag
    if(ad_preview_request->image_tag) {
    if(cJSON_AddStringToObject(item, "image_tag", ad_preview_request->image_tag) == NULL) {
    goto fail; //String
    }
    }


    // ad_preview_request->item_id
    if(ad_preview_request->item_id) {
    if(cJSON_AddStringToObject(item, "item_id", ad_preview_request->item_id) == NULL) {
    goto fail; //String
    }
    }


    // ad_preview_request->preferred_media_type
    if(ad_preview_request->preferred_media_type != pinterest_rest_api_ad_preview_request_PREFERREDMEDIATYPE_NULL) {
    if(cJSON_AddStringToObject(item, "preferred_media_type", ad_preview_request_preferred_media_type_ToString(ad_preview_request->preferred_media_type)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // ad_preview_request->video_tag
    if(ad_preview_request->video_tag) {
    if(cJSON_AddStringToObject(item, "video_tag", ad_preview_request->video_tag) == NULL) {
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

ad_preview_request_t *ad_preview_request_parseFromJSON(cJSON *ad_preview_requestJSON){

    ad_preview_request_t *ad_preview_request_local_var = NULL;

    // define the local variable for ad_preview_request->customizable_cta_type
    customizable_cta_type_t *customizable_cta_type_local_nonprim = NULL;

    // ad_preview_request->image_url
    cJSON *image_url = cJSON_GetObjectItemCaseSensitive(ad_preview_requestJSON, "image_url");
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

    // ad_preview_request->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(ad_preview_requestJSON, "title");
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

    // ad_preview_request->pin_id
    cJSON *pin_id = cJSON_GetObjectItemCaseSensitive(ad_preview_requestJSON, "pin_id");
    if (cJSON_IsNull(pin_id)) {
        pin_id = NULL;
    }
    if (!pin_id) {
        goto end;
    }

    
    if(!cJSON_IsString(pin_id))
    {
    goto end; //String
    }

    // ad_preview_request->catalog_product_group_id
    cJSON *catalog_product_group_id = cJSON_GetObjectItemCaseSensitive(ad_preview_requestJSON, "catalog_product_group_id");
    if (cJSON_IsNull(catalog_product_group_id)) {
        catalog_product_group_id = NULL;
    }
    if (!catalog_product_group_id) {
        goto end;
    }

    
    if(!cJSON_IsString(catalog_product_group_id))
    {
    goto end; //String
    }

    // ad_preview_request->creative_type
    cJSON *creative_type = cJSON_GetObjectItemCaseSensitive(ad_preview_requestJSON, "creative_type");
    if (cJSON_IsNull(creative_type)) {
        creative_type = NULL;
    }
    if (!creative_type) {
        goto end;
    }

    pinterest_rest_api_ad_preview_request_CREATIVETYPE_e creative_typeVariable;
    
    if(!cJSON_IsString(creative_type))
    {
    goto end; //Enum
    }
    creative_typeVariable = ad_preview_request_creative_type_FromString(creative_type->valuestring);

    // ad_preview_request->customizable_cta_type
    cJSON *customizable_cta_type = cJSON_GetObjectItemCaseSensitive(ad_preview_requestJSON, "customizable_cta_type");
    if (cJSON_IsNull(customizable_cta_type)) {
        customizable_cta_type = NULL;
    }
    if (customizable_cta_type) { 
    customizable_cta_type_local_nonprim = customizable_cta_type_parseFromJSON(customizable_cta_type); //custom
    }

    // ad_preview_request->hero_image_title
    cJSON *hero_image_title = cJSON_GetObjectItemCaseSensitive(ad_preview_requestJSON, "hero_image_title");
    if (cJSON_IsNull(hero_image_title)) {
        hero_image_title = NULL;
    }
    if (hero_image_title) { 
    if(!cJSON_IsString(hero_image_title) && !cJSON_IsNull(hero_image_title))
    {
    goto end; //String
    }
    }

    // ad_preview_request->hero_image_url
    cJSON *hero_image_url = cJSON_GetObjectItemCaseSensitive(ad_preview_requestJSON, "hero_image_url");
    if (cJSON_IsNull(hero_image_url)) {
        hero_image_url = NULL;
    }
    if (hero_image_url) { 
    if(!cJSON_IsString(hero_image_url) && !cJSON_IsNull(hero_image_url))
    {
    goto end; //String
    }
    }

    // ad_preview_request->hero_pin_id
    cJSON *hero_pin_id = cJSON_GetObjectItemCaseSensitive(ad_preview_requestJSON, "hero_pin_id");
    if (cJSON_IsNull(hero_pin_id)) {
        hero_pin_id = NULL;
    }
    if (hero_pin_id) { 
    if(!cJSON_IsString(hero_pin_id) && !cJSON_IsNull(hero_pin_id))
    {
    goto end; //String
    }
    }

    // ad_preview_request->image_tag
    cJSON *image_tag = cJSON_GetObjectItemCaseSensitive(ad_preview_requestJSON, "image_tag");
    if (cJSON_IsNull(image_tag)) {
        image_tag = NULL;
    }
    if (image_tag) { 
    if(!cJSON_IsString(image_tag) && !cJSON_IsNull(image_tag))
    {
    goto end; //String
    }
    }

    // ad_preview_request->item_id
    cJSON *item_id = cJSON_GetObjectItemCaseSensitive(ad_preview_requestJSON, "item_id");
    if (cJSON_IsNull(item_id)) {
        item_id = NULL;
    }
    if (item_id) { 
    if(!cJSON_IsString(item_id) && !cJSON_IsNull(item_id))
    {
    goto end; //String
    }
    }

    // ad_preview_request->preferred_media_type
    cJSON *preferred_media_type = cJSON_GetObjectItemCaseSensitive(ad_preview_requestJSON, "preferred_media_type");
    if (cJSON_IsNull(preferred_media_type)) {
        preferred_media_type = NULL;
    }
    pinterest_rest_api_ad_preview_request_PREFERREDMEDIATYPE_e preferred_media_typeVariable;
    if (preferred_media_type) { 
    if(!cJSON_IsString(preferred_media_type))
    {
    goto end; //Enum
    }
    preferred_media_typeVariable = ad_preview_request_preferred_media_type_FromString(preferred_media_type->valuestring);
    }

    // ad_preview_request->video_tag
    cJSON *video_tag = cJSON_GetObjectItemCaseSensitive(ad_preview_requestJSON, "video_tag");
    if (cJSON_IsNull(video_tag)) {
        video_tag = NULL;
    }
    if (video_tag) { 
    if(!cJSON_IsString(video_tag) && !cJSON_IsNull(video_tag))
    {
    goto end; //String
    }
    }


    ad_preview_request_local_var = ad_preview_request_create_internal (
        strdup(image_url->valuestring),
        strdup(title->valuestring),
        strdup(pin_id->valuestring),
        strdup(catalog_product_group_id->valuestring),
        creative_typeVariable,
        customizable_cta_type ? customizable_cta_type_local_nonprim : NULL,
        hero_image_title && !cJSON_IsNull(hero_image_title) ? strdup(hero_image_title->valuestring) : NULL,
        hero_image_url && !cJSON_IsNull(hero_image_url) ? strdup(hero_image_url->valuestring) : NULL,
        hero_pin_id && !cJSON_IsNull(hero_pin_id) ? strdup(hero_pin_id->valuestring) : NULL,
        image_tag && !cJSON_IsNull(image_tag) ? strdup(image_tag->valuestring) : NULL,
        item_id && !cJSON_IsNull(item_id) ? strdup(item_id->valuestring) : NULL,
        preferred_media_type ? preferred_media_typeVariable : pinterest_rest_api_ad_preview_request_PREFERREDMEDIATYPE_NULL,
        video_tag && !cJSON_IsNull(video_tag) ? strdup(video_tag->valuestring) : NULL
        );

    return ad_preview_request_local_var;
end:
    if (customizable_cta_type_local_nonprim) {
        customizable_cta_type_free(customizable_cta_type_local_nonprim);
        customizable_cta_type_local_nonprim = NULL;
    }
    return NULL;

}
