#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "feeds_update_request.h"



static feeds_update_request_t *feeds_update_request_create_internal(
    pinterest_rest_api_nullable_currency__e default_currency,
    char *name,
    pinterest_rest_api_catalogs_format__e format,
    catalogs_feed_credentials_t *credentials,
    char *location,
    catalogs_feed_processing_schedule_t *preferred_processing_schedule,
    pinterest_rest_api_catalogs_status__e status,
    pinterest_rest_api_catalogs_type__e catalog_type,
    pinterest_rest_api_product_availability_type__e default_availability
    ) {
    feeds_update_request_t *feeds_update_request_local_var = malloc(sizeof(feeds_update_request_t));
    if (!feeds_update_request_local_var) {
        return NULL;
    }
    feeds_update_request_local_var->default_currency = default_currency;
    feeds_update_request_local_var->name = name;
    feeds_update_request_local_var->format = format;
    feeds_update_request_local_var->credentials = credentials;
    feeds_update_request_local_var->location = location;
    feeds_update_request_local_var->preferred_processing_schedule = preferred_processing_schedule;
    feeds_update_request_local_var->status = status;
    feeds_update_request_local_var->catalog_type = catalog_type;
    feeds_update_request_local_var->default_availability = default_availability;

    feeds_update_request_local_var->_library_owned = 1;
    return feeds_update_request_local_var;
}

__attribute__((deprecated)) feeds_update_request_t *feeds_update_request_create(
    pinterest_rest_api_nullable_currency__e default_currency,
    char *name,
    pinterest_rest_api_catalogs_format__e format,
    catalogs_feed_credentials_t *credentials,
    char *location,
    catalogs_feed_processing_schedule_t *preferred_processing_schedule,
    pinterest_rest_api_catalogs_status__e status,
    pinterest_rest_api_catalogs_type__e catalog_type,
    pinterest_rest_api_product_availability_type__e default_availability
    ) {
    return feeds_update_request_create_internal (
        default_currency,
        name,
        format,
        credentials,
        location,
        preferred_processing_schedule,
        status,
        catalog_type,
        default_availability
        );
}

void feeds_update_request_free(feeds_update_request_t *feeds_update_request) {
    if(NULL == feeds_update_request){
        return ;
    }
    if(feeds_update_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "feeds_update_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (feeds_update_request->name) {
        free(feeds_update_request->name);
        feeds_update_request->name = NULL;
    }
    if (feeds_update_request->credentials) {
        catalogs_feed_credentials_free(feeds_update_request->credentials);
        feeds_update_request->credentials = NULL;
    }
    if (feeds_update_request->location) {
        free(feeds_update_request->location);
        feeds_update_request->location = NULL;
    }
    if (feeds_update_request->preferred_processing_schedule) {
        catalogs_feed_processing_schedule_free(feeds_update_request->preferred_processing_schedule);
        feeds_update_request->preferred_processing_schedule = NULL;
    }
    free(feeds_update_request);
}

