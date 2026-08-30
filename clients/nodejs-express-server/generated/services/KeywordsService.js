/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get country's keyword metrics
*   See keyword metrics for a specified country, aggregated across all of Pinterest.   (Definitions are available from the \"Get delivery metrics definitions\"   [API endpoint](/docs/api/v5/#operation/delivery_metrics/get)).
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* countryUnderscorecode String Two letter country code (ISO 3166-1 alpha-2)
* keywords List Comma-separated keywords
* returns KeywordsMetricsArrayResponse
* */
const country_keywords_metrics/get = ({ adUnderscoreaccountUnderscoreid, countryUnderscorecode, keywords }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        countryUnderscorecode,
        keywords,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Create keywords
*   Create keywords for the following entity types (advertiser, campaign, ad group, or ad). For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).    **Notes:**   - Advertisers and campaigns can only be assigned keywords with excluding (`_NEGATIVE`).   - All keyword match types are available for ad groups.    For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).    **Returns:**   - A successful call returns an object containing an array of new keyword objects and an empty `errors` object array.   - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the `errors` object array:     ```json     {       \"keywords\": [],       \"errors\": [         {           \"data\": {             \"archived\": null,             \"match_type\": \"EXACT\",             \"parent_type\": null,             \"value\": \"foobar\",             \"parent_id\": null,             \"type\": \"keyword\",             \"id\": null           },           \"error_messages\": [             \"Advertisers and Campaigns only accept excluded targeting attributes.\"           ]         }       ]     }
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* keywordsCreate KeywordsCreate 
* returns Keywords
* */
const keywords/create = ({ adUnderscoreaccountUnderscoreid, keywordsCreate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        keywordsCreate,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get keywords
*     Get a list of keywords based on the filters provided. If no filter is provided, it will default to the `ad_account_id` filter, which means it will only return keywords that specifically have `parent_id` set to the `ad_account_id`. Note: Keywords can have `ad_account_ids`, `campaign_ids`, and `ad_group_ids` set as their `parent_ids`. Keywords created through Ads Manager will have their `parent_id` set to an `ad_group_id`, not `ad_account_id`.      For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).      **Notes:**     - Advertisers and campaigns can only be assigned keywords with excluding (`_NEGATIVE`).     - All keyword match types are available for ad groups.      For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).      **Returns:**     - A successful call returns an object containing an array of new keyword objects and an empty `errors` object array.     - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the `errors` object array:       ```json       {         \"keywords\": [],         \"errors\": [           {             \"data\": {               \"archived\": null,               \"match_type\": \"EXACT\",               \"parent_type\": null,               \"value\": \"foobar\",               \"parent_id\": null,               \"type\": \"keyword\",               \"id\": null             },             \"error_messages\": [               \"Advertisers and Campaigns only accept excluded targeting attributes.\"             ]           }         ]       }
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* campaignUnderscoreid String Campaign Id to use to filter the results. (optional)
* adUnderscoregroupUnderscoreid String Ad group Id. (optional)
* adUnderscoregroupUnderscoreids List List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. (optional)
* matchUnderscoretypes List Keyword [match type](/docs/api-features/targeting-overview/) (optional)
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
* returns keywords_get_200_response
* */
const keywords/get = ({ adUnderscoreaccountUnderscoreid, campaignUnderscoreid, adUnderscoregroupUnderscoreid, adUnderscoregroupUnderscoreids, matchUnderscoretypes, bookmark, pageUnderscoresize }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        campaignUnderscoreid,
        adUnderscoregroupUnderscoreid,
        adUnderscoregroupUnderscoreids,
        matchUnderscoretypes,
        bookmark,
        pageUnderscoresize,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Update keywords
*   Update one or more keywords' bid and archived fields. Archiving   a keyword effectively deletes it - keywords no longer receive metrics and   are no longer visible within the parent entity's keywords list.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* keywordsUpdate KeywordsUpdate 
* returns Keywords
* */
const keywords/update = ({ adUnderscoreaccountUnderscoreid, keywordsUpdate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        keywordsUpdate,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* List trending keywords
* Get the top trending search keywords among the Pinterest user audience.  Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.  Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.  For an interactive way to explore this data, please visit [trends.pinterest.com](https://trends.pinterest.com).
*
* region TrendsSupportedRegion   The geographic region of interest. Only top trends within the specified region will be returned.    The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`, corresponding to the following geographic areas:   - `US` - United States   - `CA` - Canada   - `DE` - Germany   - `FR` - France   - `ES` - Spain   - `IT` - Italy   - `DE+AT+CH` - Germanic countries   - `GB+IE` - Great Britain & Ireland   - `IT+ES+PT+GR+MT` - Southern Europe   - `PL+RO+HU+SK+CZ` - Eastern Europe   - `SE+DK+FI+NO` - Nordic countries   - `NL+BE+LU` - Benelux   - `AR` - Argentina   - `BR` - Brazil   - `CO` - Colombia   - `MX` - Mexico   - `MX+AR+CO+CL` - Hispanic LatAm   - `AU+NZ` - Australasia
* trendUnderscoretype TrendType   The methodology used to rank how trendy a keyword is.   - `growing` trends have high upward growth in search volume over the last quarter   - `monthly` trends have high search volume in the last month   - `yearly` trends have high search volume in the last year   - `seasonal` trends have high upward growth in search volume over the last month and exhibit a seasonal recurring pattern (typically annual)
* interests List   The list of supported interests is:   - `animals` - Animals   - `architecture` - Architecture   - `art` - Art   - `beauty` - Beauty   - `childrens_fashion` - Children's Fashion   - `design` - Design   - `diy_and_crafts` - DIY & Crafts   - `education` - Education   - `electronics` - Electronics   - `entertainment` - Entertainment   - `event_planning` - Event Planning   - `finance` - Finance   - `food_and_drinks` - Food & Drink   - `gardening` - Gardening   - `health` - Health   - `home_decor` - Home Decor   - `mens_fashion` - Men's Fashion   - `parenting` - Parenting   - `quotes` - Quotes   - `sport` - Sports   - `travel` - Travel   - `vehicles` - Vehicles   - `wedding` - Wedding   - `womens_fashion` - Women's Fashion (optional)
* genders List If set, filters the results to trends among users who identify with the specified gender(s). If unset, trends among all genders will be returned. The `unknown` group includes users with unspecified or customized gender profile settings. (optional)
* ages List If set, filters the results to trends among users in the specified age range(s). If unset, trends among all age groups will be returned. (optional)
* includeUnderscorekeywords List If set, filters the results to top trends which include at least one of the specified keywords. If unset, no keyword filtering logic is applied. (optional)
* normalizeUnderscoreagainstUnderscoregroup Boolean  Governs how the resulting time series data will be normalized to a [0-100] scale.    By default (`false`), the data will be normalized independently for each keyword.  The peak search volume observation in *each* keyword's time series will be represented by the value 100.  This is ideal for analyzing when an individual keyword is expected to peak in interest.    If set to `true`, the data will be normalized as a group.  The peak search volume observation across *all* keywords in the response will be represented by the value 100, and all other values scaled accordingly.  Use this option when you wish to compare relative search volume between multiple keywords. (optional)
* limit Integer The maximum number of trending keywords that will be returned. Keywords are returned in trend-ranked order, so a `limit` of 50 will return the top 50 trends. (optional)
* includeUnderscoredemographics Boolean Including the age and gender distribution for each keyword. By default (`false`), the response will not include demographics data. (optional)
* returns TrendingKeywordsResponse
* */
const trending_keywords/list = ({ region, trendUnderscoretype, interests, genders, ages, includeUnderscorekeywords, normalizeUnderscoreagainstUnderscoregroup, limit, includeUnderscoredemographics }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        region,
        trendUnderscoretype,
        interests,
        genders,
        ages,
        includeUnderscorekeywords,
        normalizeUnderscoreagainstUnderscoregroup,
        limit,
        includeUnderscoredemographics,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

module.exports = {
  country_keywords_metrics/get,
  keywords/create,
  keywords/get,
  keywords/update,
  trending_keywords/list,
};
