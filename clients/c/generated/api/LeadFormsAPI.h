#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/error.h"
#include "../model/lead_form_response.h"
#include "../model/lead_form_test_request.h"
#include "../model/lead_form_test_response.h"
#include "../model/lead_forms_list_200_response.h"

// Enum ORDER for LeadFormsAPI_leadFormsList
typedef enum  { pinterest_rest_api_leadFormsList_ORDER_NULL = 0, pinterest_rest_api_leadFormsList_ORDER_ASCENDING, pinterest_rest_api_leadFormsList_ORDER_DESCENDING } pinterest_rest_api_leadFormsList_order_e;


// Get lead form by id
//
// Gets a lead form given it's ID. It must also be associated with the provided ad account ID. Retrieving an advertiser's lead form will only contain results if you're a part of the Lead ads beta. If you're interested in joining the beta, please reach out to your Pinterest account manager.
//
lead_form_response_t*
LeadFormsAPI_leadFormGet(apiClient_t *apiClient, char *ad_account_id, char *lead_form_id);


// Create lead form test data
//
// Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>
//
lead_form_test_response_t*
LeadFormsAPI_leadFormTestCreate(apiClient_t *apiClient, char *ad_account_id, char *lead_form_id, lead_form_test_request_t *lead_form_test_request);


// Get lead forms
//
// Gets all Lead Forms associated with an ad account ID. Retrieving an advertiser's list of lead forms will only contain results if you're a part of the Lead ads beta.  If you're interested in joining the beta, please reach out to your Pinterest account manager.
//
lead_forms_list_200_response_t*
LeadFormsAPI_leadFormsList(apiClient_t *apiClient, char *ad_account_id, int *page_size, pinterest_rest_api_leadFormsList_order_e order, char *bookmark);


