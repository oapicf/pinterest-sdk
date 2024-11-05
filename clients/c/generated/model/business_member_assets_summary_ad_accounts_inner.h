/*
 * business_member_assets_summary_ad_accounts_inner.h
 *
 * 
 */

#ifndef _business_member_assets_summary_ad_accounts_inner_H_
#define _business_member_assets_summary_ad_accounts_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct business_member_assets_summary_ad_accounts_inner_t business_member_assets_summary_ad_accounts_inner_t;




typedef struct business_member_assets_summary_ad_accounts_inner_t {
    char *id; // string
    list_t *permissions; //primitive container

} business_member_assets_summary_ad_accounts_inner_t;

business_member_assets_summary_ad_accounts_inner_t *business_member_assets_summary_ad_accounts_inner_create(
    char *id,
    list_t *permissions
);

void business_member_assets_summary_ad_accounts_inner_free(business_member_assets_summary_ad_accounts_inner_t *business_member_assets_summary_ad_accounts_inner);

business_member_assets_summary_ad_accounts_inner_t *business_member_assets_summary_ad_accounts_inner_parseFromJSON(cJSON *business_member_assets_summary_ad_accounts_innerJSON);

cJSON *business_member_assets_summary_ad_accounts_inner_convertToJSON(business_member_assets_summary_ad_accounts_inner_t *business_member_assets_summary_ad_accounts_inner);

#endif /* _business_member_assets_summary_ad_accounts_inner_H_ */

