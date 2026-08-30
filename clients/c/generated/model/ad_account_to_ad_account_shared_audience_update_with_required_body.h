/*
 * ad_account_to_ad_account_shared_audience_update_with_required_body.h
 *
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */

#ifndef _ad_account_to_ad_account_shared_audience_update_with_required_body_H_
#define _ad_account_to_ad_account_shared_audience_update_with_required_body_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_account_to_ad_account_shared_audience_update_with_required_body_t ad_account_to_ad_account_shared_audience_update_with_required_body_t;

#include "operation_type.h"



typedef struct ad_account_to_ad_account_shared_audience_update_with_required_body_t {
    char *audience_id; // string
    pinterest_rest_api_operation_type__e operation_type; //referenced enum
    list_t *recipient_account_ids; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} ad_account_to_ad_account_shared_audience_update_with_required_body_t;

__attribute__((deprecated)) ad_account_to_ad_account_shared_audience_update_with_required_body_t *ad_account_to_ad_account_shared_audience_update_with_required_body_create(
    char *audience_id,
    pinterest_rest_api_operation_type__e operation_type,
    list_t *recipient_account_ids
);

void ad_account_to_ad_account_shared_audience_update_with_required_body_free(ad_account_to_ad_account_shared_audience_update_with_required_body_t *ad_account_to_ad_account_shared_audience_update_with_required_body);

ad_account_to_ad_account_shared_audience_update_with_required_body_t *ad_account_to_ad_account_shared_audience_update_with_required_body_parseFromJSON(cJSON *ad_account_to_ad_account_shared_audience_update_with_required_bodyJSON);

cJSON *ad_account_to_ad_account_shared_audience_update_with_required_body_convertToJSON(ad_account_to_ad_account_shared_audience_update_with_required_body_t *ad_account_to_ad_account_shared_audience_update_with_required_body);

#endif /* _ad_account_to_ad_account_shared_audience_update_with_required_body_H_ */

