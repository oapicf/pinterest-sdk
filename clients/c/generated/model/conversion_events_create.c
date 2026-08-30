#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_events_create.h"



static conversion_events_create_t *conversion_events_create_create_internal(
    list_t *data
    ) {
    conversion_events_create_t *conversion_events_create_local_var = malloc(sizeof(conversion_events_create_t));
    if (!conversion_events_create_local_var) {
        return NULL;
    }
    memset(conversion_events_create_local_var, 0, sizeof(conversion_events_create_t));
    conversion_events_create_local_var->_library_owned = 1;
    conversion_events_create_local_var->data = data;
    return conversion_events_create_local_var;
}

__attribute__((deprecated)) conversion_events_create_t *conversion_events_create_create(
    list_t *data
    ) {
    conversion_events_create_t *result = conversion_events_create_create_internal (
        data
        );
    if (!result) {
    }
    return result;
}

void conversion_events_create_free(conversion_events_create_t *conversion_events_create) {
    if(NULL == conversion_events_create){
        return ;
    }
    if(conversion_events_create->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "conversion_events_create_free");
        return ;
    }
    listEntry_t *listEntry;
    if (conversion_events_create->data) {
        list_ForEach(listEntry, conversion_events_create->data) {
            conversion_events_data_items_free(listEntry->data);
        }
        list_freeList(conversion_events_create->data);
        conversion_events_create->data = NULL;
    }
    free(conversion_events_create);
}

cJSON *conversion_events_create_convertToJSON(conversion_events_create_t *conversion_events_create) {
    cJSON *item = cJSON_CreateObject();

    // conversion_events_create->data
    if (!conversion_events_create->data) {
        goto fail;
    }
    cJSON *data = cJSON_AddArrayToObject(item, "data");
    if(data == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *dataListEntry;
    if (conversion_events_create->data) {
    list_ForEach(dataListEntry, conversion_events_create->data) {
    cJSON *itemLocal = conversion_events_data_items_convertToJSON(dataListEntry->data);
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

conversion_events_create_t *conversion_events_create_parseFromJSON(cJSON *conversion_events_createJSON){

    conversion_events_create_t *conversion_events_create_local_var = NULL;

    // define the local list for conversion_events_create->data
    list_t *dataList = NULL;

    // conversion_events_create->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(conversion_events_createJSON, "data");
    if (cJSON_IsNull(data)) {
        data = NULL;
    }
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
        conversion_events_data_items_t *dataItem = conversion_events_data_items_parseFromJSON(data_local_nonprimitive);

        list_addElement(dataList, dataItem);
    }



    conversion_events_create_local_var = conversion_events_create_create_internal (
        dataList
        );

    if (!conversion_events_create_local_var) {
        goto end;
    }

    return conversion_events_create_local_var;
end:
    if (dataList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, dataList) {
            conversion_events_data_items_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(dataList);
        dataList = NULL;
    }
    return NULL;

}
