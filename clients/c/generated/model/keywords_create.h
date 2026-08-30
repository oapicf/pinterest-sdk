/*
 * keywords_create.h
 *
 * Resource create operation model.
 */

#ifndef _keywords_create_H_
#define _keywords_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct keywords_create_t keywords_create_t;

#include "keyword_create_item.h"



typedef struct keywords_create_t {
    list_t *keywords; //nonprimitive container
    char *parent_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} keywords_create_t;

__attribute__((deprecated)) keywords_create_t *keywords_create_create(
    list_t *keywords,
    char *parent_id
);

void keywords_create_free(keywords_create_t *keywords_create);

keywords_create_t *keywords_create_parseFromJSON(cJSON *keywords_createJSON);

cJSON *keywords_create_convertToJSON(keywords_create_t *keywords_create);

#endif /* _keywords_create_H_ */

