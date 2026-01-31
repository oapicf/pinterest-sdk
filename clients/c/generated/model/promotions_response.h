/*
 * promotions_response.h
 *
 * 
 */

#ifndef _promotions_response_H_
#define _promotions_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct promotions_response_t promotions_response_t;

#include "promotion_array_element.h"



typedef struct promotions_response_t {
    list_t *promotions; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} promotions_response_t;

__attribute__((deprecated)) promotions_response_t *promotions_response_create(
    list_t *promotions
);

void promotions_response_free(promotions_response_t *promotions_response);

promotions_response_t *promotions_response_parseFromJSON(cJSON *promotions_responseJSON);

cJSON *promotions_response_convertToJSON(promotions_response_t *promotions_response);

#endif /* _promotions_response_H_ */

