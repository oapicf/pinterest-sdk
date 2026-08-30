#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "advertiser_defined_events_get_200_response.h"



static advertiser_defined_events_get_200_response_t *advertiser_defined_events_get_200_response_create_internal(
    list_t *items
    ) {
    advertiser_defined_events_get_200_response_t *advertiser_defined_events_get_200_response_local_var = malloc(sizeof(advertiser_defined_events_get_200_response_t));
    if (!advertiser_defined_events_get_200_response_local_var) {
        return NULL;
    }
    memset(advertiser_defined_events_get_200_response_local_var, 0, sizeof(advertiser_defined_events_get_200_response_t));
    advertiser_defined_events_get_200_response_local_var->_library_owned = 1;
    advertiser_defined_events_get_200_response_local_var->items = items;
    return advertiser_defined_events_get_200_response_local_var;
}

__attribute__((deprecated)) advertiser_defined_events_get_200_response_t *advertiser_defined_events_get_200_response_create(
    list_t *items
    ) {
    advertiser_defined_events_get_200_response_t *result = advertiser_defined_events_get_200_response_create_internal (
        items
        );
    if (!result) {
    }
    return result;
}

void advertiser_defined_events_get_200_response_free(advertiser_defined_events_get_200_response_t *advertiser_defined_events_get_200_response) {
    if(NULL == advertiser_defined_events_get_200_response){
        return ;
    }
    if(advertiser_defined_events_get_200_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "advertiser_defined_events_get_200_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (advertiser_defined_events_get_200_response->items) {
        list_ForEach(listEntry, advertiser_defined_events_get_200_response->items) {
            advertiser_defined_event_free(listEntry->data);
        }
        list_freeList(advertiser_defined_events_get_200_response->items);
        advertiser_defined_events_get_200_response->items = NULL;
    }
    free(advertiser_defined_events_get_200_response);
}

cJSON *advertiser_defined_events_get_200_response_convertToJSON(advertiser_defined_events_get_200_response_t *advertiser_defined_events_get_200_response) {
    cJSON *item = cJSON_CreateObject();

    // advertiser_defined_events_get_200_response->items
    if (!advertiser_defined_events_get_200_response->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (advertiser_defined_events_get_200_response->items) {
    list_ForEach(itemsListEntry, advertiser_defined_events_get_200_response->items) {
    cJSON *itemLocal = advertiser_defined_event_convertToJSON(itemsListEntry->data);
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

advertiser_defined_events_get_200_response_t *advertiser_defined_events_get_200_response_parseFromJSON(cJSON *advertiser_defined_events_get_200_responseJSON){

    advertiser_defined_events_get_200_response_t *advertiser_defined_events_get_200_response_local_var = NULL;

    // define the local list for advertiser_defined_events_get_200_response->items
    list_t *itemsList = NULL;

    // advertiser_defined_events_get_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(advertiser_defined_events_get_200_responseJSON, "items");
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
        advertiser_defined_event_t *itemsItem = advertiser_defined_event_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }



    advertiser_defined_events_get_200_response_local_var = advertiser_defined_events_get_200_response_create_internal (
        itemsList
        );

    if (!advertiser_defined_events_get_200_response_local_var) {
        goto end;
    }

    return advertiser_defined_events_get_200_response_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            advertiser_defined_event_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
