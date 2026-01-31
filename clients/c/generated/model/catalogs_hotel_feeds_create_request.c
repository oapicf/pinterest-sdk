#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_hotel_feeds_create_request.h"



static catalogs_hotel_feeds_create_request_t *catalogs_hotel_feeds_create_request_create_internal(
    pinterest_rest_api_nullable_currency__e default_currency,
    char *name,
    pinterest_rest_api_catalogs_format__e format,
    catalogs_feeds_create_request_default_locale_t *default_locale,
    catalogs_feed_credentials_t *credentials,
    char *location,
    catalogs_feed_processing_schedule_t *preferred_processing_schedule,
    pinterest_rest_api_catalogs_type__e catalog_type,
    char *catalog_id,
    catalogs_status_t *status
    ) {
    catalogs_hotel_feeds_create_request_t *catalogs_hotel_feeds_create_request_local_var = malloc(sizeof(catalogs_hotel_feeds_create_request_t));
    if (!catalogs_hotel_feeds_create_request_local_var) {
        return NULL;
    }
    catalogs_hotel_feeds_create_request_local_var->default_currency = default_currency;
    catalogs_hotel_feeds_create_request_local_var->name = name;
    catalogs_hotel_feeds_create_request_local_var->format = format;
    catalogs_hotel_feeds_create_request_local_var->default_locale = default_locale;
    catalogs_hotel_feeds_create_request_local_var->credentials = credentials;
    catalogs_hotel_feeds_create_request_local_var->location = location;
    catalogs_hotel_feeds_create_request_local_var->preferred_processing_schedule = preferred_processing_schedule;
    catalogs_hotel_feeds_create_request_local_var->catalog_type = catalog_type;
    catalogs_hotel_feeds_create_request_local_var->catalog_id = catalog_id;
    catalogs_hotel_feeds_create_request_local_var->status = status;

    catalogs_hotel_feeds_create_request_local_var->_library_owned = 1;
    return catalogs_hotel_feeds_create_request_local_var;
}

__attribute__((deprecated)) catalogs_hotel_feeds_create_request_t *catalogs_hotel_feeds_create_request_create(
    pinterest_rest_api_nullable_currency__e default_currency,
    char *name,
    pinterest_rest_api_catalogs_format__e format,
    catalogs_feeds_create_request_default_locale_t *default_locale,
    catalogs_feed_credentials_t *credentials,
    char *location,
    catalogs_feed_processing_schedule_t *preferred_processing_schedule,
    pinterest_rest_api_catalogs_type__e catalog_type,
    char *catalog_id,
    catalogs_status_t *status
    ) {
    return catalogs_hotel_feeds_create_request_create_internal (
        default_currency,
        name,
        format,
        default_locale,
        credentials,
        location,
        preferred_processing_schedule,
        catalog_type,
        catalog_id,
        status
        );
}

void catalogs_hotel_feeds_create_request_free(catalogs_hotel_feeds_create_request_t *catalogs_hotel_feeds_create_request) {
    if(NULL == catalogs_hotel_feeds_create_request){
        return ;
    }
    if(catalogs_hotel_feeds_create_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_hotel_feeds_create_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_hotel_feeds_create_request->name) {
        free(catalogs_hotel_feeds_create_request->name);
        catalogs_hotel_feeds_create_request->name = NULL;
    }
    if (catalogs_hotel_feeds_create_request->default_locale) {
        catalogs_feeds_create_request_default_locale_free(catalogs_hotel_feeds_create_request->default_locale);
        catalogs_hotel_feeds_create_request->default_locale = NULL;
    }
    if (catalogs_hotel_feeds_create_request->credentials) {
        catalogs_feed_credentials_free(catalogs_hotel_feeds_create_request->credentials);
        catalogs_hotel_feeds_create_request->credentials = NULL;
    }
    if (catalogs_hotel_feeds_create_request->location) {
        free(catalogs_hotel_feeds_create_request->location);
        catalogs_hotel_feeds_create_request->location = NULL;
    }
    if (catalogs_hotel_feeds_create_request->preferred_processing_schedule) {
        catalogs_feed_processing_schedule_free(catalogs_hotel_feeds_create_request->preferred_processing_schedule);
        catalogs_hotel_feeds_create_request->preferred_processing_schedule = NULL;
    }
    if (catalogs_hotel_feeds_create_request->catalog_id) {
        free(catalogs_hotel_feeds_create_request->catalog_id);
        catalogs_hotel_feeds_create_request->catalog_id = NULL;
    }
    if (catalogs_hotel_feeds_create_request->status) {
        catalogs_status_free(catalogs_hotel_feeds_create_request->status);
        catalogs_hotel_feeds_create_request->status = NULL;
    }
    free(catalogs_hotel_feeds_create_request);
}

