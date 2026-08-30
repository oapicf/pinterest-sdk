#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaigns_list_200_response.h"



static campaigns_list_200_response_t *campaigns_list_200_response_create_internal(
    char *bookmark,
    list_t *items
    ) {
    campaigns_list_200_response_t *campaigns_list_200_response_local_var = malloc(sizeof(campaigns_list_200_response_t));
    if (!campaigns_list_200_response_local_var) {
        return NULL;
    }
    memset(campaigns_list_200_response_local_var, 0, sizeof(campaigns_list_200_response_t));
    campaigns_list_200_response_local_var->_library_owned = 1;
    campaigns_list_200_response_local_var->bookmark = bookmark;
    campaigns_list_200_response_local_var->items = items;
    return campaigns_list_200_response_local_var;
}

__attribute__((deprecated)) campaigns_list_200_response_t *campaigns_list_200_response_create(
    char *bookmark,
    list_t *items
    ) {
    campaigns_list_200_response_t *result = campaigns_list_200_response_create_internal (
        bookmark,
        items
        );
    if (!result) {
    }
    return result;
}

void campaigns_list_200_response_free(campaigns_list_200_response_t *campaigns_list_200_response) {
    if(NULL == campaigns_list_200_response){
        return ;
    }
    if(campaigns_list_200_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "campaigns_list_200_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (campaigns_list_200_response->bookmark) {
        free(campaigns_list_200_response->bookmark);
        campaigns_list_200_response->bookmark = NULL;
    }
    if (campaigns_list_200_response->items) {
        list_ForEach(listEntry, campaigns_list_200_response->items) {
            campaign_free(listEntry->data);
        }
        list_freeList(campaigns_list_200_response->items);
        campaigns_list_200_response->items = NULL;
    }
    free(campaigns_list_200_response);
}

cJSON *campaigns_list_200_response_convertToJSON(campaigns_list_200_response_t *campaigns_list_200_response) {
    cJSON *item = cJSON_CreateObject();

    // campaigns_list_200_response->bookmark
    if(campaigns_list_200_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", campaigns_list_200_response->bookmark) == NULL) {
    goto fail; //String
    }
    }


    // campaigns_list_200_response->items
    if (!campaigns_list_200_response->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (campaigns_list_200_response->items) {
    list_ForEach(itemsListEntry, campaigns_list_200_response->items) {
    cJSON *itemLocal = campaign_convertToJSON(itemsListEntry->data);
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

campaigns_list_200_response_t *campaigns_list_200_response_parseFromJSON(cJSON *campaigns_list_200_responseJSON){

    campaigns_list_200_response_t *campaigns_list_200_response_local_var = NULL;

    char *bookmark_local_str = NULL;

    // define the local list for campaigns_list_200_response->items
    list_t *itemsList = NULL;

    // campaigns_list_200_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(campaigns_list_200_responseJSON, "bookmark");
    if (cJSON_IsNull(bookmark)) {
        bookmark = NULL;
    }
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }

    // campaigns_list_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(campaigns_list_200_responseJSON, "items");
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
        campaign_t *itemsItem = campaign_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }


    if (bookmark && !cJSON_IsNull(bookmark)) bookmark_local_str = strdup(bookmark->valuestring);

    campaigns_list_200_response_local_var = campaigns_list_200_response_create_internal (
        bookmark_local_str,
        itemsList
        );

    if (!campaigns_list_200_response_local_var) {
        goto end;
    }

    return campaigns_list_200_response_local_var;
end:
    if (bookmark_local_str) {
        free(bookmark_local_str);
        bookmark_local_str = NULL;
    }
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            campaign_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
