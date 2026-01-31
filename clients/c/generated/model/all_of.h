/*
 * all_of.h
 *
 * 
 */

#ifndef _all_of_H_
#define _all_of_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct all_of_t all_of_t;

#include "catalogs_product_group_filter_keys.h"



typedef struct all_of_t {
    list_t *all_of; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} all_of_t;

__attribute__((deprecated)) all_of_t *all_of_create(
    list_t *all_of
);

void all_of_free(all_of_t *all_of);

all_of_t *all_of_parseFromJSON(cJSON *all_ofJSON);

cJSON *all_of_convertToJSON(all_of_t *all_of);

#endif /* _all_of_H_ */