cJSON *catalogs_hotel_feeds_create_request_convertToJSON(catalogs_hotel_feeds_create_request_t *catalogs_hotel_feeds_create_request) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_hotel_feeds_create_request->default_currency
    if(catalogs_hotel_feeds_create_request->default_currency != pinterest_rest_api_nullable_currency__NULL) {
    cJSON *default_currency_local_JSON = nullable_currency_convertToJSON(catalogs_hotel_feeds_create_request->default_currency);
    if(default_currency_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "default_currency", default_currency_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // catalogs_hotel_feeds_create_request->name
    if (!catalogs_hotel_feeds_create_request->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", catalogs_hotel_feeds_create_request->name) == NULL) {
    goto fail; //String
    }


    // catalogs_hotel_feeds_create_request->format
    if (pinterest_rest_api_catalogs_format__NULL == catalogs_hotel_feeds_create_request->format) {
        goto fail;
    }
    cJSON *format_local_JSON = catalogs_format_convertToJSON(catalogs_hotel_feeds_create_request->format);
    if(format_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "format", format_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_hotel_feeds_create_request->default_locale
    if (!catalogs_hotel_feeds_create_request->default_locale) {
        goto fail;
    }
    cJSON *default_locale_local_JSON = catalogs_feeds_create_request_default_locale_convertToJSON(catalogs_hotel_feeds_create_request->default_locale);
    if(default_locale_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "default_locale", default_locale_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_hotel_feeds_create_request->credentials
    if(catalogs_hotel_feeds_create_request->credentials) {
    cJSON *credentials_local_JSON = catalogs_feed_credentials_convertToJSON(catalogs_hotel_feeds_create_request->credentials);
    if(credentials_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "credentials", credentials_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_hotel_feeds_create_request->location
    if (!catalogs_hotel_feeds_create_request->location) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "location", catalogs_hotel_feeds_create_request->location) == NULL) {
    goto fail; //String
    }


    // catalogs_hotel_feeds_create_request->preferred_processing_schedule
    if(catalogs_hotel_feeds_create_request->preferred_processing_schedule) {
    cJSON *preferred_processing_schedule_local_JSON = catalogs_feed_processing_schedule_convertToJSON(catalogs_hotel_feeds_create_request->preferred_processing_schedule);
    if(preferred_processing_schedule_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "preferred_processing_schedule", preferred_processing_schedule_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_hotel_feeds_create_request->catalog_type
    if (pinterest_rest_api_catalogs_type__NULL == catalogs_hotel_feeds_create_request->catalog_type) {
        goto fail;
    }
    cJSON *catalog_type_local_JSON = catalogs_type_convertToJSON(catalogs_hotel_feeds_create_request->catalog_type);
    if(catalog_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "catalog_type", catalog_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_hotel_feeds_create_request->catalog_id
    if(catalogs_hotel_feeds_create_request->catalog_id) {
    if(cJSON_AddStringToObject(item, "catalog_id", catalogs_hotel_feeds_create_request->catalog_id) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_hotel_feeds_create_request->status
    if(catalogs_hotel_feeds_create_request->status) {
    cJSON *status_local_JSON = catalogs_status_convertToJSON(catalogs_hotel_feeds_create_request->status);
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

catalogs_hotel_feeds_create_request_t *catalogs_hotel_feeds_create_request_parseFromJSON(cJSON *catalogs_hotel_feeds_create_requestJSON){

    catalogs_hotel_feeds_create_request_t *catalogs_hotel_feeds_create_request_local_var = NULL;

    // define the local variable for catalogs_hotel_feeds_create_request->default_currency
    pinterest_rest_api_nullable_currency__e default_currency_local_nonprim = 0;

    // define the local variable for catalogs_hotel_feeds_create_request->format
    pinterest_rest_api_catalogs_format__e format_local_nonprim = 0;

    // define the local variable for catalogs_hotel_feeds_create_request->default_locale
    catalogs_feeds_create_request_default_locale_t *default_locale_local_nonprim = NULL;

    // define the local variable for catalogs_hotel_feeds_create_request->credentials
    catalogs_feed_credentials_t *credentials_local_nonprim = NULL;

    // define the local variable for catalogs_hotel_feeds_create_request->preferred_processing_schedule
    catalogs_feed_processing_schedule_t *preferred_processing_schedule_local_nonprim = NULL;

    // define the local variable for catalogs_hotel_feeds_create_request->catalog_type
    pinterest_rest_api_catalogs_type__e catalog_type_local_nonprim = 0;

    // define the local variable for catalogs_hotel_feeds_create_request->status
    catalogs_status_t *status_local_nonprim = NULL;

    // catalogs_hotel_feeds_create_request->default_currency
    cJSON *default_currency = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_feeds_create_requestJSON, "default_currency");
    if (cJSON_IsNull(default_currency)) {
        default_currency = NULL;
    }
    if (default_currency) { 
    default_currency_local_nonprim = nullable_currency_parseFromJSON(default_currency); //custom
    }

    // catalogs_hotel_feeds_create_request->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_feeds_create_requestJSON, "name");
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

    // catalogs_hotel_feeds_create_request->format
    cJSON *format = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_feeds_create_requestJSON, "format");
    if (cJSON_IsNull(format)) {
        format = NULL;
    }
    if (!format) {
        goto end;
    }

    
    format_local_nonprim = catalogs_format_parseFromJSON(format); //custom

    // catalogs_hotel_feeds_create_request->default_locale
    cJSON *default_locale = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_feeds_create_requestJSON, "default_locale");
    if (cJSON_IsNull(default_locale)) {
        default_locale = NULL;
    }
    if (!default_locale) {
        goto end;
    }

    
    default_locale_local_nonprim = catalogs_feeds_create_request_default_locale_parseFromJSON(default_locale); //nonprimitive

    // catalogs_hotel_feeds_create_request->credentials
    cJSON *credentials = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_feeds_create_requestJSON, "credentials");
    if (cJSON_IsNull(credentials)) {
        credentials = NULL;
    }
    if (credentials) { 
    credentials_local_nonprim = catalogs_feed_credentials_parseFromJSON(credentials); //nonprimitive
    }

    // catalogs_hotel_feeds_create_request->location
    cJSON *location = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_feeds_create_requestJSON, "location");
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

    // catalogs_hotel_feeds_create_request->preferred_processing_schedule
    cJSON *preferred_processing_schedule = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_feeds_create_requestJSON, "preferred_processing_schedule");
    if (cJSON_IsNull(preferred_processing_schedule)) {
        preferred_processing_schedule = NULL;
    }
    if (preferred_processing_schedule) { 
    preferred_processing_schedule_local_nonprim = catalogs_feed_processing_schedule_parseFromJSON(preferred_processing_schedule); //nonprimitive
    }

    // catalogs_hotel_feeds_create_request->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_feeds_create_requestJSON, "catalog_type");
    if (cJSON_IsNull(catalog_type)) {
        catalog_type = NULL;
    }
    if (!catalog_type) {
        goto end;
    }

    
    catalog_type_local_nonprim = catalogs_type_parseFromJSON(catalog_type); //custom

    // catalogs_hotel_feeds_create_request->catalog_id
    cJSON *catalog_id = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_feeds_create_requestJSON, "catalog_id");
    if (cJSON_IsNull(catalog_id)) {
        catalog_id = NULL;
    }
    if (catalog_id) { 
    if(!cJSON_IsString(catalog_id) && !cJSON_IsNull(catalog_id))
    {
    goto end; //String
    }
    }

    // catalogs_hotel_feeds_create_request->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_feeds_create_requestJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    status_local_nonprim = catalogs_status_parseFromJSON(status); //custom
    }


    catalogs_hotel_feeds_create_request_local_var = catalogs_hotel_feeds_create_request_create_internal (
        default_currency ? default_currency_local_nonprim : 0,
        strdup(name->valuestring),
        format_local_nonprim,
        default_locale_local_nonprim,
        credentials ? credentials_local_nonprim : NULL,
        strdup(location->valuestring),
        preferred_processing_schedule ? preferred_processing_schedule_local_nonprim : NULL,
        catalog_type_local_nonprim,
        catalog_id && !cJSON_IsNull(catalog_id) ? strdup(catalog_id->valuestring) : NULL,
        status ? status_local_nonprim : NULL
        );

    return catalogs_hotel_feeds_create_request_local_var;
end:
    if (default_currency_local_nonprim) {
        default_currency_local_nonprim = 0;
    }
    if (format_local_nonprim) {
        format_local_nonprim = 0;
    }
    if (default_locale_local_nonprim) {
        catalogs_feeds_create_request_default_locale_free(default_locale_local_nonprim);
        default_locale_local_nonprim = NULL;
    }
    if (credentials_local_nonprim) {
        catalogs_feed_credentials_free(credentials_local_nonprim);
        credentials_local_nonprim = NULL;
    }
    if (preferred_processing_schedule_local_nonprim) {
        catalogs_feed_processing_schedule_free(preferred_processing_schedule_local_nonprim);
        preferred_processing_schedule_local_nonprim = NULL;
    }
    if (catalog_type_local_nonprim) {
        catalog_type_local_nonprim = 0;
    }
    if (status_local_nonprim) {
        catalogs_status_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    return NULL;

}
