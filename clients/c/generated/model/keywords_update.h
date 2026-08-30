/*
 * keywords_update.h
 *
 * Resource create or update operation model.
 */

#ifndef _keywords_update_H_
#define _keywords_update_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct keywords_update_t keywords_update_t;

#include "keyword_update_item.h"



typedef struct keywords_update_t {
    list_t *keywords; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} keywords_update_t;

__attribute__((deprecated)) keywords_update_t *keywords_update_create(
    list_t *keywords
);

void keywords_update_free(keywords_update_t *keywords_update);

keywords_update_t *keywords_update_parseFromJSON(cJSON *keywords_updateJSON);

cJSON *keywords_update_convertToJSON(keywords_update_t *keywords_update);

#endif /* _keywords_update_H_ */

