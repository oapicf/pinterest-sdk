#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_hotel_items_batch.h"



static catalogs_hotel_items_batch_t *catalogs_hotel_items_batch_create_internal(
    char *batch_id,
    char *created_time,
    char *completed_time,
    pinterest_rest_api_batch_operation_status__e status,
    pinterest_rest_api_catalogs_type__e catalog_type,
    list_t *items
    ) {
    catalogs_hotel_items_batch_t *catalogs_hotel_items_batch_local_var = malloc(sizeof(catalogs_hotel_items_batch_t));
    if (!catalogs_hotel_items_batch_local_var) {
        return NULL;
    }
    catalogs_hotel_items_batch_local_var->batch_id = batch_id;
    catalogs_hotel_items_batch_local_var->created_time = created_time;
    catalogs_hotel_items_batch_local_var->completed_time = completed_time;
    catalogs_hotel_items_batch_local_var->status = status;
    catalogs_hotel_items_batch_local_var->catalog_type = catalog_type;
    catalogs_hotel_items_batch_local_var->items = items;

    catalogs_hotel_items_batch_local_var->_library_owned = 1;
    return catalogs_hotel_items_batch_local_var;
}

__attribute__((deprecated)) catalogs_hotel_items_batch_t *catalogs_hotel_items_batch_create(
    char *batch_id,
    char *created_time,
    char *completed_time,
    pinterest_rest_api_batch_operation_status__e status,
    pinterest_rest_api_catalogs_type__e catalog_type,
    list_t *items
    ) {
    return catalogs_hotel_items_batch_create_internal (
        batch_id,
        created_time,
        completed_time,
        status,
        catalog_type,
        items
        );
}

void catalogs_hotel_items_batch_free(catalogs_hotel_items_batch_t *catalogs_hotel_items_batch) {
    if(NULL == catalogs_hotel_items_batch){
        return ;
    }
    if(catalogs_hotel_items_batch->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_hotel_items_batch_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_hotel_items_batch->batch_id) {
        free(catalogs_hotel_items_batch->batch_id);
        catalogs_hotel_items_batch->batch_id = NULL;
    }
    if (catalogs_hotel_items_batch->created_time) {
        free(catalogs_hotel_items_batch->created_time);
        catalogs_hotel_items_batch->created_time = NULL;
    }
    if (catalogs_hotel_items_batch->completed_time) {
        free(catalogs_hotel_items_batch->completed_time);
        catalogs_hotel_items_batch->completed_time = NULL;
    }
    if (catalogs_hotel_items_batch->items) {
        list_ForEach(listEntry, catalogs_hotel_items_batch->items) {
            hotel_processing_record_free(listEntry->data);
        }
        list_freeList(catalogs_hotel_items_batch->items);
        catalogs_hotel_items_batch->items = NULL;
    }
    free(catalogs_hotel_items_batch);
}

