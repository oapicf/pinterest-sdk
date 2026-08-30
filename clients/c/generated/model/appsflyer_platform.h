/*
 * appsflyer_platform.h
 *
 * Platform options for AppsFlyer audience
 */

#ifndef _appsflyer_platform_H_
#define _appsflyer_platform_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct appsflyer_platform_t appsflyer_platform_t;


// Enum  for appsflyer_platform

typedef enum { pinterest_rest_api_appsflyer_platform__NULL = 0, pinterest_rest_api_appsflyer_platform__android, pinterest_rest_api_appsflyer_platform__ios } pinterest_rest_api_appsflyer_platform__e;

char* appsflyer_platform_appsflyer_platform_ToString(pinterest_rest_api_appsflyer_platform__e appsflyer_platform);

pinterest_rest_api_appsflyer_platform__e appsflyer_platform_appsflyer_platform_FromString(char* appsflyer_platform);

cJSON *appsflyer_platform_convertToJSON(pinterest_rest_api_appsflyer_platform__e appsflyer_platform);

pinterest_rest_api_appsflyer_platform__e appsflyer_platform_parseFromJSON(cJSON *appsflyer_platformJSON);

#endif /* _appsflyer_platform_H_ */

