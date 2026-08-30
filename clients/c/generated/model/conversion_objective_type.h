/*
 * conversion_objective_type.h
 *
 * Intended result of the campaign. You can only update objectives for draft campaigns. &#x60;WEB_SESSIONS&#x60; and &#x60;VIDEO_VIEW&#x60; objectives are deprecated. We recommend using &#x60;VIDEO_COMPLETION&#x60; as an alternative for the latter.
 */

#ifndef _conversion_objective_type_H_
#define _conversion_objective_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_objective_type_t conversion_objective_type_t;


// Enum  for conversion_objective_type

typedef enum { pinterest_rest_api_conversion_objective_type__NULL = 0, pinterest_rest_api_conversion_objective_type__AWARENESS, pinterest_rest_api_conversion_objective_type__CONSIDERATION, pinterest_rest_api_conversion_objective_type__WEB_CONVERSION, pinterest_rest_api_conversion_objective_type__CATALOG_SALES, pinterest_rest_api_conversion_objective_type__VIDEO_COMPLETION, pinterest_rest_api_conversion_objective_type__APP_INSTALL, pinterest_rest_api_conversion_objective_type__SALES, pinterest_rest_api_conversion_objective_type__LEADS, pinterest_rest_api_conversion_objective_type__CTV_CONSIDERATION } pinterest_rest_api_conversion_objective_type__e;

char* conversion_objective_type_conversion_objective_type_ToString(pinterest_rest_api_conversion_objective_type__e conversion_objective_type);

pinterest_rest_api_conversion_objective_type__e conversion_objective_type_conversion_objective_type_FromString(char* conversion_objective_type);

cJSON *conversion_objective_type_convertToJSON(pinterest_rest_api_conversion_objective_type__e conversion_objective_type);

pinterest_rest_api_conversion_objective_type__e conversion_objective_type_parseFromJSON(cJSON *conversion_objective_typeJSON);

#endif /* _conversion_objective_type_H_ */

