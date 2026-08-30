#ifndef _KeywordsManager_H_
#define _KeywordsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Keywords.h"
#include "KeywordsCreate.h"
#include "KeywordsMetricsArrayResponse.h"
#include "KeywordsUpdate.h"
#include "Keywords_get_200_response.h"
#include "MatchType.h"
#include "Pinterest.Lib.Error.h"
#include "TrendType.h"
#include "TrendingKeywordsResponse.h"
#include "TrendsAgeBucket.h"
#include "TrendsGenderFilter.h"
#include "TrendsL1Interest.h"
#include "TrendsSupportedRegion.h"
#include <list>
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Keywords Keywords
 * \ingroup Operations
 *  @{
 */
class KeywordsManager {
public:
	KeywordsManager();
	virtual ~KeywordsManager();

/*! \brief Get country's keyword metrics. *Synchronous*
 *
 *   See keyword metrics for a specified country, aggregated across all of Pinterest.   (Definitions are available from the \"Get delivery metrics definitions\"   [API endpoint](/docs/api/v5/#operation/delivery_metrics/get)).
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param countryCode Two letter country code (ISO 3166-1 alpha-2) *Required*
 * \param keywords Comma-separated keywords *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool countryKeywordsMetricsGetSync(char * accessToken,
	std::string adAccountId, std::string countryCode, std::list<std::string> keywords, 
	void(* handler)(KeywordsMetricsArrayResponse, Error, void* )
	, void* userData);

/*! \brief Get country's keyword metrics. *Asynchronous*
 *
 *   See keyword metrics for a specified country, aggregated across all of Pinterest.   (Definitions are available from the \"Get delivery metrics definitions\"   [API endpoint](/docs/api/v5/#operation/delivery_metrics/get)).
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param countryCode Two letter country code (ISO 3166-1 alpha-2) *Required*
 * \param keywords Comma-separated keywords *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool countryKeywordsMetricsGetAsync(char * accessToken,
	std::string adAccountId, std::string countryCode, std::list<std::string> keywords, 
	void(* handler)(KeywordsMetricsArrayResponse, Error, void* )
	, void* userData);


/*! \brief Create keywords. *Synchronous*
 *
 *   Create keywords for the following entity types (advertiser, campaign, ad group, or ad). For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).    **Notes:**   - Advertisers and campaigns can only be assigned keywords with excluding (`_NEGATIVE`).   - All keyword match types are available for ad groups.    For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).    **Returns:**   - A successful call returns an object containing an array of new keyword objects and an empty `errors` object array.   - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the `errors` object array:     ```json     {       \"keywords\": [],       \"errors\": [         {           \"data\": {             \"archived\": null,             \"match_type\": \"EXACT\",             \"parent_type\": null,             \"value\": \"foobar\",             \"parent_id\": null,             \"type\": \"keyword\",             \"id\": null           },           \"error_messages\": [             \"Advertisers and Campaigns only accept excluded targeting attributes.\"           ]         }       ]     }
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param keywordsCreate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool keywordsCreateSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<KeywordsCreate> keywordsCreate, 
	void(* handler)(Keywords, Error, void* )
	, void* userData);

/*! \brief Create keywords. *Asynchronous*
 *
 *   Create keywords for the following entity types (advertiser, campaign, ad group, or ad). For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).    **Notes:**   - Advertisers and campaigns can only be assigned keywords with excluding (`_NEGATIVE`).   - All keyword match types are available for ad groups.    For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).    **Returns:**   - A successful call returns an object containing an array of new keyword objects and an empty `errors` object array.   - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the `errors` object array:     ```json     {       \"keywords\": [],       \"errors\": [         {           \"data\": {             \"archived\": null,             \"match_type\": \"EXACT\",             \"parent_type\": null,             \"value\": \"foobar\",             \"parent_id\": null,             \"type\": \"keyword\",             \"id\": null           },           \"error_messages\": [             \"Advertisers and Campaigns only accept excluded targeting attributes.\"           ]         }       ]     }
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param keywordsCreate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool keywordsCreateAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<KeywordsCreate> keywordsCreate, 
	void(* handler)(Keywords, Error, void* )
	, void* userData);


/*! \brief Get keywords. *Synchronous*
 *
 *     Get a list of keywords based on the filters provided. If no filter is provided, it will default to the `ad_account_id` filter, which means it will only return keywords that specifically have `parent_id` set to the `ad_account_id`. Note: Keywords can have `ad_account_ids`, `campaign_ids`, and `ad_group_ids` set as their `parent_ids`. Keywords created through Ads Manager will have their `parent_id` set to an `ad_group_id`, not `ad_account_id`.      For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).      **Notes:**     - Advertisers and campaigns can only be assigned keywords with excluding (`_NEGATIVE`).     - All keyword match types are available for ad groups.      For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).      **Returns:**     - A successful call returns an object containing an array of new keyword objects and an empty `errors` object array.     - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the `errors` object array:       ```json       {         \"keywords\": [],         \"errors\": [           {             \"data\": {               \"archived\": null,               \"match_type\": \"EXACT\",               \"parent_type\": null,               \"value\": \"foobar\",               \"parent_id\": null,               \"type\": \"keyword\",               \"id\": null             },             \"error_messages\": [               \"Advertisers and Campaigns only accept excluded targeting attributes.\"             ]           }         ]       }
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param campaignId Campaign Id to use to filter the results.
 * \param adGroupId Ad group Id.
 * \param adGroupIds List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.
 * \param matchTypes Keyword [match type](/docs/api-features/targeting-overview/)
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool keywordsGetSync(char * accessToken,
	std::string adAccountId, std::string campaignId, std::string adGroupId, std::list<std::string> adGroupIds, std::list<MatchType> matchTypes, std::string bookmark, int pageSize, 
	void(* handler)(Keywords_get_200_response, Error, void* )
	, void* userData);

/*! \brief Get keywords. *Asynchronous*
 *
 *     Get a list of keywords based on the filters provided. If no filter is provided, it will default to the `ad_account_id` filter, which means it will only return keywords that specifically have `parent_id` set to the `ad_account_id`. Note: Keywords can have `ad_account_ids`, `campaign_ids`, and `ad_group_ids` set as their `parent_ids`. Keywords created through Ads Manager will have their `parent_id` set to an `ad_group_id`, not `ad_account_id`.      For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).      **Notes:**     - Advertisers and campaigns can only be assigned keywords with excluding (`_NEGATIVE`).     - All keyword match types are available for ad groups.      For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).      **Returns:**     - A successful call returns an object containing an array of new keyword objects and an empty `errors` object array.     - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the `errors` object array:       ```json       {         \"keywords\": [],         \"errors\": [           {             \"data\": {               \"archived\": null,               \"match_type\": \"EXACT\",               \"parent_type\": null,               \"value\": \"foobar\",               \"parent_id\": null,               \"type\": \"keyword\",               \"id\": null             },             \"error_messages\": [               \"Advertisers and Campaigns only accept excluded targeting attributes.\"             ]           }         ]       }
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param campaignId Campaign Id to use to filter the results.
 * \param adGroupId Ad group Id.
 * \param adGroupIds List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.
 * \param matchTypes Keyword [match type](/docs/api-features/targeting-overview/)
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool keywordsGetAsync(char * accessToken,
	std::string adAccountId, std::string campaignId, std::string adGroupId, std::list<std::string> adGroupIds, std::list<MatchType> matchTypes, std::string bookmark, int pageSize, 
	void(* handler)(Keywords_get_200_response, Error, void* )
	, void* userData);


/*! \brief Update keywords. *Synchronous*
 *
 *   Update one or more keywords' bid and archived fields. Archiving   a keyword effectively deletes it - keywords no longer receive metrics and   are no longer visible within the parent entity's keywords list.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param keywordsUpdate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool keywordsUpdateSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<KeywordsUpdate> keywordsUpdate, 
	void(* handler)(Keywords, Error, void* )
	, void* userData);

/*! \brief Update keywords. *Asynchronous*
 *
 *   Update one or more keywords' bid and archived fields. Archiving   a keyword effectively deletes it - keywords no longer receive metrics and   are no longer visible within the parent entity's keywords list.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param keywordsUpdate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool keywordsUpdateAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<KeywordsUpdate> keywordsUpdate, 
	void(* handler)(Keywords, Error, void* )
	, void* userData);


/*! \brief List trending keywords. *Synchronous*
 *
 * Get the top trending search keywords among the Pinterest user audience.  Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.  Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.  For an interactive way to explore this data, please visit [trends.pinterest.com](https://trends.pinterest.com).
 * \param region   The geographic region of interest. Only top trends within the specified region will be returned.    The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`, corresponding to the following geographic areas:   - `US` - United States   - `CA` - Canada   - `DE` - Germany   - `FR` - France   - `ES` - Spain   - `IT` - Italy   - `DE+AT+CH` - Germanic countries   - `GB+IE` - Great Britain & Ireland   - `IT+ES+PT+GR+MT` - Southern Europe   - `PL+RO+HU+SK+CZ` - Eastern Europe   - `SE+DK+FI+NO` - Nordic countries   - `NL+BE+LU` - Benelux   - `AR` - Argentina   - `BR` - Brazil   - `CO` - Colombia   - `MX` - Mexico   - `MX+AR+CO+CL` - Hispanic LatAm   - `AU+NZ` - Australasia *Required*
 * \param trendType   The methodology used to rank how trendy a keyword is.   - `growing` trends have high upward growth in search volume over the last quarter   - `monthly` trends have high search volume in the last month   - `yearly` trends have high search volume in the last year   - `seasonal` trends have high upward growth in search volume over the last month and exhibit a seasonal recurring pattern (typically annual) *Required*
 * \param interests   The list of supported interests is:   - `animals` - Animals   - `architecture` - Architecture   - `art` - Art   - `beauty` - Beauty   - `childrens_fashion` - Children's Fashion   - `design` - Design   - `diy_and_crafts` - DIY & Crafts   - `education` - Education   - `electronics` - Electronics   - `entertainment` - Entertainment   - `event_planning` - Event Planning   - `finance` - Finance   - `food_and_drinks` - Food & Drink   - `gardening` - Gardening   - `health` - Health   - `home_decor` - Home Decor   - `mens_fashion` - Men's Fashion   - `parenting` - Parenting   - `quotes` - Quotes   - `sport` - Sports   - `travel` - Travel   - `vehicles` - Vehicles   - `wedding` - Wedding   - `womens_fashion` - Women's Fashion
 * \param genders If set, filters the results to trends among users who identify with the specified gender(s). If unset, trends among all genders will be returned. The `unknown` group includes users with unspecified or customized gender profile settings.
 * \param ages If set, filters the results to trends among users in the specified age range(s). If unset, trends among all age groups will be returned.
 * \param includeKeywords If set, filters the results to top trends which include at least one of the specified keywords. If unset, no keyword filtering logic is applied.
 * \param normalizeAgainstGroup  Governs how the resulting time series data will be normalized to a [0-100] scale.    By default (`false`), the data will be normalized independently for each keyword.  The peak search volume observation in *each* keyword's time series will be represented by the value 100.  This is ideal for analyzing when an individual keyword is expected to peak in interest.    If set to `true`, the data will be normalized as a group.  The peak search volume observation across *all* keywords in the response will be represented by the value 100, and all other values scaled accordingly.  Use this option when you wish to compare relative search volume between multiple keywords.
 * \param limit The maximum number of trending keywords that will be returned. Keywords are returned in trend-ranked order, so a `limit` of 50 will return the top 50 trends.
 * \param includeDemographics Including the age and gender distribution for each keyword. By default (`false`), the response will not include demographics data.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool trendingKeywordsListSync(char * accessToken,
	TrendsSupportedRegion region, TrendType trendType, std::list<TrendsL1Interest> interests, std::list<TrendsGenderFilter> genders, std::list<TrendsAgeBucket> ages, std::list<std::string> includeKeywords, bool normalizeAgainstGroup, int limit, bool includeDemographics, 
	void(* handler)(TrendingKeywordsResponse, Error, void* )
	, void* userData);

/*! \brief List trending keywords. *Asynchronous*
 *
 * Get the top trending search keywords among the Pinterest user audience.  Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.  Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.  For an interactive way to explore this data, please visit [trends.pinterest.com](https://trends.pinterest.com).
 * \param region   The geographic region of interest. Only top trends within the specified region will be returned.    The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`, corresponding to the following geographic areas:   - `US` - United States   - `CA` - Canada   - `DE` - Germany   - `FR` - France   - `ES` - Spain   - `IT` - Italy   - `DE+AT+CH` - Germanic countries   - `GB+IE` - Great Britain & Ireland   - `IT+ES+PT+GR+MT` - Southern Europe   - `PL+RO+HU+SK+CZ` - Eastern Europe   - `SE+DK+FI+NO` - Nordic countries   - `NL+BE+LU` - Benelux   - `AR` - Argentina   - `BR` - Brazil   - `CO` - Colombia   - `MX` - Mexico   - `MX+AR+CO+CL` - Hispanic LatAm   - `AU+NZ` - Australasia *Required*
 * \param trendType   The methodology used to rank how trendy a keyword is.   - `growing` trends have high upward growth in search volume over the last quarter   - `monthly` trends have high search volume in the last month   - `yearly` trends have high search volume in the last year   - `seasonal` trends have high upward growth in search volume over the last month and exhibit a seasonal recurring pattern (typically annual) *Required*
 * \param interests   The list of supported interests is:   - `animals` - Animals   - `architecture` - Architecture   - `art` - Art   - `beauty` - Beauty   - `childrens_fashion` - Children's Fashion   - `design` - Design   - `diy_and_crafts` - DIY & Crafts   - `education` - Education   - `electronics` - Electronics   - `entertainment` - Entertainment   - `event_planning` - Event Planning   - `finance` - Finance   - `food_and_drinks` - Food & Drink   - `gardening` - Gardening   - `health` - Health   - `home_decor` - Home Decor   - `mens_fashion` - Men's Fashion   - `parenting` - Parenting   - `quotes` - Quotes   - `sport` - Sports   - `travel` - Travel   - `vehicles` - Vehicles   - `wedding` - Wedding   - `womens_fashion` - Women's Fashion
 * \param genders If set, filters the results to trends among users who identify with the specified gender(s). If unset, trends among all genders will be returned. The `unknown` group includes users with unspecified or customized gender profile settings.
 * \param ages If set, filters the results to trends among users in the specified age range(s). If unset, trends among all age groups will be returned.
 * \param includeKeywords If set, filters the results to top trends which include at least one of the specified keywords. If unset, no keyword filtering logic is applied.
 * \param normalizeAgainstGroup  Governs how the resulting time series data will be normalized to a [0-100] scale.    By default (`false`), the data will be normalized independently for each keyword.  The peak search volume observation in *each* keyword's time series will be represented by the value 100.  This is ideal for analyzing when an individual keyword is expected to peak in interest.    If set to `true`, the data will be normalized as a group.  The peak search volume observation across *all* keywords in the response will be represented by the value 100, and all other values scaled accordingly.  Use this option when you wish to compare relative search volume between multiple keywords.
 * \param limit The maximum number of trending keywords that will be returned. Keywords are returned in trend-ranked order, so a `limit` of 50 will return the top 50 trends.
 * \param includeDemographics Including the age and gender distribution for each keyword. By default (`false`), the response will not include demographics data.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool trendingKeywordsListAsync(char * accessToken,
	TrendsSupportedRegion region, TrendType trendType, std::list<TrendsL1Interest> interests, std::list<TrendsGenderFilter> genders, std::list<TrendsAgeBucket> ages, std::list<std::string> includeKeywords, bool normalizeAgainstGroup, int limit, bool includeDemographics, 
	void(* handler)(TrendingKeywordsResponse, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* KeywordsManager_H_ */
