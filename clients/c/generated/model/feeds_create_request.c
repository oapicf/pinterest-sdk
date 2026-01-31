#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "feeds_create_request.h"



static feeds_create_request_t *feeds_create_request_create_internal(
    char *catalog_id,
    pinterest_rest_api_catalogs_type__e catalog_type,
    catalogs_feed_credentials_t *credentials,
    pinterest_rest_api_product_availability_type__e default_availability,
    pinterest_rest_api_country__e default_country,
    pinterest_rest_api_nullable_currency__e default_currency,
    catalogs_feeds_create_request_default_locale_t *default_locale,
    pinterest_rest_api_catalogs_format__e format,
    char *location,
    char *name,
    catalogs_feed_processing_schedule_t *preferred_processing_schedule,
    catalogs_status_t *status
    ) {
    feeds_create_request_t *feeds_create_request_local_var = malloc(sizeof(feeds_create_request_t));
    if (!feeds_create_request_local_var) {
        return NULL;
    }
    feeds_create_request_local_var->catalog_id = catalog_id;
    feeds_create_request_local_var->catalog_type = catalog_type;
    feeds_create_request_local_var->credentials = credentials;
    feeds_create_request_local_var->default_availability = default_availability;
    feeds_create_request_local_var->default_country = default_country;
    feeds_create_request_local_var->default_currency = default_currency;
    feeds_create_request_local_var->default_locale = default_locale;
    feeds_create_request_local_var->format = format;
    feeds_create_request_local_var->location = location;
    feeds_create_request_local_var->name = name;
    feeds_create_request_local_var->preferred_processing_schedule = preferred_processing_schedule;
    feeds_create_request_local_var->status = status;

    feeds_create_request_local_var->_library_owned = 1;
    return feeds_create_request_local_var;
}

