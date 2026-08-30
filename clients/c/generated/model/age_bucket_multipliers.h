/*
 * age_bucket_multipliers.h
 *
 * This represents a mapping from age bucket to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified age bucket in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
 */

#ifndef _age_bucket_multipliers_H_
#define _age_bucket_multipliers_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct age_bucket_multipliers_t age_bucket_multipliers_t;

#include "targeting_spec_age_bucket.h"



typedef struct age_bucket_multipliers_t {
    targeting_spec_age_bucket_t *age_bucket; // custom

    int _library_owned; // Is the library responsible for freeing this object?
} age_bucket_multipliers_t;

__attribute__((deprecated)) age_bucket_multipliers_t *age_bucket_multipliers_create(
    targeting_spec_age_bucket_t *age_bucket
);

void age_bucket_multipliers_free(age_bucket_multipliers_t *age_bucket_multipliers);

age_bucket_multipliers_t *age_bucket_multipliers_parseFromJSON(cJSON *age_bucket_multipliersJSON);

cJSON *age_bucket_multipliers_convertToJSON(age_bucket_multipliers_t *age_bucket_multipliers);

#endif /* _age_bucket_multipliers_H_ */

