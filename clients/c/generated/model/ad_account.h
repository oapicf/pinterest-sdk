/*
 * ad_account.h
 *
 * 
 */

#ifndef _ad_account_H_
#define _ad_account_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_account_t ad_account_t;

#include "ad_account_owner.h"
#include "business_access_role.h"
#include "country.h"
#include "currency.h"

// Enum  for ad_account

typedef enum  { pinterest_rest_api_ad_account__NULL = 0, pinterest_rest_api_ad_account__OWNER, pinterest_rest_api_ad_account__ADMIN, pinterest_rest_api_ad_account__ANALYST, pinterest_rest_api_ad_account__SOS_READER, pinterest_rest_api_ad_account__FINANCE_MANAGER, pinterest_rest_api_ad_account__AUDIENCE_MANAGER, pinterest_rest_api_ad_account__CAMPAIGN_MANAGER, pinterest_rest_api_ad_account__CATALOGS_MANAGER, pinterest_rest_api_ad_account__RESTRICTED_OWNER, pinterest_rest_api_ad_account__PROFILE_MANAGER, pinterest_rest_api_ad_account__PROFILE_PUBLISHER, pinterest_rest_api_ad_account__RESOURCE_PINNER_LIST_OWNER, pinterest_rest_api_ad_account__RESOURCE_PINNER_LIST_READER, pinterest_rest_api_ad_account__BIZ_PINNER_LIST_SHARER, pinterest_rest_api_ad_account__RESOURCE_CONVERSION_TAGS_READER } pinterest_rest_api_ad_account__e;

char* ad_account_permissions_ToString(pinterest_rest_api_ad_account__e permissions);

pinterest_rest_api_ad_account__e ad_account_permissions_FromString(char* permissions);



typedef struct ad_account_t {
    char *id; // string
    char *name; // string
    struct ad_account_owner_t *owner; //model
    pinterest_rest_api_country__e country; //referenced enum
    pinterest_rest_api_currency__e currency; //referenced enum
    list_t *permissions; //nonprimitive container
    int created_time; //numeric
    int updated_time; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} ad_account_t;

__attribute__((deprecated)) ad_account_t *ad_account_create(
    char *id,
    char *name,
    ad_account_owner_t *owner,
    pinterest_rest_api_country__e country,
    pinterest_rest_api_currency__e currency,
    list_t *permissions,
    int created_time,
    int updated_time
);

void ad_account_free(ad_account_t *ad_account);

ad_account_t *ad_account_parseFromJSON(cJSON *ad_accountJSON);

cJSON *ad_account_convertToJSON(ad_account_t *ad_account);

#endif /* _ad_account_H_ */

