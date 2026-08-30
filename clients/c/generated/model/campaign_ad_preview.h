/*
 * campaign_ad_preview.h
 *
 * Campaign ad preview record.
 */

#ifndef _campaign_ad_preview_H_
#define _campaign_ad_preview_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_ad_preview_t campaign_ad_preview_t;




typedef struct campaign_ad_preview_t {
    char *ad_account_id; // string
    char *ad_group_id; // string
    int *client_id; //numeric
    int *expires_at; //numeric
    int *is_active; //boolean
    int *pin_id; //numeric
    int *pin_promotion_id; //numeric
    int *promoted_product_group_id; //numeric
    char *url; // string
    int *user_id; //numeric
    char *uuid; // string

    int _library_owned; // Is the library responsible for freeing this object?
} campaign_ad_preview_t;

__attribute__((deprecated)) campaign_ad_preview_t *campaign_ad_preview_create(
    char *ad_account_id,
    char *ad_group_id,
    int *client_id,
    int *expires_at,
    int *is_active,
    int *pin_id,
    int *pin_promotion_id,
    int *promoted_product_group_id,
    char *url,
    int *user_id,
    char *uuid
);

void campaign_ad_preview_free(campaign_ad_preview_t *campaign_ad_preview);

campaign_ad_preview_t *campaign_ad_preview_parseFromJSON(cJSON *campaign_ad_previewJSON);

cJSON *campaign_ad_preview_convertToJSON(campaign_ad_preview_t *campaign_ad_preview);

#endif /* _campaign_ad_preview_H_ */

