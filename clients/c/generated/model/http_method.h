/*
 * http_method.h
 *
 * HTTP request method.
 */

#ifndef _http_method_H_
#define _http_method_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct http_method_t http_method_t;


// Enum  for http_method

typedef enum { pinterest_rest_api_http_method__NULL = 0, pinterest_rest_api_http_method__GET, pinterest_rest_api_http_method__HEAD, pinterest_rest_api_http_method__POST, pinterest_rest_api_http_method__PUT, pinterest_rest_api_http_method___DELETE, pinterest_rest_api_http_method__CONNECT, pinterest_rest_api_http_method__OPTIONS, pinterest_rest_api_http_method__TRACE, pinterest_rest_api_http_method__PATCH } pinterest_rest_api_http_method__e;

char* http_method_http_method_ToString(pinterest_rest_api_http_method__e http_method);

pinterest_rest_api_http_method__e http_method_http_method_FromString(char* http_method);

cJSON *http_method_convertToJSON(pinterest_rest_api_http_method__e http_method);

pinterest_rest_api_http_method__e http_method_parseFromJSON(cJSON *http_methodJSON);

#endif /* _http_method_H_ */

