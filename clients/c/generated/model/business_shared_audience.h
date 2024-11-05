/*
 * business_shared_audience.h
 *
 * 
 */

#ifndef _business_shared_audience_H_
#define _business_shared_audience_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct business_shared_audience_t business_shared_audience_t;

#include "operation_type.h"

// Enum  for business_shared_audience

typedef enum  { pinterest_rest_api_business_shared_audience__NULL = 0, pinterest_rest_api_business_shared_audience__SHARE, pinterest_rest_api_business_shared_audience__REVOKE } pinterest_rest_api_business_shared_audience__e;

char* business_shared_audience_operation_type_ToString(pinterest_rest_api_business_shared_audience__e operation_type);

pinterest_rest_api_business_shared_audience__e business_shared_audience_operation_type_FromString(char* operation_type);



typedef struct business_shared_audience_t {
    char *audience_id; // string
    operation_type_t *operation_type; // custom
    list_t *recipient_business_ids; //primitive container

} business_shared_audience_t;

business_shared_audience_t *business_shared_audience_create(
    char *audience_id,
    operation_type_t *operation_type,
    list_t *recipient_business_ids
);

void business_shared_audience_free(business_shared_audience_t *business_shared_audience);

business_shared_audience_t *business_shared_audience_parseFromJSON(cJSON *business_shared_audienceJSON);

cJSON *business_shared_audience_convertToJSON(business_shared_audience_t *business_shared_audience);

#endif /* _business_shared_audience_H_ */

