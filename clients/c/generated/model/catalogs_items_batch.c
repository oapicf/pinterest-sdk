#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_items_batch.h"


char* catalogs_items_batch_catalog_type_ToString(pinterest_rest_api_catalogs_items_batch__e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "RETAIL", "HOTEL", "CREATIVE_ASSETS" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_catalogs_items_batch__e catalogs_items_batch_catalog_type_FromString(char* catalog_type){
    int stringToReturn = 0;
    char *catalog_typeArray[] =  { "NULL", "RETAIL", "HOTEL", "CREATIVE_ASSETS" };
    size_t sizeofArray = sizeof(catalog_typeArray) / sizeof(catalog_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(catalog_type, catalog_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* catalogs_items_batch_status_ToString(pinterest_rest_api_catalogs_items_batch__e status) {
    char* statusArray[] =  { "NULL", "PROCESSING", "COMPLETED", "FAILED" };
    return statusArray[status];
}

pinterest_rest_api_catalogs_items_batch__e catalogs_items_batch_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "PROCESSING", "COMPLETED", "FAILED" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

catalogs_items_batch_t *catalogs_items_batch_create(
    catalogs_type_t *catalog_type,
    char *batch_id,
    char *created_time,
    char *completed_time,
    batch_operation_status_t *status,
    list_t *items
    ) {
    catalogs_items_batch_t *catalogs_items_batch_local_var = malloc(sizeof(catalogs_items_batch_t));
    if (!catalogs_items_batch_local_var) {
        return NULL;
    }
    catalogs_items_batch_local_var->catalog_type = catalog_type;
    catalogs_items_batch_local_var->batch_id = batch_id;
    catalogs_items_batch_local_var->created_time = created_time;
    catalogs_items_batch_local_var->completed_time = completed_time;
    catalogs_items_batch_local_var->status = status;
    catalogs_items_batch_local_var->items = items;

    return catalogs_items_batch_local_var;
}


void catalogs_items_batch_free(catalogs_items_batch_t *catalogs_items_batch) {
    if(NULL == catalogs_items_batch){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_items_batch->catalog_type) {
        catalogs_type_free(catalogs_items_batch->catalog_type);
        catalogs_items_batch->catalog_type = NULL;
    }
    if (catalogs_items_batch->batch_id) {
        free(catalogs_items_batch->batch_id);
        catalogs_items_batch->batch_id = NULL;
    }
    if (catalogs_items_batch->created_time) {
        free(catalogs_items_batch->created_time);
        catalogs_items_batch->created_time = NULL;
    }
    if (catalogs_items_batch->completed_time) {
        free(catalogs_items_batch->completed_time);
        catalogs_items_batch->completed_time = NULL;
    }
    if (catalogs_items_batch->status) {
        batch_operation_status_free(catalogs_items_batch->status);
        catalogs_items_batch->status = NULL;
    }
    if (catalogs_items_batch->items) {
        list_ForEach(listEntry, catalogs_items_batch->items) {
            creative_assets_processing_record_free(listEntry->data);
        }
        list_freeList(catalogs_items_batch->items);
        catalogs_items_batch->items = NULL;
    }
    free(catalogs_items_batch);
}

cJSON *catalogs_items_batch_convertToJSON(catalogs_items_batch_t *catalogs_items_batch) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_items_batch->catalog_type
    if (pinterest_rest_api_catalogs_items_batch__NULL == catalogs_items_batch->catalog_type) {
        goto fail;
    }
    cJSON *catalog_type_local_JSON = catalogs_type_convertToJSON(catalogs_items_batch->catalog_type);
    if(catalog_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "catalog_type", catalog_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_items_batch->batch_id
    if(catalogs_items_batch->batch_id) {
    if(cJSON_AddStringToObject(item, "batch_id", catalogs_items_batch->batch_id) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_items_batch->created_time
    if(catalogs_items_batch->created_time) {
    if(cJSON_AddStringToObject(item, "created_time", catalogs_items_batch->created_time) == NULL) {
    goto fail; //Date-Time
    }
    }


    // catalogs_items_batch->completed_time
    if(catalogs_items_batch->completed_time) {
    if(cJSON_AddStringToObject(item, "completed_time", catalogs_items_batch->completed_time) == NULL) {
    goto fail; //Date-Time
    }
    }


    // catalogs_items_batch->status
    if(catalogs_items_batch->status != pinterest_rest_api_catalogs_items_batch__NULL) {
    cJSON *status_local_JSON = batch_operation_status_convertToJSON(catalogs_items_batch->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // catalogs_items_batch->items
    if(catalogs_items_batch->items) {
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (catalogs_items_batch->items) {
    list_ForEach(itemsListEntry, catalogs_items_batch->items) {
    cJSON *itemLocal = creative_assets_processing_record_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_items_batch_t *catalogs_items_batch_parseFromJSON(cJSON *catalogs_items_batchJSON){

    catalogs_items_batch_t *catalogs_items_batch_local_var = NULL;

    // define the local variable for catalogs_items_batch->catalog_type
    catalogs_type_t *catalog_type_local_nonprim = NULL;

    // define the local variable for catalogs_items_batch->status
    batch_operation_status_t *status_local_nonprim = NULL;

    // define the local list for catalogs_items_batch->items
    list_t *itemsList = NULL;

    // catalogs_items_batch->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_items_batchJSON, "catalog_type");
    if (!catalog_type) {
        goto end;
    }

    
    catalog_type_local_nonprim = catalogs_type_parseFromJSON(catalog_type); //custom

    // catalogs_items_batch->batch_id
    cJSON *batch_id = cJSON_GetObjectItemCaseSensitive(catalogs_items_batchJSON, "batch_id");
    if (batch_id) { 
    if(!cJSON_IsString(batch_id) && !cJSON_IsNull(batch_id))
    {
    goto end; //String
    }
    }

    // catalogs_items_batch->created_time
    cJSON *created_time = cJSON_GetObjectItemCaseSensitive(catalogs_items_batchJSON, "created_time");
    if (created_time) { 
    if(!cJSON_IsString(created_time) && !cJSON_IsNull(created_time))
    {
    goto end; //DateTime
    }
    }

    // catalogs_items_batch->completed_time
    cJSON *completed_time = cJSON_GetObjectItemCaseSensitive(catalogs_items_batchJSON, "completed_time");
    if (completed_time) { 
    if(!cJSON_IsString(completed_time) && !cJSON_IsNull(completed_time))
    {
    goto end; //DateTime
    }
    }

    // catalogs_items_batch->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(catalogs_items_batchJSON, "status");
    if (status) { 
    status_local_nonprim = batch_operation_status_parseFromJSON(status); //custom
    }

    // catalogs_items_batch->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(catalogs_items_batchJSON, "items");
    if (items) { 
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
        creative_assets_processing_record_t *itemsItem = creative_assets_processing_record_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }
    }


    catalogs_items_batch_local_var = catalogs_items_batch_create (
        catalog_type_local_nonprim,
        batch_id && !cJSON_IsNull(batch_id) ? strdup(batch_id->valuestring) : NULL,
        created_time && !cJSON_IsNull(created_time) ? strdup(created_time->valuestring) : NULL,
        completed_time && !cJSON_IsNull(completed_time) ? strdup(completed_time->valuestring) : NULL,
        status ? status_local_nonprim : NULL,
        items ? itemsList : NULL
        );

    return catalogs_items_batch_local_var;
end:
    if (catalog_type_local_nonprim) {
        catalogs_type_free(catalog_type_local_nonprim);
        catalog_type_local_nonprim = NULL;
    }
    if (status_local_nonprim) {
        batch_operation_status_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            creative_assets_processing_record_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
