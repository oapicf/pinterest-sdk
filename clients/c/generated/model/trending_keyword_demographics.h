/*
 * trending_keyword_demographics.h
 *
 * A mapping of demographic dimensions (e.g. \&quot;gender\&quot;, \&quot;age\&quot;) to their category distributions. For each dimension: Key: The category (e.g., \&quot;female\&quot;, \&quot;18-24\&quot;). Value: The proportion of search volume (e.g., 0.12 for 12%). Values less than 0.05 are set to 0.04 for privacy. The sum for all categories in a dimension will approximately equal 1. Only applicable when &#x60;include_demographics&#x60; query parameter is set to &#x60;true&#x60;.
 */

#ifndef _trending_keyword_demographics_H_
#define _trending_keyword_demographics_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct trending_keyword_demographics_t trending_keyword_demographics_t;

#include "trends_age_distribution.h"
#include "trends_gender_distribution.h"



typedef struct trending_keyword_demographics_t {
    trends_age_distribution_t *age_distribution; // custom
    trends_gender_distribution_t *gender_distribution; // custom

    int _library_owned; // Is the library responsible for freeing this object?
} trending_keyword_demographics_t;

__attribute__((deprecated)) trending_keyword_demographics_t *trending_keyword_demographics_create(
    trends_age_distribution_t *age_distribution,
    trends_gender_distribution_t *gender_distribution
);

void trending_keyword_demographics_free(trending_keyword_demographics_t *trending_keyword_demographics);

trending_keyword_demographics_t *trending_keyword_demographics_parseFromJSON(cJSON *trending_keyword_demographicsJSON);

cJSON *trending_keyword_demographics_convertToJSON(trending_keyword_demographics_t *trending_keyword_demographics);

#endif /* _trending_keyword_demographics_H_ */

