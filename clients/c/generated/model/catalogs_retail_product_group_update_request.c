#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_retail_product_group_update_request.h"


char* catalogs_retail_product_group_update_request_catalog_type_ToString(pinterest_rest_api_catalogs_retail_product_group_update_request_CATALOGTYPE_e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "RETAIL" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_catalogs_retail_product_group_update_request_CATALOGTYPE_e catalogs_retail_product_group_update_request_catalog_type_FromString(char* catalog_type){
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

static catalogs_retail_product_group_update_request_t *catalogs_retail_product_group_update_request_create_internal(
    pinterest_rest_api_catalogs_retail_product_group_update_request_CATALOGTYPE_e catalog_type,
    char *name,
    char *description,
    catalogs_product_group_filters_request_t *filters,
    pinterest_rest_api_country__e country,
    pinterest_rest_api_catalogs_locale__e locale
    ) {
    catalogs_retail_product_group_update_request_t *catalogs_retail_product_group_update_request_local_var = malloc(sizeof(catalogs_retail_product_group_update_request_t));
    if (!catalogs_retail_product_group_update_request_local_var) {
        return NULL;
    }
    catalogs_retail_product_group_update_request_local_var->catalog_type = catalog_type;
    catalogs_retail_product_group_update_request_local_var->name = name;
    catalogs_retail_product_group_update_request_local_var->description = description;
    catalogs_retail_product_group_update_request_local_var->filters = filters;
    catalogs_retail_product_group_update_request_local_var->country = country;
    catalogs_retail_product_group_update_request_local_var->locale = locale;

    catalogs_retail_product_group_update_request_local_var->_library_owned = 1;
    return catalogs_retail_product_group_update_request_local_var;
}

__attribute__((deprecated)) catalogs_retail_product_group_update_request_t *catalogs_retail_product_group_update_request_create(
    pinterest_rest_api_catalogs_retail_product_group_update_request_CATALOGTYPE_e catalog_type,
    char *name,
    char *description,
    catalogs_product_group_filters_request_t *filters,
    pinterest_rest_api_country__e country,
    pinterest_rest_api_catalogs_locale__e locale
    ) {
    return catalogs_retail_product_group_update_request_create_internal (
        catalog_type,
        name,
        description,
        filters,
        country,
        locale
        );
}

void catalogs_retail_product_group_update_request_free(catalogs_retail_product_group_update_request_t *catalogs_retail_product_group_update_request) {
    if(NULL == catalogs_retail_product_group_update_request){
        return ;
    }
    if(catalogs_retail_product_group_update_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_retail_product_group_update_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_retail_product_group_update_request->name) {
        free(catalogs_retail_product_group_update_request->name);
        catalogs_retail_product_group_update_request->name = NULL;
    }
    if (catalogs_retail_product_group_update_request->description) {
        free(catalogs_retail_product_group_update_request->description);
        catalogs_retail_product_group_update_request->description = NULL;
    }
    if (catalogs_retail_product_group_update_request->filters) {
        catalogs_product_group_filters_request_free(catalogs_retail_product_group_update_request->filters);
        catalogs_retail_product_group_update_request->filters = NULL;
    }
    free(catalogs_retail_product_group_update_request);
}

cJSON *catalogs_retail_product_group_update_request_convertToJSON(catalogs_retail_product_group_update_request_t *catalogs_retail_product_group_update_request) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_retail_product_group_update_request->catalog_type
    if(catalogs_retail_product_group_update_request->catalog_type != pinterest_rest_api_catalogs_retail_product_group_update_request_CATALOGTYPE_NULL) {
    if(cJSON_AddStringToObject(item, "catalog_type", catalogs_retail_product_group_update_request_catalog_type_ToString(catalogs_retail_product_group_update_request->catalog_type)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // catalogs_retail_product_group_update_request->name
    if(catalogs_retail_product_group_update_request->name) {
    if(cJSON_AddStringToObject(item, "name", catalogs_retail_product_group_update_request->name) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_retail_product_group_update_request->description
    if(catalogs_retail_product_group_update_request->description) {
    if(cJSON_AddStringToObject(item, "description", catalogs_retail_product_group_update_request->description) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_retail_product_group_update_request->filters
    if(catalogs_retail_product_group_update_request->filters) {
    cJSON *filters_local_JSON = catalogs_product_group_filters_request_convertToJSON(catalogs_retail_product_group_update_request->filters);
    if(filters_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "filters", filters_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_retail_product_group_update_request->country
    if(catalogs_retail_product_group_update_request->country != pinterest_rest_api_country__NULL) {
    cJSON *country_local_JSON = country_convertToJSON(catalogs_retail_product_group_update_request->country);
    if(country_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "country", country_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // catalogs_retail_product_group_update_request->locale
    if(catalogs_retail_product_group_update_request->locale != pinterest_rest_api_catalogs_locale__NULL) {
    cJSON *locale_local_JSON = catalogs_locale_convertToJSON(catalogs_retail_product_group_update_request->locale);
    if(locale_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "locale", locale_local_JSON);
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

catalogs_retail_product_group_update_request_t *catalogs_retail_product_group_update_request_parseFromJSON(cJSON *catalogs_retail_product_group_update_requestJSON){

    catalogs_retail_product_group_update_request_t *catalogs_retail_product_group_update_request_local_var = NULL;

    // define the local variable for catalogs_retail_product_group_update_request->filters
    catalogs_product_group_filters_request_t *filters_local_nonprim = NULL;

    // define the local variable for catalogs_retail_product_group_update_request->country
    pinterest_rest_api_country__e country_local_nonprim = 0;

    // define the local variable for catalogs_retail_product_group_update_request->locale
    pinterest_rest_api_catalogs_locale__e locale_local_nonprim = 0;

    // catalogs_retail_product_group_update_request->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_retail_product_group_update_requestJSON, "catalog_type");
    if (cJSON_IsNull(catalog_type)) {
        catalog_type = NULL;
    }
    pinterest_rest_api_catalogs_retail_product_group_update_request_CATALOGTYPE_e catalog_typeVariable;
    if (catalog_type) { 
    if(!cJSON_IsString(catalog_type))
    {
    goto end; //Enum
    }
    catalog_typeVariable = catalogs_retail_product_group_update_request_catalog_type_FromString(catalog_type->valuestring);
    }

    // catalogs_retail_product_group_update_request->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(catalogs_retail_product_group_update_requestJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // catalogs_retail_product_group_update_request->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(catalogs_retail_product_group_update_requestJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // catalogs_retail_product_group_update_request->filters
    cJSON *filters = cJSON_GetObjectItemCaseSensitive(catalogs_retail_product_group_update_requestJSON, "filters");
    if (cJSON_IsNull(filters)) {
        filters = NULL;
    }
    if (filters) { 
    filters_local_nonprim = catalogs_product_group_filters_request_parseFromJSON(filters); //nonprimitive
    }

    // catalogs_retail_product_group_update_request->country
    cJSON *country = cJSON_GetObjectItemCaseSensitive(catalogs_retail_product_group_update_requestJSON, "country");
    if (cJSON_IsNull(country)) {
        country = NULL;
    }
    if (country) { 
    country_local_nonprim = country_parseFromJSON(country); //custom
    }

    // catalogs_retail_product_group_update_request->locale
    cJSON *locale = cJSON_GetObjectItemCaseSensitive(catalogs_retail_product_group_update_requestJSON, "locale");
    if (cJSON_IsNull(locale)) {
        locale = NULL;
    }
    if (locale) { 
    locale_local_nonprim = catalogs_locale_parseFromJSON(locale); //custom
    }


    catalogs_retail_product_group_update_request_local_var = catalogs_retail_product_group_update_request_create_internal (
        catalog_type ? catalog_typeVariable : pinterest_rest_api_catalogs_retail_product_group_update_request_CATALOGTYPE_NULL,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        filters ? filters_local_nonprim : NULL,
        country ? country_local_nonprim : 0,
        locale ? locale_local_nonprim : 0
        );

    return catalogs_retail_product_group_update_request_local_var;
end:
    if (filters_local_nonprim) {
        catalogs_product_group_filters_request_free(filters_local_nonprim);
        filters_local_nonprim = NULL;
    }
    if (country_local_nonprim) {
        country_local_nonprim = 0;
    }
    if (locale_local_nonprim) {
        locale_local_nonprim = 0;
    }
    return NULL;

}
