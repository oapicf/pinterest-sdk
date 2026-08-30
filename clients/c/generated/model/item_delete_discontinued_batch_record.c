#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "item_delete_discontinued_batch_record.h"



static item_delete_discontinued_batch_record_t *item_delete_discontinued_batch_record_create_internal(
    char *item_id
    ) {
    item_delete_discontinued_batch_record_t *item_delete_discontinued_batch_record_local_var = malloc(sizeof(item_delete_discontinued_batch_record_t));
    if (!item_delete_discontinued_batch_record_local_var) {
        return NULL;
    }
    memset(item_delete_discontinued_batch_record_local_var, 0, sizeof(item_delete_discontinued_batch_record_t));
    item_delete_discontinued_batch_record_local_var->_library_owned = 1;
    item_delete_discontinued_batch_record_local_var->item_id = item_id;
    return item_delete_discontinued_batch_record_local_var;
}

__attribute__((deprecated)) item_delete_discontinued_batch_record_t *item_delete_discontinued_batch_record_create(
    char *item_id
    ) {
    item_delete_discontinued_batch_record_t *result = item_delete_discontinued_batch_record_create_internal (
        item_id
        );
    if (!result) {
    }
    return result;
}

void item_delete_discontinued_batch_record_free(item_delete_discontinued_batch_record_t *item_delete_discontinued_batch_record) {
    if(NULL == item_delete_discontinued_batch_record){
        return ;
    }
    if(item_delete_discontinued_batch_record->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "item_delete_discontinued_batch_record_free");
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

    char *item_id_local_str = NULL;

    // item_delete_discontinued_batch_record->item_id
    cJSON *item_id = cJSON_GetObjectItemCaseSensitive(item_delete_discontinued_batch_recordJSON, "item_id");
    if (cJSON_IsNull(item_id)) {
        item_id = NULL;
    }
    if (item_id) { 
    if(!cJSON_IsString(item_id) && !cJSON_IsNull(item_id))
    {
    goto end; //String
    }
    }


    if (item_id && !cJSON_IsNull(item_id)) item_id_local_str = strdup(item_id->valuestring);

    item_delete_discontinued_batch_record_local_var = item_delete_discontinued_batch_record_create_internal (
        item_id_local_str
        );

    if (!item_delete_discontinued_batch_record_local_var) {
        goto end;
    }

    return item_delete_discontinued_batch_record_local_var;
end:
    if (item_id_local_str) {
        free(item_id_local_str);
        item_id_local_str = NULL;
    }
    return NULL;

}
