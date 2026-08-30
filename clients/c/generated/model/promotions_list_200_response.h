/*
 * promotions_list_200_response.h
 *
 * 
 */

#ifndef _promotions_list_200_response_H_
#define _promotions_list_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct promotions_list_200_response_t promotions_list_200_response_t;

#include "promotion.h"



typedef struct promotions_list_200_response_t {
    char *bookmark; // string
    list_t *items; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} promotions_list_200_response_t;

__attribute__((deprecated)) promotions_list_200_response_t *promotions_list_200_response_create(
    char *bookmark,
    list_t *items
);

void promotions_list_200_response_free(promotions_list_200_response_t *promotions_list_200_response);

promotions_list_200_response_t *promotions_list_200_response_parseFromJSON(cJSON *promotions_list_200_responseJSON);

cJSON *promotions_list_200_response_convertToJSON(promotions_list_200_response_t *promotions_list_200_response);

#endif /* _promotions_list_200_response_H_ */

