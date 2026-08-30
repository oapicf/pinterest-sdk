#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_local_stores_create_200_response_inner_data.h"



static catalogs_local_stores_create_200_response_inner_data_t *catalogs_local_stores_create_200_response_inner_data_create_internal(
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
    char *updated_at,
    pinterest_lib_error_t *exceptions
    ) {
    catalogs_local_stores_create_200_response_inner_data_t *catalogs_local_stores_create_200_response_inner_data_local_var = malloc(sizeof(catalogs_local_stores_create_200_response_inner_data_t));
    if (!catalogs_local_stores_create_200_response_inner_data_local_var) {
        return NULL;
    }
    memset(catalogs_local_stores_create_200_response_inner_data_local_var, 0, sizeof(catalogs_local_stores_create_200_response_inner_data_t));
    catalogs_local_stores_create_200_response_inner_data_local_var->_library_owned = 1;
    catalogs_local_stores_create_200_response_inner_data_local_var->address_primary = address_primary;
    catalogs_local_stores_create_200_response_inner_data_local_var->address_secondary = address_secondary;
    catalogs_local_stores_create_200_response_inner_data_local_var->city = city;
    catalogs_local_stores_create_200_response_inner_data_local_var->country = country;
    catalogs_local_stores_create_200_response_inner_data_local_var->created_at = created_at;
    catalogs_local_stores_create_200_response_inner_data_local_var->id = id;
    catalogs_local_stores_create_200_response_inner_data_local_var->latitude = latitude;
    catalogs_local_stores_create_200_response_inner_data_local_var->longitude = longitude;
    catalogs_local_stores_create_200_response_inner_data_local_var->name = name;
    catalogs_local_stores_create_200_response_inner_data_local_var->postal_code = postal_code;
    catalogs_local_stores_create_200_response_inner_data_local_var->region = region;
    catalogs_local_stores_create_200_response_inner_data_local_var->store_code = store_code;
    catalogs_local_stores_create_200_response_inner_data_local_var->updated_at = updated_at;
    catalogs_local_stores_create_200_response_inner_data_local_var->exceptions = exceptions;
    return catalogs_local_stores_create_200_response_inner_data_local_var;
}

__attribute__((deprecated)) catalogs_local_stores_create_200_response_inner_data_t *catalogs_local_stores_create_200_response_inner_data_create(
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
    char *updated_at,
    pinterest_lib_error_t *exceptions
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
    catalogs_local_stores_create_200_response_inner_data_t *result = catalogs_local_stores_create_200_response_inner_data_create_internal (
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
        updated_at,
        exceptions
        );
    if (!result) {
        free(latitude_copy);
        free(longitude_copy);
    }
    return result;
}

