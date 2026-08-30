/*
 * ad_accounts_audience_rule.h
 *
 * JSON object defining targeted audience users. Example rule formats per audience type: CUSTOMER_LIST: { \&quot;customer_list_id\&quot;: \&quot;&lt;customer list ID&gt;\&quot;} ACTALIKE: { \&quot;seed_id\&quot;: [\&quot;&lt;audience ID&gt;\&quot;], \&quot;country\&quot;: \&quot;US\&quot;, \&quot;percentage\&quot;: \&quot;10\&quot; } (Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;. Percentage should be 1-10. The targeted audience should be this % size across Pinterest.) VISITOR: { \&quot;visitor_source_id\&quot;: [\&quot;&lt;conversion tag ID&gt;\&quot;], \&quot;retention_days\&quot;: \&quot;180\&quot;, \&quot;event_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;web\&quot;, \&quot;mobile\&quot;]}, \&quot;ingestion_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;tag\&quot;]}} (Retention days should be 1-540. Retention applies to specific customers.) ENGAGEMENT: {\&quot;engagement_domain\&quot;: [\&quot;www.example.com\&quot;], \&quot;engager_type\&quot;: 1} Learn more about [engagement audiences](/docs/work-with-targets-and-audiences/create-audiences/#engagement-audience).
 */

#ifndef _ad_accounts_audience_rule_H_
#define _ad_accounts_audience_rule_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_accounts_audience_rule_t ad_accounts_audience_rule_t;

#include "audience_objective_type.h"
#include "event_data.h"
#include "object.h"

// Enum  for ad_accounts_audience_rule

typedef enum  { pinterest_rest_api_ad_accounts_audience_rule__NULL = 0, pinterest_rest_api_ad_accounts_audience_rule__AWARENESS, pinterest_rest_api_ad_accounts_audience_rule__CONSIDERATION, pinterest_rest_api_ad_accounts_audience_rule__WEB_CONVERSION, pinterest_rest_api_ad_accounts_audience_rule__CATALOG_SALES, pinterest_rest_api_ad_accounts_audience_rule__VIDEO_COMPLETION, pinterest_rest_api_ad_accounts_audience_rule__SALES } pinterest_rest_api_ad_accounts_audience_rule__e;

char* ad_accounts_audience_rule_objective_type_ToString(pinterest_rest_api_ad_accounts_audience_rule__e objective_type);

pinterest_rest_api_ad_accounts_audience_rule__e ad_accounts_audience_rule_objective_type_FromString(char* objective_type);



typedef struct ad_accounts_audience_rule_t {
    char *ad_account_id; // string
    list_t *ad_id; //primitive container
    list_t *campaign_id; //primitive container
    char *country; // string
    char *customer_list_id; // string
    list_t *engagement_domain; //primitive container
    char *engagement_type; // string
    int *engager_type; //numeric
    char *event; // string
    struct event_data_t *event_data; //model
    object_t *event_source; //object
    object_t *ingestion_source; //object
    list_t *objective_type; //nonprimitive container
    int *percentage; //numeric
    list_t *pin_id; //primitive container
    int *prefill; //boolean
    int *retention_days; //numeric
    list_t *seed_id; //primitive container
    list_t *url; //primitive container
    char *visitor_source_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} ad_accounts_audience_rule_t;

__attribute__((deprecated)) ad_accounts_audience_rule_t *ad_accounts_audience_rule_create(
    char *ad_account_id,
    list_t *ad_id,
    list_t *campaign_id,
    char *country,
    char *customer_list_id,
    list_t *engagement_domain,
    char *engagement_type,
    int *engager_type,
    char *event,
    event_data_t *event_data,
    object_t *event_source,
    object_t *ingestion_source,
    list_t *objective_type,
    int *percentage,
    list_t *pin_id,
    int *prefill,
    int *retention_days,
    list_t *seed_id,
    list_t *url,
    char *visitor_source_id
);

void ad_accounts_audience_rule_free(ad_accounts_audience_rule_t *ad_accounts_audience_rule);

ad_accounts_audience_rule_t *ad_accounts_audience_rule_parseFromJSON(cJSON *ad_accounts_audience_ruleJSON);

cJSON *ad_accounts_audience_rule_convertToJSON(ad_accounts_audience_rule_t *ad_accounts_audience_rule);

#endif /* _ad_accounts_audience_rule_H_ */

