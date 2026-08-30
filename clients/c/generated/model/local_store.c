#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "local_store.h"



static local_store_t *local_store_create_internal(
    char *address_primary,
    char *address_secondary,
    char *city,
    country_t *country,
    char *created_at,
    char *id,
    float *latitude,
    float *longitude,
    char *name,
    char *postal_code,
    char *region,
    char *store_code,
    char *updated_at
    ) {
    local_store_t *local_store_local_var = malloc(sizeof(local_store_t));
    if (!local_store_local_var) {
        return NULL;
    }
    memset(local_store_local_var, 0, sizeof(local_store_t));
    local_store_local_var->_library_owned = 1;
    local_store_local_var->address_primary = address_primary;
    local_store_local_var->address_secondary = address_secondary;
    local_store_local_var->city = city;
    local_store_local_var->country = country;
    local_store_local_var->created_at = created_at;
    local_store_local_var->id = id;
    local_store_local_var->latitude = latitude;
    local_store_local_var->longitude = longitude;
    local_store_local_var->name = name;
    local_store_local_var->postal_code = postal_code;
    local_store_local_var->region = region;
    local_store_local_var->store_code = store_code;
    local_store_local_var->updated_at = updated_at;
    return local_store_local_var;
}

__attribute__((deprecated)) local_store_t *local_store_create(
    char *address_primary,
    char *address_secondary,
    char *city,
    country_t *country,
    char *created_at,
    char *id,
    float *latitude,
    float *longitude,
    char *name,
    char *postal_code,
    char *region,
    char *store_code,
    char *updated_at
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
    local_store_t *result = local_store_create_internal (
        address_primary,
        address_secondary,
        city,
        country,
        created_at,
        id,
        latitude_copy,
        longitude_copy,
        name,
        postal_code,
        region,
        store_code,
        updated_at
        );
    if (!result) {
        free(latitude_copy);
        free(longitude_copy);
    }
    return result;
}

void local_store_free(local_store_t *local_store) {
    if(NULL == local_store){
        return ;
    }
    if(local_store->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "local_store_free");
        return ;
    }
    listEntry_t *listEntry;
    if (local_store->address_primary) {
        free(local_store->address_primary);
        local_store->address_primary = NULL;
    }
    if (local_store->address_secondary) {
        free(local_store->address_secondary);
        local_store->address_secondary = NULL;
    }
    if (local_store->city) {
        free(local_store->city);
        local_store->city = NULL;
    }
    if (local_store->country) {
        country_free(local_store->country);
        local_store->country = NULL;
    }
    if (local_store->created_at) {
        free(local_store->created_at);
        local_store->created_at = NULL;
    }
    if (local_store->id) {
        free(local_store->id);
        local_store->id = NULL;
    }
    if (local_store->latitude) {
        free(local_store->latitude);
        local_store->latitude = NULL;
    }
    if (local_store->longitude) {
        free(local_store->longitude);
        local_store->longitude = NULL;
    }
    if (local_store->name) {
        free(local_store->name);
        local_store->name = NULL;
    }
    if (local_store->postal_code) {
        free(local_store->postal_code);
        local_store->postal_code = NULL;
    }
    if (local_store->region) {
        free(local_store->region);
        local_store->region = NULL;
    }
    if (local_store->store_code) {
        free(local_store->store_code);
        local_store->store_code = NULL;
    }
    if (local_store->updated_at) {
        free(local_store->updated_at);
        local_store->updated_at = NULL;
    }
    free(local_store);
}

