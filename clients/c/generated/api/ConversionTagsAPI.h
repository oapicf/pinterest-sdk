#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/conversion_event_response.h"
#include "../model/conversion_tag_create.h"
#include "../model/conversion_tag_list_response.h"
#include "../model/conversion_tag_response.h"
#include "../model/error.h"
#include "../model/page_visit_conversion_tags_get_200_response.h"

// Enum ORDER for ConversionTagsAPI_pageVisitConversionTagsGet
typedef enum  { pinterest_rest_api_pageVisitConversionTagsGet_ORDER_NULL = 0, pinterest_rest_api_pageVisitConversionTagsGet_ORDER_ASCENDING, pinterest_rest_api_pageVisitConversionTagsGet_ORDER_DESCENDING } pinterest_rest_api_pageVisitConversionTagsGet_order_e;


// Create conversion tag
//
// Create a conversion tag, also known as <a href=\"https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\" target=\"_blank\">Pinterest tag</a>, with the option to enable enhanced match.<p/> The Pinterest Tag tracks actions people take on the ad account’ s website after they view the ad account's ad on Pinterest. The advertiser needs to customize this tag to track conversions.<p/> For more information, see:<p/> <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\">Set up the Pinterest tag</a><p/> <a class=\"reference external\" href=\"/docs/api-features/pinterest-tag/\">Pinterest Tag</a><p/> <a class=\"reference external\" href=\"/docs/api-features/pinterest-tag/#enhanced-match\">Enhanced match</a>
//
conversion_tag_response_t*
ConversionTagsAPI_conversionTagsCreate(apiClient_t *apiClient, char *ad_account_id, conversion_tag_create_t *conversion_tag_create);


// Get conversion tag
//
// Get information about an existing conversion tag.
//
conversion_tag_response_t*
ConversionTagsAPI_conversionTagsGet(apiClient_t *apiClient, char *ad_account_id, char *conversion_tag_id);


// Get conversion tags
//
// List conversion tags associated with an ad account.
//
conversion_tag_list_response_t*
ConversionTagsAPI_conversionTagsList(apiClient_t *apiClient, char *ad_account_id, int *filter_deleted);


// Get Ocpm eligible conversion tags
//
// Get Ocpm eligible conversion tag events for an ad account.
//
list_t*
ConversionTagsAPI_ocpmEligibleConversionTagsGet(apiClient_t *apiClient, char *ad_account_id);


// Get page visit conversion tags
//
// Get all page visit conversion tag events for an ad account.
//
page_visit_conversion_tags_get_200_response_t*
ConversionTagsAPI_pageVisitConversionTagsGet(apiClient_t *apiClient, char *ad_account_id, int *page_size, pinterest_rest_api_pageVisitConversionTagsGet_order_e order, char *bookmark);


