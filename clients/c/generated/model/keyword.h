/*
 * keyword.h
 *
 * 
 */

#ifndef _keyword_H_
#define _keyword_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct keyword_t keyword_t;

#include "match_type.h"



typedef struct keyword_t {
    int *archived; //boolean
    int *bid; //numeric
    char *id; // string
    match_type_t *match_type; // custom
    char *parent_id; // string
    char *parent_type; // string
    char *type; // string
    char *value; // string

    int _library_owned; // Is the library responsible for freeing this object?
} keyword_t;

__attribute__((deprecated)) keyword_t *keyword_create(
    int *archived,
    int *bid,
    char *id,
    match_type_t *match_type,
    char *parent_id,
    char *parent_type,
    char *type,
    char *value
);

void keyword_free(keyword_t *keyword);

keyword_t *keyword_parseFromJSON(cJSON *keywordJSON);

cJSON *keyword_convertToJSON(keyword_t *keyword);

#endif /* _keyword_H_ */

