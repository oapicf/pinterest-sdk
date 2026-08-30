#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ads_list_200_response.h"



static ads_list_200_response_t *ads_list_200_response_create_internal(
    char *bookmark,
    list_t *items
    ) {
    ads_list_200_response_t *ads_list_200_response_local_var = malloc(sizeof(ads_list_200_response_t));
    if (!ads_list_200_response_local_var) {
        return NULL;
    }
    memset(ads_list_200_response_local_var, 0, sizeof(ads_list_200_response_t));
    ads_list_200_response_local_var->_library_owned = 1;
    ads_list_200_response_local_var->bookmark = bookmark;
    ads_list_200_response_local_var->items = items;
    return ads_list_200_response_local_var;
}

__attribute__((deprecated)) ads_list_200_response_t *ads_list_200_response_create(
    char *bookmark,
    list_t *items
    ) {
    ads_list_200_response_t *result = ads_list_200_response_create_internal (
        bookmark,
        items
        );
    if (!result) {
    }
    return result;
}

void ads_list_200_response_free(ads_list_200_response_t *ads_list_200_response) {
    if(NULL == ads_list_200_response){
        return ;
    }
    if(ads_list_200_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ads_list_200_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ads_list_200_response->bookmark) {
        free(ads_list_200_response->bookmark);
        ads_list_200_response->bookmark = NULL;
    }
    if (ads_list_200_response->items) {
        list_ForEach(listEntry, ads_list_200_response->items) {
            ad_free(listEntry->data);
        }
        list_freeList(ads_list_200_response->items);
        ads_list_200_response->items = NULL;
    }
    free(ads_list_200_response);
}

cJSON *ads_list_200_response_convertToJSON(ads_list_200_response_t *ads_list_200_response) {
    cJSON *item = cJSON_CreateObject();

    // ads_list_200_response->bookmark
    if(ads_list_200_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", ads_list_200_response->bookmark) == NULL) {
    goto fail; //String
    }
    }


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
    cJSON *itemLocal = ad_convertToJSON(itemsListEntry->data);
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

ads_list_200_response_t *ads_list_200_response_parseFromJSON(cJSON *ads_list_200_responseJSON){

    ads_list_200_response_t *ads_list_200_response_local_var = NULL;

    char *bookmark_local_str = NULL;

    // define the local list for ads_list_200_response->items
    list_t *itemsList = NULL;

    // ads_list_200_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(ads_list_200_responseJSON, "bookmark");
    if (cJSON_IsNull(bookmark)) {
        bookmark = NULL;
    }
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }

    // ads_list_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(ads_list_200_responseJSON, "items");
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
        ad_t *itemsItem = ad_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }


    if (bookmark && !cJSON_IsNull(bookmark)) bookmark_local_str = strdup(bookmark->valuestring);

    ads_list_200_response_local_var = ads_list_200_response_create_internal (
        bookmark_local_str,
        itemsList
        );

    if (!ads_list_200_response_local_var) {
        goto end;
    }

    return ads_list_200_response_local_var;
end:
    if (bookmark_local_str) {
        free(bookmark_local_str);
        bookmark_local_str = NULL;
    }
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            ad_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
