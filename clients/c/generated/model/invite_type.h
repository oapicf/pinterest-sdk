/*
 * invite_type.h
 *
 * The type of invite. &lt;br&gt;&#39;MEMBER_INVITE&#39; is to invite a member to access your business assets. &lt;br&gt;&#39;PARTNER INVITE&#39; is to invite a partner to access your business assets. &lt;br&gt;&#39;PARTNER_REQUEST&#39; is to request access a partner&#39;s business assets.
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

//cJSON *invite_type_invite_type_convertToJSON(pinterest_rest_api_invite_type__e invite_type);

//pinterest_rest_api_invite_type__e invite_type_invite_type_parseFromJSON(cJSON *invite_typeJSON);

#endif /* _invite_type_H_ */

