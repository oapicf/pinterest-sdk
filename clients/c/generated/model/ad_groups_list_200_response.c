#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_groups_list_200_response.h"



ad_groups_list_200_response_t *ad_groups_list_200_response_create(
    list_t *items,
    char *bookmark
    ) {
    ad_groups_list_200_response_t *ad_groups_list_200_response_local_var = malloc(sizeof(ad_groups_list_200_response_t));
    if (!ad_groups_list_200_response_local_var) {
        return NULL;
    }
    ad_groups_list_200_response_local_var->items = items;
    ad_groups_list_200_response_local_var->bookmark = bookmark;

    return ad_groups_list_200_response_local_var;
}


void ad_groups_list_200_response_free(ad_groups_list_200_response_t *ad_groups_list_200_response) {
    if(NULL == ad_groups_list_200_response){
        return ;
    }
    listEntry_t *listEntry;
    if (ad_groups_list_200_response->items) {
        list_ForEach(listEntry, ad_groups_list_200_response->items) {
            ad_group_response_free(listEntry->data);
        }
        list_freeList(ad_groups_list_200_response->items);
        ad_groups_list_200_response->items = NULL;
    }
    if (ad_groups_list_200_response->bookmark) {
        free(ad_groups_list_200_response->bookmark);
        ad_groups_list_200_response->bookmark = NULL;
    }
    free(ad_groups_list_200_response);
}

cJSON *ad_groups_list_200_response_convertToJSON(ad_groups_list_200_response_t *ad_groups_list_200_response) {
    cJSON *item = cJSON_CreateObject();

    // ad_groups_list_200_response->items
    if (!ad_groups_list_200_response->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (ad_groups_list_200_response->items) {
    list_ForEach(itemsListEntry, ad_groups_list_200_response->items) {
    cJSON *itemLocal = ad_group_response_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }


    // ad_groups_list_200_response->bookmark
    if(ad_groups_list_200_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", ad_groups_list_200_response->bookmark) == NULL) {
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

ad_groups_list_200_response_t *ad_groups_list_200_response_parseFromJSON(cJSON *ad_groups_list_200_responseJSON){

    ad_groups_list_200_response_t *ad_groups_list_200_response_local_var = NULL;

    // define the local list for ad_groups_list_200_response->items
    list_t *itemsList = NULL;

    // ad_groups_list_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(ad_groups_list_200_responseJSON, "items");
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
        ad_group_response_t *itemsItem = ad_group_response_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }

    // ad_groups_list_200_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(ad_groups_list_200_responseJSON, "bookmark");
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }


    ad_groups_list_200_response_local_var = ad_groups_list_200_response_create (
        itemsList,
        bookmark && !cJSON_IsNull(bookmark) ? strdup(bookmark->valuestring) : NULL
        );

    return ad_groups_list_200_response_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            ad_group_response_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
