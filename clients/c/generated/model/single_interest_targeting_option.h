/*
 * single_interest_targeting_option.h
 *
 * 
 */

#ifndef _single_interest_targeting_option_H_
#define _single_interest_targeting_option_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct single_interest_targeting_option_t single_interest_targeting_option_t;




typedef struct single_interest_targeting_option_t {
    list_t *child_interests; //primitive container
    char *id; // string
    int *level; //numeric
    char *name; // string

    int _library_owned; // Is the library responsible for freeing this object?
} single_interest_targeting_option_t;

__attribute__((deprecated)) single_interest_targeting_option_t *single_interest_targeting_option_create(
    list_t *child_interests,
    char *id,
    int *level,
    char *name
);

void single_interest_targeting_option_free(single_interest_targeting_option_t *single_interest_targeting_option);

single_interest_targeting_option_t *single_interest_targeting_option_parseFromJSON(cJSON *single_interest_targeting_optionJSON);

cJSON *single_interest_targeting_option_convertToJSON(single_interest_targeting_option_t *single_interest_targeting_option);

#endif /* _single_interest_targeting_option_H_ */

