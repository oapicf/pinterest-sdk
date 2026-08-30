#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_list_products_by_filter_request.h"


char* catalogs_list_products_by_filter_request_catalog_type_ToString(pinterest_rest_api_catalogs_list_products_by_filter_request_CATALOGTYPE_e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "CREATIVE_ASSETS" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_catalogs_list_products_by_filter_request_CATALOGTYPE_e catalogs_list_products_by_filter_request_catalog_type_FromString(char* catalog_type){
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

static catalogs_list_products_by_filter_request_t *catalogs_list_products_by_filter_request_create_internal(
    char *feed_id,
    catalogs_creative_assets_product_group_filters_t *filters,
    char *catalog_id,
    pinterest_rest_api_catalogs_list_products_by_filter_request_CATALOGTYPE_e catalog_type,
    pinterest_rest_api_country__e country,
    pinterest_rest_api_catalogs_locale__e locale
    ) {
    catalogs_list_products_by_filter_request_t *catalogs_list_products_by_filter_request_local_var = malloc(sizeof(catalogs_list_products_by_filter_request_t));
    if (!catalogs_list_products_by_filter_request_local_var) {
        return NULL;
    }
    memset(catalogs_list_products_by_filter_request_local_var, 0, sizeof(catalogs_list_products_by_filter_request_t));
    catalogs_list_products_by_filter_request_local_var->_library_owned = 1;
    catalogs_list_products_by_filter_request_local_var->feed_id = feed_id;
    catalogs_list_products_by_filter_request_local_var->filters = filters;
    catalogs_list_products_by_filter_request_local_var->catalog_id = catalog_id;
    catalogs_list_products_by_filter_request_local_var->catalog_type = catalog_type;
    catalogs_list_products_by_filter_request_local_var->country = country;
    catalogs_list_products_by_filter_request_local_var->locale = locale;
    return catalogs_list_products_by_filter_request_local_var;
}

__attribute__((deprecated)) catalogs_list_products_by_filter_request_t *catalogs_list_products_by_filter_request_create(
    char *feed_id,
    catalogs_creative_assets_product_group_filters_t *filters,
    char *catalog_id,
    pinterest_rest_api_catalogs_list_products_by_filter_request_CATALOGTYPE_e catalog_type,
    pinterest_rest_api_country__e country,
    pinterest_rest_api_catalogs_locale__e locale
    ) {
    catalogs_list_products_by_filter_request_t *result = catalogs_list_products_by_filter_request_create_internal (
        feed_id,
        filters,
        catalog_id,
        catalog_type,
        country,
        locale
        );
    if (!result) {
    }
    return result;
}

void catalogs_list_products_by_filter_request_free(catalogs_list_products_by_filter_request_t *catalogs_list_products_by_filter_request) {
    if(NULL == catalogs_list_products_by_filter_request){
        return ;
    }
    if(catalogs_list_products_by_filter_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_list_products_by_filter_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_list_products_by_filter_request->feed_id) {
        free(catalogs_list_products_by_filter_request->feed_id);
        catalogs_list_products_by_filter_request->feed_id = NULL;
    }
    if (catalogs_list_products_by_filter_request->filters) {
        catalogs_creative_assets_product_group_filters_free(catalogs_list_products_by_filter_request->filters);
        catalogs_list_products_by_filter_request->filters = NULL;
    }
    if (catalogs_list_products_by_filter_request->catalog_id) {
        free(catalogs_list_products_by_filter_request->catalog_id);
        catalogs_list_products_by_filter_request->catalog_id = NULL;
    }
    free(catalogs_list_products_by_filter_request);
}

cJSON *catalogs_list_products_by_filter_request_convertToJSON(catalogs_list_products_by_filter_request_t *catalogs_list_products_by_filter_request) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_list_products_by_filter_request->feed_id
    if (!catalogs_list_products_by_filter_request->feed_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "feed_id", catalogs_list_products_by_filter_request->feed_id) == NULL) {
    goto fail; //String
    }


    // catalogs_list_products_by_filter_request->filters
    if (!catalogs_list_products_by_filter_request->filters) {
        goto fail;
    }
    cJSON *filters_local_JSON = catalogs_creative_assets_product_group_filters_convertToJSON(catalogs_list_products_by_filter_request->filters);
    if(filters_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "filters", filters_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_list_products_by_filter_request->catalog_id
    if (!catalogs_list_products_by_filter_request->catalog_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_id", catalogs_list_products_by_filter_request->catalog_id) == NULL) {
    goto fail; //String
    }


    // catalogs_list_products_by_filter_request->catalog_type
    if (pinterest_rest_api_catalogs_list_products_by_filter_request_CATALOGTYPE_NULL == catalogs_list_products_by_filter_request->catalog_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_type", catalogs_list_products_by_filter_request_catalog_type_ToString(catalogs_list_products_by_filter_request->catalog_type)) == NULL)
    {
    goto fail; //Enum
    }


    // catalogs_list_products_by_filter_request->country
    if (pinterest_rest_api_country__NULL == catalogs_list_products_by_filter_request->country) {
        goto fail;
    }
    cJSON *country_local_JSON = country_convertToJSON(catalogs_list_products_by_filter_request->country);
    if(country_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "country", country_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_list_products_by_filter_request->locale
    if (pinterest_rest_api_catalogs_locale__NULL == catalogs_list_products_by_filter_request->locale) {
        goto fail;
    }
    cJSON *locale_local_JSON = catalogs_locale_convertToJSON(catalogs_list_products_by_filter_request->locale);
    if(locale_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "locale", locale_local_JSON);
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

catalogs_list_products_by_filter_request_t *catalogs_list_products_by_filter_request_parseFromJSON(cJSON *catalogs_list_products_by_filter_requestJSON){

    catalogs_list_products_by_filter_request_t *catalogs_list_products_by_filter_request_local_var = NULL;

    char *feed_id_local_str = NULL;

    // define the local variable for catalogs_list_products_by_filter_request->filters
    catalogs_creative_assets_product_group_filters_t *filters_local_nonprim = NULL;

    char *catalog_id_local_str = NULL;

    // define the local variable for catalogs_list_products_by_filter_request->country
    pinterest_rest_api_country__e country_local_nonprim = 0;

    // define the local variable for catalogs_list_products_by_filter_request->locale
    pinterest_rest_api_catalogs_locale__e locale_local_nonprim = 0;

    // catalogs_list_products_by_filter_request->feed_id
    cJSON *feed_id = cJSON_GetObjectItemCaseSensitive(catalogs_list_products_by_filter_requestJSON, "feed_id");
    if (cJSON_IsNull(feed_id)) {
        feed_id = NULL;
    }
    if (!feed_id) {
        goto end;
    }

    
    if(!cJSON_IsString(feed_id))
    {
    goto end; //String
    }

    // catalogs_list_products_by_filter_request->filters
    cJSON *filters = cJSON_GetObjectItemCaseSensitive(catalogs_list_products_by_filter_requestJSON, "filters");
    if (cJSON_IsNull(filters)) {
        filters = NULL;
    }
    if (!filters) {
        goto end;
    }

    
    filters_local_nonprim = catalogs_creative_assets_product_group_filters_parseFromJSON(filters); //nonprimitive

    // catalogs_list_products_by_filter_request->catalog_id
    cJSON *catalog_id = cJSON_GetObjectItemCaseSensitive(catalogs_list_products_by_filter_requestJSON, "catalog_id");
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

    // catalogs_list_products_by_filter_request->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_list_products_by_filter_requestJSON, "catalog_type");
    if (cJSON_IsNull(catalog_type)) {
        catalog_type = NULL;
    }
    if (!catalog_type) {
        goto end;
    }

    pinterest_rest_api_catalogs_list_products_by_filter_request_CATALOGTYPE_e catalog_typeVariable;
    
    if(!cJSON_IsString(catalog_type))
    {
    goto end; //Enum
    }
    catalog_typeVariable = catalogs_list_products_by_filter_request_catalog_type_FromString(catalog_type->valuestring);

    // catalogs_list_products_by_filter_request->country
    cJSON *country = cJSON_GetObjectItemCaseSensitive(catalogs_list_products_by_filter_requestJSON, "country");
    if (cJSON_IsNull(country)) {
        country = NULL;
    }
    if (!country) {
        goto end;
    }

    
    country_local_nonprim = country_parseFromJSON(country); //custom

    // catalogs_list_products_by_filter_request->locale
    cJSON *locale = cJSON_GetObjectItemCaseSensitive(catalogs_list_products_by_filter_requestJSON, "locale");
    if (cJSON_IsNull(locale)) {
        locale = NULL;
    }
    if (!locale) {
        goto end;
    }

    
    locale_local_nonprim = catalogs_locale_parseFromJSON(locale); //custom


    if (feed_id && !cJSON_IsNull(feed_id)) feed_id_local_str = strdup(feed_id->valuestring);
    if (catalog_id && !cJSON_IsNull(catalog_id)) catalog_id_local_str = strdup(catalog_id->valuestring);

    catalogs_list_products_by_filter_request_local_var = catalogs_list_products_by_filter_request_create_internal (
        feed_id_local_str,
        filters_local_nonprim,
        catalog_id_local_str,
        catalog_typeVariable,
        country_local_nonprim,
        locale_local_nonprim
        );

    if (!catalogs_list_products_by_filter_request_local_var) {
        goto end;
    }

    return catalogs_list_products_by_filter_request_local_var;
end:
    if (feed_id_local_str) {
        free(feed_id_local_str);
        feed_id_local_str = NULL;
    }
    if (filters_local_nonprim) {
        catalogs_creative_assets_product_group_filters_free(filters_local_nonprim);
        filters_local_nonprim = NULL;
    }
    if (catalog_id_local_str) {
        free(catalog_id_local_str);
        catalog_id_local_str = NULL;
    }
    if (country_local_nonprim) {
        country_local_nonprim = 0;
    }
    if (locale_local_nonprim) {
        locale_local_nonprim = 0;
    }
    return NULL;

}
