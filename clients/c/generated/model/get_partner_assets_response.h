/*
 * get_partner_assets_response.h
 *
 * An object containing the permissions a you/your business partner has on the asset.
 */

#ifndef _get_partner_assets_response_H_
#define _get_partner_assets_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_partner_assets_response_t get_partner_assets_response_t;

#include "asset_group_binding.h"



typedef struct get_partner_assets_response_t {
    char *asset_id; // string
    char *asset_type; // string
    list_t *permissions; //primitive container
    struct asset_group_binding_t *asset_group_info; //model

} get_partner_assets_response_t;

get_partner_assets_response_t *get_partner_assets_response_create(
    char *asset_id,
    char *asset_type,
    list_t *permissions,
    asset_group_binding_t *asset_group_info
);

void get_partner_assets_response_free(get_partner_assets_response_t *get_partner_assets_response);

get_partner_assets_response_t *get_partner_assets_response_parseFromJSON(cJSON *get_partner_assets_responseJSON);

cJSON *get_partner_assets_response_convertToJSON(get_partner_assets_response_t *get_partner_assets_response);

#endif /* _get_partner_assets_response_H_ */

