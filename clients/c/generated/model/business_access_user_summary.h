/*
 * business_access_user_summary.h
 *
 * Metadata of the member/partner that has access to the asset.
 */

#ifndef _business_access_user_summary_H_
#define _business_access_user_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct business_access_user_summary_t business_access_user_summary_t;




typedef struct business_access_user_summary_t {
    char *email; // string
    char *id; // string
    char *username; // string

} business_access_user_summary_t;

business_access_user_summary_t *business_access_user_summary_create(
    char *email,
    char *id,
    char *username
);

void business_access_user_summary_free(business_access_user_summary_t *business_access_user_summary);

business_access_user_summary_t *business_access_user_summary_parseFromJSON(cJSON *business_access_user_summaryJSON);

cJSON *business_access_user_summary_convertToJSON(business_access_user_summary_t *business_access_user_summary);

#endif /* _business_access_user_summary_H_ */

