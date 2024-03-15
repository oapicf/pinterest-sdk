#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pin_media_with_image_and_video.h"



pin_media_with_image_and_video_t *pin_media_with_image_and_video_create(
    char *media_type,
    list_t *items
    ) {
    pin_media_with_image_and_video_t *pin_media_with_image_and_video_local_var = malloc(sizeof(pin_media_with_image_and_video_t));
    if (!pin_media_with_image_and_video_local_var) {
        return NULL;
    }
    pin_media_with_image_and_video_local_var->media_type = media_type;
    pin_media_with_image_and_video_local_var->items = items;

    return pin_media_with_image_and_video_local_var;
}


void pin_media_with_image_and_video_free(pin_media_with_image_and_video_t *pin_media_with_image_and_video) {
    if(NULL == pin_media_with_image_and_video){
        return ;
    }
    listEntry_t *listEntry;
    if (pin_media_with_image_and_video->media_type) {
        free(pin_media_with_image_and_video->media_type);
        pin_media_with_image_and_video->media_type = NULL;
    }
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

    // pin_media_with_image_and_video->media_type
    if(pin_media_with_image_and_video->media_type) {
    if(cJSON_AddStringToObject(item, "media_type", pin_media_with_image_and_video->media_type) == NULL) {
    goto fail; //String
    }
    }


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

    // pin_media_with_image_and_video->media_type
    cJSON *media_type = cJSON_GetObjectItemCaseSensitive(pin_media_with_image_and_videoJSON, "media_type");
    if (media_type) { 
    if(!cJSON_IsString(media_type) && !cJSON_IsNull(media_type))
    {
    goto end; //String
    }
    }

    // pin_media_with_image_and_video->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(pin_media_with_image_and_videoJSON, "items");
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


    pin_media_with_image_and_video_local_var = pin_media_with_image_and_video_create (
        media_type && !cJSON_IsNull(media_type) ? strdup(media_type->valuestring) : NULL,
        items ? itemsList : NULL
        );

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
