/*
 * local_store_create.h
 *
 * Resource create operation model.
 */

#ifndef _local_store_create_H_
#define _local_store_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct local_store_create_t local_store_create_t;

#include "country.h"



typedef struct local_store_create_t {
    char *address_primary; // string
    char *address_secondary; // string
    char *city; // string
    country_t *country; // custom
    float *latitude; //numeric
    float *longitude; //numeric
    char *name; // string
    char *postal_code; // string
    char *region; // string
    char *store_code; // string

    int _library_owned; // Is the library responsible for freeing this object?
} local_store_create_t;

__attribute__((deprecated)) local_store_create_t *local_store_create_create(
    char *address_primary,
    char *address_secondary,
    char *city,
    country_t *country,
    float *latitude,
    float *longitude,
    char *name,
    char *postal_code,
    char *region,
    char *store_code
);

void local_store_create_free(local_store_create_t *local_store_create);

local_store_create_t *local_store_create_parseFromJSON(cJSON *local_store_createJSON);

cJSON *local_store_create_convertToJSON(local_store_create_t *local_store_create);

#endif /* _local_store_create_H_ */

