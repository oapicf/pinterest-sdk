#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_delete_hotel_item.h"


char* catalogs_delete_hotel_item_operation_ToString(pinterest_rest_api_catalogs_delete_hotel_item_OPERATION_e operation) {
    char* operationArray[] =  { "NULL", "DELETE" };
    return operationArray[operation];
}

pinterest_rest_api_catalogs_delete_hotel_item_OPERATION_e catalogs_delete_hotel_item_operation_FromString(char* operation){
    int stringToReturn = 0;
    char *operationArray[] =  { "NULL", "DELETE" };
    size_t sizeofArray = sizeof(operationArray) / sizeof(operationArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(operation, operationArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

catalogs_delete_hotel_item_t *catalogs_delete_hotel_item_create(
    char *hotel_id,
    pinterest_rest_api_catalogs_delete_hotel_item_OPERATION_e operation
    ) {
    catalogs_delete_hotel_item_t *catalogs_delete_hotel_item_local_var = malloc(sizeof(catalogs_delete_hotel_item_t));
    if (!catalogs_delete_hotel_item_local_var) {
        return NULL;
    }
    catalogs_delete_hotel_item_local_var->hotel_id = hotel_id;
    catalogs_delete_hotel_item_local_var->operation = operation;

    return catalogs_delete_hotel_item_local_var;
}


void catalogs_delete_hotel_item_free(catalogs_delete_hotel_item_t *catalogs_delete_hotel_item) {
    if(NULL == catalogs_delete_hotel_item){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_delete_hotel_item->hotel_id) {
        free(catalogs_delete_hotel_item->hotel_id);
        catalogs_delete_hotel_item->hotel_id = NULL;
    }
    free(catalogs_delete_hotel_item);
}

cJSON *catalogs_delete_hotel_item_convertToJSON(catalogs_delete_hotel_item_t *catalogs_delete_hotel_item) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_delete_hotel_item->hotel_id
    if (!catalogs_delete_hotel_item->hotel_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "hotel_id", catalogs_delete_hotel_item->hotel_id) == NULL) {
    goto fail; //String
    }


    // catalogs_delete_hotel_item->operation
    if (pinterest_rest_api_catalogs_delete_hotel_item_OPERATION_NULL == catalogs_delete_hotel_item->operation) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "operation", operationcatalogs_delete_hotel_item_ToString(catalogs_delete_hotel_item->operation)) == NULL)
    {
    goto fail; //Enum
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_delete_hotel_item_t *catalogs_delete_hotel_item_parseFromJSON(cJSON *catalogs_delete_hotel_itemJSON){

    catalogs_delete_hotel_item_t *catalogs_delete_hotel_item_local_var = NULL;

    // catalogs_delete_hotel_item->hotel_id
    cJSON *hotel_id = cJSON_GetObjectItemCaseSensitive(catalogs_delete_hotel_itemJSON, "hotel_id");
    if (!hotel_id) {
        goto end;
    }

    
    if(!cJSON_IsString(hotel_id))
    {
    goto end; //String
    }

    // catalogs_delete_hotel_item->operation
    cJSON *operation = cJSON_GetObjectItemCaseSensitive(catalogs_delete_hotel_itemJSON, "operation");
    if (!operation) {
        goto end;
    }

    pinterest_rest_api_catalogs_delete_hotel_item_OPERATION_e operationVariable;
    
    if(!cJSON_IsString(operation))
    {
    goto end; //Enum
    }
    operationVariable = catalogs_delete_hotel_item_operation_FromString(operation->valuestring);


    catalogs_delete_hotel_item_local_var = catalogs_delete_hotel_item_create (
        strdup(hotel_id->valuestring),
        operationVariable
        );

    return catalogs_delete_hotel_item_local_var;
end:
    return NULL;

}
