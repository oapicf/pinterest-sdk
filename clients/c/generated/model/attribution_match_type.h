/*
 * attribution_match_type.h
 *
 * Match type for an attributed event. P for probabilistic, D for deterministic, NA for Not applicable.
 */

#ifndef _attribution_match_type_H_
#define _attribution_match_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct attribution_match_type_t attribution_match_type_t;


// Enum  for attribution_match_type

typedef enum { pinterest_rest_api_attribution_match_type__NULL = 0, pinterest_rest_api_attribution_match_type__P, pinterest_rest_api_attribution_match_type__D, pinterest_rest_api_attribution_match_type__NA } pinterest_rest_api_attribution_match_type__e;

char* attribution_match_type_attribution_match_type_ToString(pinterest_rest_api_attribution_match_type__e attribution_match_type);

pinterest_rest_api_attribution_match_type__e attribution_match_type_attribution_match_type_FromString(char* attribution_match_type);

cJSON *attribution_match_type_convertToJSON(pinterest_rest_api_attribution_match_type__e attribution_match_type);

pinterest_rest_api_attribution_match_type__e attribution_match_type_parseFromJSON(cJSON *attribution_match_typeJSON);

#endif /* _attribution_match_type_H_ */

