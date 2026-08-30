/*
 * ad_group_tracking_urls.h
 *
 *   Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for   each event type. Tracking URLs set at the ad group or ad level can override   those set at the campaign level. For more information, see [Third-party and dynamic tracking](https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking).
 */

#ifndef _ad_group_tracking_urls_H_
#define _ad_group_tracking_urls_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_group_tracking_urls_t ad_group_tracking_urls_t;




typedef struct ad_group_tracking_urls_t {
    list_t *audience_verification; //primitive container
    list_t *buyable_button; //primitive container
    list_t *click; //primitive container
    list_t *engagement; //primitive container
    list_t *impression; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} ad_group_tracking_urls_t;

__attribute__((deprecated)) ad_group_tracking_urls_t *ad_group_tracking_urls_create(
    list_t *audience_verification,
    list_t *buyable_button,
    list_t *click,
    list_t *engagement,
    list_t *impression
);

void ad_group_tracking_urls_free(ad_group_tracking_urls_t *ad_group_tracking_urls);

ad_group_tracking_urls_t *ad_group_tracking_urls_parseFromJSON(cJSON *ad_group_tracking_urlsJSON);

cJSON *ad_group_tracking_urls_convertToJSON(ad_group_tracking_urls_t *ad_group_tracking_urls);

#endif /* _ad_group_tracking_urls_H_ */

