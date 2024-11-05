/*
 * match_type_response.h
 *
 * Keyword match type
 */

#ifndef _match_type_response_H_
#define _match_type_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct match_type_response_t match_type_response_t;


// Enum  for match_type_response

typedef enum { pinterest_rest_api_match_type_response__NULL = 0, pinterest_rest_api_match_type_response__BROAD, pinterest_rest_api_match_type_response__PHRASE, pinterest_rest_api_match_type_response__EXACT, pinterest_rest_api_match_type_response__EXACT_NEGATIVE, pinterest_rest_api_match_type_response__PHRASE_NEGATIVE } pinterest_rest_api_match_type_response__e;

char* match_type_response_match_type_response_ToString(pinterest_rest_api_match_type_response__e match_type_response);

pinterest_rest_api_match_type_response__e match_type_response_match_type_response_FromString(char* match_type_response);

//cJSON *match_type_response_match_type_response_convertToJSON(pinterest_rest_api_match_type_response__e match_type_response);

//pinterest_rest_api_match_type_response__e match_type_response_match_type_response_parseFromJSON(cJSON *match_type_responseJSON);

#endif /* _match_type_response_H_ */

