/*
 * respond_to_invite_result_item.h
 *
 * 
 */

#ifndef _respond_to_invite_result_item_H_
#define _respond_to_invite_result_item_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct respond_to_invite_result_item_t respond_to_invite_result_item_t;

#include "base_invite_data_response.h"
#include "invite_exception_response.h"



typedef struct respond_to_invite_result_item_t {
    struct invite_exception_response_t *exception; //model
    struct base_invite_data_response_t *invite; //model

    int _library_owned; // Is the library responsible for freeing this object?
} respond_to_invite_result_item_t;

__attribute__((deprecated)) respond_to_invite_result_item_t *respond_to_invite_result_item_create(
    invite_exception_response_t *exception,
    base_invite_data_response_t *invite
);

void respond_to_invite_result_item_free(respond_to_invite_result_item_t *respond_to_invite_result_item);

respond_to_invite_result_item_t *respond_to_invite_result_item_parseFromJSON(cJSON *respond_to_invite_result_itemJSON);

cJSON *respond_to_invite_result_item_convertToJSON(respond_to_invite_result_item_t *respond_to_invite_result_item);

#endif /* _respond_to_invite_result_item_H_ */

