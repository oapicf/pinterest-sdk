/*
 * media_upload_type.h
 *
 * 
 */

#ifndef _media_upload_type_H_
#define _media_upload_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct media_upload_type_t media_upload_type_t;


// Enum  for media_upload_type

typedef enum { pinterest_rest_api_media_upload_type__NULL = 0, pinterest_rest_api_media_upload_type__video } pinterest_rest_api_media_upload_type__e;

char* media_upload_type_media_upload_type_ToString(pinterest_rest_api_media_upload_type__e media_upload_type);

pinterest_rest_api_media_upload_type__e media_upload_type_media_upload_type_FromString(char* media_upload_type);

//cJSON *media_upload_type_media_upload_type_convertToJSON(pinterest_rest_api_media_upload_type__e media_upload_type);

//pinterest_rest_api_media_upload_type__e media_upload_type_media_upload_type_parseFromJSON(cJSON *media_upload_typeJSON);

#endif /* _media_upload_type_H_ */

