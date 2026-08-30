#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "local_store_batch_update.h"



static local_store_batch_update_t *local_store_batch_update_create_internal(
    char *address_primary,
    char *address_secondary,
    char *city,
    country_t *country,
    char *id,
    float *latitude,
    float *longitude,
    char *name,
    char *postal_code,
    char *region,
    char *store_code
    ) {
    local_store_batch_update_t *local_store_batch_update_local_var = malloc(sizeof(local_store_batch_update_t));
    if (!local_store_batch_update_local_var) {
        return NULL;
    }
    memset(local_store_batch_update_local_var, 0, sizeof(local_store_batch_update_t));
    local_store_batch_update_local_var->_library_owned = 1;
    local_store_batch_update_local_var->address_primary = address_primary;
    local_store_batch_update_local_var->address_secondary = address_secondary;
    local_store_batch_update_local_var->city = city;
    local_store_batch_update_local_var->country = country;
    local_store_batch_update_local_var->id = id;
    local_store_batch_update_local_var->latitude = latitude;
    local_store_batch_update_local_var->longitude = longitude;
    local_store_batch_update_local_var->name = name;
    local_store_batch_update_local_var->postal_code = postal_code;
    local_store_batch_update_local_var->region = region;
    local_store_batch_update_local_var->store_code = store_code;
    return local_store_batch_update_local_var;
}

__attribute__((deprecated)) local_store_batch_update_t *local_store_batch_update_create(
    char *address_primary,
    char *address_secondary,
    char *city,
    country_t *country,
    char *id,
    float *latitude,
    float *longitude,
    char *name,
    char *postal_code,
    char *region,
    char *store_code
    ) {
    float *latitude_copy = NULL;
    if (latitude) {
        latitude_copy = malloc(sizeof(float));
        if (latitude_copy) *latitude_copy = *latitude;
    }
    float *longitude_copy = NULL;
    if (longitude) {
        longitude_copy = malloc(sizeof(float));
        if (longitude_copy) *longitude_copy = *longitude;
    }
    local_store_batch_update_t *result = local_store_batch_update_create_internal (
        address_primary,
        address_secondary,
        city,
        country,
        id,
        latitude_copy,
        longitude_copy,
        name,
        postal_code,
        region,
        store_code
        );
    if (!result) {
        free(latitude_copy);
        free(longitude_copy);
    }
    return result;
}

void local_store_batch_update_free(local_store_batch_update_t *local_store_batch_update) {
    if(NULL == local_store_batch_update){
        return ;
    }
    if(local_store_batch_update->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "local_store_batch_update_free");
        return ;
    }
    listEntry_t *listEntry;
    if (local_store_batch_update->address_primary) {
        free(local_store_batch_update->address_primary);
        local_store_batch_update->address_primary = NULL;
    }
    if (local_store_batch_update->address_secondary) {
        free(local_store_batch_update->address_secondary);
        local_store_batch_update->address_secondary = NULL;
    }
    if (local_store_batch_update->city) {
        free(local_store_batch_update->city);
        local_store_batch_update->city = NULL;
    }
    if (local_store_batch_update->country) {
        country_free(local_store_batch_update->country);
        local_store_batch_update->country = NULL;
    }
    if (local_store_batch_update->id) {
        free(local_store_batch_update->id);
        local_store_batch_update->id = NULL;
    }
    if (local_store_batch_update->latitude) {
        free(local_store_batch_update->latitude);
        local_store_batch_update->latitude = NULL;
    }
    if (local_store_batch_update->longitude) {
        free(local_store_batch_update->longitude);
        local_store_batch_update->longitude = NULL;
    }
    if (local_store_batch_update->name) {
        free(local_store_batch_update->name);
        local_store_batch_update->name = NULL;
    }
    if (local_store_batch_update->postal_code) {
        free(local_store_batch_update->postal_code);
        local_store_batch_update->postal_code = NULL;
    }
    if (local_store_batch_update->region) {
        free(local_store_batch_update->region);
        local_store_batch_update->region = NULL;
    }
    if (local_store_batch_update->store_code) {
        free(local_store_batch_update->store_code);
        local_store_batch_update->store_code = NULL;
    }
    free(local_store_batch_update);
}

