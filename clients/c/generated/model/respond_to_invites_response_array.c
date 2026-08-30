#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "respond_to_invites_response_array.h"



static respond_to_invites_response_array_t *respond_to_invites_response_array_create_internal(
    list_t *items
    ) {
    respond_to_invites_response_array_t *respond_to_invites_response_array_local_var = malloc(sizeof(respond_to_invites_response_array_t));
    if (!respond_to_invites_response_array_local_var) {
        return NULL;
    }
    memset(respond_to_invites_response_array_local_var, 0, sizeof(respond_to_invites_response_array_t));
    respond_to_invites_response_array_local_var->_library_owned = 1;
    respond_to_invites_response_array_local_var->items = items;
    return respond_to_invites_response_array_local_var;
}

__attribute__((deprecated)) respond_to_invites_response_array_t *respond_to_invites_response_array_create(
    list_t *items
    ) {
    respond_to_invites_response_array_t *result = respond_to_invites_response_array_create_internal (
        items
        );
    if (!result) {
    }
    return result;
}

void respond_to_invites_response_array_free(respond_to_invites_response_array_t *respond_to_invites_response_array) {
    if(NULL == respond_to_invites_response_array){
        return ;
    }
    if(respond_to_invites_response_array->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "respond_to_invites_response_array_free");
        return ;
    }
    listEntry_t *listEntry;
    if (respond_to_invites_response_array->items) {
        list_ForEach(listEntry, respond_to_invites_response_array->items) {
            respond_to_invite_result_item_free(listEntry->data);
        }
        list_freeList(respond_to_invites_response_array->items);
        respond_to_invites_response_array->items = NULL;
    }
    free(respond_to_invites_response_array);
}

cJSON *respond_to_invites_response_array_convertToJSON(respond_to_invites_response_array_t *respond_to_invites_response_array) {
    cJSON *item = cJSON_CreateObject();

    // respond_to_invites_response_array->items
    if(respond_to_invites_response_array->items) {
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (respond_to_invites_response_array->items) {
    list_ForEach(itemsListEntry, respond_to_invites_response_array->items) {
    cJSON *itemLocal = respond_to_invite_result_item_convertToJSON(itemsListEntry->data);
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

respond_to_invites_response_array_t *respond_to_invites_response_array_parseFromJSON(cJSON *respond_to_invites_response_arrayJSON){

    respond_to_invites_response_array_t *respond_to_invites_response_array_local_var = NULL;

    // define the local list for respond_to_invites_response_array->items
    list_t *itemsList = NULL;

    // respond_to_invites_response_array->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(respond_to_invites_response_arrayJSON, "items");
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
        respond_to_invite_result_item_t *itemsItem = respond_to_invite_result_item_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }
    }



    respond_to_invites_response_array_local_var = respond_to_invites_response_array_create_internal (
        items ? itemsList : NULL
        );

    if (!respond_to_invites_response_array_local_var) {
        goto end;
    }

    return respond_to_invites_response_array_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            respond_to_invite_result_item_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
