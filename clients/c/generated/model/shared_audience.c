#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "shared_audience.h"


char* shared_audience_operation_type_ToString(pinterest_rest_api_shared_audience__e operation_type) {
    char* operation_typeArray[] =  { "NULL", "SHARE", "REVOKE" };
    return operation_typeArray[operation_type];
}

pinterest_rest_api_shared_audience__e shared_audience_operation_type_FromString(char* operation_type){
    int stringToReturn = 0;
    char *operation_typeArray[] =  { "NULL", "SHARE", "REVOKE" };
    size_t sizeofArray = sizeof(operation_typeArray) / sizeof(operation_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(operation_type, operation_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

shared_audience_t *shared_audience_create(
    char *audience_id,
    operation_type_t *operation_type,
    list_t *recipient_account_ids
    ) {
    shared_audience_t *shared_audience_local_var = malloc(sizeof(shared_audience_t));
    if (!shared_audience_local_var) {
        return NULL;
    }
    shared_audience_local_var->audience_id = audience_id;
    shared_audience_local_var->operation_type = operation_type;
    shared_audience_local_var->recipient_account_ids = recipient_account_ids;

    return shared_audience_local_var;
}


void shared_audience_free(shared_audience_t *shared_audience) {
    if(NULL == shared_audience){
        return ;
    }
    listEntry_t *listEntry;
    if (shared_audience->audience_id) {
        free(shared_audience->audience_id);
        shared_audience->audience_id = NULL;
    }
    if (shared_audience->operation_type) {
        operation_type_free(shared_audience->operation_type);
        shared_audience->operation_type = NULL;
    }
    if (shared_audience->recipient_account_ids) {
        list_ForEach(listEntry, shared_audience->recipient_account_ids) {
            free(listEntry->data);
        }
        list_freeList(shared_audience->recipient_account_ids);
        shared_audience->recipient_account_ids = NULL;
    }
    free(shared_audience);
}

cJSON *shared_audience_convertToJSON(shared_audience_t *shared_audience) {
    cJSON *item = cJSON_CreateObject();

    // shared_audience->audience_id
    if (!shared_audience->audience_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "audience_id", shared_audience->audience_id) == NULL) {
    goto fail; //String
    }


    // shared_audience->operation_type
    if (pinterest_rest_api_shared_audience__NULL == shared_audience->operation_type) {
        goto fail;
    }
    cJSON *operation_type_local_JSON = operation_type_convertToJSON(shared_audience->operation_type);
    if(operation_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "operation_type", operation_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // shared_audience->recipient_account_ids
    if (!shared_audience->recipient_account_ids) {
        goto fail;
    }
    cJSON *recipient_account_ids = cJSON_AddArrayToObject(item, "recipient_account_ids");
    if(recipient_account_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *recipient_account_idsListEntry;
    list_ForEach(recipient_account_idsListEntry, shared_audience->recipient_account_ids) {
    if(cJSON_AddStringToObject(recipient_account_ids, "", (char*)recipient_account_idsListEntry->data) == NULL)
    {
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

shared_audience_t *shared_audience_parseFromJSON(cJSON *shared_audienceJSON){

    shared_audience_t *shared_audience_local_var = NULL;

    // define the local variable for shared_audience->operation_type
    operation_type_t *operation_type_local_nonprim = NULL;

    // define the local list for shared_audience->recipient_account_ids
    list_t *recipient_account_idsList = NULL;

    // shared_audience->audience_id
    cJSON *audience_id = cJSON_GetObjectItemCaseSensitive(shared_audienceJSON, "audience_id");
    if (!audience_id) {
        goto end;
    }

    
    if(!cJSON_IsString(audience_id))
    {
    goto end; //String
    }

    // shared_audience->operation_type
    cJSON *operation_type = cJSON_GetObjectItemCaseSensitive(shared_audienceJSON, "operation_type");
    if (!operation_type) {
        goto end;
    }

    
    operation_type_local_nonprim = operation_type_parseFromJSON(operation_type); //custom

    // shared_audience->recipient_account_ids
    cJSON *recipient_account_ids = cJSON_GetObjectItemCaseSensitive(shared_audienceJSON, "recipient_account_ids");
    if (!recipient_account_ids) {
        goto end;
    }

    
    cJSON *recipient_account_ids_local = NULL;
    if(!cJSON_IsArray(recipient_account_ids)) {
        goto end;//primitive container
    }
    recipient_account_idsList = list_createList();

    cJSON_ArrayForEach(recipient_account_ids_local, recipient_account_ids)
    {
        if(!cJSON_IsString(recipient_account_ids_local))
        {
            goto end;
        }
        list_addElement(recipient_account_idsList , strdup(recipient_account_ids_local->valuestring));
    }


    shared_audience_local_var = shared_audience_create (
        strdup(audience_id->valuestring),
        operation_type_local_nonprim,
        recipient_account_idsList
        );

    return shared_audience_local_var;
end:
    if (operation_type_local_nonprim) {
        operation_type_free(operation_type_local_nonprim);
        operation_type_local_nonprim = NULL;
    }
    if (recipient_account_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, recipient_account_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(recipient_account_idsList);
        recipient_account_idsList = NULL;
    }
    return NULL;

}
