/*
 * delete_partner_assets_result.h
 *
 * The terminated asset access.
 */

#ifndef _delete_partner_assets_result_H_
#define _delete_partner_assets_result_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct delete_partner_assets_result_t delete_partner_assets_result_t;




typedef struct delete_partner_assets_result_t {
    char *asset_id; // string
    char *asset_type; // string
    list_t *permissions; //primitive container
    int is_shared_partner; //boolean
    char *partner_id; // string

} delete_partner_assets_result_t;

delete_partner_assets_result_t *delete_partner_assets_result_create(
    char *asset_id,
    char *asset_type,
    list_t *permissions,
    int is_shared_partner,
    char *partner_id
);

void delete_partner_assets_result_free(delete_partner_assets_result_t *delete_partner_assets_result);

delete_partner_assets_result_t *delete_partner_assets_result_parseFromJSON(cJSON *delete_partner_assets_resultJSON);

cJSON *delete_partner_assets_result_convertToJSON(delete_partner_assets_result_t *delete_partner_assets_result);

#endif /* _delete_partner_assets_result_H_ */