__attribute__((deprecated)) feeds_create_request_t *feeds_create_request_create(
    char *catalog_id,
    pinterest_rest_api_catalogs_type__e catalog_type,
    catalogs_feed_credentials_t *credentials,
    pinterest_rest_api_product_availability_type__e default_availability,
    pinterest_rest_api_country__e default_country,
    pinterest_rest_api_nullable_currency__e default_currency,
    catalogs_feeds_create_request_default_locale_t *default_locale,
    pinterest_rest_api_catalogs_format__e format,
    char *location,
    char *name,
    catalogs_feed_processing_schedule_t *preferred_processing_schedule,
    catalogs_status_t *status
    ) {
    return feeds_create_request_create_internal (
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
}

void feeds_create_request_free(feeds_create_request_t *feeds_create_request) {
    if(NULL == feeds_create_request){
        return ;
    }
    if(feeds_create_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "feeds_create_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (feeds_create_request->catalog_id) {
        free(feeds_create_request->catalog_id);
        feeds_create_request->catalog_id = NULL;
    }
    if (feeds_create_request->credentials) {
        catalogs_feed_credentials_free(feeds_create_request->credentials);
        feeds_create_request->credentials = NULL;
    }
    if (feeds_create_request->default_locale) {
        catalogs_feeds_create_request_default_locale_free(feeds_create_request->default_locale);
        feeds_create_request->default_locale = NULL;
    }
    if (feeds_create_request->location) {
        free(feeds_create_request->location);
        feeds_create_request->location = NULL;
    }
    if (feeds_create_request->name) {
        free(feeds_create_request->name);
        feeds_create_request->name = NULL;
    }
    if (feeds_create_request->preferred_processing_schedule) {
        catalogs_feed_processing_schedule_free(feeds_create_request->preferred_processing_schedule);
        feeds_create_request->preferred_processing_schedule = NULL;
    }
    if (feeds_create_request->status) {
        catalogs_status_free(feeds_create_request->status);
        feeds_create_request->status = NULL;
    }
    free(feeds_create_request);
}

cJSON *feeds_create_request_convertToJSON(feeds_create_request_t *feeds_create_request) {
    cJSON *item = cJSON_CreateObject();

    // feeds_create_request->catalog_id
    if(feeds_create_request->catalog_id) {
    if(cJSON_AddStringToObject(item, "catalog_id", feeds_create_request->catalog_id) == NULL) {
    goto fail; //String
    }
    }


    // feeds_create_request->catalog_type
    if (pinterest_rest_api_catalogs_type__NULL == feeds_create_request->catalog_type) {
        goto fail;
    }
    cJSON *catalog_type_local_JSON = catalogs_type_convertToJSON(feeds_create_request->catalog_type);
    if(catalog_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "catalog_type", catalog_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // feeds_create_request->credentials
    if(feeds_create_request->credentials) {
    cJSON *credentials_local_JSON = catalogs_feed_credentials_convertToJSON(feeds_create_request->credentials);
    if(credentials_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "credentials", credentials_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // feeds_create_request->default_availability
    if(feeds_create_request->default_availability != pinterest_rest_api_product_availability_type__NULL) {
    cJSON *default_availability_local_JSON = product_availability_type_convertToJSON(feeds_create_request->default_availability);
    if(default_availability_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "default_availability", default_availability_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // feeds_create_request->default_country
    if (pinterest_rest_api_country__NULL == feeds_create_request->default_country) {
        goto fail;
    }
    cJSON *default_country_local_JSON = country_convertToJSON(feeds_create_request->default_country);
    if(default_country_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "default_country", default_country_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // feeds_create_request->default_currency
    if(feeds_create_request->default_currency != pinterest_rest_api_nullable_currency__NULL) {
    cJSON *default_currency_local_JSON = nullable_currency_convertToJSON(feeds_create_request->default_currency);
    if(default_currency_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "default_currency", default_currency_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // feeds_create_request->default_locale
    if (!feeds_create_request->default_locale) {
        goto fail;
    }
    cJSON *default_locale_local_JSON = catalogs_feeds_create_request_default_locale_convertToJSON(feeds_create_request->default_locale);
    if(default_locale_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "default_locale", default_locale_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // feeds_create_request->format
    if (pinterest_rest_api_catalogs_format__NULL == feeds_create_request->format) {
        goto fail;
    }
    cJSON *format_local_JSON = catalogs_format_convertToJSON(feeds_create_request->format);
    if(format_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "format", format_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // feeds_create_request->location
    if (!feeds_create_request->location) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "location", feeds_create_request->location) == NULL) {
    goto fail; //String
    }


    // feeds_create_request->name
    if (!feeds_create_request->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", feeds_create_request->name) == NULL) {
    goto fail; //String
    }


    // feeds_create_request->preferred_processing_schedule
    if(feeds_create_request->preferred_processing_schedule) {
    cJSON *preferred_processing_schedule_local_JSON = catalogs_feed_processing_schedule_convertToJSON(feeds_create_request->preferred_processing_schedule);
    if(preferred_processing_schedule_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "preferred_processing_schedule", preferred_processing_schedule_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // feeds_create_request->status
    if(feeds_create_request->status) {
    cJSON *status_local_JSON = catalogs_status_convertToJSON(feeds_create_request->status);
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

feeds_create_request_t *feeds_create_request_parseFromJSON(cJSON *feeds_create_requestJSON){

    feeds_create_request_t *feeds_create_request_local_var = NULL;

    // define the local variable for feeds_create_request->catalog_type
    pinterest_rest_api_catalogs_type__e catalog_type_local_nonprim = 0;

    // define the local variable for feeds_create_request->credentials
    catalogs_feed_credentials_t *credentials_local_nonprim = NULL;

    // define the local variable for feeds_create_request->default_availability
    pinterest_rest_api_product_availability_type__e default_availability_local_nonprim = 0;

    // define the local variable for feeds_create_request->default_country
    pinterest_rest_api_country__e default_country_local_nonprim = 0;

    // define the local variable for feeds_create_request->default_currency
    pinterest_rest_api_nullable_currency__e default_currency_local_nonprim = 0;

    // define the local variable for feeds_create_request->default_locale
    catalogs_feeds_create_request_default_locale_t *default_locale_local_nonprim = NULL;

    // define the local variable for feeds_create_request->format
    pinterest_rest_api_catalogs_format__e format_local_nonprim = 0;

    // define the local variable for feeds_create_request->preferred_processing_schedule
    catalogs_feed_processing_schedule_t *preferred_processing_schedule_local_nonprim = NULL;

    // define the local variable for feeds_create_request->status
    catalogs_status_t *status_local_nonprim = NULL;

    // feeds_create_request->catalog_id
    cJSON *catalog_id = cJSON_GetObjectItemCaseSensitive(feeds_create_requestJSON, "catalog_id");
    if (cJSON_IsNull(catalog_id)) {
        catalog_id = NULL;
    }
    if (catalog_id) { 
    if(!cJSON_IsString(catalog_id) && !cJSON_IsNull(catalog_id))
    {
    goto end; //String
    }
    }

    // feeds_create_request->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(feeds_create_requestJSON, "catalog_type");
    if (cJSON_IsNull(catalog_type)) {
        catalog_type = NULL;
    }
    if (!catalog_type) {
        goto end;
    }

    
    catalog_type_local_nonprim = catalogs_type_parseFromJSON(catalog_type); //custom

    // feeds_create_request->credentials
    cJSON *credentials = cJSON_GetObjectItemCaseSensitive(feeds_create_requestJSON, "credentials");
    if (cJSON_IsNull(credentials)) {
        credentials = NULL;
    }
    if (credentials) { 
    credentials_local_nonprim = catalogs_feed_credentials_parseFromJSON(credentials); //nonprimitive
    }

    // feeds_create_request->default_availability
    cJSON *default_availability = cJSON_GetObjectItemCaseSensitive(feeds_create_requestJSON, "default_availability");
    if (cJSON_IsNull(default_availability)) {
        default_availability = NULL;
    }
    if (default_availability) { 
    default_availability_local_nonprim = product_availability_type_parseFromJSON(default_availability); //custom
    }

    // feeds_create_request->default_country
    cJSON *default_country = cJSON_GetObjectItemCaseSensitive(feeds_create_requestJSON, "default_country");
    if (cJSON_IsNull(default_country)) {
        default_country = NULL;
    }
    if (!default_country) {
        goto end;
    }

    
    default_country_local_nonprim = country_parseFromJSON(default_country); //custom

    // feeds_create_request->default_currency
    cJSON *default_currency = cJSON_GetObjectItemCaseSensitive(feeds_create_requestJSON, "default_currency");
    if (cJSON_IsNull(default_currency)) {
        default_currency = NULL;
    }
    if (default_currency) { 
    default_currency_local_nonprim = nullable_currency_parseFromJSON(default_currency); //custom
    }

    // feeds_create_request->default_locale
    cJSON *default_locale = cJSON_GetObjectItemCaseSensitive(feeds_create_requestJSON, "default_locale");
    if (cJSON_IsNull(default_locale)) {
        default_locale = NULL;
    }
    if (!default_locale) {
        goto end;
    }

    
    default_locale_local_nonprim = catalogs_feeds_create_request_default_locale_parseFromJSON(default_locale); //nonprimitive

    // feeds_create_request->format
    cJSON *format = cJSON_GetObjectItemCaseSensitive(feeds_create_requestJSON, "format");
    if (cJSON_IsNull(format)) {
        format = NULL;
    }
    if (!format) {
        goto end;
    }

    
    format_local_nonprim = catalogs_format_parseFromJSON(format); //custom

    // feeds_create_request->location
    cJSON *location = cJSON_GetObjectItemCaseSensitive(feeds_create_requestJSON, "location");
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

    // feeds_create_request->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(feeds_create_requestJSON, "name");
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

    // feeds_create_request->preferred_processing_schedule
    cJSON *preferred_processing_schedule = cJSON_GetObjectItemCaseSensitive(feeds_create_requestJSON, "preferred_processing_schedule");
    if (cJSON_IsNull(preferred_processing_schedule)) {
        preferred_processing_schedule = NULL;
    }
    if (preferred_processing_schedule) { 
    preferred_processing_schedule_local_nonprim = catalogs_feed_processing_schedule_parseFromJSON(preferred_processing_schedule); //nonprimitive
    }

    // feeds_create_request->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(feeds_create_requestJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    status_local_nonprim = catalogs_status_parseFromJSON(status); //custom
    }


    feeds_create_request_local_var = feeds_create_request_create_internal (
        catalog_id && !cJSON_IsNull(catalog_id) ? strdup(catalog_id->valuestring) : NULL,
        catalog_type_local_nonprim,
        credentials ? credentials_local_nonprim : NULL,
        default_availability ? default_availability_local_nonprim : 0,
        default_country_local_nonprim,
        default_currency ? default_currency_local_nonprim : 0,
        default_locale_local_nonprim,
        format_local_nonprim,
        strdup(location->valuestring),
        strdup(name->valuestring),
        preferred_processing_schedule ? preferred_processing_schedule_local_nonprim : NULL,
        status ? status_local_nonprim : NULL
        );

    return feeds_create_request_local_var;
end:
    if (catalog_type_local_nonprim) {
        catalog_type_local_nonprim = 0;
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
        catalogs_feeds_create_request_default_locale_free(default_locale_local_nonprim);
        default_locale_local_nonprim = NULL;
    }
    if (format_local_nonprim) {
        format_local_nonprim = 0;
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
