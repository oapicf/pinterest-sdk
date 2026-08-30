#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_update_creative_assets_item.h"


char* catalogs_update_creative_assets_item_operation_ToString(pinterest_rest_api_catalogs_update_creative_assets_item_OPERATION_e operation) {
    char* operationArray[] =  { "NULL", "UPDATE" };
    return operationArray[operation];
}

pinterest_rest_api_catalogs_update_creative_assets_item_OPERATION_e catalogs_update_creative_assets_item_operation_FromString(char* operation){
    int stringToReturn = 0;
    char *operationArray[] =  { "NULL", "UPDATE" };
    size_t sizeofArray = sizeof(operationArray) / sizeof(operationArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(operation, operationArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static catalogs_update_creative_assets_item_t *catalogs_update_creative_assets_item_create_internal(
    catalogs_updatable_creative_assets_attributes_t *attributes,
    char *creative_assets_id,
    pinterest_rest_api_catalogs_update_creative_assets_item_OPERATION_e operation
    ) {
    catalogs_update_creative_assets_item_t *catalogs_update_creative_assets_item_local_var = malloc(sizeof(catalogs_update_creative_assets_item_t));
    if (!catalogs_update_creative_assets_item_local_var) {
        return NULL;
    }
    memset(catalogs_update_creative_assets_item_local_var, 0, sizeof(catalogs_update_creative_assets_item_t));
    catalogs_update_creative_assets_item_local_var->_library_owned = 1;
    catalogs_update_creative_assets_item_local_var->attributes = attributes;
    catalogs_update_creative_assets_item_local_var->creative_assets_id = creative_assets_id;
    catalogs_update_creative_assets_item_local_var->operation = operation;
    return catalogs_update_creative_assets_item_local_var;
}

__attribute__((deprecated)) catalogs_update_creative_assets_item_t *catalogs_update_creative_assets_item_create(
    catalogs_updatable_creative_assets_attributes_t *attributes,
    char *creative_assets_id,
    pinterest_rest_api_catalogs_update_creative_assets_item_OPERATION_e operation
    ) {
    catalogs_update_creative_assets_item_t *result = catalogs_update_creative_assets_item_create_internal (
        attributes,
        creative_assets_id,
        operation
        );
    if (!result) {
    }
    return result;
}

void catalogs_update_creative_assets_item_free(catalogs_update_creative_assets_item_t *catalogs_update_creative_assets_item) {
    if(NULL == catalogs_update_creative_assets_item){
        return ;
    }
    if(catalogs_update_creative_assets_item->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_update_creative_assets_item_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_update_creative_assets_item->attributes) {
        catalogs_updatable_creative_assets_attributes_free(catalogs_update_creative_assets_item->attributes);
        catalogs_update_creative_assets_item->attributes = NULL;
    }
    if (catalogs_update_creative_assets_item->creative_assets_id) {
        free(catalogs_update_creative_assets_item->creative_assets_id);
        catalogs_update_creative_assets_item->creative_assets_id = NULL;
    }
    free(catalogs_update_creative_assets_item);
}

cJSON *catalogs_update_creative_assets_item_convertToJSON(catalogs_update_creative_assets_item_t *catalogs_update_creative_assets_item) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_update_creative_assets_item->attributes
    if (!catalogs_update_creative_assets_item->attributes) {
        goto fail;
    }
    cJSON *attributes_local_JSON = catalogs_updatable_creative_assets_attributes_convertToJSON(catalogs_update_creative_assets_item->attributes);
    if(attributes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "attributes", attributes_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_update_creative_assets_item->creative_assets_id
    if (!catalogs_update_creative_assets_item->creative_assets_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "creative_assets_id", catalogs_update_creative_assets_item->creative_assets_id) == NULL) {
    goto fail; //String
    }


    // catalogs_update_creative_assets_item->operation
    if (pinterest_rest_api_catalogs_update_creative_assets_item_OPERATION_NULL == catalogs_update_creative_assets_item->operation) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "operation", catalogs_update_creative_assets_item_operation_ToString(catalogs_update_creative_assets_item->operation)) == NULL)
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

catalogs_update_creative_assets_item_t *catalogs_update_creative_assets_item_parseFromJSON(cJSON *catalogs_update_creative_assets_itemJSON){

    catalogs_update_creative_assets_item_t *catalogs_update_creative_assets_item_local_var = NULL;

    // define the local variable for catalogs_update_creative_assets_item->attributes
    catalogs_updatable_creative_assets_attributes_t *attributes_local_nonprim = NULL;

    char *creative_assets_id_local_str = NULL;

    // catalogs_update_creative_assets_item->attributes
    cJSON *attributes = cJSON_GetObjectItemCaseSensitive(catalogs_update_creative_assets_itemJSON, "attributes");
    if (cJSON_IsNull(attributes)) {
        attributes = NULL;
    }
    if (!attributes) {
        goto end;
    }

    
    attributes_local_nonprim = catalogs_updatable_creative_assets_attributes_parseFromJSON(attributes); //nonprimitive

    // catalogs_update_creative_assets_item->creative_assets_id
    cJSON *creative_assets_id = cJSON_GetObjectItemCaseSensitive(catalogs_update_creative_assets_itemJSON, "creative_assets_id");
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

    // catalogs_update_creative_assets_item->operation
    cJSON *operation = cJSON_GetObjectItemCaseSensitive(catalogs_update_creative_assets_itemJSON, "operation");
    if (cJSON_IsNull(operation)) {
        operation = NULL;
    }
    if (!operation) {
        goto end;
    }

    pinterest_rest_api_catalogs_update_creative_assets_item_OPERATION_e operationVariable;
    
    if(!cJSON_IsString(operation))
    {
    goto end; //Enum
    }
    operationVariable = catalogs_update_creative_assets_item_operation_FromString(operation->valuestring);


    if (creative_assets_id && !cJSON_IsNull(creative_assets_id)) creative_assets_id_local_str = strdup(creative_assets_id->valuestring);

    catalogs_update_creative_assets_item_local_var = catalogs_update_creative_assets_item_create_internal (
        attributes_local_nonprim,
        creative_assets_id_local_str,
        operationVariable
        );

    if (!catalogs_update_creative_assets_item_local_var) {
        goto end;
    }

    return catalogs_update_creative_assets_item_local_var;
end:
    if (attributes_local_nonprim) {
        catalogs_updatable_creative_assets_attributes_free(attributes_local_nonprim);
        attributes_local_nonprim = NULL;
    }
    if (creative_assets_id_local_str) {
        free(creative_assets_id_local_str);
        creative_assets_id_local_str = NULL;
    }
    return NULL;

}
