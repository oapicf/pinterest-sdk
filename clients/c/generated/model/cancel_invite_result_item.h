/*
 * cancel_invite_result_item.h
 *
 * 
 */

#ifndef _cancel_invite_result_item_H_
#define _cancel_invite_result_item_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct cancel_invite_result_item_t cancel_invite_result_item_t;

#include "cancel_invite_exception.h"
#include "cancel_invite_result.h"



typedef struct cancel_invite_result_item_t {
    struct cancel_invite_exception_t *exception; //model
    struct cancel_invite_result_t *invite; //model

    int _library_owned; // Is the library responsible for freeing this object?
} cancel_invite_result_item_t;

__attribute__((deprecated)) cancel_invite_result_item_t *cancel_invite_result_item_create(
    cancel_invite_exception_t *exception,
    cancel_invite_result_t *invite
);

void cancel_invite_result_item_free(cancel_invite_result_item_t *cancel_invite_result_item);

cancel_invite_result_item_t *cancel_invite_result_item_parseFromJSON(cJSON *cancel_invite_result_itemJSON);

cJSON *cancel_invite_result_item_convertToJSON(cancel_invite_result_item_t *cancel_invite_result_item);

#endif /* _cancel_invite_result_item_H_ */

