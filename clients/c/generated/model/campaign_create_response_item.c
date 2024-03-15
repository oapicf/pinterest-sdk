#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_create_response_item.h"



campaign_create_response_item_t *campaign_create_response_item_create(
    campaign_create_response_data_t *data,
    list_t *exceptions
    ) {
    campaign_create_response_item_t *campaign_create_response_item_local_var = malloc(sizeof(campaign_create_response_item_t));
    if (!campaign_create_response_item_local_var) {
        return NULL;
    }
    campaign_create_response_item_local_var->data = data;
    campaign_create_response_item_local_var->exceptions = exceptions;

    return campaign_create_response_item_local_var;
}


void campaign_create_response_item_free(campaign_create_response_item_t *campaign_create_response_item) {
    if(NULL == campaign_create_response_item){
        return ;
    }
    listEntry_t *listEntry;
    if (campaign_create_response_item->data) {
        campaign_create_response_data_free(campaign_create_response_item->data);
        campaign_create_response_item->data = NULL;
    }
    if (campaign_create_response_item->exceptions) {
        list_ForEach(listEntry, campaign_create_response_item->exceptions) {
            exception_free(listEntry->data);
        }
        list_freeList(campaign_create_response_item->exceptions);
        campaign_create_response_item->exceptions = NULL;
    }
    free(campaign_create_response_item);
}

cJSON *campaign_create_response_item_convertToJSON(campaign_create_response_item_t *campaign_create_response_item) {
    cJSON *item = cJSON_CreateObject();

    // campaign_create_response_item->data
    if(campaign_create_response_item->data) {
    cJSON *data_local_JSON = campaign_create_response_data_convertToJSON(campaign_create_response_item->data);
    if(data_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "data", data_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // campaign_create_response_item->exceptions
    if(campaign_create_response_item->exceptions) {
    cJSON *exceptions = cJSON_AddArrayToObject(item, "exceptions");
    if(exceptions == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *exceptionsListEntry;
    if (campaign_create_response_item->exceptions) {
    list_ForEach(exceptionsListEntry, campaign_create_response_item->exceptions) {
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

campaign_create_response_item_t *campaign_create_response_item_parseFromJSON(cJSON *campaign_create_response_itemJSON){

    campaign_create_response_item_t *campaign_create_response_item_local_var = NULL;

    // define the local variable for campaign_create_response_item->data
    campaign_create_response_data_t *data_local_nonprim = NULL;

    // define the local list for campaign_create_response_item->exceptions
    list_t *exceptionsList = NULL;

    // campaign_create_response_item->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(campaign_create_response_itemJSON, "data");
    if (data) { 
    data_local_nonprim = campaign_create_response_data_parseFromJSON(data); //nonprimitive
    }

    // campaign_create_response_item->exceptions
    cJSON *exceptions = cJSON_GetObjectItemCaseSensitive(campaign_create_response_itemJSON, "exceptions");
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


    campaign_create_response_item_local_var = campaign_create_response_item_create (
        data ? data_local_nonprim : NULL,
        exceptions ? exceptionsList : NULL
        );

    return campaign_create_response_item_local_var;
end:
    if (data_local_nonprim) {
        campaign_create_response_data_free(data_local_nonprim);
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
