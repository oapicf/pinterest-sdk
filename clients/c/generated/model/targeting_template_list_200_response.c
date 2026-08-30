#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "targeting_template_list_200_response.h"



static targeting_template_list_200_response_t *targeting_template_list_200_response_create_internal(
    char *bookmark,
    list_t *items
    ) {
    targeting_template_list_200_response_t *targeting_template_list_200_response_local_var = malloc(sizeof(targeting_template_list_200_response_t));
    if (!targeting_template_list_200_response_local_var) {
        return NULL;
    }
    memset(targeting_template_list_200_response_local_var, 0, sizeof(targeting_template_list_200_response_t));
    targeting_template_list_200_response_local_var->_library_owned = 1;
    targeting_template_list_200_response_local_var->bookmark = bookmark;
    targeting_template_list_200_response_local_var->items = items;
    return targeting_template_list_200_response_local_var;
}

__attribute__((deprecated)) targeting_template_list_200_response_t *targeting_template_list_200_response_create(
    char *bookmark,
    list_t *items
    ) {
    targeting_template_list_200_response_t *result = targeting_template_list_200_response_create_internal (
        bookmark,
        items
        );
    if (!result) {
    }
    return result;
}

void targeting_template_list_200_response_free(targeting_template_list_200_response_t *targeting_template_list_200_response) {
    if(NULL == targeting_template_list_200_response){
        return ;
    }
    if(targeting_template_list_200_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "targeting_template_list_200_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (targeting_template_list_200_response->bookmark) {
        free(targeting_template_list_200_response->bookmark);
        targeting_template_list_200_response->bookmark = NULL;
    }
    if (targeting_template_list_200_response->items) {
        list_ForEach(listEntry, targeting_template_list_200_response->items) {
            targeting_template_free(listEntry->data);
        }
        list_freeList(targeting_template_list_200_response->items);
        targeting_template_list_200_response->items = NULL;
    }
    free(targeting_template_list_200_response);
}

cJSON *targeting_template_list_200_response_convertToJSON(targeting_template_list_200_response_t *targeting_template_list_200_response) {
    cJSON *item = cJSON_CreateObject();

    // targeting_template_list_200_response->bookmark
    if(targeting_template_list_200_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", targeting_template_list_200_response->bookmark) == NULL) {
    goto fail; //String
    }
    }


    // targeting_template_list_200_response->items
    if (!targeting_template_list_200_response->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (targeting_template_list_200_response->items) {
    list_ForEach(itemsListEntry, targeting_template_list_200_response->items) {
    cJSON *itemLocal = targeting_template_convertToJSON(itemsListEntry->data);
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

targeting_template_list_200_response_t *targeting_template_list_200_response_parseFromJSON(cJSON *targeting_template_list_200_responseJSON){

    targeting_template_list_200_response_t *targeting_template_list_200_response_local_var = NULL;

    char *bookmark_local_str = NULL;

    // define the local list for targeting_template_list_200_response->items
    list_t *itemsList = NULL;

    // targeting_template_list_200_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(targeting_template_list_200_responseJSON, "bookmark");
    if (cJSON_IsNull(bookmark)) {
        bookmark = NULL;
    }
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }

    // targeting_template_list_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(targeting_template_list_200_responseJSON, "items");
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
        targeting_template_t *itemsItem = targeting_template_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }


    if (bookmark && !cJSON_IsNull(bookmark)) bookmark_local_str = strdup(bookmark->valuestring);

    targeting_template_list_200_response_local_var = targeting_template_list_200_response_create_internal (
        bookmark_local_str,
        itemsList
        );

    if (!targeting_template_list_200_response_local_var) {
        goto end;
    }

    return targeting_template_list_200_response_local_var;
end:
    if (bookmark_local_str) {
        free(bookmark_local_str);
        bookmark_local_str = NULL;
    }
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            targeting_template_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
