#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "templates_list_200_response.h"



static templates_list_200_response_t *templates_list_200_response_create_internal(
    char *bookmark,
    list_t *items
    ) {
    templates_list_200_response_t *templates_list_200_response_local_var = malloc(sizeof(templates_list_200_response_t));
    if (!templates_list_200_response_local_var) {
        return NULL;
    }
    memset(templates_list_200_response_local_var, 0, sizeof(templates_list_200_response_t));
    templates_list_200_response_local_var->_library_owned = 1;
    templates_list_200_response_local_var->bookmark = bookmark;
    templates_list_200_response_local_var->items = items;
    return templates_list_200_response_local_var;
}

__attribute__((deprecated)) templates_list_200_response_t *templates_list_200_response_create(
    char *bookmark,
    list_t *items
    ) {
    templates_list_200_response_t *result = templates_list_200_response_create_internal (
        bookmark,
        items
        );
    if (!result) {
    }
    return result;
}

void templates_list_200_response_free(templates_list_200_response_t *templates_list_200_response) {
    if(NULL == templates_list_200_response){
        return ;
    }
    if(templates_list_200_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "templates_list_200_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (templates_list_200_response->bookmark) {
        free(templates_list_200_response->bookmark);
        templates_list_200_response->bookmark = NULL;
    }
    if (templates_list_200_response->items) {
        list_ForEach(listEntry, templates_list_200_response->items) {
            account_template_free(listEntry->data);
        }
        list_freeList(templates_list_200_response->items);
        templates_list_200_response->items = NULL;
    }
    free(templates_list_200_response);
}

cJSON *templates_list_200_response_convertToJSON(templates_list_200_response_t *templates_list_200_response) {
    cJSON *item = cJSON_CreateObject();

    // templates_list_200_response->bookmark
    if(templates_list_200_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", templates_list_200_response->bookmark) == NULL) {
    goto fail; //String
    }
    }


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
    cJSON *itemLocal = account_template_convertToJSON(itemsListEntry->data);
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

templates_list_200_response_t *templates_list_200_response_parseFromJSON(cJSON *templates_list_200_responseJSON){

    templates_list_200_response_t *templates_list_200_response_local_var = NULL;

    char *bookmark_local_str = NULL;

    // define the local list for templates_list_200_response->items
    list_t *itemsList = NULL;

    // templates_list_200_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(templates_list_200_responseJSON, "bookmark");
    if (cJSON_IsNull(bookmark)) {
        bookmark = NULL;
    }
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }

    // templates_list_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(templates_list_200_responseJSON, "items");
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
        account_template_t *itemsItem = account_template_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }


    if (bookmark && !cJSON_IsNull(bookmark)) bookmark_local_str = strdup(bookmark->valuestring);

    templates_list_200_response_local_var = templates_list_200_response_create_internal (
        bookmark_local_str,
        itemsList
        );

    if (!templates_list_200_response_local_var) {
        goto end;
    }

    return templates_list_200_response_local_var;
end:
    if (bookmark_local_str) {
        free(bookmark_local_str);
        bookmark_local_str = NULL;
    }
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            account_template_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
