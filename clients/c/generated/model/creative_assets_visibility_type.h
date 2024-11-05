/*
 * creative_assets_visibility_type.h
 *
 * Creative assets visibility.
 */

#ifndef _creative_assets_visibility_type_H_
#define _creative_assets_visibility_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct creative_assets_visibility_type_t creative_assets_visibility_type_t;


// Enum  for creative_assets_visibility_type

typedef enum { pinterest_rest_api_creative_assets_visibility_type__NULL = 0, pinterest_rest_api_creative_assets_visibility_type__VISIBLE, pinterest_rest_api_creative_assets_visibility_type__HIDDEN } pinterest_rest_api_creative_assets_visibility_type__e;

char* creative_assets_visibility_type_creative_assets_visibility_type_ToString(pinterest_rest_api_creative_assets_visibility_type__e creative_assets_visibility_type);

pinterest_rest_api_creative_assets_visibility_type__e creative_assets_visibility_type_creative_assets_visibility_type_FromString(char* creative_assets_visibility_type);

//cJSON *creative_assets_visibility_type_creative_assets_visibility_type_convertToJSON(pinterest_rest_api_creative_assets_visibility_type__e creative_assets_visibility_type);

//pinterest_rest_api_creative_assets_visibility_type__e creative_assets_visibility_type_creative_assets_visibility_type_parseFromJSON(cJSON *creative_assets_visibility_typeJSON);

#endif /* _creative_assets_visibility_type_H_ */

