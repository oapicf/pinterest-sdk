/*
 * promotion_array_element.h
 *
 * 
 */

#ifndef _promotion_array_element_H_
#define _promotion_array_element_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct promotion_array_element_t promotion_array_element_t;

#include "exception.h"
#include "promotion_response.h"



typedef struct promotion_array_element_t {
    struct promotion_response_t *data; //model
    struct exception_t *exception; //model

    int _library_owned; // Is the library responsible for freeing this object?
} promotion_array_element_t;

__attribute__((deprecated)) promotion_array_element_t *promotion_array_element_create(
    promotion_response_t *data,
    exception_t *exception
);

void promotion_array_element_free(promotion_array_element_t *promotion_array_element);

promotion_array_element_t *promotion_array_element_parseFromJSON(cJSON *promotion_array_elementJSON);

cJSON *promotion_array_element_convertToJSON(promotion_array_element_t *promotion_array_element);

#endif /* _promotion_array_element_H_ */

