/*
 * bid_floor.h
 *
 * 
 */

#ifndef _bid_floor_H_
#define _bid_floor_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct bid_floor_t bid_floor_t;




typedef struct bid_floor_t {
    list_t *bid_floors; //primitive container
    char *type; // string

} bid_floor_t;

bid_floor_t *bid_floor_create(
    list_t *bid_floors,
    char *type
);

void bid_floor_free(bid_floor_t *bid_floor);

bid_floor_t *bid_floor_parseFromJSON(cJSON *bid_floorJSON);

cJSON *bid_floor_convertToJSON(bid_floor_t *bid_floor);

#endif /* _bid_floor_H_ */

