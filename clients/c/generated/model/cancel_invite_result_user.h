/*
 * cancel_invite_result_user.h
 *
 * Metadata of the member/partner that has access to the asset.
 */

#ifndef _cancel_invite_result_user_H_
#define _cancel_invite_result_user_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct cancel_invite_result_user_t cancel_invite_result_user_t;




typedef struct cancel_invite_result_user_t {
    char *email; // string
    char *id; // string
    char *username; // string

    int _library_owned; // Is the library responsible for freeing this object?
} cancel_invite_result_user_t;

__attribute__((deprecated)) cancel_invite_result_user_t *cancel_invite_result_user_create(
    char *email,
    char *id,
    char *username
);

void cancel_invite_result_user_free(cancel_invite_result_user_t *cancel_invite_result_user);

cancel_invite_result_user_t *cancel_invite_result_user_parseFromJSON(cJSON *cancel_invite_result_userJSON);

cJSON *cancel_invite_result_user_convertToJSON(cancel_invite_result_user_t *cancel_invite_result_user);

#endif /* _cancel_invite_result_user_H_ */

