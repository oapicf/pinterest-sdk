#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pin_media_with_image_and_video.h"


char* pin_media_with_image_and_video_media_type_ToString(pinterest_rest_api_pin_media_with_image_and_video_MEDIATYPE_e media_type) {
    char* media_typeArray[] =  { "NULL", "multiple_mixed" };
    return media_typeArray[media_type];
}

pinterest_rest_api_pin_media_with_image_and_video_MEDIATYPE_e pin_media_with_image_and_video_media_type_FromString(char* media_type){
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

static pin_media_with_image_and_video_t *pin_media_with_image_and_video_create_internal(
    list_t *items,
    pinterest_rest_api_pin_media_with_image_and_video_MEDIATYPE_e media_type
    ) {
    pin_media_with_image_and_video_t *pin_media_with_image_and_video_local_var = malloc(sizeof(pin_media_with_image_and_video_t));
    if (!pin_media_with_image_and_video_local_var) {
        return NULL;
    }
    memset(pin_media_with_image_and_video_local_var, 0, sizeof(pin_media_with_image_and_video_t));
    pin_media_with_image_and_video_local_var->_library_owned = 1;
    pin_media_with_image_and_video_local_var->items = items;
    pin_media_with_image_and_video_local_var->media_type = media_type;
    return pin_media_with_image_and_video_local_var;
}

__attribute__((deprecated)) pin_media_with_image_and_video_t *pin_media_with_image_and_video_create(
    list_t *items,
    pinterest_rest_api_pin_media_with_image_and_video_MEDIATYPE_e media_type
    ) {
    pin_media_with_image_and_video_t *result = pin_media_with_image_and_video_create_internal (
        items,
        media_type
        );
    if (!result) {
    }
    return result;
}

void pin_media_with_image_and_video_free(pin_media_with_image_and_video_t *pin_media_with_image_and_video) {
    if(NULL == pin_media_with_image_and_video){
        return ;
    }
    if(pin_media_with_image_and_video->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pin_media_with_image_and_video_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pin_media_with_image_and_video->items) {
        list_ForEach(listEntry, pin_media_with_image_and_video->items) {
            pin_media_metadata_free(listEntry->data);
        }
        list_freeList(pin_media_with_image_and_video->items);
        pin_media_with_image_and_video->items = NULL;
    }
    free(pin_media_with_image_and_video);
}

cJSON *pin_media_with_image_and_video_convertToJSON(pin_media_with_image_and_video_t *pin_media_with_image_and_video) {
    cJSON *item = cJSON_CreateObject();

    // pin_media_with_image_and_video->items
    if(pin_media_with_image_and_video->items) {
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (pin_media_with_image_and_video->items) {
    list_ForEach(itemsListEntry, pin_media_with_image_and_video->items) {
    cJSON *itemLocal = pin_media_metadata_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }
    }


    // pin_media_with_image_and_video->media_type
    if (pinterest_rest_api_pin_media_with_image_and_video_MEDIATYPE_NULL == pin_media_with_image_and_video->media_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "media_type", pin_media_with_image_and_video_media_type_ToString(pin_media_with_image_and_video->media_type)) == NULL)
    {
    goto fail; //Enum
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pin_media_with_image_and_video_t *pin_media_with_image_and_video_parseFromJSON(cJSON *pin_media_with_image_and_videoJSON){

    pin_media_with_image_and_video_t *pin_media_with_image_and_video_local_var = NULL;

    // define the local list for pin_media_with_image_and_video->items
    list_t *itemsList = NULL;

    // pin_media_with_image_and_video->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(pin_media_with_image_and_videoJSON, "items");
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

    // pin_media_with_image_and_video->media_type
    cJSON *media_type = cJSON_GetObjectItemCaseSensitive(pin_media_with_image_and_videoJSON, "media_type");
    if (cJSON_IsNull(media_type)) {
        media_type = NULL;
    }
    if (!media_type) {
        goto end;
    }

    pinterest_rest_api_pin_media_with_image_and_video_MEDIATYPE_e media_typeVariable;
    
    if(!cJSON_IsString(media_type))
    {
    goto end; //Enum
    }
    media_typeVariable = pin_media_with_image_and_video_media_type_FromString(media_type->valuestring);



    pin_media_with_image_and_video_local_var = pin_media_with_image_and_video_create_internal (
        items ? itemsList : NULL,
        media_typeVariable
        );

    if (!pin_media_with_image_and_video_local_var) {
        goto end;
    }

    return pin_media_with_image_and_video_local_var;
end:
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
