/*
 * store_metadata.h
 *
 * Store metadata for a specific store location
 */

#ifndef _store_metadata_H_
#define _store_metadata_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct store_metadata_t store_metadata_t;




typedef struct store_metadata_t {
    char *geohash; // string
    double *latitude; //numeric
    double *longitude; //numeric
    char *store_code; // string
    char *store_id; // string
    char *store_name; // string

    int _library_owned; // Is the library responsible for freeing this object?
} store_metadata_t;

__attribute__((deprecated)) store_metadata_t *store_metadata_create(
    char *geohash,
    double *latitude,
    double *longitude,
    char *store_code,
    char *store_id,
    char *store_name
);

void store_metadata_free(store_metadata_t *store_metadata);

store_metadata_t *store_metadata_parseFromJSON(cJSON *store_metadataJSON);

cJSON *store_metadata_convertToJSON(store_metadata_t *store_metadata);

#endif /* _store_metadata_H_ */

