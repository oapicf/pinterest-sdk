#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "item_id_store_code_pair.h"



static item_id_store_code_pair_t *item_id_store_code_pair_create_internal(
    char *item_id,
    char *store_code
    ) {
    item_id_store_code_pair_t *item_id_store_code_pair_local_var = malloc(sizeof(item_id_store_code_pair_t));
    if (!item_id_store_code_pair_local_var) {
        return NULL;
    }
    memset(item_id_store_code_pair_local_var, 0, sizeof(item_id_store_code_pair_t));
    item_id_store_code_pair_local_var->_library_owned = 1;
    item_id_store_code_pair_local_var->item_id = item_id;
    item_id_store_code_pair_local_var->store_code = store_code;
    return item_id_store_code_pair_local_var;
}

__attribute__((deprecated)) item_id_store_code_pair_t *item_id_store_code_pair_create(
    char *item_id,
    char *store_code
    ) {
    item_id_store_code_pair_t *result = item_id_store_code_pair_create_internal (
        item_id,
        store_code
        );
    if (!result) {
    }
    return result;
}

void item_id_store_code_pair_free(item_id_store_code_pair_t *item_id_store_code_pair) {
    if(NULL == item_id_store_code_pair){
        return ;
    }
    if(item_id_store_code_pair->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "item_id_store_code_pair_free");
        return ;
    }
    listEntry_t *listEntry;
    if (item_id_store_code_pair->item_id) {
        free(item_id_store_code_pair->item_id);
        item_id_store_code_pair->item_id = NULL;
    }
    if (item_id_store_code_pair->store_code) {
        free(item_id_store_code_pair->store_code);
        item_id_store_code_pair->store_code = NULL;
    }
    free(item_id_store_code_pair);
}

cJSON *item_id_store_code_pair_convertToJSON(item_id_store_code_pair_t *item_id_store_code_pair) {
    cJSON *item = cJSON_CreateObject();

    // item_id_store_code_pair->item_id
    if (!item_id_store_code_pair->item_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "item_id", item_id_store_code_pair->item_id) == NULL) {
    goto fail; //String
    }


    // item_id_store_code_pair->store_code
    if (!item_id_store_code_pair->store_code) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "store_code", item_id_store_code_pair->store_code) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

item_id_store_code_pair_t *item_id_store_code_pair_parseFromJSON(cJSON *item_id_store_code_pairJSON){

    item_id_store_code_pair_t *item_id_store_code_pair_local_var = NULL;

    char *item_id_local_str = NULL;

    char *store_code_local_str = NULL;

    // item_id_store_code_pair->item_id
    cJSON *item_id = cJSON_GetObjectItemCaseSensitive(item_id_store_code_pairJSON, "item_id");
    if (cJSON_IsNull(item_id)) {
        item_id = NULL;
    }
    if (!item_id) {
        goto end;
    }

    
    if(!cJSON_IsString(item_id))
    {
    goto end; //String
    }

    // item_id_store_code_pair->store_code
    cJSON *store_code = cJSON_GetObjectItemCaseSensitive(item_id_store_code_pairJSON, "store_code");
    if (cJSON_IsNull(store_code)) {
        store_code = NULL;
    }
    if (!store_code) {
        goto end;
    }

    
    if(!cJSON_IsString(store_code))
    {
    goto end; //String
    }


    if (item_id && !cJSON_IsNull(item_id)) item_id_local_str = strdup(item_id->valuestring);
    if (store_code && !cJSON_IsNull(store_code)) store_code_local_str = strdup(store_code->valuestring);

    item_id_store_code_pair_local_var = item_id_store_code_pair_create_internal (
        item_id_local_str,
        store_code_local_str
        );

    if (!item_id_store_code_pair_local_var) {
        goto end;
    }

    return item_id_store_code_pair_local_var;
end:
    if (item_id_local_str) {
        free(item_id_local_str);
        item_id_local_str = NULL;
    }
    if (store_code_local_str) {
        free(store_code_local_str);
        store_code_local_str = NULL;
    }
    return NULL;

}
