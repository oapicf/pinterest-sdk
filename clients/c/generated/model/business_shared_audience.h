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



typedef struct business_shared_audience_t {
    char *audience_id; // string
    pinterest_rest_api_operation_type__e operation_type; //referenced enum
    list_t *recipient_business_ids; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} business_shared_audience_t;

__attribute__((deprecated)) business_shared_audience_t *business_shared_audience_create(
    char *audience_id,
    pinterest_rest_api_operation_type__e operation_type,
    list_t *recipient_business_ids
);

void business_shared_audience_free(business_shared_audience_t *business_shared_audience);

business_shared_audience_t *business_shared_audience_parseFromJSON(cJSON *business_shared_audienceJSON);

cJSON *business_shared_audience_convertToJSON(business_shared_audience_t *business_shared_audience);

#endif /* _business_shared_audience_H_ */

