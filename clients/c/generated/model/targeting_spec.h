/*
 * targeting_spec.h
 *
 * Ad group targeting specification defining the ad group target audience. For example, &#x60;{\&quot;APPTYPE\&quot;:[\&quot;iphone\&quot;], \&quot;GENDER\&quot;:[\&quot;male\&quot;], \&quot;LOCALE\&quot;:[\&quot;en-US\&quot;], \&quot;LOCATION\&quot;:[\&quot;501\&quot;], \&quot;MINIMUM_AGE\&quot;:\&quot;18\&quot;, \&quot;MAXIMUM_AGE\&quot;:\&quot;65+\&quot;}&#x60;
 */

#ifndef _targeting_spec_H_
#define _targeting_spec_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct targeting_spec_t targeting_spec_t;

#include "targeting_spec_age_bucket.h"
#include "targeting_spec_app_type.h"
#include "targeting_spec_gender.h"
#include "targeting_spec_shopping_retargeting.h"

// Enum  for targeting_spec

typedef enum  { pinterest_rest_api_targeting_spec__NULL = 0, pinterest_rest_api_targeting_spec___18_24, pinterest_rest_api_targeting_spec___19+, pinterest_rest_api_targeting_spec___20+, pinterest_rest_api_targeting_spec___21+, pinterest_rest_api_targeting_spec___25_34, pinterest_rest_api_targeting_spec___35_44, pinterest_rest_api_targeting_spec___45_49, pinterest_rest_api_targeting_spec___50_54, pinterest_rest_api_targeting_spec___55_64, pinterest_rest_api_targeting_spec___65+ } pinterest_rest_api_targeting_spec__e;

char* targeting_spec_age_bucket_ToString(pinterest_rest_api_targeting_spec__e age_bucket);

pinterest_rest_api_targeting_spec__e targeting_spec_age_bucket_FromString(char* age_bucket);

// Enum  for targeting_spec

typedef enum  { pinterest_rest_api_targeting_spec__NULL = 0, pinterest_rest_api_targeting_spec__android_mobile, pinterest_rest_api_targeting_spec__android_tablet, pinterest_rest_api_targeting_spec__ipad, pinterest_rest_api_targeting_spec__iphone, pinterest_rest_api_targeting_spec__web, pinterest_rest_api_targeting_spec__web_mobile } pinterest_rest_api_targeting_spec__e;

char* targeting_spec_apptype_ToString(pinterest_rest_api_targeting_spec__e apptype);

pinterest_rest_api_targeting_spec__e targeting_spec_apptype_FromString(char* apptype);

// Enum  for targeting_spec

typedef enum  { pinterest_rest_api_targeting_spec__NULL = 0, pinterest_rest_api_targeting_spec__unknown, pinterest_rest_api_targeting_spec__male, pinterest_rest_api_targeting_spec__female } pinterest_rest_api_targeting_spec__e;

char* targeting_spec_gender_ToString(pinterest_rest_api_targeting_spec__e gender);

pinterest_rest_api_targeting_spec__e targeting_spec_gender_FromString(char* gender);

// Enum TARGETINGSTRATEGY for targeting_spec

typedef enum  { pinterest_rest_api_targeting_spec_TARGETINGSTRATEGY_NULL = 0, pinterest_rest_api_targeting_spec_TARGETINGSTRATEGY_CHOOSE_YOUR_OWN, pinterest_rest_api_targeting_spec_TARGETINGSTRATEGY_FIND_NEW_CUSTOMERS, pinterest_rest_api_targeting_spec_TARGETINGSTRATEGY_RECONNECT_WITH_USERS } pinterest_rest_api_targeting_spec_TARGETINGSTRATEGY_e;

char* targeting_spec_targeting_strategy_ToString(pinterest_rest_api_targeting_spec_TARGETINGSTRATEGY_e targeting_strategy);

pinterest_rest_api_targeting_spec_TARGETINGSTRATEGY_e targeting_spec_targeting_strategy_FromString(char* targeting_strategy);



typedef struct targeting_spec_t {
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
    list_t *targeting_strategy; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} targeting_spec_t;

__attribute__((deprecated)) targeting_spec_t *targeting_spec_create(
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

void targeting_spec_free(targeting_spec_t *targeting_spec);

targeting_spec_t *targeting_spec_parseFromJSON(cJSON *targeting_specJSON);

cJSON *targeting_spec_convertToJSON(targeting_spec_t *targeting_spec);

#endif /* _targeting_spec_H_ */

