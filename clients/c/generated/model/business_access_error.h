/*
 * business_access_error.h
 *
 * 
 */

#ifndef _business_access_error_H_
#define _business_access_error_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct business_access_error_t business_access_error_t;




typedef struct business_access_error_t {
    int code; //numeric
    char *message; // string

} business_access_error_t;

business_access_error_t *business_access_error_create(
    int code,
    char *message
);

void business_access_error_free(business_access_error_t *business_access_error);

business_access_error_t *business_access_error_parseFromJSON(cJSON *business_access_errorJSON);

cJSON *business_access_error_convertToJSON(business_access_error_t *business_access_error);

#endif /* _business_access_error_H_ */

