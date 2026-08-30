#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/customer_list.h"
#include "../model/customer_list_create.h"
#include "../model/customer_list_update_with_required_body.h"
#include "../model/customer_lists_list_200_response.h"
#include "../model/pinterest_lib_error.h"
#include "../model/pinterest_lib_pagination_order.h"

// Enum  for CustomerListsAPI_customerListsList
typedef enum  { pinterest_rest_api_customerListsList__NULL = 0, pinterest_rest_api_customerListsList__ASCENDING, pinterest_rest_api_customerListsList__DESCENDING } pinterest_rest_api_customerListsList_order_e;


// Create customer lists
//
// Create a customer list from your records (hashed or plain-text email addresses, or hashed MAIDs or IDFAs).  A customer list is one of the four types of Pinterest audiences: for more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.  **Please review our [requirements](https://help.pinterest.com/en/business/article/audience-targeting#section-13341) for what type of information is allowed when uploading a customer list.**   When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.   To use your customer list after creating it, convert it into a customer list audience by passing the `CUSTOMER_LIST` audience type at the [create audience endpoint](https://developer.pinterest.com/docs/api/v5/audiences-create).
//
customer_list_t*
CustomerListsAPI_customerListsCreate(apiClient_t *apiClient, char *ad_account_id, customer_list_create_t *customer_list_create);


// Get customer list
//
// Gets a specific customer list given the customer list ID.
//
customer_list_t*
CustomerListsAPI_customerListsGet(apiClient_t *apiClient, char *ad_account_id, char *customer_list_id);


// Get customer lists
//
// Get a set of customer lists including id and name based on the filters provided.  (Customer lists are a type of audience.) For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.
//
customer_lists_list_200_response_t*
CustomerListsAPI_customerListsList(apiClient_t *apiClient, char *ad_account_id, char *bookmark, int *page_size, pinterest_lib_pagination_order_e order, int *exclude_nca);


// Update customer list
//
// Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)  When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your \"CUSTOMER_LIST\" audience. Your original list of records to add will be deleted when the matching process is complete.  For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.
//
customer_list_t*
CustomerListsAPI_customerListsUpdate(apiClient_t *apiClient, char *ad_account_id, char *customer_list_id, customer_list_update_with_required_body_t *customer_list_update_with_required_body);


