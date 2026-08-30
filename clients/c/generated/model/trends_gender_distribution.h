/*
 * trends_gender_distribution.h
 *
 * This represents a mapping from gender to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
 */

#ifndef _trends_gender_distribution_H_
#define _trends_gender_distribution_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct trends_gender_distribution_t trends_gender_distribution_t;

#include "trends_gender.h"



typedef struct trends_gender_distribution_t {
    pinterest_rest_api_trends_gender__e gender_distribution; //referenced enum

    int _library_owned; // Is the library responsible for freeing this object?
} trends_gender_distribution_t;

__attribute__((deprecated)) trends_gender_distribution_t *trends_gender_distribution_create(
    pinterest_rest_api_trends_gender__e gender_distribution
);

void trends_gender_distribution_free(trends_gender_distribution_t *trends_gender_distribution);

trends_gender_distribution_t *trends_gender_distribution_parseFromJSON(cJSON *trends_gender_distributionJSON);

cJSON *trends_gender_distribution_convertToJSON(trends_gender_distribution_t *trends_gender_distribution);

#endif /* _trends_gender_distribution_H_ */

