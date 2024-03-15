#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pin_media_source_images_url.h"


char* pin_media_source_images_url_source_type_ToString(pinterest_rest_api_pin_media_source_images_url_SOURCETYPE_e source_type) {
    char* source_typeArray[] =  { "NULL", "multiple_image_urls" };
    return source_typeArray[source_type];
}

pinterest_rest_api_pin_media_source_images_url_SOURCETYPE_e pin_media_source_images_url_source_type_FromString(char* source_type){
    int stringToReturn = 0;
    char *source_typeArray[] =  { "NULL", "multiple_image_urls" };
    size_t sizeofArray = sizeof(source_typeArray) / sizeof(source_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(source_type, source_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

pin_media_source_images_url_t *pin_media_source_images_url_create(
    pinterest_rest_api_pin_media_source_images_url_SOURCETYPE_e source_type,
    list_t *items,
    int index
    ) {
    pin_media_source_images_url_t *pin_media_source_images_url_local_var = malloc(sizeof(pin_media_source_images_url_t));
    if (!pin_media_source_images_url_local_var) {
        return NULL;
    }
    pin_media_source_images_url_local_var->source_type = source_type;
    pin_media_source_images_url_local_var->items = items;
    pin_media_source_images_url_local_var->index = index;

    return pin_media_source_images_url_local_var;
}


void pin_media_source_images_url_free(pin_media_source_images_url_t *pin_media_source_images_url) {
    if(NULL == pin_media_source_images_url){
        return ;
    }
    listEntry_t *listEntry;
    if (pin_media_source_images_url->items) {
        list_ForEach(listEntry, pin_media_source_images_url->items) {
            pin_media_source_images_url_items_inner_free(listEntry->data);
        }
        list_freeList(pin_media_source_images_url->items);
        pin_media_source_images_url->items = NULL;
    }
    free(pin_media_source_images_url);
}

cJSON *pin_media_source_images_url_convertToJSON(pin_media_source_images_url_t *pin_media_source_images_url) {
    cJSON *item = cJSON_CreateObject();

    // pin_media_source_images_url->source_type
    if(pin_media_source_images_url->source_type != pinterest_rest_api_pin_media_source_images_url_SOURCETYPE_NULL) {
    if(cJSON_AddStringToObject(item, "source_type", source_typepin_media_source_images_url_ToString(pin_media_source_images_url->source_type)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // pin_media_source_images_url->items
    if (!pin_media_source_images_url->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (pin_media_source_images_url->items) {
    list_ForEach(itemsListEntry, pin_media_source_images_url->items) {
    cJSON *itemLocal = pin_media_source_images_url_items_inner_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }


    // pin_media_source_images_url->index
    if(pin_media_source_images_url->index) {
    if(cJSON_AddNumberToObject(item, "index", pin_media_source_images_url->index) == NULL) {
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

pin_media_source_images_url_t *pin_media_source_images_url_parseFromJSON(cJSON *pin_media_source_images_urlJSON){

    pin_media_source_images_url_t *pin_media_source_images_url_local_var = NULL;

    // define the local list for pin_media_source_images_url->items
    list_t *itemsList = NULL;

    // pin_media_source_images_url->source_type
    cJSON *source_type = cJSON_GetObjectItemCaseSensitive(pin_media_source_images_urlJSON, "source_type");
    pinterest_rest_api_pin_media_source_images_url_SOURCETYPE_e source_typeVariable;
    if (source_type) { 
    if(!cJSON_IsString(source_type))
    {
    goto end; //Enum
    }
    source_typeVariable = pin_media_source_images_url_source_type_FromString(source_type->valuestring);
    }

    // pin_media_source_images_url->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(pin_media_source_images_urlJSON, "items");
    if (!items) {
        goto end;
    }

    
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
        pin_media_source_images_url_items_inner_t *itemsItem = pin_media_source_images_url_items_inner_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }

    // pin_media_source_images_url->index
    cJSON *index = cJSON_GetObjectItemCaseSensitive(pin_media_source_images_urlJSON, "index");
    if (index) { 
    if(!cJSON_IsNumber(index))
    {
    goto end; //Numeric
    }
    }


    pin_media_source_images_url_local_var = pin_media_source_images_url_create (
        source_type ? source_typeVariable : pinterest_rest_api_pin_media_source_images_url_SOURCETYPE_NULL,
        itemsList,
        index ? index->valuedouble : 0
        );

    return pin_media_source_images_url_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            pin_media_source_images_url_items_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
