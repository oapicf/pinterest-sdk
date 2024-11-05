#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_creative_assets_product_group_update_request.h"


char* catalogs_creative_assets_product_group_update_request_catalog_type_ToString(pinterest_rest_api_catalogs_creative_assets_product_group_update_request_CATALOGTYPE_e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "CREATIVE_ASSETS" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_catalogs_creative_assets_product_group_update_request_CATALOGTYPE_e catalogs_creative_assets_product_group_update_request_catalog_type_FromString(char* catalog_type){
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

catalogs_creative_assets_product_group_update_request_t *catalogs_creative_assets_product_group_update_request_create(
    pinterest_rest_api_catalogs_creative_assets_product_group_update_request_CATALOGTYPE_e catalog_type,
    char *name,
    char *description,
    catalogs_creative_assets_product_group_filters_t *filters
    ) {
    catalogs_creative_assets_product_group_update_request_t *catalogs_creative_assets_product_group_update_request_local_var = malloc(sizeof(catalogs_creative_assets_product_group_update_request_t));
    if (!catalogs_creative_assets_product_group_update_request_local_var) {
        return NULL;
    }
    catalogs_creative_assets_product_group_update_request_local_var->catalog_type = catalog_type;
    catalogs_creative_assets_product_group_update_request_local_var->name = name;
    catalogs_creative_assets_product_group_update_request_local_var->description = description;
    catalogs_creative_assets_product_group_update_request_local_var->filters = filters;

    return catalogs_creative_assets_product_group_update_request_local_var;
}


void catalogs_creative_assets_product_group_update_request_free(catalogs_creative_assets_product_group_update_request_t *catalogs_creative_assets_product_group_update_request) {
    if(NULL == catalogs_creative_assets_product_group_update_request){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_creative_assets_product_group_update_request->name) {
        free(catalogs_creative_assets_product_group_update_request->name);
        catalogs_creative_assets_product_group_update_request->name = NULL;
    }
    if (catalogs_creative_assets_product_group_update_request->description) {
        free(catalogs_creative_assets_product_group_update_request->description);
        catalogs_creative_assets_product_group_update_request->description = NULL;
    }
    if (catalogs_creative_assets_product_group_update_request->filters) {
        catalogs_creative_assets_product_group_filters_free(catalogs_creative_assets_product_group_update_request->filters);
        catalogs_creative_assets_product_group_update_request->filters = NULL;
    }
    free(catalogs_creative_assets_product_group_update_request);
}

cJSON *catalogs_creative_assets_product_group_update_request_convertToJSON(catalogs_creative_assets_product_group_update_request_t *catalogs_creative_assets_product_group_update_request) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_creative_assets_product_group_update_request->catalog_type
    if(catalogs_creative_assets_product_group_update_request->catalog_type != pinterest_rest_api_catalogs_creative_assets_product_group_update_request_CATALOGTYPE_NULL) {
    if(cJSON_AddStringToObject(item, "catalog_type", catalog_typecatalogs_creative_assets_product_group_update_request_ToString(catalogs_creative_assets_product_group_update_request->catalog_type)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // catalogs_creative_assets_product_group_update_request->name
    if(catalogs_creative_assets_product_group_update_request->name) {
    if(cJSON_AddStringToObject(item, "name", catalogs_creative_assets_product_group_update_request->name) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_creative_assets_product_group_update_request->description
    if(catalogs_creative_assets_product_group_update_request->description) {
    if(cJSON_AddStringToObject(item, "description", catalogs_creative_assets_product_group_update_request->description) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_creative_assets_product_group_update_request->filters
    if(catalogs_creative_assets_product_group_update_request->filters) {
    cJSON *filters_local_JSON = catalogs_creative_assets_product_group_filters_convertToJSON(catalogs_creative_assets_product_group_update_request->filters);
    if(filters_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "filters", filters_local_JSON);
    if(item->child == NULL) {
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

catalogs_creative_assets_product_group_update_request_t *catalogs_creative_assets_product_group_update_request_parseFromJSON(cJSON *catalogs_creative_assets_product_group_update_requestJSON){

    catalogs_creative_assets_product_group_update_request_t *catalogs_creative_assets_product_group_update_request_local_var = NULL;

    // define the local variable for catalogs_creative_assets_product_group_update_request->filters
    catalogs_creative_assets_product_group_filters_t *filters_local_nonprim = NULL;

    // catalogs_creative_assets_product_group_update_request->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_group_update_requestJSON, "catalog_type");
    pinterest_rest_api_catalogs_creative_assets_product_group_update_request_CATALOGTYPE_e catalog_typeVariable;
    if (catalog_type) { 
    if(!cJSON_IsString(catalog_type))
    {
    goto end; //Enum
    }
    catalog_typeVariable = catalogs_creative_assets_product_group_update_request_catalog_type_FromString(catalog_type->valuestring);
    }

    // catalogs_creative_assets_product_group_update_request->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_group_update_requestJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // catalogs_creative_assets_product_group_update_request->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_group_update_requestJSON, "description");
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // catalogs_creative_assets_product_group_update_request->filters
    cJSON *filters = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_group_update_requestJSON, "filters");
    if (filters) { 
    filters_local_nonprim = catalogs_creative_assets_product_group_filters_parseFromJSON(filters); //nonprimitive
    }


    catalogs_creative_assets_product_group_update_request_local_var = catalogs_creative_assets_product_group_update_request_create (
        catalog_type ? catalog_typeVariable : pinterest_rest_api_catalogs_creative_assets_product_group_update_request_CATALOGTYPE_NULL,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        filters ? filters_local_nonprim : NULL
        );

    return catalogs_creative_assets_product_group_update_request_local_var;
end:
    if (filters_local_nonprim) {
        catalogs_creative_assets_product_group_filters_free(filters_local_nonprim);
        filters_local_nonprim = NULL;
    }
    return NULL;

}
