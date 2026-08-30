#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pin_media_metadata.h"


char* pin_media_metadata_item_type_ToString(pinterest_rest_api_pin_media_metadata_ITEMTYPE_e item_type) {
    char* item_typeArray[] =  { "NULL", "video" };
    return item_typeArray[item_type];
}

pinterest_rest_api_pin_media_metadata_ITEMTYPE_e pin_media_metadata_item_type_FromString(char* item_type){
    int stringToReturn = 0;
    char *item_typeArray[] =  { "NULL", "video" };
    size_t sizeofArray = sizeof(item_typeArray) / sizeof(item_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(item_type, item_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static pin_media_metadata_t *pin_media_metadata_create_internal(
    char *description,
    image_size_t *images,
    pinterest_rest_api_pin_media_metadata_ITEMTYPE_e item_type,
    char *link,
    char *title,
    char *cover_image_url,
    double *duration,
    int *height,
    char *video_url,
    char *video_url_hls,
    int *width
    ) {
    pin_media_metadata_t *pin_media_metadata_local_var = malloc(sizeof(pin_media_metadata_t));
    if (!pin_media_metadata_local_var) {
        return NULL;
    }
    memset(pin_media_metadata_local_var, 0, sizeof(pin_media_metadata_t));
    pin_media_metadata_local_var->_library_owned = 1;
    pin_media_metadata_local_var->description = description;
    pin_media_metadata_local_var->images = images;
    pin_media_metadata_local_var->item_type = item_type;
    pin_media_metadata_local_var->link = link;
    pin_media_metadata_local_var->title = title;
    pin_media_metadata_local_var->cover_image_url = cover_image_url;
    pin_media_metadata_local_var->duration = duration;
    pin_media_metadata_local_var->height = height;
    pin_media_metadata_local_var->video_url = video_url;
    pin_media_metadata_local_var->video_url_hls = video_url_hls;
    pin_media_metadata_local_var->width = width;
    return pin_media_metadata_local_var;
}

__attribute__((deprecated)) pin_media_metadata_t *pin_media_metadata_create(
    char *description,
    image_size_t *images,
    pinterest_rest_api_pin_media_metadata_ITEMTYPE_e item_type,
    char *link,
    char *title,
    char *cover_image_url,
    double *duration,
    int *height,
    char *video_url,
    char *video_url_hls,
    int *width
    ) {
    double *duration_copy = NULL;
    if (duration) {
        duration_copy = malloc(sizeof(double));
        if (duration_copy) *duration_copy = *duration;
    }
    int *height_copy = NULL;
    if (height) {
        height_copy = malloc(sizeof(int));
        if (height_copy) *height_copy = *height;
    }
    int *width_copy = NULL;
    if (width) {
        width_copy = malloc(sizeof(int));
        if (width_copy) *width_copy = *width;
    }
    pin_media_metadata_t *result = pin_media_metadata_create_internal (
        description,
        images,
        item_type,
        link,
        title,
        cover_image_url,
        duration_copy,
        height_copy,
        video_url,
        video_url_hls,
        width_copy
        );
    if (!result) {
        free(duration_copy);
        free(height_copy);
        free(width_copy);
    }
    return result;
}

void pin_media_metadata_free(pin_media_metadata_t *pin_media_metadata) {
    if(NULL == pin_media_metadata){
        return ;
    }
    if(pin_media_metadata->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pin_media_metadata_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pin_media_metadata->description) {
        free(pin_media_metadata->description);
        pin_media_metadata->description = NULL;
    }
    if (pin_media_metadata->images) {
        image_size_free(pin_media_metadata->images);
        pin_media_metadata->images = NULL;
    }
    if (pin_media_metadata->link) {
        free(pin_media_metadata->link);
        pin_media_metadata->link = NULL;
    }
    if (pin_media_metadata->title) {
        free(pin_media_metadata->title);
        pin_media_metadata->title = NULL;
    }
    if (pin_media_metadata->cover_image_url) {
        free(pin_media_metadata->cover_image_url);
        pin_media_metadata->cover_image_url = NULL;
    }
    if (pin_media_metadata->duration) {
        free(pin_media_metadata->duration);
        pin_media_metadata->duration = NULL;
    }
    if (pin_media_metadata->height) {
        free(pin_media_metadata->height);
        pin_media_metadata->height = NULL;
    }
    if (pin_media_metadata->video_url) {
        free(pin_media_metadata->video_url);
        pin_media_metadata->video_url = NULL;
    }
    if (pin_media_metadata->video_url_hls) {
        free(pin_media_metadata->video_url_hls);
        pin_media_metadata->video_url_hls = NULL;
    }
    if (pin_media_metadata->width) {
        free(pin_media_metadata->width);
        pin_media_metadata->width = NULL;
    }
    free(pin_media_metadata);
}

cJSON *pin_media_metadata_convertToJSON(pin_media_metadata_t *pin_media_metadata) {
    cJSON *item = cJSON_CreateObject();

    // pin_media_metadata->description
    if(pin_media_metadata->description) {
    if(cJSON_AddStringToObject(item, "description", pin_media_metadata->description) == NULL) {
    goto fail; //String
    }
    }


    // pin_media_metadata->images
    if(pin_media_metadata->images) {
    cJSON *images_local_JSON = image_size_convertToJSON(pin_media_metadata->images);
    if(images_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "images", images_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // pin_media_metadata->item_type
    if (pinterest_rest_api_pin_media_metadata_ITEMTYPE_NULL == pin_media_metadata->item_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "item_type", pin_media_metadata_item_type_ToString(pin_media_metadata->item_type)) == NULL)
    {
    goto fail; //Enum
    }


    // pin_media_metadata->link
    if(pin_media_metadata->link) {
    if(cJSON_AddStringToObject(item, "link", pin_media_metadata->link) == NULL) {
    goto fail; //String
    }
    }


    // pin_media_metadata->title
    if(pin_media_metadata->title) {
    if(cJSON_AddStringToObject(item, "title", pin_media_metadata->title) == NULL) {
    goto fail; //String
    }
    }


    // pin_media_metadata->cover_image_url
    if(pin_media_metadata->cover_image_url) {
    if(cJSON_AddStringToObject(item, "cover_image_url", pin_media_metadata->cover_image_url) == NULL) {
    goto fail; //String
    }
    }


    // pin_media_metadata->duration
    if(pin_media_metadata->duration) {
    if(cJSON_AddNumberToObject(item, "duration", *pin_media_metadata->duration) == NULL) {
    goto fail; //Numeric
    }
    }


    // pin_media_metadata->height
    if(pin_media_metadata->height) {
    if(cJSON_AddNumberToObject(item, "height", *pin_media_metadata->height) == NULL) {
    goto fail; //Numeric
    }
    }


    // pin_media_metadata->video_url
    if(pin_media_metadata->video_url) {
    if(cJSON_AddStringToObject(item, "video_url", pin_media_metadata->video_url) == NULL) {
    goto fail; //String
    }
    }


    // pin_media_metadata->video_url_hls
    if(pin_media_metadata->video_url_hls) {
    if(cJSON_AddStringToObject(item, "video_url_hls", pin_media_metadata->video_url_hls) == NULL) {
    goto fail; //String
    }
    }


    // pin_media_metadata->width
    if(pin_media_metadata->width) {
    if(cJSON_AddNumberToObject(item, "width", *pin_media_metadata->width) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pin_media_metadata_t *pin_media_metadata_parseFromJSON(cJSON *pin_media_metadataJSON){

    pin_media_metadata_t *pin_media_metadata_local_var = NULL;

    char *description_local_str = NULL;

    // define the local variable for pin_media_metadata->images
    image_size_t *images_local_nonprim = NULL;

    char *link_local_str = NULL;

    char *title_local_str = NULL;

    char *cover_image_url_local_str = NULL;

    // define the local variable for pin_media_metadata->duration
    double *duration_local_var = NULL;

    // define the local variable for pin_media_metadata->height
    int *height_local_var = NULL;

    char *video_url_local_str = NULL;

    char *video_url_hls_local_str = NULL;

    // define the local variable for pin_media_metadata->width
    int *width_local_var = NULL;

    // pin_media_metadata->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(pin_media_metadataJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // pin_media_metadata->images
    cJSON *images = cJSON_GetObjectItemCaseSensitive(pin_media_metadataJSON, "images");
    if (cJSON_IsNull(images)) {
        images = NULL;
    }
    if (images) { 
    images_local_nonprim = image_size_parseFromJSON(images); //nonprimitive
    }

    // pin_media_metadata->item_type
    cJSON *item_type = cJSON_GetObjectItemCaseSensitive(pin_media_metadataJSON, "item_type");
    if (cJSON_IsNull(item_type)) {
        item_type = NULL;
    }
    if (!item_type) {
        goto end;
    }

    pinterest_rest_api_pin_media_metadata_ITEMTYPE_e item_typeVariable;
    
    if(!cJSON_IsString(item_type))
    {
    goto end; //Enum
    }
    item_typeVariable = pin_media_metadata_item_type_FromString(item_type->valuestring);

    // pin_media_metadata->link
    cJSON *link = cJSON_GetObjectItemCaseSensitive(pin_media_metadataJSON, "link");
    if (cJSON_IsNull(link)) {
        link = NULL;
    }
    if (link) { 
    if(!cJSON_IsString(link) && !cJSON_IsNull(link))
    {
    goto end; //String
    }
    }

    // pin_media_metadata->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(pin_media_metadataJSON, "title");
    if (cJSON_IsNull(title)) {
        title = NULL;
    }
    if (title) { 
    if(!cJSON_IsString(title) && !cJSON_IsNull(title))
    {
    goto end; //String
    }
    }

    // pin_media_metadata->cover_image_url
    cJSON *cover_image_url = cJSON_GetObjectItemCaseSensitive(pin_media_metadataJSON, "cover_image_url");
    if (cJSON_IsNull(cover_image_url)) {
        cover_image_url = NULL;
    }
    if (cover_image_url) { 
    if(!cJSON_IsString(cover_image_url) && !cJSON_IsNull(cover_image_url))
    {
    goto end; //String
    }
    }

    // pin_media_metadata->duration
    cJSON *duration = cJSON_GetObjectItemCaseSensitive(pin_media_metadataJSON, "duration");
    if (cJSON_IsNull(duration)) {
        duration = NULL;
    }
    if (duration) { 
    if(!cJSON_IsNumber(duration))
    {
    goto end; //Numeric
    }
    duration_local_var = malloc(sizeof(double));
    if(!duration_local_var)
    {
        goto end;
    }
    *duration_local_var = duration->valuedouble;
    }

    // pin_media_metadata->height
    cJSON *height = cJSON_GetObjectItemCaseSensitive(pin_media_metadataJSON, "height");
    if (cJSON_IsNull(height)) {
        height = NULL;
    }
    if (height) { 
    if(!cJSON_IsNumber(height))
    {
    goto end; //Numeric
    }
    height_local_var = malloc(sizeof(int));
    if(!height_local_var)
    {
        goto end;
    }
    *height_local_var = height->valuedouble;
    }

    // pin_media_metadata->video_url
    cJSON *video_url = cJSON_GetObjectItemCaseSensitive(pin_media_metadataJSON, "video_url");
    if (cJSON_IsNull(video_url)) {
        video_url = NULL;
    }
    if (video_url) { 
    if(!cJSON_IsString(video_url) && !cJSON_IsNull(video_url))
    {
    goto end; //String
    }
    }

    // pin_media_metadata->video_url_hls
    cJSON *video_url_hls = cJSON_GetObjectItemCaseSensitive(pin_media_metadataJSON, "video_url_hls");
    if (cJSON_IsNull(video_url_hls)) {
        video_url_hls = NULL;
    }
    if (video_url_hls) { 
    if(!cJSON_IsString(video_url_hls) && !cJSON_IsNull(video_url_hls))
    {
    goto end; //String
    }
    }

    // pin_media_metadata->width
    cJSON *width = cJSON_GetObjectItemCaseSensitive(pin_media_metadataJSON, "width");
    if (cJSON_IsNull(width)) {
        width = NULL;
    }
    if (width) { 
    if(!cJSON_IsNumber(width))
    {
    goto end; //Numeric
    }
    width_local_var = malloc(sizeof(int));
    if(!width_local_var)
    {
        goto end;
    }
    *width_local_var = width->valuedouble;
    }


    if (description && !cJSON_IsNull(description)) description_local_str = strdup(description->valuestring);
    if (link && !cJSON_IsNull(link)) link_local_str = strdup(link->valuestring);
    if (title && !cJSON_IsNull(title)) title_local_str = strdup(title->valuestring);
    if (cover_image_url && !cJSON_IsNull(cover_image_url)) cover_image_url_local_str = strdup(cover_image_url->valuestring);
    if (video_url && !cJSON_IsNull(video_url)) video_url_local_str = strdup(video_url->valuestring);
    if (video_url_hls && !cJSON_IsNull(video_url_hls)) video_url_hls_local_str = strdup(video_url_hls->valuestring);

    pin_media_metadata_local_var = pin_media_metadata_create_internal (
        description_local_str,
        images ? images_local_nonprim : NULL,
        item_typeVariable,
        link_local_str,
        title_local_str,
        cover_image_url_local_str,
        duration_local_var,
        height_local_var,
        video_url_local_str,
        video_url_hls_local_str,
        width_local_var
        );

    if (!pin_media_metadata_local_var) {
        goto end;
    }

    return pin_media_metadata_local_var;
end:
    if (description_local_str) {
        free(description_local_str);
        description_local_str = NULL;
    }
    if (images_local_nonprim) {
        image_size_free(images_local_nonprim);
        images_local_nonprim = NULL;
    }
    if (link_local_str) {
        free(link_local_str);
        link_local_str = NULL;
    }
    if (title_local_str) {
        free(title_local_str);
        title_local_str = NULL;
    }
    if (cover_image_url_local_str) {
        free(cover_image_url_local_str);
        cover_image_url_local_str = NULL;
    }
    if (duration_local_var) {
        free(duration_local_var);
        duration_local_var = NULL;
    }
    if (height_local_var) {
        free(height_local_var);
        height_local_var = NULL;
    }
    if (video_url_local_str) {
        free(video_url_local_str);
        video_url_local_str = NULL;
    }
    if (video_url_hls_local_str) {
        free(video_url_hls_local_str);
        video_url_hls_local_str = NULL;
    }
    if (width_local_var) {
        free(width_local_var);
        width_local_var = NULL;
    }
    return NULL;

}
