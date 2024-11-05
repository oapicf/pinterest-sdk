/*
 * audience_account_type.h
 *
 * 
 */

#ifndef _audience_account_type_H_
#define _audience_account_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audience_account_type_t audience_account_type_t;


// Enum  for audience_account_type

typedef enum { pinterest_rest_api_audience_account_type__NULL = 0, pinterest_rest_api_audience_account_type__AD_ACCOUNT, pinterest_rest_api_audience_account_type__BUSINESS_ACCOUNT } pinterest_rest_api_audience_account_type__e;

char* audience_account_type_audience_account_type_ToString(pinterest_rest_api_audience_account_type__e audience_account_type);

pinterest_rest_api_audience_account_type__e audience_account_type_audience_account_type_FromString(char* audience_account_type);

//cJSON *audience_account_type_audience_account_type_convertToJSON(pinterest_rest_api_audience_account_type__e audience_account_type);

//pinterest_rest_api_audience_account_type__e audience_account_type_audience_account_type_parseFromJSON(cJSON *audience_account_typeJSON);

#endif /* _audience_account_type_H_ */

