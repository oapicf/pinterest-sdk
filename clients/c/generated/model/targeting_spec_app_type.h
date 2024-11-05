/*
 * targeting_spec_app_type.h
 *
 * 
 */

#ifndef _targeting_spec_app_type_H_
#define _targeting_spec_app_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct targeting_spec_app_type_t targeting_spec_app_type_t;


// Enum  for targeting_spec_app_type

typedef enum { pinterest_rest_api_targeting_spec_app_type__NULL = 0, pinterest_rest_api_targeting_spec_app_type__android_mobile, pinterest_rest_api_targeting_spec_app_type__android_tablet, pinterest_rest_api_targeting_spec_app_type__ipad, pinterest_rest_api_targeting_spec_app_type__iphone, pinterest_rest_api_targeting_spec_app_type__web, pinterest_rest_api_targeting_spec_app_type__web_mobile } pinterest_rest_api_targeting_spec_app_type__e;

char* targeting_spec_app_type_targeting_spec_app_type_ToString(pinterest_rest_api_targeting_spec_app_type__e targeting_spec_app_type);

pinterest_rest_api_targeting_spec_app_type__e targeting_spec_app_type_targeting_spec_app_type_FromString(char* targeting_spec_app_type);

//cJSON *targeting_spec_app_type_targeting_spec_app_type_convertToJSON(pinterest_rest_api_targeting_spec_app_type__e targeting_spec_app_type);

//pinterest_rest_api_targeting_spec_app_type__e targeting_spec_app_type_targeting_spec_app_type_parseFromJSON(cJSON *targeting_spec_app_typeJSON);

#endif /* _targeting_spec_app_type_H_ */

