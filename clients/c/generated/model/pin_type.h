/*
 * pin_type.h
 *
 * 
 */

#ifndef _pin_type_H_
#define _pin_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pin_type_t pin_type_t;


// Enum  for pin_type

typedef enum { pinterest_rest_api_pin_type__NULL = 0, pinterest_rest_api_pin_type___PRIVATE } pinterest_rest_api_pin_type__e;

char* pin_type_pin_type_ToString(pinterest_rest_api_pin_type__e pin_type);

pinterest_rest_api_pin_type__e pin_type_pin_type_FromString(char* pin_type);

cJSON *pin_type_convertToJSON(pinterest_rest_api_pin_type__e pin_type);

pinterest_rest_api_pin_type__e pin_type_parseFromJSON(cJSON *pin_typeJSON);

#endif /* _pin_type_H_ */

