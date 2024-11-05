/*
 * update_partner_assets_result.h
 *
 * An object containing the permissions a business partner has on the asset.
 */

#ifndef _update_partner_assets_result_H_
#define _update_partner_assets_result_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_partner_assets_result_t update_partner_assets_result_t;




typedef struct update_partner_assets_result_t {
    char *asset_id; // string
    char *asset_type; // string
    char *partner_id; // string
    list_t *permissions; //primitive container

} update_partner_assets_result_t;

update_partner_assets_result_t *update_partner_assets_result_create(
    char *asset_id,
    char *asset_type,
    char *partner_id,
    list_t *permissions
);

void update_partner_assets_result_free(update_partner_assets_result_t *update_partner_assets_result);

update_partner_assets_result_t *update_partner_assets_result_parseFromJSON(cJSON *update_partner_assets_resultJSON);

cJSON *update_partner_assets_result_convertToJSON(update_partner_assets_result_t *update_partner_assets_result);

#endif /* _update_partner_assets_result_H_ */

