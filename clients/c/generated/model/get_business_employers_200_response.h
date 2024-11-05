/*
 * get_business_employers_200_response.h
 *
 * 
 */

#ifndef _get_business_employers_200_response_H_
#define _get_business_employers_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_business_employers_200_response_t get_business_employers_200_response_t;

#include "user_business_role_binding.h"



typedef struct get_business_employers_200_response_t {
    list_t *items; //nonprimitive container
    char *bookmark; // string

} get_business_employers_200_response_t;

get_business_employers_200_response_t *get_business_employers_200_response_create(
    list_t *items,
    char *bookmark
);

void get_business_employers_200_response_free(get_business_employers_200_response_t *get_business_employers_200_response);

get_business_employers_200_response_t *get_business_employers_200_response_parseFromJSON(cJSON *get_business_employers_200_responseJSON);

cJSON *get_business_employers_200_response_convertToJSON(get_business_employers_200_response_t *get_business_employers_200_response);

#endif /* _get_business_employers_200_response_H_ */

