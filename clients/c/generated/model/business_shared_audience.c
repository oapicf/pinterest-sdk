#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "business_shared_audience.h"


char* business_shared_audience_operation_type_ToString(pinterest_rest_api_business_shared_audience__e operation_type) {
    char* operation_typeArray[] =  { "NULL", "SHARE", "REVOKE" };
    return operation_typeArray[operation_type];
}

pinterest_rest_api_business_shared_audience__e business_shared_audience_operation_type_FromString(char* operation_type){
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

business_shared_audience_t *business_shared_audience_create(
    char *audience_id,
    operation_type_t *operation_type,
    list_t *recipient_business_ids
    ) {
    business_shared_audience_t *business_shared_audience_local_var = malloc(sizeof(business_shared_audience_t));
    if (!business_shared_audience_local_var) {
        return NULL;
    }
    business_shared_audience_local_var->audience_id = audience_id;
    business_shared_audience_local_var->operation_type = operation_type;
    business_shared_audience_local_var->recipient_business_ids = recipient_business_ids;

    return business_shared_audience_local_var;
}


void business_shared_audience_free(business_shared_audience_t *business_shared_audience) {
    if(NULL == business_shared_audience){
        return ;
    }
    listEntry_t *listEntry;
    if (business_shared_audience->audience_id) {
        free(business_shared_audience->audience_id);
        business_shared_audience->audience_id = NULL;
    }
    if (business_shared_audience->operation_type) {
        operation_type_free(business_shared_audience->operation_type);
        business_shared_audience->operation_type = NULL;
    }
    if (business_shared_audience->recipient_business_ids) {
        list_ForEach(listEntry, business_shared_audience->recipient_business_ids) {
            free(listEntry->data);
        }
        list_freeList(business_shared_audience->recipient_business_ids);
        business_shared_audience->recipient_business_ids = NULL;
    }
    free(business_shared_audience);
}

cJSON *business_shared_audience_convertToJSON(business_shared_audience_t *business_shared_audience) {
    cJSON *item = cJSON_CreateObject();

    // business_shared_audience->audience_id
    if (!business_shared_audience->audience_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "audience_id", business_shared_audience->audience_id) == NULL) {
    goto fail; //String
    }


    // business_shared_audience->operation_type
    if (pinterest_rest_api_business_shared_audience__NULL == business_shared_audience->operation_type) {
        goto fail;
    }
    cJSON *operation_type_local_JSON = operation_type_convertToJSON(business_shared_audience->operation_type);
    if(operation_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "operation_type", operation_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // business_shared_audience->recipient_business_ids
    if (!business_shared_audience->recipient_business_ids) {
        goto fail;
    }
    cJSON *recipient_business_ids = cJSON_AddArrayToObject(item, "recipient_business_ids");
    if(recipient_business_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *recipient_business_idsListEntry;
    list_ForEach(recipient_business_idsListEntry, business_shared_audience->recipient_business_ids) {
    if(cJSON_AddStringToObject(recipient_business_ids, "", (char*)recipient_business_idsListEntry->data) == NULL)
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

business_shared_audience_t *business_shared_audience_parseFromJSON(cJSON *business_shared_audienceJSON){

    business_shared_audience_t *business_shared_audience_local_var = NULL;

    // define the local variable for business_shared_audience->operation_type
    operation_type_t *operation_type_local_nonprim = NULL;

    // define the local list for business_shared_audience->recipient_business_ids
    list_t *recipient_business_idsList = NULL;

    // business_shared_audience->audience_id
    cJSON *audience_id = cJSON_GetObjectItemCaseSensitive(business_shared_audienceJSON, "audience_id");
    if (!audience_id) {
        goto end;
    }

    
    if(!cJSON_IsString(audience_id))
    {
    goto end; //String
    }

    // business_shared_audience->operation_type
    cJSON *operation_type = cJSON_GetObjectItemCaseSensitive(business_shared_audienceJSON, "operation_type");
    if (!operation_type) {
        goto end;
    }

    
    operation_type_local_nonprim = operation_type_parseFromJSON(operation_type); //custom

    // business_shared_audience->recipient_business_ids
    cJSON *recipient_business_ids = cJSON_GetObjectItemCaseSensitive(business_shared_audienceJSON, "recipient_business_ids");
    if (!recipient_business_ids) {
        goto end;
    }

    
    cJSON *recipient_business_ids_local = NULL;
    if(!cJSON_IsArray(recipient_business_ids)) {
        goto end;//primitive container
    }
    recipient_business_idsList = list_createList();

    cJSON_ArrayForEach(recipient_business_ids_local, recipient_business_ids)
    {
        if(!cJSON_IsString(recipient_business_ids_local))
        {
            goto end;
        }
        list_addElement(recipient_business_idsList , strdup(recipient_business_ids_local->valuestring));
    }


    business_shared_audience_local_var = business_shared_audience_create (
        strdup(audience_id->valuestring),
        operation_type_local_nonprim,
        recipient_business_idsList
        );

    return business_shared_audience_local_var;
end:
    if (operation_type_local_nonprim) {
        operation_type_free(operation_type_local_nonprim);
        operation_type_local_nonprim = NULL;
    }
    if (recipient_business_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, recipient_business_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(recipient_business_idsList);
        recipient_business_idsList = NULL;
    }
    return NULL;

}
