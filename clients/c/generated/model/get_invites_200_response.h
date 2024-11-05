/*
 * get_invites_200_response.h
 *
 * 
 */

#ifndef _get_invites_200_response_H_
#define _get_invites_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_invites_200_response_t get_invites_200_response_t;

#include "invite_response.h"



typedef struct get_invites_200_response_t {
    list_t *items; //nonprimitive container
    char *bookmark; // string

} get_invites_200_response_t;

get_invites_200_response_t *get_invites_200_response_create(
    list_t *items,
    char *bookmark
);

void get_invites_200_response_free(get_invites_200_response_t *get_invites_200_response);

get_invites_200_response_t *get_invites_200_response_parseFromJSON(cJSON *get_invites_200_responseJSON);

cJSON *get_invites_200_response_convertToJSON(get_invites_200_response_t *get_invites_200_response);

#endif /* _get_invites_200_response_H_ */

