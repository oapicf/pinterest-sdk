#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "billing_profiles_get_200_response.h"



billing_profiles_get_200_response_t *billing_profiles_get_200_response_create(
    list_t *items,
    char *bookmark
    ) {
    billing_profiles_get_200_response_t *billing_profiles_get_200_response_local_var = malloc(sizeof(billing_profiles_get_200_response_t));
    if (!billing_profiles_get_200_response_local_var) {
        return NULL;
    }
    billing_profiles_get_200_response_local_var->items = items;
    billing_profiles_get_200_response_local_var->bookmark = bookmark;

    return billing_profiles_get_200_response_local_var;
}


void billing_profiles_get_200_response_free(billing_profiles_get_200_response_t *billing_profiles_get_200_response) {
    if(NULL == billing_profiles_get_200_response){
        return ;
    }
    listEntry_t *listEntry;
    if (billing_profiles_get_200_response->items) {
        list_ForEach(listEntry, billing_profiles_get_200_response->items) {
            billing_profiles_response_free(listEntry->data);
        }
        list_freeList(billing_profiles_get_200_response->items);
        billing_profiles_get_200_response->items = NULL;
    }
    if (billing_profiles_get_200_response->bookmark) {
        free(billing_profiles_get_200_response->bookmark);
        billing_profiles_get_200_response->bookmark = NULL;
    }
    free(billing_profiles_get_200_response);
}

cJSON *billing_profiles_get_200_response_convertToJSON(billing_profiles_get_200_response_t *billing_profiles_get_200_response) {
    cJSON *item = cJSON_CreateObject();

    // billing_profiles_get_200_response->items
    if (!billing_profiles_get_200_response->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (billing_profiles_get_200_response->items) {
    list_ForEach(itemsListEntry, billing_profiles_get_200_response->items) {
    cJSON *itemLocal = billing_profiles_response_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }


    // billing_profiles_get_200_response->bookmark
    if(billing_profiles_get_200_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", billing_profiles_get_200_response->bookmark) == NULL) {
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

billing_profiles_get_200_response_t *billing_profiles_get_200_response_parseFromJSON(cJSON *billing_profiles_get_200_responseJSON){

    billing_profiles_get_200_response_t *billing_profiles_get_200_response_local_var = NULL;

    // define the local list for billing_profiles_get_200_response->items
    list_t *itemsList = NULL;

    // billing_profiles_get_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(billing_profiles_get_200_responseJSON, "items");
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
        billing_profiles_response_t *itemsItem = billing_profiles_response_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }

    // billing_profiles_get_200_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(billing_profiles_get_200_responseJSON, "bookmark");
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }


    billing_profiles_get_200_response_local_var = billing_profiles_get_200_response_create (
        itemsList,
        bookmark && !cJSON_IsNull(bookmark) ? strdup(bookmark->valuestring) : NULL
        );

    return billing_profiles_get_200_response_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            billing_profiles_response_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
