/*
 * keyword_update_generated.h
 *
 * 
 */

#ifndef _keyword_update_generated_H_
#define _keyword_update_generated_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct keyword_update_generated_t keyword_update_generated_t;




typedef struct keyword_update_generated_t {
    int *archived; //boolean
    int *bid; //numeric
    char *id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} keyword_update_generated_t;

__attribute__((deprecated)) keyword_update_generated_t *keyword_update_generated_create(
    int *archived,
    int *bid,
    char *id
);

void keyword_update_generated_free(keyword_update_generated_t *keyword_update_generated);

keyword_update_generated_t *keyword_update_generated_parseFromJSON(cJSON *keyword_update_generatedJSON);

cJSON *keyword_update_generated_convertToJSON(keyword_update_generated_t *keyword_update_generated);

#endif /* _keyword_update_generated_H_ */

