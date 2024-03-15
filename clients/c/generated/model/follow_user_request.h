/*
 * follow_user_request.h
 *
 * 
 */

#ifndef _follow_user_request_H_
#define _follow_user_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct follow_user_request_t follow_user_request_t;




typedef struct follow_user_request_t {
    int auto_follow; //boolean

} follow_user_request_t;

follow_user_request_t *follow_user_request_create(
    int auto_follow
);

void follow_user_request_free(follow_user_request_t *follow_user_request);

follow_user_request_t *follow_user_request_parseFromJSON(cJSON *follow_user_requestJSON);

cJSON *follow_user_request_convertToJSON(follow_user_request_t *follow_user_request);

#endif /* _follow_user_request_H_ */