cJSON *local_store_convertToJSON(local_store_t *local_store) {
    cJSON *item = cJSON_CreateObject();

    // local_store->address_primary
    if(local_store->address_primary) {
    if(cJSON_AddStringToObject(item, "address_primary", local_store->address_primary) == NULL) {
    goto fail; //String
    }
    }


    // local_store->address_secondary
    if(local_store->address_secondary) {
    if(cJSON_AddStringToObject(item, "address_secondary", local_store->address_secondary) == NULL) {
    goto fail; //String
    }
    }


    // local_store->city
    if(local_store->city) {
    if(cJSON_AddStringToObject(item, "city", local_store->city) == NULL) {
    goto fail; //String
    }
    }


    // local_store->country
    if (!local_store->country) {
        goto fail;
    }
    cJSON *country_local_JSON = country_convertToJSON(local_store->country);
    if(country_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "country", country_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // local_store->created_at
    if (!local_store->created_at) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "created_at", local_store->created_at) == NULL) {
    goto fail; //Date-Time
    }


    // local_store->id
    if (!local_store->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", local_store->id) == NULL) {
    goto fail; //String
    }


    // local_store->latitude
    if(local_store->latitude) {
    if(cJSON_AddNumberToObject(item, "latitude", *local_store->latitude) == NULL) {
    goto fail; //Numeric
    }
    }


    // local_store->longitude
    if(local_store->longitude) {
    if(cJSON_AddNumberToObject(item, "longitude", *local_store->longitude) == NULL) {
    goto fail; //Numeric
    }
    }


    // local_store->name
    if (!local_store->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", local_store->name) == NULL) {
    goto fail; //String
    }


    // local_store->postal_code
    if(local_store->postal_code) {
    if(cJSON_AddStringToObject(item, "postal_code", local_store->postal_code) == NULL) {
    goto fail; //String
    }
    }


    // local_store->region
    if(local_store->region) {
    if(cJSON_AddStringToObject(item, "region", local_store->region) == NULL) {
    goto fail; //String
    }
    }


    // local_store->store_code
    if (!local_store->store_code) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "store_code", local_store->store_code) == NULL) {
    goto fail; //String
    }


    // local_store->updated_at
    if (!local_store->updated_at) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "updated_at", local_store->updated_at) == NULL) {
    goto fail; //Date-Time
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

local_store_t *local_store_parseFromJSON(cJSON *local_storeJSON){

    local_store_t *local_store_local_var = NULL;

    char *address_primary_local_str = NULL;

    char *address_secondary_local_str = NULL;

    char *city_local_str = NULL;

    // define the local variable for local_store->country
    country_t *country_local_nonprim = NULL;

    char *created_at_local_str = NULL;

    char *id_local_str = NULL;

    // define the local variable for local_store->latitude
    float *latitude_local_var = NULL;

    // define the local variable for local_store->longitude
    float *longitude_local_var = NULL;

    char *name_local_str = NULL;

    char *postal_code_local_str = NULL;

    char *region_local_str = NULL;

    char *store_code_local_str = NULL;

    char *updated_at_local_str = NULL;

    // local_store->address_primary
    cJSON *address_primary = cJSON_GetObjectItemCaseSensitive(local_storeJSON, "address_primary");
    if (cJSON_IsNull(address_primary)) {
        address_primary = NULL;
    }
    if (address_primary) { 
    if(!cJSON_IsString(address_primary) && !cJSON_IsNull(address_primary))
    {
    goto end; //String
    }
    }

    // local_store->address_secondary
    cJSON *address_secondary = cJSON_GetObjectItemCaseSensitive(local_storeJSON, "address_secondary");
    if (cJSON_IsNull(address_secondary)) {
        address_secondary = NULL;
    }
    if (address_secondary) { 
    if(!cJSON_IsString(address_secondary) && !cJSON_IsNull(address_secondary))
    {
    goto end; //String
    }
    }

    // local_store->city
    cJSON *city = cJSON_GetObjectItemCaseSensitive(local_storeJSON, "city");
    if (cJSON_IsNull(city)) {
        city = NULL;
    }
    if (city) { 
    if(!cJSON_IsString(city) && !cJSON_IsNull(city))
    {
    goto end; //String
    }
    }

    // local_store->country
    cJSON *country = cJSON_GetObjectItemCaseSensitive(local_storeJSON, "country");
    if (cJSON_IsNull(country)) {
        country = NULL;
    }
    if (!country) {
        goto end;
    }

    
    country_local_nonprim = country_parseFromJSON(country); //custom

    // local_store->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(local_storeJSON, "created_at");
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

    // local_store->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(local_storeJSON, "id");
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

    // local_store->latitude
    cJSON *latitude = cJSON_GetObjectItemCaseSensitive(local_storeJSON, "latitude");
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

    // local_store->longitude
    cJSON *longitude = cJSON_GetObjectItemCaseSensitive(local_storeJSON, "longitude");
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

    // local_store->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(local_storeJSON, "name");
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

    // local_store->postal_code
    cJSON *postal_code = cJSON_GetObjectItemCaseSensitive(local_storeJSON, "postal_code");
    if (cJSON_IsNull(postal_code)) {
        postal_code = NULL;
    }
    if (postal_code) { 
    if(!cJSON_IsString(postal_code) && !cJSON_IsNull(postal_code))
    {
    goto end; //String
    }
    }

    // local_store->region
    cJSON *region = cJSON_GetObjectItemCaseSensitive(local_storeJSON, "region");
    if (cJSON_IsNull(region)) {
        region = NULL;
    }
    if (region) { 
    if(!cJSON_IsString(region) && !cJSON_IsNull(region))
    {
    goto end; //String
    }
    }

    // local_store->store_code
    cJSON *store_code = cJSON_GetObjectItemCaseSensitive(local_storeJSON, "store_code");
    if (cJSON_IsNull(store_code)) {
        store_code = NULL;
    }
    if (!store_code) {
        goto end;
    }

    
    if(!cJSON_IsString(store_code))
    {
    goto end; //String
    }

    // local_store->updated_at
    cJSON *updated_at = cJSON_GetObjectItemCaseSensitive(local_storeJSON, "updated_at");
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


    if (address_primary && !cJSON_IsNull(address_primary)) address_primary_local_str = strdup(address_primary->valuestring);
    if (address_secondary && !cJSON_IsNull(address_secondary)) address_secondary_local_str = strdup(address_secondary->valuestring);
    if (city && !cJSON_IsNull(city)) city_local_str = strdup(city->valuestring);
    if (created_at && !cJSON_IsNull(created_at)) created_at_local_str = strdup(created_at->valuestring);
    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);
    if (postal_code && !cJSON_IsNull(postal_code)) postal_code_local_str = strdup(postal_code->valuestring);
    if (region && !cJSON_IsNull(region)) region_local_str = strdup(region->valuestring);
    if (store_code && !cJSON_IsNull(store_code)) store_code_local_str = strdup(store_code->valuestring);
    if (updated_at && !cJSON_IsNull(updated_at)) updated_at_local_str = strdup(updated_at->valuestring);

    local_store_local_var = local_store_create_internal (
        address_primary_local_str,
        address_secondary_local_str,
        city_local_str,
        country_local_nonprim,
        created_at_local_str,
        id_local_str,
        latitude_local_var,
        longitude_local_var,
        name_local_str,
        postal_code_local_str,
        region_local_str,
        store_code_local_str,
        updated_at_local_str
        );

    if (!local_store_local_var) {
        goto end;
    }

    return local_store_local_var;
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
    if (created_at_local_str) {
        free(created_at_local_str);
        created_at_local_str = NULL;
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
    if (updated_at_local_str) {
        free(updated_at_local_str);
        updated_at_local_str = NULL;
    }
    return NULL;

}
