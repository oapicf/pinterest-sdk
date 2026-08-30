#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/customer_segment.h"
#include "../model/customer_segment_create.h"
#include "../model/customer_segment_list_200_response.h"
#include "../model/customer_segment_update_request_update_with_required_body.h"
#include "../model/pinterest_lib_error.h"
#include "../model/pinterest_lib_pagination_order.h"

// Enum  for CustomerSegmentAPI_customerSegmentList
typedef enum  { pinterest_rest_api_customerSegmentList__NULL = 0, pinterest_rest_api_customerSegmentList__ASCENDING, pinterest_rest_api_customerSegmentList__DESCENDING } pinterest_rest_api_customerSegmentList_order_e;


// Create customer segments
//
// Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists.
//
customer_segment_t*
CustomerSegmentAPI_customerSegmentCreate(apiClient_t *apiClient, char *ad_account_id, customer_segment_create_t *customer_segment_create);


// List customer segments
//
// Get a list of the customer segments in the specified `ad_account_id`.
//
customer_segment_list_200_response_t*
CustomerSegmentAPI_customerSegmentList(apiClient_t *apiClient, char *ad_account_id, char *bookmark, int *page_size, pinterest_lib_pagination_order_e order, int *include_sizing, char *search_query);


// Update customer segments
//
// Update the customer segment given advertiser ID and customer segment ID
//
void
CustomerSegmentAPI_customerSegmentUpdate(apiClient_t *apiClient, char *ad_account_id, customer_segment_update_request_update_with_required_body_t *customer_segment_update_request_update_with_required_body);


