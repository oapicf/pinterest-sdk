/*
 * nullalble_match_type.h
 *
 * Keyword match type allowing null
 */

#ifndef _nullalble_match_type_H_
#define _nullalble_match_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct nullalble_match_type_t nullalble_match_type_t;


// Enum  for nullalble_match_type

typedef enum { pinterest_rest_api_nullalble_match_type__NULL = 0, pinterest_rest_api_nullalble_match_type__BROAD, pinterest_rest_api_nullalble_match_type__PHRASE, pinterest_rest_api_nullalble_match_type__EXACT, pinterest_rest_api_nullalble_match_type__EXACT_NEGATIVE, pinterest_rest_api_nullalble_match_type__PHRASE_NEGATIVE } pinterest_rest_api_nullalble_match_type__e;

char* nullalble_match_type_nullalble_match_type_ToString(pinterest_rest_api_nullalble_match_type__e nullalble_match_type);

pinterest_rest_api_nullalble_match_type__e nullalble_match_type_nullalble_match_type_FromString(char* nullalble_match_type);

cJSON *nullalble_match_type_convertToJSON(pinterest_rest_api_nullalble_match_type__e nullalble_match_type);

pinterest_rest_api_nullalble_match_type__e nullalble_match_type_parseFromJSON(cJSON *nullalble_match_typeJSON);

#endif /* _nullalble_match_type_H_ */

