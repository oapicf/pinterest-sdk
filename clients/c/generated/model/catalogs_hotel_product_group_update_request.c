#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_hotel_product_group_update_request.h"


char* catalogs_hotel_product_group_update_request_catalog_type_ToString(pinterest_rest_api_catalogs_hotel_product_group_update_request_CATALOGTYPE_e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "HOTEL" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_catalogs_hotel_product_group_update_request_CATALOGTYPE_e catalogs_hotel_product_group_update_request_catalog_type_FromString(char* catalog_type){
    int stringToReturn = 0;
    char *catalog_typeArray[] =  { "NULL", "HOTEL" };
    size_t sizeofArray = sizeof(catalog_typeArray) / sizeof(catalog_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(catalog_type, catalog_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static catalogs_hotel_product_group_update_request_t *catalogs_hotel_product_group_update_request_create_internal(
    pinterest_rest_api_catalogs_hotel_product_group_update_request_CATALOGTYPE_e catalog_type,
    char *description,
    catalogs_hotel_product_group_filters_t *filters,
    char *name
    ) {
    catalogs_hotel_product_group_update_request_t *catalogs_hotel_product_group_update_request_local_var = malloc(sizeof(catalogs_hotel_product_group_update_request_t));
    if (!catalogs_hotel_product_group_update_request_local_var) {
        return NULL;
    }
    memset(catalogs_hotel_product_group_update_request_local_var, 0, sizeof(catalogs_hotel_product_group_update_request_t));
    catalogs_hotel_product_group_update_request_local_var->_library_owned = 1;
    catalogs_hotel_product_group_update_request_local_var->catalog_type = catalog_type;
    catalogs_hotel_product_group_update_request_local_var->description = description;
    catalogs_hotel_product_group_update_request_local_var->filters = filters;
    catalogs_hotel_product_group_update_request_local_var->name = name;
    return catalogs_hotel_product_group_update_request_local_var;
}

__attribute__((deprecated)) catalogs_hotel_product_group_update_request_t *catalogs_hotel_product_group_update_request_create(
    pinterest_rest_api_catalogs_hotel_product_group_update_request_CATALOGTYPE_e catalog_type,
    char *description,
    catalogs_hotel_product_group_filters_t *filters,
    char *name
    ) {
    catalogs_hotel_product_group_update_request_t *result = catalogs_hotel_product_group_update_request_create_internal (
        catalog_type,
        description,
        filters,
        name
        );
    if (!result) {
    }
    return result;
}

void catalogs_hotel_product_group_update_request_free(catalogs_hotel_product_group_update_request_t *catalogs_hotel_product_group_update_request) {
    if(NULL == catalogs_hotel_product_group_update_request){
        return ;
    }
    if(catalogs_hotel_product_group_update_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_hotel_product_group_update_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_hotel_product_group_update_request->description) {
        free(catalogs_hotel_product_group_update_request->description);
        catalogs_hotel_product_group_update_request->description = NULL;
    }
    if (catalogs_hotel_product_group_update_request->filters) {
        catalogs_hotel_product_group_filters_free(catalogs_hotel_product_group_update_request->filters);
        catalogs_hotel_product_group_update_request->filters = NULL;
    }
    if (catalogs_hotel_product_group_update_request->name) {
        free(catalogs_hotel_product_group_update_request->name);
        catalogs_hotel_product_group_update_request->name = NULL;
    }
    free(catalogs_hotel_product_group_update_request);
}

cJSON *catalogs_hotel_product_group_update_request_convertToJSON(catalogs_hotel_product_group_update_request_t *catalogs_hotel_product_group_update_request) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_hotel_product_group_update_request->catalog_type
    if(catalogs_hotel_product_group_update_request->catalog_type != pinterest_rest_api_catalogs_hotel_product_group_update_request_CATALOGTYPE_NULL) {
    if(cJSON_AddStringToObject(item, "catalog_type", catalogs_hotel_product_group_update_request_catalog_type_ToString(catalogs_hotel_product_group_update_request->catalog_type)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // catalogs_hotel_product_group_update_request->description
    if(catalogs_hotel_product_group_update_request->description) {
    if(cJSON_AddStringToObject(item, "description", catalogs_hotel_product_group_update_request->description) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_hotel_product_group_update_request->filters
    if(catalogs_hotel_product_group_update_request->filters) {
    cJSON *filters_local_JSON = catalogs_hotel_product_group_filters_convertToJSON(catalogs_hotel_product_group_update_request->filters);
    if(filters_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "filters", filters_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_hotel_product_group_update_request->name
    if(catalogs_hotel_product_group_update_request->name) {
    if(cJSON_AddStringToObject(item, "name", catalogs_hotel_product_group_update_request->name) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_hotel_product_group_update_request_t *catalogs_hotel_product_group_update_request_parseFromJSON(cJSON *catalogs_hotel_product_group_update_requestJSON){

    catalogs_hotel_product_group_update_request_t *catalogs_hotel_product_group_update_request_local_var = NULL;

    char *description_local_str = NULL;

    // define the local variable for catalogs_hotel_product_group_update_request->filters
    catalogs_hotel_product_group_filters_t *filters_local_nonprim = NULL;

    char *name_local_str = NULL;

    // catalogs_hotel_product_group_update_request->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_product_group_update_requestJSON, "catalog_type");
    if (cJSON_IsNull(catalog_type)) {
        catalog_type = NULL;
    }
    pinterest_rest_api_catalogs_hotel_product_group_update_request_CATALOGTYPE_e catalog_typeVariable;
    if (catalog_type) { 
    if(!cJSON_IsString(catalog_type))
    {
    goto end; //Enum
    }
    catalog_typeVariable = catalogs_hotel_product_group_update_request_catalog_type_FromString(catalog_type->valuestring);
    }

    // catalogs_hotel_product_group_update_request->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_product_group_update_requestJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // catalogs_hotel_product_group_update_request->filters
    cJSON *filters = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_product_group_update_requestJSON, "filters");
    if (cJSON_IsNull(filters)) {
        filters = NULL;
    }
    if (filters) { 
    filters_local_nonprim = catalogs_hotel_product_group_filters_parseFromJSON(filters); //nonprimitive
    }

    // catalogs_hotel_product_group_update_request->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_product_group_update_requestJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }


    if (description && !cJSON_IsNull(description)) description_local_str = strdup(description->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    catalogs_hotel_product_group_update_request_local_var = catalogs_hotel_product_group_update_request_create_internal (
        catalog_type ? catalog_typeVariable : pinterest_rest_api_catalogs_hotel_product_group_update_request_CATALOGTYPE_NULL,
        description_local_str,
        filters ? filters_local_nonprim : NULL,
        name_local_str
        );

    if (!catalogs_hotel_product_group_update_request_local_var) {
        goto end;
    }

    return catalogs_hotel_product_group_update_request_local_var;
end:
    if (description_local_str) {
        free(description_local_str);
        description_local_str = NULL;
    }
    if (filters_local_nonprim) {
        catalogs_hotel_product_group_filters_free(filters_local_nonprim);
        filters_local_nonprim = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    return NULL;

}
