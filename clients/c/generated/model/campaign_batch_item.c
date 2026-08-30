#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_batch_item.h"



static campaign_batch_item_t *campaign_batch_item_create_internal(
    campaign_batch_response_data_t *data,
    list_t *exceptions
    ) {
    campaign_batch_item_t *campaign_batch_item_local_var = malloc(sizeof(campaign_batch_item_t));
    if (!campaign_batch_item_local_var) {
        return NULL;
    }
    memset(campaign_batch_item_local_var, 0, sizeof(campaign_batch_item_t));
    campaign_batch_item_local_var->_library_owned = 1;
    campaign_batch_item_local_var->data = data;
    campaign_batch_item_local_var->exceptions = exceptions;
    return campaign_batch_item_local_var;
}

__attribute__((deprecated)) campaign_batch_item_t *campaign_batch_item_create(
    campaign_batch_response_data_t *data,
    list_t *exceptions
    ) {
    campaign_batch_item_t *result = campaign_batch_item_create_internal (
        data,
        exceptions
        );
    if (!result) {
    }
    return result;
}

void campaign_batch_item_free(campaign_batch_item_t *campaign_batch_item) {
    if(NULL == campaign_batch_item){
        return ;
    }
    if(campaign_batch_item->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "campaign_batch_item_free");
        return ;
    }
    listEntry_t *listEntry;
    if (campaign_batch_item->data) {
        campaign_batch_response_data_free(campaign_batch_item->data);
        campaign_batch_item->data = NULL;
    }
    if (campaign_batch_item->exceptions) {
        list_ForEach(listEntry, campaign_batch_item->exceptions) {
            exception_free(listEntry->data);
        }
        list_freeList(campaign_batch_item->exceptions);
        campaign_batch_item->exceptions = NULL;
    }
    free(campaign_batch_item);
}

cJSON *campaign_batch_item_convertToJSON(campaign_batch_item_t *campaign_batch_item) {
    cJSON *item = cJSON_CreateObject();

    // campaign_batch_item->data
    if(campaign_batch_item->data) {
    cJSON *data_local_JSON = campaign_batch_response_data_convertToJSON(campaign_batch_item->data);
    if(data_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "data", data_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // campaign_batch_item->exceptions
    if(campaign_batch_item->exceptions) {
    cJSON *exceptions = cJSON_AddArrayToObject(item, "exceptions");
    if(exceptions == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *exceptionsListEntry;
    if (campaign_batch_item->exceptions) {
    list_ForEach(exceptionsListEntry, campaign_batch_item->exceptions) {
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

campaign_batch_item_t *campaign_batch_item_parseFromJSON(cJSON *campaign_batch_itemJSON){

    campaign_batch_item_t *campaign_batch_item_local_var = NULL;

    // define the local variable for campaign_batch_item->data
    campaign_batch_response_data_t *data_local_nonprim = NULL;

    // define the local list for campaign_batch_item->exceptions
    list_t *exceptionsList = NULL;

    // campaign_batch_item->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(campaign_batch_itemJSON, "data");
    if (cJSON_IsNull(data)) {
        data = NULL;
    }
    if (data) { 
    data_local_nonprim = campaign_batch_response_data_parseFromJSON(data); //nonprimitive
    }

    // campaign_batch_item->exceptions
    cJSON *exceptions = cJSON_GetObjectItemCaseSensitive(campaign_batch_itemJSON, "exceptions");
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



    campaign_batch_item_local_var = campaign_batch_item_create_internal (
        data ? data_local_nonprim : NULL,
        exceptions ? exceptionsList : NULL
        );

    if (!campaign_batch_item_local_var) {
        goto end;
    }

    return campaign_batch_item_local_var;
end:
    if (data_local_nonprim) {
        campaign_batch_response_data_free(data_local_nonprim);
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
