/*
 * catalogs_local_stores_create_200_response_inner.h
 *
 * 
 */

#ifndef _catalogs_local_stores_create_200_response_inner_H_
#define _catalogs_local_stores_create_200_response_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_local_stores_create_200_response_inner_t catalogs_local_stores_create_200_response_inner_t;

#include "catalogs_local_stores_create_200_response_inner_data.h"



typedef struct catalogs_local_stores_create_200_response_inner_t {
    struct catalogs_local_stores_create_200_response_inner_data_t *data; //model

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_local_stores_create_200_response_inner_t;

__attribute__((deprecated)) catalogs_local_stores_create_200_response_inner_t *catalogs_local_stores_create_200_response_inner_create(
    catalogs_local_stores_create_200_response_inner_data_t *data
);

void catalogs_local_stores_create_200_response_inner_free(catalogs_local_stores_create_200_response_inner_t *catalogs_local_stores_create_200_response_inner);

catalogs_local_stores_create_200_response_inner_t *catalogs_local_stores_create_200_response_inner_parseFromJSON(cJSON *catalogs_local_stores_create_200_response_innerJSON);

cJSON *catalogs_local_stores_create_200_response_inner_convertToJSON(catalogs_local_stores_create_200_response_inner_t *catalogs_local_stores_create_200_response_inner);

#endif /* _catalogs_local_stores_create_200_response_inner_H_ */

