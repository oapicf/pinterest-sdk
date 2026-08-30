/*
 * keyword_create_item.h
 *
 * 
 */

#ifndef _keyword_create_item_H_
#define _keyword_create_item_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct keyword_create_item_t keyword_create_item_t;

#include "match_type.h"



typedef struct keyword_create_item_t {
    int *bid; //numeric
    match_type_t *match_type; // custom
    char *value; // string

    int _library_owned; // Is the library responsible for freeing this object?
} keyword_create_item_t;

__attribute__((deprecated)) keyword_create_item_t *keyword_create_item_create(
    int *bid,
    match_type_t *match_type,
    char *value
);

void keyword_create_item_free(keyword_create_item_t *keyword_create_item);

keyword_create_item_t *keyword_create_item_parseFromJSON(cJSON *keyword_create_itemJSON);

cJSON *keyword_create_item_convertToJSON(keyword_create_item_t *keyword_create_item);

#endif /* _keyword_create_item_H_ */

