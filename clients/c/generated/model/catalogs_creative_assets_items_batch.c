#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_creative_assets_items_batch.h"


char* catalogs_creative_assets_items_batch_catalog_type_ToString(pinterest_rest_api_catalogs_creative_assets_items_batch_CATALOGTYPE_e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "CREATIVE_ASSETS" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_catalogs_creative_assets_items_batch_CATALOGTYPE_e catalogs_creative_assets_items_batch_catalog_type_FromString(char* catalog_type){
    int stringToReturn = 0;
    char *catalog_typeArray[] =  { "NULL", "CREATIVE_ASSETS" };
    size_t sizeofArray = sizeof(catalog_typeArray) / sizeof(catalog_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(catalog_type, catalog_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static catalogs_creative_assets_items_batch_t *catalogs_creative_assets_items_batch_create_internal(
    char *batch_id,
    pinterest_rest_api_catalogs_creative_assets_items_batch_CATALOGTYPE_e catalog_type,
    char *completed_time,
    char *created_time,
    list_t *items,
    pinterest_rest_api_batch_operation_status__e status
    ) {
    catalogs_creative_assets_items_batch_t *catalogs_creative_assets_items_batch_local_var = malloc(sizeof(catalogs_creative_assets_items_batch_t));
    if (!catalogs_creative_assets_items_batch_local_var) {
        return NULL;
    }
    memset(catalogs_creative_assets_items_batch_local_var, 0, sizeof(catalogs_creative_assets_items_batch_t));
    catalogs_creative_assets_items_batch_local_var->_library_owned = 1;
    catalogs_creative_assets_items_batch_local_var->batch_id = batch_id;
    catalogs_creative_assets_items_batch_local_var->catalog_type = catalog_type;
    catalogs_creative_assets_items_batch_local_var->completed_time = completed_time;
    catalogs_creative_assets_items_batch_local_var->created_time = created_time;
    catalogs_creative_assets_items_batch_local_var->items = items;
    catalogs_creative_assets_items_batch_local_var->status = status;
    return catalogs_creative_assets_items_batch_local_var;
}

__attribute__((deprecated)) catalogs_creative_assets_items_batch_t *catalogs_creative_assets_items_batch_create(
    char *batch_id,
    pinterest_rest_api_catalogs_creative_assets_items_batch_CATALOGTYPE_e catalog_type,
    char *completed_time,
    char *created_time,
    list_t *items,
    pinterest_rest_api_batch_operation_status__e status
    ) {
    catalogs_creative_assets_items_batch_t *result = catalogs_creative_assets_items_batch_create_internal (
        batch_id,
        catalog_type,
        completed_time,
        created_time,
        items,
        status
        );
    if (!result) {
    }
    return result;
}

void catalogs_creative_assets_items_batch_free(catalogs_creative_assets_items_batch_t *catalogs_creative_assets_items_batch) {
    if(NULL == catalogs_creative_assets_items_batch){
        return ;
    }
    if(catalogs_creative_assets_items_batch->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_creative_assets_items_batch_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_creative_assets_items_batch->batch_id) {
        free(catalogs_creative_assets_items_batch->batch_id);
        catalogs_creative_assets_items_batch->batch_id = NULL;
    }
    if (catalogs_creative_assets_items_batch->completed_time) {
        free(catalogs_creative_assets_items_batch->completed_time);
        catalogs_creative_assets_items_batch->completed_time = NULL;
    }
    if (catalogs_creative_assets_items_batch->created_time) {
        free(catalogs_creative_assets_items_batch->created_time);
        catalogs_creative_assets_items_batch->created_time = NULL;
    }
    if (catalogs_creative_assets_items_batch->items) {
        list_ForEach(listEntry, catalogs_creative_assets_items_batch->items) {
            creative_assets_processing_record_free(listEntry->data);
        }
        list_freeList(catalogs_creative_assets_items_batch->items);
        catalogs_creative_assets_items_batch->items = NULL;
    }
    free(catalogs_creative_assets_items_batch);
}

cJSON *catalogs_creative_assets_items_batch_convertToJSON(catalogs_creative_assets_items_batch_t *catalogs_creative_assets_items_batch) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_creative_assets_items_batch->batch_id
    if(catalogs_creative_assets_items_batch->batch_id) {
    if(cJSON_AddStringToObject(item, "batch_id", catalogs_creative_assets_items_batch->batch_id) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_creative_assets_items_batch->catalog_type
    if (pinterest_rest_api_catalogs_creative_assets_items_batch_CATALOGTYPE_NULL == catalogs_creative_assets_items_batch->catalog_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_type", catalogs_creative_assets_items_batch_catalog_type_ToString(catalogs_creative_assets_items_batch->catalog_type)) == NULL)
    {
    goto fail; //Enum
    }


    // catalogs_creative_assets_items_batch->completed_time
    if(catalogs_creative_assets_items_batch->completed_time) {
    if(cJSON_AddStringToObject(item, "completed_time", catalogs_creative_assets_items_batch->completed_time) == NULL) {
    goto fail; //Date-Time
    }
    }


    // catalogs_creative_assets_items_batch->created_time
    if(catalogs_creative_assets_items_batch->created_time) {
    if(cJSON_AddStringToObject(item, "created_time", catalogs_creative_assets_items_batch->created_time) == NULL) {
    goto fail; //Date-Time
    }
    }


    // catalogs_creative_assets_items_batch->items
    if(catalogs_creative_assets_items_batch->items) {
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (catalogs_creative_assets_items_batch->items) {
    list_ForEach(itemsListEntry, catalogs_creative_assets_items_batch->items) {
    cJSON *itemLocal = creative_assets_processing_record_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }
    }


    // catalogs_creative_assets_items_batch->status
    if(catalogs_creative_assets_items_batch->status != pinterest_rest_api_batch_operation_status__NULL) {
    cJSON *status_local_JSON = batch_operation_status_convertToJSON(catalogs_creative_assets_items_batch->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_creative_assets_items_batch_t *catalogs_creative_assets_items_batch_parseFromJSON(cJSON *catalogs_creative_assets_items_batchJSON){

    catalogs_creative_assets_items_batch_t *catalogs_creative_assets_items_batch_local_var = NULL;

    char *batch_id_local_str = NULL;

    char *completed_time_local_str = NULL;

    char *created_time_local_str = NULL;

    // define the local list for catalogs_creative_assets_items_batch->items
    list_t *itemsList = NULL;

    // define the local variable for catalogs_creative_assets_items_batch->status
    pinterest_rest_api_batch_operation_status__e status_local_nonprim = 0;

    // catalogs_creative_assets_items_batch->batch_id
    cJSON *batch_id = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_items_batchJSON, "batch_id");
    if (cJSON_IsNull(batch_id)) {
        batch_id = NULL;
    }
    if (batch_id) { 
    if(!cJSON_IsString(batch_id) && !cJSON_IsNull(batch_id))
    {
    goto end; //String
    }
    }

    // catalogs_creative_assets_items_batch->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_items_batchJSON, "catalog_type");
    if (cJSON_IsNull(catalog_type)) {
        catalog_type = NULL;
    }
    if (!catalog_type) {
        goto end;
    }

    pinterest_rest_api_catalogs_creative_assets_items_batch_CATALOGTYPE_e catalog_typeVariable;
    
    if(!cJSON_IsString(catalog_type))
    {
    goto end; //Enum
    }
    catalog_typeVariable = catalogs_creative_assets_items_batch_catalog_type_FromString(catalog_type->valuestring);

    // catalogs_creative_assets_items_batch->completed_time
    cJSON *completed_time = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_items_batchJSON, "completed_time");
    if (cJSON_IsNull(completed_time)) {
        completed_time = NULL;
    }
    if (completed_time) { 
    if(!cJSON_IsString(completed_time) && !cJSON_IsNull(completed_time))
    {
    goto end; //DateTime
    }
    }

    // catalogs_creative_assets_items_batch->created_time
    cJSON *created_time = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_items_batchJSON, "created_time");
    if (cJSON_IsNull(created_time)) {
        created_time = NULL;
    }
    if (created_time) { 
    if(!cJSON_IsString(created_time) && !cJSON_IsNull(created_time))
    {
    goto end; //DateTime
    }
    }

    // catalogs_creative_assets_items_batch->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_items_batchJSON, "items");
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
        creative_assets_processing_record_t *itemsItem = creative_assets_processing_record_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }
    }

    // catalogs_creative_assets_items_batch->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_items_batchJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    status_local_nonprim = batch_operation_status_parseFromJSON(status); //custom
    }


    if (batch_id && !cJSON_IsNull(batch_id)) batch_id_local_str = strdup(batch_id->valuestring);
    if (completed_time && !cJSON_IsNull(completed_time)) completed_time_local_str = strdup(completed_time->valuestring);
    if (created_time && !cJSON_IsNull(created_time)) created_time_local_str = strdup(created_time->valuestring);

    catalogs_creative_assets_items_batch_local_var = catalogs_creative_assets_items_batch_create_internal (
        batch_id_local_str,
        catalog_typeVariable,
        completed_time_local_str,
        created_time_local_str,
        items ? itemsList : NULL,
        status ? status_local_nonprim : 0
        );

    if (!catalogs_creative_assets_items_batch_local_var) {
        goto end;
    }

    return catalogs_creative_assets_items_batch_local_var;
end:
    if (batch_id_local_str) {
        free(batch_id_local_str);
        batch_id_local_str = NULL;
    }
    if (completed_time_local_str) {
        free(completed_time_local_str);
        completed_time_local_str = NULL;
    }
    if (created_time_local_str) {
        free(created_time_local_str);
        created_time_local_str = NULL;
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
    if (status_local_nonprim) {
        status_local_nonprim = 0;
    }
    return NULL;

}