cJSON *feeds_update_request_convertToJSON(feeds_update_request_t *feeds_update_request) {
    cJSON *item = cJSON_CreateObject();

    // feeds_update_request->default_currency
    if(feeds_update_request->default_currency != pinterest_rest_api_nullable_currency__NULL) {
    cJSON *default_currency_local_JSON = nullable_currency_convertToJSON(feeds_update_request->default_currency);
    if(default_currency_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "default_currency", default_currency_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // feeds_update_request->name
    if(feeds_update_request->name) {
    if(cJSON_AddStringToObject(item, "name", feeds_update_request->name) == NULL) {
    goto fail; //String
    }
    }


    // feeds_update_request->format
    if(feeds_update_request->format != pinterest_rest_api_catalogs_format__NULL) {
    cJSON *format_local_JSON = catalogs_format_convertToJSON(feeds_update_request->format);
    if(format_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "format", format_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // feeds_update_request->credentials
    if(feeds_update_request->credentials) {
    cJSON *credentials_local_JSON = catalogs_feed_credentials_convertToJSON(feeds_update_request->credentials);
    if(credentials_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "credentials", credentials_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // feeds_update_request->location
    if(feeds_update_request->location) {
    if(cJSON_AddStringToObject(item, "location", feeds_update_request->location) == NULL) {
    goto fail; //String
    }
    }


    // feeds_update_request->preferred_processing_schedule
    if(feeds_update_request->preferred_processing_schedule) {
    cJSON *preferred_processing_schedule_local_JSON = catalogs_feed_processing_schedule_convertToJSON(feeds_update_request->preferred_processing_schedule);
    if(preferred_processing_schedule_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "preferred_processing_schedule", preferred_processing_schedule_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // feeds_update_request->status
    if(feeds_update_request->status != pinterest_rest_api_catalogs_status__NULL) {
    cJSON *status_local_JSON = catalogs_status_convertToJSON(feeds_update_request->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // feeds_update_request->catalog_type
    if (pinterest_rest_api_catalogs_type__NULL == feeds_update_request->catalog_type) {
        goto fail;
    }
    cJSON *catalog_type_local_JSON = catalogs_type_convertToJSON(feeds_update_request->catalog_type);
    if(catalog_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "catalog_type", catalog_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // feeds_update_request->default_availability
    if(feeds_update_request->default_availability != pinterest_rest_api_product_availability_type__NULL) {
    cJSON *default_availability_local_JSON = product_availability_type_convertToJSON(feeds_update_request->default_availability);
    if(default_availability_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "default_availability", default_availability_local_JSON);
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

feeds_update_request_t *feeds_update_request_parseFromJSON(cJSON *feeds_update_requestJSON){

    feeds_update_request_t *feeds_update_request_local_var = NULL;

    // define the local variable for feeds_update_request->default_currency
    pinterest_rest_api_nullable_currency__e default_currency_local_nonprim = 0;

    // define the local variable for feeds_update_request->format
    pinterest_rest_api_catalogs_format__e format_local_nonprim = 0;

    // define the local variable for feeds_update_request->credentials
    catalogs_feed_credentials_t *credentials_local_nonprim = NULL;

    // define the local variable for feeds_update_request->preferred_processing_schedule
    catalogs_feed_processing_schedule_t *preferred_processing_schedule_local_nonprim = NULL;

    // define the local variable for feeds_update_request->status
    pinterest_rest_api_catalogs_status__e status_local_nonprim = 0;

    // define the local variable for feeds_update_request->catalog_type
    pinterest_rest_api_catalogs_type__e catalog_type_local_nonprim = 0;

    // define the local variable for feeds_update_request->default_availability
    pinterest_rest_api_product_availability_type__e default_availability_local_nonprim = 0;

    // feeds_update_request->default_currency
    cJSON *default_currency = cJSON_GetObjectItemCaseSensitive(feeds_update_requestJSON, "default_currency");
    if (cJSON_IsNull(default_currency)) {
        default_currency = NULL;
    }
    if (default_currency) { 
    default_currency_local_nonprim = nullable_currency_parseFromJSON(default_currency); //custom
    }

    // feeds_update_request->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(feeds_update_requestJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // feeds_update_request->format
    cJSON *format = cJSON_GetObjectItemCaseSensitive(feeds_update_requestJSON, "format");
    if (cJSON_IsNull(format)) {
        format = NULL;
    }
    if (format) { 
    format_local_nonprim = catalogs_format_parseFromJSON(format); //custom
    }

    // feeds_update_request->credentials
    cJSON *credentials = cJSON_GetObjectItemCaseSensitive(feeds_update_requestJSON, "credentials");
    if (cJSON_IsNull(credentials)) {
        credentials = NULL;
    }
    if (credentials) { 
    credentials_local_nonprim = catalogs_feed_credentials_parseFromJSON(credentials); //nonprimitive
    }

    // feeds_update_request->location
    cJSON *location = cJSON_GetObjectItemCaseSensitive(feeds_update_requestJSON, "location");
    if (cJSON_IsNull(location)) {
        location = NULL;
    }
    if (location) { 
    if(!cJSON_IsString(location) && !cJSON_IsNull(location))
    {
    goto end; //String
    }
    }

    // feeds_update_request->preferred_processing_schedule
    cJSON *preferred_processing_schedule = cJSON_GetObjectItemCaseSensitive(feeds_update_requestJSON, "preferred_processing_schedule");
    if (cJSON_IsNull(preferred_processing_schedule)) {
        preferred_processing_schedule = NULL;
    }
    if (preferred_processing_schedule) { 
    preferred_processing_schedule_local_nonprim = catalogs_feed_processing_schedule_parseFromJSON(preferred_processing_schedule); //nonprimitive
    }

    // feeds_update_request->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(feeds_update_requestJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    status_local_nonprim = catalogs_status_parseFromJSON(status); //custom
    }

    // feeds_update_request->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(feeds_update_requestJSON, "catalog_type");
    if (cJSON_IsNull(catalog_type)) {
        catalog_type = NULL;
    }
    if (!catalog_type) {
        goto end;
    }

    
    catalog_type_local_nonprim = catalogs_type_parseFromJSON(catalog_type); //custom

    // feeds_update_request->default_availability
    cJSON *default_availability = cJSON_GetObjectItemCaseSensitive(feeds_update_requestJSON, "default_availability");
    if (cJSON_IsNull(default_availability)) {
        default_availability = NULL;
    }
    if (default_availability) { 
    default_availability_local_nonprim = product_availability_type_parseFromJSON(default_availability); //custom
    }


    feeds_update_request_local_var = feeds_update_request_create_internal (
        default_currency ? default_currency_local_nonprim : 0,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        format ? format_local_nonprim : 0,
        credentials ? credentials_local_nonprim : NULL,
        location && !cJSON_IsNull(location) ? strdup(location->valuestring) : NULL,
        preferred_processing_schedule ? preferred_processing_schedule_local_nonprim : NULL,
        status ? status_local_nonprim : 0,
        catalog_type_local_nonprim,
        default_availability ? default_availability_local_nonprim : 0
        );

    return feeds_update_request_local_var;
end:
    if (default_currency_local_nonprim) {
        default_currency_local_nonprim = 0;
    }
    if (format_local_nonprim) {
        format_local_nonprim = 0;
    }
    if (credentials_local_nonprim) {
        catalogs_feed_credentials_free(credentials_local_nonprim);
        credentials_local_nonprim = NULL;
    }
    if (preferred_processing_schedule_local_nonprim) {
        catalogs_feed_processing_schedule_free(preferred_processing_schedule_local_nonprim);
        preferred_processing_schedule_local_nonprim = NULL;
    }
    if (status_local_nonprim) {
        status_local_nonprim = 0;
    }
    if (catalog_type_local_nonprim) {
        catalog_type_local_nonprim = 0;
    }
    if (default_availability_local_nonprim) {
        default_availability_local_nonprim = 0;
    }
    return NULL;

}
