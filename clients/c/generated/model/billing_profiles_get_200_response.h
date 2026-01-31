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
    char *bookmark; // string
    list_t *items; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} billing_profiles_get_200_response_t;

__attribute__((deprecated)) billing_profiles_get_200_response_t *billing_profiles_get_200_response_create(
    char *bookmark,
    list_t *items
);

void billing_profiles_get_200_response_free(billing_profiles_get_200_response_t *billing_profiles_get_200_response);

billing_profiles_get_200_response_t *billing_profiles_get_200_response_parseFromJSON(cJSON *billing_profiles_get_200_responseJSON);

cJSON *billing_profiles_get_200_response_convertToJSON(billing_profiles_get_200_response_t *billing_profiles_get_200_response);

#endif /* _billing_profiles_get_200_response_H_ */

