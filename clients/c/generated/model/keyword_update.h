/*
 * keyword_update.h
 *
 * 
 */

#ifndef _keyword_update_H_
#define _keyword_update_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct keyword_update_t keyword_update_t;




typedef struct keyword_update_t {
    int archived; //boolean
    int bid; //numeric
    char *id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} keyword_update_t;

__attribute__((deprecated)) keyword_update_t *keyword_update_create(
    int archived,
    int bid,
    char *id
);

void keyword_update_free(keyword_update_t *keyword_update);

keyword_update_t *keyword_update_parseFromJSON(cJSON *keyword_updateJSON);

cJSON *keyword_update_convertToJSON(keyword_update_t *keyword_update);

#endif /* _keyword_update_H_ */

