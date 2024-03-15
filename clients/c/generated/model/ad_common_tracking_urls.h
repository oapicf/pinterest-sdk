/*
 * ad_common_tracking_urls.h
 *
 * 
 */

#ifndef _ad_common_tracking_urls_H_
#define _ad_common_tracking_urls_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_common_tracking_urls_t ad_common_tracking_urls_t;




typedef struct ad_common_tracking_urls_t {
    list_t *impression; //primitive container
    list_t *click; //primitive container
    list_t *engagement; //primitive container
    list_t *buyable_button; //primitive container
    list_t *audience_verification; //primitive container

} ad_common_tracking_urls_t;

ad_common_tracking_urls_t *ad_common_tracking_urls_create(
    list_t *impression,
    list_t *click,
    list_t *engagement,
    list_t *buyable_button,
    list_t *audience_verification
);

void ad_common_tracking_urls_free(ad_common_tracking_urls_t *ad_common_tracking_urls);

ad_common_tracking_urls_t *ad_common_tracking_urls_parseFromJSON(cJSON *ad_common_tracking_urlsJSON);

cJSON *ad_common_tracking_urls_convertToJSON(ad_common_tracking_urls_t *ad_common_tracking_urls);

#endif /* _ad_common_tracking_urls_H_ */

