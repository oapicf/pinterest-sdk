/*
 * content_type.h
 *
 * 
 */

#ifndef _content_type_H_
#define _content_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct content_type_t content_type_t;


// Enum  for content_type

typedef enum { pinterest_rest_api_content_type__NULL = 0, pinterest_rest_api_content_type__image/jpeg, pinterest_rest_api_content_type__image/png } pinterest_rest_api_content_type__e;

char* content_type_content_type_ToString(pinterest_rest_api_content_type__e content_type);

pinterest_rest_api_content_type__e content_type_content_type_FromString(char* content_type);

cJSON *content_type_convertToJSON(pinterest_rest_api_content_type__e content_type);

pinterest_rest_api_content_type__e content_type_parseFromJSON(cJSON *content_typeJSON);

#endif /* _content_type_H_ */

