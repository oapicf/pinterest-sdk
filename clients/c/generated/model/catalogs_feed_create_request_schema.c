#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_feed_create_request_schema.h"


char* catalogs_feed_create_request_schema_catalog_type_ToString(pinterest_rest_api_catalogs_feed_create_request_schema_CATALOGTYPE_e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "CREATIVE_ASSETS" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_catalogs_feed_create_request_schema_CATALOGTYPE_e catalogs_feed_create_request_schema_catalog_type_FromString(char* catalog_type){
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

static catalogs_feed_create_request_schema_t *catalogs_feed_create_request_schema_create_internal(
    char *catalog_id,
    pinterest_rest_api_catalogs_feed_create_request_schema_CATALOGTYPE_e catalog_type,
    catalogs_feed_credentials_t *credentials,
    pinterest_rest_api_product_availability_type__e default_availability,
    pinterest_rest_api_country__e default_country,
    pinterest_rest_api_nullable_currency__e default_currency,
    catalogs_creative_assets_feeds_create_request_default_locale_t *default_locale,
    pinterest_rest_api_catalogs_format__e format,
    char *location,
    char *name,
    catalogs_feed_processing_schedule_t *preferred_processing_schedule,
    catalogs_status_t *status
    ) {
    catalogs_feed_create_request_schema_t *catalogs_feed_create_request_schema_local_var = malloc(sizeof(catalogs_feed_create_request_schema_t));
    if (!catalogs_feed_create_request_schema_local_var) {
        return NULL;
    }
    memset(catalogs_feed_create_request_schema_local_var, 0, sizeof(catalogs_feed_create_request_schema_t));
    catalogs_feed_create_request_schema_local_var->_library_owned = 1;
    catalogs_feed_create_request_schema_local_var->catalog_id = catalog_id;
    catalogs_feed_create_request_schema_local_var->catalog_type = catalog_type;
    catalogs_feed_create_request_schema_local_var->credentials = credentials;
    catalogs_feed_create_request_schema_local_var->default_availability = default_availability;
    catalogs_feed_create_request_schema_local_var->default_country = default_country;
    catalogs_feed_create_request_schema_local_var->default_currency = default_currency;
    catalogs_feed_create_request_schema_local_var->default_locale = default_locale;
    catalogs_feed_create_request_schema_local_var->format = format;
    catalogs_feed_create_request_schema_local_var->location = location;
    catalogs_feed_create_request_schema_local_var->name = name;
    catalogs_feed_create_request_schema_local_var->preferred_processing_schedule = preferred_processing_schedule;
    catalogs_feed_create_request_schema_local_var->status = status;
    return catalogs_feed_create_request_schema_local_var;
}

__attribute__((deprecated)) catalogs_feed_create_request_schema_t *catalogs_feed_create_request_schema_create(
    char *catalog_id,
    pinterest_rest_api_catalogs_feed_create_request_schema_CATALOGTYPE_e catalog_type,
    catalogs_feed_credentials_t *credentials,
    pinterest_rest_api_product_availability_type__e default_availability,
    pinterest_rest_api_country__e default_country,
    pinterest_rest_api_nullable_currency__e default_currency,
    catalogs_creative_assets_feeds_create_request_default_locale_t *default_locale,
    pinterest_rest_api_catalogs_format__e format,
    char *location,
    char *name,
    catalogs_feed_processing_schedule_t *preferred_processing_schedule,
    catalogs_status_t *status
    ) {
    catalogs_feed_create_request_schema_t *result = catalogs_feed_create_request_schema_create_internal (
        catalog_id,
        catalog_type,
        credentials,
        default_availability,
        default_country,
        default_currency,
        default_locale,
        format,
        location,
        name,
        preferred_processing_schedule,
        status
        );
    if (!result) {
    }
    return result;
}

void catalogs_feed_create_request_schema_free(catalogs_feed_create_request_schema_t *catalogs_feed_create_request_schema) {
    if(NULL == catalogs_feed_create_request_schema){
        return ;
    }
    if(catalogs_feed_create_request_schema->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_feed_create_request_schema_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_feed_create_request_schema->catalog_id) {
        free(catalogs_feed_create_request_schema->catalog_id);
        catalogs_feed_create_request_schema->catalog_id = NULL;
    }
    if (catalogs_feed_create_request_schema->credentials) {
        catalogs_feed_credentials_free(catalogs_feed_create_request_schema->credentials);
        catalogs_feed_create_request_schema->credentials = NULL;
    }
    if (catalogs_feed_create_request_schema->default_locale) {
        catalogs_creative_assets_feeds_create_request_default_locale_free(catalogs_feed_create_request_schema->default_locale);
        catalogs_feed_create_request_schema->default_locale = NULL;
    }
    if (catalogs_feed_create_request_schema->location) {
        free(catalogs_feed_create_request_schema->location);
        catalogs_feed_create_request_schema->location = NULL;
    }
    if (catalogs_feed_create_request_schema->name) {
        free(catalogs_feed_create_request_schema->name);
        catalogs_feed_create_request_schema->name = NULL;
    }
    if (catalogs_feed_create_request_schema->preferred_processing_schedule) {
        catalogs_feed_processing_schedule_free(catalogs_feed_create_request_schema->preferred_processing_schedule);
        catalogs_feed_create_request_schema->preferred_processing_schedule = NULL;
    }
    if (catalogs_feed_create_request_schema->status) {
        catalogs_status_free(catalogs_feed_create_request_schema->status);
        catalogs_feed_create_request_schema->status = NULL;
    }
    free(catalogs_feed_create_request_schema);
}

cJSON *catalogs_feed_create_request_schema_convertToJSON(catalogs_feed_create_request_schema_t *catalogs_feed_create_request_schema) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_feed_create_request_schema->catalog_id
    if(catalogs_feed_create_request_schema->catalog_id) {
    if(cJSON_AddStringToObject(item, "catalog_id", catalogs_feed_create_request_schema->catalog_id) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_feed_create_request_schema->catalog_type
    if (pinterest_rest_api_catalogs_feed_create_request_schema_CATALOGTYPE_NULL == catalogs_feed_create_request_schema->catalog_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_type", catalogs_feed_create_request_schema_catalog_type_ToString(catalogs_feed_create_request_schema->catalog_type)) == NULL)
    {
    goto fail; //Enum
    }


    // catalogs_feed_create_request_schema->credentials
    if(catalogs_feed_create_request_schema->credentials) {
    cJSON *credentials_local_JSON = catalogs_feed_credentials_convertToJSON(catalogs_feed_create_request_schema->credentials);
    if(credentials_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "credentials", credentials_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_feed_create_request_schema->default_availability
    if(catalogs_feed_create_request_schema->default_availability != pinterest_rest_api_product_availability_type__NULL) {
    cJSON *default_availability_local_JSON = product_availability_type_convertToJSON(catalogs_feed_create_request_schema->default_availability);
    if(default_availability_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "default_availability", default_availability_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // catalogs_feed_create_request_schema->default_country
    if (pinterest_rest_api_country__NULL == catalogs_feed_create_request_schema->default_country) {
        goto fail;
    }
    cJSON *default_country_local_JSON = country_convertToJSON(catalogs_feed_create_request_schema->default_country);
    if(default_country_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "default_country", default_country_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_feed_create_request_schema->default_currency
    if(catalogs_feed_create_request_schema->default_currency != pinterest_rest_api_nullable_currency__NULL) {
    cJSON *default_currency_local_JSON = nullable_currency_convertToJSON(catalogs_feed_create_request_schema->default_currency);
    if(default_currency_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "default_currency", default_currency_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // catalogs_feed_create_request_schema->default_locale
    if (!catalogs_feed_create_request_schema->default_locale) {
        goto fail;
    }
    cJSON *default_locale_local_JSON = catalogs_creative_assets_feeds_create_request_default_locale_convertToJSON(catalogs_feed_create_request_schema->default_locale);
    if(default_locale_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "default_locale", default_locale_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_feed_create_request_schema->format
    if (pinterest_rest_api_catalogs_format__NULL == catalogs_feed_create_request_schema->format) {
        goto fail;
    }
    cJSON *format_local_JSON = catalogs_format_convertToJSON(catalogs_feed_create_request_schema->format);
    if(format_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "format", format_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_feed_create_request_schema->location
    if (!catalogs_feed_create_request_schema->location) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "location", catalogs_feed_create_request_schema->location) == NULL) {
    goto fail; //String
    }


    // catalogs_feed_create_request_schema->name
    if (!catalogs_feed_create_request_schema->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", catalogs_feed_create_request_schema->name) == NULL) {
    goto fail; //String
    }


    // catalogs_feed_create_request_schema->preferred_processing_schedule
    if(catalogs_feed_create_request_schema->preferred_processing_schedule) {
    cJSON *preferred_processing_schedule_local_JSON = catalogs_feed_processing_schedule_convertToJSON(catalogs_feed_create_request_schema->preferred_processing_schedule);
    if(preferred_processing_schedule_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "preferred_processing_schedule", preferred_processing_schedule_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_feed_create_request_schema->status
    if(catalogs_feed_create_request_schema->status) {
    cJSON *status_local_JSON = catalogs_status_convertToJSON(catalogs_feed_create_request_schema->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
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

catalogs_feed_create_request_schema_t *catalogs_feed_create_request_schema_parseFromJSON(cJSON *catalogs_feed_create_request_schemaJSON){

    catalogs_feed_create_request_schema_t *catalogs_feed_create_request_schema_local_var = NULL;

    char *catalog_id_local_str = NULL;

    // define the local variable for catalogs_feed_create_request_schema->credentials
    catalogs_feed_credentials_t *credentials_local_nonprim = NULL;

    // define the local variable for catalogs_feed_create_request_schema->default_availability
    pinterest_rest_api_product_availability_type__e default_availability_local_nonprim = 0;

    // define the local variable for catalogs_feed_create_request_schema->default_country
    pinterest_rest_api_country__e default_country_local_nonprim = 0;

    // define the local variable for catalogs_feed_create_request_schema->default_currency
    pinterest_rest_api_nullable_currency__e default_currency_local_nonprim = 0;

    // define the local variable for catalogs_feed_create_request_schema->default_locale
    catalogs_creative_assets_feeds_create_request_default_locale_t *default_locale_local_nonprim = NULL;

    // define the local variable for catalogs_feed_create_request_schema->format
    pinterest_rest_api_catalogs_format__e format_local_nonprim = 0;

    char *location_local_str = NULL;

    char *name_local_str = NULL;

    // define the local variable for catalogs_feed_create_request_schema->preferred_processing_schedule
    catalogs_feed_processing_schedule_t *preferred_processing_schedule_local_nonprim = NULL;

    // define the local variable for catalogs_feed_create_request_schema->status
    catalogs_status_t *status_local_nonprim = NULL;

    // catalogs_feed_create_request_schema->catalog_id
    cJSON *catalog_id = cJSON_GetObjectItemCaseSensitive(catalogs_feed_create_request_schemaJSON, "catalog_id");
    if (cJSON_IsNull(catalog_id)) {
        catalog_id = NULL;
    }
    if (catalog_id) { 
    if(!cJSON_IsString(catalog_id) && !cJSON_IsNull(catalog_id))
    {
    goto end; //String
    }
    }

    // catalogs_feed_create_request_schema->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_feed_create_request_schemaJSON, "catalog_type");
    if (cJSON_IsNull(catalog_type)) {
        catalog_type = NULL;
    }
    if (!catalog_type) {
        goto end;
    }

    pinterest_rest_api_catalogs_feed_create_request_schema_CATALOGTYPE_e catalog_typeVariable;
    
    if(!cJSON_IsString(catalog_type))
    {
    goto end; //Enum
    }
    catalog_typeVariable = catalogs_feed_create_request_schema_catalog_type_FromString(catalog_type->valuestring);

    // catalogs_feed_create_request_schema->credentials
    cJSON *credentials = cJSON_GetObjectItemCaseSensitive(catalogs_feed_create_request_schemaJSON, "credentials");
    if (cJSON_IsNull(credentials)) {
        credentials = NULL;
    }
    if (credentials) { 
    credentials_local_nonprim = catalogs_feed_credentials_parseFromJSON(credentials); //nonprimitive
    }

    // catalogs_feed_create_request_schema->default_availability
    cJSON *default_availability = cJSON_GetObjectItemCaseSensitive(catalogs_feed_create_request_schemaJSON, "default_availability");
    if (cJSON_IsNull(default_availability)) {
        default_availability = NULL;
    }
    if (default_availability) { 
    default_availability_local_nonprim = product_availability_type_parseFromJSON(default_availability); //custom
    }

    // catalogs_feed_create_request_schema->default_country
    cJSON *default_country = cJSON_GetObjectItemCaseSensitive(catalogs_feed_create_request_schemaJSON, "default_country");
    if (cJSON_IsNull(default_country)) {
        default_country = NULL;
    }
    if (!default_country) {
        goto end;
    }

    
    default_country_local_nonprim = country_parseFromJSON(default_country); //custom

    // catalogs_feed_create_request_schema->default_currency
    cJSON *default_currency = cJSON_GetObjectItemCaseSensitive(catalogs_feed_create_request_schemaJSON, "default_currency");
    if (cJSON_IsNull(default_currency)) {
        default_currency = NULL;
    }
    if (default_currency) { 
    default_currency_local_nonprim = nullable_currency_parseFromJSON(default_currency); //custom
    }

    // catalogs_feed_create_request_schema->default_locale
    cJSON *default_locale = cJSON_GetObjectItemCaseSensitive(catalogs_feed_create_request_schemaJSON, "default_locale");
    if (cJSON_IsNull(default_locale)) {
        default_locale = NULL;
    }
    if (!default_locale) {
        goto end;
    }

    
    default_locale_local_nonprim = catalogs_creative_assets_feeds_create_request_default_locale_parseFromJSON(default_locale); //nonprimitive

    // catalogs_feed_create_request_schema->format
    cJSON *format = cJSON_GetObjectItemCaseSensitive(catalogs_feed_create_request_schemaJSON, "format");
    if (cJSON_IsNull(format)) {
        format = NULL;
    }
    if (!format) {
        goto end;
    }

    
    format_local_nonprim = catalogs_format_parseFromJSON(format); //custom

    // catalogs_feed_create_request_schema->location
    cJSON *location = cJSON_GetObjectItemCaseSensitive(catalogs_feed_create_request_schemaJSON, "location");
    if (cJSON_IsNull(location)) {
        location = NULL;
    }
    if (!location) {
        goto end;
    }

    
    if(!cJSON_IsString(location))
    {
    goto end; //String
    }

    // catalogs_feed_create_request_schema->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(catalogs_feed_create_request_schemaJSON, "name");
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

    // catalogs_feed_create_request_schema->preferred_processing_schedule
    cJSON *preferred_processing_schedule = cJSON_GetObjectItemCaseSensitive(catalogs_feed_create_request_schemaJSON, "preferred_processing_schedule");
    if (cJSON_IsNull(preferred_processing_schedule)) {
        preferred_processing_schedule = NULL;
    }
    if (preferred_processing_schedule) { 
    preferred_processing_schedule_local_nonprim = catalogs_feed_processing_schedule_parseFromJSON(preferred_processing_schedule); //nonprimitive
    }

    // catalogs_feed_create_request_schema->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(catalogs_feed_create_request_schemaJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    status_local_nonprim = catalogs_status_parseFromJSON(status); //custom
    }


    if (catalog_id && !cJSON_IsNull(catalog_id)) catalog_id_local_str = strdup(catalog_id->valuestring);
    if (location && !cJSON_IsNull(location)) location_local_str = strdup(location->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    catalogs_feed_create_request_schema_local_var = catalogs_feed_create_request_schema_create_internal (
        catalog_id_local_str,
        catalog_typeVariable,
        credentials ? credentials_local_nonprim : NULL,
        default_availability ? default_availability_local_nonprim : 0,
        default_country_local_nonprim,
        default_currency ? default_currency_local_nonprim : 0,
        default_locale_local_nonprim,
        format_local_nonprim,
        location_local_str,
        name_local_str,
        preferred_processing_schedule ? preferred_processing_schedule_local_nonprim : NULL,
        status ? status_local_nonprim : NULL
        );

    if (!catalogs_feed_create_request_schema_local_var) {
        goto end;
    }

    return catalogs_feed_create_request_schema_local_var;
end:
    if (catalog_id_local_str) {
        free(catalog_id_local_str);
        catalog_id_local_str = NULL;
    }
    if (credentials_local_nonprim) {
        catalogs_feed_credentials_free(credentials_local_nonprim);
        credentials_local_nonprim = NULL;
    }
    if (default_availability_local_nonprim) {
        default_availability_local_nonprim = 0;
    }
    if (default_country_local_nonprim) {
        default_country_local_nonprim = 0;
    }
    if (default_currency_local_nonprim) {
        default_currency_local_nonprim = 0;
    }
    if (default_locale_local_nonprim) {
        catalogs_creative_assets_feeds_create_request_default_locale_free(default_locale_local_nonprim);
        default_locale_local_nonprim = NULL;
    }
    if (format_local_nonprim) {
        format_local_nonprim = 0;
    }
    if (location_local_str) {
        free(location_local_str);
        location_local_str = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (preferred_processing_schedule_local_nonprim) {
        catalogs_feed_processing_schedule_free(preferred_processing_schedule_local_nonprim);
        preferred_processing_schedule_local_nonprim = NULL;
    }
    if (status_local_nonprim) {
        catalogs_status_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    return NULL;

}
