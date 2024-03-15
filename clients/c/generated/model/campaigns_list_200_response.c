#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaigns_list_200_response.h"



campaigns_list_200_response_t *campaigns_list_200_response_create(
    list_t *items,
    char *bookmark
    ) {
    campaigns_list_200_response_t *campaigns_list_200_response_local_var = malloc(sizeof(campaigns_list_200_response_t));
    if (!campaigns_list_200_response_local_var) {
        return NULL;
    }
    campaigns_list_200_response_local_var->items = items;
    campaigns_list_200_response_local_var->bookmark = bookmark;

    return campaigns_list_200_response_local_var;
}


void campaigns_list_200_response_free(campaigns_list_200_response_t *campaigns_list_200_response) {
    if(NULL == campaigns_list_200_response){
        return ;
    }
    listEntry_t *listEntry;
    if (campaigns_list_200_response->items) {
        list_ForEach(listEntry, campaigns_list_200_response->items) {
            campaign_response_free(listEntry->data);
        }
        list_freeList(campaigns_list_200_response->items);
        campaigns_list_200_response->items = NULL;
    }
    if (campaigns_list_200_response->bookmark) {
        free(campaigns_list_200_response->bookmark);
        campaigns_list_200_response->bookmark = NULL;
    }
    free(campaigns_list_200_response);
}

cJSON *campaigns_list_200_response_convertToJSON(campaigns_list_200_response_t *campaigns_list_200_response) {
    cJSON *item = cJSON_CreateObject();

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
    cJSON *itemLocal = campaign_response_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }


    // campaigns_list_200_response->bookmark
    if(campaigns_list_200_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", campaigns_list_200_response->bookmark) == NULL) {
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

campaigns_list_200_response_t *campaigns_list_200_response_parseFromJSON(cJSON *campaigns_list_200_responseJSON){

    campaigns_list_200_response_t *campaigns_list_200_response_local_var = NULL;

    // define the local list for campaigns_list_200_response->items
    list_t *itemsList = NULL;

    // campaigns_list_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(campaigns_list_200_responseJSON, "items");
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
        campaign_response_t *itemsItem = campaign_response_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }

    // campaigns_list_200_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(campaigns_list_200_responseJSON, "bookmark");
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }


    campaigns_list_200_response_local_var = campaigns_list_200_response_create (
        itemsList,
        bookmark && !cJSON_IsNull(bookmark) ? strdup(bookmark->valuestring) : NULL
        );

    return campaigns_list_200_response_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            campaign_response_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
