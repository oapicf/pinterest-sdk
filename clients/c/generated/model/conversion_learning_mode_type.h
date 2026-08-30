/*
 * conversion_learning_mode_type.h
 *
 * oCPM learn mode.
 */

#ifndef _conversion_learning_mode_type_H_
#define _conversion_learning_mode_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_learning_mode_type_t conversion_learning_mode_type_t;


// Enum  for conversion_learning_mode_type

typedef enum { pinterest_rest_api_conversion_learning_mode_type__NULL = 0, pinterest_rest_api_conversion_learning_mode_type__NOT_ACTIVE, pinterest_rest_api_conversion_learning_mode_type__ACTIVE } pinterest_rest_api_conversion_learning_mode_type__e;

char* conversion_learning_mode_type_conversion_learning_mode_type_ToString(pinterest_rest_api_conversion_learning_mode_type__e conversion_learning_mode_type);

pinterest_rest_api_conversion_learning_mode_type__e conversion_learning_mode_type_conversion_learning_mode_type_FromString(char* conversion_learning_mode_type);

cJSON *conversion_learning_mode_type_convertToJSON(pinterest_rest_api_conversion_learning_mode_type__e conversion_learning_mode_type);

pinterest_rest_api_conversion_learning_mode_type__e conversion_learning_mode_type_parseFromJSON(cJSON *conversion_learning_mode_typeJSON);

#endif /* _conversion_learning_mode_type_H_ */