cJSON *catalogs_hotel_items_batch_convertToJSON(catalogs_hotel_items_batch_t *catalogs_hotel_items_batch) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_hotel_items_batch->batch_id
    if(catalogs_hotel_items_batch->batch_id) {
    if(cJSON_AddStringToObject(item, "batch_id", catalogs_hotel_items_batch->batch_id) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_hotel_items_batch->created_time
    if(catalogs_hotel_items_batch->created_time) {
    if(cJSON_AddStringToObject(item, "created_time", catalogs_hotel_items_batch->created_time) == NULL) {
    goto fail; //Date-Time
    }
    }


    // catalogs_hotel_items_batch->completed_time
    if(catalogs_hotel_items_batch->completed_time) {
    if(cJSON_AddStringToObject(item, "completed_time", catalogs_hotel_items_batch->completed_time) == NULL) {
    goto fail; //Date-Time
    }
    }


    // catalogs_hotel_items_batch->status
    if(catalogs_hotel_items_batch->status != pinterest_rest_api_batch_operation_status__NULL) {
    cJSON *status_local_JSON = batch_operation_status_convertToJSON(catalogs_hotel_items_batch->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // catalogs_hotel_items_batch->catalog_type
    if (pinterest_rest_api_catalogs_type__NULL == catalogs_hotel_items_batch->catalog_type) {
        goto fail;
    }
    cJSON *catalog_type_local_JSON = catalogs_type_convertToJSON(catalogs_hotel_items_batch->catalog_type);
    if(catalog_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "catalog_type", catalog_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_hotel_items_batch->items
    if(catalogs_hotel_items_batch->items) {
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (catalogs_hotel_items_batch->items) {
    list_ForEach(itemsListEntry, catalogs_hotel_items_batch->items) {
    cJSON *itemLocal = hotel_processing_record_convertToJSON(itemsListEntry->data);
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

catalogs_hotel_items_batch_t *catalogs_hotel_items_batch_parseFromJSON(cJSON *catalogs_hotel_items_batchJSON){

    catalogs_hotel_items_batch_t *catalogs_hotel_items_batch_local_var = NULL;

    // define the local variable for catalogs_hotel_items_batch->status
    pinterest_rest_api_batch_operation_status__e status_local_nonprim = 0;

    // define the local variable for catalogs_hotel_items_batch->catalog_type
    pinterest_rest_api_catalogs_type__e catalog_type_local_nonprim = 0;

    // define the local list for catalogs_hotel_items_batch->items
    list_t *itemsList = NULL;

    // catalogs_hotel_items_batch->batch_id
    cJSON *batch_id = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_items_batchJSON, "batch_id");
    if (cJSON_IsNull(batch_id)) {
        batch_id = NULL;
    }
    if (batch_id) { 
    if(!cJSON_IsString(batch_id) && !cJSON_IsNull(batch_id))
    {
    goto end; //String
    }
    }

    // catalogs_hotel_items_batch->created_time
    cJSON *created_time = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_items_batchJSON, "created_time");
    if (cJSON_IsNull(created_time)) {
        created_time = NULL;
    }
    if (created_time) { 
    if(!cJSON_IsString(created_time) && !cJSON_IsNull(created_time))
    {
    goto end; //DateTime
    }
    }

    // catalogs_hotel_items_batch->completed_time
    cJSON *completed_time = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_items_batchJSON, "completed_time");
    if (cJSON_IsNull(completed_time)) {
        completed_time = NULL;
    }
    if (completed_time) { 
    if(!cJSON_IsString(completed_time) && !cJSON_IsNull(completed_time))
    {
    goto end; //DateTime
    }
    }

    // catalogs_hotel_items_batch->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_items_batchJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    status_local_nonprim = batch_operation_status_parseFromJSON(status); //custom
    }

    // catalogs_hotel_items_batch->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_items_batchJSON, "catalog_type");
    if (cJSON_IsNull(catalog_type)) {
        catalog_type = NULL;
    }
    if (!catalog_type) {
        goto end;
    }

    
    catalog_type_local_nonprim = catalogs_type_parseFromJSON(catalog_type); //custom

    // catalogs_hotel_items_batch->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_items_batchJSON, "items");
    if (cJSON_IsNull(items)) {
        items = NULL;
    }
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
        hotel_processing_record_t *itemsItem = hotel_processing_record_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }
    }


    catalogs_hotel_items_batch_local_var = catalogs_hotel_items_batch_create_internal (
        batch_id && !cJSON_IsNull(batch_id) ? strdup(batch_id->valuestring) : NULL,
        created_time && !cJSON_IsNull(created_time) ? strdup(created_time->valuestring) : NULL,
        completed_time && !cJSON_IsNull(completed_time) ? strdup(completed_time->valuestring) : NULL,
        status ? status_local_nonprim : 0,
        catalog_type_local_nonprim,
        items ? itemsList : NULL
        );

    return catalogs_hotel_items_batch_local_var;
end:
    if (status_local_nonprim) {
        status_local_nonprim = 0;
    }
    if (catalog_type_local_nonprim) {
        catalog_type_local_nonprim = 0;
    }
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            hotel_processing_record_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
