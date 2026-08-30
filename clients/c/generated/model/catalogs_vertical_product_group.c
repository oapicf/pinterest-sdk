#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_vertical_product_group.h"


char* catalogs_vertical_product_group_catalog_type_ToString(pinterest_rest_api_catalogs_vertical_product_group_CATALOGTYPE_e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "CREATIVE_ASSETS" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_catalogs_vertical_product_group_CATALOGTYPE_e catalogs_vertical_product_group_catalog_type_FromString(char* catalog_type){
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

static catalogs_vertical_product_group_t *catalogs_vertical_product_group_create_internal(
    char *catalog_id,
    pinterest_rest_api_catalogs_vertical_product_group_CATALOGTYPE_e catalog_type,
    char *country,
    int *created_at,
    char *description,
    char *feed_id,
    catalogs_creative_assets_product_group_filters_t *filters,
    char *id,
    int *is_featured,
    char *locale,
    char *name,
    pinterest_rest_api_catalogs_product_group_status__e status,
    pinterest_rest_api_catalogs_hotel_product_group_type__e type,
    int *updated_at
    ) {
    catalogs_vertical_product_group_t *catalogs_vertical_product_group_local_var = malloc(sizeof(catalogs_vertical_product_group_t));
    if (!catalogs_vertical_product_group_local_var) {
        return NULL;
    }
    memset(catalogs_vertical_product_group_local_var, 0, sizeof(catalogs_vertical_product_group_t));
    catalogs_vertical_product_group_local_var->_library_owned = 1;
    catalogs_vertical_product_group_local_var->catalog_id = catalog_id;
    catalogs_vertical_product_group_local_var->catalog_type = catalog_type;
    catalogs_vertical_product_group_local_var->country = country;
    catalogs_vertical_product_group_local_var->created_at = created_at;
    catalogs_vertical_product_group_local_var->description = description;
    catalogs_vertical_product_group_local_var->feed_id = feed_id;
    catalogs_vertical_product_group_local_var->filters = filters;
    catalogs_vertical_product_group_local_var->id = id;
    catalogs_vertical_product_group_local_var->is_featured = is_featured;
    catalogs_vertical_product_group_local_var->locale = locale;
    catalogs_vertical_product_group_local_var->name = name;
    catalogs_vertical_product_group_local_var->status = status;
    catalogs_vertical_product_group_local_var->type = type;
    catalogs_vertical_product_group_local_var->updated_at = updated_at;
    return catalogs_vertical_product_group_local_var;
}

__attribute__((deprecated)) catalogs_vertical_product_group_t *catalogs_vertical_product_group_create(
    char *catalog_id,
    pinterest_rest_api_catalogs_vertical_product_group_CATALOGTYPE_e catalog_type,
    char *country,
    int *created_at,
    char *description,
    char *feed_id,
    catalogs_creative_assets_product_group_filters_t *filters,
    char *id,
    int *is_featured,
    char *locale,
    char *name,
    pinterest_rest_api_catalogs_product_group_status__e status,
    pinterest_rest_api_catalogs_hotel_product_group_type__e type,
    int *updated_at
    ) {
    int *created_at_copy = NULL;
    if (created_at) {
        created_at_copy = malloc(sizeof(int));
        if (created_at_copy) *created_at_copy = *created_at;
    }
    int *is_featured_copy = NULL;
    if (is_featured) {
        is_featured_copy = malloc(sizeof(int));
        if (is_featured_copy) *is_featured_copy = *is_featured;
    }
    int *updated_at_copy = NULL;
    if (updated_at) {
        updated_at_copy = malloc(sizeof(int));
        if (updated_at_copy) *updated_at_copy = *updated_at;
    }
    catalogs_vertical_product_group_t *result = catalogs_vertical_product_group_create_internal (
        catalog_id,
        catalog_type,
        country,
        created_at_copy,
        description,
        feed_id,
        filters,
        id,
        is_featured_copy,
        locale,
        name,
        status,
        type,
        updated_at_copy
        );
    if (!result) {
        free(created_at_copy);
        free(is_featured_copy);
        free(updated_at_copy);
    }
    return result;
}

void catalogs_vertical_product_group_free(catalogs_vertical_product_group_t *catalogs_vertical_product_group) {
    if(NULL == catalogs_vertical_product_group){
        return ;
    }
    if(catalogs_vertical_product_group->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_vertical_product_group_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_vertical_product_group->catalog_id) {
        free(catalogs_vertical_product_group->catalog_id);
        catalogs_vertical_product_group->catalog_id = NULL;
    }
    if (catalogs_vertical_product_group->country) {
        free(catalogs_vertical_product_group->country);
        catalogs_vertical_product_group->country = NULL;
    }
    if (catalogs_vertical_product_group->created_at) {
        free(catalogs_vertical_product_group->created_at);
        catalogs_vertical_product_group->created_at = NULL;
    }
    if (catalogs_vertical_product_group->description) {
        free(catalogs_vertical_product_group->description);
        catalogs_vertical_product_group->description = NULL;
    }
    if (catalogs_vertical_product_group->feed_id) {
        free(catalogs_vertical_product_group->feed_id);
        catalogs_vertical_product_group->feed_id = NULL;
    }
    if (catalogs_vertical_product_group->filters) {
        catalogs_creative_assets_product_group_filters_free(catalogs_vertical_product_group->filters);
        catalogs_vertical_product_group->filters = NULL;
    }
    if (catalogs_vertical_product_group->id) {
        free(catalogs_vertical_product_group->id);
        catalogs_vertical_product_group->id = NULL;
    }
    if (catalogs_vertical_product_group->is_featured) {
        free(catalogs_vertical_product_group->is_featured);
        catalogs_vertical_product_group->is_featured = NULL;
    }
    if (catalogs_vertical_product_group->locale) {
        free(catalogs_vertical_product_group->locale);
        catalogs_vertical_product_group->locale = NULL;
    }
    if (catalogs_vertical_product_group->name) {
        free(catalogs_vertical_product_group->name);
        catalogs_vertical_product_group->name = NULL;
    }
    if (catalogs_vertical_product_group->updated_at) {
        free(catalogs_vertical_product_group->updated_at);
        catalogs_vertical_product_group->updated_at = NULL;
    }
    free(catalogs_vertical_product_group);
}

cJSON *catalogs_vertical_product_group_convertToJSON(catalogs_vertical_product_group_t *catalogs_vertical_product_group) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_vertical_product_group->catalog_id
    if (!catalogs_vertical_product_group->catalog_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_id", catalogs_vertical_product_group->catalog_id) == NULL) {
    goto fail; //String
    }


    // catalogs_vertical_product_group->catalog_type
    if (pinterest_rest_api_catalogs_vertical_product_group_CATALOGTYPE_NULL == catalogs_vertical_product_group->catalog_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_type", catalogs_vertical_product_group_catalog_type_ToString(catalogs_vertical_product_group->catalog_type)) == NULL)
    {
    goto fail; //Enum
    }


    // catalogs_vertical_product_group->country
    if(catalogs_vertical_product_group->country) {
    if(cJSON_AddStringToObject(item, "country", catalogs_vertical_product_group->country) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_vertical_product_group->created_at
    if(catalogs_vertical_product_group->created_at) {
    if(cJSON_AddNumberToObject(item, "created_at", *catalogs_vertical_product_group->created_at) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_vertical_product_group->description
    if(catalogs_vertical_product_group->description) {
    if(cJSON_AddStringToObject(item, "description", catalogs_vertical_product_group->description) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_vertical_product_group->feed_id
    if (!catalogs_vertical_product_group->feed_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "feed_id", catalogs_vertical_product_group->feed_id) == NULL) {
    goto fail; //String
    }


    // catalogs_vertical_product_group->filters
    if (!catalogs_vertical_product_group->filters) {
        goto fail;
    }
    cJSON *filters_local_JSON = catalogs_creative_assets_product_group_filters_convertToJSON(catalogs_vertical_product_group->filters);
    if(filters_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "filters", filters_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_vertical_product_group->id
    if (!catalogs_vertical_product_group->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", catalogs_vertical_product_group->id) == NULL) {
    goto fail; //String
    }


    // catalogs_vertical_product_group->is_featured
    if(catalogs_vertical_product_group->is_featured) {
    if(cJSON_AddBoolToObject(item, "is_featured", *catalogs_vertical_product_group->is_featured) == NULL) {
    goto fail; //Bool
    }
    }


    // catalogs_vertical_product_group->locale
    if(catalogs_vertical_product_group->locale) {
    if(cJSON_AddStringToObject(item, "locale", catalogs_vertical_product_group->locale) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_vertical_product_group->name
    if(catalogs_vertical_product_group->name) {
    if(cJSON_AddStringToObject(item, "name", catalogs_vertical_product_group->name) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_vertical_product_group->status
    if(catalogs_vertical_product_group->status != pinterest_rest_api_catalogs_product_group_status__NULL) {
    cJSON *status_local_JSON = catalogs_product_group_status_convertToJSON(catalogs_vertical_product_group->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // catalogs_vertical_product_group->type
    if (pinterest_rest_api_catalogs_hotel_product_group_type__NULL == catalogs_vertical_product_group->type) {
        goto fail;
    }
    cJSON *type_local_JSON = catalogs_hotel_product_group_type_convertToJSON(catalogs_vertical_product_group->type);
    if(type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_vertical_product_group->updated_at
    if(catalogs_vertical_product_group->updated_at) {
    if(cJSON_AddNumberToObject(item, "updated_at", *catalogs_vertical_product_group->updated_at) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_vertical_product_group_t *catalogs_vertical_product_group_parseFromJSON(cJSON *catalogs_vertical_product_groupJSON){

    catalogs_vertical_product_group_t *catalogs_vertical_product_group_local_var = NULL;

    char *catalog_id_local_str = NULL;

    char *country_local_str = NULL;

    // define the local variable for catalogs_vertical_product_group->created_at
    int *created_at_local_var = NULL;

    char *description_local_str = NULL;

    char *feed_id_local_str = NULL;

    // define the local variable for catalogs_vertical_product_group->filters
    catalogs_creative_assets_product_group_filters_t *filters_local_nonprim = NULL;

    char *id_local_str = NULL;

    // define the local variable for catalogs_vertical_product_group->is_featured
    int *is_featured_local_var = NULL;

    char *locale_local_str = NULL;

    char *name_local_str = NULL;

    // define the local variable for catalogs_vertical_product_group->status
    pinterest_rest_api_catalogs_product_group_status__e status_local_nonprim = 0;

    // define the local variable for catalogs_vertical_product_group->type
    pinterest_rest_api_catalogs_hotel_product_group_type__e type_local_nonprim = 0;

    // define the local variable for catalogs_vertical_product_group->updated_at
    int *updated_at_local_var = NULL;

    // catalogs_vertical_product_group->catalog_id
    cJSON *catalog_id = cJSON_GetObjectItemCaseSensitive(catalogs_vertical_product_groupJSON, "catalog_id");
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

    // catalogs_vertical_product_group->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_vertical_product_groupJSON, "catalog_type");
    if (cJSON_IsNull(catalog_type)) {
        catalog_type = NULL;
    }
    if (!catalog_type) {
        goto end;
    }

    pinterest_rest_api_catalogs_vertical_product_group_CATALOGTYPE_e catalog_typeVariable;
    
    if(!cJSON_IsString(catalog_type))
    {
    goto end; //Enum
    }
    catalog_typeVariable = catalogs_vertical_product_group_catalog_type_FromString(catalog_type->valuestring);

    // catalogs_vertical_product_group->country
    cJSON *country = cJSON_GetObjectItemCaseSensitive(catalogs_vertical_product_groupJSON, "country");
    if (cJSON_IsNull(country)) {
        country = NULL;
    }
    if (country) { 
    if(!cJSON_IsString(country) && !cJSON_IsNull(country))
    {
    goto end; //String
    }
    }

    // catalogs_vertical_product_group->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(catalogs_vertical_product_groupJSON, "created_at");
    if (cJSON_IsNull(created_at)) {
        created_at = NULL;
    }
    if (created_at) { 
    if(!cJSON_IsNumber(created_at))
    {
    goto end; //Numeric
    }
    created_at_local_var = malloc(sizeof(int));
    if(!created_at_local_var)
    {
        goto end;
    }
    *created_at_local_var = created_at->valuedouble;
    }

    // catalogs_vertical_product_group->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(catalogs_vertical_product_groupJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // catalogs_vertical_product_group->feed_id
    cJSON *feed_id = cJSON_GetObjectItemCaseSensitive(catalogs_vertical_product_groupJSON, "feed_id");
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

    // catalogs_vertical_product_group->filters
    cJSON *filters = cJSON_GetObjectItemCaseSensitive(catalogs_vertical_product_groupJSON, "filters");
    if (cJSON_IsNull(filters)) {
        filters = NULL;
    }
    if (!filters) {
        goto end;
    }

    
    filters_local_nonprim = catalogs_creative_assets_product_group_filters_parseFromJSON(filters); //nonprimitive

    // catalogs_vertical_product_group->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(catalogs_vertical_product_groupJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // catalogs_vertical_product_group->is_featured
    cJSON *is_featured = cJSON_GetObjectItemCaseSensitive(catalogs_vertical_product_groupJSON, "is_featured");
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

    // catalogs_vertical_product_group->locale
    cJSON *locale = cJSON_GetObjectItemCaseSensitive(catalogs_vertical_product_groupJSON, "locale");
    if (cJSON_IsNull(locale)) {
        locale = NULL;
    }
    if (locale) { 
    if(!cJSON_IsString(locale) && !cJSON_IsNull(locale))
    {
    goto end; //String
    }
    }

    // catalogs_vertical_product_group->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(catalogs_vertical_product_groupJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // catalogs_vertical_product_group->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(catalogs_vertical_product_groupJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    status_local_nonprim = catalogs_product_group_status_parseFromJSON(status); //custom
    }

    // catalogs_vertical_product_group->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(catalogs_vertical_product_groupJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    
    type_local_nonprim = catalogs_hotel_product_group_type_parseFromJSON(type); //custom

    // catalogs_vertical_product_group->updated_at
    cJSON *updated_at = cJSON_GetObjectItemCaseSensitive(catalogs_vertical_product_groupJSON, "updated_at");
    if (cJSON_IsNull(updated_at)) {
        updated_at = NULL;
    }
    if (updated_at) { 
    if(!cJSON_IsNumber(updated_at))
    {
    goto end; //Numeric
    }
    updated_at_local_var = malloc(sizeof(int));
    if(!updated_at_local_var)
    {
        goto end;
    }
    *updated_at_local_var = updated_at->valuedouble;
    }


    if (catalog_id && !cJSON_IsNull(catalog_id)) catalog_id_local_str = strdup(catalog_id->valuestring);
    if (country && !cJSON_IsNull(country)) country_local_str = strdup(country->valuestring);
    if (description && !cJSON_IsNull(description)) description_local_str = strdup(description->valuestring);
    if (feed_id && !cJSON_IsNull(feed_id)) feed_id_local_str = strdup(feed_id->valuestring);
    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (locale && !cJSON_IsNull(locale)) locale_local_str = strdup(locale->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    catalogs_vertical_product_group_local_var = catalogs_vertical_product_group_create_internal (
        catalog_id_local_str,
        catalog_typeVariable,
        country_local_str,
        created_at_local_var,
        description_local_str,
        feed_id_local_str,
        filters_local_nonprim,
        id_local_str,
        is_featured_local_var,
        locale_local_str,
        name_local_str,
        status ? status_local_nonprim : 0,
        type_local_nonprim,
        updated_at_local_var
        );

    if (!catalogs_vertical_product_group_local_var) {
        goto end;
    }

    return catalogs_vertical_product_group_local_var;
end:
    if (catalog_id_local_str) {
        free(catalog_id_local_str);
        catalog_id_local_str = NULL;
    }
    if (country_local_str) {
        free(country_local_str);
        country_local_str = NULL;
    }
    if (created_at_local_var) {
        free(created_at_local_var);
        created_at_local_var = NULL;
    }
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
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (is_featured_local_var) {
        free(is_featured_local_var);
        is_featured_local_var = NULL;
    }
    if (locale_local_str) {
        free(locale_local_str);
        locale_local_str = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (status_local_nonprim) {
        status_local_nonprim = 0;
    }
    if (type_local_nonprim) {
        type_local_nonprim = 0;
    }
    if (updated_at_local_var) {
        free(updated_at_local_var);
        updated_at_local_var = NULL;
    }
    return NULL;

}
