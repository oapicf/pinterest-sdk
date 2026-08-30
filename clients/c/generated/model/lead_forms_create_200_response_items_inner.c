#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "lead_forms_create_200_response_items_inner.h"



static lead_forms_create_200_response_items_inner_t *lead_forms_create_200_response_items_inner_create_internal(
    lead_form_t *data,
    list_t *exceptions
    ) {
    lead_forms_create_200_response_items_inner_t *lead_forms_create_200_response_items_inner_local_var = malloc(sizeof(lead_forms_create_200_response_items_inner_t));
    if (!lead_forms_create_200_response_items_inner_local_var) {
        return NULL;
    }
    memset(lead_forms_create_200_response_items_inner_local_var, 0, sizeof(lead_forms_create_200_response_items_inner_t));
    lead_forms_create_200_response_items_inner_local_var->_library_owned = 1;
    lead_forms_create_200_response_items_inner_local_var->data = data;
    lead_forms_create_200_response_items_inner_local_var->exceptions = exceptions;
    return lead_forms_create_200_response_items_inner_local_var;
}

__attribute__((deprecated)) lead_forms_create_200_response_items_inner_t *lead_forms_create_200_response_items_inner_create(
    lead_form_t *data,
    list_t *exceptions
    ) {
    lead_forms_create_200_response_items_inner_t *result = lead_forms_create_200_response_items_inner_create_internal (
        data,
        exceptions
        );
    if (!result) {
    }
    return result;
}

void lead_forms_create_200_response_items_inner_free(lead_forms_create_200_response_items_inner_t *lead_forms_create_200_response_items_inner) {
    if(NULL == lead_forms_create_200_response_items_inner){
        return ;
    }
    if(lead_forms_create_200_response_items_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "lead_forms_create_200_response_items_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (lead_forms_create_200_response_items_inner->data) {
        lead_form_free(lead_forms_create_200_response_items_inner->data);
        lead_forms_create_200_response_items_inner->data = NULL;
    }
    if (lead_forms_create_200_response_items_inner->exceptions) {
        list_ForEach(listEntry, lead_forms_create_200_response_items_inner->exceptions) {
            pinterest_lib_batch_item_exception_free(listEntry->data);
        }
        list_freeList(lead_forms_create_200_response_items_inner->exceptions);
        lead_forms_create_200_response_items_inner->exceptions = NULL;
    }
    free(lead_forms_create_200_response_items_inner);
}

cJSON *lead_forms_create_200_response_items_inner_convertToJSON(lead_forms_create_200_response_items_inner_t *lead_forms_create_200_response_items_inner) {
    cJSON *item = cJSON_CreateObject();

    // lead_forms_create_200_response_items_inner->data
    if(lead_forms_create_200_response_items_inner->data) {
    cJSON *data_local_JSON = lead_form_convertToJSON(lead_forms_create_200_response_items_inner->data);
    if(data_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "data", data_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // lead_forms_create_200_response_items_inner->exceptions
    if(lead_forms_create_200_response_items_inner->exceptions) {
    cJSON *exceptions = cJSON_AddArrayToObject(item, "exceptions");
    if(exceptions == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *exceptionsListEntry;
    if (lead_forms_create_200_response_items_inner->exceptions) {
    list_ForEach(exceptionsListEntry, lead_forms_create_200_response_items_inner->exceptions) {
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

lead_forms_create_200_response_items_inner_t *lead_forms_create_200_response_items_inner_parseFromJSON(cJSON *lead_forms_create_200_response_items_innerJSON){

    lead_forms_create_200_response_items_inner_t *lead_forms_create_200_response_items_inner_local_var = NULL;

    // define the local variable for lead_forms_create_200_response_items_inner->data
    lead_form_t *data_local_nonprim = NULL;

    // define the local list for lead_forms_create_200_response_items_inner->exceptions
    list_t *exceptionsList = NULL;

    // lead_forms_create_200_response_items_inner->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(lead_forms_create_200_response_items_innerJSON, "data");
    if (cJSON_IsNull(data)) {
        data = NULL;
    }
    if (data) { 
    data_local_nonprim = lead_form_parseFromJSON(data); //nonprimitive
    }

    // lead_forms_create_200_response_items_inner->exceptions
    cJSON *exceptions = cJSON_GetObjectItemCaseSensitive(lead_forms_create_200_response_items_innerJSON, "exceptions");
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



    lead_forms_create_200_response_items_inner_local_var = lead_forms_create_200_response_items_inner_create_internal (
        data ? data_local_nonprim : NULL,
        exceptions ? exceptionsList : NULL
        );

    if (!lead_forms_create_200_response_items_inner_local_var) {
        goto end;
    }

    return lead_forms_create_200_response_items_inner_local_var;
end:
    if (data_local_nonprim) {
        lead_form_free(data_local_nonprim);
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
