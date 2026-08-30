#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_local_stores_create_200_response_inner_data_one_of.h"



static catalogs_local_stores_create_200_response_inner_data_one_of_t *catalogs_local_stores_create_200_response_inner_data_one_of_create_internal(
    char *id,
    pinterest_lib_error_t *exceptions
    ) {
    catalogs_local_stores_create_200_response_inner_data_one_of_t *catalogs_local_stores_create_200_response_inner_data_one_of_local_var = malloc(sizeof(catalogs_local_stores_create_200_response_inner_data_one_of_t));
    if (!catalogs_local_stores_create_200_response_inner_data_one_of_local_var) {
        return NULL;
    }
    memset(catalogs_local_stores_create_200_response_inner_data_one_of_local_var, 0, sizeof(catalogs_local_stores_create_200_response_inner_data_one_of_t));
    catalogs_local_stores_create_200_response_inner_data_one_of_local_var->_library_owned = 1;
    catalogs_local_stores_create_200_response_inner_data_one_of_local_var->id = id;
    catalogs_local_stores_create_200_response_inner_data_one_of_local_var->exceptions = exceptions;
    return catalogs_local_stores_create_200_response_inner_data_one_of_local_var;
}

__attribute__((deprecated)) catalogs_local_stores_create_200_response_inner_data_one_of_t *catalogs_local_stores_create_200_response_inner_data_one_of_create(
    char *id,
    pinterest_lib_error_t *exceptions
    ) {
    catalogs_local_stores_create_200_response_inner_data_one_of_t *result = catalogs_local_stores_create_200_response_inner_data_one_of_create_internal (
        id,
        exceptions
        );
    if (!result) {
    }
    return result;
}

void catalogs_local_stores_create_200_response_inner_data_one_of_free(catalogs_local_stores_create_200_response_inner_data_one_of_t *catalogs_local_stores_create_200_response_inner_data_one_of) {
    if(NULL == catalogs_local_stores_create_200_response_inner_data_one_of){
        return ;
    }
    if(catalogs_local_stores_create_200_response_inner_data_one_of->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_local_stores_create_200_response_inner_data_one_of_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_local_stores_create_200_response_inner_data_one_of->id) {
        free(catalogs_local_stores_create_200_response_inner_data_one_of->id);
        catalogs_local_stores_create_200_response_inner_data_one_of->id = NULL;
    }
    if (catalogs_local_stores_create_200_response_inner_data_one_of->exceptions) {
        pinterest_lib_error_free(catalogs_local_stores_create_200_response_inner_data_one_of->exceptions);
        catalogs_local_stores_create_200_response_inner_data_one_of->exceptions = NULL;
    }
    free(catalogs_local_stores_create_200_response_inner_data_one_of);
}

cJSON *catalogs_local_stores_create_200_response_inner_data_one_of_convertToJSON(catalogs_local_stores_create_200_response_inner_data_one_of_t *catalogs_local_stores_create_200_response_inner_data_one_of) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_local_stores_create_200_response_inner_data_one_of->id
    if (!catalogs_local_stores_create_200_response_inner_data_one_of->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", catalogs_local_stores_create_200_response_inner_data_one_of->id) == NULL) {
    goto fail; //String
    }


    // catalogs_local_stores_create_200_response_inner_data_one_of->exceptions
    if (!catalogs_local_stores_create_200_response_inner_data_one_of->exceptions) {
        goto fail;
    }
    cJSON *exceptions_local_JSON = pinterest_lib_error_convertToJSON(catalogs_local_stores_create_200_response_inner_data_one_of->exceptions);
    if(exceptions_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "exceptions", exceptions_local_JSON);
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

catalogs_local_stores_create_200_response_inner_data_one_of_t *catalogs_local_stores_create_200_response_inner_data_one_of_parseFromJSON(cJSON *catalogs_local_stores_create_200_response_inner_data_one_ofJSON){

    catalogs_local_stores_create_200_response_inner_data_one_of_t *catalogs_local_stores_create_200_response_inner_data_one_of_local_var = NULL;

    char *id_local_str = NULL;

    // define the local variable for catalogs_local_stores_create_200_response_inner_data_one_of->exceptions
    pinterest_lib_error_t *exceptions_local_nonprim = NULL;

    // catalogs_local_stores_create_200_response_inner_data_one_of->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(catalogs_local_stores_create_200_response_inner_data_one_ofJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // catalogs_local_stores_create_200_response_inner_data_one_of->exceptions
    cJSON *exceptions = cJSON_GetObjectItemCaseSensitive(catalogs_local_stores_create_200_response_inner_data_one_ofJSON, "exceptions");
    if (cJSON_IsNull(exceptions)) {
        exceptions = NULL;
    }
    if (!exceptions) {
        goto end;
    }

    
    exceptions_local_nonprim = pinterest_lib_error_parseFromJSON(exceptions); //nonprimitive


    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);

    catalogs_local_stores_create_200_response_inner_data_one_of_local_var = catalogs_local_stores_create_200_response_inner_data_one_of_create_internal (
        id_local_str,
        exceptions_local_nonprim
        );

    if (!catalogs_local_stores_create_200_response_inner_data_one_of_local_var) {
        goto end;
    }

    return catalogs_local_stores_create_200_response_inner_data_one_of_local_var;
end:
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (exceptions_local_nonprim) {
        pinterest_lib_error_free(exceptions_local_nonprim);
        exceptions_local_nonprim = NULL;
    }
    return NULL;

}
