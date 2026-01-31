#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_feed.h"



static catalogs_feed_t *catalogs_feed_create_internal(
    char *created_at,
    char *id,
    char *updated_at,
    pinterest_rest_api_catalogs_type__e catalog_type,
    catalogs_feed_credentials_t *credentials,
    pinterest_rest_api_product_availability_type__e default_availability,
    pinterest_rest_api_country__e default_country,
    pinterest_rest_api_nullable_currency__e default_currency,
    char *default_locale,
    pinterest_rest_api_catalogs_format__e format,
    char *location,
    char *name,
    catalogs_feed_processing_schedule_t *preferred_processing_schedule,
    pinterest_rest_api_catalogs_status__e status,
    char *catalog_id
    ) {
    catalogs_feed_t *catalogs_feed_local_var = malloc(sizeof(catalogs_feed_t));
    if (!catalogs_feed_local_var) {
        return NULL;
    }
    catalogs_feed_local_var->created_at = created_at;
    catalogs_feed_local_var->id = id;
    catalogs_feed_local_var->updated_at = updated_at;
    catalogs_feed_local_var->catalog_type = catalog_type;
    catalogs_feed_local_var->credentials = credentials;
    catalogs_feed_local_var->default_availability = default_availability;
    catalogs_feed_local_var->default_country = default_country;
    catalogs_feed_local_var->default_currency = default_currency;
    catalogs_feed_local_var->default_locale = default_locale;
    catalogs_feed_local_var->format = format;
    catalogs_feed_local_var->location = location;
    catalogs_feed_local_var->name = name;
    catalogs_feed_local_var->preferred_processing_schedule = preferred_processing_schedule;
    catalogs_feed_local_var->status = status;
    catalogs_feed_local_var->catalog_id = catalog_id;

    catalogs_feed_local_var->_library_owned = 1;
    return catalogs_feed_local_var;
}

__attribute__((deprecated)) catalogs_feed_t *catalogs_feed_create(
    char *created_at,
    char *id,
    char *updated_at,
    pinterest_rest_api_catalogs_type__e catalog_type,
    catalogs_feed_credentials_t *credentials,
    pinterest_rest_api_product_availability_type__e default_availability,
    pinterest_rest_api_country__e default_country,
    pinterest_rest_api_nullable_currency__e default_currency,
    char *default_locale,
    pinterest_rest_api_catalogs_format__e format,
    char *location,
    char *name,
    catalogs_feed_processing_schedule_t *preferred_processing_schedule,
    pinterest_rest_api_catalogs_status__e status,
    char *catalog_id
    ) {
    return catalogs_feed_create_internal (
        created_at,
        id,
        updated_at,
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
        status,
        catalog_id
        );
}

void catalogs_feed_free(catalogs_feed_t *catalogs_feed) {
    if(NULL == catalogs_feed){
        return ;
    }
    if(catalogs_feed->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_feed_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_feed->created_at) {
        free(catalogs_feed->created_at);
        catalogs_feed->created_at = NULL;
    }
    if (catalogs_feed->id) {
        free(catalogs_feed->id);
        catalogs_feed->id = NULL;
    }
    if (catalogs_feed->updated_at) {
        free(catalogs_feed->updated_at);
        catalogs_feed->updated_at = NULL;
    }
    if (catalogs_feed->credentials) {
        catalogs_feed_credentials_free(catalogs_feed->credentials);
        catalogs_feed->credentials = NULL;
    }
    if (catalogs_feed->default_locale) {
        free(catalogs_feed->default_locale);
        catalogs_feed->default_locale = NULL;
    }
    if (catalogs_feed->location) {
        free(catalogs_feed->location);
        catalogs_feed->location = NULL;
    }
    if (catalogs_feed->name) {
        free(catalogs_feed->name);
        catalogs_feed->name = NULL;
    }
    if (catalogs_feed->preferred_processing_schedule) {
        catalogs_feed_processing_schedule_free(catalogs_feed->preferred_processing_schedule);
        catalogs_feed->preferred_processing_schedule = NULL;
    }
    if (catalogs_feed->catalog_id) {
        free(catalogs_feed->catalog_id);
        catalogs_feed->catalog_id = NULL;
    }
    free(catalogs_feed);
}

