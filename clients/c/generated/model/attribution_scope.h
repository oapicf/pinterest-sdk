/*
 * attribution_scope.h
 *
 * Ad event type used for attribution.
 */

#ifndef _attribution_scope_H_
#define _attribution_scope_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct attribution_scope_t attribution_scope_t;


// Enum  for attribution_scope

typedef enum { pinterest_rest_api_attribution_scope__NULL = 0, pinterest_rest_api_attribution_scope__view, pinterest_rest_api_attribution_scope__engagement, pinterest_rest_api_attribution_scope__click } pinterest_rest_api_attribution_scope__e;

char* attribution_scope_attribution_scope_ToString(pinterest_rest_api_attribution_scope__e attribution_scope);

pinterest_rest_api_attribution_scope__e attribution_scope_attribution_scope_FromString(char* attribution_scope);

cJSON *attribution_scope_convertToJSON(pinterest_rest_api_attribution_scope__e attribution_scope);

pinterest_rest_api_attribution_scope__e attribution_scope_parseFromJSON(cJSON *attribution_scopeJSON);

#endif /* _attribution_scope_H_ */

