/*
 * delete_member_access_result.h
 *
 * The terminated asset access.
 */

#ifndef _delete_member_access_result_H_
#define _delete_member_access_result_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct delete_member_access_result_t delete_member_access_result_t;




typedef struct delete_member_access_result_t {
    char *asset_id; // string
    char *member_id; // string

} delete_member_access_result_t;

delete_member_access_result_t *delete_member_access_result_create(
    char *asset_id,
    char *member_id
);

void delete_member_access_result_free(delete_member_access_result_t *delete_member_access_result);

delete_member_access_result_t *delete_member_access_result_parseFromJSON(cJSON *delete_member_access_resultJSON);

cJSON *delete_member_access_result_convertToJSON(delete_member_access_result_t *delete_member_access_result);

#endif /* _delete_member_access_result_H_ */

