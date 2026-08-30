#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_local_stores_create_200_response_inner.h"



static catalogs_local_stores_create_200_response_inner_t *catalogs_local_stores_create_200_response_inner_create_internal(
    catalogs_local_stores_create_200_response_inner_data_t *data
    ) {
    catalogs_local_stores_create_200_response_inner_t *catalogs_local_stores_create_200_response_inner_local_var = malloc(sizeof(catalogs_local_stores_create_200_response_inner_t));
    if (!catalogs_local_stores_create_200_response_inner_local_var) {
        return NULL;
    }
    memset(catalogs_local_stores_create_200_response_inner_local_var, 0, sizeof(catalogs_local_stores_create_200_response_inner_t));
    catalogs_local_stores_create_200_response_inner_local_var->_library_owned = 1;
    catalogs_local_stores_create_200_response_inner_local_var->data = data;
    return catalogs_local_stores_create_200_response_inner_local_var;
}

__attribute__((deprecated)) catalogs_local_stores_create_200_response_inner_t *catalogs_local_stores_create_200_response_inner_create(
    catalogs_local_stores_create_200_response_inner_data_t *data
    ) {
    catalogs_local_stores_create_200_response_inner_t *result = catalogs_local_stores_create_200_response_inner_create_internal (
        data
        );
    if (!result) {
    }
    return result;
}

void catalogs_local_stores_create_200_response_inner_free(catalogs_local_stores_create_200_response_inner_t *catalogs_local_stores_create_200_response_inner) {
    if(NULL == catalogs_local_stores_create_200_response_inner){
        return ;
    }
    if(catalogs_local_stores_create_200_response_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_local_stores_create_200_response_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_local_stores_create_200_response_inner->data) {
        catalogs_local_stores_create_200_response_inner_data_free(catalogs_local_stores_create_200_response_inner->data);
        catalogs_local_stores_create_200_response_inner->data = NULL;
    }
    free(catalogs_local_stores_create_200_response_inner);
}

cJSON *catalogs_local_stores_create_200_response_inner_convertToJSON(catalogs_local_stores_create_200_response_inner_t *catalogs_local_stores_create_200_response_inner) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_local_stores_create_200_response_inner->data
    if (!catalogs_local_stores_create_200_response_inner->data) {
        goto fail;
    }
    cJSON *data_local_JSON = catalogs_local_stores_create_200_response_inner_data_convertToJSON(catalogs_local_stores_create_200_response_inner->data);
    if(data_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "data", data_local_JSON);
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

catalogs_local_stores_create_200_response_inner_t *catalogs_local_stores_create_200_response_inner_parseFromJSON(cJSON *catalogs_local_stores_create_200_response_innerJSON){

    catalogs_local_stores_create_200_response_inner_t *catalogs_local_stores_create_200_response_inner_local_var = NULL;

    // define the local variable for catalogs_local_stores_create_200_response_inner->data
    catalogs_local_stores_create_200_response_inner_data_t *data_local_nonprim = NULL;

    // catalogs_local_stores_create_200_response_inner->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(catalogs_local_stores_create_200_response_innerJSON, "data");
    if (cJSON_IsNull(data)) {
        data = NULL;
    }
    if (!data) {
        goto end;
    }

    
    data_local_nonprim = catalogs_local_stores_create_200_response_inner_data_parseFromJSON(data); //nonprimitive



    catalogs_local_stores_create_200_response_inner_local_var = catalogs_local_stores_create_200_response_inner_create_internal (
        data_local_nonprim
        );

    if (!catalogs_local_stores_create_200_response_inner_local_var) {
        goto end;
    }

    return catalogs_local_stores_create_200_response_inner_local_var;
end:
    if (data_local_nonprim) {
        catalogs_local_stores_create_200_response_inner_data_free(data_local_nonprim);
        data_local_nonprim = NULL;
    }
    return NULL;

}
