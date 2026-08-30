/*
 * campaign_ad_preview_create_200_response_inner.h
 *
 * 
 */

#ifndef _campaign_ad_preview_create_200_response_inner_H_
#define _campaign_ad_preview_create_200_response_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_ad_preview_create_200_response_inner_t campaign_ad_preview_create_200_response_inner_t;

#include "campaign_ad_preview_create_200_response_inner_data.h"



typedef struct campaign_ad_preview_create_200_response_inner_t {
    struct campaign_ad_preview_create_200_response_inner_data_t *data; //model

    int _library_owned; // Is the library responsible for freeing this object?
} campaign_ad_preview_create_200_response_inner_t;

__attribute__((deprecated)) campaign_ad_preview_create_200_response_inner_t *campaign_ad_preview_create_200_response_inner_create(
    campaign_ad_preview_create_200_response_inner_data_t *data
);

void campaign_ad_preview_create_200_response_inner_free(campaign_ad_preview_create_200_response_inner_t *campaign_ad_preview_create_200_response_inner);

campaign_ad_preview_create_200_response_inner_t *campaign_ad_preview_create_200_response_inner_parseFromJSON(cJSON *campaign_ad_preview_create_200_response_innerJSON);

cJSON *campaign_ad_preview_create_200_response_inner_convertToJSON(campaign_ad_preview_create_200_response_inner_t *campaign_ad_preview_create_200_response_inner);

#endif /* _campaign_ad_preview_create_200_response_inner_H_ */

