#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pin_media_metadata.h"



static pin_media_metadata_t *pin_media_metadata_create_internal(
    char *description,
    image_size_t *images,
    char *item_type,
    char *link,
    char *title,
    char *cover_image_url,
    double duration,
    int height,
    char *video_url,
    int width
    ) {
    pin_media_metadata_t *pin_media_metadata_local_var = malloc(sizeof(pin_media_metadata_t));
    if (!pin_media_metadata_local_var) {
        return NULL;
    }
    pin_media_metadata_local_var->description = description;
    pin_media_metadata_local_var->images = images;
    pin_media_metadata_local_var->item_type = item_type;
    pin_media_metadata_local_var->link = link;
    pin_media_metadata_local_var->title = title;
    pin_media_metadata_local_var->cover_image_url = cover_image_url;
    pin_media_metadata_local_var->duration = duration;
    pin_media_metadata_local_var->height = height;
    pin_media_metadata_local_var->video_url = video_url;
    pin_media_metadata_local_var->width = width;

    pin_media_metadata_local_var->_library_owned = 1;
    return pin_media_metadata_local_var;
}

__attribute__((deprecated)) pin_media_metadata_t *pin_media_metadata_create(
    char *description,
    image_size_t *images,
    char *item_type,
    char *link,
    char *title,
    char *cover_image_url,
    double duration,
    int height,
    char *video_url,
    int width
    ) {
    return pin_media_metadata_create_internal (
        description,
        images,
        item_type,
        link,
        title,
        cover_image_url,
        duration,
        height,
        video_url,
        width
        );
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
    if (pin_media_metadata->item_type) {
        free(pin_media_metadata->item_type);
        pin_media_metadata->item_type = NULL;
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
    if (pin_media_metadata->video_url) {
        free(pin_media_metadata->video_url);
        pin_media_metadata->video_url = NULL;
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
    if(pin_media_metadata->item_type) {
    if(cJSON_AddStringToObject(item, "item_type", pin_media_metadata->item_type) == NULL) {
    goto fail; //String
    }
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
    if(cJSON_AddNumberToObject(item, "duration", pin_media_metadata->duration) == NULL) {
    goto fail; //Numeric
    }
    }


    // pin_media_metadata->height
    if(pin_media_metadata->height) {
    if(cJSON_AddNumberToObject(item, "height", pin_media_metadata->height) == NULL) {
    goto fail; //Numeric
    }
    }


    // pin_media_metadata->video_url
    if(pin_media_metadata->video_url) {
    if(cJSON_AddStringToObject(item, "video_url", pin_media_metadata->video_url) == NULL) {
    goto fail; //String
    }
    }


    // pin_media_metadata->width
    if(pin_media_metadata->width) {
    if(cJSON_AddNumberToObject(item, "width", pin_media_metadata->width) == NULL) {
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

    // define the local variable for pin_media_metadata->images
    image_size_t *images_local_nonprim = NULL;

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
    if (item_type) { 
    if(!cJSON_IsString(item_type) && !cJSON_IsNull(item_type))
    {
    goto end; //String
    }
    }

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
    }


    pin_media_metadata_local_var = pin_media_metadata_create_internal (
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        images ? images_local_nonprim : NULL,
        item_type && !cJSON_IsNull(item_type) ? strdup(item_type->valuestring) : NULL,
        link && !cJSON_IsNull(link) ? strdup(link->valuestring) : NULL,
        title && !cJSON_IsNull(title) ? strdup(title->valuestring) : NULL,
        cover_image_url && !cJSON_IsNull(cover_image_url) ? strdup(cover_image_url->valuestring) : NULL,
        duration ? duration->valuedouble : 0,
        height ? height->valuedouble : 0,
        video_url && !cJSON_IsNull(video_url) ? strdup(video_url->valuestring) : NULL,
        width ? width->valuedouble : 0
        );

    return pin_media_metadata_local_var;
end:
    if (images_local_nonprim) {
        image_size_free(images_local_nonprim);
        images_local_nonprim = NULL;
    }
    return NULL;

}