cJSON *local_store_batch_update_convertToJSON(local_store_batch_update_t *local_store_batch_update) {
    cJSON *item = cJSON_CreateObject();

    // local_store_batch_update->address_primary
    if(local_store_batch_update->address_primary) {
    if(cJSON_AddStringToObject(item, "address_primary", local_store_batch_update->address_primary) == NULL) {
    goto fail; //String
    }
    }


    // local_store_batch_update->address_secondary
    if(local_store_batch_update->address_secondary) {
    if(cJSON_AddStringToObject(item, "address_secondary", local_store_batch_update->address_secondary) == NULL) {
    goto fail; //String
    }
    }


    // local_store_batch_update->city
    if(local_store_batch_update->city) {
    if(cJSON_AddStringToObject(item, "city", local_store_batch_update->city) == NULL) {
    goto fail; //String
    }
    }


    // local_store_batch_update->country
    if(local_store_batch_update->country) {
    cJSON *country_local_JSON = country_convertToJSON(local_store_batch_update->country);
    if(country_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "country", country_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // local_store_batch_update->id
    if (!local_store_batch_update->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", local_store_batch_update->id) == NULL) {
    goto fail; //String
    }


    // local_store_batch_update->latitude
    if(local_store_batch_update->latitude) {
    if(cJSON_AddNumberToObject(item, "latitude", *local_store_batch_update->latitude) == NULL) {
    goto fail; //Numeric
    }
    }


    // local_store_batch_update->longitude
    if(local_store_batch_update->longitude) {
    if(cJSON_AddNumberToObject(item, "longitude", *local_store_batch_update->longitude) == NULL) {
    goto fail; //Numeric
    }
    }


    // local_store_batch_update->name
    if(local_store_batch_update->name) {
    if(cJSON_AddStringToObject(item, "name", local_store_batch_update->name) == NULL) {
    goto fail; //String
    }
    }


    // local_store_batch_update->postal_code
    if(local_store_batch_update->postal_code) {
    if(cJSON_AddStringToObject(item, "postal_code", local_store_batch_update->postal_code) == NULL) {
    goto fail; //String
    }
    }


    // local_store_batch_update->region
    if(local_store_batch_update->region) {
    if(cJSON_AddStringToObject(item, "region", local_store_batch_update->region) == NULL) {
    goto fail; //String
    }
    }


    // local_store_batch_update->store_code
    if(local_store_batch_update->store_code) {
    if(cJSON_AddStringToObject(item, "store_code", local_store_batch_update->store_code) == NULL) {
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

local_store_batch_update_t *local_store_batch_update_parseFromJSON(cJSON *local_store_batch_updateJSON){

    local_store_batch_update_t *local_store_batch_update_local_var = NULL;

    char *address_primary_local_str = NULL;

    char *address_secondary_local_str = NULL;

    char *city_local_str = NULL;

    // define the local variable for local_store_batch_update->country
    country_t *country_local_nonprim = NULL;

    char *id_local_str = NULL;

    // define the local variable for local_store_batch_update->latitude
    float *latitude_local_var = NULL;

    // define the local variable for local_store_batch_update->longitude
    float *longitude_local_var = NULL;

    char *name_local_str = NULL;

    char *postal_code_local_str = NULL;

    char *region_local_str = NULL;

    char *store_code_local_str = NULL;

    // local_store_batch_update->address_primary
    cJSON *address_primary = cJSON_GetObjectItemCaseSensitive(local_store_batch_updateJSON, "address_primary");
    if (cJSON_IsNull(address_primary)) {
        address_primary = NULL;
    }
    if (address_primary) { 
    if(!cJSON_IsString(address_primary) && !cJSON_IsNull(address_primary))
    {
    goto end; //String
    }
    }

    // local_store_batch_update->address_secondary
    cJSON *address_secondary = cJSON_GetObjectItemCaseSensitive(local_store_batch_updateJSON, "address_secondary");
    if (cJSON_IsNull(address_secondary)) {
        address_secondary = NULL;
    }
    if (address_secondary) { 
    if(!cJSON_IsString(address_secondary) && !cJSON_IsNull(address_secondary))
    {
    goto end; //String
    }
    }

    // local_store_batch_update->city
    cJSON *city = cJSON_GetObjectItemCaseSensitive(local_store_batch_updateJSON, "city");
    if (cJSON_IsNull(city)) {
        city = NULL;
    }
    if (city) { 
    if(!cJSON_IsString(city) && !cJSON_IsNull(city))
    {
    goto end; //String
    }
    }

    // local_store_batch_update->country
    cJSON *country = cJSON_GetObjectItemCaseSensitive(local_store_batch_updateJSON, "country");
    if (cJSON_IsNull(country)) {
        country = NULL;
    }
    if (country) { 
    country_local_nonprim = country_parseFromJSON(country); //custom
    }

    // local_store_batch_update->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(local_store_batch_updateJSON, "id");
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

    // local_store_batch_update->latitude
    cJSON *latitude = cJSON_GetObjectItemCaseSensitive(local_store_batch_updateJSON, "latitude");
    if (cJSON_IsNull(latitude)) {
        latitude = NULL;
    }
    if (latitude) { 
    if(!cJSON_IsNumber(latitude))
    {
    goto end; //Numeric
    }
    latitude_local_var = malloc(sizeof(float));
    if(!latitude_local_var)
    {
        goto end;
    }
    *latitude_local_var = latitude->valuedouble;
    }

    // local_store_batch_update->longitude
    cJSON *longitude = cJSON_GetObjectItemCaseSensitive(local_store_batch_updateJSON, "longitude");
    if (cJSON_IsNull(longitude)) {
        longitude = NULL;
    }
    if (longitude) { 
    if(!cJSON_IsNumber(longitude))
    {
    goto end; //Numeric
    }
    longitude_local_var = malloc(sizeof(float));
    if(!longitude_local_var)
    {
        goto end;
    }
    *longitude_local_var = longitude->valuedouble;
    }

    // local_store_batch_update->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(local_store_batch_updateJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // local_store_batch_update->postal_code
    cJSON *postal_code = cJSON_GetObjectItemCaseSensitive(local_store_batch_updateJSON, "postal_code");
    if (cJSON_IsNull(postal_code)) {
        postal_code = NULL;
    }
    if (postal_code) { 
    if(!cJSON_IsString(postal_code) && !cJSON_IsNull(postal_code))
    {
    goto end; //String
    }
    }

    // local_store_batch_update->region
    cJSON *region = cJSON_GetObjectItemCaseSensitive(local_store_batch_updateJSON, "region");
    if (cJSON_IsNull(region)) {
        region = NULL;
    }
    if (region) { 
    if(!cJSON_IsString(region) && !cJSON_IsNull(region))
    {
    goto end; //String
    }
    }

    // local_store_batch_update->store_code
    cJSON *store_code = cJSON_GetObjectItemCaseSensitive(local_store_batch_updateJSON, "store_code");
    if (cJSON_IsNull(store_code)) {
        store_code = NULL;
    }
    if (store_code) { 
    if(!cJSON_IsString(store_code) && !cJSON_IsNull(store_code))
    {
    goto end; //String
    }
    }


    if (address_primary && !cJSON_IsNull(address_primary)) address_primary_local_str = strdup(address_primary->valuestring);
    if (address_secondary && !cJSON_IsNull(address_secondary)) address_secondary_local_str = strdup(address_secondary->valuestring);
    if (city && !cJSON_IsNull(city)) city_local_str = strdup(city->valuestring);
    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);
    if (postal_code && !cJSON_IsNull(postal_code)) postal_code_local_str = strdup(postal_code->valuestring);
    if (region && !cJSON_IsNull(region)) region_local_str = strdup(region->valuestring);
    if (store_code && !cJSON_IsNull(store_code)) store_code_local_str = strdup(store_code->valuestring);

    local_store_batch_update_local_var = local_store_batch_update_create_internal (
        address_primary_local_str,
        address_secondary_local_str,
        city_local_str,
        country ? country_local_nonprim : NULL,
        id_local_str,
        latitude_local_var,
        longitude_local_var,
        name_local_str,
        postal_code_local_str,
        region_local_str,
        store_code_local_str
        );

    if (!local_store_batch_update_local_var) {
        goto end;
    }

    return local_store_batch_update_local_var;
end:
    if (address_primary_local_str) {
        free(address_primary_local_str);
        address_primary_local_str = NULL;
    }
    if (address_secondary_local_str) {
        free(address_secondary_local_str);
        address_secondary_local_str = NULL;
    }
    if (city_local_str) {
        free(city_local_str);
        city_local_str = NULL;
    }
    if (country_local_nonprim) {
        country_free(country_local_nonprim);
        country_local_nonprim = NULL;
    }
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (latitude_local_var) {
        free(latitude_local_var);
        latitude_local_var = NULL;
    }
    if (longitude_local_var) {
        free(longitude_local_var);
        longitude_local_var = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (postal_code_local_str) {
        free(postal_code_local_str);
        postal_code_local_str = NULL;
    }
    if (region_local_str) {
        free(region_local_str);
        region_local_str = NULL;
    }
    if (store_code_local_str) {
        free(store_code_local_str);
        store_code_local_str = NULL;
    }
    return NULL;

}
