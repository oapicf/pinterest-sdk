#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/error.h"
#include "../model/order_line.h"
#include "../model/order_lines_list_200_response.h"

// Enum ORDER for OrderLinesAPI_orderLinesList
typedef enum  { pinterest_rest_api_orderLinesList_ORDER_NULL = 0, pinterest_rest_api_orderLinesList_ORDER_ASCENDING, pinterest_rest_api_orderLinesList_ORDER_DESCENDING } pinterest_rest_api_orderLinesList_order_e;


// Get order line
//
// Get a specific existing order line associated with an ad account.
//
order_line_t*
OrderLinesAPI_orderLinesGet(apiClient_t *apiClient, char *ad_account_id, char *order_line_id);


// Get order lines
//
// List existing order lines associated with an ad account.
//
order_lines_list_200_response_t*
OrderLinesAPI_orderLinesList(apiClient_t *apiClient, char *ad_account_id, int *page_size, pinterest_rest_api_orderLinesList_order_e order, char *bookmark);


