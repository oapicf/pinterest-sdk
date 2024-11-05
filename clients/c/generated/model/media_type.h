/*
 * media_type.h
 *
 * 
 */

#ifndef _media_type_H_
#define _media_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct media_type_t media_type_t;


// Enum  for media_type

typedef enum { pinterest_rest_api_media_type__NULL = 0, pinterest_rest_api_media_type__IMAGE, pinterest_rest_api_media_type__VIDEO } pinterest_rest_api_media_type__e;

char* media_type_media_type_ToString(pinterest_rest_api_media_type__e media_type);

pinterest_rest_api_media_type__e media_type_media_type_FromString(char* media_type);

//cJSON *media_type_media_type_convertToJSON(pinterest_rest_api_media_type__e media_type);

//pinterest_rest_api_media_type__e media_type_media_type_parseFromJSON(cJSON *media_typeJSON);

#endif /* _media_type_H_ */

