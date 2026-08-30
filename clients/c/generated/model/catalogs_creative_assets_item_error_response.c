#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_creative_assets_item_error_response.h"


char* catalogs_creative_assets_item_error_response_catalog_type_ToString(pinterest_rest_api_catalogs_creative_assets_item_error_response_CATALOGTYPE_e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "CREATIVE_ASSETS" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_catalogs_creative_assets_item_error_response_CATALOGTYPE_e catalogs_creative_assets_item_error_response_catalog_type_FromString(char* catalog_type){
    int stringToReturn = 0;
    char *catalog_typeArray[] =  { "NULL", "CREATIVE_ASSETS" };
    size_t sizeofArray = sizeof(catalog_typeArray) / sizeof(catalog_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(catalog_type, catalog_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* catalogs_creative_assets_item_error_response_item_response_kind_ToString(pinterest_rest_api_catalogs_creative_assets_item_error_response_ITEMRESPONSEKIND_e item_response_kind) {
    char* item_response_kindArray[] =  { "NULL", "creative_assets_item_error" };
    return item_response_kindArray[item_response_kind];
}

pinterest_rest_api_catalogs_creative_assets_item_error_response_ITEMRESPONSEKIND_e catalogs_creative_assets_item_error_response_item_response_kind_FromString(char* item_response_kind){
    int stringToReturn = 0;
    char *item_response_kindArray[] =  { "NULL", "creative_assets_item_error" };
    size_t sizeofArray = sizeof(item_response_kindArray) / sizeof(item_response_kindArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(item_response_kind, item_response_kindArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static catalogs_creative_assets_item_error_response_t *catalogs_creative_assets_item_error_response_create_internal(
    pinterest_rest_api_catalogs_creative_assets_item_error_response_CATALOGTYPE_e catalog_type,
    char *creative_assets_id,
    list_t *errors,
    pinterest_rest_api_catalogs_creative_assets_item_error_response_ITEMRESPONSEKIND_e item_response_kind
    ) {
    catalogs_creative_assets_item_error_response_t *catalogs_creative_assets_item_error_response_local_var = malloc(sizeof(catalogs_creative_assets_item_error_response_t));
    if (!catalogs_creative_assets_item_error_response_local_var) {
        return NULL;
    }
    memset(catalogs_creative_assets_item_error_response_local_var, 0, sizeof(catalogs_creative_assets_item_error_response_t));
    catalogs_creative_assets_item_error_response_local_var->_library_owned = 1;
    catalogs_creative_assets_item_error_response_local_var->catalog_type = catalog_type;
    catalogs_creative_assets_item_error_response_local_var->creative_assets_id = creative_assets_id;
    catalogs_creative_assets_item_error_response_local_var->errors = errors;
    catalogs_creative_assets_item_error_response_local_var->item_response_kind = item_response_kind;
    return catalogs_creative_assets_item_error_response_local_var;
}

__attribute__((deprecated)) catalogs_creative_assets_item_error_response_t *catalogs_creative_assets_item_error_response_create(
    pinterest_rest_api_catalogs_creative_assets_item_error_response_CATALOGTYPE_e catalog_type,
    char *creative_assets_id,
    list_t *errors,
    pinterest_rest_api_catalogs_creative_assets_item_error_response_ITEMRESPONSEKIND_e item_response_kind
    ) {
    catalogs_creative_assets_item_error_response_t *result = catalogs_creative_assets_item_error_response_create_internal (
        catalog_type,
        creative_assets_id,
        errors,
        item_response_kind
        );
    if (!result) {
    }
    return result;
}

void catalogs_creative_assets_item_error_response_free(catalogs_creative_assets_item_error_response_t *catalogs_creative_assets_item_error_response) {
    if(NULL == catalogs_creative_assets_item_error_response){
        return ;
    }
    if(catalogs_creative_assets_item_error_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_creative_assets_item_error_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_creative_assets_item_error_response->creative_assets_id) {
        free(catalogs_creative_assets_item_error_response->creative_assets_id);
        catalogs_creative_assets_item_error_response->creative_assets_id = NULL;
    }
    if (catalogs_creative_assets_item_error_response->errors) {
        list_ForEach(listEntry, catalogs_creative_assets_item_error_response->errors) {
            item_validation_event_free(listEntry->data);
        }
        list_freeList(catalogs_creative_assets_item_error_response->errors);
        catalogs_creative_assets_item_error_response->errors = NULL;
    }
    free(catalogs_creative_assets_item_error_response);
}

cJSON *catalogs_creative_assets_item_error_response_convertToJSON(catalogs_creative_assets_item_error_response_t *catalogs_creative_assets_item_error_response) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_creative_assets_item_error_response->catalog_type
    if (pinterest_rest_api_catalogs_creative_assets_item_error_response_CATALOGTYPE_NULL == catalogs_creative_assets_item_error_response->catalog_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_type", catalogs_creative_assets_item_error_response_catalog_type_ToString(catalogs_creative_assets_item_error_response->catalog_type)) == NULL)
    {
    goto fail; //Enum
    }


    // catalogs_creative_assets_item_error_response->creative_assets_id
    if(catalogs_creative_assets_item_error_response->creative_assets_id) {
    if(cJSON_AddStringToObject(item, "creative_assets_id", catalogs_creative_assets_item_error_response->creative_assets_id) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_creative_assets_item_error_response->errors
    if (!catalogs_creative_assets_item_error_response->errors) {
        goto fail;
    }
    cJSON *errors = cJSON_AddArrayToObject(item, "errors");
    if(errors == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *errorsListEntry;
    if (catalogs_creative_assets_item_error_response->errors) {
    list_ForEach(errorsListEntry, catalogs_creative_assets_item_error_response->errors) {
    cJSON *itemLocal = item_validation_event_convertToJSON(errorsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(errors, itemLocal);
    }
    }


    // catalogs_creative_assets_item_error_response->item_response_kind
    if (pinterest_rest_api_catalogs_creative_assets_item_error_response_ITEMRESPONSEKIND_NULL == catalogs_creative_assets_item_error_response->item_response_kind) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "item_response_kind", catalogs_creative_assets_item_error_response_item_response_kind_ToString(catalogs_creative_assets_item_error_response->item_response_kind)) == NULL)
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

catalogs_creative_assets_item_error_response_t *catalogs_creative_assets_item_error_response_parseFromJSON(cJSON *catalogs_creative_assets_item_error_responseJSON){

    catalogs_creative_assets_item_error_response_t *catalogs_creative_assets_item_error_response_local_var = NULL;

    char *creative_assets_id_local_str = NULL;

    // define the local list for catalogs_creative_assets_item_error_response->errors
    list_t *errorsList = NULL;

    // catalogs_creative_assets_item_error_response->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_item_error_responseJSON, "catalog_type");
    if (cJSON_IsNull(catalog_type)) {
        catalog_type = NULL;
    }
    if (!catalog_type) {
        goto end;
    }

    pinterest_rest_api_catalogs_creative_assets_item_error_response_CATALOGTYPE_e catalog_typeVariable;
    
    if(!cJSON_IsString(catalog_type))
    {
    goto end; //Enum
    }
    catalog_typeVariable = catalogs_creative_assets_item_error_response_catalog_type_FromString(catalog_type->valuestring);

    // catalogs_creative_assets_item_error_response->creative_assets_id
    cJSON *creative_assets_id = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_item_error_responseJSON, "creative_assets_id");
    if (cJSON_IsNull(creative_assets_id)) {
        creative_assets_id = NULL;
    }
    if (creative_assets_id) { 
    if(!cJSON_IsString(creative_assets_id) && !cJSON_IsNull(creative_assets_id))
    {
    goto end; //String
    }
    }

    // catalogs_creative_assets_item_error_response->errors
    cJSON *errors = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_item_error_responseJSON, "errors");
    if (cJSON_IsNull(errors)) {
        errors = NULL;
    }
    if (!errors) {
        goto end;
    }

    
    cJSON *errors_local_nonprimitive = NULL;
    if(!cJSON_IsArray(errors)){
        goto end; //nonprimitive container
    }

    errorsList = list_createList();

    cJSON_ArrayForEach(errors_local_nonprimitive,errors )
    {
        if(!cJSON_IsObject(errors_local_nonprimitive)){
            goto end;
        }
        item_validation_event_t *errorsItem = item_validation_event_parseFromJSON(errors_local_nonprimitive);

        list_addElement(errorsList, errorsItem);
    }

    // catalogs_creative_assets_item_error_response->item_response_kind
    cJSON *item_response_kind = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_item_error_responseJSON, "item_response_kind");
    if (cJSON_IsNull(item_response_kind)) {
        item_response_kind = NULL;
    }
    if (!item_response_kind) {
        goto end;
    }

    pinterest_rest_api_catalogs_creative_assets_item_error_response_ITEMRESPONSEKIND_e item_response_kindVariable;
    
    if(!cJSON_IsString(item_response_kind))
    {
    goto end; //Enum
    }
    item_response_kindVariable = catalogs_creative_assets_item_error_response_item_response_kind_FromString(item_response_kind->valuestring);


    if (creative_assets_id && !cJSON_IsNull(creative_assets_id)) creative_assets_id_local_str = strdup(creative_assets_id->valuestring);

    catalogs_creative_assets_item_error_response_local_var = catalogs_creative_assets_item_error_response_create_internal (
        catalog_typeVariable,
        creative_assets_id_local_str,
        errorsList,
        item_response_kindVariable
        );

    if (!catalogs_creative_assets_item_error_response_local_var) {
        goto end;
    }

    return catalogs_creative_assets_item_error_response_local_var;
end:
    if (creative_assets_id_local_str) {
        free(creative_assets_id_local_str);
        creative_assets_id_local_str = NULL;
    }
    if (errorsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, errorsList) {
            item_validation_event_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(errorsList);
        errorsList = NULL;
    }
    return NULL;

}
