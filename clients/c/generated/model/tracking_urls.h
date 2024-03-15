/*
 * tracking_urls.h
 *
 * Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.
 */

#ifndef _tracking_urls_H_
#define _tracking_urls_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct tracking_urls_t tracking_urls_t;




typedef struct tracking_urls_t {
    list_t *impression; //primitive container
    list_t *click; //primitive container
    list_t *engagement; //primitive container
    list_t *buyable_button; //primitive container
    list_t *audience_verification; //primitive container

} tracking_urls_t;

tracking_urls_t *tracking_urls_create(
    list_t *impression,
    list_t *click,
    list_t *engagement,
    list_t *buyable_button,
    list_t *audience_verification
);

void tracking_urls_free(tracking_urls_t *tracking_urls);

tracking_urls_t *tracking_urls_parseFromJSON(cJSON *tracking_urlsJSON);

cJSON *tracking_urls_convertToJSON(tracking_urls_t *tracking_urls);

#endif /* _tracking_urls_H_ */

