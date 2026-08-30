/*
 * catalogs_base_filters_any_of.h
 *
 * 
 */

#ifndef _catalogs_base_filters_any_of_H_
#define _catalogs_base_filters_any_of_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_base_filters_any_of_t catalogs_base_filters_any_of_t;

#include "catalogs_base_filter_keys.h"



typedef struct catalogs_base_filters_any_of_t {
    list_t *any_of; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_base_filters_any_of_t;

__attribute__((deprecated)) catalogs_base_filters_any_of_t *catalogs_base_filters_any_of_create(
    list_t *any_of
);

void catalogs_base_filters_any_of_free(catalogs_base_filters_any_of_t *catalogs_base_filters_any_of);

catalogs_base_filters_any_of_t *catalogs_base_filters_any_of_parseFromJSON(cJSON *catalogs_base_filters_any_ofJSON);

cJSON *catalogs_base_filters_any_of_convertToJSON(catalogs_base_filters_any_of_t *catalogs_base_filters_any_of);

#endif /* _catalogs_base_filters_any_of_H_ */

