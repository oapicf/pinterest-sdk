/*
 * trends_supported_region.h
 *
 * 
 */

#ifndef _trends_supported_region_H_
#define _trends_supported_region_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct trends_supported_region_t trends_supported_region_t;


// Enum  for trends_supported_region

typedef enum { pinterest_rest_api_trends_supported_region__NULL = 0, pinterest_rest_api_trends_supported_region__US, pinterest_rest_api_trends_supported_region__CA, pinterest_rest_api_trends_supported_region__DE, pinterest_rest_api_trends_supported_region__FR, pinterest_rest_api_trends_supported_region__ES, pinterest_rest_api_trends_supported_region__IT, pinterest_rest_api_trends_supported_region__DE+AT+CH, pinterest_rest_api_trends_supported_region__GB+IE, pinterest_rest_api_trends_supported_region__IT+ES+PT+GR+MT, pinterest_rest_api_trends_supported_region__PL+RO+HU+SK+CZ, pinterest_rest_api_trends_supported_region__SE+DK+FI+NO, pinterest_rest_api_trends_supported_region__NL+BE+LU, pinterest_rest_api_trends_supported_region__AR, pinterest_rest_api_trends_supported_region__BR, pinterest_rest_api_trends_supported_region__CO, pinterest_rest_api_trends_supported_region__MX, pinterest_rest_api_trends_supported_region__MX+AR+CO+CL, pinterest_rest_api_trends_supported_region__AU+NZ } pinterest_rest_api_trends_supported_region__e;

char* trends_supported_region_trends_supported_region_ToString(pinterest_rest_api_trends_supported_region__e trends_supported_region);

pinterest_rest_api_trends_supported_region__e trends_supported_region_trends_supported_region_FromString(char* trends_supported_region);

//cJSON *trends_supported_region_trends_supported_region_convertToJSON(pinterest_rest_api_trends_supported_region__e trends_supported_region);

//pinterest_rest_api_trends_supported_region__e trends_supported_region_trends_supported_region_parseFromJSON(cJSON *trends_supported_regionJSON);

#endif /* _trends_supported_region_H_ */

