#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_retail_feeds_update_request.h"


char* catalogs_retail_feeds_update_request_catalog_type_ToString(pinterest_rest_api_catalogs_retail_feeds_update_request_CATALOGTYPE_e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "RETAIL" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_catalogs_retail_feeds_update_request_CATALOGTYPE_e catalogs_retail_feeds_update_request_catalog_type_FromString(char* catalog_type){
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

static catalogs_retail_feeds_update_request_t *catalogs_retail_feeds_update_request_create_internal(
    pinterest_rest_api_catalogs_retail_feeds_update_request_CATALOGTYPE_e catalog_type,
    catalogs_feed_credentials_t *credentials,
    pinterest_rest_api_product_availability_type__e default_availability,
    pinterest_rest_api_nullable_currency__e default_currency,
    pinterest_rest_api_catalogs_format__e format,
    char *location,
    char *name,
    catalogs_feed_processing_schedule_t *preferred_processing_schedule,
    pinterest_rest_api_catalogs_status__e status
    ) {
    catalogs_retail_feeds_update_request_t *catalogs_retail_feeds_update_request_local_var = malloc(sizeof(catalogs_retail_feeds_update_request_t));
    if (!catalogs_retail_feeds_update_request_local_var) {
        return NULL;
    }
    memset(catalogs_retail_feeds_update_request_local_var, 0, sizeof(catalogs_retail_feeds_update_request_t));
    catalogs_retail_feeds_update_request_local_var->_library_owned = 1;
    catalogs_retail_feeds_update_request_local_var->catalog_type = catalog_type;
    catalogs_retail_feeds_update_request_local_var->credentials = credentials;
    catalogs_retail_feeds_update_request_local_var->default_availability = default_availability;
    catalogs_retail_feeds_update_request_local_var->default_currency = default_currency;
    catalogs_retail_feeds_update_request_local_var->format = format;
    catalogs_retail_feeds_update_request_local_var->location = location;
    catalogs_retail_feeds_update_request_local_var->name = name;
    catalogs_retail_feeds_update_request_local_var->preferred_processing_schedule = preferred_processing_schedule;
    catalogs_retail_feeds_update_request_local_var->status = status;
    return catalogs_retail_feeds_update_request_local_var;
}

__attribute__((deprecated)) catalogs_retail_feeds_update_request_t *catalogs_retail_feeds_update_request_create(
    pinterest_rest_api_catalogs_retail_feeds_update_request_CATALOGTYPE_e catalog_type,
    catalogs_feed_credentials_t *credentials,
    pinterest_rest_api_product_availability_type__e default_availability,
    pinterest_rest_api_nullable_currency__e default_currency,
    pinterest_rest_api_catalogs_format__e format,
    char *location,
    char *name,
    catalogs_feed_processing_schedule_t *preferred_processing_schedule,
    pinterest_rest_api_catalogs_status__e status
    ) {
    catalogs_retail_feeds_update_request_t *result = catalogs_retail_feeds_update_request_create_internal (
        catalog_type,
        credentials,
        default_availability,
        default_currency,
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

void catalogs_retail_feeds_update_request_free(catalogs_retail_feeds_update_request_t *catalogs_retail_feeds_update_request) {
    if(NULL == catalogs_retail_feeds_update_request){
        return ;
    }
    if(catalogs_retail_feeds_update_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_retail_feeds_update_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_retail_feeds_update_request->credentials) {
        catalogs_feed_credentials_free(catalogs_retail_feeds_update_request->credentials);
        catalogs_retail_feeds_update_request->credentials = NULL;
    }
    if (catalogs_retail_feeds_update_request->location) {
        free(catalogs_retail_feeds_update_request->location);
        catalogs_retail_feeds_update_request->location = NULL;
    }
    if (catalogs_retail_feeds_update_request->name) {
        free(catalogs_retail_feeds_update_request->name);
        catalogs_retail_feeds_update_request->name = NULL;
    }
    if (catalogs_retail_feeds_update_request->preferred_processing_schedule) {
        catalogs_feed_processing_schedule_free(catalogs_retail_feeds_update_request->preferred_processing_schedule);
        catalogs_retail_feeds_update_request->preferred_processing_schedule = NULL;
    }
    free(catalogs_retail_feeds_update_request);
}

cJSON *catalogs_retail_feeds_update_request_convertToJSON(catalogs_retail_feeds_update_request_t *catalogs_retail_feeds_update_request) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_retail_feeds_update_request->catalog_type
    if (pinterest_rest_api_catalogs_retail_feeds_update_request_CATALOGTYPE_NULL == catalogs_retail_feeds_update_request->catalog_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_type", catalogs_retail_feeds_update_request_catalog_type_ToString(catalogs_retail_feeds_update_request->catalog_type)) == NULL)
    {
    goto fail; //Enum
    }


    // catalogs_retail_feeds_update_request->credentials
    if(catalogs_retail_feeds_update_request->credentials) {
    cJSON *credentials_local_JSON = catalogs_feed_credentials_convertToJSON(catalogs_retail_feeds_update_request->credentials);
    if(credentials_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "credentials", credentials_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_retail_feeds_update_request->default_availability
    if(catalogs_retail_feeds_update_request->default_availability != pinterest_rest_api_product_availability_type__NULL) {
    cJSON *default_availability_local_JSON = product_availability_type_convertToJSON(catalogs_retail_feeds_update_request->default_availability);
    if(default_availability_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "default_availability", default_availability_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // catalogs_retail_feeds_update_request->default_currency
    if(catalogs_retail_feeds_update_request->default_currency != pinterest_rest_api_nullable_currency__NULL) {
    cJSON *default_currency_local_JSON = nullable_currency_convertToJSON(catalogs_retail_feeds_update_request->default_currency);
    if(default_currency_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "default_currency", default_currency_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // catalogs_retail_feeds_update_request->format
    if(catalogs_retail_feeds_update_request->format != pinterest_rest_api_catalogs_format__NULL) {
    cJSON *format_local_JSON = catalogs_format_convertToJSON(catalogs_retail_feeds_update_request->format);
    if(format_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "format", format_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // catalogs_retail_feeds_update_request->location
    if(catalogs_retail_feeds_update_request->location) {
    if(cJSON_AddStringToObject(item, "location", catalogs_retail_feeds_update_request->location) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_retail_feeds_update_request->name
    if(catalogs_retail_feeds_update_request->name) {
    if(cJSON_AddStringToObject(item, "name", catalogs_retail_feeds_update_request->name) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_retail_feeds_update_request->preferred_processing_schedule
    if(catalogs_retail_feeds_update_request->preferred_processing_schedule) {
    cJSON *preferred_processing_schedule_local_JSON = catalogs_feed_processing_schedule_convertToJSON(catalogs_retail_feeds_update_request->preferred_processing_schedule);
    if(preferred_processing_schedule_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "preferred_processing_schedule", preferred_processing_schedule_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_retail_feeds_update_request->status
    if(catalogs_retail_feeds_update_request->status != pinterest_rest_api_catalogs_status__NULL) {
    cJSON *status_local_JSON = catalogs_status_convertToJSON(catalogs_retail_feeds_update_request->status);
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

catalogs_retail_feeds_update_request_t *catalogs_retail_feeds_update_request_parseFromJSON(cJSON *catalogs_retail_feeds_update_requestJSON){

    catalogs_retail_feeds_update_request_t *catalogs_retail_feeds_update_request_local_var = NULL;

    // define the local variable for catalogs_retail_feeds_update_request->credentials
    catalogs_feed_credentials_t *credentials_local_nonprim = NULL;

    // define the local variable for catalogs_retail_feeds_update_request->default_availability
    pinterest_rest_api_product_availability_type__e default_availability_local_nonprim = 0;

    // define the local variable for catalogs_retail_feeds_update_request->default_currency
    pinterest_rest_api_nullable_currency__e default_currency_local_nonprim = 0;

    // define the local variable for catalogs_retail_feeds_update_request->format
    pinterest_rest_api_catalogs_format__e format_local_nonprim = 0;

    char *location_local_str = NULL;

    char *name_local_str = NULL;

    // define the local variable for catalogs_retail_feeds_update_request->preferred_processing_schedule
    catalogs_feed_processing_schedule_t *preferred_processing_schedule_local_nonprim = NULL;

    // define the local variable for catalogs_retail_feeds_update_request->status
    pinterest_rest_api_catalogs_status__e status_local_nonprim = 0;

    // catalogs_retail_feeds_update_request->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_retail_feeds_update_requestJSON, "catalog_type");
    if (cJSON_IsNull(catalog_type)) {
        catalog_type = NULL;
    }
    if (!catalog_type) {
        goto end;
    }

    pinterest_rest_api_catalogs_retail_feeds_update_request_CATALOGTYPE_e catalog_typeVariable;
    
    if(!cJSON_IsString(catalog_type))
    {
    goto end; //Enum
    }
    catalog_typeVariable = catalogs_retail_feeds_update_request_catalog_type_FromString(catalog_type->valuestring);

    // catalogs_retail_feeds_update_request->credentials
    cJSON *credentials = cJSON_GetObjectItemCaseSensitive(catalogs_retail_feeds_update_requestJSON, "credentials");
    if (cJSON_IsNull(credentials)) {
        credentials = NULL;
    }
    if (credentials) { 
    credentials_local_nonprim = catalogs_feed_credentials_parseFromJSON(credentials); //nonprimitive
    }

    // catalogs_retail_feeds_update_request->default_availability
    cJSON *default_availability = cJSON_GetObjectItemCaseSensitive(catalogs_retail_feeds_update_requestJSON, "default_availability");
    if (cJSON_IsNull(default_availability)) {
        default_availability = NULL;
    }
    if (default_availability) { 
    default_availability_local_nonprim = product_availability_type_parseFromJSON(default_availability); //custom
    }

    // catalogs_retail_feeds_update_request->default_currency
    cJSON *default_currency = cJSON_GetObjectItemCaseSensitive(catalogs_retail_feeds_update_requestJSON, "default_currency");
    if (cJSON_IsNull(default_currency)) {
        default_currency = NULL;
    }
    if (default_currency) { 
    default_currency_local_nonprim = nullable_currency_parseFromJSON(default_currency); //custom
    }

    // catalogs_retail_feeds_update_request->format
    cJSON *format = cJSON_GetObjectItemCaseSensitive(catalogs_retail_feeds_update_requestJSON, "format");
    if (cJSON_IsNull(format)) {
        format = NULL;
    }
    if (format) { 
    format_local_nonprim = catalogs_format_parseFromJSON(format); //custom
    }

    // catalogs_retail_feeds_update_request->location
    cJSON *location = cJSON_GetObjectItemCaseSensitive(catalogs_retail_feeds_update_requestJSON, "location");
    if (cJSON_IsNull(location)) {
        location = NULL;
    }
    if (location) { 
    if(!cJSON_IsString(location) && !cJSON_IsNull(location))
    {
    goto end; //String
    }
    }

    // catalogs_retail_feeds_update_request->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(catalogs_retail_feeds_update_requestJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // catalogs_retail_feeds_update_request->preferred_processing_schedule
    cJSON *preferred_processing_schedule = cJSON_GetObjectItemCaseSensitive(catalogs_retail_feeds_update_requestJSON, "preferred_processing_schedule");
    if (cJSON_IsNull(preferred_processing_schedule)) {
        preferred_processing_schedule = NULL;
    }
    if (preferred_processing_schedule) { 
    preferred_processing_schedule_local_nonprim = catalogs_feed_processing_schedule_parseFromJSON(preferred_processing_schedule); //nonprimitive
    }

    // catalogs_retail_feeds_update_request->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(catalogs_retail_feeds_update_requestJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    status_local_nonprim = catalogs_status_parseFromJSON(status); //custom
    }


    if (location && !cJSON_IsNull(location)) location_local_str = strdup(location->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    catalogs_retail_feeds_update_request_local_var = catalogs_retail_feeds_update_request_create_internal (
        catalog_typeVariable,
        credentials ? credentials_local_nonprim : NULL,
        default_availability ? default_availability_local_nonprim : 0,
        default_currency ? default_currency_local_nonprim : 0,
        format ? format_local_nonprim : 0,
        location_local_str,
        name_local_str,
        preferred_processing_schedule ? preferred_processing_schedule_local_nonprim : NULL,
        status ? status_local_nonprim : 0
        );

    if (!catalogs_retail_feeds_update_request_local_var) {
        goto end;
    }

    return catalogs_retail_feeds_update_request_local_var;
end:
    if (credentials_local_nonprim) {
        catalogs_feed_credentials_free(credentials_local_nonprim);
        credentials_local_nonprim = NULL;
    }
    if (default_availability_local_nonprim) {
        default_availability_local_nonprim = 0;
    }
    if (default_currency_local_nonprim) {
        default_currency_local_nonprim = 0;
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
        status_local_nonprim = 0;
    }
    return NULL;

}
