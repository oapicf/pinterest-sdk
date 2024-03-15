#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "item_delete_discontinued_batch_record.h"



item_delete_discontinued_batch_record_t *item_delete_discontinued_batch_record_create(
    char *item_id
    ) {
    item_delete_discontinued_batch_record_t *item_delete_discontinued_batch_record_local_var = malloc(sizeof(item_delete_discontinued_batch_record_t));
    if (!item_delete_discontinued_batch_record_local_var) {
        return NULL;
    }
    item_delete_discontinued_batch_record_local_var->item_id = item_id;

    return item_delete_discontinued_batch_record_local_var;
}


void item_delete_discontinued_batch_record_free(item_delete_discontinued_batch_record_t *item_delete_discontinued_batch_record) {
    if(NULL == item_delete_discontinued_batch_record){
        return ;
    }
    listEntry_t *listEntry;
    if (item_delete_discontinued_batch_record->item_id) {
        free(item_delete_discontinued_batch_record->item_id);
        item_delete_discontinued_batch_record->item_id = NULL;
    }
    free(item_delete_discontinued_batch_record);
}

cJSON *item_delete_discontinued_batch_record_convertToJSON(item_delete_discontinued_batch_record_t *item_delete_discontinued_batch_record) {
    cJSON *item = cJSON_CreateObject();

    // item_delete_discontinued_batch_record->item_id
    if(item_delete_discontinued_batch_record->item_id) {
    if(cJSON_AddStringToObject(item, "item_id", item_delete_discontinued_batch_record->item_id) == NULL) {
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

item_delete_discontinued_batch_record_t *item_delete_discontinued_batch_record_parseFromJSON(cJSON *item_delete_discontinued_batch_recordJSON){

    item_delete_discontinued_batch_record_t *item_delete_discontinued_batch_record_local_var = NULL;

    // item_delete_discontinued_batch_record->item_id
    cJSON *item_id = cJSON_GetObjectItemCaseSensitive(item_delete_discontinued_batch_recordJSON, "item_id");
    if (item_id) { 
    if(!cJSON_IsString(item_id) && !cJSON_IsNull(item_id))
    {
    goto end; //String
    }
    }


    item_delete_discontinued_batch_record_local_var = item_delete_discontinued_batch_record_create (
        item_id && !cJSON_IsNull(item_id) ? strdup(item_id->valuestring) : NULL
        );

    return item_delete_discontinued_batch_record_local_var;
end:
    return NULL;

}
