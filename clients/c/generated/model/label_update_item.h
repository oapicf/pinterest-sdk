/*
 * label_update_item.h
 *
 * 
 */

#ifndef _label_update_item_H_
#define _label_update_item_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct label_update_item_t label_update_item_t;

#include "label_status.h"



typedef struct label_update_item_t {
    char *id; // string
    pinterest_rest_api_label_status__e status; //referenced enum
    char *value; // string

    int _library_owned; // Is the library responsible for freeing this object?
} label_update_item_t;

__attribute__((deprecated)) label_update_item_t *label_update_item_create(
    char *id,
    pinterest_rest_api_label_status__e status,
    char *value
);

void label_update_item_free(label_update_item_t *label_update_item);

label_update_item_t *label_update_item_parseFromJSON(cJSON *label_update_itemJSON);

cJSON *label_update_item_convertToJSON(label_update_item_t *label_update_item);

#endif /* _label_update_item_H_ */

