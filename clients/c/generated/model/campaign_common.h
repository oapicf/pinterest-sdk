/*
 * campaign_common.h
 *
 * Campaign Data
 */

#ifndef _campaign_common_H_
#define _campaign_common_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_common_t campaign_common_t;

#include "ad_common_tracking_urls.h"
#include "campaign_summary_status.h"
#include "entity_status.h"



typedef struct campaign_common_t {
    char *ad_account_id; // string
    char *name; // string
    entity_status_t *status; // custom
    int lifetime_spend_cap; //numeric
    int daily_spend_cap; //numeric
    char *order_line_id; // string
    struct ad_common_tracking_urls_t *tracking_urls; //model
    int start_time; //numeric
    int end_time; //numeric
    campaign_summary_status_t *summary_status; // custom

} campaign_common_t;

campaign_common_t *campaign_common_create(
    char *ad_account_id,
    char *name,
    entity_status_t *status,
    int lifetime_spend_cap,
    int daily_spend_cap,
    char *order_line_id,
    ad_common_tracking_urls_t *tracking_urls,
    int start_time,
    int end_time,
    campaign_summary_status_t *summary_status
);

void campaign_common_free(campaign_common_t *campaign_common);

campaign_common_t *campaign_common_parseFromJSON(cJSON *campaign_commonJSON);

cJSON *campaign_common_convertToJSON(campaign_common_t *campaign_common);

#endif /* _campaign_common_H_ */

