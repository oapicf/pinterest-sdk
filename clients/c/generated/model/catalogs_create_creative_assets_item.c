#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_create_creative_assets_item.h"


char* catalogs_create_creative_assets_item_operation_ToString(pinterest_rest_api_catalogs_create_creative_assets_item_OPERATION_e operation) {
    char* operationArray[] =  { "NULL", "CREATE" };
    return operationArray[operation];
}

pinterest_rest_api_catalogs_create_creative_assets_item_OPERATION_e catalogs_create_creative_assets_item_operation_FromString(char* operation){
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

static catalogs_create_creative_assets_item_t *catalogs_create_creative_assets_item_create_internal(
    char *creative_assets_id,
    pinterest_rest_api_catalogs_create_creative_assets_item_OPERATION_e operation,
    catalogs_creative_assets_attributes_t *attributes
    ) {
    catalogs_create_creative_assets_item_t *catalogs_create_creative_assets_item_local_var = malloc(sizeof(catalogs_create_creative_assets_item_t));
    if (!catalogs_create_creative_assets_item_local_var) {
        return NULL;
    }
    catalogs_create_creative_assets_item_local_var->creative_assets_id = creative_assets_id;
    catalogs_create_creative_assets_item_local_var->operation = operation;
    catalogs_create_creative_assets_item_local_var->attributes = attributes;

    catalogs_create_creative_assets_item_local_var->_library_owned = 1;
    return catalogs_create_creative_assets_item_local_var;
}

__attribute__((deprecated)) catalogs_create_creative_assets_item_t *catalogs_create_creative_assets_item_create(
    char *creative_assets_id,
    pinterest_rest_api_catalogs_create_creative_assets_item_OPERATION_e operation,
    catalogs_creative_assets_attributes_t *attributes
    ) {
    return catalogs_create_creative_assets_item_create_internal (
        creative_assets_id,
        operation,
        attributes
        );
}

void catalogs_create_creative_assets_item_free(catalogs_create_creative_assets_item_t *catalogs_create_creative_assets_item) {
    if(NULL == catalogs_create_creative_assets_item){
        return ;
    }
    if(catalogs_create_creative_assets_item->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_create_creative_assets_item_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_create_creative_assets_item->creative_assets_id) {
        free(catalogs_create_creative_assets_item->creative_assets_id);
        catalogs_create_creative_assets_item->creative_assets_id = NULL;
    }
    if (catalogs_create_creative_assets_item->attributes) {
        catalogs_creative_assets_attributes_free(catalogs_create_creative_assets_item->attributes);
        catalogs_create_creative_assets_item->attributes = NULL;
    }
    free(catalogs_create_creative_assets_item);
}

cJSON *catalogs_create_creative_assets_item_convertToJSON(catalogs_create_creative_assets_item_t *catalogs_create_creative_assets_item) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_create_creative_assets_item->creative_assets_id
    if (!catalogs_create_creative_assets_item->creative_assets_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "creative_assets_id", catalogs_create_creative_assets_item->creative_assets_id) == NULL) {
    goto fail; //String
    }


    // catalogs_create_creative_assets_item->operation
    if (pinterest_rest_api_catalogs_create_creative_assets_item_OPERATION_NULL == catalogs_create_creative_assets_item->operation) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "operation", catalogs_create_creative_assets_item_operation_ToString(catalogs_create_creative_assets_item->operation)) == NULL)
    {
    goto fail; //Enum
    }


    // catalogs_create_creative_assets_item->attributes
    if (!catalogs_create_creative_assets_item->attributes) {
        goto fail;
    }
    cJSON *attributes_local_JSON = catalogs_creative_assets_attributes_convertToJSON(catalogs_create_creative_assets_item->attributes);
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

catalogs_create_creative_assets_item_t *catalogs_create_creative_assets_item_parseFromJSON(cJSON *catalogs_create_creative_assets_itemJSON){

    catalogs_create_creative_assets_item_t *catalogs_create_creative_assets_item_local_var = NULL;

    // define the local variable for catalogs_create_creative_assets_item->attributes
    catalogs_creative_assets_attributes_t *attributes_local_nonprim = NULL;

    // catalogs_create_creative_assets_item->creative_assets_id
    cJSON *creative_assets_id = cJSON_GetObjectItemCaseSensitive(catalogs_create_creative_assets_itemJSON, "creative_assets_id");
    if (cJSON_IsNull(creative_assets_id)) {
        creative_assets_id = NULL;
    }
    if (!creative_assets_id) {
        goto end;
    }

    
    if(!cJSON_IsString(creative_assets_id))
    {
    goto end; //String
    }

    // catalogs_create_creative_assets_item->operation
    cJSON *operation = cJSON_GetObjectItemCaseSensitive(catalogs_create_creative_assets_itemJSON, "operation");
    if (cJSON_IsNull(operation)) {
        operation = NULL;
    }
    if (!operation) {
        goto end;
    }

    pinterest_rest_api_catalogs_create_creative_assets_item_OPERATION_e operationVariable;
    
    if(!cJSON_IsString(operation))
    {
    goto end; //Enum
    }
    operationVariable = catalogs_create_creative_assets_item_operation_FromString(operation->valuestring);

    // catalogs_create_creative_assets_item->attributes
    cJSON *attributes = cJSON_GetObjectItemCaseSensitive(catalogs_create_creative_assets_itemJSON, "attributes");
    if (cJSON_IsNull(attributes)) {
        attributes = NULL;
    }
    if (!attributes) {
        goto end;
    }

    
    attributes_local_nonprim = catalogs_creative_assets_attributes_parseFromJSON(attributes); //nonprimitive


    catalogs_create_creative_assets_item_local_var = catalogs_create_creative_assets_item_create_internal (
        strdup(creative_assets_id->valuestring),
        operationVariable,
        attributes_local_nonprim
        );

    return catalogs_create_creative_assets_item_local_var;
end:
    if (attributes_local_nonprim) {
        catalogs_creative_assets_attributes_free(attributes_local_nonprim);
        attributes_local_nonprim = NULL;
    }
    return NULL;

}
