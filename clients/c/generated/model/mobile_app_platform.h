/*
 * mobile_app_platform.h
 *
 * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Platform of the mobile app for an &#x60;APP_INSTALL&#x60; campaign.
 */

#ifndef _mobile_app_platform_H_
#define _mobile_app_platform_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct mobile_app_platform_t mobile_app_platform_t;


// Enum  for mobile_app_platform

typedef enum { pinterest_rest_api_mobile_app_platform__NULL = 0, pinterest_rest_api_mobile_app_platform__IOS, pinterest_rest_api_mobile_app_platform__ANDROID } pinterest_rest_api_mobile_app_platform__e;

char* mobile_app_platform_mobile_app_platform_ToString(pinterest_rest_api_mobile_app_platform__e mobile_app_platform);

pinterest_rest_api_mobile_app_platform__e mobile_app_platform_mobile_app_platform_FromString(char* mobile_app_platform);

cJSON *mobile_app_platform_convertToJSON(pinterest_rest_api_mobile_app_platform__e mobile_app_platform);

pinterest_rest_api_mobile_app_platform__e mobile_app_platform_parseFromJSON(cJSON *mobile_app_platformJSON);

#endif /* _mobile_app_platform_H_ */

