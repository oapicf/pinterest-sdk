#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "local_store_update.h"



static local_store_update_t *local_store_update_create_internal(
    char *address_primary,
    char *address_secondary,
    char *city,
    country_t *country,
    char *id,
    float latitude,
    float longitude,
    char *name,
    char *postal_code,
    char *region,
    char *store_code
    ) {
    local_store_update_t *local_store_update_local_var = malloc(sizeof(local_store_update_t));
    if (!local_store_update_local_var) {
        return NULL;
    }
    local_store_update_local_var->address_primary = address_primary;
    local_store_update_local_var->address_secondary = address_secondary;
    local_store_update_local_var->city = city;
    local_store_update_local_var->country = country;
    local_store_update_local_var->id = id;
    local_store_update_local_var->latitude = latitude;
    local_store_update_local_var->longitude = longitude;
    local_store_update_local_var->name = name;
    local_store_update_local_var->postal_code = postal_code;
    local_store_update_local_var->region = region;
    local_store_update_local_var->store_code = store_code;

    local_store_update_local_var->_library_owned = 1;
    return local_store_update_local_var;
}

__attribute__((deprecated)) local_store_update_t *local_store_update_create(
    char *address_primary,
    char *address_secondary,
    char *city,
    country_t *country,
    char *id,
    float latitude,
    float longitude,
    char *name,
    char *postal_code,
    char *region,
    char *store_code
    ) {
    return local_store_update_create_internal (
        address_primary,
        address_secondary,
        city,
        country,
        id,
        latitude,
        longitude,
        name,
        postal_code,
        region,
        store_code
        );
}

void local_store_update_free(local_store_update_t *local_store_update) {
    if(NULL == local_store_update){
        return ;
    }
    if(local_store_update->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "local_store_update_free");
        return ;
    }
    listEntry_t *listEntry;
    if (local_store_update->address_primary) {
        free(local_store_update->address_primary);
        local_store_update->address_primary = NULL;
    }
    if (local_store_update->address_secondary) {
        free(local_store_update->address_secondary);
        local_store_update->address_secondary = NULL;
    }
    if (local_store_update->city) {
        free(local_store_update->city);
        local_store_update->city = NULL;
    }
    if (local_store_update->country) {
        country_free(local_store_update->country);
        local_store_update->country = NULL;
    }
    if (local_store_update->id) {
        free(local_store_update->id);
        local_store_update->id = NULL;
    }
    if (local_store_update->name) {
        free(local_store_update->name);
        local_store_update->name = NULL;
    }
    if (local_store_update->postal_code) {
        free(local_store_update->postal_code);
        local_store_update->postal_code = NULL;
    }
    if (local_store_update->region) {
        free(local_store_update->region);
        local_store_update->region = NULL;
    }
    if (local_store_update->store_code) {
        free(local_store_update->store_code);
        local_store_update->store_code = NULL;
    }
    free(local_store_update);
}

