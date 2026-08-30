#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_tags_list_200_response.h"



static conversion_tags_list_200_response_t *conversion_tags_list_200_response_create_internal(
    list_t *items
    ) {
    conversion_tags_list_200_response_t *conversion_tags_list_200_response_local_var = malloc(sizeof(conversion_tags_list_200_response_t));
    if (!conversion_tags_list_200_response_local_var) {
        return NULL;
    }
    memset(conversion_tags_list_200_response_local_var, 0, sizeof(conversion_tags_list_200_response_t));
    conversion_tags_list_200_response_local_var->_library_owned = 1;
    conversion_tags_list_200_response_local_var->items = items;
    return conversion_tags_list_200_response_local_var;
}

__attribute__((deprecated)) conversion_tags_list_200_response_t *conversion_tags_list_200_response_create(
    list_t *items
    ) {
    conversion_tags_list_200_response_t *result = conversion_tags_list_200_response_create_internal (
        items
        );
    if (!result) {
    }
    return result;
}

void conversion_tags_list_200_response_free(conversion_tags_list_200_response_t *conversion_tags_list_200_response) {
    if(NULL == conversion_tags_list_200_response){
        return ;
    }
    if(conversion_tags_list_200_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "conversion_tags_list_200_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (conversion_tags_list_200_response->items) {
        list_ForEach(listEntry, conversion_tags_list_200_response->items) {
            conversion_tag_free(listEntry->data);
        }
        list_freeList(conversion_tags_list_200_response->items);
        conversion_tags_list_200_response->items = NULL;
    }
    free(conversion_tags_list_200_response);
}

cJSON *conversion_tags_list_200_response_convertToJSON(conversion_tags_list_200_response_t *conversion_tags_list_200_response) {
    cJSON *item = cJSON_CreateObject();

    // conversion_tags_list_200_response->items
    if (!conversion_tags_list_200_response->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (conversion_tags_list_200_response->items) {
    list_ForEach(itemsListEntry, conversion_tags_list_200_response->items) {
    cJSON *itemLocal = conversion_tag_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

conversion_tags_list_200_response_t *conversion_tags_list_200_response_parseFromJSON(cJSON *conversion_tags_list_200_responseJSON){

    conversion_tags_list_200_response_t *conversion_tags_list_200_response_local_var = NULL;

    // define the local list for conversion_tags_list_200_response->items
    list_t *itemsList = NULL;

    // conversion_tags_list_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(conversion_tags_list_200_responseJSON, "items");
    if (cJSON_IsNull(items)) {
        items = NULL;
    }
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
        conversion_tag_t *itemsItem = conversion_tag_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }



    conversion_tags_list_200_response_local_var = conversion_tags_list_200_response_create_internal (
        itemsList
        );

    if (!conversion_tags_list_200_response_local_var) {
        goto end;
    }

    return conversion_tags_list_200_response_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            conversion_tag_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
