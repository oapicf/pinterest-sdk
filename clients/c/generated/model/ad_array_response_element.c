#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_array_response_element.h"



static ad_array_response_element_t *ad_array_response_element_create_internal(
    ad_response_t *data,
    exception_t *exceptions
    ) {
    ad_array_response_element_t *ad_array_response_element_local_var = malloc(sizeof(ad_array_response_element_t));
    if (!ad_array_response_element_local_var) {
        return NULL;
    }
    ad_array_response_element_local_var->data = data;
    ad_array_response_element_local_var->exceptions = exceptions;

    ad_array_response_element_local_var->_library_owned = 1;
    return ad_array_response_element_local_var;
}

__attribute__((deprecated)) ad_array_response_element_t *ad_array_response_element_create(
    ad_response_t *data,
    exception_t *exceptions
    ) {
    return ad_array_response_element_create_internal (
        data,
        exceptions
        );
}

void ad_array_response_element_free(ad_array_response_element_t *ad_array_response_element) {
    if(NULL == ad_array_response_element){
        return ;
    }
    if(ad_array_response_element->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ad_array_response_element_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ad_array_response_element->data) {
        ad_response_free(ad_array_response_element->data);
        ad_array_response_element->data = NULL;
    }
    if (ad_array_response_element->exceptions) {
        exception_free(ad_array_response_element->exceptions);
        ad_array_response_element->exceptions = NULL;
    }
    free(ad_array_response_element);
}

cJSON *ad_array_response_element_convertToJSON(ad_array_response_element_t *ad_array_response_element) {
    cJSON *item = cJSON_CreateObject();

    // ad_array_response_element->data
    if(ad_array_response_element->data) {
    cJSON *data_local_JSON = ad_response_convertToJSON(ad_array_response_element->data);
    if(data_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "data", data_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // ad_array_response_element->exceptions
    if(ad_array_response_element->exceptions) {
    cJSON *exceptions_local_JSON = exception_convertToJSON(ad_array_response_element->exceptions);
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

ad_array_response_element_t *ad_array_response_element_parseFromJSON(cJSON *ad_array_response_elementJSON){

    ad_array_response_element_t *ad_array_response_element_local_var = NULL;

    // define the local variable for ad_array_response_element->data
    ad_response_t *data_local_nonprim = NULL;

    // define the local variable for ad_array_response_element->exceptions
    exception_t *exceptions_local_nonprim = NULL;

    // ad_array_response_element->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(ad_array_response_elementJSON, "data");
    if (cJSON_IsNull(data)) {
        data = NULL;
    }
    if (data) { 
    data_local_nonprim = ad_response_parseFromJSON(data); //nonprimitive
    }

    // ad_array_response_element->exceptions
    cJSON *exceptions = cJSON_GetObjectItemCaseSensitive(ad_array_response_elementJSON, "exceptions");
    if (cJSON_IsNull(exceptions)) {
        exceptions = NULL;
    }
    if (exceptions) { 
    exceptions_local_nonprim = exception_parseFromJSON(exceptions); //nonprimitive
    }


    ad_array_response_element_local_var = ad_array_response_element_create_internal (
        data ? data_local_nonprim : NULL,
        exceptions ? exceptions_local_nonprim : NULL
        );

    return ad_array_response_element_local_var;
end:
    if (data_local_nonprim) {
        ad_response_free(data_local_nonprim);
        data_local_nonprim = NULL;
    }
    if (exceptions_local_nonprim) {
        exception_free(exceptions_local_nonprim);
        exceptions_local_nonprim = NULL;
    }
    return NULL;

}
