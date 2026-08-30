/*
 * items_post_200_response.h
 *
 * 
 */

#ifndef _items_post_200_response_H_
#define _items_post_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct items_post_200_response_t items_post_200_response_t;

#include "item_response.h"



typedef struct items_post_200_response_t {
    list_t *items; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} items_post_200_response_t;

__attribute__((deprecated)) items_post_200_response_t *items_post_200_response_create(
    list_t *items
);

void items_post_200_response_free(items_post_200_response_t *items_post_200_response);

items_post_200_response_t *items_post_200_response_parseFromJSON(cJSON *items_post_200_responseJSON);

cJSON *items_post_200_response_convertToJSON(items_post_200_response_t *items_post_200_response);

#endif /* _items_post_200_response_H_ */

