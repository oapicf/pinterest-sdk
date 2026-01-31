/*
 * any_of.h
 *
 * 
 */

#ifndef _any_of_H_
#define _any_of_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct any_of_t any_of_t;

#include "catalogs_product_group_filter_keys.h"



typedef struct any_of_t {
    list_t *any_of; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} any_of_t;

__attribute__((deprecated)) any_of_t *any_of_create(
    list_t *any_of
);

void any_of_free(any_of_t *any_of);

any_of_t *any_of_parseFromJSON(cJSON *any_ofJSON);

cJSON *any_of_convertToJSON(any_of_t *any_of);

#endif /* _any_of_H_ */

