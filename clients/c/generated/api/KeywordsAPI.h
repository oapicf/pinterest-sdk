#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/keywords.h"
#include "../model/keywords_create.h"
#include "../model/keywords_get_200_response.h"
#include "../model/keywords_metrics_array_response.h"
#include "../model/keywords_update.h"
#include "../model/match_type.h"
#include "../model/pinterest_lib_error.h"
#include "../model/trend_type.h"
#include "../model/trending_keywords_response.h"
#include "../model/trends_age_bucket.h"
#include "../model/trends_gender_filter.h"
#include "../model/trends_l1_interest.h"
#include "../model/trends_supported_region.h"

// Enum MATCHTYPES for KeywordsAPI_keywordsGet
typedef enum  { pinterest_rest_api_keywordsGet_MATCHTYPES_NULL = 0, pinterest_rest_api_keywordsGet_MATCHTYPES_BROAD, pinterest_rest_api_keywordsGet_MATCHTYPES_PHRASE, pinterest_rest_api_keywordsGet_MATCHTYPES_EXACT, pinterest_rest_api_keywordsGet_MATCHTYPES_EXACT_NEGATIVE, pinterest_rest_api_keywordsGet_MATCHTYPES_PHRASE_NEGATIVE } pinterest_rest_api_keywordsGet_match_types_e;

// Enum  for KeywordsAPI_trendingKeywordsList
typedef enum  { pinterest_rest_api_trendingKeywordsList__NULL = 0, pinterest_rest_api_trendingKeywordsList__US, pinterest_rest_api_trendingKeywordsList__CA, pinterest_rest_api_trendingKeywordsList__DE, pinterest_rest_api_trendingKeywordsList__FR, pinterest_rest_api_trendingKeywordsList__ES, pinterest_rest_api_trendingKeywordsList__IT, pinterest_rest_api_trendingKeywordsList__DE+AT+CH, pinterest_rest_api_trendingKeywordsList__GB+IE, pinterest_rest_api_trendingKeywordsList__IT+ES+PT+GR+MT, pinterest_rest_api_trendingKeywordsList__PL+RO+HU+SK+CZ, pinterest_rest_api_trendingKeywordsList__SE+DK+FI+NO, pinterest_rest_api_trendingKeywordsList__NL+BE+LU, pinterest_rest_api_trendingKeywordsList__AR, pinterest_rest_api_trendingKeywordsList__BR, pinterest_rest_api_trendingKeywordsList__CO, pinterest_rest_api_trendingKeywordsList__MX, pinterest_rest_api_trendingKeywordsList__MX+AR+CO+CL, pinterest_rest_api_trendingKeywordsList__AU+NZ } pinterest_rest_api_trendingKeywordsList_region_e;

// Enum  for KeywordsAPI_trendingKeywordsList
typedef enum  { pinterest_rest_api_trendingKeywordsList__NULL = 0, pinterest_rest_api_trendingKeywordsList__growing, pinterest_rest_api_trendingKeywordsList__monthly, pinterest_rest_api_trendingKeywordsList__yearly, pinterest_rest_api_trendingKeywordsList__seasonal } pinterest_rest_api_trendingKeywordsList_trend_type_e;

// Enum INTERESTS for KeywordsAPI_trendingKeywordsList
typedef enum  { pinterest_rest_api_trendingKeywordsList_INTERESTS_NULL = 0, pinterest_rest_api_trendingKeywordsList_INTERESTS_animals, pinterest_rest_api_trendingKeywordsList_INTERESTS_architecture, pinterest_rest_api_trendingKeywordsList_INTERESTS_art, pinterest_rest_api_trendingKeywordsList_INTERESTS_beauty, pinterest_rest_api_trendingKeywordsList_INTERESTS_childrens_fashion, pinterest_rest_api_trendingKeywordsList_INTERESTS_design, pinterest_rest_api_trendingKeywordsList_INTERESTS_diy_and_crafts, pinterest_rest_api_trendingKeywordsList_INTERESTS_education, pinterest_rest_api_trendingKeywordsList_INTERESTS_electronics, pinterest_rest_api_trendingKeywordsList_INTERESTS_entertainment, pinterest_rest_api_trendingKeywordsList_INTERESTS_event_planning, pinterest_rest_api_trendingKeywordsList_INTERESTS_finance, pinterest_rest_api_trendingKeywordsList_INTERESTS_food_and_drinks, pinterest_rest_api_trendingKeywordsList_INTERESTS_gardening, pinterest_rest_api_trendingKeywordsList_INTERESTS_health, pinterest_rest_api_trendingKeywordsList_INTERESTS_home_decor, pinterest_rest_api_trendingKeywordsList_INTERESTS_mens_fashion, pinterest_rest_api_trendingKeywordsList_INTERESTS_parenting, pinterest_rest_api_trendingKeywordsList_INTERESTS_quotes, pinterest_rest_api_trendingKeywordsList_INTERESTS_sport, pinterest_rest_api_trendingKeywordsList_INTERESTS_travel, pinterest_rest_api_trendingKeywordsList_INTERESTS_vehicles, pinterest_rest_api_trendingKeywordsList_INTERESTS_wedding, pinterest_rest_api_trendingKeywordsList_INTERESTS_womens_fashion } pinterest_rest_api_trendingKeywordsList_interests_e;

