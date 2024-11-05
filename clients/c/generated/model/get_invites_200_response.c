#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_invites_200_response.h"



get_invites_200_response_t *get_invites_200_response_create(
    list_t *items,
    char *bookmark
    ) {
    get_invites_200_response_t *get_invites_200_response_local_var = malloc(sizeof(get_invites_200_response_t));
    if (!get_invites_200_response_local_var) {
        return NULL;
    }
    get_invites_200_response_local_var->items = items;
    get_invites_200_response_local_var->bookmark = bookmark;

    return get_invites_200_response_local_var;
}


void get_invites_200_response_free(get_invites_200_response_t *get_invites_200_response) {
    if(NULL == get_invites_200_response){
        return ;
    }
    listEntry_t *listEntry;
    if (get_invites_200_response->items) {
        list_ForEach(listEntry, get_invites_200_response->items) {
            invite_response_free(listEntry->data);
        }
        list_freeList(get_invites_200_response->items);
        get_invites_200_response->items = NULL;
    }
    if (get_invites_200_response->bookmark) {
        free(get_invites_200_response->bookmark);
        get_invites_200_response->bookmark = NULL;
    }
    free(get_invites_200_response);
}

cJSON *get_invites_200_response_convertToJSON(get_invites_200_response_t *get_invites_200_response) {
    cJSON *item = cJSON_CreateObject();

    // get_invites_200_response->items
    if (!get_invites_200_response->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (get_invites_200_response->items) {
    list_ForEach(itemsListEntry, get_invites_200_response->items) {
    cJSON *itemLocal = invite_response_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }


    // get_invites_200_response->bookmark
    if(get_invites_200_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", get_invites_200_response->bookmark) == NULL) {
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

get_invites_200_response_t *get_invites_200_response_parseFromJSON(cJSON *get_invites_200_responseJSON){

    get_invites_200_response_t *get_invites_200_response_local_var = NULL;

    // define the local list for get_invites_200_response->items
    list_t *itemsList = NULL;

    // get_invites_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(get_invites_200_responseJSON, "items");
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
        invite_response_t *itemsItem = invite_response_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }

    // get_invites_200_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(get_invites_200_responseJSON, "bookmark");
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }


    get_invites_200_response_local_var = get_invites_200_response_create (
        itemsList,
        bookmark && !cJSON_IsNull(bookmark) ? strdup(bookmark->valuestring) : NULL
        );

    return get_invites_200_response_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            invite_response_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
