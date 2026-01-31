#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/error.h"
#include "../model/promotion_create_request.h"
#include "../model/promotion_response.h"
#include "../model/promotion_update_request.h"
#include "../model/promotions_list_200_response.h"
#include "../model/promotions_response.h"

// Enum ORDER for PromotionsAPI_promotionsList
typedef enum  { pinterest_rest_api_promotionsList_ORDER_NULL = 0, pinterest_rest_api_promotionsList_ORDER_ASCENDING, pinterest_rest_api_promotionsList_ORDER_DESCENDING } pinterest_rest_api_promotionsList_order_e;


// Create promotions
//
// Create multiple new promotions.
//
promotions_response_t*
PromotionsAPI_promotionsCreate(apiClient_t *apiClient, char *ad_account_id, list_t *promotion_create_request);


// Delete promotion by id
//
// Delete a promotion within Pinterest.
//
void
PromotionsAPI_promotionsDelete(apiClient_t *apiClient, char *ad_account_id, char *promotion_id);


// Get promotion by id
//
// Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.
//
promotion_response_t*
PromotionsAPI_promotionsGet(apiClient_t *apiClient, char *ad_account_id, char *promotion_id);


// Get promotions
//
// Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.
//
promotions_list_200_response_t*
PromotionsAPI_promotionsList(apiClient_t *apiClient, char *ad_account_id, int *page_size, pinterest_rest_api_promotionsList_order_e order, char *bookmark);


// Update promotions
//
// Update multiple promotions.
//
promotions_response_t*
PromotionsAPI_promotionsUpdate(apiClient_t *apiClient, char *ad_account_id, list_t *promotion_update_request);


