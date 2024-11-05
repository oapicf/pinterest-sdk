/*
 * update_member_result.h
 *
 * 
 */

#ifndef _update_member_result_H_
#define _update_member_result_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_member_result_t update_member_result_t;




typedef struct update_member_result_t {
    char *business_role; // string
    char *member_id; // string

} update_member_result_t;

update_member_result_t *update_member_result_create(
    char *business_role,
    char *member_id
);

void update_member_result_free(update_member_result_t *update_member_result);

update_member_result_t *update_member_result_parseFromJSON(cJSON *update_member_resultJSON);

cJSON *update_member_result_convertToJSON(update_member_result_t *update_member_result);

#endif /* _update_member_result_H_ */

