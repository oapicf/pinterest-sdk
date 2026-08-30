/*
 * local_store.h
 *
 * Local store entity
 */

#ifndef _local_store_H_
#define _local_store_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct local_store_t local_store_t;

#include "country.h"



typedef struct local_store_t {
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

    int _library_owned; // Is the library responsible for freeing this object?
} local_store_t;

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
);

void local_store_free(local_store_t *local_store);

local_store_t *local_store_parseFromJSON(cJSON *local_storeJSON);

cJSON *local_store_convertToJSON(local_store_t *local_store);

#endif /* _local_store_H_ */

