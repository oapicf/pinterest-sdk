/*
 * schedule_age_bucket_multipliers.h
 *
 * This represents a mapping from age bucket to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 */

#ifndef _schedule_age_bucket_multipliers_H_
#define _schedule_age_bucket_multipliers_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct schedule_age_bucket_multipliers_t schedule_age_bucket_multipliers_t;


// Enum AGEBUCKET for schedule_age_bucket_multipliers

typedef enum  { pinterest_rest_api_schedule_age_bucket_multipliers_AGEBUCKET_NULL = 0, pinterest_rest_api_schedule_age_bucket_multipliers_AGEBUCKET__18_24, pinterest_rest_api_schedule_age_bucket_multipliers_AGEBUCKET__25_34, pinterest_rest_api_schedule_age_bucket_multipliers_AGEBUCKET__35_44, pinterest_rest_api_schedule_age_bucket_multipliers_AGEBUCKET__45_49, pinterest_rest_api_schedule_age_bucket_multipliers_AGEBUCKET__50_54, pinterest_rest_api_schedule_age_bucket_multipliers_AGEBUCKET__55_64, pinterest_rest_api_schedule_age_bucket_multipliers_AGEBUCKET__65+ } pinterest_rest_api_schedule_age_bucket_multipliers_AGEBUCKET_e;

char* schedule_age_bucket_multipliers_age_bucket_ToString(pinterest_rest_api_schedule_age_bucket_multipliers_AGEBUCKET_e age_bucket);

pinterest_rest_api_schedule_age_bucket_multipliers_AGEBUCKET_e schedule_age_bucket_multipliers_age_bucket_FromString(char* age_bucket);



typedef struct schedule_age_bucket_multipliers_t {
    pinterest_rest_api_schedule_age_bucket_multipliers_AGEBUCKET_e age_bucket; //enum

    int _library_owned; // Is the library responsible for freeing this object?
} schedule_age_bucket_multipliers_t;

__attribute__((deprecated)) schedule_age_bucket_multipliers_t *schedule_age_bucket_multipliers_create(
    pinterest_rest_api_schedule_age_bucket_multipliers_AGEBUCKET_e age_bucket
);

void schedule_age_bucket_multipliers_free(schedule_age_bucket_multipliers_t *schedule_age_bucket_multipliers);

schedule_age_bucket_multipliers_t *schedule_age_bucket_multipliers_parseFromJSON(cJSON *schedule_age_bucket_multipliersJSON);

cJSON *schedule_age_bucket_multipliers_convertToJSON(schedule_age_bucket_multipliers_t *schedule_age_bucket_multipliers);

#endif /* _schedule_age_bucket_multipliers_H_ */

