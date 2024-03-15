#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_events.h"



conversion_events_t *conversion_events_create(
    list_t *data
    ) {
    conversion_events_t *conversion_events_local_var = malloc(sizeof(conversion_events_t));
    if (!conversion_events_local_var) {
        return NULL;
    }
    conversion_events_local_var->data = data;

    return conversion_events_local_var;
}


void conversion_events_free(conversion_events_t *conversion_events) {
    if(NULL == conversion_events){
        return ;
    }
    listEntry_t *listEntry;
    if (conversion_events->data) {
        list_ForEach(listEntry, conversion_events->data) {
            conversion_events_data_inner_free(listEntry->data);
        }
        list_freeList(conversion_events->data);
        conversion_events->data = NULL;
    }
    free(conversion_events);
}

cJSON *conversion_events_convertToJSON(conversion_events_t *conversion_events) {
    cJSON *item = cJSON_CreateObject();

    // conversion_events->data
    if (!conversion_events->data) {
        goto fail;
    }
    cJSON *data = cJSON_AddArrayToObject(item, "data");
    if(data == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *dataListEntry;
    if (conversion_events->data) {
    list_ForEach(dataListEntry, conversion_events->data) {
    cJSON *itemLocal = conversion_events_data_inner_convertToJSON(dataListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(data, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

conversion_events_t *conversion_events_parseFromJSON(cJSON *conversion_eventsJSON){

    conversion_events_t *conversion_events_local_var = NULL;

    // define the local list for conversion_events->data
    list_t *dataList = NULL;

    // conversion_events->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(conversion_eventsJSON, "data");
    if (!data) {
        goto end;
    }

    
    cJSON *data_local_nonprimitive = NULL;
    if(!cJSON_IsArray(data)){
        goto end; //nonprimitive container
    }

    dataList = list_createList();

    cJSON_ArrayForEach(data_local_nonprimitive,data )
    {
        if(!cJSON_IsObject(data_local_nonprimitive)){
            goto end;
        }
        conversion_events_data_inner_t *dataItem = conversion_events_data_inner_parseFromJSON(data_local_nonprimitive);

        list_addElement(dataList, dataItem);
    }


    conversion_events_local_var = conversion_events_create (
        dataList
        );

    return conversion_events_local_var;
end:
    if (dataList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, dataList) {
            conversion_events_data_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(dataList);
        dataList = NULL;
    }
    return NULL;

}
