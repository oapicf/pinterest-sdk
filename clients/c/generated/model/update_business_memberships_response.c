#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_business_memberships_response.h"



static update_business_memberships_response_t *update_business_memberships_response_create_internal(
    list_t *items
    ) {
    update_business_memberships_response_t *update_business_memberships_response_local_var = malloc(sizeof(update_business_memberships_response_t));
    if (!update_business_memberships_response_local_var) {
        return NULL;
    }
    memset(update_business_memberships_response_local_var, 0, sizeof(update_business_memberships_response_t));
    update_business_memberships_response_local_var->_library_owned = 1;
    update_business_memberships_response_local_var->items = items;
    return update_business_memberships_response_local_var;
}

__attribute__((deprecated)) update_business_memberships_response_t *update_business_memberships_response_create(
    list_t *items
    ) {
    update_business_memberships_response_t *result = update_business_memberships_response_create_internal (
        items
        );
    if (!result) {
    }
    return result;
}

void update_business_memberships_response_free(update_business_memberships_response_t *update_business_memberships_response) {
    if(NULL == update_business_memberships_response){
        return ;
    }
    if(update_business_memberships_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "update_business_memberships_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (update_business_memberships_response->items) {
        list_ForEach(listEntry, update_business_memberships_response->items) {
            business_membership_member_free(listEntry->data);
        }
        list_freeList(update_business_memberships_response->items);
        update_business_memberships_response->items = NULL;
    }
    free(update_business_memberships_response);
}

cJSON *update_business_memberships_response_convertToJSON(update_business_memberships_response_t *update_business_memberships_response) {
    cJSON *item = cJSON_CreateObject();

    // update_business_memberships_response->items
    if(update_business_memberships_response->items) {
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (update_business_memberships_response->items) {
    list_ForEach(itemsListEntry, update_business_memberships_response->items) {
    cJSON *itemLocal = business_membership_member_convertToJSON(itemsListEntry->data);
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

update_business_memberships_response_t *update_business_memberships_response_parseFromJSON(cJSON *update_business_memberships_responseJSON){

    update_business_memberships_response_t *update_business_memberships_response_local_var = NULL;

    // define the local list for update_business_memberships_response->items
    list_t *itemsList = NULL;

    // update_business_memberships_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(update_business_memberships_responseJSON, "items");
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
        business_membership_member_t *itemsItem = business_membership_member_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }
    }



    update_business_memberships_response_local_var = update_business_memberships_response_create_internal (
        items ? itemsList : NULL
        );

    if (!update_business_memberships_response_local_var) {
        goto end;
    }

    return update_business_memberships_response_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            business_membership_member_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
