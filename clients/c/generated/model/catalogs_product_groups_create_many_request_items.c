#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_product_groups_create_many_request_items.h"


char* catalogs_product_groups_create_many_request_items_catalog_type_ToString(pinterest_rest_api_catalogs_product_groups_create_many_request_items_CATALOGTYPE_e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "CREATIVE_ASSETS" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_catalogs_product_groups_create_many_request_items_CATALOGTYPE_e catalogs_product_groups_create_many_request_items_catalog_type_FromString(char* catalog_type){
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

static catalogs_product_groups_create_many_request_items_t *catalogs_product_groups_create_many_request_items_create_internal(
    char *description,
    char *feed_id,
    catalogs_creative_assets_product_group_filters_t *filters,
    int *is_featured,
    char *name,
    char *catalog_id,
    pinterest_rest_api_catalogs_product_groups_create_many_request_items_CATALOGTYPE_e catalog_type,
    pinterest_rest_api_country__e country,
    pinterest_rest_api_catalogs_locale__e locale
    ) {
    catalogs_product_groups_create_many_request_items_t *catalogs_product_groups_create_many_request_items_local_var = malloc(sizeof(catalogs_product_groups_create_many_request_items_t));
    if (!catalogs_product_groups_create_many_request_items_local_var) {
        return NULL;
    }
    memset(catalogs_product_groups_create_many_request_items_local_var, 0, sizeof(catalogs_product_groups_create_many_request_items_t));
    catalogs_product_groups_create_many_request_items_local_var->_library_owned = 1;
    catalogs_product_groups_create_many_request_items_local_var->description = description;
    catalogs_product_groups_create_many_request_items_local_var->feed_id = feed_id;
    catalogs_product_groups_create_many_request_items_local_var->filters = filters;
    catalogs_product_groups_create_many_request_items_local_var->is_featured = is_featured;
    catalogs_product_groups_create_many_request_items_local_var->name = name;
    catalogs_product_groups_create_many_request_items_local_var->catalog_id = catalog_id;
    catalogs_product_groups_create_many_request_items_local_var->catalog_type = catalog_type;
    catalogs_product_groups_create_many_request_items_local_var->country = country;
    catalogs_product_groups_create_many_request_items_local_var->locale = locale;
    return catalogs_product_groups_create_many_request_items_local_var;
}

__attribute__((deprecated)) catalogs_product_groups_create_many_request_items_t *catalogs_product_groups_create_many_request_items_create(
    char *description,
    char *feed_id,
    catalogs_creative_assets_product_group_filters_t *filters,
    int *is_featured,
    char *name,
    char *catalog_id,
    pinterest_rest_api_catalogs_product_groups_create_many_request_items_CATALOGTYPE_e catalog_type,
    pinterest_rest_api_country__e country,
    pinterest_rest_api_catalogs_locale__e locale
    ) {
    int *is_featured_copy = NULL;
    if (is_featured) {
        is_featured_copy = malloc(sizeof(int));
        if (is_featured_copy) *is_featured_copy = *is_featured;
    }
    catalogs_product_groups_create_many_request_items_t *result = catalogs_product_groups_create_many_request_items_create_internal (
        description,
        feed_id,
        filters,
        is_featured_copy,
        name,
        catalog_id,
        catalog_type,
        country,
        locale
        );
    if (!result) {
        free(is_featured_copy);
    }
    return result;
}

void catalogs_product_groups_create_many_request_items_free(catalogs_product_groups_create_many_request_items_t *catalogs_product_groups_create_many_request_items) {
    if(NULL == catalogs_product_groups_create_many_request_items){
        return ;
    }
    if(catalogs_product_groups_create_many_request_items->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_product_groups_create_many_request_items_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_product_groups_create_many_request_items->description) {
        free(catalogs_product_groups_create_many_request_items->description);
        catalogs_product_groups_create_many_request_items->description = NULL;
    }
    if (catalogs_product_groups_create_many_request_items->feed_id) {
        free(catalogs_product_groups_create_many_request_items->feed_id);
        catalogs_product_groups_create_many_request_items->feed_id = NULL;
    }
    if (catalogs_product_groups_create_many_request_items->filters) {
        catalogs_creative_assets_product_group_filters_free(catalogs_product_groups_create_many_request_items->filters);
        catalogs_product_groups_create_many_request_items->filters = NULL;
    }
    if (catalogs_product_groups_create_many_request_items->is_featured) {
        free(catalogs_product_groups_create_many_request_items->is_featured);
        catalogs_product_groups_create_many_request_items->is_featured = NULL;
    }
    if (catalogs_product_groups_create_many_request_items->name) {
        free(catalogs_product_groups_create_many_request_items->name);
        catalogs_product_groups_create_many_request_items->name = NULL;
    }
    if (catalogs_product_groups_create_many_request_items->catalog_id) {
        free(catalogs_product_groups_create_many_request_items->catalog_id);
        catalogs_product_groups_create_many_request_items->catalog_id = NULL;
    }
    free(catalogs_product_groups_create_many_request_items);
}

cJSON *catalogs_product_groups_create_many_request_items_convertToJSON(catalogs_product_groups_create_many_request_items_t *catalogs_product_groups_create_many_request_items) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_product_groups_create_many_request_items->description
    if(catalogs_product_groups_create_many_request_items->description) {
    if(cJSON_AddStringToObject(item, "description", catalogs_product_groups_create_many_request_items->description) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_product_groups_create_many_request_items->feed_id
    if (!catalogs_product_groups_create_many_request_items->feed_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "feed_id", catalogs_product_groups_create_many_request_items->feed_id) == NULL) {
    goto fail; //String
    }


    // catalogs_product_groups_create_many_request_items->filters
    if (!catalogs_product_groups_create_many_request_items->filters) {
        goto fail;
    }
    cJSON *filters_local_JSON = catalogs_creative_assets_product_group_filters_convertToJSON(catalogs_product_groups_create_many_request_items->filters);
    if(filters_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "filters", filters_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_product_groups_create_many_request_items->is_featured
    if(catalogs_product_groups_create_many_request_items->is_featured) {
    if(cJSON_AddBoolToObject(item, "is_featured", *catalogs_product_groups_create_many_request_items->is_featured) == NULL) {
    goto fail; //Bool
    }
    }


    // catalogs_product_groups_create_many_request_items->name
    if (!catalogs_product_groups_create_many_request_items->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", catalogs_product_groups_create_many_request_items->name) == NULL) {
    goto fail; //String
    }


    // catalogs_product_groups_create_many_request_items->catalog_id
    if (!catalogs_product_groups_create_many_request_items->catalog_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_id", catalogs_product_groups_create_many_request_items->catalog_id) == NULL) {
    goto fail; //String
    }


    // catalogs_product_groups_create_many_request_items->catalog_type
    if (pinterest_rest_api_catalogs_product_groups_create_many_request_items_CATALOGTYPE_NULL == catalogs_product_groups_create_many_request_items->catalog_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_type", catalogs_product_groups_create_many_request_items_catalog_type_ToString(catalogs_product_groups_create_many_request_items->catalog_type)) == NULL)
    {
    goto fail; //Enum
    }


    // catalogs_product_groups_create_many_request_items->country
    if(catalogs_product_groups_create_many_request_items->country != pinterest_rest_api_country__NULL) {
    cJSON *country_local_JSON = country_convertToJSON(catalogs_product_groups_create_many_request_items->country);
    if(country_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "country", country_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // catalogs_product_groups_create_many_request_items->locale
    if(catalogs_product_groups_create_many_request_items->locale != pinterest_rest_api_catalogs_locale__NULL) {
    cJSON *locale_local_JSON = catalogs_locale_convertToJSON(catalogs_product_groups_create_many_request_items->locale);
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

catalogs_product_groups_create_many_request_items_t *catalogs_product_groups_create_many_request_items_parseFromJSON(cJSON *catalogs_product_groups_create_many_request_itemsJSON){

    catalogs_product_groups_create_many_request_items_t *catalogs_product_groups_create_many_request_items_local_var = NULL;

    char *description_local_str = NULL;

    char *feed_id_local_str = NULL;

    // define the local variable for catalogs_product_groups_create_many_request_items->filters
    catalogs_creative_assets_product_group_filters_t *filters_local_nonprim = NULL;

    // define the local variable for catalogs_product_groups_create_many_request_items->is_featured
    int *is_featured_local_var = NULL;

    char *name_local_str = NULL;

    char *catalog_id_local_str = NULL;

    // define the local variable for catalogs_product_groups_create_many_request_items->country
    pinterest_rest_api_country__e country_local_nonprim = 0;

    // define the local variable for catalogs_product_groups_create_many_request_items->locale
    pinterest_rest_api_catalogs_locale__e locale_local_nonprim = 0;

    // catalogs_product_groups_create_many_request_items->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(catalogs_product_groups_create_many_request_itemsJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // catalogs_product_groups_create_many_request_items->feed_id
    cJSON *feed_id = cJSON_GetObjectItemCaseSensitive(catalogs_product_groups_create_many_request_itemsJSON, "feed_id");
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

    // catalogs_product_groups_create_many_request_items->filters
    cJSON *filters = cJSON_GetObjectItemCaseSensitive(catalogs_product_groups_create_many_request_itemsJSON, "filters");
    if (cJSON_IsNull(filters)) {
        filters = NULL;
    }
    if (!filters) {
        goto end;
    }

    
    filters_local_nonprim = catalogs_creative_assets_product_group_filters_parseFromJSON(filters); //nonprimitive

    // catalogs_product_groups_create_many_request_items->is_featured
    cJSON *is_featured = cJSON_GetObjectItemCaseSensitive(catalogs_product_groups_create_many_request_itemsJSON, "is_featured");
    if (cJSON_IsNull(is_featured)) {
        is_featured = NULL;
    }
    if (is_featured) { 
    if(!cJSON_IsBool(is_featured))
    {
    goto end; //Bool
    }
    is_featured_local_var = malloc(sizeof(int));
    if(!is_featured_local_var)
    {
        goto end;
    }
    *is_featured_local_var = is_featured->valueint;
    }

    // catalogs_product_groups_create_many_request_items->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(catalogs_product_groups_create_many_request_itemsJSON, "name");
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

    // catalogs_product_groups_create_many_request_items->catalog_id
    cJSON *catalog_id = cJSON_GetObjectItemCaseSensitive(catalogs_product_groups_create_many_request_itemsJSON, "catalog_id");
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

    // catalogs_product_groups_create_many_request_items->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_product_groups_create_many_request_itemsJSON, "catalog_type");
    if (cJSON_IsNull(catalog_type)) {
        catalog_type = NULL;
    }
    if (!catalog_type) {
        goto end;
    }

    pinterest_rest_api_catalogs_product_groups_create_many_request_items_CATALOGTYPE_e catalog_typeVariable;
    
    if(!cJSON_IsString(catalog_type))
    {
    goto end; //Enum
    }
    catalog_typeVariable = catalogs_product_groups_create_many_request_items_catalog_type_FromString(catalog_type->valuestring);

    // catalogs_product_groups_create_many_request_items->country
    cJSON *country = cJSON_GetObjectItemCaseSensitive(catalogs_product_groups_create_many_request_itemsJSON, "country");
    if (cJSON_IsNull(country)) {
        country = NULL;
    }
    if (country) { 
    country_local_nonprim = country_parseFromJSON(country); //custom
    }

    // catalogs_product_groups_create_many_request_items->locale
    cJSON *locale = cJSON_GetObjectItemCaseSensitive(catalogs_product_groups_create_many_request_itemsJSON, "locale");
    if (cJSON_IsNull(locale)) {
        locale = NULL;
    }
    if (locale) { 
    locale_local_nonprim = catalogs_locale_parseFromJSON(locale); //custom
    }


    if (description && !cJSON_IsNull(description)) description_local_str = strdup(description->valuestring);
    if (feed_id && !cJSON_IsNull(feed_id)) feed_id_local_str = strdup(feed_id->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);
    if (catalog_id && !cJSON_IsNull(catalog_id)) catalog_id_local_str = strdup(catalog_id->valuestring);

    catalogs_product_groups_create_many_request_items_local_var = catalogs_product_groups_create_many_request_items_create_internal (
        description_local_str,
        feed_id_local_str,
        filters_local_nonprim,
        is_featured_local_var,
        name_local_str,
        catalog_id_local_str,
        catalog_typeVariable,
        country ? country_local_nonprim : 0,
        locale ? locale_local_nonprim : 0
        );

    if (!catalogs_product_groups_create_many_request_items_local_var) {
        goto end;
    }

    return catalogs_product_groups_create_many_request_items_local_var;
end:
    if (description_local_str) {
        free(description_local_str);
        description_local_str = NULL;
    }
    if (feed_id_local_str) {
        free(feed_id_local_str);
        feed_id_local_str = NULL;
    }
    if (filters_local_nonprim) {
        catalogs_creative_assets_product_group_filters_free(filters_local_nonprim);
        filters_local_nonprim = NULL;
    }
    if (is_featured_local_var) {
        free(is_featured_local_var);
        is_featured_local_var = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
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
