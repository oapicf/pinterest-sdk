/*
 * delete_partners_request.h
 *
 * 
 */

#ifndef _delete_partners_request_H_
#define _delete_partners_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct delete_partners_request_t delete_partners_request_t;




typedef struct delete_partners_request_t {
    list_t *partner_ids; //primitive container
    char *partner_type; // string

} delete_partners_request_t;

delete_partners_request_t *delete_partners_request_create(
    list_t *partner_ids,
    char *partner_type
);

void delete_partners_request_free(delete_partners_request_t *delete_partners_request);

delete_partners_request_t *delete_partners_request_parseFromJSON(cJSON *delete_partners_requestJSON);

cJSON *delete_partners_request_convertToJSON(delete_partners_request_t *delete_partners_request);

#endif /* _delete_partners_request_H_ */

