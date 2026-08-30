#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "promotion_array_element.h"



static promotion_array_element_t *promotion_array_element_create_internal(
    promotion_t *data,
    exception_t *exception
    ) {
    promotion_array_element_t *promotion_array_element_local_var = malloc(sizeof(promotion_array_element_t));
    if (!promotion_array_element_local_var) {
        return NULL;
    }
    memset(promotion_array_element_local_var, 0, sizeof(promotion_array_element_t));
    promotion_array_element_local_var->_library_owned = 1;
    promotion_array_element_local_var->data = data;
    promotion_array_element_local_var->exception = exception;
    return promotion_array_element_local_var;
}

__attribute__((deprecated)) promotion_array_element_t *promotion_array_element_create(
    promotion_t *data,
    exception_t *exception
    ) {
    promotion_array_element_t *result = promotion_array_element_create_internal (
        data,
        exception
        );
    if (!result) {
    }
    return result;
}

void promotion_array_element_free(promotion_array_element_t *promotion_array_element) {
    if(NULL == promotion_array_element){
        return ;
    }
    if(promotion_array_element->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "promotion_array_element_free");
        return ;
    }
    listEntry_t *listEntry;
    if (promotion_array_element->data) {
        promotion_free(promotion_array_element->data);
        promotion_array_element->data = NULL;
    }
    if (promotion_array_element->exception) {
        exception_free(promotion_array_element->exception);
        promotion_array_element->exception = NULL;
    }
    free(promotion_array_element);
}

cJSON *promotion_array_element_convertToJSON(promotion_array_element_t *promotion_array_element) {
    cJSON *item = cJSON_CreateObject();

    // promotion_array_element->data
    if(promotion_array_element->data) {
    cJSON *data_local_JSON = promotion_convertToJSON(promotion_array_element->data);
    if(data_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "data", data_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // promotion_array_element->exception
    if(promotion_array_element->exception) {
    cJSON *exception_local_JSON = exception_convertToJSON(promotion_array_element->exception);
    if(exception_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "exception", exception_local_JSON);
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

promotion_array_element_t *promotion_array_element_parseFromJSON(cJSON *promotion_array_elementJSON){

    promotion_array_element_t *promotion_array_element_local_var = NULL;

    // define the local variable for promotion_array_element->data
    promotion_t *data_local_nonprim = NULL;

    // define the local variable for promotion_array_element->exception
    exception_t *exception_local_nonprim = NULL;

    // promotion_array_element->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(promotion_array_elementJSON, "data");
    if (cJSON_IsNull(data)) {
        data = NULL;
    }
    if (data) { 
    data_local_nonprim = promotion_parseFromJSON(data); //nonprimitive
    }

    // promotion_array_element->exception
    cJSON *exception = cJSON_GetObjectItemCaseSensitive(promotion_array_elementJSON, "exception");
    if (cJSON_IsNull(exception)) {
        exception = NULL;
    }
    if (exception) { 
    exception_local_nonprim = exception_parseFromJSON(exception); //nonprimitive
    }



    promotion_array_element_local_var = promotion_array_element_create_internal (
        data ? data_local_nonprim : NULL,
        exception ? exception_local_nonprim : NULL
        );

    if (!promotion_array_element_local_var) {
        goto end;
    }

    return promotion_array_element_local_var;
end:
    if (data_local_nonprim) {
        promotion_free(data_local_nonprim);
        data_local_nonprim = NULL;
    }
    if (exception_local_nonprim) {
        exception_free(exception_local_nonprim);
        exception_local_nonprim = NULL;
    }
    return NULL;

}
