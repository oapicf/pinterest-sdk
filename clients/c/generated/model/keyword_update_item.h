/*
 * keyword_update_item.h
 *
 * 
 */

#ifndef _keyword_update_item_H_
#define _keyword_update_item_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct keyword_update_item_t keyword_update_item_t;




typedef struct keyword_update_item_t {
    int *archived; //boolean
    int *bid; //numeric
    char *id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} keyword_update_item_t;

__attribute__((deprecated)) keyword_update_item_t *keyword_update_item_create(
    int *archived,
    int *bid,
    char *id
);

void keyword_update_item_free(keyword_update_item_t *keyword_update_item);

keyword_update_item_t *keyword_update_item_parseFromJSON(cJSON *keyword_update_itemJSON);

cJSON *keyword_update_item_convertToJSON(keyword_update_item_t *keyword_update_item);

#endif /* _keyword_update_item_H_ */

