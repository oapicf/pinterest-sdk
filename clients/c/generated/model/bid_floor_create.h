/*
 * bid_floor_create.h
 *
 * Resource create operation model.
 */

#ifndef _bid_floor_create_H_
#define _bid_floor_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct bid_floor_create_t bid_floor_create_t;

#include "bid_floor_spec.h"
#include "targeting_spec_optimal.h"



typedef struct bid_floor_create_t {
    list_t *bid_floor_specs; //nonprimitive container
    struct targeting_spec_optimal_t *targeting_spec; //model

    int _library_owned; // Is the library responsible for freeing this object?
} bid_floor_create_t;

__attribute__((deprecated)) bid_floor_create_t *bid_floor_create_create(
    list_t *bid_floor_specs,
    targeting_spec_optimal_t *targeting_spec
);

void bid_floor_create_free(bid_floor_create_t *bid_floor_create);

bid_floor_create_t *bid_floor_create_parseFromJSON(cJSON *bid_floor_createJSON);

cJSON *bid_floor_create_convertToJSON(bid_floor_create_t *bid_floor_create);

#endif /* _bid_floor_create_H_ */

