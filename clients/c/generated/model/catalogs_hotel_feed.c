#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_hotel_feed.h"


char* catalogs_hotel_feed_catalog_type_ToString(pinterest_rest_api_catalogs_hotel_feed_CATALOGTYPE_e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "HOTEL" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_catalogs_hotel_feed_CATALOGTYPE_e catalogs_hotel_feed_catalog_type_FromString(char* catalog_type){
    int stringToReturn = 0;
    char *catalog_typeArray[] =  { "NULL", "HOTEL" };
    size_t sizeofArray = sizeof(catalog_typeArray) / sizeof(catalog_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(catalog_type, catalog_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static catalogs_hotel_feed_t *catalogs_hotel_feed_create_internal(
    char *catalog_id,
    pinterest_rest_api_catalogs_hotel_feed_CATALOGTYPE_e catalog_type,
    char *created_at,
    catalogs_feed_credentials_t *credentials,
    pinterest_rest_api_nullable_currency__e default_currency,
    char *default_locale,
    pinterest_rest_api_catalogs_format__e format,
    char *id,
    char *location,
    char *name,
    catalogs_feed_processing_schedule_t *preferred_processing_schedule,
    pinterest_rest_api_catalogs_status__e status,
    char *updated_at
    ) {
    catalogs_hotel_feed_t *catalogs_hotel_feed_local_var = malloc(sizeof(catalogs_hotel_feed_t));
    if (!catalogs_hotel_feed_local_var) {
        return NULL;
    }
    memset(catalogs_hotel_feed_local_var, 0, sizeof(catalogs_hotel_feed_t));
    catalogs_hotel_feed_local_var->_library_owned = 1;
    catalogs_hotel_feed_local_var->catalog_id = catalog_id;
    catalogs_hotel_feed_local_var->catalog_type = catalog_type;
    catalogs_hotel_feed_local_var->created_at = created_at;
    catalogs_hotel_feed_local_var->credentials = credentials;
    catalogs_hotel_feed_local_var->default_currency = default_currency;
    catalogs_hotel_feed_local_var->default_locale = default_locale;
    catalogs_hotel_feed_local_var->format = format;
    catalogs_hotel_feed_local_var->id = id;
    catalogs_hotel_feed_local_var->location = location;
    catalogs_hotel_feed_local_var->name = name;
    catalogs_hotel_feed_local_var->preferred_processing_schedule = preferred_processing_schedule;
    catalogs_hotel_feed_local_var->status = status;
    catalogs_hotel_feed_local_var->updated_at = updated_at;
    return catalogs_hotel_feed_local_var;
}

__attribute__((deprecated)) catalogs_hotel_feed_t *catalogs_hotel_feed_create(
    char *catalog_id,
    pinterest_rest_api_catalogs_hotel_feed_CATALOGTYPE_e catalog_type,
    char *created_at,
    catalogs_feed_credentials_t *credentials,
    pinterest_rest_api_nullable_currency__e default_currency,
    char *default_locale,
    pinterest_rest_api_catalogs_format__e format,
    char *id,
    char *location,
    char *name,
    catalogs_feed_processing_schedule_t *preferred_processing_schedule,
    pinterest_rest_api_catalogs_status__e status,
    char *updated_at
    ) {
    catalogs_hotel_feed_t *result = catalogs_hotel_feed_create_internal (
        catalog_id,
        catalog_type,
        created_at,
        credentials,
        default_currency,
        default_locale,
        format,
        id,
        location,
        name,
        preferred_processing_schedule,
        status,
        updated_at
        );
    if (!result) {
    }
    return result;
}

void catalogs_hotel_feed_free(catalogs_hotel_feed_t *catalogs_hotel_feed) {
    if(NULL == catalogs_hotel_feed){
        return ;
    }
    if(catalogs_hotel_feed->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_hotel_feed_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_hotel_feed->catalog_id) {
        free(catalogs_hotel_feed->catalog_id);
        catalogs_hotel_feed->catalog_id = NULL;
    }
    if (catalogs_hotel_feed->created_at) {
        free(catalogs_hotel_feed->created_at);
        catalogs_hotel_feed->created_at = NULL;
    }
    if (catalogs_hotel_feed->credentials) {
        catalogs_feed_credentials_free(catalogs_hotel_feed->credentials);
        catalogs_hotel_feed->credentials = NULL;
    }
    if (catalogs_hotel_feed->default_locale) {
        free(catalogs_hotel_feed->default_locale);
        catalogs_hotel_feed->default_locale = NULL;
    }
    if (catalogs_hotel_feed->id) {
        free(catalogs_hotel_feed->id);
        catalogs_hotel_feed->id = NULL;
    }
    if (catalogs_hotel_feed->location) {
        free(catalogs_hotel_feed->location);
        catalogs_hotel_feed->location = NULL;
    }
    if (catalogs_hotel_feed->name) {
        free(catalogs_hotel_feed->name);
        catalogs_hotel_feed->name = NULL;
    }
    if (catalogs_hotel_feed->preferred_processing_schedule) {
        catalogs_feed_processing_schedule_free(catalogs_hotel_feed->preferred_processing_schedule);
        catalogs_hotel_feed->preferred_processing_schedule = NULL;
    }
    if (catalogs_hotel_feed->updated_at) {
        free(catalogs_hotel_feed->updated_at);
        catalogs_hotel_feed->updated_at = NULL;
    }
    free(catalogs_hotel_feed);
}

cJSON *catalogs_hotel_feed_convertToJSON(catalogs_hotel_feed_t *catalogs_hotel_feed) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_hotel_feed->catalog_id
    if (!catalogs_hotel_feed->catalog_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_id", catalogs_hotel_feed->catalog_id) == NULL) {
    goto fail; //String
    }


    // catalogs_hotel_feed->catalog_type
    if (pinterest_rest_api_catalogs_hotel_feed_CATALOGTYPE_NULL == catalogs_hotel_feed->catalog_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_type", catalogs_hotel_feed_catalog_type_ToString(catalogs_hotel_feed->catalog_type)) == NULL)
    {
    goto fail; //Enum
    }


    // catalogs_hotel_feed->created_at
    if (!catalogs_hotel_feed->created_at) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "created_at", catalogs_hotel_feed->created_at) == NULL) {
    goto fail; //Date-Time
    }


    // catalogs_hotel_feed->credentials
    if(catalogs_hotel_feed->credentials) {
    cJSON *credentials_local_JSON = catalogs_feed_credentials_convertToJSON(catalogs_hotel_feed->credentials);
    if(credentials_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "credentials", credentials_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_hotel_feed->default_currency
    if(catalogs_hotel_feed->default_currency != pinterest_rest_api_nullable_currency__NULL) {
    cJSON *default_currency_local_JSON = nullable_currency_convertToJSON(catalogs_hotel_feed->default_currency);
    if(default_currency_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "default_currency", default_currency_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // catalogs_hotel_feed->default_locale
    if (!catalogs_hotel_feed->default_locale) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "default_locale", catalogs_hotel_feed->default_locale) == NULL) {
    goto fail; //String
    }


    // catalogs_hotel_feed->format
    if (pinterest_rest_api_catalogs_format__NULL == catalogs_hotel_feed->format) {
        goto fail;
    }
    cJSON *format_local_JSON = catalogs_format_convertToJSON(catalogs_hotel_feed->format);
    if(format_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "format", format_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_hotel_feed->id
    if (!catalogs_hotel_feed->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", catalogs_hotel_feed->id) == NULL) {
    goto fail; //String
    }


    // catalogs_hotel_feed->location
    if (!catalogs_hotel_feed->location) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "location", catalogs_hotel_feed->location) == NULL) {
    goto fail; //String
    }


    // catalogs_hotel_feed->name
    if (!catalogs_hotel_feed->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", catalogs_hotel_feed->name) == NULL) {
    goto fail; //String
    }


    // catalogs_hotel_feed->preferred_processing_schedule
    if(catalogs_hotel_feed->preferred_processing_schedule) {
    cJSON *preferred_processing_schedule_local_JSON = catalogs_feed_processing_schedule_convertToJSON(catalogs_hotel_feed->preferred_processing_schedule);
    if(preferred_processing_schedule_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "preferred_processing_schedule", preferred_processing_schedule_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_hotel_feed->status
    if (pinterest_rest_api_catalogs_status__NULL == catalogs_hotel_feed->status) {
        goto fail;
    }
    cJSON *status_local_JSON = catalogs_status_convertToJSON(catalogs_hotel_feed->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_hotel_feed->updated_at
    if (!catalogs_hotel_feed->updated_at) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "updated_at", catalogs_hotel_feed->updated_at) == NULL) {
    goto fail; //Date-Time
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_hotel_feed_t *catalogs_hotel_feed_parseFromJSON(cJSON *catalogs_hotel_feedJSON){

    catalogs_hotel_feed_t *catalogs_hotel_feed_local_var = NULL;

    char *catalog_id_local_str = NULL;

    char *created_at_local_str = NULL;

    // define the local variable for catalogs_hotel_feed->credentials
    catalogs_feed_credentials_t *credentials_local_nonprim = NULL;

    // define the local variable for catalogs_hotel_feed->default_currency
    pinterest_rest_api_nullable_currency__e default_currency_local_nonprim = 0;

    char *default_locale_local_str = NULL;

    // define the local variable for catalogs_hotel_feed->format
    pinterest_rest_api_catalogs_format__e format_local_nonprim = 0;

    char *id_local_str = NULL;

    char *location_local_str = NULL;

    char *name_local_str = NULL;

    // define the local variable for catalogs_hotel_feed->preferred_processing_schedule
    catalogs_feed_processing_schedule_t *preferred_processing_schedule_local_nonprim = NULL;

    // define the local variable for catalogs_hotel_feed->status
    pinterest_rest_api_catalogs_status__e status_local_nonprim = 0;

    char *updated_at_local_str = NULL;

    // catalogs_hotel_feed->catalog_id
    cJSON *catalog_id = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_feedJSON, "catalog_id");
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

    // catalogs_hotel_feed->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_feedJSON, "catalog_type");
    if (cJSON_IsNull(catalog_type)) {
        catalog_type = NULL;
    }
    if (!catalog_type) {
        goto end;
    }

    pinterest_rest_api_catalogs_hotel_feed_CATALOGTYPE_e catalog_typeVariable;
    
    if(!cJSON_IsString(catalog_type))
    {
    goto end; //Enum
    }
    catalog_typeVariable = catalogs_hotel_feed_catalog_type_FromString(catalog_type->valuestring);

    // catalogs_hotel_feed->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_feedJSON, "created_at");
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

    // catalogs_hotel_feed->credentials
    cJSON *credentials = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_feedJSON, "credentials");
    if (cJSON_IsNull(credentials)) {
        credentials = NULL;
    }
    if (credentials) { 
    credentials_local_nonprim = catalogs_feed_credentials_parseFromJSON(credentials); //nonprimitive
    }

    // catalogs_hotel_feed->default_currency
    cJSON *default_currency = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_feedJSON, "default_currency");
    if (cJSON_IsNull(default_currency)) {
        default_currency = NULL;
    }
    if (default_currency) { 
    default_currency_local_nonprim = nullable_currency_parseFromJSON(default_currency); //custom
    }

    // catalogs_hotel_feed->default_locale
    cJSON *default_locale = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_feedJSON, "default_locale");
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

    // catalogs_hotel_feed->format
    cJSON *format = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_feedJSON, "format");
    if (cJSON_IsNull(format)) {
        format = NULL;
    }
    if (!format) {
        goto end;
    }

    
    format_local_nonprim = catalogs_format_parseFromJSON(format); //custom

    // catalogs_hotel_feed->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_feedJSON, "id");
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

    // catalogs_hotel_feed->location
    cJSON *location = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_feedJSON, "location");
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

    // catalogs_hotel_feed->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_feedJSON, "name");
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

    // catalogs_hotel_feed->preferred_processing_schedule
    cJSON *preferred_processing_schedule = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_feedJSON, "preferred_processing_schedule");
    if (cJSON_IsNull(preferred_processing_schedule)) {
        preferred_processing_schedule = NULL;
    }
    if (preferred_processing_schedule) { 
    preferred_processing_schedule_local_nonprim = catalogs_feed_processing_schedule_parseFromJSON(preferred_processing_schedule); //nonprimitive
    }

    // catalogs_hotel_feed->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_feedJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (!status) {
        goto end;
    }

    
    status_local_nonprim = catalogs_status_parseFromJSON(status); //custom

    // catalogs_hotel_feed->updated_at
    cJSON *updated_at = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_feedJSON, "updated_at");
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


    if (catalog_id && !cJSON_IsNull(catalog_id)) catalog_id_local_str = strdup(catalog_id->valuestring);
    if (created_at && !cJSON_IsNull(created_at)) created_at_local_str = strdup(created_at->valuestring);
    if (default_locale && !cJSON_IsNull(default_locale)) default_locale_local_str = strdup(default_locale->valuestring);
    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (location && !cJSON_IsNull(location)) location_local_str = strdup(location->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);
    if (updated_at && !cJSON_IsNull(updated_at)) updated_at_local_str = strdup(updated_at->valuestring);

    catalogs_hotel_feed_local_var = catalogs_hotel_feed_create_internal (
        catalog_id_local_str,
        catalog_typeVariable,
        created_at_local_str,
        credentials ? credentials_local_nonprim : NULL,
        default_currency ? default_currency_local_nonprim : 0,
        default_locale_local_str,
        format_local_nonprim,
        id_local_str,
        location_local_str,
        name_local_str,
        preferred_processing_schedule ? preferred_processing_schedule_local_nonprim : NULL,
        status_local_nonprim,
        updated_at_local_str
        );

    if (!catalogs_hotel_feed_local_var) {
        goto end;
    }

    return catalogs_hotel_feed_local_var;
end:
    if (catalog_id_local_str) {
        free(catalog_id_local_str);
        catalog_id_local_str = NULL;
    }
    if (created_at_local_str) {
        free(created_at_local_str);
        created_at_local_str = NULL;
    }
    if (credentials_local_nonprim) {
        catalogs_feed_credentials_free(credentials_local_nonprim);
        credentials_local_nonprim = NULL;
    }
    if (default_currency_local_nonprim) {
        default_currency_local_nonprim = 0;
    }
    if (default_locale_local_str) {
        free(default_locale_local_str);
        default_locale_local_str = NULL;
    }
    if (format_local_nonprim) {
        format_local_nonprim = 0;
    }
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
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
    if (updated_at_local_str) {
        free(updated_at_local_str);
        updated_at_local_str = NULL;
    }
    return NULL;

}