cJSON *local_store_update_convertToJSON(local_store_update_t *local_store_update) {
    cJSON *item = cJSON_CreateObject();

    // local_store_update->address_primary
    if(local_store_update->address_primary) {
    if(cJSON_AddStringToObject(item, "address_primary", local_store_update->address_primary) == NULL) {
    goto fail; //String
    }
    }


    // local_store_update->address_secondary
    if(local_store_update->address_secondary) {
    if(cJSON_AddStringToObject(item, "address_secondary", local_store_update->address_secondary) == NULL) {
    goto fail; //String
    }
    }


    // local_store_update->city
    if(local_store_update->city) {
    if(cJSON_AddStringToObject(item, "city", local_store_update->city) == NULL) {
    goto fail; //String
    }
    }


    // local_store_update->country
    if(local_store_update->country) {
    cJSON *country_local_JSON = country_convertToJSON(local_store_update->country);
    if(country_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "country", country_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // local_store_update->id
    if (!local_store_update->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", local_store_update->id) == NULL) {
    goto fail; //String
    }


    // local_store_update->latitude
    if(local_store_update->latitude) {
    if(cJSON_AddNumberToObject(item, "latitude", local_store_update->latitude) == NULL) {
    goto fail; //Numeric
    }
    }


    // local_store_update->longitude
    if(local_store_update->longitude) {
    if(cJSON_AddNumberToObject(item, "longitude", local_store_update->longitude) == NULL) {
    goto fail; //Numeric
    }
    }


    // local_store_update->name
    if(local_store_update->name) {
    if(cJSON_AddStringToObject(item, "name", local_store_update->name) == NULL) {
    goto fail; //String
    }
    }


    // local_store_update->postal_code
    if(local_store_update->postal_code) {
    if(cJSON_AddStringToObject(item, "postal_code", local_store_update->postal_code) == NULL) {
    goto fail; //String
    }
    }


    // local_store_update->region
    if(local_store_update->region) {
    if(cJSON_AddStringToObject(item, "region", local_store_update->region) == NULL) {
    goto fail; //String
    }
    }


    // local_store_update->store_code
    if(local_store_update->store_code) {
    if(cJSON_AddStringToObject(item, "store_code", local_store_update->store_code) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

local_store_update_t *local_store_update_parseFromJSON(cJSON *local_store_updateJSON){

    local_store_update_t *local_store_update_local_var = NULL;

    // define the local variable for local_store_update->country
    country_t *country_local_nonprim = NULL;

    // local_store_update->address_primary
    cJSON *address_primary = cJSON_GetObjectItemCaseSensitive(local_store_updateJSON, "address_primary");
    if (cJSON_IsNull(address_primary)) {
        address_primary = NULL;
    }
    if (address_primary) { 
    if(!cJSON_IsString(address_primary) && !cJSON_IsNull(address_primary))
    {
    goto end; //String
    }
    }

    // local_store_update->address_secondary
    cJSON *address_secondary = cJSON_GetObjectItemCaseSensitive(local_store_updateJSON, "address_secondary");
    if (cJSON_IsNull(address_secondary)) {
        address_secondary = NULL;
    }
    if (address_secondary) { 
    if(!cJSON_IsString(address_secondary) && !cJSON_IsNull(address_secondary))
    {
    goto end; //String
    }
    }

    // local_store_update->city
    cJSON *city = cJSON_GetObjectItemCaseSensitive(local_store_updateJSON, "city");
    if (cJSON_IsNull(city)) {
        city = NULL;
    }
    if (city) { 
    if(!cJSON_IsString(city) && !cJSON_IsNull(city))
    {
    goto end; //String
    }
    }

    // local_store_update->country
    cJSON *country = cJSON_GetObjectItemCaseSensitive(local_store_updateJSON, "country");
    if (cJSON_IsNull(country)) {
        country = NULL;
    }
    if (country) { 
    country_local_nonprim = country_parseFromJSON(country); //custom
    }

    // local_store_update->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(local_store_updateJSON, "id");
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

    // local_store_update->latitude
    cJSON *latitude = cJSON_GetObjectItemCaseSensitive(local_store_updateJSON, "latitude");
    if (cJSON_IsNull(latitude)) {
        latitude = NULL;
    }
    if (latitude) { 
    if(!cJSON_IsNumber(latitude))
    {
    goto end; //Numeric
    }
    }

    // local_store_update->longitude
    cJSON *longitude = cJSON_GetObjectItemCaseSensitive(local_store_updateJSON, "longitude");
    if (cJSON_IsNull(longitude)) {
        longitude = NULL;
    }
    if (longitude) { 
    if(!cJSON_IsNumber(longitude))
    {
    goto end; //Numeric
    }
    }

    // local_store_update->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(local_store_updateJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // local_store_update->postal_code
    cJSON *postal_code = cJSON_GetObjectItemCaseSensitive(local_store_updateJSON, "postal_code");
    if (cJSON_IsNull(postal_code)) {
        postal_code = NULL;
    }
    if (postal_code) { 
    if(!cJSON_IsString(postal_code) && !cJSON_IsNull(postal_code))
    {
    goto end; //String
    }
    }

    // local_store_update->region
    cJSON *region = cJSON_GetObjectItemCaseSensitive(local_store_updateJSON, "region");
    if (cJSON_IsNull(region)) {
        region = NULL;
    }
    if (region) { 
    if(!cJSON_IsString(region) && !cJSON_IsNull(region))
    {
    goto end; //String
    }
    }

    // local_store_update->store_code
    cJSON *store_code = cJSON_GetObjectItemCaseSensitive(local_store_updateJSON, "store_code");
    if (cJSON_IsNull(store_code)) {
        store_code = NULL;
    }
    if (store_code) { 
    if(!cJSON_IsString(store_code) && !cJSON_IsNull(store_code))
    {
    goto end; //String
    }
    }


    local_store_update_local_var = local_store_update_create_internal (
        address_primary && !cJSON_IsNull(address_primary) ? strdup(address_primary->valuestring) : NULL,
        address_secondary && !cJSON_IsNull(address_secondary) ? strdup(address_secondary->valuestring) : NULL,
        city && !cJSON_IsNull(city) ? strdup(city->valuestring) : NULL,
        country ? country_local_nonprim : NULL,
        strdup(id->valuestring),
        latitude ? latitude->valuedouble : 0,
        longitude ? longitude->valuedouble : 0,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        postal_code && !cJSON_IsNull(postal_code) ? strdup(postal_code->valuestring) : NULL,
        region && !cJSON_IsNull(region) ? strdup(region->valuestring) : NULL,
        store_code && !cJSON_IsNull(store_code) ? strdup(store_code->valuestring) : NULL
        );

    return local_store_update_local_var;
end:
    if (country_local_nonprim) {
        country_free(country_local_nonprim);
        country_local_nonprim = NULL;
    }
    return NULL;

}
