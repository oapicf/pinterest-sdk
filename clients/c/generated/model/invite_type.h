/*
 * invite_type.h
 *
 * The type of invite. MEMBER_INVITE invites a member to access your business assets. PARTNER_INVITE invites a partner to access your business assets. PARTNER_REQUEST requests access to a partner&#39;s business assets.
 */

#ifndef _invite_type_H_
#define _invite_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct invite_type_t invite_type_t;


// Enum  for invite_type

typedef enum { pinterest_rest_api_invite_type__NULL = 0, pinterest_rest_api_invite_type__MEMBER_INVITE, pinterest_rest_api_invite_type__PARTNER_INVITE, pinterest_rest_api_invite_type__PARTNER_REQUEST } pinterest_rest_api_invite_type__e;

char* invite_type_invite_type_ToString(pinterest_rest_api_invite_type__e invite_type);

pinterest_rest_api_invite_type__e invite_type_invite_type_FromString(char* invite_type);

cJSON *invite_type_convertToJSON(pinterest_rest_api_invite_type__e invite_type);

pinterest_rest_api_invite_type__e invite_type_parseFromJSON(cJSON *invite_typeJSON);

#endif /* _invite_type_H_ */

