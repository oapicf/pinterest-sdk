#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cancel_invites_response.h"



static cancel_invites_response_t *cancel_invites_response_create_internal(
    list_t *items
    ) {
    cancel_invites_response_t *cancel_invites_response_local_var = malloc(sizeof(cancel_invites_response_t));
    if (!cancel_invites_response_local_var) {
        return NULL;
    }
    memset(cancel_invites_response_local_var, 0, sizeof(cancel_invites_response_t));
    cancel_invites_response_local_var->_library_owned = 1;
    cancel_invites_response_local_var->items = items;
    return cancel_invites_response_local_var;
}

__attribute__((deprecated)) cancel_invites_response_t *cancel_invites_response_create(
    list_t *items
    ) {
    cancel_invites_response_t *result = cancel_invites_response_create_internal (
        items
        );
    if (!result) {
    }
    return result;
}

void cancel_invites_response_free(cancel_invites_response_t *cancel_invites_response) {
    if(NULL == cancel_invites_response){
        return ;
    }
    if(cancel_invites_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "cancel_invites_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (cancel_invites_response->items) {
        list_ForEach(listEntry, cancel_invites_response->items) {
            cancel_invite_result_item_free(listEntry->data);
        }
        list_freeList(cancel_invites_response->items);
        cancel_invites_response->items = NULL;
    }
    free(cancel_invites_response);
}

cJSON *cancel_invites_response_convertToJSON(cancel_invites_response_t *cancel_invites_response) {
    cJSON *item = cJSON_CreateObject();

    // cancel_invites_response->items
    if(cancel_invites_response->items) {
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (cancel_invites_response->items) {
    list_ForEach(itemsListEntry, cancel_invites_response->items) {
    cJSON *itemLocal = cancel_invite_result_item_convertToJSON(itemsListEntry->data);
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

cancel_invites_response_t *cancel_invites_response_parseFromJSON(cJSON *cancel_invites_responseJSON){

    cancel_invites_response_t *cancel_invites_response_local_var = NULL;

    // define the local list for cancel_invites_response->items
    list_t *itemsList = NULL;

    // cancel_invites_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(cancel_invites_responseJSON, "items");
    if (cJSON_IsNull(items)) {
        items = NULL;
    }
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
        cancel_invite_result_item_t *itemsItem = cancel_invite_result_item_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }
    }



    cancel_invites_response_local_var = cancel_invites_response_create_internal (
        items ? itemsList : NULL
        );

    if (!cancel_invites_response_local_var) {
        goto end;
    }

    return cancel_invites_response_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            cancel_invite_result_item_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
