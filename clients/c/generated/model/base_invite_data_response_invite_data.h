/*
 * base_invite_data_response_invite_data.h
 *
 * Metadata for the invite/request.
 */

#ifndef _base_invite_data_response_invite_data_H_
#define _base_invite_data_response_invite_data_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct base_invite_data_response_invite_data_t base_invite_data_response_invite_data_t;




typedef struct base_invite_data_response_invite_data_t {
    int invite_expiration; //numeric
    char *invite_status; // string
    char *invite_type; // string
    int last_updated_time; //numeric
    int sent_at; //numeric

} base_invite_data_response_invite_data_t;

base_invite_data_response_invite_data_t *base_invite_data_response_invite_data_create(
    int invite_expiration,
    char *invite_status,
    char *invite_type,
    int last_updated_time,
    int sent_at
);

void base_invite_data_response_invite_data_free(base_invite_data_response_invite_data_t *base_invite_data_response_invite_data);

base_invite_data_response_invite_data_t *base_invite_data_response_invite_data_parseFromJSON(cJSON *base_invite_data_response_invite_dataJSON);

cJSON *base_invite_data_response_invite_data_convertToJSON(base_invite_data_response_invite_data_t *base_invite_data_response_invite_data);

#endif /* _base_invite_data_response_invite_data_H_ */

