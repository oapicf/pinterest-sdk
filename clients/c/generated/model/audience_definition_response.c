#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audience_definition_response.h"



static audience_definition_response_t *audience_definition_response_create_internal(
    list_t *items
    ) {
    audience_definition_response_t *audience_definition_response_local_var = malloc(sizeof(audience_definition_response_t));
    if (!audience_definition_response_local_var) {
        return NULL;
    }
    audience_definition_response_local_var->items = items;

    audience_definition_response_local_var->_library_owned = 1;
    return audience_definition_response_local_var;
}

__attribute__((deprecated)) audience_definition_response_t *audience_definition_response_create(
    list_t *items
    ) {
    return audience_definition_response_create_internal (
        items
        );
}

void audience_definition_response_free(audience_definition_response_t *audience_definition_response) {
    if(NULL == audience_definition_response){
        return ;
    }
    if(audience_definition_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "audience_definition_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (audience_definition_response->items) {
        list_ForEach(listEntry, audience_definition_response->items) {
            audience_definition_free(listEntry->data);
        }
        list_freeList(audience_definition_response->items);
        audience_definition_response->items = NULL;
    }
    free(audience_definition_response);
}

cJSON *audience_definition_response_convertToJSON(audience_definition_response_t *audience_definition_response) {
    cJSON *item = cJSON_CreateObject();

    // audience_definition_response->items
    if(audience_definition_response->items) {
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (audience_definition_response->items) {
    list_ForEach(itemsListEntry, audience_definition_response->items) {
    cJSON *itemLocal = audience_definition_convertToJSON(itemsListEntry->data);
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

audience_definition_response_t *audience_definition_response_parseFromJSON(cJSON *audience_definition_responseJSON){

    audience_definition_response_t *audience_definition_response_local_var = NULL;

    // define the local list for audience_definition_response->items
    list_t *itemsList = NULL;

    // audience_definition_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(audience_definition_responseJSON, "items");
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
        audience_definition_t *itemsItem = audience_definition_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }
    }


    audience_definition_response_local_var = audience_definition_response_create_internal (
        items ? itemsList : NULL
        );

    return audience_definition_response_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            audience_definition_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
