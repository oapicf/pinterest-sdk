/*
 * invite_assets_summary_profiles_inner.h
 *
 * 
 */

#ifndef _invite_assets_summary_profiles_inner_H_
#define _invite_assets_summary_profiles_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct invite_assets_summary_profiles_inner_t invite_assets_summary_profiles_inner_t;




typedef struct invite_assets_summary_profiles_inner_t {
    char *id; // string
    list_t *permissions; //primitive container

} invite_assets_summary_profiles_inner_t;

invite_assets_summary_profiles_inner_t *invite_assets_summary_profiles_inner_create(
    char *id,
    list_t *permissions
);

void invite_assets_summary_profiles_inner_free(invite_assets_summary_profiles_inner_t *invite_assets_summary_profiles_inner);

invite_assets_summary_profiles_inner_t *invite_assets_summary_profiles_inner_parseFromJSON(cJSON *invite_assets_summary_profiles_innerJSON);

cJSON *invite_assets_summary_profiles_inner_convertToJSON(invite_assets_summary_profiles_inner_t *invite_assets_summary_profiles_inner);

#endif /* _invite_assets_summary_profiles_inner_H_ */

