/*
 * invite_action_result_item.h
 *
 * An item representing the result of an invite/request action. Contains either an exception (on error) or an invite binding (on success).
 */

#ifndef _invite_action_result_item_H_
#define _invite_action_result_item_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct invite_action_result_item_t invite_action_result_item_t;

#include "invite_business_role_binding.h"
#include "invite_exception_response.h"



typedef struct invite_action_result_item_t {
    struct invite_exception_response_t *exception; //model
    struct invite_business_role_binding_t *invite; //model

    int _library_owned; // Is the library responsible for freeing this object?
} invite_action_result_item_t;

__attribute__((deprecated)) invite_action_result_item_t *invite_action_result_item_create(
    invite_exception_response_t *exception,
    invite_business_role_binding_t *invite
);

void invite_action_result_item_free(invite_action_result_item_t *invite_action_result_item);

invite_action_result_item_t *invite_action_result_item_parseFromJSON(cJSON *invite_action_result_itemJSON);

cJSON *invite_action_result_item_convertToJSON(invite_action_result_item_t *invite_action_result_item);

#endif /* _invite_action_result_item_H_ */

