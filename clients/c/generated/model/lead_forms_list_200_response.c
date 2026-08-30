#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "lead_forms_list_200_response.h"



static lead_forms_list_200_response_t *lead_forms_list_200_response_create_internal(
    char *bookmark,
    list_t *items
    ) {
    lead_forms_list_200_response_t *lead_forms_list_200_response_local_var = malloc(sizeof(lead_forms_list_200_response_t));
    if (!lead_forms_list_200_response_local_var) {
        return NULL;
    }
    memset(lead_forms_list_200_response_local_var, 0, sizeof(lead_forms_list_200_response_t));
    lead_forms_list_200_response_local_var->_library_owned = 1;
    lead_forms_list_200_response_local_var->bookmark = bookmark;
    lead_forms_list_200_response_local_var->items = items;
    return lead_forms_list_200_response_local_var;
}

__attribute__((deprecated)) lead_forms_list_200_response_t *lead_forms_list_200_response_create(
    char *bookmark,
    list_t *items
    ) {
    lead_forms_list_200_response_t *result = lead_forms_list_200_response_create_internal (
        bookmark,
        items
        );
    if (!result) {
    }
    return result;
}

void lead_forms_list_200_response_free(lead_forms_list_200_response_t *lead_forms_list_200_response) {
    if(NULL == lead_forms_list_200_response){
        return ;
    }
    if(lead_forms_list_200_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "lead_forms_list_200_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (lead_forms_list_200_response->bookmark) {
        free(lead_forms_list_200_response->bookmark);
        lead_forms_list_200_response->bookmark = NULL;
    }
    if (lead_forms_list_200_response->items) {
        list_ForEach(listEntry, lead_forms_list_200_response->items) {
            lead_form_free(listEntry->data);
        }
        list_freeList(lead_forms_list_200_response->items);
        lead_forms_list_200_response->items = NULL;
    }
    free(lead_forms_list_200_response);
}

cJSON *lead_forms_list_200_response_convertToJSON(lead_forms_list_200_response_t *lead_forms_list_200_response) {
    cJSON *item = cJSON_CreateObject();

    // lead_forms_list_200_response->bookmark
    if(lead_forms_list_200_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", lead_forms_list_200_response->bookmark) == NULL) {
    goto fail; //String
    }
    }


    // lead_forms_list_200_response->items
    if (!lead_forms_list_200_response->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (lead_forms_list_200_response->items) {
    list_ForEach(itemsListEntry, lead_forms_list_200_response->items) {
    cJSON *itemLocal = lead_form_convertToJSON(itemsListEntry->data);
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

lead_forms_list_200_response_t *lead_forms_list_200_response_parseFromJSON(cJSON *lead_forms_list_200_responseJSON){

    lead_forms_list_200_response_t *lead_forms_list_200_response_local_var = NULL;

    char *bookmark_local_str = NULL;

    // define the local list for lead_forms_list_200_response->items
    list_t *itemsList = NULL;

    // lead_forms_list_200_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(lead_forms_list_200_responseJSON, "bookmark");
    if (cJSON_IsNull(bookmark)) {
        bookmark = NULL;
    }
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }

    // lead_forms_list_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(lead_forms_list_200_responseJSON, "items");
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
        lead_form_t *itemsItem = lead_form_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }


    if (bookmark && !cJSON_IsNull(bookmark)) bookmark_local_str = strdup(bookmark->valuestring);

    lead_forms_list_200_response_local_var = lead_forms_list_200_response_create_internal (
        bookmark_local_str,
        itemsList
        );

    if (!lead_forms_list_200_response_local_var) {
        goto end;
    }

    return lead_forms_list_200_response_local_var;
end:
    if (bookmark_local_str) {
        free(bookmark_local_str);
        bookmark_local_str = NULL;
    }
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            lead_form_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
