/*
 * catalogs_local_stores_list_200_response.h
 *
 * 
 */

#ifndef _catalogs_local_stores_list_200_response_H_
#define _catalogs_local_stores_list_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_local_stores_list_200_response_t catalogs_local_stores_list_200_response_t;

#include "local_store.h"



typedef struct catalogs_local_stores_list_200_response_t {
    char *bookmark; // string
    list_t *items; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_local_stores_list_200_response_t;

__attribute__((deprecated)) catalogs_local_stores_list_200_response_t *catalogs_local_stores_list_200_response_create(
    char *bookmark,
    list_t *items
);

void catalogs_local_stores_list_200_response_free(catalogs_local_stores_list_200_response_t *catalogs_local_stores_list_200_response);

catalogs_local_stores_list_200_response_t *catalogs_local_stores_list_200_response_parseFromJSON(cJSON *catalogs_local_stores_list_200_responseJSON);

cJSON *catalogs_local_stores_list_200_response_convertToJSON(catalogs_local_stores_list_200_response_t *catalogs_local_stores_list_200_response);

#endif /* _catalogs_local_stores_list_200_response_H_ */

