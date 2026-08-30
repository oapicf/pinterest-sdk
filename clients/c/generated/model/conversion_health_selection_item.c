#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_health_selection_item.h"



static conversion_health_selection_item_t *conversion_health_selection_item_create_internal(
    object_t *conversion_type,
    object_t *criteria,
    object_t *ingestion_source,
    any_type_t *status
    ) {
    conversion_health_selection_item_t *conversion_health_selection_item_local_var = malloc(sizeof(conversion_health_selection_item_t));
    if (!conversion_health_selection_item_local_var) {
        return NULL;
    }
    memset(conversion_health_selection_item_local_var, 0, sizeof(conversion_health_selection_item_t));
    conversion_health_selection_item_local_var->_library_owned = 1;
    conversion_health_selection_item_local_var->conversion_type = conversion_type;
    conversion_health_selection_item_local_var->criteria = criteria;
    conversion_health_selection_item_local_var->ingestion_source = ingestion_source;
    conversion_health_selection_item_local_var->status = status;
    return conversion_health_selection_item_local_var;
}

__attribute__((deprecated)) conversion_health_selection_item_t *conversion_health_selection_item_create(
    object_t *conversion_type,
    object_t *criteria,
    object_t *ingestion_source,
    any_type_t *status
    ) {
    conversion_health_selection_item_t *result = conversion_health_selection_item_create_internal (
        conversion_type,
        criteria,
        ingestion_source,
        status
        );
    if (!result) {
    }
    return result;
}

void conversion_health_selection_item_free(conversion_health_selection_item_t *conversion_health_selection_item) {
    if(NULL == conversion_health_selection_item){
        return ;
    }
    if(conversion_health_selection_item->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "conversion_health_selection_item_free");
        return ;
    }
    listEntry_t *listEntry;
    if (conversion_health_selection_item->conversion_type) {
        object_free(conversion_health_selection_item->conversion_type);
        conversion_health_selection_item->conversion_type = NULL;
    }
    if (conversion_health_selection_item->criteria) {
        object_free(conversion_health_selection_item->criteria);
        conversion_health_selection_item->criteria = NULL;
    }
    if (conversion_health_selection_item->ingestion_source) {
        object_free(conversion_health_selection_item->ingestion_source);
        conversion_health_selection_item->ingestion_source = NULL;
    }
    if (conversion_health_selection_item->status) {
        _free(conversion_health_selection_item->status);
        conversion_health_selection_item->status = NULL;
    }
    free(conversion_health_selection_item);
}

cJSON *conversion_health_selection_item_convertToJSON(conversion_health_selection_item_t *conversion_health_selection_item) {
    cJSON *item = cJSON_CreateObject();

    // conversion_health_selection_item->conversion_type
    if(conversion_health_selection_item->conversion_type) {
    cJSON *conversion_type_object = object_convertToJSON(conversion_health_selection_item->conversion_type);
    if(conversion_type_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "conversionType", conversion_type_object);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // conversion_health_selection_item->criteria
    if(conversion_health_selection_item->criteria) {
    cJSON *criteria_object = object_convertToJSON(conversion_health_selection_item->criteria);
    if(criteria_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "criteria", criteria_object);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // conversion_health_selection_item->ingestion_source
    if(conversion_health_selection_item->ingestion_source) {
    cJSON *ingestion_source_object = object_convertToJSON(conversion_health_selection_item->ingestion_source);
    if(ingestion_source_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ingestionSource", ingestion_source_object);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // conversion_health_selection_item->status
    if (!conversion_health_selection_item->status) {
        goto fail;
    }
    cJSON *status_local_JSON = _convertToJSON(conversion_health_selection_item->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

conversion_health_selection_item_t *conversion_health_selection_item_parseFromJSON(cJSON *conversion_health_selection_itemJSON){

    conversion_health_selection_item_t *conversion_health_selection_item_local_var = NULL;

    // define the local variable for conversion_health_selection_item->status
    _t *status_local_nonprim = NULL;

    // conversion_health_selection_item->conversion_type
    cJSON *conversion_type = cJSON_GetObjectItemCaseSensitive(conversion_health_selection_itemJSON, "conversionType");
    if (cJSON_IsNull(conversion_type)) {
        conversion_type = NULL;
    }
    object_t *conversion_type_local_object = NULL;
    if (conversion_type) { 
    conversion_type_local_object = object_parseFromJSON(conversion_type); //object
    }

    // conversion_health_selection_item->criteria
    cJSON *criteria = cJSON_GetObjectItemCaseSensitive(conversion_health_selection_itemJSON, "criteria");
    if (cJSON_IsNull(criteria)) {
        criteria = NULL;
    }
    object_t *criteria_local_object = NULL;
    if (criteria) { 
    criteria_local_object = object_parseFromJSON(criteria); //object
    }

    // conversion_health_selection_item->ingestion_source
    cJSON *ingestion_source = cJSON_GetObjectItemCaseSensitive(conversion_health_selection_itemJSON, "ingestionSource");
    if (cJSON_IsNull(ingestion_source)) {
        ingestion_source = NULL;
    }
    object_t *ingestion_source_local_object = NULL;
    if (ingestion_source) { 
    ingestion_source_local_object = object_parseFromJSON(ingestion_source); //object
    }

    // conversion_health_selection_item->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(conversion_health_selection_itemJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (!status) {
        goto end;
    }

    
    status_local_nonprim = _parseFromJSON(status); //custom



    conversion_health_selection_item_local_var = conversion_health_selection_item_create_internal (
        conversion_type ? conversion_type_local_object : NULL,
        criteria ? criteria_local_object : NULL,
        ingestion_source ? ingestion_source_local_object : NULL,
        status_local_nonprim
        );

    if (!conversion_health_selection_item_local_var) {
        goto end;
    }

    return conversion_health_selection_item_local_var;
end:
    if (status_local_nonprim) {
        _free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    return NULL;

}
