#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "lead_form_array_response_items_inner.h"



lead_form_array_response_items_inner_t *lead_form_array_response_items_inner_create(
    lead_form_response_t *data,
    list_t *exceptions
    ) {
    lead_form_array_response_items_inner_t *lead_form_array_response_items_inner_local_var = malloc(sizeof(lead_form_array_response_items_inner_t));
    if (!lead_form_array_response_items_inner_local_var) {
        return NULL;
    }
    lead_form_array_response_items_inner_local_var->data = data;
    lead_form_array_response_items_inner_local_var->exceptions = exceptions;

    return lead_form_array_response_items_inner_local_var;
}


void lead_form_array_response_items_inner_free(lead_form_array_response_items_inner_t *lead_form_array_response_items_inner) {
    if(NULL == lead_form_array_response_items_inner){
        return ;
    }
    listEntry_t *listEntry;
    if (lead_form_array_response_items_inner->data) {
        lead_form_response_free(lead_form_array_response_items_inner->data);
        lead_form_array_response_items_inner->data = NULL;
    }
    if (lead_form_array_response_items_inner->exceptions) {
        list_ForEach(listEntry, lead_form_array_response_items_inner->exceptions) {
            exception_free(listEntry->data);
        }
        list_freeList(lead_form_array_response_items_inner->exceptions);
        lead_form_array_response_items_inner->exceptions = NULL;
    }
    free(lead_form_array_response_items_inner);
}

cJSON *lead_form_array_response_items_inner_convertToJSON(lead_form_array_response_items_inner_t *lead_form_array_response_items_inner) {
    cJSON *item = cJSON_CreateObject();

    // lead_form_array_response_items_inner->data
    if(lead_form_array_response_items_inner->data) {
    cJSON *data_local_JSON = lead_form_response_convertToJSON(lead_form_array_response_items_inner->data);
    if(data_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "data", data_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // lead_form_array_response_items_inner->exceptions
    if(lead_form_array_response_items_inner->exceptions) {
    cJSON *exceptions = cJSON_AddArrayToObject(item, "exceptions");
    if(exceptions == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *exceptionsListEntry;
    if (lead_form_array_response_items_inner->exceptions) {
    list_ForEach(exceptionsListEntry, lead_form_array_response_items_inner->exceptions) {
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

lead_form_array_response_items_inner_t *lead_form_array_response_items_inner_parseFromJSON(cJSON *lead_form_array_response_items_innerJSON){

    lead_form_array_response_items_inner_t *lead_form_array_response_items_inner_local_var = NULL;

    // define the local variable for lead_form_array_response_items_inner->data
    lead_form_response_t *data_local_nonprim = NULL;

    // define the local list for lead_form_array_response_items_inner->exceptions
    list_t *exceptionsList = NULL;

    // lead_form_array_response_items_inner->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(lead_form_array_response_items_innerJSON, "data");
    if (data) { 
    data_local_nonprim = lead_form_response_parseFromJSON(data); //nonprimitive
    }

    // lead_form_array_response_items_inner->exceptions
    cJSON *exceptions = cJSON_GetObjectItemCaseSensitive(lead_form_array_response_items_innerJSON, "exceptions");
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


    lead_form_array_response_items_inner_local_var = lead_form_array_response_items_inner_create (
        data ? data_local_nonprim : NULL,
        exceptions ? exceptionsList : NULL
        );

    return lead_form_array_response_items_inner_local_var;
end:
    if (data_local_nonprim) {
        lead_form_response_free(data_local_nonprim);
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
