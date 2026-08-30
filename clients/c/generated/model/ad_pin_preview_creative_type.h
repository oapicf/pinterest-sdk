/*
 * ad_pin_preview_creative_type.h
 *
 * 
 */

#ifndef _ad_pin_preview_creative_type_H_
#define _ad_pin_preview_creative_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_pin_preview_creative_type_t ad_pin_preview_creative_type_t;


// Enum  for ad_pin_preview_creative_type

typedef enum { pinterest_rest_api_ad_pin_preview_creative_type__NULL = 0, pinterest_rest_api_ad_pin_preview_creative_type__SHOPPING, pinterest_rest_api_ad_pin_preview_creative_type__COLLECTION, pinterest_rest_api_ad_pin_preview_creative_type__MAX_VIDEO, pinterest_rest_api_ad_pin_preview_creative_type__MAX_WIDTH_VIDEO_COLLECTION, pinterest_rest_api_ad_pin_preview_creative_type__MAX_WIDTH_REGULAR_COLLECTION } pinterest_rest_api_ad_pin_preview_creative_type__e;

char* ad_pin_preview_creative_type_ad_pin_preview_creative_type_ToString(pinterest_rest_api_ad_pin_preview_creative_type__e ad_pin_preview_creative_type);

pinterest_rest_api_ad_pin_preview_creative_type__e ad_pin_preview_creative_type_ad_pin_preview_creative_type_FromString(char* ad_pin_preview_creative_type);

cJSON *ad_pin_preview_creative_type_convertToJSON(pinterest_rest_api_ad_pin_preview_creative_type__e ad_pin_preview_creative_type);

pinterest_rest_api_ad_pin_preview_creative_type__e ad_pin_preview_creative_type_parseFromJSON(cJSON *ad_pin_preview_creative_typeJSON);

#endif /* _ad_pin_preview_creative_type_H_ */

