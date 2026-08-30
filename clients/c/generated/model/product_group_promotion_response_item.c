#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "product_group_promotion_response_item.h"



static product_group_promotion_response_item_t *product_group_promotion_response_item_create_internal(
    product_group_promotion_t *data,
    list_t *exceptions
    ) {
    product_group_promotion_response_item_t *product_group_promotion_response_item_local_var = malloc(sizeof(product_group_promotion_response_item_t));
    if (!product_group_promotion_response_item_local_var) {
        return NULL;
    }
    memset(product_group_promotion_response_item_local_var, 0, sizeof(product_group_promotion_response_item_t));
    product_group_promotion_response_item_local_var->_library_owned = 1;
    product_group_promotion_response_item_local_var->data = data;
    product_group_promotion_response_item_local_var->exceptions = exceptions;
    return product_group_promotion_response_item_local_var;
}

__attribute__((deprecated)) product_group_promotion_response_item_t *product_group_promotion_response_item_create(
    product_group_promotion_t *data,
    list_t *exceptions
    ) {
    product_group_promotion_response_item_t *result = product_group_promotion_response_item_create_internal (
        data,
        exceptions
        );
    if (!result) {
    }
    return result;
}

void product_group_promotion_response_item_free(product_group_promotion_response_item_t *product_group_promotion_response_item) {
    if(NULL == product_group_promotion_response_item){
        return ;
    }
    if(product_group_promotion_response_item->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "product_group_promotion_response_item_free");
        return ;
    }
    listEntry_t *listEntry;
    if (product_group_promotion_response_item->data) {
        product_group_promotion_free(product_group_promotion_response_item->data);
        product_group_promotion_response_item->data = NULL;
    }
    if (product_group_promotion_response_item->exceptions) {
        list_ForEach(listEntry, product_group_promotion_response_item->exceptions) {
            exception_free(listEntry->data);
        }
        list_freeList(product_group_promotion_response_item->exceptions);
        product_group_promotion_response_item->exceptions = NULL;
    }
    free(product_group_promotion_response_item);
}

cJSON *product_group_promotion_response_item_convertToJSON(product_group_promotion_response_item_t *product_group_promotion_response_item) {
    cJSON *item = cJSON_CreateObject();

    // product_group_promotion_response_item->data
    if(product_group_promotion_response_item->data) {
    cJSON *data_local_JSON = product_group_promotion_convertToJSON(product_group_promotion_response_item->data);
    if(data_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "data", data_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // product_group_promotion_response_item->exceptions
    if(product_group_promotion_response_item->exceptions) {
    cJSON *exceptions = cJSON_AddArrayToObject(item, "exceptions");
    if(exceptions == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *exceptionsListEntry;
    if (product_group_promotion_response_item->exceptions) {
    list_ForEach(exceptionsListEntry, product_group_promotion_response_item->exceptions) {
    cJSON *itemLocal = exception_convertToJSON(exceptionsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(exceptions, itemLocal);
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

product_group_promotion_response_item_t *product_group_promotion_response_item_parseFromJSON(cJSON *product_group_promotion_response_itemJSON){

    product_group_promotion_response_item_t *product_group_promotion_response_item_local_var = NULL;

    // define the local variable for product_group_promotion_response_item->data
    product_group_promotion_t *data_local_nonprim = NULL;

    // define the local list for product_group_promotion_response_item->exceptions
    list_t *exceptionsList = NULL;

    // product_group_promotion_response_item->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(product_group_promotion_response_itemJSON, "data");
    if (cJSON_IsNull(data)) {
        data = NULL;
    }
    if (data) { 
    data_local_nonprim = product_group_promotion_parseFromJSON(data); //nonprimitive
    }

    // product_group_promotion_response_item->exceptions
    cJSON *exceptions = cJSON_GetObjectItemCaseSensitive(product_group_promotion_response_itemJSON, "exceptions");
    if (cJSON_IsNull(exceptions)) {
        exceptions = NULL;
    }
    if (exceptions) { 
    cJSON *exceptions_local_nonprimitive = NULL;
    if(!cJSON_IsArray(exceptions)){
        goto end; //nonprimitive container
    }

    exceptionsList = list_createList();

    cJSON_ArrayForEach(exceptions_local_nonprimitive,exceptions )
    {
        if(!cJSON_IsObject(exceptions_local_nonprimitive)){
            goto end;
        }
        exception_t *exceptionsItem = exception_parseFromJSON(exceptions_local_nonprimitive);

        list_addElement(exceptionsList, exceptionsItem);
    }
    }



    product_group_promotion_response_item_local_var = product_group_promotion_response_item_create_internal (
        data ? data_local_nonprim : NULL,
        exceptions ? exceptionsList : NULL
        );

    if (!product_group_promotion_response_item_local_var) {
        goto end;
    }

    return product_group_promotion_response_item_local_var;
end:
    if (data_local_nonprim) {
        product_group_promotion_free(data_local_nonprim);
        data_local_nonprim = NULL;
    }
    if (exceptionsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, exceptionsList) {
            exception_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(exceptionsList);
        exceptionsList = NULL;
    }
    return NULL;

}
