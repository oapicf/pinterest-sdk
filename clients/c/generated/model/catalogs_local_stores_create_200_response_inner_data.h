/*
 * catalogs_local_stores_create_200_response_inner_data.h
 *
 * Created/updated resource on success or error details on failure
 */

#ifndef _catalogs_local_stores_create_200_response_inner_data_H_
#define _catalogs_local_stores_create_200_response_inner_data_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_local_stores_create_200_response_inner_data_t catalogs_local_stores_create_200_response_inner_data_t;

#include "catalogs_local_stores_create_200_response_inner_data_one_of.h"
#include "country.h"
#include "local_store.h"
#include "pinterest_lib_error.h"



typedef struct catalogs_local_stores_create_200_response_inner_data_t {
    char *address_primary; // string
    char *address_secondary; // string
    char *city; // string
    country_t *country; // custom
    char *created_at; //date time
    char *id; // string
    float *latitude; //numeric
    float *longitude; //numeric
    char *name; // string
    char *postal_code; // string
    char *region; // string
    char *store_code; // string
    char *updated_at; //date time
    struct pinterest_lib_error_t *exceptions; //model

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_local_stores_create_200_response_inner_data_t;

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
);

void catalogs_local_stores_create_200_response_inner_data_free(catalogs_local_stores_create_200_response_inner_data_t *catalogs_local_stores_create_200_response_inner_data);

catalogs_local_stores_create_200_response_inner_data_t *catalogs_local_stores_create_200_response_inner_data_parseFromJSON(cJSON *catalogs_local_stores_create_200_response_inner_dataJSON);

cJSON *catalogs_local_stores_create_200_response_inner_data_convertToJSON(catalogs_local_stores_create_200_response_inner_data_t *catalogs_local_stores_create_200_response_inner_data);

#endif /* _catalogs_local_stores_create_200_response_inner_data_H_ */

