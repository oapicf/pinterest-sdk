#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_update_response.h"



campaign_update_response_t *campaign_update_response_create(
    list_t *items
    ) {
    campaign_update_response_t *campaign_update_response_local_var = malloc(sizeof(campaign_update_response_t));
    if (!campaign_update_response_local_var) {
        return NULL;
    }
    campaign_update_response_local_var->items = items;

    return campaign_update_response_local_var;
}


void campaign_update_response_free(campaign_update_response_t *campaign_update_response) {
    if(NULL == campaign_update_response){
        return ;
    }
    listEntry_t *listEntry;
    if (campaign_update_response->items) {
        list_ForEach(listEntry, campaign_update_response->items) {
            campaign_create_response_item_free(listEntry->data);
        }
        list_freeList(campaign_update_response->items);
        campaign_update_response->items = NULL;
    }
    free(campaign_update_response);
}

cJSON *campaign_update_response_convertToJSON(campaign_update_response_t *campaign_update_response) {
    cJSON *item = cJSON_CreateObject();

    // campaign_update_response->items
    if(campaign_update_response->items) {
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (campaign_update_response->items) {
    list_ForEach(itemsListEntry, campaign_update_response->items) {
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

campaign_update_response_t *campaign_update_response_parseFromJSON(cJSON *campaign_update_responseJSON){

    campaign_update_response_t *campaign_update_response_local_var = NULL;

    // define the local list for campaign_update_response->items
    list_t *itemsList = NULL;

    // campaign_update_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(campaign_update_responseJSON, "items");
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


    campaign_update_response_local_var = campaign_update_response_create (
        items ? itemsList : NULL
        );

    return campaign_update_response_local_var;
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
