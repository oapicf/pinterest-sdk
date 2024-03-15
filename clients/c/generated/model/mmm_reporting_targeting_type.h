/*
 * mmm_reporting_targeting_type.h
 *
 * Ad targeting types for MMM report
 */

#ifndef _mmm_reporting_targeting_type_H_
#define _mmm_reporting_targeting_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct mmm_reporting_targeting_type_t mmm_reporting_targeting_type_t;


// Enum  for mmm_reporting_targeting_type

typedef enum { pinterest_rest_api_mmm_reporting_targeting_type__NULL = 0, pinterest_rest_api_mmm_reporting_targeting_type__APPTYPE, pinterest_rest_api_mmm_reporting_targeting_type__COUNTRY, pinterest_rest_api_mmm_reporting_targeting_type__CREATIVE_TYPE, pinterest_rest_api_mmm_reporting_targeting_type__GENDER, pinterest_rest_api_mmm_reporting_targeting_type__LOCATION } pinterest_rest_api_mmm_reporting_targeting_type__e;

char* mmm_reporting_targeting_type_mmm_reporting_targeting_type_ToString(pinterest_rest_api_mmm_reporting_targeting_type__e mmm_reporting_targeting_type);

pinterest_rest_api_mmm_reporting_targeting_type__e mmm_reporting_targeting_type_mmm_reporting_targeting_type_FromString(char* mmm_reporting_targeting_type);

//cJSON *mmm_reporting_targeting_type_mmm_reporting_targeting_type_convertToJSON(pinterest_rest_api_mmm_reporting_targeting_type__e mmm_reporting_targeting_type);

//pinterest_rest_api_mmm_reporting_targeting_type__e mmm_reporting_targeting_type_mmm_reporting_targeting_type_parseFromJSON(cJSON *mmm_reporting_targeting_typeJSON);

#endif /* _mmm_reporting_targeting_type_H_ */

