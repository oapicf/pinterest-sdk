#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "integrations_get_list_200_response.h"



integrations_get_list_200_response_t *integrations_get_list_200_response_create(
    list_t *items,
    char *bookmark
    ) {
    integrations_get_list_200_response_t *integrations_get_list_200_response_local_var = malloc(sizeof(integrations_get_list_200_response_t));
    if (!integrations_get_list_200_response_local_var) {
        return NULL;
    }
    integrations_get_list_200_response_local_var->items = items;
    integrations_get_list_200_response_local_var->bookmark = bookmark;

    return integrations_get_list_200_response_local_var;
}


void integrations_get_list_200_response_free(integrations_get_list_200_response_t *integrations_get_list_200_response) {
    if(NULL == integrations_get_list_200_response){
        return ;
    }
    listEntry_t *listEntry;
    if (integrations_get_list_200_response->items) {
        list_ForEach(listEntry, integrations_get_list_200_response->items) {
            integration_record_free(listEntry->data);
        }
        list_freeList(integrations_get_list_200_response->items);
        integrations_get_list_200_response->items = NULL;
    }
    if (integrations_get_list_200_response->bookmark) {
        free(integrations_get_list_200_response->bookmark);
        integrations_get_list_200_response->bookmark = NULL;
    }
    free(integrations_get_list_200_response);
}

cJSON *integrations_get_list_200_response_convertToJSON(integrations_get_list_200_response_t *integrations_get_list_200_response) {
    cJSON *item = cJSON_CreateObject();

    // integrations_get_list_200_response->items
    if (!integrations_get_list_200_response->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (integrations_get_list_200_response->items) {
    list_ForEach(itemsListEntry, integrations_get_list_200_response->items) {
    cJSON *itemLocal = integration_record_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }


    // integrations_get_list_200_response->bookmark
    if(integrations_get_list_200_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", integrations_get_list_200_response->bookmark) == NULL) {
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

integrations_get_list_200_response_t *integrations_get_list_200_response_parseFromJSON(cJSON *integrations_get_list_200_responseJSON){

    integrations_get_list_200_response_t *integrations_get_list_200_response_local_var = NULL;

    // define the local list for integrations_get_list_200_response->items
    list_t *itemsList = NULL;

    // integrations_get_list_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(integrations_get_list_200_responseJSON, "items");
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
        integration_record_t *itemsItem = integration_record_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }

    // integrations_get_list_200_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(integrations_get_list_200_responseJSON, "bookmark");
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }


    integrations_get_list_200_response_local_var = integrations_get_list_200_response_create (
        itemsList,
        bookmark && !cJSON_IsNull(bookmark) ? strdup(bookmark->valuestring) : NULL
        );

    return integrations_get_list_200_response_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            integration_record_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
