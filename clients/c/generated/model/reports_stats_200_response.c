#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "reports_stats_200_response.h"



reports_stats_200_response_t *reports_stats_200_response_create(
    list_t *items,
    char *bookmark
    ) {
    reports_stats_200_response_t *reports_stats_200_response_local_var = malloc(sizeof(reports_stats_200_response_t));
    if (!reports_stats_200_response_local_var) {
        return NULL;
    }
    reports_stats_200_response_local_var->items = items;
    reports_stats_200_response_local_var->bookmark = bookmark;

    return reports_stats_200_response_local_var;
}


void reports_stats_200_response_free(reports_stats_200_response_t *reports_stats_200_response) {
    if(NULL == reports_stats_200_response){
        return ;
    }
    listEntry_t *listEntry;
    if (reports_stats_200_response->items) {
        list_ForEach(listEntry, reports_stats_200_response->items) {
            catalogs_report_stats_free(listEntry->data);
        }
        list_freeList(reports_stats_200_response->items);
        reports_stats_200_response->items = NULL;
    }
    if (reports_stats_200_response->bookmark) {
        free(reports_stats_200_response->bookmark);
        reports_stats_200_response->bookmark = NULL;
    }
    free(reports_stats_200_response);
}

cJSON *reports_stats_200_response_convertToJSON(reports_stats_200_response_t *reports_stats_200_response) {
    cJSON *item = cJSON_CreateObject();

    // reports_stats_200_response->items
    if (!reports_stats_200_response->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (reports_stats_200_response->items) {
    list_ForEach(itemsListEntry, reports_stats_200_response->items) {
    cJSON *itemLocal = catalogs_report_stats_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }


    // reports_stats_200_response->bookmark
    if(reports_stats_200_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", reports_stats_200_response->bookmark) == NULL) {
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

reports_stats_200_response_t *reports_stats_200_response_parseFromJSON(cJSON *reports_stats_200_responseJSON){

    reports_stats_200_response_t *reports_stats_200_response_local_var = NULL;

    // define the local list for reports_stats_200_response->items
    list_t *itemsList = NULL;

    // reports_stats_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(reports_stats_200_responseJSON, "items");
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
        catalogs_report_stats_t *itemsItem = catalogs_report_stats_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }

    // reports_stats_200_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(reports_stats_200_responseJSON, "bookmark");
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }


    reports_stats_200_response_local_var = reports_stats_200_response_create (
        itemsList,
        bookmark && !cJSON_IsNull(bookmark) ? strdup(bookmark->valuestring) : NULL
        );

    return reports_stats_200_response_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            catalogs_report_stats_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
