/*
 * billing_profiles_get_200_response.h
 *
 * 
 */

#ifndef _billing_profiles_get_200_response_H_
#define _billing_profiles_get_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct billing_profiles_get_200_response_t billing_profiles_get_200_response_t;

#include "billing_profiles_response.h"



typedef struct billing_profiles_get_200_response_t {
    list_t *items; //nonprimitive container
    char *bookmark; // string

} billing_profiles_get_200_response_t;

billing_profiles_get_200_response_t *billing_profiles_get_200_response_create(
    list_t *items,
    char *bookmark
);

void billing_profiles_get_200_response_free(billing_profiles_get_200_response_t *billing_profiles_get_200_response);

billing_profiles_get_200_response_t *billing_profiles_get_200_response_parseFromJSON(cJSON *billing_profiles_get_200_responseJSON);

cJSON *billing_profiles_get_200_response_convertToJSON(billing_profiles_get_200_response_t *billing_profiles_get_200_response);

#endif /* _billing_profiles_get_200_response_H_ */

