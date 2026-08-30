/*
 * catalogs_local_stores_create_200_response_inner_data_one_of.h
 *
 * 
 */

#ifndef _catalogs_local_stores_create_200_response_inner_data_one_of_H_
#define _catalogs_local_stores_create_200_response_inner_data_one_of_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_local_stores_create_200_response_inner_data_one_of_t catalogs_local_stores_create_200_response_inner_data_one_of_t;

#include "pinterest_lib_error.h"



typedef struct catalogs_local_stores_create_200_response_inner_data_one_of_t {
    char *id; // string
    struct pinterest_lib_error_t *exceptions; //model

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_local_stores_create_200_response_inner_data_one_of_t;

__attribute__((deprecated)) catalogs_local_stores_create_200_response_inner_data_one_of_t *catalogs_local_stores_create_200_response_inner_data_one_of_create(
    char *id,
    pinterest_lib_error_t *exceptions
);

void catalogs_local_stores_create_200_response_inner_data_one_of_free(catalogs_local_stores_create_200_response_inner_data_one_of_t *catalogs_local_stores_create_200_response_inner_data_one_of);

catalogs_local_stores_create_200_response_inner_data_one_of_t *catalogs_local_stores_create_200_response_inner_data_one_of_parseFromJSON(cJSON *catalogs_local_stores_create_200_response_inner_data_one_ofJSON);

cJSON *catalogs_local_stores_create_200_response_inner_data_one_of_convertToJSON(catalogs_local_stores_create_200_response_inner_data_one_of_t *catalogs_local_stores_create_200_response_inner_data_one_of);

#endif /* _catalogs_local_stores_create_200_response_inner_data_one_of_H_ */

