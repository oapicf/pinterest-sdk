#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pin_media.h"


char* pin_media_media_type_ToString(pinterest_rest_api_pin_media_MEDIATYPE_e media_type) {
    char* media_typeArray[] =  { "NULL", "multiple_mixed" };
    return media_typeArray[media_type];
}

pinterest_rest_api_pin_media_MEDIATYPE_e pin_media_media_type_FromString(char* media_type){
    int stringToReturn = 0;
    char *media_typeArray[] =  { "NULL", "multiple_mixed" };
    size_t sizeofArray = sizeof(media_typeArray) / sizeof(media_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(media_type, media_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static pin_media_t *pin_media_create_internal(
    image_size_t *images,
    pinterest_rest_api_pin_media_MEDIATYPE_e media_type,
    char *cover_image_url,
    double duration,
    int height,
    char *video_url,
    int width,
    list_t *items
    ) {
    pin_media_t *pin_media_local_var = malloc(sizeof(pin_media_t));
    if (!pin_media_local_var) {
        return NULL;
    }
    pin_media_local_var->images = images;
    pin_media_local_var->media_type = media_type;
    pin_media_local_var->cover_image_url = cover_image_url;
    pin_media_local_var->duration = duration;
    pin_media_local_var->height = height;
    pin_media_local_var->video_url = video_url;
    pin_media_local_var->width = width;
    pin_media_local_var->items = items;

    pin_media_local_var->_library_owned = 1;
    return pin_media_local_var;
}

__attribute__((deprecated)) pin_media_t *pin_media_create(
    image_size_t *images,
    pinterest_rest_api_pin_media_MEDIATYPE_e media_type,
    char *cover_image_url,
    double duration,
    int height,
    char *video_url,
    int width,
    list_t *items
    ) {
    return pin_media_create_internal (
        images,
        media_type,
        cover_image_url,
        duration,
        height,
        video_url,
        width,
        items
        );
}

void pin_media_free(pin_media_t *pin_media) {
    if(NULL == pin_media){
        return ;
    }
    if(pin_media->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pin_media_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pin_media->images) {
        image_size_free(pin_media->images);
        pin_media->images = NULL;
    }
    if (pin_media->cover_image_url) {
        free(pin_media->cover_image_url);
        pin_media->cover_image_url = NULL;
    }
    if (pin_media->video_url) {
        free(pin_media->video_url);
        pin_media->video_url = NULL;
    }
    if (pin_media->items) {
        list_ForEach(listEntry, pin_media->items) {
            pin_media_metadata_free(listEntry->data);
        }
        list_freeList(pin_media->items);
        pin_media->items = NULL;
    }
    free(pin_media);
}

cJSON *pin_media_convertToJSON(pin_media_t *pin_media) {
    cJSON *item = cJSON_CreateObject();

    // pin_media->images
    if(pin_media->images) {
    cJSON *images_local_JSON = image_size_convertToJSON(pin_media->images);
    if(images_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "images", images_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // pin_media->media_type
    if (pinterest_rest_api_pin_media_MEDIATYPE_NULL == pin_media->media_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "media_type", pin_media_media_type_ToString(pin_media->media_type)) == NULL)
    {
    goto fail; //Enum
    }


    // pin_media->cover_image_url
    if(pin_media->cover_image_url) {
    if(cJSON_AddStringToObject(item, "cover_image_url", pin_media->cover_image_url) == NULL) {
    goto fail; //String
    }
    }


    // pin_media->duration
    if(pin_media->duration) {
    if(cJSON_AddNumberToObject(item, "duration", pin_media->duration) == NULL) {
    goto fail; //Numeric
    }
    }


    // pin_media->height
    if(pin_media->height) {
    if(cJSON_AddNumberToObject(item, "height", pin_media->height) == NULL) {
    goto fail; //Numeric
    }
    }


    // pin_media->video_url
    if(pin_media->video_url) {
    if(cJSON_AddStringToObject(item, "video_url", pin_media->video_url) == NULL) {
    goto fail; //String
    }
    }


    // pin_media->width
    if(pin_media->width) {
    if(cJSON_AddNumberToObject(item, "width", pin_media->width) == NULL) {
    goto fail; //Numeric
    }
    }


    // pin_media->items
    if(pin_media->items) {
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (pin_media->items) {
    list_ForEach(itemsListEntry, pin_media->items) {
    cJSON *itemLocal = pin_media_metadata_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pin_media_t *pin_media_parseFromJSON(cJSON *pin_mediaJSON){

    pin_media_t *pin_media_local_var = NULL;

    // define the local variable for pin_media->images
    image_size_t *images_local_nonprim = NULL;

    // define the local list for pin_media->items
    list_t *itemsList = NULL;

    // pin_media->images
    cJSON *images = cJSON_GetObjectItemCaseSensitive(pin_mediaJSON, "images");
    if (cJSON_IsNull(images)) {
        images = NULL;
    }
    if (images) { 
    images_local_nonprim = image_size_parseFromJSON(images); //nonprimitive
    }

    // pin_media->media_type
    cJSON *media_type = cJSON_GetObjectItemCaseSensitive(pin_mediaJSON, "media_type");
    if (cJSON_IsNull(media_type)) {
        media_type = NULL;
    }
    if (!media_type) {
        goto end;
    }

    pinterest_rest_api_pin_media_MEDIATYPE_e media_typeVariable;
    
    if(!cJSON_IsString(media_type))
    {
    goto end; //Enum
    }
    media_typeVariable = pin_media_media_type_FromString(media_type->valuestring);

    // pin_media->cover_image_url
    cJSON *cover_image_url = cJSON_GetObjectItemCaseSensitive(pin_mediaJSON, "cover_image_url");
    if (cJSON_IsNull(cover_image_url)) {
        cover_image_url = NULL;
    }
    if (cover_image_url) { 
    if(!cJSON_IsString(cover_image_url) && !cJSON_IsNull(cover_image_url))
    {
    goto end; //String
    }
    }

    // pin_media->duration
    cJSON *duration = cJSON_GetObjectItemCaseSensitive(pin_mediaJSON, "duration");
    if (cJSON_IsNull(duration)) {
        duration = NULL;
    }
    if (duration) { 
    if(!cJSON_IsNumber(duration))
    {
    goto end; //Numeric
    }
    }

    // pin_media->height
    cJSON *height = cJSON_GetObjectItemCaseSensitive(pin_mediaJSON, "height");
    if (cJSON_IsNull(height)) {
        height = NULL;
    }
    if (height) { 
    if(!cJSON_IsNumber(height))
    {
    goto end; //Numeric
    }
    }

    // pin_media->video_url
    cJSON *video_url = cJSON_GetObjectItemCaseSensitive(pin_mediaJSON, "video_url");
    if (cJSON_IsNull(video_url)) {
        video_url = NULL;
    }
    if (video_url) { 
    if(!cJSON_IsString(video_url) && !cJSON_IsNull(video_url))
    {
    goto end; //String
    }
    }

    // pin_media->width
    cJSON *width = cJSON_GetObjectItemCaseSensitive(pin_mediaJSON, "width");
    if (cJSON_IsNull(width)) {
        width = NULL;
    }
    if (width) { 
    if(!cJSON_IsNumber(width))
    {
    goto end; //Numeric
    }
    }

    // pin_media->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(pin_mediaJSON, "items");
    if (cJSON_IsNull(items)) {
        items = NULL;
    }
    if (items) { 
    cJSON *items_local_nonprimitive = NULL;
    if(!cJSON_IsArray(items)){
        goto end; //nonprimitive container
    }

    itemsList = list_createList();

    cJSON_ArrayForEach(items_local_nonprimitive,items )
    {
        if(!cJSON_IsObject(items_local_nonprimitive)){
            goto end;
        }
        pin_media_metadata_t *itemsItem = pin_media_metadata_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }
    }


    pin_media_local_var = pin_media_create_internal (
        images ? images_local_nonprim : NULL,
        media_typeVariable,
        cover_image_url && !cJSON_IsNull(cover_image_url) ? strdup(cover_image_url->valuestring) : NULL,
        duration ? duration->valuedouble : 0,
        height ? height->valuedouble : 0,
        video_url && !cJSON_IsNull(video_url) ? strdup(video_url->valuestring) : NULL,
        width ? width->valuedouble : 0,
        items ? itemsList : NULL
        );

    return pin_media_local_var;
end:
    if (images_local_nonprim) {
        image_size_free(images_local_nonprim);
        images_local_nonprim = NULL;
    }
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            pin_media_metadata_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
