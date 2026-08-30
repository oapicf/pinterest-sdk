#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_retail_item_response.h"


char* catalogs_retail_item_response_catalog_type_ToString(pinterest_rest_api_catalogs_retail_item_response_CATALOGTYPE_e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "RETAIL" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_catalogs_retail_item_response_CATALOGTYPE_e catalogs_retail_item_response_catalog_type_FromString(char* catalog_type){
    int stringToReturn = 0;
    char *catalog_typeArray[] =  { "NULL", "RETAIL" };
    size_t sizeofArray = sizeof(catalog_typeArray) / sizeof(catalog_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(catalog_type, catalog_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* catalogs_retail_item_response_item_response_kind_ToString(pinterest_rest_api_catalogs_retail_item_response_ITEMRESPONSEKIND_e item_response_kind) {
    char* item_response_kindArray[] =  { "NULL", "retail_item" };
    return item_response_kindArray[item_response_kind];
}

pinterest_rest_api_catalogs_retail_item_response_ITEMRESPONSEKIND_e catalogs_retail_item_response_item_response_kind_FromString(char* item_response_kind){
    int stringToReturn = 0;
    char *item_response_kindArray[] =  { "NULL", "retail_item" };
    size_t sizeofArray = sizeof(item_response_kindArray) / sizeof(item_response_kindArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(item_response_kind, item_response_kindArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static catalogs_retail_item_response_t *catalogs_retail_item_response_create_internal(
    item_attributes_t *attributes,
    pinterest_rest_api_catalogs_retail_item_response_CATALOGTYPE_e catalog_type,
    char *item_id,
    pinterest_rest_api_catalogs_retail_item_response_ITEMRESPONSEKIND_e item_response_kind,
    list_t *pins
    ) {
    catalogs_retail_item_response_t *catalogs_retail_item_response_local_var = malloc(sizeof(catalogs_retail_item_response_t));
    if (!catalogs_retail_item_response_local_var) {
        return NULL;
    }
    memset(catalogs_retail_item_response_local_var, 0, sizeof(catalogs_retail_item_response_t));
    catalogs_retail_item_response_local_var->_library_owned = 1;
    catalogs_retail_item_response_local_var->attributes = attributes;
    catalogs_retail_item_response_local_var->catalog_type = catalog_type;
    catalogs_retail_item_response_local_var->item_id = item_id;
    catalogs_retail_item_response_local_var->item_response_kind = item_response_kind;
    catalogs_retail_item_response_local_var->pins = pins;
    return catalogs_retail_item_response_local_var;
}

__attribute__((deprecated)) catalogs_retail_item_response_t *catalogs_retail_item_response_create(
    item_attributes_t *attributes,
    pinterest_rest_api_catalogs_retail_item_response_CATALOGTYPE_e catalog_type,
    char *item_id,
    pinterest_rest_api_catalogs_retail_item_response_ITEMRESPONSEKIND_e item_response_kind,
    list_t *pins
    ) {
    catalogs_retail_item_response_t *result = catalogs_retail_item_response_create_internal (
        attributes,
        catalog_type,
        item_id,
        item_response_kind,
        pins
        );
    if (!result) {
    }
    return result;
}

void catalogs_retail_item_response_free(catalogs_retail_item_response_t *catalogs_retail_item_response) {
    if(NULL == catalogs_retail_item_response){
        return ;
    }
    if(catalogs_retail_item_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_retail_item_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_retail_item_response->attributes) {
        item_attributes_free(catalogs_retail_item_response->attributes);
        catalogs_retail_item_response->attributes = NULL;
    }
    if (catalogs_retail_item_response->item_id) {
        free(catalogs_retail_item_response->item_id);
        catalogs_retail_item_response->item_id = NULL;
    }
    if (catalogs_retail_item_response->pins) {
        list_ForEach(listEntry, catalogs_retail_item_response->pins) {
            pin_free(listEntry->data);
        }
        list_freeList(catalogs_retail_item_response->pins);
        catalogs_retail_item_response->pins = NULL;
    }
    free(catalogs_retail_item_response);
}

cJSON *catalogs_retail_item_response_convertToJSON(catalogs_retail_item_response_t *catalogs_retail_item_response) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_retail_item_response->attributes
    if(catalogs_retail_item_response->attributes) {
    cJSON *attributes_local_JSON = item_attributes_convertToJSON(catalogs_retail_item_response->attributes);
    if(attributes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "attributes", attributes_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_retail_item_response->catalog_type
    if (pinterest_rest_api_catalogs_retail_item_response_CATALOGTYPE_NULL == catalogs_retail_item_response->catalog_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_type", catalogs_retail_item_response_catalog_type_ToString(catalogs_retail_item_response->catalog_type)) == NULL)
    {
    goto fail; //Enum
    }


    // catalogs_retail_item_response->item_id
    if(catalogs_retail_item_response->item_id) {
    if(cJSON_AddStringToObject(item, "item_id", catalogs_retail_item_response->item_id) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_retail_item_response->item_response_kind
    if (pinterest_rest_api_catalogs_retail_item_response_ITEMRESPONSEKIND_NULL == catalogs_retail_item_response->item_response_kind) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "item_response_kind", catalogs_retail_item_response_item_response_kind_ToString(catalogs_retail_item_response->item_response_kind)) == NULL)
    {
    goto fail; //Enum
    }


    // catalogs_retail_item_response->pins
    if(catalogs_retail_item_response->pins) {
    cJSON *pins = cJSON_AddArrayToObject(item, "pins");
    if(pins == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *pinsListEntry;
    if (catalogs_retail_item_response->pins) {
    list_ForEach(pinsListEntry, catalogs_retail_item_response->pins) {
    cJSON *itemLocal = pin_convertToJSON(pinsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(pins, itemLocal);
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

catalogs_retail_item_response_t *catalogs_retail_item_response_parseFromJSON(cJSON *catalogs_retail_item_responseJSON){

    catalogs_retail_item_response_t *catalogs_retail_item_response_local_var = NULL;

    // define the local variable for catalogs_retail_item_response->attributes
    item_attributes_t *attributes_local_nonprim = NULL;

    char *item_id_local_str = NULL;

    // define the local list for catalogs_retail_item_response->pins
    list_t *pinsList = NULL;

    // catalogs_retail_item_response->attributes
    cJSON *attributes = cJSON_GetObjectItemCaseSensitive(catalogs_retail_item_responseJSON, "attributes");
    if (cJSON_IsNull(attributes)) {
        attributes = NULL;
    }
    if (attributes) { 
    attributes_local_nonprim = item_attributes_parseFromJSON(attributes); //nonprimitive
    }

    // catalogs_retail_item_response->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_retail_item_responseJSON, "catalog_type");
    if (cJSON_IsNull(catalog_type)) {
        catalog_type = NULL;
    }
    if (!catalog_type) {
        goto end;
    }

    pinterest_rest_api_catalogs_retail_item_response_CATALOGTYPE_e catalog_typeVariable;
    
    if(!cJSON_IsString(catalog_type))
    {
    goto end; //Enum
    }
    catalog_typeVariable = catalogs_retail_item_response_catalog_type_FromString(catalog_type->valuestring);

    // catalogs_retail_item_response->item_id
    cJSON *item_id = cJSON_GetObjectItemCaseSensitive(catalogs_retail_item_responseJSON, "item_id");
    if (cJSON_IsNull(item_id)) {
        item_id = NULL;
    }
    if (item_id) { 
    if(!cJSON_IsString(item_id) && !cJSON_IsNull(item_id))
    {
    goto end; //String
    }
    }

    // catalogs_retail_item_response->item_response_kind
    cJSON *item_response_kind = cJSON_GetObjectItemCaseSensitive(catalogs_retail_item_responseJSON, "item_response_kind");
    if (cJSON_IsNull(item_response_kind)) {
        item_response_kind = NULL;
    }
    if (!item_response_kind) {
        goto end;
    }

    pinterest_rest_api_catalogs_retail_item_response_ITEMRESPONSEKIND_e item_response_kindVariable;
    
    if(!cJSON_IsString(item_response_kind))
    {
    goto end; //Enum
    }
    item_response_kindVariable = catalogs_retail_item_response_item_response_kind_FromString(item_response_kind->valuestring);

    // catalogs_retail_item_response->pins
    cJSON *pins = cJSON_GetObjectItemCaseSensitive(catalogs_retail_item_responseJSON, "pins");
    if (cJSON_IsNull(pins)) {
        pins = NULL;
    }
    if (pins) { 
    cJSON *pins_local_nonprimitive = NULL;
    if(!cJSON_IsArray(pins)){
        goto end; //nonprimitive container
    }

    pinsList = list_createList();

    cJSON_ArrayForEach(pins_local_nonprimitive,pins )
    {
        if(!cJSON_IsObject(pins_local_nonprimitive)){
            goto end;
        }
        pin_t *pinsItem = pin_parseFromJSON(pins_local_nonprimitive);

        list_addElement(pinsList, pinsItem);
    }
    }


    if (item_id && !cJSON_IsNull(item_id)) item_id_local_str = strdup(item_id->valuestring);

    catalogs_retail_item_response_local_var = catalogs_retail_item_response_create_internal (
        attributes ? attributes_local_nonprim : NULL,
        catalog_typeVariable,
        item_id_local_str,
        item_response_kindVariable,
        pins ? pinsList : NULL
        );

    if (!catalogs_retail_item_response_local_var) {
        goto end;
    }

    return catalogs_retail_item_response_local_var;
end:
    if (attributes_local_nonprim) {
        item_attributes_free(attributes_local_nonprim);
        attributes_local_nonprim = NULL;
    }
    if (item_id_local_str) {
        free(item_id_local_str);
        item_id_local_str = NULL;
    }
    if (pinsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, pinsList) {
            pin_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(pinsList);
        pinsList = NULL;
    }
    return NULL;

}
