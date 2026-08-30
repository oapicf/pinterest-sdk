/*
 * adgroup_tracking_features.h
 *
 * 
 */

#ifndef _adgroup_tracking_features_H_
#define _adgroup_tracking_features_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct adgroup_tracking_features_t adgroup_tracking_features_t;

#include "adgroup_tracking_feature_type.h"

// Enum  for adgroup_tracking_features

typedef enum  { pinterest_rest_api_adgroup_tracking_features__NULL = 0, pinterest_rest_api_adgroup_tracking_features__TRENDS, pinterest_rest_api_adgroup_tracking_features__CLONE_META, pinterest_rest_api_adgroup_tracking_features__BULK_EDITOR, pinterest_rest_api_adgroup_tracking_features__AD_ROTATION } pinterest_rest_api_adgroup_tracking_features__e;

char* adgroup_tracking_features_enabled_ToString(pinterest_rest_api_adgroup_tracking_features__e enabled);

pinterest_rest_api_adgroup_tracking_features__e adgroup_tracking_features_enabled_FromString(char* enabled);



typedef struct adgroup_tracking_features_t {
    list_t *enabled; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} adgroup_tracking_features_t;

__attribute__((deprecated)) adgroup_tracking_features_t *adgroup_tracking_features_create(
    list_t *enabled
);

void adgroup_tracking_features_free(adgroup_tracking_features_t *adgroup_tracking_features);

adgroup_tracking_features_t *adgroup_tracking_features_parseFromJSON(cJSON *adgroup_tracking_featuresJSON);

cJSON *adgroup_tracking_features_convertToJSON(adgroup_tracking_features_t *adgroup_tracking_features);

#endif /* _adgroup_tracking_features_H_ */

