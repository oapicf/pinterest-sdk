#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_batch_item.h"



static ad_batch_item_t *ad_batch_item_create_internal(
    ad_t *data,
    pinterest_lib_error_t *exceptions
    ) {
    ad_batch_item_t *ad_batch_item_local_var = malloc(sizeof(ad_batch_item_t));
    if (!ad_batch_item_local_var) {
        return NULL;
    }
    memset(ad_batch_item_local_var, 0, sizeof(ad_batch_item_t));
    ad_batch_item_local_var->_library_owned = 1;
    ad_batch_item_local_var->data = data;
    ad_batch_item_local_var->exceptions = exceptions;
    return ad_batch_item_local_var;
}

__attribute__((deprecated)) ad_batch_item_t *ad_batch_item_create(
    ad_t *data,
    pinterest_lib_error_t *exceptions
    ) {
    ad_batch_item_t *result = ad_batch_item_create_internal (
        data,
        exceptions
        );
    if (!result) {
    }
    return result;
}

void ad_batch_item_free(ad_batch_item_t *ad_batch_item) {
    if(NULL == ad_batch_item){
        return ;
    }
    if(ad_batch_item->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ad_batch_item_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ad_batch_item->data) {
        ad_free(ad_batch_item->data);
        ad_batch_item->data = NULL;
    }
    if (ad_batch_item->exceptions) {
        pinterest_lib_error_free(ad_batch_item->exceptions);
        ad_batch_item->exceptions = NULL;
    }
    free(ad_batch_item);
}

cJSON *ad_batch_item_convertToJSON(ad_batch_item_t *ad_batch_item) {
    cJSON *item = cJSON_CreateObject();

    // ad_batch_item->data
    if(ad_batch_item->data) {
    cJSON *data_local_JSON = ad_convertToJSON(ad_batch_item->data);
    if(data_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "data", data_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // ad_batch_item->exceptions
    if(ad_batch_item->exceptions) {
    cJSON *exceptions_local_JSON = pinterest_lib_error_convertToJSON(ad_batch_item->exceptions);
    if(exceptions_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "exceptions", exceptions_local_JSON);
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

ad_batch_item_t *ad_batch_item_parseFromJSON(cJSON *ad_batch_itemJSON){

    ad_batch_item_t *ad_batch_item_local_var = NULL;

    // define the local variable for ad_batch_item->data
    ad_t *data_local_nonprim = NULL;

    // define the local variable for ad_batch_item->exceptions
    pinterest_lib_error_t *exceptions_local_nonprim = NULL;

    // ad_batch_item->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(ad_batch_itemJSON, "data");
    if (cJSON_IsNull(data)) {
        data = NULL;
    }
    if (data) { 
    data_local_nonprim = ad_parseFromJSON(data); //nonprimitive
    }

    // ad_batch_item->exceptions
    cJSON *exceptions = cJSON_GetObjectItemCaseSensitive(ad_batch_itemJSON, "exceptions");
    if (cJSON_IsNull(exceptions)) {
        exceptions = NULL;
    }
    if (exceptions) { 
    exceptions_local_nonprim = pinterest_lib_error_parseFromJSON(exceptions); //nonprimitive
    }



    ad_batch_item_local_var = ad_batch_item_create_internal (
        data ? data_local_nonprim : NULL,
        exceptions ? exceptions_local_nonprim : NULL
        );

    if (!ad_batch_item_local_var) {
        goto end;
    }

    return ad_batch_item_local_var;
end:
    if (data_local_nonprim) {
        ad_free(data_local_nonprim);
        data_local_nonprim = NULL;
    }
    if (exceptions_local_nonprim) {
        pinterest_lib_error_free(exceptions_local_nonprim);
        exceptions_local_nonprim = NULL;
    }
    return NULL;

}