void catalogs_local_stores_create_200_response_inner_data_free(catalogs_local_stores_create_200_response_inner_data_t *catalogs_local_stores_create_200_response_inner_data) {
    if(NULL == catalogs_local_stores_create_200_response_inner_data){
        return ;
    }
    if(catalogs_local_stores_create_200_response_inner_data->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_local_stores_create_200_response_inner_data_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_local_stores_create_200_response_inner_data->address_primary) {
        free(catalogs_local_stores_create_200_response_inner_data->address_primary);
        catalogs_local_stores_create_200_response_inner_data->address_primary = NULL;
    }
    if (catalogs_local_stores_create_200_response_inner_data->address_secondary) {
        free(catalogs_local_stores_create_200_response_inner_data->address_secondary);
        catalogs_local_stores_create_200_response_inner_data->address_secondary = NULL;
    }
    if (catalogs_local_stores_create_200_response_inner_data->city) {
        free(catalogs_local_stores_create_200_response_inner_data->city);
        catalogs_local_stores_create_200_response_inner_data->city = NULL;
    }
    if (catalogs_local_stores_create_200_response_inner_data->country) {
        country_free(catalogs_local_stores_create_200_response_inner_data->country);
        catalogs_local_stores_create_200_response_inner_data->country = NULL;
    }
    if (catalogs_local_stores_create_200_response_inner_data->created_at) {
        free(catalogs_local_stores_create_200_response_inner_data->created_at);
        catalogs_local_stores_create_200_response_inner_data->created_at = NULL;
    }
    if (catalogs_local_stores_create_200_response_inner_data->id) {
        free(catalogs_local_stores_create_200_response_inner_data->id);
        catalogs_local_stores_create_200_response_inner_data->id = NULL;
    }
    if (catalogs_local_stores_create_200_response_inner_data->latitude) {
        free(catalogs_local_stores_create_200_response_inner_data->latitude);
        catalogs_local_stores_create_200_response_inner_data->latitude = NULL;
    }
    if (catalogs_local_stores_create_200_response_inner_data->longitude) {
        free(catalogs_local_stores_create_200_response_inner_data->longitude);
        catalogs_local_stores_create_200_response_inner_data->longitude = NULL;
    }
    if (catalogs_local_stores_create_200_response_inner_data->name) {
        free(catalogs_local_stores_create_200_response_inner_data->name);
        catalogs_local_stores_create_200_response_inner_data->name = NULL;
    }
    if (catalogs_local_stores_create_200_response_inner_data->postal_code) {
        free(catalogs_local_stores_create_200_response_inner_data->postal_code);
        catalogs_local_stores_create_200_response_inner_data->postal_code = NULL;
    }
    if (catalogs_local_stores_create_200_response_inner_data->region) {
        free(catalogs_local_stores_create_200_response_inner_data->region);
        catalogs_local_stores_create_200_response_inner_data->region = NULL;
    }
    if (catalogs_local_stores_create_200_response_inner_data->store_code) {
        free(catalogs_local_stores_create_200_response_inner_data->store_code);
        catalogs_local_stores_create_200_response_inner_data->store_code = NULL;
    }
    if (catalogs_local_stores_create_200_response_inner_data->updated_at) {
        free(catalogs_local_stores_create_200_response_inner_data->updated_at);
        catalogs_local_stores_create_200_response_inner_data->updated_at = NULL;
    }
    if (catalogs_local_stores_create_200_response_inner_data->exceptions) {
        pinterest_lib_error_free(catalogs_local_stores_create_200_response_inner_data->exceptions);
        catalogs_local_stores_create_200_response_inner_data->exceptions = NULL;
    }
    free(catalogs_local_stores_create_200_response_inner_data);
}

