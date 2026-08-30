#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_groups_create_200_response_items_inner.h"



static ad_groups_create_200_response_items_inner_t *ad_groups_create_200_response_items_inner_create_internal(
    ad_group_t *data,
    list_t *exceptions
    ) {
    ad_groups_create_200_response_items_inner_t *ad_groups_create_200_response_items_inner_local_var = malloc(sizeof(ad_groups_create_200_response_items_inner_t));
    if (!ad_groups_create_200_response_items_inner_local_var) {
        return NULL;
    }
    memset(ad_groups_create_200_response_items_inner_local_var, 0, sizeof(ad_groups_create_200_response_items_inner_t));
    ad_groups_create_200_response_items_inner_local_var->_library_owned = 1;
    ad_groups_create_200_response_items_inner_local_var->data = data;
    ad_groups_create_200_response_items_inner_local_var->exceptions = exceptions;
    return ad_groups_create_200_response_items_inner_local_var;
}

__attribute__((deprecated)) ad_groups_create_200_response_items_inner_t *ad_groups_create_200_response_items_inner_create(
    ad_group_t *data,
    list_t *exceptions
    ) {
    ad_groups_create_200_response_items_inner_t *result = ad_groups_create_200_response_items_inner_create_internal (
        data,
        exceptions
        );
    if (!result) {
    }
    return result;
}

void ad_groups_create_200_response_items_inner_free(ad_groups_create_200_response_items_inner_t *ad_groups_create_200_response_items_inner) {
    if(NULL == ad_groups_create_200_response_items_inner){
        return ;
    }
    if(ad_groups_create_200_response_items_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ad_groups_create_200_response_items_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ad_groups_create_200_response_items_inner->data) {
        ad_group_free(ad_groups_create_200_response_items_inner->data);
        ad_groups_create_200_response_items_inner->data = NULL;
    }
    if (ad_groups_create_200_response_items_inner->exceptions) {
        list_ForEach(listEntry, ad_groups_create_200_response_items_inner->exceptions) {
            pinterest_lib_batch_item_exception_free(listEntry->data);
        }
        list_freeList(ad_groups_create_200_response_items_inner->exceptions);
        ad_groups_create_200_response_items_inner->exceptions = NULL;
    }
    free(ad_groups_create_200_response_items_inner);
}

cJSON *ad_groups_create_200_response_items_inner_convertToJSON(ad_groups_create_200_response_items_inner_t *ad_groups_create_200_response_items_inner) {
    cJSON *item = cJSON_CreateObject();

    // ad_groups_create_200_response_items_inner->data
    if(ad_groups_create_200_response_items_inner->data) {
    cJSON *data_local_JSON = ad_group_convertToJSON(ad_groups_create_200_response_items_inner->data);
    if(data_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "data", data_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // ad_groups_create_200_response_items_inner->exceptions
    if(ad_groups_create_200_response_items_inner->exceptions) {
    cJSON *exceptions = cJSON_AddArrayToObject(item, "exceptions");
    if(exceptions == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *exceptionsListEntry;
    if (ad_groups_create_200_response_items_inner->exceptions) {
    list_ForEach(exceptionsListEntry, ad_groups_create_200_response_items_inner->exceptions) {
    cJSON *itemLocal = pinterest_lib_batch_item_exception_convertToJSON(exceptionsListEntry->data);
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

ad_groups_create_200_response_items_inner_t *ad_groups_create_200_response_items_inner_parseFromJSON(cJSON *ad_groups_create_200_response_items_innerJSON){

    ad_groups_create_200_response_items_inner_t *ad_groups_create_200_response_items_inner_local_var = NULL;

    // define the local variable for ad_groups_create_200_response_items_inner->data
    ad_group_t *data_local_nonprim = NULL;

    // define the local list for ad_groups_create_200_response_items_inner->exceptions
    list_t *exceptionsList = NULL;

    // ad_groups_create_200_response_items_inner->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(ad_groups_create_200_response_items_innerJSON, "data");
    if (cJSON_IsNull(data)) {
        data = NULL;
    }
    if (data) { 
    data_local_nonprim = ad_group_parseFromJSON(data); //nonprimitive
    }

    // ad_groups_create_200_response_items_inner->exceptions
    cJSON *exceptions = cJSON_GetObjectItemCaseSensitive(ad_groups_create_200_response_items_innerJSON, "exceptions");
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
        pinterest_lib_batch_item_exception_t *exceptionsItem = pinterest_lib_batch_item_exception_parseFromJSON(exceptions_local_nonprimitive);

        list_addElement(exceptionsList, exceptionsItem);
    }
    }



    ad_groups_create_200_response_items_inner_local_var = ad_groups_create_200_response_items_inner_create_internal (
        data ? data_local_nonprim : NULL,
        exceptions ? exceptionsList : NULL
        );

    if (!ad_groups_create_200_response_items_inner_local_var) {
        goto end;
    }

    return ad_groups_create_200_response_items_inner_local_var;
end:
    if (data_local_nonprim) {
        ad_group_free(data_local_nonprim);
        data_local_nonprim = NULL;
    }
    if (exceptionsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, exceptionsList) {
            pinterest_lib_batch_item_exception_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(exceptionsList);
        exceptionsList = NULL;
    }
    return NULL;

}
