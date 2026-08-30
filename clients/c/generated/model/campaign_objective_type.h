/*
 * campaign_objective_type.h
 *
 * Campaign objective type. If set as one of [\&quot;AWARENESS\&quot;, \&quot;CONSIDERATION\&quot;, \&quot;WEB_CONVERSION\&quot;, \&quot;CATALOG_SALES\&quot;, \&quot;VIDEO_COMPLETION\&quot;, \&quot;CTV_CONSIDERATION\&quot;] the campaign is considered as a Campaign Budget Optimization (CBO) campaign, meaning budget needs to be set at the campaign level rather than at the ad group level. [\&quot;WEB_SESSIONS\&quot;] is DEPRECATED. &#x60;VIDEO_VIEW&#x60; is deprecated; use &#x60;VIDEO_COMPLETION&#x60; instead. &#x60;CTV_CONSIDERATION&#x60; is in BETA. For update, only draft campaigns may update objective type.
 */

#ifndef _campaign_objective_type_H_
#define _campaign_objective_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_objective_type_t campaign_objective_type_t;


// Enum  for campaign_objective_type

typedef enum { pinterest_rest_api_campaign_objective_type__NULL = 0, pinterest_rest_api_campaign_objective_type__AWARENESS, pinterest_rest_api_campaign_objective_type__CONSIDERATION, pinterest_rest_api_campaign_objective_type__VIDEO_VIEW, pinterest_rest_api_campaign_objective_type__WEB_CONVERSION, pinterest_rest_api_campaign_objective_type__CATALOG_SALES, pinterest_rest_api_campaign_objective_type__WEB_SESSIONS, pinterest_rest_api_campaign_objective_type__VIDEO_COMPLETION, pinterest_rest_api_campaign_objective_type__APP_INSTALL, pinterest_rest_api_campaign_objective_type__SALES, pinterest_rest_api_campaign_objective_type__LEADS, pinterest_rest_api_campaign_objective_type__CTV_CONSIDERATION } pinterest_rest_api_campaign_objective_type__e;

char* campaign_objective_type_campaign_objective_type_ToString(pinterest_rest_api_campaign_objective_type__e campaign_objective_type);

pinterest_rest_api_campaign_objective_type__e campaign_objective_type_campaign_objective_type_FromString(char* campaign_objective_type);

cJSON *campaign_objective_type_convertToJSON(pinterest_rest_api_campaign_objective_type__e campaign_objective_type);

pinterest_rest_api_campaign_objective_type__e campaign_objective_type_parseFromJSON(cJSON *campaign_objective_typeJSON);

#endif /* _campaign_objective_type_H_ */

