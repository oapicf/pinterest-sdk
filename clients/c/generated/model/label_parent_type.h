/*
 * label_parent_type.h
 *
 * Label parent entity type.
 */

#ifndef _label_parent_type_H_
#define _label_parent_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct label_parent_type_t label_parent_type_t;


// Enum  for label_parent_type

typedef enum { pinterest_rest_api_label_parent_type__NULL = 0, pinterest_rest_api_label_parent_type__CAMPAIGN } pinterest_rest_api_label_parent_type__e;

char* label_parent_type_label_parent_type_ToString(pinterest_rest_api_label_parent_type__e label_parent_type);

pinterest_rest_api_label_parent_type__e label_parent_type_label_parent_type_FromString(char* label_parent_type);

cJSON *label_parent_type_convertToJSON(pinterest_rest_api_label_parent_type__e label_parent_type);

pinterest_rest_api_label_parent_type__e label_parent_type_parseFromJSON(cJSON *label_parent_typeJSON);

#endif /* _label_parent_type_H_ */

