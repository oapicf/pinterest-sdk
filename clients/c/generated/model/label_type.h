/*
 * label_type.h
 *
 * Category for the labeled items. You can apply one BRAND label to a campaign. You can apply 30 CUSTOM labels to a campaign.
 */

#ifndef _label_type_H_
#define _label_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct label_type_t label_type_t;


// Enum  for label_type

typedef enum { pinterest_rest_api_label_type__NULL = 0, pinterest_rest_api_label_type__BRAND, pinterest_rest_api_label_type__CUSTOM } pinterest_rest_api_label_type__e;

char* label_type_label_type_ToString(pinterest_rest_api_label_type__e label_type);

pinterest_rest_api_label_type__e label_type_label_type_FromString(char* label_type);

cJSON *label_type_convertToJSON(pinterest_rest_api_label_type__e label_type);

pinterest_rest_api_label_type__e label_type_parseFromJSON(cJSON *label_typeJSON);

#endif /* _label_type_H_ */

