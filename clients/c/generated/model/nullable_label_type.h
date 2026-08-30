/*
 * nullable_label_type.h
 *
 * Category for the labeled items. You can apply one BRAND label to a campaign. You can apply 30 CUSTOM labels to a campaign.
 */

#ifndef _nullable_label_type_H_
#define _nullable_label_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct nullable_label_type_t nullable_label_type_t;


// Enum  for nullable_label_type

typedef enum { pinterest_rest_api_nullable_label_type__NULL = 0, pinterest_rest_api_nullable_label_type__BRAND, pinterest_rest_api_nullable_label_type__CUSTOM } pinterest_rest_api_nullable_label_type__e;

char* nullable_label_type_nullable_label_type_ToString(pinterest_rest_api_nullable_label_type__e nullable_label_type);

pinterest_rest_api_nullable_label_type__e nullable_label_type_nullable_label_type_FromString(char* nullable_label_type);

cJSON *nullable_label_type_convertToJSON(pinterest_rest_api_nullable_label_type__e nullable_label_type);

pinterest_rest_api_nullable_label_type__e nullable_label_type_parseFromJSON(cJSON *nullable_label_typeJSON);

#endif /* _nullable_label_type_H_ */

