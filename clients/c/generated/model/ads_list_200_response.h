/*
 * ads_list_200_response.h
 *
 * 
 */

#ifndef _ads_list_200_response_H_
#define _ads_list_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ads_list_200_response_t ads_list_200_response_t;

#include "ad.h"



typedef struct ads_list_200_response_t {
    char *bookmark; // string
    list_t *items; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} ads_list_200_response_t;

__attribute__((deprecated)) ads_list_200_response_t *ads_list_200_response_create(
    char *bookmark,
    list_t *items
);

void ads_list_200_response_free(ads_list_200_response_t *ads_list_200_response);

ads_list_200_response_t *ads_list_200_response_parseFromJSON(cJSON *ads_list_200_responseJSON);

cJSON *ads_list_200_response_convertToJSON(ads_list_200_response_t *ads_list_200_response);

#endif /* _ads_list_200_response_H_ */

