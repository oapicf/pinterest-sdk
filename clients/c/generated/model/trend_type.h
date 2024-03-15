/*
 * trend_type.h
 *
 * 
 */

#ifndef _trend_type_H_
#define _trend_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct trend_type_t trend_type_t;


// Enum  for trend_type

typedef enum { pinterest_rest_api_trend_type__NULL = 0, pinterest_rest_api_trend_type__growing, pinterest_rest_api_trend_type__monthly, pinterest_rest_api_trend_type__yearly, pinterest_rest_api_trend_type__seasonal } pinterest_rest_api_trend_type__e;

char* trend_type_trend_type_ToString(pinterest_rest_api_trend_type__e trend_type);

pinterest_rest_api_trend_type__e trend_type_trend_type_FromString(char* trend_type);

//cJSON *trend_type_trend_type_convertToJSON(pinterest_rest_api_trend_type__e trend_type);

//pinterest_rest_api_trend_type__e trend_type_trend_type_parseFromJSON(cJSON *trend_typeJSON);

#endif /* _trend_type_H_ */

