#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/conversion_event_response.h"
#include "../model/conversion_tag.h"
#include "../model/conversion_tag_create.h"
#include "../model/conversion_tags_list_200_response.h"
#include "../model/page_visit_conversion_tags_get_200_response.h"
#include "../model/pinterest_lib_error.h"
#include "../model/pinterest_lib_pagination_order.h"

// Enum  for ConversionTagsAPI_pageVisitConversionTagsGet
typedef enum  { pinterest_rest_api_pageVisitConversionTagsGet__NULL = 0, pinterest_rest_api_pageVisitConversionTagsGet__ASCENDING, pinterest_rest_api_pageVisitConversionTagsGet__DESCENDING } pinterest_rest_api_pageVisitConversionTagsGet_order_e;


// Create conversion tag
//
// Create a conversion tag, also known as [Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag), with the option to enable enhanced match.  The Pinterest Tag tracks actions people take on the ad account's website after they view the ad account's ad on Pinterest. The advertiser needs to customize this tag to track conversions.  For more information, see:  [Set up the Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag)  [Pinterest Tag](/docs/track-conversions/pinterest-tag/)  [Enhanced match](/docs/track-conversions/pinterest-tag/#enhanced-match)
//
conversion_tag_t*
ConversionTagsAPI_conversionTagsCreate(apiClient_t *apiClient, char *ad_account_id, conversion_tag_create_t *conversion_tag_create);


// Get conversion tag
//
// Get information about an existing conversion tag.
//
conversion_tag_t*
ConversionTagsAPI_conversionTagsGet(apiClient_t *apiClient, char *ad_account_id, char *conversion_tag_id);


// List conversion tags
//
// List conversion tags associated with an ad account.
//
conversion_tags_list_200_response_t*
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
ConversionTagsAPI_pageVisitConversionTagsGet(apiClient_t *apiClient, char *ad_account_id, char *bookmark, int *page_size, pinterest_lib_pagination_order_e order);


