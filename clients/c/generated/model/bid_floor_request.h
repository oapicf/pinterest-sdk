/*
 * bid_floor_request.h
 *
 * 
 */

#ifndef _bid_floor_request_H_
#define _bid_floor_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct bid_floor_request_t bid_floor_request_t;

#include "bid_floor_spec.h"
#include "targeting_spec.h"



typedef struct bid_floor_request_t {
    list_t *bid_floor_specs; //nonprimitive container
    struct targeting_spec_t *targeting_spec; //model

} bid_floor_request_t;

bid_floor_request_t *bid_floor_request_create(
    list_t *bid_floor_specs,
    targeting_spec_t *targeting_spec
);

void bid_floor_request_free(bid_floor_request_t *bid_floor_request);

bid_floor_request_t *bid_floor_request_parseFromJSON(cJSON *bid_floor_requestJSON);

cJSON *bid_floor_request_convertToJSON(bid_floor_request_t *bid_floor_request);

#endif /* _bid_floor_request_H_ */

