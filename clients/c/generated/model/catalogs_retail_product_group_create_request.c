#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_retail_product_group_create_request.h"


char* catalogs_retail_product_group_create_request_catalog_type_ToString(pinterest_rest_api_catalogs_retail_product_group_create_request_CATALOGTYPE_e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "RETAIL" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_catalogs_retail_product_group_create_request_CATALOGTYPE_e catalogs_retail_product_group_create_request_catalog_type_FromString(char* catalog_type){
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

static catalogs_retail_product_group_create_request_t *catalogs_retail_product_group_create_request_create_internal(
    char *catalog_id,
    pinterest_rest_api_catalogs_retail_product_group_create_request_CATALOGTYPE_e catalog_type,
    pinterest_rest_api_country__e country,
    char *description,
    catalogs_product_group_filters_request_t *filters,
    pinterest_rest_api_catalogs_locale__e locale,
    char *name
    ) {
    catalogs_retail_product_group_create_request_t *catalogs_retail_product_group_create_request_local_var = malloc(sizeof(catalogs_retail_product_group_create_request_t));
    if (!catalogs_retail_product_group_create_request_local_var) {
        return NULL;
    }
    memset(catalogs_retail_product_group_create_request_local_var, 0, sizeof(catalogs_retail_product_group_create_request_t));
    catalogs_retail_product_group_create_request_local_var->_library_owned = 1;
    catalogs_retail_product_group_create_request_local_var->catalog_id = catalog_id;
    catalogs_retail_product_group_create_request_local_var->catalog_type = catalog_type;
    catalogs_retail_product_group_create_request_local_var->country = country;
    catalogs_retail_product_group_create_request_local_var->description = description;
    catalogs_retail_product_group_create_request_local_var->filters = filters;
    catalogs_retail_product_group_create_request_local_var->locale = locale;
    catalogs_retail_product_group_create_request_local_var->name = name;
    return catalogs_retail_product_group_create_request_local_var;
}

__attribute__((deprecated)) catalogs_retail_product_group_create_request_t *catalogs_retail_product_group_create_request_create(
    char *catalog_id,
    pinterest_rest_api_catalogs_retail_product_group_create_request_CATALOGTYPE_e catalog_type,
    pinterest_rest_api_country__e country,
    char *description,
    catalogs_product_group_filters_request_t *filters,
    pinterest_rest_api_catalogs_locale__e locale,
    char *name
    ) {
    catalogs_retail_product_group_create_request_t *result = catalogs_retail_product_group_create_request_create_internal (
        catalog_id,
        catalog_type,
        country,
        description,
        filters,
        locale,
        name
        );
    if (!result) {
    }
    return result;
}

void catalogs_retail_product_group_create_request_free(catalogs_retail_product_group_create_request_t *catalogs_retail_product_group_create_request) {
    if(NULL == catalogs_retail_product_group_create_request){
        return ;
    }
    if(catalogs_retail_product_group_create_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_retail_product_group_create_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_retail_product_group_create_request->catalog_id) {
        free(catalogs_retail_product_group_create_request->catalog_id);
        catalogs_retail_product_group_create_request->catalog_id = NULL;
    }
    if (catalogs_retail_product_group_create_request->description) {
        free(catalogs_retail_product_group_create_request->description);
        catalogs_retail_product_group_create_request->description = NULL;
    }
    if (catalogs_retail_product_group_create_request->filters) {
        catalogs_product_group_filters_request_free(catalogs_retail_product_group_create_request->filters);
        catalogs_retail_product_group_create_request->filters = NULL;
    }
    if (catalogs_retail_product_group_create_request->name) {
        free(catalogs_retail_product_group_create_request->name);
        catalogs_retail_product_group_create_request->name = NULL;
    }
    free(catalogs_retail_product_group_create_request);
}

cJSON *catalogs_retail_product_group_create_request_convertToJSON(catalogs_retail_product_group_create_request_t *catalogs_retail_product_group_create_request) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_retail_product_group_create_request->catalog_id
    if (!catalogs_retail_product_group_create_request->catalog_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_id", catalogs_retail_product_group_create_request->catalog_id) == NULL) {
    goto fail; //String
    }


    // catalogs_retail_product_group_create_request->catalog_type
    if (pinterest_rest_api_catalogs_retail_product_group_create_request_CATALOGTYPE_NULL == catalogs_retail_product_group_create_request->catalog_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_type", catalogs_retail_product_group_create_request_catalog_type_ToString(catalogs_retail_product_group_create_request->catalog_type)) == NULL)
    {
    goto fail; //Enum
    }


    // catalogs_retail_product_group_create_request->country
    if(catalogs_retail_product_group_create_request->country != pinterest_rest_api_country__NULL) {
    cJSON *country_local_JSON = country_convertToJSON(catalogs_retail_product_group_create_request->country);
    if(country_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "country", country_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // catalogs_retail_product_group_create_request->description
    if(catalogs_retail_product_group_create_request->description) {
    if(cJSON_AddStringToObject(item, "description", catalogs_retail_product_group_create_request->description) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_retail_product_group_create_request->filters
    if (!catalogs_retail_product_group_create_request->filters) {
        goto fail;
    }
    cJSON *filters_local_JSON = catalogs_product_group_filters_request_convertToJSON(catalogs_retail_product_group_create_request->filters);
    if(filters_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "filters", filters_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_retail_product_group_create_request->locale
    if(catalogs_retail_product_group_create_request->locale != pinterest_rest_api_catalogs_locale__NULL) {
    cJSON *locale_local_JSON = catalogs_locale_convertToJSON(catalogs_retail_product_group_create_request->locale);
    if(locale_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "locale", locale_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // catalogs_retail_product_group_create_request->name
    if (!catalogs_retail_product_group_create_request->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", catalogs_retail_product_group_create_request->name) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_retail_product_group_create_request_t *catalogs_retail_product_group_create_request_parseFromJSON(cJSON *catalogs_retail_product_group_create_requestJSON){

    catalogs_retail_product_group_create_request_t *catalogs_retail_product_group_create_request_local_var = NULL;

    char *catalog_id_local_str = NULL;

    // define the local variable for catalogs_retail_product_group_create_request->country
    pinterest_rest_api_country__e country_local_nonprim = 0;

    char *description_local_str = NULL;

    // define the local variable for catalogs_retail_product_group_create_request->filters
    catalogs_product_group_filters_request_t *filters_local_nonprim = NULL;

    // define the local variable for catalogs_retail_product_group_create_request->locale
    pinterest_rest_api_catalogs_locale__e locale_local_nonprim = 0;

    char *name_local_str = NULL;

    // catalogs_retail_product_group_create_request->catalog_id
    cJSON *catalog_id = cJSON_GetObjectItemCaseSensitive(catalogs_retail_product_group_create_requestJSON, "catalog_id");
    if (cJSON_IsNull(catalog_id)) {
        catalog_id = NULL;
    }
    if (!catalog_id) {
        goto end;
    }

    
    if(!cJSON_IsString(catalog_id))
    {
    goto end; //String
    }

    // catalogs_retail_product_group_create_request->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_retail_product_group_create_requestJSON, "catalog_type");
    if (cJSON_IsNull(catalog_type)) {
        catalog_type = NULL;
    }
    if (!catalog_type) {
        goto end;
    }

    pinterest_rest_api_catalogs_retail_product_group_create_request_CATALOGTYPE_e catalog_typeVariable;
    
    if(!cJSON_IsString(catalog_type))
    {
    goto end; //Enum
    }
    catalog_typeVariable = catalogs_retail_product_group_create_request_catalog_type_FromString(catalog_type->valuestring);

    // catalogs_retail_product_group_create_request->country
    cJSON *country = cJSON_GetObjectItemCaseSensitive(catalogs_retail_product_group_create_requestJSON, "country");
    if (cJSON_IsNull(country)) {
        country = NULL;
    }
    if (country) { 
    country_local_nonprim = country_parseFromJSON(country); //custom
    }

    // catalogs_retail_product_group_create_request->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(catalogs_retail_product_group_create_requestJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // catalogs_retail_product_group_create_request->filters
    cJSON *filters = cJSON_GetObjectItemCaseSensitive(catalogs_retail_product_group_create_requestJSON, "filters");
    if (cJSON_IsNull(filters)) {
        filters = NULL;
    }
    if (!filters) {
        goto end;
    }

    
    filters_local_nonprim = catalogs_product_group_filters_request_parseFromJSON(filters); //nonprimitive

    // catalogs_retail_product_group_create_request->locale
    cJSON *locale = cJSON_GetObjectItemCaseSensitive(catalogs_retail_product_group_create_requestJSON, "locale");
    if (cJSON_IsNull(locale)) {
        locale = NULL;
    }
    if (locale) { 
    locale_local_nonprim = catalogs_locale_parseFromJSON(locale); //custom
    }

    // catalogs_retail_product_group_create_request->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(catalogs_retail_product_group_create_requestJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }


    if (catalog_id && !cJSON_IsNull(catalog_id)) catalog_id_local_str = strdup(catalog_id->valuestring);
    if (description && !cJSON_IsNull(description)) description_local_str = strdup(description->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    catalogs_retail_product_group_create_request_local_var = catalogs_retail_product_group_create_request_create_internal (
        catalog_id_local_str,
        catalog_typeVariable,
        country ? country_local_nonprim : 0,
        description_local_str,
        filters_local_nonprim,
        locale ? locale_local_nonprim : 0,
        name_local_str
        );

    if (!catalogs_retail_product_group_create_request_local_var) {
        goto end;
    }

    return catalogs_retail_product_group_create_request_local_var;
end:
    if (catalog_id_local_str) {
        free(catalog_id_local_str);
        catalog_id_local_str = NULL;
    }
    if (country_local_nonprim) {
        country_local_nonprim = 0;
    }
    if (description_local_str) {
        free(description_local_str);
        description_local_str = NULL;
    }
    if (filters_local_nonprim) {
        catalogs_product_group_filters_request_free(filters_local_nonprim);
        filters_local_nonprim = NULL;
    }
    if (locale_local_nonprim) {
        locale_local_nonprim = 0;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    return NULL;

}
