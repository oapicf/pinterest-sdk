#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ads_list_200_response.h"



ads_list_200_response_t *ads_list_200_response_create(
    list_t *items,
    char *bookmark
    ) {
    ads_list_200_response_t *ads_list_200_response_local_var = malloc(sizeof(ads_list_200_response_t));
    if (!ads_list_200_response_local_var) {
        return NULL;
    }
    ads_list_200_response_local_var->items = items;
    ads_list_200_response_local_var->bookmark = bookmark;

    return ads_list_200_response_local_var;
}


void ads_list_200_response_free(ads_list_200_response_t *ads_list_200_response) {
    if(NULL == ads_list_200_response){
        return ;
    }
    listEntry_t *listEntry;
    if (ads_list_200_response->items) {
        list_ForEach(listEntry, ads_list_200_response->items) {
            ad_response_free(listEntry->data);
        }
        list_freeList(ads_list_200_response->items);
        ads_list_200_response->items = NULL;
    }
    if (ads_list_200_response->bookmark) {
        free(ads_list_200_response->bookmark);
        ads_list_200_response->bookmark = NULL;
    }
    free(ads_list_200_response);
}

cJSON *ads_list_200_response_convertToJSON(ads_list_200_response_t *ads_list_200_response) {
    cJSON *item = cJSON_CreateObject();

    // ads_list_200_response->items
    if (!ads_list_200_response->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (ads_list_200_response->items) {
    list_ForEach(itemsListEntry, ads_list_200_response->items) {
    cJSON *itemLocal = ad_response_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }


    // ads_list_200_response->bookmark
    if(ads_list_200_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", ads_list_200_response->bookmark) == NULL) {
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

ads_list_200_response_t *ads_list_200_response_parseFromJSON(cJSON *ads_list_200_responseJSON){

    ads_list_200_response_t *ads_list_200_response_local_var = NULL;

    // define the local list for ads_list_200_response->items
    list_t *itemsList = NULL;

    // ads_list_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(ads_list_200_responseJSON, "items");
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
        ad_response_t *itemsItem = ad_response_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }

    // ads_list_200_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(ads_list_200_responseJSON, "bookmark");
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }


    ads_list_200_response_local_var = ads_list_200_response_create (
        itemsList,
        bookmark && !cJSON_IsNull(bookmark) ? strdup(bookmark->valuestring) : NULL
        );

    return ads_list_200_response_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            ad_response_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
