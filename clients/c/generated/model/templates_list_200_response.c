#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "templates_list_200_response.h"



templates_list_200_response_t *templates_list_200_response_create(
    list_t *items,
    char *bookmark
    ) {
    templates_list_200_response_t *templates_list_200_response_local_var = malloc(sizeof(templates_list_200_response_t));
    if (!templates_list_200_response_local_var) {
        return NULL;
    }
    templates_list_200_response_local_var->items = items;
    templates_list_200_response_local_var->bookmark = bookmark;

    return templates_list_200_response_local_var;
}


void templates_list_200_response_free(templates_list_200_response_t *templates_list_200_response) {
    if(NULL == templates_list_200_response){
        return ;
    }
    listEntry_t *listEntry;
    if (templates_list_200_response->items) {
        list_ForEach(listEntry, templates_list_200_response->items) {
            template_response_free(listEntry->data);
        }
        list_freeList(templates_list_200_response->items);
        templates_list_200_response->items = NULL;
    }
    if (templates_list_200_response->bookmark) {
        free(templates_list_200_response->bookmark);
        templates_list_200_response->bookmark = NULL;
    }
    free(templates_list_200_response);
}

cJSON *templates_list_200_response_convertToJSON(templates_list_200_response_t *templates_list_200_response) {
    cJSON *item = cJSON_CreateObject();

    // templates_list_200_response->items
    if (!templates_list_200_response->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (templates_list_200_response->items) {
    list_ForEach(itemsListEntry, templates_list_200_response->items) {
    cJSON *itemLocal = template_response_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }


    // templates_list_200_response->bookmark
    if(templates_list_200_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", templates_list_200_response->bookmark) == NULL) {
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

templates_list_200_response_t *templates_list_200_response_parseFromJSON(cJSON *templates_list_200_responseJSON){

    templates_list_200_response_t *templates_list_200_response_local_var = NULL;

    // define the local list for templates_list_200_response->items
    list_t *itemsList = NULL;

    // templates_list_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(templates_list_200_responseJSON, "items");
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
        template_response_t *itemsItem = template_response_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }

    // templates_list_200_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(templates_list_200_responseJSON, "bookmark");
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }


    templates_list_200_response_local_var = templates_list_200_response_create (
        itemsList,
        bookmark && !cJSON_IsNull(bookmark) ? strdup(bookmark->valuestring) : NULL
        );

    return templates_list_200_response_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            template_response_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
