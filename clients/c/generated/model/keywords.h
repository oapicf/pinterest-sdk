/*
 * keywords.h
 *
 * 
 */

#ifndef _keywords_H_
#define _keywords_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct keywords_t keywords_t;

#include "keyword.h"
#include "keyword_error.h"



typedef struct keywords_t {
    list_t *errors; //nonprimitive container
    list_t *keywords; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} keywords_t;

__attribute__((deprecated)) keywords_t *keywords_create(
    list_t *errors,
    list_t *keywords
);

void keywords_free(keywords_t *keywords);

keywords_t *keywords_parseFromJSON(cJSON *keywordsJSON);

cJSON *keywords_convertToJSON(keywords_t *keywords);

#endif /* _keywords_H_ */

