/*
 * ad_accounts_catalogs_product_groups_list_200_response.h
 *
 * 
 */

#ifndef _ad_accounts_catalogs_product_groups_list_200_response_H_
#define _ad_accounts_catalogs_product_groups_list_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_accounts_catalogs_product_groups_list_200_response_t ad_accounts_catalogs_product_groups_list_200_response_t;

#include "catalog_product_group.h"



typedef struct ad_accounts_catalogs_product_groups_list_200_response_t {
    list_t *items; //nonprimitive container
    char *bookmark; // string

} ad_accounts_catalogs_product_groups_list_200_response_t;

ad_accounts_catalogs_product_groups_list_200_response_t *ad_accounts_catalogs_product_groups_list_200_response_create(
    list_t *items,
    char *bookmark
);

void ad_accounts_catalogs_product_groups_list_200_response_free(ad_accounts_catalogs_product_groups_list_200_response_t *ad_accounts_catalogs_product_groups_list_200_response);

ad_accounts_catalogs_product_groups_list_200_response_t *ad_accounts_catalogs_product_groups_list_200_response_parseFromJSON(cJSON *ad_accounts_catalogs_product_groups_list_200_responseJSON);

cJSON *ad_accounts_catalogs_product_groups_list_200_response_convertToJSON(ad_accounts_catalogs_product_groups_list_200_response_t *ad_accounts_catalogs_product_groups_list_200_response);

#endif /* _ad_accounts_catalogs_product_groups_list_200_response_H_ */

