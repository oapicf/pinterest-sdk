/*
 * audience_create_request_1_audience_type.h
 *
 * 
 */

#ifndef _audience_create_request_1_audience_type_H_
#define _audience_create_request_1_audience_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audience_create_request_1_audience_type_t audience_create_request_1_audience_type_t;




typedef struct audience_create_request_1_audience_type_t {

} audience_create_request_1_audience_type_t;

audience_create_request_1_audience_type_t *audience_create_request_1_audience_type_create(
);

void audience_create_request_1_audience_type_free(audience_create_request_1_audience_type_t *audience_create_request_1_audience_type);

audience_create_request_1_audience_type_t *audience_create_request_1_audience_type_parseFromJSON(cJSON *audience_create_request_1_audience_typeJSON);

cJSON *audience_create_request_1_audience_type_convertToJSON(audience_create_request_1_audience_type_t *audience_create_request_1_audience_type);

#endif /* _audience_create_request_1_audience_type_H_ */

