/*
 * campaign_ad_preview_create_200_response_inner_data_one_of.h
 *
 * 
 */

#ifndef _campaign_ad_preview_create_200_response_inner_data_one_of_H_
#define _campaign_ad_preview_create_200_response_inner_data_one_of_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_ad_preview_create_200_response_inner_data_one_of_t campaign_ad_preview_create_200_response_inner_data_one_of_t;

#include "pinterest_lib_error.h"



typedef struct campaign_ad_preview_create_200_response_inner_data_one_of_t {
    struct pinterest_lib_error_t *exceptions; //model

    int _library_owned; // Is the library responsible for freeing this object?
} campaign_ad_preview_create_200_response_inner_data_one_of_t;

__attribute__((deprecated)) campaign_ad_preview_create_200_response_inner_data_one_of_t *campaign_ad_preview_create_200_response_inner_data_one_of_create(
    pinterest_lib_error_t *exceptions
);

void campaign_ad_preview_create_200_response_inner_data_one_of_free(campaign_ad_preview_create_200_response_inner_data_one_of_t *campaign_ad_preview_create_200_response_inner_data_one_of);

campaign_ad_preview_create_200_response_inner_data_one_of_t *campaign_ad_preview_create_200_response_inner_data_one_of_parseFromJSON(cJSON *campaign_ad_preview_create_200_response_inner_data_one_ofJSON);

cJSON *campaign_ad_preview_create_200_response_inner_data_one_of_convertToJSON(campaign_ad_preview_create_200_response_inner_data_one_of_t *campaign_ad_preview_create_200_response_inner_data_one_of);

#endif /* _campaign_ad_preview_create_200_response_inner_data_one_of_H_ */

