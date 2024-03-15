#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pin_media_with_images.h"



pin_media_with_images_t *pin_media_with_images_create(
    char *media_type,
    list_t *items
    ) {
    pin_media_with_images_t *pin_media_with_images_local_var = malloc(sizeof(pin_media_with_images_t));
    if (!pin_media_with_images_local_var) {
        return NULL;
    }
    pin_media_with_images_local_var->media_type = media_type;
    pin_media_with_images_local_var->items = items;

    return pin_media_with_images_local_var;
}


void pin_media_with_images_free(pin_media_with_images_t *pin_media_with_images) {
    if(NULL == pin_media_with_images){
        return ;
    }
    listEntry_t *listEntry;
    if (pin_media_with_images->media_type) {
        free(pin_media_with_images->media_type);
        pin_media_with_images->media_type = NULL;
    }
    if (pin_media_with_images->items) {
        list_ForEach(listEntry, pin_media_with_images->items) {
            image_metadata_free(listEntry->data);
        }
        list_freeList(pin_media_with_images->items);
        pin_media_with_images->items = NULL;
    }
    free(pin_media_with_images);
}

cJSON *pin_media_with_images_convertToJSON(pin_media_with_images_t *pin_media_with_images) {
    cJSON *item = cJSON_CreateObject();

    // pin_media_with_images->media_type
    if(pin_media_with_images->media_type) {
    if(cJSON_AddStringToObject(item, "media_type", pin_media_with_images->media_type) == NULL) {
    goto fail; //String
    }
    }


    // pin_media_with_images->items
    if(pin_media_with_images->items) {
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (pin_media_with_images->items) {
    list_ForEach(itemsListEntry, pin_media_with_images->items) {
    cJSON *itemLocal = image_metadata_convertToJSON(itemsListEntry->data);
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

pin_media_with_images_t *pin_media_with_images_parseFromJSON(cJSON *pin_media_with_imagesJSON){

    pin_media_with_images_t *pin_media_with_images_local_var = NULL;

    // define the local list for pin_media_with_images->items
    list_t *itemsList = NULL;

    // pin_media_with_images->media_type
    cJSON *media_type = cJSON_GetObjectItemCaseSensitive(pin_media_with_imagesJSON, "media_type");
    if (media_type) { 
    if(!cJSON_IsString(media_type) && !cJSON_IsNull(media_type))
    {
    goto end; //String
    }
    }

    // pin_media_with_images->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(pin_media_with_imagesJSON, "items");
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
        image_metadata_t *itemsItem = image_metadata_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }
    }


    pin_media_with_images_local_var = pin_media_with_images_create (
        media_type && !cJSON_IsNull(media_type) ? strdup(media_type->valuestring) : NULL,
        items ? itemsList : NULL
        );

    return pin_media_with_images_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            image_metadata_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
