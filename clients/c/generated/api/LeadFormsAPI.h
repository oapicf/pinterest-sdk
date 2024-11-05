#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/error.h"
#include "../model/lead_form_array_response.h"
#include "../model/lead_form_create_request.h"
#include "../model/lead_form_response.h"
#include "../model/lead_form_test_request.h"
#include "../model/lead_form_test_response.h"
#include "../model/lead_form_update_request.h"
#include "../model/lead_forms_list_200_response.h"

// Enum ORDER for LeadFormsAPI_leadFormsList
typedef enum  { pinterest_rest_api_leadFormsList_ORDER_NULL = 0, pinterest_rest_api_leadFormsList_ORDER_ASCENDING, pinterest_rest_api_leadFormsList_ORDER_DESCENDING } pinterest_rest_api_leadFormsList_order_e;


// Get lead form by id
//
// <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Gets a lead form given it's ID. It must also be associated with the provided ad account ID.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
//
lead_form_response_t*
LeadFormsAPI_leadFormGet(apiClient_t *apiClient, char *ad_account_id, char *lead_form_id);


// Create lead form test data
//
// Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>
//
lead_form_test_response_t*
LeadFormsAPI_leadFormTestCreate(apiClient_t *apiClient, char *ad_account_id, char *lead_form_id, lead_form_test_request_t *lead_form_test_request);


// Create lead forms
//
// <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form’ s description, questions and confirmation sections.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
//
lead_form_array_response_t*
LeadFormsAPI_leadFormsCreate(apiClient_t *apiClient, char *ad_account_id, list_t *lead_form_create_request);


// List lead forms
//
// <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  List lead forms associated with an ad account ID.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
//
lead_forms_list_200_response_t*
LeadFormsAPI_leadFormsList(apiClient_t *apiClient, char *ad_account_id, int *page_size, pinterest_rest_api_leadFormsList_order_e order, char *bookmark);


// Update lead forms
//
// <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
//
lead_form_array_response_t*
LeadFormsAPI_leadFormsUpdate(apiClient_t *apiClient, char *ad_account_id, list_t *lead_form_update_request);


