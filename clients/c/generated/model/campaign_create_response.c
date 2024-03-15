#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_create_response.h"



campaign_create_response_t *campaign_create_response_create(
    list_t *items
    ) {
    campaign_create_response_t *campaign_create_response_local_var = malloc(sizeof(campaign_create_response_t));
    if (!campaign_create_response_local_var) {
        return NULL;
    }
    campaign_create_response_local_var->items = items;

    return campaign_create_response_local_var;
}


void campaign_create_response_free(campaign_create_response_t *campaign_create_response) {
    if(NULL == campaign_create_response){
        return ;
    }
    listEntry_t *listEntry;
    if (campaign_create_response->items) {
        list_ForEach(listEntry, campaign_create_response->items) {
            campaign_create_response_item_free(listEntry->data);
        }
        list_freeList(campaign_create_response->items);
        campaign_create_response->items = NULL;
    }
    free(campaign_create_response);
}

cJSON *campaign_create_response_convertToJSON(campaign_create_response_t *campaign_create_response) {
    cJSON *item = cJSON_CreateObject();

    // campaign_create_response->items
    if(campaign_create_response->items) {
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (campaign_create_response->items) {
    list_ForEach(itemsListEntry, campaign_create_response->items) {
    cJSON *itemLocal = campaign_create_response_item_convertToJSON(itemsListEntry->data);
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

campaign_create_response_t *campaign_create_response_parseFromJSON(cJSON *campaign_create_responseJSON){

    campaign_create_response_t *campaign_create_response_local_var = NULL;

    // define the local list for campaign_create_response->items
    list_t *itemsList = NULL;

    // campaign_create_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(campaign_create_responseJSON, "items");
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
        campaign_create_response_item_t *itemsItem = campaign_create_response_item_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }
    }


    campaign_create_response_local_var = campaign_create_response_create (
        items ? itemsList : NULL
        );

    return campaign_create_response_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            campaign_create_response_item_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
