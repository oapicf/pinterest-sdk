/*
 * ad_review_status.h
 *
 * Ad review status
 */

#ifndef _ad_review_status_H_
#define _ad_review_status_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_review_status_t ad_review_status_t;


// Enum  for ad_review_status

typedef enum { pinterest_rest_api_ad_review_status__NULL = 0, pinterest_rest_api_ad_review_status__OTHER, pinterest_rest_api_ad_review_status__PENDING, pinterest_rest_api_ad_review_status__REJECTED, pinterest_rest_api_ad_review_status__APPROVED } pinterest_rest_api_ad_review_status__e;

char* ad_review_status_ad_review_status_ToString(pinterest_rest_api_ad_review_status__e ad_review_status);

pinterest_rest_api_ad_review_status__e ad_review_status_ad_review_status_FromString(char* ad_review_status);

cJSON *ad_review_status_convertToJSON(pinterest_rest_api_ad_review_status__e ad_review_status);

pinterest_rest_api_ad_review_status__e ad_review_status_parseFromJSON(cJSON *ad_review_statusJSON);

#endif /* _ad_review_status_H_ */

