#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/customer_list.h"
#include "../model/customer_list_request.h"
#include "../model/customer_list_update_request.h"
#include "../model/customer_lists_list_200_response.h"
#include "../model/error.h"

// Enum ORDER for CustomerListsAPI_customerListsList
typedef enum  { pinterest_rest_api_customerListsList_ORDER_NULL = 0, pinterest_rest_api_customerListsList_ORDER_ASCENDING, pinterest_rest_api_customerListsList_ORDER_DESCENDING } pinterest_rest_api_customerListsList_order_e;


// Create customer lists
//
// <p>Create a customer list from your records(hashed or plain-text email addresses, or hashed MAIDs or IDFAs).</p> <p>A customer list is one of the four types of Pinterest audiences: for more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a> section of the ads management guide.<p/> <p><b>Please review our <u><a href=\"https://help.pinterest.com/en/business/article/audience-targeting#section-13341\" target=\"_blank\">requirements</a></u> for what type of information is allowed when uploading a customer list.</b></p> <p>When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.</p> <p>Note that once you have created your customer list, you must convert it into an audience (of the “CUSTOMER_LIST” type) using the <a href=\"#operation/create_audience_handler\">create audience endpoint</a> before it can be used.</p>
//
customer_list_t*
CustomerListsAPI_customerListsCreate(apiClient_t *apiClient, char *ad_account_id, customer_list_request_t *customer_list_request);


// Get customer list
//
// Gets a specific customer list given the customer list ID.
//
customer_list_t*
CustomerListsAPI_customerListsGet(apiClient_t *apiClient, char *ad_account_id, char *customer_list_id);


// Get customer lists
//
// <p>Get a set of customer lists including id and name based on the filters provided.</p> <p>(Customer lists are a type of audience.) For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>  or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>
//
customer_lists_list_200_response_t*
CustomerListsAPI_customerListsList(apiClient_t *apiClient, char *ad_account_id, int *page_size, pinterest_rest_api_customerListsList_order_e order, char *bookmark);


// Update customer list
//
// <p>Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)</p> <p>When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your “CUSTOMER_LIST” audience. Your original list of records to add will be deleted when the matching process is complete.</p> <p>For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>
//
customer_list_t*
CustomerListsAPI_customerListsUpdate(apiClient_t *apiClient, char *ad_account_id, char *customer_list_id, customer_list_update_request_t *customer_list_update_request);


