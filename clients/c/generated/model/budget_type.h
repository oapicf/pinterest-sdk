/*
 * budget_type.h
 *
 * Budget type. If DAILY, an ad group&#39;s daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group &#x60;start_time&#x60; and &#x60;end_time&#x60; range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. For CBO campaigns, only \&quot;CBO_ADGROUP\&quot; is allowed. For WEB_SESSIONS campaigns, only \&quot;LIFETIME\&quot; is allowed. For update, only draft ad groups may update budget type.
 */

#ifndef _budget_type_H_
#define _budget_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct budget_type_t budget_type_t;


// Enum  for budget_type

typedef enum { pinterest_rest_api_budget_type__NULL = 0, pinterest_rest_api_budget_type__DAILY, pinterest_rest_api_budget_type__LIFETIME, pinterest_rest_api_budget_type__CBO_ADGROUP } pinterest_rest_api_budget_type__e;

char* budget_type_budget_type_ToString(pinterest_rest_api_budget_type__e budget_type);

pinterest_rest_api_budget_type__e budget_type_budget_type_FromString(char* budget_type);

//cJSON *budget_type_budget_type_convertToJSON(pinterest_rest_api_budget_type__e budget_type);

//pinterest_rest_api_budget_type__e budget_type_budget_type_parseFromJSON(cJSON *budget_typeJSON);

#endif /* _budget_type_H_ */

