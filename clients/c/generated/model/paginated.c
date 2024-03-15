#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "paginated.h"



paginated_t *paginated_create(
    list_t *items,
    char *bookmark
    ) {
    paginated_t *paginated_local_var = malloc(sizeof(paginated_t));
    if (!paginated_local_var) {
        return NULL;
    }
    paginated_local_var->items = items;
    paginated_local_var->bookmark = bookmark;

    return paginated_local_var;
}


void paginated_free(paginated_t *paginated) {
    if(NULL == paginated){
        return ;
    }
    listEntry_t *listEntry;
    if (paginated->items) {
        list_ForEach(listEntry, paginated->items) {
            object_free(listEntry->data);
        }
        list_freeList(paginated->items);
        paginated->items = NULL;
    }
    if (paginated->bookmark) {
        free(paginated->bookmark);
        paginated->bookmark = NULL;
    }
    free(paginated);
}

cJSON *paginated_convertToJSON(paginated_t *paginated) {
    cJSON *item = cJSON_CreateObject();

    // paginated->items
    if (!paginated->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (paginated->items) {
    list_ForEach(itemsListEntry, paginated->items) {
    cJSON *itemLocal = object_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }


    // paginated->bookmark
    if(paginated->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", paginated->bookmark) == NULL) {
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

paginated_t *paginated_parseFromJSON(cJSON *paginatedJSON){

    paginated_t *paginated_local_var = NULL;

    // define the local list for paginated->items
    list_t *itemsList = NULL;

    // paginated->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(paginatedJSON, "items");
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
        object_t *itemsItem = object_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }

    // paginated->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(paginatedJSON, "bookmark");
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }


    paginated_local_var = paginated_create (
        itemsList,
        bookmark && !cJSON_IsNull(bookmark) ? strdup(bookmark->valuestring) : NULL
        );

    return paginated_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            object_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
