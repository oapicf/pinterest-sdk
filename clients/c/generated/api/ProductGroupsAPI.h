#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/ad_accounts_catalogs_product_groups_list_200_response.h"
#include "../model/error.h"


// Get catalog product groups
//
// This endpoint is completely deprecated. Please use <a href='/docs/api/v5/#operation/catalogs_product_groups/list'>List product groups</a> from Catalogs API instead.
//
ad_accounts_catalogs_product_groups_list_200_response_t*
ProductGroupsAPI_adAccountsCatalogsProductGroupsList(apiClient_t *apiClient, char *ad_account_id, char *feed_profile_id);


