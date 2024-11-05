#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "item_create_batch_record.h"



item_create_batch_record_t *item_create_batch_record_create(
    char *item_id,
    item_attributes_request_t *attributes
    ) {
    item_create_batch_record_t *item_create_batch_record_local_var = malloc(sizeof(item_create_batch_record_t));
    if (!item_create_batch_record_local_var) {
        return NULL;
    }
    item_create_batch_record_local_var->item_id = item_id;
    item_create_batch_record_local_var->attributes = attributes;

    return item_create_batch_record_local_var;
}


void item_create_batch_record_free(item_create_batch_record_t *item_create_batch_record) {
    if(NULL == item_create_batch_record){
        return ;
    }
    listEntry_t *listEntry;
    if (item_create_batch_record->item_id) {
        free(item_create_batch_record->item_id);
        item_create_batch_record->item_id = NULL;
    }
    if (item_create_batch_record->attributes) {
        item_attributes_request_free(item_create_batch_record->attributes);
        item_create_batch_record->attributes = NULL;
    }
    free(item_create_batch_record);
}

cJSON *item_create_batch_record_convertToJSON(item_create_batch_record_t *item_create_batch_record) {
    cJSON *item = cJSON_CreateObject();

    // item_create_batch_record->item_id
    if(item_create_batch_record->item_id) {
    if(cJSON_AddStringToObject(item, "item_id", item_create_batch_record->item_id) == NULL) {
    goto fail; //String
    }
    }


    // item_create_batch_record->attributes
    if(item_create_batch_record->attributes) {
    cJSON *attributes_local_JSON = item_attributes_request_convertToJSON(item_create_batch_record->attributes);
    if(attributes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "attributes", attributes_local_JSON);
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

item_create_batch_record_t *item_create_batch_record_parseFromJSON(cJSON *item_create_batch_recordJSON){

    item_create_batch_record_t *item_create_batch_record_local_var = NULL;

    // define the local variable for item_create_batch_record->attributes
    item_attributes_request_t *attributes_local_nonprim = NULL;

    // item_create_batch_record->item_id
    cJSON *item_id = cJSON_GetObjectItemCaseSensitive(item_create_batch_recordJSON, "item_id");
    if (item_id) { 
    if(!cJSON_IsString(item_id) && !cJSON_IsNull(item_id))
    {
    goto end; //String
    }
    }

    // item_create_batch_record->attributes
    cJSON *attributes = cJSON_GetObjectItemCaseSensitive(item_create_batch_recordJSON, "attributes");
    if (attributes) { 
    attributes_local_nonprim = item_attributes_request_parseFromJSON(attributes); //nonprimitive
    }


    item_create_batch_record_local_var = item_create_batch_record_create (
        item_id && !cJSON_IsNull(item_id) ? strdup(item_id->valuestring) : NULL,
        attributes ? attributes_local_nonprim : NULL
        );

    return item_create_batch_record_local_var;
end:
    if (attributes_local_nonprim) {
        item_attributes_request_free(attributes_local_nonprim);
        attributes_local_nonprim = NULL;
    }
    return NULL;

}
