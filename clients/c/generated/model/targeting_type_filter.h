/*
 * targeting_type_filter.h
 *
 * 
 */

#ifndef _targeting_type_filter_H_
#define _targeting_type_filter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct targeting_type_filter_t targeting_type_filter_t;

#include "ads_analytics_targeting_type.h"

// Enum  for targeting_type_filter

typedef enum  { pinterest_rest_api_targeting_type_filter__NULL = 0, pinterest_rest_api_targeting_type_filter__KEYWORD, pinterest_rest_api_targeting_type_filter__APPTYPE, pinterest_rest_api_targeting_type_filter__GENDER, pinterest_rest_api_targeting_type_filter__LOCATION, pinterest_rest_api_targeting_type_filter__PLACEMENT, pinterest_rest_api_targeting_type_filter__COUNTRY, pinterest_rest_api_targeting_type_filter__TARGETED_INTEREST, pinterest_rest_api_targeting_type_filter__PINNER_INTEREST, pinterest_rest_api_targeting_type_filter__AUDIENCE_INCLUDE, pinterest_rest_api_targeting_type_filter__GEO, pinterest_rest_api_targeting_type_filter__AGE_BUCKET, pinterest_rest_api_targeting_type_filter__REGION } pinterest_rest_api_targeting_type_filter__e;

char* targeting_type_filter_targeting_types_ToString(pinterest_rest_api_targeting_type_filter__e targeting_types);

pinterest_rest_api_targeting_type_filter__e targeting_type_filter_targeting_types_FromString(char* targeting_types);



typedef struct targeting_type_filter_t {
    list_t *targeting_types; //nonprimitive container

} targeting_type_filter_t;

targeting_type_filter_t *targeting_type_filter_create(
    list_t *targeting_types
);

void targeting_type_filter_free(targeting_type_filter_t *targeting_type_filter);

targeting_type_filter_t *targeting_type_filter_parseFromJSON(cJSON *targeting_type_filterJSON);

cJSON *targeting_type_filter_convertToJSON(targeting_type_filter_t *targeting_type_filter);

#endif /* _targeting_type_filter_H_ */

