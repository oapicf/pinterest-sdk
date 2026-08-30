/*
 * adgroup_tracking_feature_type.h
 *
 * 
 */

#ifndef _adgroup_tracking_feature_type_H_
#define _adgroup_tracking_feature_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct adgroup_tracking_feature_type_t adgroup_tracking_feature_type_t;


// Enum  for adgroup_tracking_feature_type

typedef enum { pinterest_rest_api_adgroup_tracking_feature_type__NULL = 0, pinterest_rest_api_adgroup_tracking_feature_type__TRENDS, pinterest_rest_api_adgroup_tracking_feature_type__CLONE_META, pinterest_rest_api_adgroup_tracking_feature_type__BULK_EDITOR, pinterest_rest_api_adgroup_tracking_feature_type__AD_ROTATION } pinterest_rest_api_adgroup_tracking_feature_type__e;

char* adgroup_tracking_feature_type_adgroup_tracking_feature_type_ToString(pinterest_rest_api_adgroup_tracking_feature_type__e adgroup_tracking_feature_type);

pinterest_rest_api_adgroup_tracking_feature_type__e adgroup_tracking_feature_type_adgroup_tracking_feature_type_FromString(char* adgroup_tracking_feature_type);

cJSON *adgroup_tracking_feature_type_convertToJSON(pinterest_rest_api_adgroup_tracking_feature_type__e adgroup_tracking_feature_type);

pinterest_rest_api_adgroup_tracking_feature_type__e adgroup_tracking_feature_type_parseFromJSON(cJSON *adgroup_tracking_feature_typeJSON);

#endif /* _adgroup_tracking_feature_type_H_ */

