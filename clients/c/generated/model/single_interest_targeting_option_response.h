/*
 * single_interest_targeting_option_response.h
 *
 * 
 */

#ifndef _single_interest_targeting_option_response_H_
#define _single_interest_targeting_option_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct single_interest_targeting_option_response_t single_interest_targeting_option_response_t;




typedef struct single_interest_targeting_option_response_t {
    char *id; // string
    char *name; // string
    list_t *child_interests; //primitive container
    int level; //numeric

} single_interest_targeting_option_response_t;

single_interest_targeting_option_response_t *single_interest_targeting_option_response_create(
    char *id,
    char *name,
    list_t *child_interests,
    int level
);

void single_interest_targeting_option_response_free(single_interest_targeting_option_response_t *single_interest_targeting_option_response);

single_interest_targeting_option_response_t *single_interest_targeting_option_response_parseFromJSON(cJSON *single_interest_targeting_option_responseJSON);

cJSON *single_interest_targeting_option_response_convertToJSON(single_interest_targeting_option_response_t *single_interest_targeting_option_response);

#endif /* _single_interest_targeting_option_response_H_ */

