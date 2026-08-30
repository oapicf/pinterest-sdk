/*
 * targeting_spec_optimal.h
 *
 * 
 */

#ifndef _targeting_spec_optimal_H_
#define _targeting_spec_optimal_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct targeting_spec_optimal_t targeting_spec_optimal_t;

#include "targeting_spec_age_bucket.h"
#include "targeting_spec_app_type.h"
#include "targeting_spec_gender.h"
#include "targeting_spec_shopping_retargeting.h"
#include "targeting_strategy.h"

// Enum  for targeting_spec_optimal

typedef enum  { pinterest_rest_api_targeting_spec_optimal__NULL = 0, pinterest_rest_api_targeting_spec_optimal___18_24, pinterest_rest_api_targeting_spec_optimal___19+, pinterest_rest_api_targeting_spec_optimal___20+, pinterest_rest_api_targeting_spec_optimal___21+, pinterest_rest_api_targeting_spec_optimal___25_34, pinterest_rest_api_targeting_spec_optimal___35_44, pinterest_rest_api_targeting_spec_optimal___45_49, pinterest_rest_api_targeting_spec_optimal___50_54, pinterest_rest_api_targeting_spec_optimal___55_64, pinterest_rest_api_targeting_spec_optimal___65+ } pinterest_rest_api_targeting_spec_optimal__e;

char* targeting_spec_optimal_age_bucket_ToString(pinterest_rest_api_targeting_spec_optimal__e age_bucket);

pinterest_rest_api_targeting_spec_optimal__e targeting_spec_optimal_age_bucket_FromString(char* age_bucket);

// Enum  for targeting_spec_optimal

typedef enum  { pinterest_rest_api_targeting_spec_optimal__NULL = 0, pinterest_rest_api_targeting_spec_optimal__android_mobile, pinterest_rest_api_targeting_spec_optimal__android_tablet, pinterest_rest_api_targeting_spec_optimal__ipad, pinterest_rest_api_targeting_spec_optimal__iphone, pinterest_rest_api_targeting_spec_optimal__web, pinterest_rest_api_targeting_spec_optimal__web_mobile } pinterest_rest_api_targeting_spec_optimal__e;

char* targeting_spec_optimal_apptype_ToString(pinterest_rest_api_targeting_spec_optimal__e apptype);

pinterest_rest_api_targeting_spec_optimal__e targeting_spec_optimal_apptype_FromString(char* apptype);

// Enum  for targeting_spec_optimal

typedef enum  { pinterest_rest_api_targeting_spec_optimal__NULL = 0, pinterest_rest_api_targeting_spec_optimal__unknown, pinterest_rest_api_targeting_spec_optimal__male, pinterest_rest_api_targeting_spec_optimal__female } pinterest_rest_api_targeting_spec_optimal__e;

char* targeting_spec_optimal_gender_ToString(pinterest_rest_api_targeting_spec_optimal__e gender);

pinterest_rest_api_targeting_spec_optimal__e targeting_spec_optimal_gender_FromString(char* gender);

// Enum  for targeting_spec_optimal

typedef enum  { pinterest_rest_api_targeting_spec_optimal__NULL = 0, pinterest_rest_api_targeting_spec_optimal__CHOOSE_YOUR_OWN, pinterest_rest_api_targeting_spec_optimal__FIND_NEW_CUSTOMERS, pinterest_rest_api_targeting_spec_optimal__RECONNECT_WITH_USERS } pinterest_rest_api_targeting_spec_optimal__e;

char* targeting_spec_optimal_targeting_strategy_ToString(pinterest_rest_api_targeting_spec_optimal__e targeting_strategy);

pinterest_rest_api_targeting_spec_optimal__e targeting_spec_optimal_targeting_strategy_FromString(char* targeting_strategy);



typedef struct targeting_spec_optimal_t {
    list_t *age_bucket; //nonprimitive container
    list_t *apptype; //nonprimitive container
    list_t *audience_exclude; //primitive container
    list_t *audience_include; //primitive container
    list_t *gender; //nonprimitive container
    list_t *geo; //primitive container
    list_t *geo_exclude; //primitive container
    list_t *interest; //primitive container
    list_t *locale; //primitive container
    list_t *location; //primitive container
    list_t *location_exclude; //primitive container
    char *maximum_age; // string
    char *minimum_age; // string
    list_t *shopping_retargeting; //nonprimitive container
    list_t *targeting_strategy; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} targeting_spec_optimal_t;

__attribute__((deprecated)) targeting_spec_optimal_t *targeting_spec_optimal_create(
    list_t *age_bucket,
    list_t *apptype,
    list_t *audience_exclude,
    list_t *audience_include,
    list_t *gender,
    list_t *geo,
    list_t *geo_exclude,
    list_t *interest,
    list_t *locale,
    list_t *location,
    list_t *location_exclude,
    char *maximum_age,
    char *minimum_age,
    list_t *shopping_retargeting,
    list_t *targeting_strategy
);

void targeting_spec_optimal_free(targeting_spec_optimal_t *targeting_spec_optimal);

targeting_spec_optimal_t *targeting_spec_optimal_parseFromJSON(cJSON *targeting_spec_optimalJSON);

cJSON *targeting_spec_optimal_convertToJSON(targeting_spec_optimal_t *targeting_spec_optimal);

#endif /* _targeting_spec_optimal_H_ */

