#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audiences_list_200_response.h"



static audiences_list_200_response_t *audiences_list_200_response_create_internal(
    char *bookmark,
    list_t *items
    ) {
    audiences_list_200_response_t *audiences_list_200_response_local_var = malloc(sizeof(audiences_list_200_response_t));
    if (!audiences_list_200_response_local_var) {
        return NULL;
    }
    memset(audiences_list_200_response_local_var, 0, sizeof(audiences_list_200_response_t));
    audiences_list_200_response_local_var->_library_owned = 1;
    audiences_list_200_response_local_var->bookmark = bookmark;
    audiences_list_200_response_local_var->items = items;
    return audiences_list_200_response_local_var;
}

__attribute__((deprecated)) audiences_list_200_response_t *audiences_list_200_response_create(
    char *bookmark,
    list_t *items
    ) {
    audiences_list_200_response_t *result = audiences_list_200_response_create_internal (
        bookmark,
        items
        );
    if (!result) {
    }
    return result;
}

void audiences_list_200_response_free(audiences_list_200_response_t *audiences_list_200_response) {
    if(NULL == audiences_list_200_response){
        return ;
    }
    if(audiences_list_200_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "audiences_list_200_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (audiences_list_200_response->bookmark) {
        free(audiences_list_200_response->bookmark);
        audiences_list_200_response->bookmark = NULL;
    }
    if (audiences_list_200_response->items) {
        list_ForEach(listEntry, audiences_list_200_response->items) {
            ad_accounts_audience_free(listEntry->data);
        }
        list_freeList(audiences_list_200_response->items);
        audiences_list_200_response->items = NULL;
    }
    free(audiences_list_200_response);
}

cJSON *audiences_list_200_response_convertToJSON(audiences_list_200_response_t *audiences_list_200_response) {
    cJSON *item = cJSON_CreateObject();

    // audiences_list_200_response->bookmark
    if(audiences_list_200_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", audiences_list_200_response->bookmark) == NULL) {
    goto fail; //String
    }
    }


    // audiences_list_200_response->items
    if (!audiences_list_200_response->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (audiences_list_200_response->items) {
    list_ForEach(itemsListEntry, audiences_list_200_response->items) {
    cJSON *itemLocal = ad_accounts_audience_convertToJSON(itemsListEntry->data);
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

audiences_list_200_response_t *audiences_list_200_response_parseFromJSON(cJSON *audiences_list_200_responseJSON){

    audiences_list_200_response_t *audiences_list_200_response_local_var = NULL;

    char *bookmark_local_str = NULL;

    // define the local list for audiences_list_200_response->items
    list_t *itemsList = NULL;

    // audiences_list_200_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(audiences_list_200_responseJSON, "bookmark");
    if (cJSON_IsNull(bookmark)) {
        bookmark = NULL;
    }
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }

    // audiences_list_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(audiences_list_200_responseJSON, "items");
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
        ad_accounts_audience_t *itemsItem = ad_accounts_audience_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }


    if (bookmark && !cJSON_IsNull(bookmark)) bookmark_local_str = strdup(bookmark->valuestring);

    audiences_list_200_response_local_var = audiences_list_200_response_create_internal (
        bookmark_local_str,
        itemsList
        );

    if (!audiences_list_200_response_local_var) {
        goto end;
    }

    return audiences_list_200_response_local_var;
end:
    if (bookmark_local_str) {
        free(bookmark_local_str);
        bookmark_local_str = NULL;
    }
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            ad_accounts_audience_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
