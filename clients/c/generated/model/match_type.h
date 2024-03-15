/*
 * match_type.h
 *
 * Keyword match type
 */

#ifndef _match_type_H_
#define _match_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct match_type_t match_type_t;


// Enum  for match_type

typedef enum { pinterest_rest_api_match_type__NULL = 0, pinterest_rest_api_match_type__BROAD, pinterest_rest_api_match_type__PHRASE, pinterest_rest_api_match_type__EXACT, pinterest_rest_api_match_type__EXACT_NEGATIVE, pinterest_rest_api_match_type__PHRASE_NEGATIVE } pinterest_rest_api_match_type__e;

char* match_type_match_type_ToString(pinterest_rest_api_match_type__e match_type);

pinterest_rest_api_match_type__e match_type_match_type_FromString(char* match_type);

//cJSON *match_type_match_type_convertToJSON(pinterest_rest_api_match_type__e match_type);

//pinterest_rest_api_match_type__e match_type_match_type_parseFromJSON(cJSON *match_typeJSON);

#endif /* _match_type_H_ */

