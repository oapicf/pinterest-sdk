#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audience_insight_category_array_response.h"



audience_insight_category_array_response_t *audience_insight_category_array_response_create(
    list_t *items
    ) {
    audience_insight_category_array_response_t *audience_insight_category_array_response_local_var = malloc(sizeof(audience_insight_category_array_response_t));
    if (!audience_insight_category_array_response_local_var) {
        return NULL;
    }
    audience_insight_category_array_response_local_var->items = items;

    return audience_insight_category_array_response_local_var;
}


void audience_insight_category_array_response_free(audience_insight_category_array_response_t *audience_insight_category_array_response) {
    if(NULL == audience_insight_category_array_response){
        return ;
    }
    listEntry_t *listEntry;
    if (audience_insight_category_array_response->items) {
        list_ForEach(listEntry, audience_insight_category_array_response->items) {
            audience_insight_category_common_free(listEntry->data);
        }
        list_freeList(audience_insight_category_array_response->items);
        audience_insight_category_array_response->items = NULL;
    }
    free(audience_insight_category_array_response);
}

cJSON *audience_insight_category_array_response_convertToJSON(audience_insight_category_array_response_t *audience_insight_category_array_response) {
    cJSON *item = cJSON_CreateObject();

    // audience_insight_category_array_response->items
    if(audience_insight_category_array_response->items) {
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (audience_insight_category_array_response->items) {
    list_ForEach(itemsListEntry, audience_insight_category_array_response->items) {
    cJSON *itemLocal = audience_insight_category_common_convertToJSON(itemsListEntry->data);
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

audience_insight_category_array_response_t *audience_insight_category_array_response_parseFromJSON(cJSON *audience_insight_category_array_responseJSON){

    audience_insight_category_array_response_t *audience_insight_category_array_response_local_var = NULL;

    // define the local list for audience_insight_category_array_response->items
    list_t *itemsList = NULL;

    // audience_insight_category_array_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(audience_insight_category_array_responseJSON, "items");
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
        audience_insight_category_common_t *itemsItem = audience_insight_category_common_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }
    }


    audience_insight_category_array_response_local_var = audience_insight_category_array_response_create (
        items ? itemsList : NULL
        );

    return audience_insight_category_array_response_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            audience_insight_category_common_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
