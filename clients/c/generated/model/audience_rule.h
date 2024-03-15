/*
 * audience_rule.h
 *
 * JSON object defining targeted audience users. Example rule formats per audience type:&lt;br&gt;CUSTOMER_LIST: { \&quot;customer_list_id\&quot;: \&quot;&amp;lt;customer list ID&amp;gt;\&quot;}&lt;br&gt;ACTALIKE: { \&quot;seed_id\&quot;: [\&quot;&amp;lt;audience ID&amp;gt;\&quot;], \&quot;country\&quot;: \&quot;US\&quot;, \&quot;percentage\&quot;: \&quot;10\&quot; }&lt;br&gt;(Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;. Percentage should be 1-10.&lt;br&gt;The targeted audience should be this % size across Pinterest.)&lt;br&gt;VISITOR: { \&quot;visitor_source_id\&quot;: [\&quot;&amp;lt;conversion tag ID&amp;gt;\&quot;], \&quot;retention_days\&quot;: \&quot;180\&quot;, \&quot;event_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;web\&quot;, \&quot;mobile\&quot;]}, \&quot;ingestion_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;tag\&quot;]}}&lt;br&gt;(Retention days should be 1-540. Retention applies to specific customers.)&lt;br&gt;ENGAGEMENT: {\&quot;engagement_domain\&quot;: [\&quot;www.entomi.com\&quot;], \&quot;engager_type\&quot;: 1}&lt;br&gt;For more details on engagement audiences, see &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/adtech_ads_v4/#section/November-2021\&quot; target&#x3D;\&quot;_blank\&quot;&gt;November 2021 changelog&lt;/a&gt;.
 */

#ifndef _audience_rule_H_
#define _audience_rule_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audience_rule_t audience_rule_t;

#include "object.h"
#include "objective_type.h"
#include "pinterest_tag_event_data.h"

// Enum  for audience_rule

typedef enum  { pinterest_rest_api_audience_rule__NULL = 0, pinterest_rest_api_audience_rule__AWARENESS, pinterest_rest_api_audience_rule__CONSIDERATION, pinterest_rest_api_audience_rule__VIDEO_VIEW, pinterest_rest_api_audience_rule__WEB_CONVERSION, pinterest_rest_api_audience_rule__CATALOG_SALES, pinterest_rest_api_audience_rule__WEB_SESSIONS } pinterest_rest_api_audience_rule__e;

char* audience_rule_objective_type_ToString(pinterest_rest_api_audience_rule__e objective_type);

pinterest_rest_api_audience_rule__e audience_rule_objective_type_FromString(char* objective_type);



typedef struct audience_rule_t {
    char *country; // string
    char *customer_list_id; // string
    list_t *engagement_domain; //primitive container
    char *engagement_type; // string
    char *event; // string
    struct pinterest_tag_event_data_t *event_data; //model
    int percentage; //numeric
    list_t *pin_id; //primitive container
    int prefill; //boolean
    int retention_days; //numeric
    list_t *seed_id; //primitive container
    list_t *url; //primitive container
    char *visitor_source_id; // string
    object_t *event_source; //object
    object_t *ingestion_source; //object
    int engager_type; //numeric
    list_t *campaign_id; //primitive container
    list_t *ad_id; //primitive container
    list_t *objective_type; //nonprimitive container
    char *ad_account_id; // string

} audience_rule_t;

audience_rule_t *audience_rule_create(
    char *country,
    char *customer_list_id,
    list_t *engagement_domain,
    char *engagement_type,
    char *event,
    pinterest_tag_event_data_t *event_data,
    int percentage,
    list_t *pin_id,
    int prefill,
    int retention_days,
    list_t *seed_id,
    list_t *url,
    char *visitor_source_id,
    object_t *event_source,
    object_t *ingestion_source,
    int engager_type,
    list_t *campaign_id,
    list_t *ad_id,
    list_t *objective_type,
    char *ad_account_id
);

void audience_rule_free(audience_rule_t *audience_rule);

audience_rule_t *audience_rule_parseFromJSON(cJSON *audience_ruleJSON);

cJSON *audience_rule_convertToJSON(audience_rule_t *audience_rule);

#endif /* _audience_rule_H_ */

