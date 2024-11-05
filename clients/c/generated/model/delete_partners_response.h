/*
 * delete_partners_response.h
 *
 * An object with a list of partners that were deleted.
 */

#ifndef _delete_partners_response_H_
#define _delete_partners_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct delete_partners_response_t delete_partners_response_t;




typedef struct delete_partners_response_t {
    list_t *deleted_partners; //primitive container

} delete_partners_response_t;

delete_partners_response_t *delete_partners_response_create(
    list_t *deleted_partners
);

void delete_partners_response_free(delete_partners_response_t *delete_partners_response);

delete_partners_response_t *delete_partners_response_parseFromJSON(cJSON *delete_partners_responseJSON);

cJSON *delete_partners_response_convertToJSON(delete_partners_response_t *delete_partners_response);

#endif /* _delete_partners_response_H_ */