cJSON *catalogs_local_stores_create_200_response_inner_data_convertToJSON(catalogs_local_stores_create_200_response_inner_data_t *catalogs_local_stores_create_200_response_inner_data) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_local_stores_create_200_response_inner_data->address_primary
    if(catalogs_local_stores_create_200_response_inner_data->address_primary) {
    if(cJSON_AddStringToObject(item, "address_primary", catalogs_local_stores_create_200_response_inner_data->address_primary) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_local_stores_create_200_response_inner_data->address_secondary
    if(catalogs_local_stores_create_200_response_inner_data->address_secondary) {
    if(cJSON_AddStringToObject(item, "address_secondary", catalogs_local_stores_create_200_response_inner_data->address_secondary) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_local_stores_create_200_response_inner_data->city
    if(catalogs_local_stores_create_200_response_inner_data->city) {
    if(cJSON_AddStringToObject(item, "city", catalogs_local_stores_create_200_response_inner_data->city) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_local_stores_create_200_response_inner_data->country
    if (!catalogs_local_stores_create_200_response_inner_data->country) {
        goto fail;
    }
    cJSON *country_local_JSON = country_convertToJSON(catalogs_local_stores_create_200_response_inner_data->country);
    if(country_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "country", country_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_local_stores_create_200_response_inner_data->created_at
    if (!catalogs_local_stores_create_200_response_inner_data->created_at) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "created_at", catalogs_local_stores_create_200_response_inner_data->created_at) == NULL) {
    goto fail; //Date-Time
    }


    // catalogs_local_stores_create_200_response_inner_data->id
    if (!catalogs_local_stores_create_200_response_inner_data->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", catalogs_local_stores_create_200_response_inner_data->id) == NULL) {
    goto fail; //String
    }


    // catalogs_local_stores_create_200_response_inner_data->latitude
    if(catalogs_local_stores_create_200_response_inner_data->latitude) {
    if(cJSON_AddNumberToObject(item, "latitude", *catalogs_local_stores_create_200_response_inner_data->latitude) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_local_stores_create_200_response_inner_data->longitude
    if(catalogs_local_stores_create_200_response_inner_data->longitude) {
    if(cJSON_AddNumberToObject(item, "longitude", *catalogs_local_stores_create_200_response_inner_data->longitude) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_local_stores_create_200_response_inner_data->name
    if (!catalogs_local_stores_create_200_response_inner_data->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", catalogs_local_stores_create_200_response_inner_data->name) == NULL) {
    goto fail; //String
    }


    // catalogs_local_stores_create_200_response_inner_data->postal_code
    if(catalogs_local_stores_create_200_response_inner_data->postal_code) {
    if(cJSON_AddStringToObject(item, "postal_code", catalogs_local_stores_create_200_response_inner_data->postal_code) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_local_stores_create_200_response_inner_data->region
    if(catalogs_local_stores_create_200_response_inner_data->region) {
    if(cJSON_AddStringToObject(item, "region", catalogs_local_stores_create_200_response_inner_data->region) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_local_stores_create_200_response_inner_data->store_code
    if (!catalogs_local_stores_create_200_response_inner_data->store_code) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "store_code", catalogs_local_stores_create_200_response_inner_data->store_code) == NULL) {
    goto fail; //String
    }


    // catalogs_local_stores_create_200_response_inner_data->updated_at
    if (!catalogs_local_stores_create_200_response_inner_data->updated_at) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "updated_at", catalogs_local_stores_create_200_response_inner_data->updated_at) == NULL) {
    goto fail; //Date-Time
    }


    // catalogs_local_stores_create_200_response_inner_data->exceptions
    if (!catalogs_local_stores_create_200_response_inner_data->exceptions) {
        goto fail;
    }
    cJSON *exceptions_local_JSON = pinterest_lib_error_convertToJSON(catalogs_local_stores_create_200_response_inner_data->exceptions);
    if(exceptions_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "exceptions", exceptions_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_local_stores_create_200_response_inner_data_t *catalogs_local_stores_create_200_response_inner_data_parseFromJSON(cJSON *catalogs_local_stores_create_200_response_inner_dataJSON){

    catalogs_local_stores_create_200_response_inner_data_t *catalogs_local_stores_create_200_response_inner_data_local_var = NULL;

    char *address_primary_local_str = NULL;

    char *address_secondary_local_str = NULL;

    char *city_local_str = NULL;

    // define the local variable for catalogs_local_stores_create_200_response_inner_data->country
    country_t *country_local_nonprim = NULL;

    char *created_at_local_str = NULL;

    char *id_local_str = NULL;

    // define the local variable for catalogs_local_stores_create_200_response_inner_data->latitude
    float *latitude_local_var = NULL;

    // define the local variable for catalogs_local_stores_create_200_response_inner_data->longitude
    float *longitude_local_var = NULL;

    char *name_local_str = NULL;

    char *postal_code_local_str = NULL;

    char *region_local_str = NULL;

    char *store_code_local_str = NULL;

    char *updated_at_local_str = NULL;

    // define the local variable for catalogs_local_stores_create_200_response_inner_data->exceptions
    pinterest_lib_error_t *exceptions_local_nonprim = NULL;

    // catalogs_local_stores_create_200_response_inner_data->address_primary
    cJSON *address_primary = cJSON_GetObjectItemCaseSensitive(catalogs_local_stores_create_200_response_inner_dataJSON, "address_primary");
    if (cJSON_IsNull(address_primary)) {
        address_primary = NULL;
    }
    if (address_primary) { 
    if(!cJSON_IsString(address_primary) && !cJSON_IsNull(address_primary))
    {
    goto end; //String
    }
    }

    // catalogs_local_stores_create_200_response_inner_data->address_secondary
    cJSON *address_secondary = cJSON_GetObjectItemCaseSensitive(catalogs_local_stores_create_200_response_inner_dataJSON, "address_secondary");
    if (cJSON_IsNull(address_secondary)) {
        address_secondary = NULL;
    }
    if (address_secondary) { 
    if(!cJSON_IsString(address_secondary) && !cJSON_IsNull(address_secondary))
    {
    goto end; //String
    }
    }

    // catalogs_local_stores_create_200_response_inner_data->city
    cJSON *city = cJSON_GetObjectItemCaseSensitive(catalogs_local_stores_create_200_response_inner_dataJSON, "city");
    if (cJSON_IsNull(city)) {
        city = NULL;
    }
    if (city) { 
    if(!cJSON_IsString(city) && !cJSON_IsNull(city))
    {
    goto end; //String
    }
    }

    // catalogs_local_stores_create_200_response_inner_data->country
    cJSON *country = cJSON_GetObjectItemCaseSensitive(catalogs_local_stores_create_200_response_inner_dataJSON, "country");
    if (cJSON_IsNull(country)) {
        country = NULL;
    }
    if (!country) {
        goto end;
    }

    
    country_local_nonprim = country_parseFromJSON(country); //custom

    // catalogs_local_stores_create_200_response_inner_data->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(catalogs_local_stores_create_200_response_inner_dataJSON, "created_at");
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

    // catalogs_local_stores_create_200_response_inner_data->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(catalogs_local_stores_create_200_response_inner_dataJSON, "id");
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

    // catalogs_local_stores_create_200_response_inner_data->latitude
    cJSON *latitude = cJSON_GetObjectItemCaseSensitive(catalogs_local_stores_create_200_response_inner_dataJSON, "latitude");
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

    // catalogs_local_stores_create_200_response_inner_data->longitude
    cJSON *longitude = cJSON_GetObjectItemCaseSensitive(catalogs_local_stores_create_200_response_inner_dataJSON, "longitude");
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

    // catalogs_local_stores_create_200_response_inner_data->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(catalogs_local_stores_create_200_response_inner_dataJSON, "name");
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

    // catalogs_local_stores_create_200_response_inner_data->postal_code
    cJSON *postal_code = cJSON_GetObjectItemCaseSensitive(catalogs_local_stores_create_200_response_inner_dataJSON, "postal_code");
    if (cJSON_IsNull(postal_code)) {
        postal_code = NULL;
    }
    if (postal_code) { 
    if(!cJSON_IsString(postal_code) && !cJSON_IsNull(postal_code))
    {
    goto end; //String
    }
    }

    // catalogs_local_stores_create_200_response_inner_data->region
    cJSON *region = cJSON_GetObjectItemCaseSensitive(catalogs_local_stores_create_200_response_inner_dataJSON, "region");
    if (cJSON_IsNull(region)) {
        region = NULL;
    }
    if (region) { 
    if(!cJSON_IsString(region) && !cJSON_IsNull(region))
    {
    goto end; //String
    }
    }

    // catalogs_local_stores_create_200_response_inner_data->store_code
    cJSON *store_code = cJSON_GetObjectItemCaseSensitive(catalogs_local_stores_create_200_response_inner_dataJSON, "store_code");
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

    // catalogs_local_stores_create_200_response_inner_data->updated_at
    cJSON *updated_at = cJSON_GetObjectItemCaseSensitive(catalogs_local_stores_create_200_response_inner_dataJSON, "updated_at");
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

    // catalogs_local_stores_create_200_response_inner_data->exceptions
    cJSON *exceptions = cJSON_GetObjectItemCaseSensitive(catalogs_local_stores_create_200_response_inner_dataJSON, "exceptions");
    if (cJSON_IsNull(exceptions)) {
        exceptions = NULL;
    }
    if (!exceptions) {
        goto end;
    }

    
    exceptions_local_nonprim = pinterest_lib_error_parseFromJSON(exceptions); //nonprimitive


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

    catalogs_local_stores_create_200_response_inner_data_local_var = catalogs_local_stores_create_200_response_inner_data_create_internal (
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
        updated_at_local_str,
        exceptions_local_nonprim
        );

    if (!catalogs_local_stores_create_200_response_inner_data_local_var) {
        goto end;
    }

    return catalogs_local_stores_create_200_response_inner_data_local_var;
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
    if (exceptions_local_nonprim) {
        pinterest_lib_error_free(exceptions_local_nonprim);
        exceptions_local_nonprim = NULL;
    }
    return NULL;

}
