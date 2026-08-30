#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "schedules_list_200_response.h"



static schedules_list_200_response_t *schedules_list_200_response_create_internal(
    char *bookmark,
    list_t *items
    ) {
    schedules_list_200_response_t *schedules_list_200_response_local_var = malloc(sizeof(schedules_list_200_response_t));
    if (!schedules_list_200_response_local_var) {
        return NULL;
    }
    memset(schedules_list_200_response_local_var, 0, sizeof(schedules_list_200_response_t));
    schedules_list_200_response_local_var->_library_owned = 1;
    schedules_list_200_response_local_var->bookmark = bookmark;
    schedules_list_200_response_local_var->items = items;
    return schedules_list_200_response_local_var;
}

__attribute__((deprecated)) schedules_list_200_response_t *schedules_list_200_response_create(
    char *bookmark,
    list_t *items
    ) {
    schedules_list_200_response_t *result = schedules_list_200_response_create_internal (
        bookmark,
        items
        );
    if (!result) {
    }
    return result;
}

void schedules_list_200_response_free(schedules_list_200_response_t *schedules_list_200_response) {
    if(NULL == schedules_list_200_response){
        return ;
    }
    if(schedules_list_200_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "schedules_list_200_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (schedules_list_200_response->bookmark) {
        free(schedules_list_200_response->bookmark);
        schedules_list_200_response->bookmark = NULL;
    }
    if (schedules_list_200_response->items) {
        list_ForEach(listEntry, schedules_list_200_response->items) {
            schedule_free(listEntry->data);
        }
        list_freeList(schedules_list_200_response->items);
        schedules_list_200_response->items = NULL;
    }
    free(schedules_list_200_response);
}

cJSON *schedules_list_200_response_convertToJSON(schedules_list_200_response_t *schedules_list_200_response) {
    cJSON *item = cJSON_CreateObject();

    // schedules_list_200_response->bookmark
    if(schedules_list_200_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", schedules_list_200_response->bookmark) == NULL) {
    goto fail; //String
    }
    }


    // schedules_list_200_response->items
    if (!schedules_list_200_response->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (schedules_list_200_response->items) {
    list_ForEach(itemsListEntry, schedules_list_200_response->items) {
    cJSON *itemLocal = schedule_convertToJSON(itemsListEntry->data);
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

schedules_list_200_response_t *schedules_list_200_response_parseFromJSON(cJSON *schedules_list_200_responseJSON){

    schedules_list_200_response_t *schedules_list_200_response_local_var = NULL;

    char *bookmark_local_str = NULL;

    // define the local list for schedules_list_200_response->items
    list_t *itemsList = NULL;

    // schedules_list_200_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(schedules_list_200_responseJSON, "bookmark");
    if (cJSON_IsNull(bookmark)) {
        bookmark = NULL;
    }
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }

    // schedules_list_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(schedules_list_200_responseJSON, "items");
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
        schedule_t *itemsItem = schedule_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }


    if (bookmark && !cJSON_IsNull(bookmark)) bookmark_local_str = strdup(bookmark->valuestring);

    schedules_list_200_response_local_var = schedules_list_200_response_create_internal (
        bookmark_local_str,
        itemsList
        );

    if (!schedules_list_200_response_local_var) {
        goto end;
    }

    return schedules_list_200_response_local_var;
end:
    if (bookmark_local_str) {
        free(bookmark_local_str);
        bookmark_local_str = NULL;
    }
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            schedule_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
