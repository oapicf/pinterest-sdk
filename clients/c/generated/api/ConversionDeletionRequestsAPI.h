#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/conversion_deletion_request.h"
#include "../model/conversion_deletion_request_create.h"
#include "../model/conversion_deletion_request_list_200_response.h"
#include "../model/pinterest_lib_error.h"
#include "../model/pinterest_lib_pagination_order.h"

// Enum  for ConversionDeletionRequestsAPI_conversionDeletionRequestList
typedef enum  { pinterest_rest_api_conversionDeletionRequestList__NULL = 0, pinterest_rest_api_conversionDeletionRequestList__ASCENDING, pinterest_rest_api_conversionDeletionRequestList__DESCENDING } pinterest_rest_api_conversionDeletionRequestList_order_e;


// Create a conversion deletion request
//
// **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Create a request to delete conversion data for a list of user emails and/or EPIKs, limited to the specified `ad_account_id`. After 72 hours the request is processed and submitted to our deletion process. Then the deletion process ensures deletion within a 30 days period, once the request is submitted to the deletion process it cannot be canceled.
//
conversion_deletion_request_t*
ConversionDeletionRequestsAPI_conversionDeletionRequestCreate(apiClient_t *apiClient, char *ad_account_id, conversion_deletion_request_create_t *conversion_deletion_request_create);


// Delete a conversion deletion request
//
// **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Delete a conversion deletion request from `ad_account_id` with `request_id`. This will cancel the request and prevent it from being processed. This can only be done if the request is in the `PENDING` status and before the 72 hours mark.
//
conversion_deletion_request_t*
ConversionDeletionRequestsAPI_conversionDeletionRequestDelete(apiClient_t *apiClient, char *request_id, char *ad_account_id);


// Get a single conversion deletion request
//
// **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a single conversion deletion request from `ad_account_id` with `request_id`.
//
conversion_deletion_request_t*
ConversionDeletionRequestsAPI_conversionDeletionRequestGet(apiClient_t *apiClient, char *request_id, char *ad_account_id);


// List conversion deletion requests
//
// **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a list of the conversion deletion requests for the specified `ad_account_id`.
//
conversion_deletion_request_list_200_response_t*
ConversionDeletionRequestsAPI_conversionDeletionRequestList(apiClient_t *apiClient, char *ad_account_id, char *bookmark, int *page_size, pinterest_lib_pagination_order_e order);


