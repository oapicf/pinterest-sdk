#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/pinterest_lib_error.h"
#include "../model/pinterest_lib_pagination_order.h"
#include "../model/targeting_template.h"
#include "../model/targeting_template_create.h"
#include "../model/targeting_template_list_200_response.h"
#include "../model/targeting_template_update_request_read_or_update.h"

// Enum  for TargetingTemplateAPI_targetingTemplateList
typedef enum  { pinterest_rest_api_targetingTemplateList__NULL = 0, pinterest_rest_api_targetingTemplateList__ASCENDING, pinterest_rest_api_targetingTemplateList__DESCENDING } pinterest_rest_api_targetingTemplateList_order_e;


// Create targeting templates
//
// Targeting templates allow advertisers to save a set of targeting details including audience lists, keywords & interest, demographics, and placements to use more than once during the campaign creation process.  Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse performance targeting from prior campaigns for new campaigns.
//
targeting_template_t*
TargetingTemplateAPI_targetingTemplateCreate(apiClient_t *apiClient, char *ad_account_id, targeting_template_create_t *targeting_template_create);


// List targeting templates
//
// Get a list of the targeting templates in the specified `ad_account_id`
//
targeting_template_list_200_response_t*
TargetingTemplateAPI_targetingTemplateList(apiClient_t *apiClient, char *ad_account_id, char *bookmark, int *page_size, pinterest_lib_pagination_order_e order, int *include_sizing, char *search_query);


// Update targeting templates
//
// Update the targeting template given advertiser ID and targeting template ID
//
void
TargetingTemplateAPI_targetingTemplateUpdate(apiClient_t *apiClient, char *ad_account_id, targeting_template_update_request_read_or_update_t *targeting_template_update_request_read_or_update);


