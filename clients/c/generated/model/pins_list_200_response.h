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
    list_t *items; //nonprimitive container
    char *bookmark; // string

} pins_list_200_response_t;

pins_list_200_response_t *pins_list_200_response_create(
    list_t *items,
    char *bookmark
);

void pins_list_200_response_free(pins_list_200_response_t *pins_list_200_response);

pins_list_200_response_t *pins_list_200_response_parseFromJSON(cJSON *pins_list_200_responseJSON);

cJSON *pins_list_200_response_convertToJSON(pins_list_200_response_t *pins_list_200_response);

#endif /* _pins_list_200_response_H_ */

