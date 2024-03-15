/*
 * ad_group_common_tracking_urls.h
 *
 * Third-party tracking URLs.&lt;br&gt; JSON object with the format: {\&quot;&lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\&quot;&gt;Tracking event enum&lt;/a&gt;\&quot;:[URL string array],...}&lt;br&gt; For example: {\&quot;impression\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;], \&quot;click\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;, \&quot;URL3\&quot;]}.&lt;br&gt;Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.&lt;br&gt;&lt;br&gt; For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.
 */

#ifndef _ad_group_common_tracking_urls_H_
#define _ad_group_common_tracking_urls_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_group_common_tracking_urls_t ad_group_common_tracking_urls_t;




typedef struct ad_group_common_tracking_urls_t {
    list_t *impression; //primitive container
    list_t *click; //primitive container
    list_t *engagement; //primitive container
    list_t *buyable_button; //primitive container
    list_t *audience_verification; //primitive container

} ad_group_common_tracking_urls_t;

ad_group_common_tracking_urls_t *ad_group_common_tracking_urls_create(
    list_t *impression,
    list_t *click,
    list_t *engagement,
    list_t *buyable_button,
    list_t *audience_verification
);

void ad_group_common_tracking_urls_free(ad_group_common_tracking_urls_t *ad_group_common_tracking_urls);

ad_group_common_tracking_urls_t *ad_group_common_tracking_urls_parseFromJSON(cJSON *ad_group_common_tracking_urlsJSON);

cJSON *ad_group_common_tracking_urls_convertToJSON(ad_group_common_tracking_urls_t *ad_group_common_tracking_urls);

#endif /* _ad_group_common_tracking_urls_H_ */

