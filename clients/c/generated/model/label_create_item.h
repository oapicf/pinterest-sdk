/*
 * label_create_item.h
 *
 * 
 */

#ifndef _label_create_item_H_
#define _label_create_item_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct label_create_item_t label_create_item_t;

#include "label_type.h"



typedef struct label_create_item_t {
    pinterest_rest_api_label_type__e label_type; //referenced enum
    char *value; // string

    int _library_owned; // Is the library responsible for freeing this object?
} label_create_item_t;

__attribute__((deprecated)) label_create_item_t *label_create_item_create(
    pinterest_rest_api_label_type__e label_type,
    char *value
);

void label_create_item_free(label_create_item_t *label_create_item);

label_create_item_t *label_create_item_parseFromJSON(cJSON *label_create_itemJSON);

cJSON *label_create_item_convertToJSON(label_create_item_t *label_create_item);

#endif /* _label_create_item_H_ */

