/*
 * pins_list_200_response.h
 *
 * 
 */

#ifndef _pins_list_200_response_H_
#define _pins_list_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pins_list_200_response_t pins_list_200_response_t;

#include "pin.h"



typedef struct pins_list_200_response_t {
    char *bookmark; // string
    list_t *items; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} pins_list_200_response_t;

__attribute__((deprecated)) pins_list_200_response_t *pins_list_200_response_create(
    char *bookmark,
    list_t *items
);

void pins_list_200_response_free(pins_list_200_response_t *pins_list_200_response);

pins_list_200_response_t *pins_list_200_response_parseFromJSON(cJSON *pins_list_200_responseJSON);

cJSON *pins_list_200_response_convertToJSON(pins_list_200_response_t *pins_list_200_response);

#endif /* _pins_list_200_response_H_ */

