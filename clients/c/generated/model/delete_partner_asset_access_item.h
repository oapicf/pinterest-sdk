/*
 * delete_partner_asset_access_item.h
 *
 * 
 */

#ifndef _delete_partner_asset_access_item_H_
#define _delete_partner_asset_access_item_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct delete_partner_asset_access_item_t delete_partner_asset_access_item_t;


// Enum PARTNERTYPE for delete_partner_asset_access_item

typedef enum  { pinterest_rest_api_delete_partner_asset_access_item_PARTNERTYPE_NULL = 0, pinterest_rest_api_delete_partner_asset_access_item_PARTNERTYPE_INTERNAL, pinterest_rest_api_delete_partner_asset_access_item_PARTNERTYPE_EXTERNAL } pinterest_rest_api_delete_partner_asset_access_item_PARTNERTYPE_e;

char* delete_partner_asset_access_item_partner_type_ToString(pinterest_rest_api_delete_partner_asset_access_item_PARTNERTYPE_e partner_type);

pinterest_rest_api_delete_partner_asset_access_item_PARTNERTYPE_e delete_partner_asset_access_item_partner_type_FromString(char* partner_type);



typedef struct delete_partner_asset_access_item_t {
    char *asset_id; // string
    char *partner_id; // string
    pinterest_rest_api_delete_partner_asset_access_item_PARTNERTYPE_e partner_type; //enum

    int _library_owned; // Is the library responsible for freeing this object?
} delete_partner_asset_access_item_t;

__attribute__((deprecated)) delete_partner_asset_access_item_t *delete_partner_asset_access_item_create(
    char *asset_id,
    char *partner_id,
    pinterest_rest_api_delete_partner_asset_access_item_PARTNERTYPE_e partner_type
);

void delete_partner_asset_access_item_free(delete_partner_asset_access_item_t *delete_partner_asset_access_item);

delete_partner_asset_access_item_t *delete_partner_asset_access_item_parseFromJSON(cJSON *delete_partner_asset_access_itemJSON);

cJSON *delete_partner_asset_access_item_convertToJSON(delete_partner_asset_access_item_t *delete_partner_asset_access_item);

#endif /* _delete_partner_asset_access_item_H_ */

