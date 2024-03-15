/*
 * objective_type.h
 *
 * Campaign objective type. If set as one of [\&quot;AWARENESS\&quot;, \&quot;CONSIDERATION\&quot;, \&quot;WEB_CONVERSION\&quot;, \&quot;CATALOG_SALES\&quot;] the campaign is considered as a Campaign Budget Optimization (CBO) campaign, meaning budget needs to be set at the campaign level rather than at the ad group level. [\&quot;WEB_SESSIONS\&quot;] in BETA. For update, only draft campaigns may update objective type.
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

typedef enum { pinterest_rest_api_objective_type__NULL = 0, pinterest_rest_api_objective_type__AWARENESS, pinterest_rest_api_objective_type__CONSIDERATION, pinterest_rest_api_objective_type__VIDEO_VIEW, pinterest_rest_api_objective_type__WEB_CONVERSION, pinterest_rest_api_objective_type__CATALOG_SALES, pinterest_rest_api_objective_type__WEB_SESSIONS } pinterest_rest_api_objective_type__e;

char* objective_type_objective_type_ToString(pinterest_rest_api_objective_type__e objective_type);

pinterest_rest_api_objective_type__e objective_type_objective_type_FromString(char* objective_type);

//cJSON *objective_type_objective_type_convertToJSON(pinterest_rest_api_objective_type__e objective_type);

//pinterest_rest_api_objective_type__e objective_type_objective_type_parseFromJSON(cJSON *objective_typeJSON);

#endif /* _objective_type_H_ */

