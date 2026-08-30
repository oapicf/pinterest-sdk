/*
 * ad_account_entity_type.h
 *
 * Specify the entity type to get summary information
 */

#ifndef _ad_account_entity_type_H_
#define _ad_account_entity_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_account_entity_type_t ad_account_entity_type_t;


// Enum  for ad_account_entity_type

typedef enum { pinterest_rest_api_ad_account_entity_type__NULL = 0, pinterest_rest_api_ad_account_entity_type__ADVERTISER, pinterest_rest_api_ad_account_entity_type__CAMPAIGN, pinterest_rest_api_ad_account_entity_type__AD_GROUP, pinterest_rest_api_ad_account_entity_type__AD } pinterest_rest_api_ad_account_entity_type__e;

char* ad_account_entity_type_ad_account_entity_type_ToString(pinterest_rest_api_ad_account_entity_type__e ad_account_entity_type);

pinterest_rest_api_ad_account_entity_type__e ad_account_entity_type_ad_account_entity_type_FromString(char* ad_account_entity_type);

cJSON *ad_account_entity_type_convertToJSON(pinterest_rest_api_ad_account_entity_type__e ad_account_entity_type);

pinterest_rest_api_ad_account_entity_type__e ad_account_entity_type_parseFromJSON(cJSON *ad_account_entity_typeJSON);

#endif /* _ad_account_entity_type_H_ */

