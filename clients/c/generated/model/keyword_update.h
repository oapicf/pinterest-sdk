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
    char *id; // string
    int archived; //boolean
    int bid; //numeric

} keyword_update_t;

keyword_update_t *keyword_update_create(
    char *id,
    int archived,
    int bid
);

void keyword_update_free(keyword_update_t *keyword_update);

keyword_update_t *keyword_update_parseFromJSON(cJSON *keyword_updateJSON);

cJSON *keyword_update_convertToJSON(keyword_update_t *keyword_update);

#endif /* _keyword_update_H_ */