cJSON *catalogs_feed_convertToJSON(catalogs_feed_t *catalogs_feed) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_feed->created_at
    if (!catalogs_feed->created_at) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "created_at", catalogs_feed->created_at) == NULL) {
    goto fail; //Date-Time
    }


    // catalogs_feed->id
    if (!catalogs_feed->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", catalogs_feed->id) == NULL) {
    goto fail; //String
    }


    // catalogs_feed->updated_at
    if (!catalogs_feed->updated_at) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "updated_at", catalogs_feed->updated_at) == NULL) {
    goto fail; //Date-Time
    }


    // catalogs_feed->catalog_type
    if (pinterest_rest_api_catalogs_type__NULL == catalogs_feed->catalog_type) {
        goto fail;
    }
    cJSON *catalog_type_local_JSON = catalogs_type_convertToJSON(catalogs_feed->catalog_type);
    if(catalog_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "catalog_type", catalog_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_feed->credentials
    if (!catalogs_feed->credentials) {
        goto fail;
    }
    cJSON *credentials_local_JSON = catalogs_feed_credentials_convertToJSON(catalogs_feed->credentials);
    if(credentials_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "credentials", credentials_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_feed->default_availability
    if (pinterest_rest_api_product_availability_type__NULL == catalogs_feed->default_availability) {
        goto fail;
    }
    cJSON *default_availability_local_JSON = product_availability_type_convertToJSON(catalogs_feed->default_availability);
    if(default_availability_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "default_availability", default_availability_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_feed->default_country
    if (pinterest_rest_api_country__NULL == catalogs_feed->default_country) {
        goto fail;
    }
    cJSON *default_country_local_JSON = country_convertToJSON(catalogs_feed->default_country);
    if(default_country_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "default_country", default_country_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_feed->default_currency
    if (pinterest_rest_api_nullable_currency__NULL == catalogs_feed->default_currency) {
        goto fail;
    }
    cJSON *default_currency_local_JSON = nullable_currency_convertToJSON(catalogs_feed->default_currency);
    if(default_currency_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "default_currency", default_currency_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_feed->default_locale
    if (!catalogs_feed->default_locale) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "default_locale", catalogs_feed->default_locale) == NULL) {
    goto fail; //String
    }


    // catalogs_feed->format
    if (pinterest_rest_api_catalogs_format__NULL == catalogs_feed->format) {
        goto fail;
    }
    cJSON *format_local_JSON = catalogs_format_convertToJSON(catalogs_feed->format);
    if(format_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "format", format_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_feed->location
    if (!catalogs_feed->location) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "location", catalogs_feed->location) == NULL) {
    goto fail; //String
    }


    // catalogs_feed->name
    if (!catalogs_feed->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", catalogs_feed->name) == NULL) {
    goto fail; //String
    }


    // catalogs_feed->preferred_processing_schedule
    if (!catalogs_feed->preferred_processing_schedule) {
        goto fail;
    }
    cJSON *preferred_processing_schedule_local_JSON = catalogs_feed_processing_schedule_convertToJSON(catalogs_feed->preferred_processing_schedule);
    if(preferred_processing_schedule_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "preferred_processing_schedule", preferred_processing_schedule_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_feed->status
    if (pinterest_rest_api_catalogs_status__NULL == catalogs_feed->status) {
        goto fail;
    }
    cJSON *status_local_JSON = catalogs_status_convertToJSON(catalogs_feed->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_feed->catalog_id
    if (!catalogs_feed->catalog_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_id", catalogs_feed->catalog_id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_feed_t *catalogs_feed_parseFromJSON(cJSON *catalogs_feedJSON){

    catalogs_feed_t *catalogs_feed_local_var = NULL;

    // define the local variable for catalogs_feed->catalog_type
    pinterest_rest_api_catalogs_type__e catalog_type_local_nonprim = 0;

    // define the local variable for catalogs_feed->credentials
    catalogs_feed_credentials_t *credentials_local_nonprim = NULL;

    // define the local variable for catalogs_feed->default_availability
    pinterest_rest_api_product_availability_type__e default_availability_local_nonprim = 0;

    // define the local variable for catalogs_feed->default_country
    pinterest_rest_api_country__e default_country_local_nonprim = 0;

    // define the local variable for catalogs_feed->default_currency
    pinterest_rest_api_nullable_currency__e default_currency_local_nonprim = 0;

    // define the local variable for catalogs_feed->format
    pinterest_rest_api_catalogs_format__e format_local_nonprim = 0;

    // define the local variable for catalogs_feed->preferred_processing_schedule
    catalogs_feed_processing_schedule_t *preferred_processing_schedule_local_nonprim = NULL;

    // define the local variable for catalogs_feed->status
    pinterest_rest_api_catalogs_status__e status_local_nonprim = 0;

    // catalogs_feed->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(catalogs_feedJSON, "created_at");
    if (cJSON_IsNull(created_at)) {
        created_at = NULL;
    }
    if (!created_at) {
        goto end;
    }

    
    if(!cJSON_IsString(created_at) && !cJSON_IsNull(created_at))
    {
    goto end; //DateTime
    }

    // catalogs_feed->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(catalogs_feedJSON, "id");
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

    // catalogs_feed->updated_at
    cJSON *updated_at = cJSON_GetObjectItemCaseSensitive(catalogs_feedJSON, "updated_at");
    if (cJSON_IsNull(updated_at)) {
        updated_at = NULL;
    }
    if (!updated_at) {
        goto end;
    }

    
    if(!cJSON_IsString(updated_at) && !cJSON_IsNull(updated_at))
    {
    goto end; //DateTime
    }

    // catalogs_feed->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_feedJSON, "catalog_type");
    if (cJSON_IsNull(catalog_type)) {
        catalog_type = NULL;
    }
    if (!catalog_type) {
        goto end;
    }

    
    catalog_type_local_nonprim = catalogs_type_parseFromJSON(catalog_type); //custom

    // catalogs_feed->credentials
    cJSON *credentials = cJSON_GetObjectItemCaseSensitive(catalogs_feedJSON, "credentials");
    if (cJSON_IsNull(credentials)) {
        credentials = NULL;
    }
    if (!credentials) {
        goto end;
    }

    
    credentials_local_nonprim = catalogs_feed_credentials_parseFromJSON(credentials); //nonprimitive

    // catalogs_feed->default_availability
    cJSON *default_availability = cJSON_GetObjectItemCaseSensitive(catalogs_feedJSON, "default_availability");
    if (cJSON_IsNull(default_availability)) {
        default_availability = NULL;
    }
    if (!default_availability) {
        goto end;
    }

    
    default_availability_local_nonprim = product_availability_type_parseFromJSON(default_availability); //custom

    // catalogs_feed->default_country
    cJSON *default_country = cJSON_GetObjectItemCaseSensitive(catalogs_feedJSON, "default_country");
    if (cJSON_IsNull(default_country)) {
        default_country = NULL;
    }
    if (!default_country) {
        goto end;
    }

    
    default_country_local_nonprim = country_parseFromJSON(default_country); //custom

    // catalogs_feed->default_currency
    cJSON *default_currency = cJSON_GetObjectItemCaseSensitive(catalogs_feedJSON, "default_currency");
    if (cJSON_IsNull(default_currency)) {
        default_currency = NULL;
    }
    if (!default_currency) {
        goto end;
    }

    
    default_currency_local_nonprim = nullable_currency_parseFromJSON(default_currency); //custom

    // catalogs_feed->default_locale
    cJSON *default_locale = cJSON_GetObjectItemCaseSensitive(catalogs_feedJSON, "default_locale");
    if (cJSON_IsNull(default_locale)) {
        default_locale = NULL;
    }
    if (!default_locale) {
        goto end;
    }

    
    if(!cJSON_IsString(default_locale))
    {
    goto end; //String
    }

    // catalogs_feed->format
    cJSON *format = cJSON_GetObjectItemCaseSensitive(catalogs_feedJSON, "format");
    if (cJSON_IsNull(format)) {
        format = NULL;
    }
    if (!format) {
        goto end;
    }

    
    format_local_nonprim = catalogs_format_parseFromJSON(format); //custom

    // catalogs_feed->location
    cJSON *location = cJSON_GetObjectItemCaseSensitive(catalogs_feedJSON, "location");
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

    // catalogs_feed->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(catalogs_feedJSON, "name");
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

    // catalogs_feed->preferred_processing_schedule
    cJSON *preferred_processing_schedule = cJSON_GetObjectItemCaseSensitive(catalogs_feedJSON, "preferred_processing_schedule");
    if (cJSON_IsNull(preferred_processing_schedule)) {
        preferred_processing_schedule = NULL;
    }
    if (!preferred_processing_schedule) {
        goto end;
    }

    
    preferred_processing_schedule_local_nonprim = catalogs_feed_processing_schedule_parseFromJSON(preferred_processing_schedule); //nonprimitive

    // catalogs_feed->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(catalogs_feedJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (!status) {
        goto end;
    }

    
    status_local_nonprim = catalogs_status_parseFromJSON(status); //custom

    // catalogs_feed->catalog_id
    cJSON *catalog_id = cJSON_GetObjectItemCaseSensitive(catalogs_feedJSON, "catalog_id");
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


    catalogs_feed_local_var = catalogs_feed_create_internal (
        strdup(created_at->valuestring),
        strdup(id->valuestring),
        strdup(updated_at->valuestring),
        catalog_type_local_nonprim,
        credentials_local_nonprim,
        default_availability_local_nonprim,
        default_country_local_nonprim,
        default_currency_local_nonprim,
        strdup(default_locale->valuestring),
        format_local_nonprim,
        strdup(location->valuestring),
        strdup(name->valuestring),
        preferred_processing_schedule_local_nonprim,
        status_local_nonprim,
        strdup(catalog_id->valuestring)
        );

    return catalogs_feed_local_var;
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
    if (format_local_nonprim) {
        format_local_nonprim = 0;
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
