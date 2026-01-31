/*
 * objective_type.h
 *
 * Intended result of the campaign.  You can only update objectives for draft campaigns. &#x60;WEB_SESSIONS&#x60; and &#x60;VIDEO_VIEW&#x60; objectives are deprecated. We recommend using &#x60;VIDEO_COMPLETION&#x60; as an alternative for the latter. 
 */

#ifndef _objective_type_H_
#define _objective_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct objective_type_t objective_type_t;


// Enum  for objective_type

typedef enum { pinterest_rest_api_objective_type__NULL = 0, pinterest_rest_api_objective_type__AWARENESS, pinterest_rest_api_objective_type__CONSIDERATION, pinterest_rest_api_objective_type__WEB_CONVERSION, pinterest_rest_api_objective_type__CATALOG_SALES, pinterest_rest_api_objective_type__VIDEO_COMPLETION } pinterest_rest_api_objective_type__e;

char* objective_type_objective_type_ToString(pinterest_rest_api_objective_type__e objective_type);

pinterest_rest_api_objective_type__e objective_type_objective_type_FromString(char* objective_type);

cJSON *objective_type_convertToJSON(pinterest_rest_api_objective_type__e objective_type);

pinterest_rest_api_objective_type__e objective_type_parseFromJSON(cJSON *objective_typeJSON);

#endif /* _objective_type_H_ */