// Enum GENDERS for KeywordsAPI_trendingKeywordsList
typedef enum  { pinterest_rest_api_trendingKeywordsList_GENDERS_NULL = 0, pinterest_rest_api_trendingKeywordsList_GENDERS_male, pinterest_rest_api_trendingKeywordsList_GENDERS_female, pinterest_rest_api_trendingKeywordsList_GENDERS_unknown } pinterest_rest_api_trendingKeywordsList_genders_e;

// Enum AGES for KeywordsAPI_trendingKeywordsList
typedef enum  { pinterest_rest_api_trendingKeywordsList_AGES_NULL = 0, pinterest_rest_api_trendingKeywordsList_AGES__18_24, pinterest_rest_api_trendingKeywordsList_AGES__25_34, pinterest_rest_api_trendingKeywordsList_AGES__35_44, pinterest_rest_api_trendingKeywordsList_AGES__45_49, pinterest_rest_api_trendingKeywordsList_AGES__50_54, pinterest_rest_api_trendingKeywordsList_AGES__55_64, pinterest_rest_api_trendingKeywordsList_AGES__65+ } pinterest_rest_api_trendingKeywordsList_ages_e;


// Get country's keyword metrics
//
//   See keyword metrics for a specified country, aggregated across all of Pinterest.   (Definitions are available from the \"Get delivery metrics definitions\"   [API endpoint](/docs/api/v5/#operation/delivery_metrics/get)).
//
keywords_metrics_array_response_t*
KeywordsAPI_countryKeywordsMetricsGet(apiClient_t *apiClient, char *ad_account_id, char *country_code, list_t *keywords);


// Create keywords
//
//   Create keywords for the following entity types (advertiser, campaign, ad group, or ad). For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).    **Notes:**   - Advertisers and campaigns can only be assigned keywords with excluding (`_NEGATIVE`).   - All keyword match types are available for ad groups.    For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).    **Returns:**   - A successful call returns an object containing an array of new keyword objects and an empty `errors` object array.   - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the `errors` object array:     ```json     {       \"keywords\": [],       \"errors\": [         {           \"data\": {             \"archived\": null,             \"match_type\": \"EXACT\",             \"parent_type\": null,             \"value\": \"foobar\",             \"parent_id\": null,             \"type\": \"keyword\",             \"id\": null           },           \"error_messages\": [             \"Advertisers and Campaigns only accept excluded targeting attributes.\"           ]         }       ]     }
//
keywords_t*
KeywordsAPI_keywordsCreate(apiClient_t *apiClient, char *ad_account_id, keywords_create_t *keywords_create);


// Get keywords
//
//     Get a list of keywords based on the filters provided. If no filter is provided, it will default to the `ad_account_id` filter, which means it will only return keywords that specifically have `parent_id` set to the `ad_account_id`. Note: Keywords can have `ad_account_ids`, `campaign_ids`, and `ad_group_ids` set as their `parent_ids`. Keywords created through Ads Manager will have their `parent_id` set to an `ad_group_id`, not `ad_account_id`.      For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).      **Notes:**     - Advertisers and campaigns can only be assigned keywords with excluding (`_NEGATIVE`).     - All keyword match types are available for ad groups.      For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).      **Returns:**     - A successful call returns an object containing an array of new keyword objects and an empty `errors` object array.     - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the `errors` object array:       ```json       {         \"keywords\": [],         \"errors\": [           {             \"data\": {               \"archived\": null,               \"match_type\": \"EXACT\",               \"parent_type\": null,               \"value\": \"foobar\",               \"parent_id\": null,               \"type\": \"keyword\",               \"id\": null             },             \"error_messages\": [               \"Advertisers and Campaigns only accept excluded targeting attributes.\"             ]           }         ]       }
//
keywords_get_200_response_t*
KeywordsAPI_keywordsGet(apiClient_t *apiClient, char *ad_account_id, char *campaign_id, char *ad_group_id, list_t *ad_group_ids, list_t *match_types, char *bookmark, int *page_size);


// Update keywords
//
//   Update one or more keywords' bid and archived fields. Archiving   a keyword effectively deletes it - keywords no longer receive metrics and   are no longer visible within the parent entity's keywords list.
//
keywords_t*
KeywordsAPI_keywordsUpdate(apiClient_t *apiClient, char *ad_account_id, keywords_update_t *keywords_update);


// List trending keywords
//
// Get the top trending search keywords among the Pinterest user audience.  Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.  Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.  For an interactive way to explore this data, please visit [trends.pinterest.com](https://trends.pinterest.com).
//
trending_keywords_response_t*
KeywordsAPI_trendingKeywordsList(apiClient_t *apiClient, trends_supported_region_e region, trend_type_e trend_type, list_t *interests, list_t *genders, list_t *ages, list_t *include_keywords, int *normalize_against_group, int *limit, int *include_demographics);


