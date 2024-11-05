/*
 * invite_assets_summary.h
 *
 * Ad accounts and profiles the member/partner will be granted access to with this invite/request.
 */

#ifndef _invite_assets_summary_H_
#define _invite_assets_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct invite_assets_summary_t invite_assets_summary_t;

#include "invite_assets_summary_ad_accounts_inner.h"
#include "invite_assets_summary_profiles_inner.h"



typedef struct invite_assets_summary_t {
    list_t *ad_accounts; //nonprimitive container
    list_t *profiles; //nonprimitive container

} invite_assets_summary_t;

invite_assets_summary_t *invite_assets_summary_create(
    list_t *ad_accounts,
    list_t *profiles
);

void invite_assets_summary_free(invite_assets_summary_t *invite_assets_summary);

invite_assets_summary_t *invite_assets_summary_parseFromJSON(cJSON *invite_assets_summaryJSON);

cJSON *invite_assets_summary_convertToJSON(invite_assets_summary_t *invite_assets_summary);

#endif /* _invite_assets_summary_H_ */

