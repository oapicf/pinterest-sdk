/*
 * followers_list_200_response.h
 *
 * 
 */

#ifndef _followers_list_200_response_H_
#define _followers_list_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct followers_list_200_response_t followers_list_200_response_t;

#include "user_summary.h"



typedef struct followers_list_200_response_t {
    list_t *items; //nonprimitive container
    char *bookmark; // string

} followers_list_200_response_t;

followers_list_200_response_t *followers_list_200_response_create(
    list_t *items,
    char *bookmark
);

void followers_list_200_response_free(followers_list_200_response_t *followers_list_200_response);

followers_list_200_response_t *followers_list_200_response_parseFromJSON(cJSON *followers_list_200_responseJSON);

cJSON *followers_list_200_response_convertToJSON(followers_list_200_response_t *followers_list_200_response);

#endif /* _followers_list_200_response_H_ */
