/*
 * campaign_ad_preview_create_200_response_inner_data.h
 *
 * Created/updated resource on success or error details on failure
 */

#ifndef _campaign_ad_preview_create_200_response_inner_data_H_
#define _campaign_ad_preview_create_200_response_inner_data_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_ad_preview_create_200_response_inner_data_t campaign_ad_preview_create_200_response_inner_data_t;

#include "campaign_ad_preview.h"
#include "campaign_ad_preview_create_200_response_inner_data_one_of.h"
#include "pinterest_lib_error.h"



typedef struct campaign_ad_preview_create_200_response_inner_data_t {
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
    struct pinterest_lib_error_t *exceptions; //model

    int _library_owned; // Is the library responsible for freeing this object?
} campaign_ad_preview_create_200_response_inner_data_t;

__attribute__((deprecated)) campaign_ad_preview_create_200_response_inner_data_t *campaign_ad_preview_create_200_response_inner_data_create(
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
    char *uuid,
    pinterest_lib_error_t *exceptions
);

void campaign_ad_preview_create_200_response_inner_data_free(campaign_ad_preview_create_200_response_inner_data_t *campaign_ad_preview_create_200_response_inner_data);

campaign_ad_preview_create_200_response_inner_data_t *campaign_ad_preview_create_200_response_inner_data_parseFromJSON(cJSON *campaign_ad_preview_create_200_response_inner_dataJSON);

cJSON *campaign_ad_preview_create_200_response_inner_data_convertToJSON(campaign_ad_preview_create_200_response_inner_data_t *campaign_ad_preview_create_200_response_inner_data);

#endif /* _campaign_ad_preview_create_200_response_inner_data_H_ */

