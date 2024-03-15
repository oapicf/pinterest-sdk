#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_group_array_response_element.h"



ad_group_array_response_element_t *ad_group_array_response_element_create(
    ad_group_response_t *data,
    list_t *exceptions
    ) {
    ad_group_array_response_element_t *ad_group_array_response_element_local_var = malloc(sizeof(ad_group_array_response_element_t));
    if (!ad_group_array_response_element_local_var) {
        return NULL;
    }
    ad_group_array_response_element_local_var->data = data;
    ad_group_array_response_element_local_var->exceptions = exceptions;

    return ad_group_array_response_element_local_var;
}


void ad_group_array_response_element_free(ad_group_array_response_element_t *ad_group_array_response_element) {
    if(NULL == ad_group_array_response_element){
        return ;
    }
    listEntry_t *listEntry;
    if (ad_group_array_response_element->data) {
        ad_group_response_free(ad_group_array_response_element->data);
        ad_group_array_response_element->data = NULL;
    }
    if (ad_group_array_response_element->exceptions) {
        list_ForEach(listEntry, ad_group_array_response_element->exceptions) {
            exception_free(listEntry->data);
        }
        list_freeList(ad_group_array_response_element->exceptions);
        ad_group_array_response_element->exceptions = NULL;
    }
    free(ad_group_array_response_element);
}

cJSON *ad_group_array_response_element_convertToJSON(ad_group_array_response_element_t *ad_group_array_response_element) {
    cJSON *item = cJSON_CreateObject();

    // ad_group_array_response_element->data
    if(ad_group_array_response_element->data) {
    cJSON *data_local_JSON = ad_group_response_convertToJSON(ad_group_array_response_element->data);
    if(data_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "data", data_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // ad_group_array_response_element->exceptions
    if(ad_group_array_response_element->exceptions) {
    cJSON *exceptions = cJSON_AddArrayToObject(item, "exceptions");
    if(exceptions == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *exceptionsListEntry;
    if (ad_group_array_response_element->exceptions) {
    list_ForEach(exceptionsListEntry, ad_group_array_response_element->exceptions) {
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

ad_group_array_response_element_t *ad_group_array_response_element_parseFromJSON(cJSON *ad_group_array_response_elementJSON){

    ad_group_array_response_element_t *ad_group_array_response_element_local_var = NULL;

    // define the local variable for ad_group_array_response_element->data
    ad_group_response_t *data_local_nonprim = NULL;

    // define the local list for ad_group_array_response_element->exceptions
    list_t *exceptionsList = NULL;

    // ad_group_array_response_element->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(ad_group_array_response_elementJSON, "data");
    if (data) { 
    data_local_nonprim = ad_group_response_parseFromJSON(data); //nonprimitive
    }

    // ad_group_array_response_element->exceptions
    cJSON *exceptions = cJSON_GetObjectItemCaseSensitive(ad_group_array_response_elementJSON, "exceptions");
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


    ad_group_array_response_element_local_var = ad_group_array_response_element_create (
        data ? data_local_nonprim : NULL,
        exceptions ? exceptionsList : NULL
        );

    return ad_group_array_response_element_local_var;
end:
    if (data_local_nonprim) {
        ad_group_response_free(data_local_nonprim);
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
