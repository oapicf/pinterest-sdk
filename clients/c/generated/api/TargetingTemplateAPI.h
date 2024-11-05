#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/error.h"
#include "../model/targeting_template_create.h"
#include "../model/targeting_template_get_response_data.h"
#include "../model/targeting_template_list_200_response.h"
#include "../model/targeting_template_update_request.h"

// Enum ORDER for TargetingTemplateAPI_targetingTemplateList
typedef enum  { pinterest_rest_api_targetingTemplateList_ORDER_NULL = 0, pinterest_rest_api_targetingTemplateList_ORDER_ASCENDING, pinterest_rest_api_targetingTemplateList_ORDER_DESCENDING } pinterest_rest_api_targetingTemplateList_order_e;


// Create targeting templates
//
// <p>Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords & interest, demographics, and placements to use more than once during the campaign creation process.</p>  <p>Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.</p>
//
targeting_template_get_response_data_t*
TargetingTemplateAPI_targetingTemplateCreate(apiClient_t *apiClient, char *ad_account_id, targeting_template_create_t *targeting_template_create);


// List targeting templates
//
// Get a list of the targeting templates in the specified <code>ad_account_id</code>
//
targeting_template_list_200_response_t*
TargetingTemplateAPI_targetingTemplateList(apiClient_t *apiClient, char *ad_account_id, pinterest_rest_api_targetingTemplateList_order_e order, int *include_sizing, char *search_query, int *page_size, char *bookmark);


// Update targeting templates
//
// <p>Update the targeting template given advertiser ID and targeting template ID</p>
//
void
TargetingTemplateAPI_targetingTemplateUpdate(apiClient_t *apiClient, char *ad_account_id, targeting_template_update_request_t *targeting_template_update_request);


