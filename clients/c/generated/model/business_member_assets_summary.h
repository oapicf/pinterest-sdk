/*
 * business_member_assets_summary.h
 *
 * Ad accounts and profiles the business member/partner has access to.
 */

#ifndef _business_member_assets_summary_H_
#define _business_member_assets_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct business_member_assets_summary_t business_member_assets_summary_t;

#include "business_member_assets_summary_ad_accounts_inner.h"
#include "business_member_assets_summary_profiles_inner.h"



typedef struct business_member_assets_summary_t {
    list_t *ad_accounts; //nonprimitive container
    list_t *profiles; //nonprimitive container

} business_member_assets_summary_t;

business_member_assets_summary_t *business_member_assets_summary_create(
    list_t *ad_accounts,
    list_t *profiles
);

void business_member_assets_summary_free(business_member_assets_summary_t *business_member_assets_summary);

business_member_assets_summary_t *business_member_assets_summary_parseFromJSON(cJSON *business_member_assets_summaryJSON);

cJSON *business_member_assets_summary_convertToJSON(business_member_assets_summary_t *business_member_assets_summary);

#endif /* _business_member_assets_summary_H_ */

