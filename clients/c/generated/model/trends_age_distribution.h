/*
 * trends_age_distribution.h
 *
 * This represents a mapping from age bucket to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
 */

#ifndef _trends_age_distribution_H_
#define _trends_age_distribution_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct trends_age_distribution_t trends_age_distribution_t;

#include "trends_age_bucket.h"



typedef struct trends_age_distribution_t {
    pinterest_rest_api_trends_age_bucket__e age_distribution; //referenced enum

    int _library_owned; // Is the library responsible for freeing this object?
} trends_age_distribution_t;

__attribute__((deprecated)) trends_age_distribution_t *trends_age_distribution_create(
    pinterest_rest_api_trends_age_bucket__e age_distribution
);

void trends_age_distribution_free(trends_age_distribution_t *trends_age_distribution);

trends_age_distribution_t *trends_age_distribution_parseFromJSON(cJSON *trends_age_distributionJSON);

cJSON *trends_age_distribution_convertToJSON(trends_age_distribution_t *trends_age_distribution);

#endif /* _trends_age_distribution_H_ */

