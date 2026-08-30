#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/pinterest_lib_error.h"
#include "../model/pinterest_lib_pagination_order.h"
#include "../model/promotion.h"
#include "../model/promotion_batch_update.h"
#include "../model/promotion_create.h"
#include "../model/promotions_list_200_response.h"
#include "../model/promotions_response.h"

// Enum  for PromotionsAPI_promotionsList
typedef enum  { pinterest_rest_api_promotionsList__NULL = 0, pinterest_rest_api_promotionsList__ASCENDING, pinterest_rest_api_promotionsList__DESCENDING } pinterest_rest_api_promotionsList_order_e;


// Create promotions
//
// Create multiple new promotions.
//
promotions_response_t*
PromotionsAPI_promotionsCreate(apiClient_t *apiClient, char *ad_account_id, list_t *promotion_create);


// Delete promotion by id
//
// Delete a promotion within Pinterest.
//
promotion_t*
PromotionsAPI_promotionsDelete(apiClient_t *apiClient, char *promotion_id, char *ad_account_id);


// Get promotion by id
//
// Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.
//
promotion_t*
PromotionsAPI_promotionsGet(apiClient_t *apiClient, char *promotion_id, char *ad_account_id);


// Get promotions
//
// Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.
//
promotions_list_200_response_t*
PromotionsAPI_promotionsList(apiClient_t *apiClient, char *ad_account_id, char *bookmark, int *page_size, pinterest_lib_pagination_order_e order);


// Update promotions
//
// Update multiple promotions.
//
promotions_response_t*
PromotionsAPI_promotionsUpdate(apiClient_t *apiClient, char *ad_account_id, list_t *promotion_batch_update);


