/*
 * base_preferred_media_type.h
 *
 * 
 */

#ifndef _base_preferred_media_type_H_
#define _base_preferred_media_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct base_preferred_media_type_t base_preferred_media_type_t;


// Enum  for base_preferred_media_type

typedef enum { pinterest_rest_api_base_preferred_media_type__NULL = 0, pinterest_rest_api_base_preferred_media_type__VIDEO, pinterest_rest_api_base_preferred_media_type__IMAGE } pinterest_rest_api_base_preferred_media_type__e;

char* base_preferred_media_type_base_preferred_media_type_ToString(pinterest_rest_api_base_preferred_media_type__e base_preferred_media_type);

pinterest_rest_api_base_preferred_media_type__e base_preferred_media_type_base_preferred_media_type_FromString(char* base_preferred_media_type);

cJSON *base_preferred_media_type_convertToJSON(pinterest_rest_api_base_preferred_media_type__e base_preferred_media_type);

pinterest_rest_api_base_preferred_media_type__e base_preferred_media_type_parseFromJSON(cJSON *base_preferred_media_typeJSON);

#endif /* _base_preferred_media_type_H_ */

