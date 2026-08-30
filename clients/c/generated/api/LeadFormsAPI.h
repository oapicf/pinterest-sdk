#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/lead_form.h"
#include "../model/lead_form_batch_update.h"
#include "../model/lead_form_create.h"
#include "../model/lead_form_test.h"
#include "../model/lead_form_test_create.h"
#include "../model/lead_forms_create_200_response.h"
#include "../model/lead_forms_list_200_response.h"
#include "../model/pinterest_lib_error.h"
#include "../model/pinterest_lib_pagination_order.h"

// Enum  for LeadFormsAPI_leadFormsList
typedef enum  { pinterest_rest_api_leadFormsList__NULL = 0, pinterest_rest_api_leadFormsList__ASCENDING, pinterest_rest_api_leadFormsList__DESCENDING } pinterest_rest_api_leadFormsList_order_e;


// Get lead form by id
//
// **This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Gets a lead form given it's ID. It must also be associated with the provided ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
//
lead_form_t*
LeadFormsAPI_leadFormGet(apiClient_t *apiClient, char *lead_form_id, char *ad_account_id);


// Create lead form test data
//
// Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.
//
lead_form_test_t*
LeadFormsAPI_leadFormTestCreate(apiClient_t *apiClient, char *ad_account_id, char *lead_form_id, lead_form_test_create_t *lead_form_test_create);


// Create lead forms
//
// **This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form's description, questions and confirmation sections.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
//
lead_forms_create_200_response_t*
LeadFormsAPI_leadFormsCreate(apiClient_t *apiClient, char *ad_account_id, list_t *lead_form_create);


// List lead forms
//
// **This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  List lead forms associated with an ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
//
lead_forms_list_200_response_t*
LeadFormsAPI_leadFormsList(apiClient_t *apiClient, char *ad_account_id, char *bookmark, int *page_size, pinterest_lib_pagination_order_e order);


// Update lead forms
//
// **This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
//
lead_forms_create_200_response_t*
LeadFormsAPI_leadFormsUpdate(apiClient_t *apiClient, char *ad_account_id, list_t *lead_form_batch_update);


