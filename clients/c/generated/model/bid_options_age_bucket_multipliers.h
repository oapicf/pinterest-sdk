/*
 * bid_options_age_bucket_multipliers.h
 *
 * This represents a mapping from age bucket to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 */

#ifndef _bid_options_age_bucket_multipliers_H_
#define _bid_options_age_bucket_multipliers_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct bid_options_age_bucket_multipliers_t bid_options_age_bucket_multipliers_t;




typedef struct bid_options_age_bucket_multipliers_t {
    double *_18_24; //numeric
    double *_25_34; //numeric
    double *_35_44; //numeric
    double *_45_49; //numeric
    double *_50_54; //numeric
    double *_55_64; //numeric
    double *_65; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} bid_options_age_bucket_multipliers_t;

__attribute__((deprecated)) bid_options_age_bucket_multipliers_t *bid_options_age_bucket_multipliers_create(
    double *_18_24,
    double *_25_34,
    double *_35_44,
    double *_45_49,
    double *_50_54,
    double *_55_64,
    double *_65
);

void bid_options_age_bucket_multipliers_free(bid_options_age_bucket_multipliers_t *bid_options_age_bucket_multipliers);

bid_options_age_bucket_multipliers_t *bid_options_age_bucket_multipliers_parseFromJSON(cJSON *bid_options_age_bucket_multipliersJSON);

cJSON *bid_options_age_bucket_multipliers_convertToJSON(bid_options_age_bucket_multipliers_t *bid_options_age_bucket_multipliers);

#endif /* _bid_options_age_bucket_multipliers_H_ */

