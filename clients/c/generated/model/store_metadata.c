#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "store_metadata.h"



static store_metadata_t *store_metadata_create_internal(
    char *geohash,
    double *latitude,
    double *longitude,
    char *store_code,
    char *store_id,
    char *store_name
    ) {
    store_metadata_t *store_metadata_local_var = malloc(sizeof(store_metadata_t));
    if (!store_metadata_local_var) {
        return NULL;
    }
    memset(store_metadata_local_var, 0, sizeof(store_metadata_t));
    store_metadata_local_var->_library_owned = 1;
    store_metadata_local_var->geohash = geohash;
    store_metadata_local_var->latitude = latitude;
    store_metadata_local_var->longitude = longitude;
    store_metadata_local_var->store_code = store_code;
    store_metadata_local_var->store_id = store_id;
    store_metadata_local_var->store_name = store_name;
    return store_metadata_local_var;
}

__attribute__((deprecated)) store_metadata_t *store_metadata_create(
    char *geohash,
    double *latitude,
    double *longitude,
    char *store_code,
    char *store_id,
    char *store_name
    ) {
    double *latitude_copy = NULL;
    if (latitude) {
        latitude_copy = malloc(sizeof(double));
        if (latitude_copy) *latitude_copy = *latitude;
    }
    double *longitude_copy = NULL;
    if (longitude) {
        longitude_copy = malloc(sizeof(double));
        if (longitude_copy) *longitude_copy = *longitude;
    }
    store_metadata_t *result = store_metadata_create_internal (
        geohash,
        latitude_copy,
        longitude_copy,
        store_code,
        store_id,
        store_name
        );
    if (!result) {
        free(latitude_copy);
        free(longitude_copy);
    }
    return result;
}

void store_metadata_free(store_metadata_t *store_metadata) {
    if(NULL == store_metadata){
        return ;
    }
    if(store_metadata->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "store_metadata_free");
        return ;
    }
    listEntry_t *listEntry;
    if (store_metadata->geohash) {
        free(store_metadata->geohash);
        store_metadata->geohash = NULL;
    }
    if (store_metadata->latitude) {
        free(store_metadata->latitude);
        store_metadata->latitude = NULL;
    }
    if (store_metadata->longitude) {
        free(store_metadata->longitude);
        store_metadata->longitude = NULL;
    }
    if (store_metadata->store_code) {
        free(store_metadata->store_code);
        store_metadata->store_code = NULL;
    }
    if (store_metadata->store_id) {
        free(store_metadata->store_id);
        store_metadata->store_id = NULL;
    }
    if (store_metadata->store_name) {
        free(store_metadata->store_name);
        store_metadata->store_name = NULL;
    }
    free(store_metadata);
}

