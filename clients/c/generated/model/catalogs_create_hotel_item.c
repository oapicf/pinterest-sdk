#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_create_hotel_item.h"


char* catalogs_create_hotel_item_operation_ToString(pinterest_rest_api_catalogs_create_hotel_item_OPERATION_e operation) {
    char* operationArray[] =  { "NULL", "CREATE" };
    return operationArray[operation];
}

pinterest_rest_api_catalogs_create_hotel_item_OPERATION_e catalogs_create_hotel_item_operation_FromString(char* operation){
    int stringToReturn = 0;
    char *operationArray[] =  { "NULL", "CREATE" };
    size_t sizeofArray = sizeof(operationArray) / sizeof(operationArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(operation, operationArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

catalogs_create_hotel_item_t *catalogs_create_hotel_item_create(
    char *hotel_id,
    pinterest_rest_api_catalogs_create_hotel_item_OPERATION_e operation,
    catalogs_hotel_attributes_t *attributes
    ) {
    catalogs_create_hotel_item_t *catalogs_create_hotel_item_local_var = malloc(sizeof(catalogs_create_hotel_item_t));
    if (!catalogs_create_hotel_item_local_var) {
        return NULL;
    }
    catalogs_create_hotel_item_local_var->hotel_id = hotel_id;
    catalogs_create_hotel_item_local_var->operation = operation;
    catalogs_create_hotel_item_local_var->attributes = attributes;

    return catalogs_create_hotel_item_local_var;
}


void catalogs_create_hotel_item_free(catalogs_create_hotel_item_t *catalogs_create_hotel_item) {
    if(NULL == catalogs_create_hotel_item){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_create_hotel_item->hotel_id) {
        free(catalogs_create_hotel_item->hotel_id);
        catalogs_create_hotel_item->hotel_id = NULL;
    }
    if (catalogs_create_hotel_item->attributes) {
        catalogs_hotel_attributes_free(catalogs_create_hotel_item->attributes);
        catalogs_create_hotel_item->attributes = NULL;
    }
    free(catalogs_create_hotel_item);
}

cJSON *catalogs_create_hotel_item_convertToJSON(catalogs_create_hotel_item_t *catalogs_create_hotel_item) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_create_hotel_item->hotel_id
    if (!catalogs_create_hotel_item->hotel_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "hotel_id", catalogs_create_hotel_item->hotel_id) == NULL) {
    goto fail; //String
    }


    // catalogs_create_hotel_item->operation
    if (pinterest_rest_api_catalogs_create_hotel_item_OPERATION_NULL == catalogs_create_hotel_item->operation) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "operation", operationcatalogs_create_hotel_item_ToString(catalogs_create_hotel_item->operation)) == NULL)
    {
    goto fail; //Enum
    }


    // catalogs_create_hotel_item->attributes
    if (!catalogs_create_hotel_item->attributes) {
        goto fail;
    }
    cJSON *attributes_local_JSON = catalogs_hotel_attributes_convertToJSON(catalogs_create_hotel_item->attributes);
    if(attributes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "attributes", attributes_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_create_hotel_item_t *catalogs_create_hotel_item_parseFromJSON(cJSON *catalogs_create_hotel_itemJSON){

    catalogs_create_hotel_item_t *catalogs_create_hotel_item_local_var = NULL;

    // define the local variable for catalogs_create_hotel_item->attributes
    catalogs_hotel_attributes_t *attributes_local_nonprim = NULL;

    // catalogs_create_hotel_item->hotel_id
    cJSON *hotel_id = cJSON_GetObjectItemCaseSensitive(catalogs_create_hotel_itemJSON, "hotel_id");
    if (!hotel_id) {
        goto end;
    }

    
    if(!cJSON_IsString(hotel_id))
    {
    goto end; //String
    }

    // catalogs_create_hotel_item->operation
    cJSON *operation = cJSON_GetObjectItemCaseSensitive(catalogs_create_hotel_itemJSON, "operation");
    if (!operation) {
        goto end;
    }

    pinterest_rest_api_catalogs_create_hotel_item_OPERATION_e operationVariable;
    
    if(!cJSON_IsString(operation))
    {
    goto end; //Enum
    }
    operationVariable = catalogs_create_hotel_item_operation_FromString(operation->valuestring);

    // catalogs_create_hotel_item->attributes
    cJSON *attributes = cJSON_GetObjectItemCaseSensitive(catalogs_create_hotel_itemJSON, "attributes");
    if (!attributes) {
        goto end;
    }

    
    attributes_local_nonprim = catalogs_hotel_attributes_parseFromJSON(attributes); //nonprimitive


    catalogs_create_hotel_item_local_var = catalogs_create_hotel_item_create (
        strdup(hotel_id->valuestring),
        operationVariable,
        attributes_local_nonprim
        );

    return catalogs_create_hotel_item_local_var;
end:
    if (attributes_local_nonprim) {
        catalogs_hotel_attributes_free(attributes_local_nonprim);
        attributes_local_nonprim = NULL;
    }
    return NULL;

}
