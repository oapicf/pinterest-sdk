/*
 * invite_status.h
 *
 * The current status of the invite.
 */

#ifndef _invite_status_H_
#define _invite_status_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct invite_status_t invite_status_t;


// Enum  for invite_status

typedef enum { pinterest_rest_api_invite_status__NULL = 0, pinterest_rest_api_invite_status__PENDING, pinterest_rest_api_invite_status__ACCEPTED, pinterest_rest_api_invite_status__DECLINED, pinterest_rest_api_invite_status__CANCELLED, pinterest_rest_api_invite_status__EXPIRED } pinterest_rest_api_invite_status__e;

char* invite_status_invite_status_ToString(pinterest_rest_api_invite_status__e invite_status);

pinterest_rest_api_invite_status__e invite_status_invite_status_FromString(char* invite_status);

//cJSON *invite_status_invite_status_convertToJSON(pinterest_rest_api_invite_status__e invite_status);

//pinterest_rest_api_invite_status__e invite_status_invite_status_parseFromJSON(cJSON *invite_statusJSON);

#endif /* _invite_status_H_ */