cJSON *store_metadata_convertToJSON(store_metadata_t *store_metadata) {
    cJSON *item = cJSON_CreateObject();

    // store_metadata->geohash
    if(store_metadata->geohash) {
    if(cJSON_AddStringToObject(item, "geohash", store_metadata->geohash) == NULL) {
    goto fail; //String
    }
    }


    // store_metadata->latitude
    if(store_metadata->latitude) {
    if(cJSON_AddNumberToObject(item, "latitude", *store_metadata->latitude) == NULL) {
    goto fail; //Numeric
    }
    }


    // store_metadata->longitude
    if(store_metadata->longitude) {
    if(cJSON_AddNumberToObject(item, "longitude", *store_metadata->longitude) == NULL) {
    goto fail; //Numeric
    }
    }


    // store_metadata->store_code
    if (!store_metadata->store_code) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "store_code", store_metadata->store_code) == NULL) {
    goto fail; //String
    }


    // store_metadata->store_id
    if (!store_metadata->store_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "store_id", store_metadata->store_id) == NULL) {
    goto fail; //String
    }


    // store_metadata->store_name
    if(store_metadata->store_name) {
    if(cJSON_AddStringToObject(item, "store_name", store_metadata->store_name) == NULL) {
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

store_metadata_t *store_metadata_parseFromJSON(cJSON *store_metadataJSON){

    store_metadata_t *store_metadata_local_var = NULL;

    char *geohash_local_str = NULL;

    // define the local variable for store_metadata->latitude
    double *latitude_local_var = NULL;

    // define the local variable for store_metadata->longitude
    double *longitude_local_var = NULL;

    char *store_code_local_str = NULL;

    char *store_id_local_str = NULL;

    char *store_name_local_str = NULL;

    // store_metadata->geohash
    cJSON *geohash = cJSON_GetObjectItemCaseSensitive(store_metadataJSON, "geohash");
    if (cJSON_IsNull(geohash)) {
        geohash = NULL;
    }
    if (geohash) { 
    if(!cJSON_IsString(geohash) && !cJSON_IsNull(geohash))
    {
    goto end; //String
    }
    }

    // store_metadata->latitude
    cJSON *latitude = cJSON_GetObjectItemCaseSensitive(store_metadataJSON, "latitude");
    if (cJSON_IsNull(latitude)) {
        latitude = NULL;
    }
    if (latitude) { 
    if(!cJSON_IsNumber(latitude))
    {
    goto end; //Numeric
    }
    latitude_local_var = malloc(sizeof(double));
    if(!latitude_local_var)
    {
        goto end;
    }
    *latitude_local_var = latitude->valuedouble;
    }

    // store_metadata->longitude
    cJSON *longitude = cJSON_GetObjectItemCaseSensitive(store_metadataJSON, "longitude");
    if (cJSON_IsNull(longitude)) {
        longitude = NULL;
    }
    if (longitude) { 
    if(!cJSON_IsNumber(longitude))
    {
    goto end; //Numeric
    }
    longitude_local_var = malloc(sizeof(double));
    if(!longitude_local_var)
    {
        goto end;
    }
    *longitude_local_var = longitude->valuedouble;
    }

    // store_metadata->store_code
    cJSON *store_code = cJSON_GetObjectItemCaseSensitive(store_metadataJSON, "store_code");
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

    // store_metadata->store_id
    cJSON *store_id = cJSON_GetObjectItemCaseSensitive(store_metadataJSON, "store_id");
    if (cJSON_IsNull(store_id)) {
        store_id = NULL;
    }
    if (!store_id) {
        goto end;
    }

    
    if(!cJSON_IsString(store_id))
    {
    goto end; //String
    }

    // store_metadata->store_name
    cJSON *store_name = cJSON_GetObjectItemCaseSensitive(store_metadataJSON, "store_name");
    if (cJSON_IsNull(store_name)) {
        store_name = NULL;
    }
    if (store_name) { 
    if(!cJSON_IsString(store_name) && !cJSON_IsNull(store_name))
    {
    goto end; //String
    }
    }


    if (geohash && !cJSON_IsNull(geohash)) geohash_local_str = strdup(geohash->valuestring);
    if (store_code && !cJSON_IsNull(store_code)) store_code_local_str = strdup(store_code->valuestring);
    if (store_id && !cJSON_IsNull(store_id)) store_id_local_str = strdup(store_id->valuestring);
    if (store_name && !cJSON_IsNull(store_name)) store_name_local_str = strdup(store_name->valuestring);

    store_metadata_local_var = store_metadata_create_internal (
        geohash_local_str,
        latitude_local_var,
        longitude_local_var,
        store_code_local_str,
        store_id_local_str,
        store_name_local_str
        );

    if (!store_metadata_local_var) {
        goto end;
    }

    return store_metadata_local_var;
end:
    if (geohash_local_str) {
        free(geohash_local_str);
        geohash_local_str = NULL;
    }
    if (latitude_local_var) {
        free(latitude_local_var);
        latitude_local_var = NULL;
    }
    if (longitude_local_var) {
        free(longitude_local_var);
        longitude_local_var = NULL;
    }
    if (store_code_local_str) {
        free(store_code_local_str);
        store_code_local_str = NULL;
    }
    if (store_id_local_str) {
        free(store_id_local_str);
        store_id_local_str = NULL;
    }
    if (store_name_local_str) {
        free(store_name_local_str);
        store_name_local_str = NULL;
    }
    return NULL;

}
