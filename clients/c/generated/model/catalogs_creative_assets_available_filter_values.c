#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_creative_assets_available_filter_values.h"


char* catalogs_creative_assets_available_filter_values_catalog_type_ToString(pinterest_rest_api_catalogs_creative_assets_available_filter_values_CATALOGTYPE_e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "CREATIVE_ASSETS" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_catalogs_creative_assets_available_filter_values_CATALOGTYPE_e catalogs_creative_assets_available_filter_values_catalog_type_FromString(char* catalog_type){
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

static catalogs_creative_assets_available_filter_values_t *catalogs_creative_assets_available_filter_values_create_internal(
    pinterest_rest_api_catalogs_creative_assets_available_filter_values_CATALOGTYPE_e catalog_type,
    catalogs_creative_assets_filter_values_map_t *filter_values
    ) {
    catalogs_creative_assets_available_filter_values_t *catalogs_creative_assets_available_filter_values_local_var = malloc(sizeof(catalogs_creative_assets_available_filter_values_t));
    if (!catalogs_creative_assets_available_filter_values_local_var) {
        return NULL;
    }
    catalogs_creative_assets_available_filter_values_local_var->catalog_type = catalog_type;
    catalogs_creative_assets_available_filter_values_local_var->filter_values = filter_values;

    catalogs_creative_assets_available_filter_values_local_var->_library_owned = 1;
    return catalogs_creative_assets_available_filter_values_local_var;
}

__attribute__((deprecated)) catalogs_creative_assets_available_filter_values_t *catalogs_creative_assets_available_filter_values_create(
    pinterest_rest_api_catalogs_creative_assets_available_filter_values_CATALOGTYPE_e catalog_type,
    catalogs_creative_assets_filter_values_map_t *filter_values
    ) {
    return catalogs_creative_assets_available_filter_values_create_internal (
        catalog_type,
        filter_values
        );
}

void catalogs_creative_assets_available_filter_values_free(catalogs_creative_assets_available_filter_values_t *catalogs_creative_assets_available_filter_values) {
    if(NULL == catalogs_creative_assets_available_filter_values){
        return ;
    }
    if(catalogs_creative_assets_available_filter_values->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_creative_assets_available_filter_values_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_creative_assets_available_filter_values->filter_values) {
        catalogs_creative_assets_filter_values_map_free(catalogs_creative_assets_available_filter_values->filter_values);
        catalogs_creative_assets_available_filter_values->filter_values = NULL;
    }
    free(catalogs_creative_assets_available_filter_values);
}

cJSON *catalogs_creative_assets_available_filter_values_convertToJSON(catalogs_creative_assets_available_filter_values_t *catalogs_creative_assets_available_filter_values) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_creative_assets_available_filter_values->catalog_type
    if (pinterest_rest_api_catalogs_creative_assets_available_filter_values_CATALOGTYPE_NULL == catalogs_creative_assets_available_filter_values->catalog_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_type", catalogs_creative_assets_available_filter_values_catalog_type_ToString(catalogs_creative_assets_available_filter_values->catalog_type)) == NULL)
    {
    goto fail; //Enum
    }


    // catalogs_creative_assets_available_filter_values->filter_values
    if (!catalogs_creative_assets_available_filter_values->filter_values) {
        goto fail;
    }
    cJSON *filter_values_local_JSON = catalogs_creative_assets_filter_values_map_convertToJSON(catalogs_creative_assets_available_filter_values->filter_values);
    if(filter_values_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "filter_values", filter_values_local_JSON);
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

catalogs_creative_assets_available_filter_values_t *catalogs_creative_assets_available_filter_values_parseFromJSON(cJSON *catalogs_creative_assets_available_filter_valuesJSON){

    catalogs_creative_assets_available_filter_values_t *catalogs_creative_assets_available_filter_values_local_var = NULL;

    // define the local variable for catalogs_creative_assets_available_filter_values->filter_values
    catalogs_creative_assets_filter_values_map_t *filter_values_local_nonprim = NULL;

    // catalogs_creative_assets_available_filter_values->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_available_filter_valuesJSON, "catalog_type");
    if (cJSON_IsNull(catalog_type)) {
        catalog_type = NULL;
    }
    if (!catalog_type) {
        goto end;
    }

    pinterest_rest_api_catalogs_creative_assets_available_filter_values_CATALOGTYPE_e catalog_typeVariable;
    
    if(!cJSON_IsString(catalog_type))
    {
    goto end; //Enum
    }
    catalog_typeVariable = catalogs_creative_assets_available_filter_values_catalog_type_FromString(catalog_type->valuestring);

    // catalogs_creative_assets_available_filter_values->filter_values
    cJSON *filter_values = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_available_filter_valuesJSON, "filter_values");
    if (cJSON_IsNull(filter_values)) {
        filter_values = NULL;
    }
    if (!filter_values) {
        goto end;
    }

    
    filter_values_local_nonprim = catalogs_creative_assets_filter_values_map_parseFromJSON(filter_values); //nonprimitive


    catalogs_creative_assets_available_filter_values_local_var = catalogs_creative_assets_available_filter_values_create_internal (
        catalog_typeVariable,
        filter_values_local_nonprim
        );

    return catalogs_creative_assets_available_filter_values_local_var;
end:
    if (filter_values_local_nonprim) {
        catalogs_creative_assets_filter_values_map_free(filter_values_local_nonprim);
        filter_values_local_nonprim = NULL;
    }
    return NULL;

}
