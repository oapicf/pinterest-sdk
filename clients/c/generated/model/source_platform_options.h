/*
 * source_platform_options.h
 *
 * List of source platforms for a conversion event.
 */

#ifndef _source_platform_options_H_
#define _source_platform_options_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct source_platform_options_t source_platform_options_t;


// Enum  for source_platform_options

typedef enum { pinterest_rest_api_source_platform_options__NULL = 0, pinterest_rest_api_source_platform_options__WEB, pinterest_rest_api_source_platform_options__MOBILE, pinterest_rest_api_source_platform_options__MOBILE_ANDROID, pinterest_rest_api_source_platform_options__MOBILE_IOS, pinterest_rest_api_source_platform_options__OFFLINE, pinterest_rest_api_source_platform_options__PINTEREST_WEB, pinterest_rest_api_source_platform_options__PINTEREST_ANDROID, pinterest_rest_api_source_platform_options__PINTEREST_IOS, pinterest_rest_api_source_platform_options__POINT_OF_SALE } pinterest_rest_api_source_platform_options__e;

char* source_platform_options_source_platform_options_ToString(pinterest_rest_api_source_platform_options__e source_platform_options);

pinterest_rest_api_source_platform_options__e source_platform_options_source_platform_options_FromString(char* source_platform_options);

cJSON *source_platform_options_convertToJSON(pinterest_rest_api_source_platform_options__e source_platform_options);

pinterest_rest_api_source_platform_options__e source_platform_options_parseFromJSON(cJSON *source_platform_optionsJSON);

#endif /* _source_platform_options_H_ */

