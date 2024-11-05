/*
 * targeting_spec.h
 *
 * Ad group targeting specification defining the ad group target audience. For example, &#x60;{\&quot;APPTYPE\&quot;:[\&quot;iphone\&quot;], \&quot;GENDER\&quot;:[\&quot;male\&quot;], \&quot;LOCALE\&quot;:[\&quot;en-US\&quot;], \&quot;LOCATION\&quot;:[\&quot;501\&quot;], \&quot;AGE_BUCKET\&quot;:[\&quot;25-34\&quot;]}&#x60;
 */

#ifndef _targeting_spec_H_
#define _targeting_spec_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct targeting_spec_t targeting_spec_t;

#include "targeting_spec_shopping_retargeting.h"

// Enum AGEBUCKET for targeting_spec

typedef enum  { pinterest_rest_api_targeting_spec_AGEBUCKET_NULL = 0, pinterest_rest_api_targeting_spec_AGEBUCKET__18_24, pinterest_rest_api_targeting_spec_AGEBUCKET__21+, pinterest_rest_api_targeting_spec_AGEBUCKET__25_34, pinterest_rest_api_targeting_spec_AGEBUCKET__35_44, pinterest_rest_api_targeting_spec_AGEBUCKET__45_49, pinterest_rest_api_targeting_spec_AGEBUCKET__50_54, pinterest_rest_api_targeting_spec_AGEBUCKET__55_64, pinterest_rest_api_targeting_spec_AGEBUCKET__65+ } pinterest_rest_api_targeting_spec_AGEBUCKET_e;

char* targeting_spec_age_bucket_ToString(pinterest_rest_api_targeting_spec_AGEBUCKET_e age_bucket);

pinterest_rest_api_targeting_spec_AGEBUCKET_e targeting_spec_age_bucket_FromString(char* age_bucket);

// Enum APPTYPE for targeting_spec

typedef enum  { pinterest_rest_api_targeting_spec_APPTYPE_NULL = 0, pinterest_rest_api_targeting_spec_APPTYPE_android_mobile, pinterest_rest_api_targeting_spec_APPTYPE_android_tablet, pinterest_rest_api_targeting_spec_APPTYPE_ipad, pinterest_rest_api_targeting_spec_APPTYPE_iphone, pinterest_rest_api_targeting_spec_APPTYPE_web, pinterest_rest_api_targeting_spec_APPTYPE_web_mobile } pinterest_rest_api_targeting_spec_APPTYPE_e;

char* targeting_spec_apptype_ToString(pinterest_rest_api_targeting_spec_APPTYPE_e apptype);

pinterest_rest_api_targeting_spec_APPTYPE_e targeting_spec_apptype_FromString(char* apptype);

// Enum GENDER for targeting_spec

typedef enum  { pinterest_rest_api_targeting_spec_GENDER_NULL = 0, pinterest_rest_api_targeting_spec_GENDER_unknown, pinterest_rest_api_targeting_spec_GENDER_male, pinterest_rest_api_targeting_spec_GENDER_female } pinterest_rest_api_targeting_spec_GENDER_e;

char* targeting_spec_gender_ToString(pinterest_rest_api_targeting_spec_GENDER_e gender);

pinterest_rest_api_targeting_spec_GENDER_e targeting_spec_gender_FromString(char* gender);

// Enum TARGETINGSTRATEGY for targeting_spec

typedef enum  { pinterest_rest_api_targeting_spec_TARGETINGSTRATEGY_NULL = 0, pinterest_rest_api_targeting_spec_TARGETINGSTRATEGY_CHOOSE_YOUR_OWN, pinterest_rest_api_targeting_spec_TARGETINGSTRATEGY_FIND_NEW_CUSTOMERS, pinterest_rest_api_targeting_spec_TARGETINGSTRATEGY_RECONNECT_WITH_USERS } pinterest_rest_api_targeting_spec_TARGETINGSTRATEGY_e;

char* targeting_spec_targeting_strategy_ToString(pinterest_rest_api_targeting_spec_TARGETINGSTRATEGY_e targeting_strategy);

pinterest_rest_api_targeting_spec_TARGETINGSTRATEGY_e targeting_spec_targeting_strategy_FromString(char* targeting_strategy);



typedef struct targeting_spec_t {
    list_t *age_bucket; //primitive container
    list_t *apptype; //primitive container
    list_t *audience_exclude; //primitive container
    list_t *audience_include; //primitive container
    list_t *gender; //primitive container
    list_t *geo; //primitive container
    list_t *interest; //primitive container
    list_t *locale; //primitive container
    list_t *location; //primitive container
    list_t *shopping_retargeting; //nonprimitive container
    list_t *targeting_strategy; //primitive container

} targeting_spec_t;

targeting_spec_t *targeting_spec_create(
    list_t *age_bucket,
    list_t *apptype,
    list_t *audience_exclude,
    list_t *audience_include,
    list_t *gender,
    list_t *geo,
    list_t *interest,
    list_t *locale,
    list_t *location,
    list_t *shopping_retargeting,
    list_t *targeting_strategy
);

void targeting_spec_free(targeting_spec_t *targeting_spec);

targeting_spec_t *targeting_spec_parseFromJSON(cJSON *targeting_specJSON);

cJSON *targeting_spec_convertToJSON(targeting_spec_t *targeting_spec);

#endif /* _targeting_spec_H_ */

